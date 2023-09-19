import java.time.LocalDate;

public class Shipping {

    Order order;
    double shipCost;
    LocalDate shipDate;
    public static int countUrgent = 0;

    public Shipping(Order order, LocalDate shipDate) {
        this.order = order;
        this.shipDate = shipDate;
    }


    public double getShipCost() {
        return shipCost;
    }

    public LocalDate getShipDate() {
        return shipDate;
    }

    public void setShipCost(double shipCost) {
        this.shipCost = shipCost;
    }

    public double calcShipCost(boolean isUrgent) {
        if(isUrgent){
            countUrgent++;
        }

        if (isUrgent) {
            shipCost = 5.45;
        } else {
                shipCost = 3.95;
            }
        return shipCost;
    }
}

