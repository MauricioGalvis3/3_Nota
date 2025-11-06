package unidad4.lamiga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a same-day order at La Miga.
 */
public final class Order {
    private static final double DISCOUNT_RATE = 0.05;
    private static final int DISCOUNT_THRESHOLD = 60000;

    private final Customer customer;
    private final List<OrderItem> items;
    private boolean confirmed;

    public Order(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("El cliente es obligatorio");
        }
        this.customer = customer;
        this.items = new ArrayList<>();
        this.confirmed = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void addItem(Product product, int quantity) {
        ensureNotConfirmed();
        OrderItem item = new OrderItem(product, quantity);
        items.add(item);
    }

    public void confirm() {
        ensureNotConfirmed();
        if (items.isEmpty()) {
            throw new IllegalStateException("No se puede confirmar un pedido sin productos");
        }
        this.confirmed = true;
    }

    public int calculateSubtotal() {
        return items.stream().mapToInt(OrderItem::getLineTotal).sum();
    }

    public int calculateDiscount() {
        int subtotal = calculateSubtotal();
        if (subtotal > DISCOUNT_THRESHOLD) {
            return (int) Math.round(subtotal * DISCOUNT_RATE);
        }
        return 0;
    }

    public int calculateTotal() {
        return calculateSubtotal() - calculateDiscount();
    }

    private void ensureNotConfirmed() {
        if (confirmed) {
            throw new IllegalStateException("El pedido ya fue confirmado y no se puede modificar");
        }
    }
}
