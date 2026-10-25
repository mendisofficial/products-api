package uk.ac.westminster.productsapi;

// A PhysicalProduct IS-A Product because every shipped item is still a catalogue product with an id, a name and a price, and it can be stored in a List<Product>.
// A ShoppingCart would not pass this test: a cart has products inside it, so that relationship is HAS-A, not IS-A.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
