package test08;

/**
 * closure and callback test
 * Created by dm on 16-8-22.
 */
public class TeaProgrammer extends Programmer {
    public TeaProgrammer() {
    }

    public TeaProgrammer(String name) {
        super(name);
    }

    //
    private void teach() {
        System.out.println(getName() + " are teaching!");
    }

    private class Closure implements Teachable {

        /**
         * non-static inner class implement work mothed, and call outter class
         */
        @Override
        public void work() {
            teach();
        }
    }

    /**
     * @return a reference of non-static inner class to callback outter class's mothed
     */
    public Teachable getCallbackReference() {
        return new Closure();
    }

    public static void test() {
        TeaProgrammer teaProgrammer = new TeaProgrammer("XiaoMing");

        // get the mothed of the super calss: Programmer
        teaProgrammer.work();

        // get callback mothed
        teaProgrammer.getCallbackReference().work();
    }

}
