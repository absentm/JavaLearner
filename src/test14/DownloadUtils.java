package test14;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * DownloadUtils
 * Created by dm on 16-8-27.
 */
public class DownloadUtils {
    private String path;    // download source path
    private String targetFile;     // save position
    private int threadNum;  // numbers of download thread
    private DownloadThread[] mThreads;  // the object of download threads
    private int fileSize;   // the total size of download file

    public DownloadUtils(String path, String targetFile, int threadNum) {
        this.path = path;
        this.targetFile = targetFile;
        mThreads = new DownloadThread[threadNum];
    }

    /**
     * file download
     *
     * @throws Exception
     */
    public void download(int threadNum) throws Exception {
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(5 * 1000);
        conn.setRequestMethod("GET");
        conn.setRequestProperty(
                "Accept",
                "image/gif, image/jpeg, image/pjpeg, image/pjpeg, "
                        + "application/x-shockwave-flash, application/xaml+xml, "
                        + "application/vnd.ms-xpsdocument, application/x-ms-xbap, "
                        + "application/x-ms-application, application/vnd.ms-excel, "
                        + "application/vnd.ms-powerpoint, application/msword, */*");
        conn.setRequestProperty("Accept-Language", "zh-CN");
        conn.setRequestProperty("Charset", "UTF-8");
        conn.setRequestProperty("Connection", "Keep-Alive");

        // get the file size
        fileSize = conn.getContentLength();
        System.out.println("fileSize = " + fileSize);
        System.out.println("threadNum = " + threadNum);
        conn.disconnect();
        int currentPartSize = fileSize / threadNum + 1;
        RandomAccessFile randomAccessFile = new RandomAccessFile(targetFile, "rw");
        randomAccessFile.setLength(fileSize);   // set local file size
        randomAccessFile.close();

        for (int i = 0; i < threadNum; i++) {
            int startPos = i * currentPartSize; // compute each thread download position

            // each thread use one RandomAccessFile to download
            RandomAccessFile currentPart = new RandomAccessFile(targetFile, "rw");
            currentPart.seek(startPos); // seek current thread download position

            // create download threads
            mThreads[i] = new DownloadThread(startPos, currentPartSize, currentPart);
            mThreads[i].start();    // launch download thread
        }
    }

    /**
     * get download complete rate
     *
     * @return rate
     */
    public double getCompleteRate() {
        int sumSize = 0;

        for (int i = 0; i < threadNum; i++) {
            sumSize += mThreads[i].length;
        }

        return sumSize * 1.0 / fileSize;
    }

    private class DownloadThread extends Thread {
        private int startPos;   // download position of current thread
        private int currentPartSize;    // current thread download file size
        private RandomAccessFile currentPart;   // file part

        public int length;  // have download length

        public DownloadThread(int startPos, int currentPartSize, RandomAccessFile currentPart) {
            this.startPos = startPos;
            this.currentPartSize = currentPartSize;
            this.currentPart = currentPart;
        }

        public void run() {
            try {
                URL url = new URL(path);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(5 * 1000);
                conn.setRequestMethod("GET");
                conn.setRequestProperty(
                        "Accept",
                        "image/gif, image/jpeg, image/pjpeg, image/pjpeg, "
                                + "application/x-shockwave-flash, application/xaml+xml, "
                                + "application/vnd.ms-xpsdocument, application/x-ms-xbap, "
                                + "application/x-ms-application, application/vnd.ms-excel, "
                                + "application/vnd.ms-powerpoint, application/msword, */*");
                conn.setRequestProperty("Accept-Language", "zh-CN");
                conn.setRequestProperty("Charset", "UTF-8");

                InputStream inputStream = conn.getInputStream();
                inputStream.skip(this.startPos);
                byte[] buffer = new byte[1024];
                int hasRead = 0;

                while ((length < currentPartSize) && ((hasRead = inputStream.read(buffer)) != -1)) {
                    currentPart.write(buffer, 0, hasRead);
                    length += hasRead;  // increase the total size of current thread
                }

                currentPart.close();
                inputStream.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * test download method
     *
     * @throws Exception
     */
    public static void downloadTest() throws Exception {
        final DownloadUtils downloadUtils = new DownloadUtils("http://img.blog.csdn.net/20151212173343548",
                "test.jpg", 4);
        downloadUtils.download(4);

        new Thread(() -> {
            while (downloadUtils.getCompleteRate() < 1) {
                System.out.println("has completed: " + downloadUtils.getCompleteRate());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
