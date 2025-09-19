// Topic: InventoryItemEncapsulationProblem
public class InventoryItem {
    public String itemName;                 // ❌ Public field - no control over invalid names
    public int quantity;                    // ❌ Directly modifiable - can be negative
    public double pricePerUnit;            // ❌ No validation - can lead to zero or negative prices

    public void updateStock(int newQty, double newPrice) {
        quantity = newQty;                 // ❌ No checks - negative quantity allowed
        pricePerUnit = newPrice;           // ❌ No validation - can result in invalid pricing
    }
}

// ✅ Proper Encapsulation for Inventory Management System
class InventoryItem {
    private final String itemCode;         // ✅ Unique identifier, immutable after construction
    private String itemName;               // ✅ Private with validation
    private int quantity;                  // ✅ Private with controlled updates
    private double pricePerUnit;           // ✅ Private with validation

    public InventoryItem(String itemCode, String itemName, int quantity, double pricePerUnit) {
        if (itemCode == null || itemCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Item code cannot be null or empty");
        }
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (pricePerUnit <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }

        this.itemCode = itemCode.trim();
        this.itemName = itemName.trim();
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getItemCode() {
        return itemCode;                   // ✅ Read-only access to immutable ID
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.itemName = newName.trim();   // ✅ Name can be updated, but only with valid values
        } else {
            throw new IllegalArgumentException("Item name cannot be null or empty");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int additionalQty) {
        if (additionalQty <= 0) {
            throw new IllegalArgumentException("Added quantity must be greater than zero");
        }
        this.quantity += additionalQty;     // ✅ Stock updated through method only
    }

    public void reduceStock(int soldQty) {
        if (soldQty <= 0) {
            throw new IllegalArgumentException("Sold quantity must be greater than zero");
        }
        if (soldQty > quantity) {
            throw new IllegalStateException("Insufficient stock to sell");
        }
        this.quantity -= soldQty;          // ✅ Prevents overselling
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void updatePrice(double newPrice) {
        if (newPrice <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.pricePerUnit = newPrice;      // ✅ Controlled price update
    }

    public double calculateTotalValue() {
        return quantity * pricePerUnit;    // ✅ Business logic encapsulated within class
    }
}
