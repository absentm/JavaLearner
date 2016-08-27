package test07;

/**
 * Anonymous Class Test
 * Created by dm on 16-8-22.
 */
public class AnonymousClassTest {
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

    /**
     * test demo1
     */
    public static void Anonymoustest1() {
        AnonymousClassTest ta = new AnonymousClassTest();
        ta.productInfo(new Product() {
            @Override
            public double getPrice() {
                return 1206.5;
            }

            @Override
            public String getProductName() {
                return "Mac";
            }
        });
    }
}
