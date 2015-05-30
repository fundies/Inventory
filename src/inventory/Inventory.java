package inventory;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class Inventory
{

    private String name;
    private int quantity;
    private double price;

    /**
     * Default Constructor
     */
    public Inventory()
    {
        name = "";
        quantity = 0;
        price = 0.00;
    }

    /**
     * Constructs inventory Item
     *
     * @param aName item name
     * @param aPrice item price
     * @param aQuantity item quantity
     */
    public Inventory(String aName, double aPrice, int aQuantity)
    {
        name = aName;
        price = aPrice;
        quantity = aQuantity;
    }

    /**
     * Get item name
     *
     * @return item name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Get Item Price
     *
     * @return price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Get Item Quantity
     *
     * @return quantity
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Set Item Name
     *
     * @param newName item name
     */
    public void setName(String newName)
    {
        name = newName;
    }

    /**
     * Set the Price
     *
     * @param newPrice new price
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }

    /**
     * Set the Quantity
     *
     * @param newQuantity new quantity
     */
    public void setQuantity(int newQuantity)
    {
        quantity = newQuantity;
    }

    /**
     * Sold Some Items
     *
     * @param qtySold amount sold
     */
    public void sold(int qtySold)
    {
        if (qtySold > quantity)
        {
            System.out.println("Error: not enough in stock to fulfill order.");
            return;
        } 
        else
        {
            quantity -= qtySold;
        }

        if (quantity <= 2)
        {
            System.out.println("Warning: low on quantity of " + name + " only "
                    + quantity + " left in stock!");
        }
    }
}
