package unidad4.lamiga;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Formats orders into a human-readable summary.
 */
public final class OrderSummaryFormatter {
    private final NumberFormat currencyFormatter;

    public OrderSummaryFormatter() {
        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-CL"));
        currencyFormatter.setMaximumFractionDigits(0);
    }

    public String format(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("El pedido es obligatorio para generar el resumen");
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Cliente: ").append(order.getCustomer().toString()).append('\n');
        builder.append("Ítems:\n");
        for (OrderItem item : order.getItems()) {
            String priceLabel = item.usesVolumePrice() ? "precio por volumen" : "precio normal";
            builder.append(" - ")
                .append(item.getProduct().getDisplayName())
                .append(": ")
                .append(item.getQuantity())
                .append(" x ")
                .append(currencyFormatter.format(item.getUnitPrice()))
                .append(" (")
                .append(priceLabel)
                .append(") = ")
                .append(currencyFormatter.format(item.getLineTotal()))
                .append('\n');
        }

        int subtotal = order.calculateSubtotal();
        int discount = order.calculateDiscount();
        int total = order.calculateTotal();

        builder.append("Subtotal: ")
            .append(currencyFormatter.format(subtotal))
            .append('\n');
        builder.append("Descuento: ")
            .append(currencyFormatter.format(discount))
            .append('\n');
        builder.append("Total a pagar: ")
            .append(currencyFormatter.format(total));

        return builder.toString();
    }
}
