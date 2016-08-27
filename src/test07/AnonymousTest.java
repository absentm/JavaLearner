package test07;

/**
 * AnonymousTest: equal mothed
 * Created by dm on 16-8-22.
 */
public class AnonymousTest implements Product {
    /**
     * define mothed
     *
     * @param product interface
     */
    public void productInfo(Product product) {
        System.out.println("Product name: " + product.getProductName() + "\n"
                + "Product price: " + product.getPrice()
        );
    }

    @Override
    public double getPrice() {
        return 1206.5;
    }

    @Override
    public String getProductName() {
        return "Mac2";
    }

    /**
     * test demo2
     */
    public static void Anonymoustest2() {
        AnonymousTest ta2 = new AnonymousTest();
        ta2.productInfo(new AnonymousTest());
    }

}
