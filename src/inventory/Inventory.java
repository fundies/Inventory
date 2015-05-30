package inventory;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class Inventory {

    private String name;
    private int quantity;
    private double price;

    /**
     * Default Constructor.
     */
    public Inventory() {
        name = "";
        quantity = 0;
        price = 0.00;
    }

    /**
     * Constructs inventory Item.
     *
     * @param aName item name
     * @param aPrice item price
     * @param aQuantity item quantity
     */
    public Inventory(final String aName, final double aPrice,
            final int aQuantity) {
        name = aName;
        price = aPrice;
        quantity = aQuantity;
    }

    /**
     * Get item name.
     *
     * @return item name
     */
    public final String getName() {
        return name;
    }

    /**
     * Get Item Price.
     *
     * @return price
     */
    public final double getPrice() {
        return price;
    }

    /**
     * Get Item Quantity.
     *
     * @return quantity
     */
    public final int getQuantity() {
        return quantity;
    }

    /**
     * Set Item Name.
     *
     * @param newName item name
     */
    public final void setName(final String newName) {
        name = newName;
    }

    /**
     * Set the Price.
     *
     * @param newPrice new price
     */
    public final void setPrice(final double newPrice) {
        price = newPrice;
    }

    /**
     * Set the Quantity.
     *
     * @param newQuantity new quantity
     */
    public final void setQuantity(final int newQuantity) {
        quantity = newQuantity;
    }

    /**
     * Sold Some Items.
     *
     * @param qtySold amount sold
     */
    public final void sold(final int qtySold) {
        if (qtySold > quantity) {
            System.out.println("Error: not enough in stock to fulfill order.");
            return;
        } else {
            quantity -= qtySold;
        }

        if (quantity <= 2) {
            System.out.println("Warning: low on quantity of " + name + " only "
                    + quantity + " left in stock!");
        }
    }
}
