package test09;

import java.util.*;

/**
 * Collection Test
 * Created by dm on 16-8-23.
 */
public class CollectionTest {
    /**
     * test Collection mothed
     */
    public static void test() {
        Collection mCollection = new ArrayList();

        // add()
        mCollection.add("zhangsan");
        mCollection.add(6);
        mCollection.add(55.6);

        // szie()
        System.out.println("mCollection.size: " + mCollection.size());

        // remove()
        mCollection.remove(6);
        System.out.println("After remove mCollection.size: " + mCollection.size());

        // contains()
        System.out.println("mCollection.contains(\"zhangsan\")? : " +
                mCollection.contains("zhangsan"));

        mCollection.add("hehhe");
        System.out.println("mCollection string: " + mCollection);

        Collection books = new HashSet();
        books.add("Java");
        books.add("Cpp");
        books.add("C#");

        // addAll()
        mCollection.addAll(books);
        System.out.println("mCollection string: " + mCollection);

        // containsAll()
        System.out.println("mCollection.containsAll(books) ?: " +
                mCollection.containsAll(books));

        // removeAll()
        mCollection.removeAll(books);

        // retainAll()
        mCollection.retainAll(books);
        System.out.println("mCollection.retainAll(books) ?: " +
                mCollection.retainAll(books));

        System.out.println("mCollection string: " + mCollection);

        // clear()
        mCollection.clear();
        System.out.println("After clear size: " + mCollection.size());
        System.out.println("mCollection string: " + mCollection);
    }

    /**
     * Iterator Test
     */
    public static void iteratorTest() {
        Collection books = new HashSet();
        books.add("Java");
        books.add("Cpp");
        books.add("C#");

        Iterator iterator = books.iterator();
        while (iterator.hasNext()) {
            // iterator.next() return Object type, so need to change type
            String bookStr = (String) iterator.next();
            System.out.println(bookStr);

            if (bookStr.equals("Cpp")) {
                iterator.remove();
            }

            // could not change the elements when using iterator
            bookStr = ".Net";
        }

        System.out.println("books: " + books);

        // use foreach
        for (Object obj : books) {
            System.out.println("obj: " + obj);
        }

    }
}
