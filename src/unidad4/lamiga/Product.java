package unidad4.lamiga;

/**
 * Fixed catalog of La Miga products.
 */
public enum Product {
    BAGUETTE("Baguette", 6000, 5500, 6),
    CROISSANT("Croissant", 4500, 4000, 6),
    PAIN_AU_CHOCOLAT("Pan de chocolate", 5500, 5000, 6);

    private final String displayName;
    private final int regularPrice;
    private final int volumePrice;
    private final int volumeThreshold;

    Product(String displayName, int regularPrice, int volumePrice, int volumeThreshold) {
        this.displayName = displayName;
        this.regularPrice = regularPrice;
        this.volumePrice = volumePrice;
        this.volumeThreshold = volumeThreshold;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getRegularPrice() {
        return regularPrice;
    }

    public int getVolumePrice() {
        return volumePrice;
    }

    public int getVolumeThreshold() {
        return volumeThreshold;
    }

    /**
     * Determines the unit price to use depending on the quantity.
     */
    public int resolveUnitPrice(int quantity) {
        return quantity >= volumeThreshold ? volumePrice : regularPrice;
    }
}
