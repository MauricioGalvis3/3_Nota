package unidad4.lamiga;

/**
 * Simple demonstration for La Miga order workflow.
 */
public final class LaMigaApp {
    private LaMigaApp() {
    }

    public static void main(String[] args) {
        Customer karen = new Customer("Karen", "+56 9 1234 5678");
        Order order = new Order(karen);
        order.addItem(Product.BAGUETTE, 6); // aplica precio por volumen
        order.addItem(Product.CROISSANT, 2); // precio normal
        order.addItem(Product.PAIN_AU_CHOCOLAT, 8); // aplica precio por volumen

        order.confirm();

        OrderSummaryFormatter formatter = new OrderSummaryFormatter();
        String summary = formatter.format(order);
        System.out.println(summary);
    }
}
