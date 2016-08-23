package test9;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet Test
 * Created by dm on 16-8-23.
 */
public class TreeSetTest {
    /**
     * basic mothed test
     */
    public static void test() {
        TreeSet mTreeSet = new TreeSet();
        mTreeSet.add(5);
        mTreeSet.add(10);
        mTreeSet.add(2);
        mTreeSet.add(56);
        mTreeSet.add(-12);
        mTreeSet.add(7);

        System.out.println("mTreeSet: " + mTreeSet);
        // first()
        System.out.println("mTreeSet.first(): " + mTreeSet.first());

        // last()
        System.out.println("mTreeSet.last(): " + mTreeSet.last());

        // lower() lower 11's max element
        System.out.println("mTreeSet.lower(11): " + mTreeSet.lower(11));

        // higher() higher 12's min element
        System.out.println("mTreeSet.higher(12): " + mTreeSet.higher(2));

        // subset: get the subSet between [2, 56), sort by order
        System.out.println("" + mTreeSet.subSet(2, 56));

        // headSet: get the subSet < 21
        System.out.println("" + mTreeSet.headSet(21));

        // tailSet: get the subSet >= 10
        System.out.println("" + mTreeSet.tailSet(10));
    }

    /**
     * test TreeSet add object mothed
     */
    public static void treeSetAddObjTest() {
        TreeSet mTreeSet = new TreeSet();
        mTreeSet.add(new TreeSetObj(5));
        mTreeSet.add(new TreeSetObj(-3));
        mTreeSet.add(new TreeSetObj(0));
        mTreeSet.add(new TreeSetObj(10));
        mTreeSet.add(new TreeSetObj(-12));

        System.out.println("mTreeSet: " + mTreeSet);

        TreeSetObj treeSetObjFirst = (TreeSetObj) mTreeSet.first();
        treeSetObjFirst.count = 20;

        TreeSetObj treeSetObjLast = (TreeSetObj) mTreeSet.last();
        treeSetObjLast.count = 123;

        System.out.println("After change first and last, mTreeSet: " + mTreeSet);

        // successed
        mTreeSet.remove(new TreeSetObj(5));
        System.out.println("After remove unchanged element, mTreeSet: " + mTreeSet);

        // failed
        mTreeSet.remove(new TreeSetObj(10));
        System.out.println("After remove changed element, mTreeSet: " + mTreeSet);
    }

    /**
     * define sort way
     */
    public static void defineSortedTest() {
        // TreeSetObj class needn't implement Comparable, just implement Comparator
        TreeSet mTreeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                TreeSetObj treeSetObj1 = (TreeSetObj) o1;
                TreeSetObj treeSetObj2 = (TreeSetObj) o2;

                if (treeSetObj1.count > treeSetObj2.count) {
                    return -1;
                } else if (treeSetObj1.count == treeSetObj2.count) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        mTreeSet.add(new TreeSetObj(5));
        mTreeSet.add(new TreeSetObj(-3));
        mTreeSet.add(new TreeSetObj(0));
        mTreeSet.add(new TreeSetObj(10));
        mTreeSet.add(new TreeSetObj(-12));

        System.out.println("mTreeSet: " + mTreeSet);
    }

    /**
     * define a object
     */
    private static class TreeSetObj implements Comparable {
        int count;

        public TreeSetObj(int count) {
            this.count = count;
        }

        /**
         * override toString
         *
         * @return String
         */
        public String toString() {
            return "count: " + count;
        }

        /**
         * override equals
         *
         * @param object object
         * @return boolean is equals
         */
        public boolean equals(Object object) {
            if (object instanceof TreeSetObj) {
                TreeSetObj treeSetObj = (TreeSetObj) object;

                if (treeSetObj.count == this.count) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public int compareTo(Object obj) {
            TreeSetObj treeSetObj = (TreeSetObj) obj;

            if (this.count > ((TreeSetObj) obj).count) {
                return 1;
            } else if (this.count == ((TreeSetObj) obj).count) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}
