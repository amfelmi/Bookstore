import java.time.LocalDate;
import java.util.ArrayList;

public class BookStoreMain {
    public static void main(String[] args) {
        //create a bookStore object and instantiate
        BookStore bookStore = new BookStore();
        //create a customer who can then buy books
        Customer customer1 = new Customer("John", "07976356482", "johnmeekle@hotmail.co.uk");
        //customer1 places an order to purchase a book
        Stock book1 = new Stock("HarryPotter", "JK", 15.20);

        //placing the order ****
        Order order1 = new Order(customer1, book1);

        //determine the shipping date
        Shipping shipOrder = new Shipping(order1, LocalDate.now());

        //calculate the shipping cost to send the order
        shipOrder.calcShipCost(true);


        //create an invoice ****
        Invoice invoice = new Invoice("F5", book1, shipOrder);

        //add the invoices to a list so that we can search for an invoice ****
        bookStore.getInvoices().add(invoice);

        bookStore.pilingUpOfOrders();

        //a repeat with another customer, order, etc...


        BookStore bookStore2 = new BookStore();

        Customer customer2 = new Customer("Harry", "077364728454", "harrymak@hotmail.co.uk");

        Stock book2 = new Stock("ice and fire", "rowley", 7.20);

        Order order2 = new Order(customer2, book2);

        Shipping shipOrder2 = new Shipping(order2, LocalDate.now());

        shipOrder2.calcShipCost(true);

        Invoice invoice2 = new Invoice("F6", book1, shipOrder);

        bookStore.getInvoices().add(invoice2);

        bookStore.pilingUpOfOrders();

        Invoice foundInvoice = bookStore2.searchOrder("F5");

    }
}

