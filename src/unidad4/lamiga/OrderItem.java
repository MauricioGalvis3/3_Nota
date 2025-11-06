package unidad4.lamiga;

/**
 * Represents a product entry within an order.
 */
public final class OrderItem {
    private final Product product;
    private final int quantity;
    private final int unitPrice;

    public OrderItem(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("El producto es obligatorio");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = product.resolveUnitPrice(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getLineTotal() {
        return unitPrice * quantity;
    }

    public boolean usesVolumePrice() {
        return unitPrice == product.getVolumePrice();
    }
}
