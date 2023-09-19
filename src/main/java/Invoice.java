public class Invoice {
    //attributes
    String invoiceNbr;
    Shipping shipCost;
    Stock price;
    double totalCost;
    //complete the constructor
    public Invoice(String invoiceNbr, Stock price, Shipping shipCost) {

        this.invoiceNbr = invoiceNbr;
        this.price = price;
        this.shipCost = shipCost;
    }

    //complete the getter()

    public String getInvoiceNbr() {
        return invoiceNbr;
    }


    //complete the totalCost for a shipping order
    public double invoice() {
        totalCost = shipCost.getShipCost() + price.getPrice();
        return totalCost;
    }
}
