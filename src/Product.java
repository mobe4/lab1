
public class Product {
    private long productId;
    private String name;
    private String dateSupplied;
    private int quantityInStock;
    private double unitPrice;

    // Default constructor
    public Product() {}

    // Constructor with all fields
    public Product(long productId, String name, String dateSupplied, int quantityInStock, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    // Getters
    public long getProductId() { return productId; }
    public String getName() { return name; }
    public String getDateSupplied() { return dateSupplied; }
    public int getQuantityInStock() { return quantityInStock; }
    public double getUnitPrice() { return unitPrice; }

    // Setters
    public void setProductId(long productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
    public void setDateSupplied(String dateSupplied) { this.dateSupplied = dateSupplied; }
    public void setQuantityInStock(int quantityInStock) { this.quantityInStock = quantityInStock; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }
}
