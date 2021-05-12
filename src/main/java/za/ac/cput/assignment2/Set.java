package za.ac.cput.assignment2;

/**
 * Author: Ottor Ncedo 218052200
 * Date: 05 May 2021
 * This is a Book programme for Set using TDD
 */

public class Set {

    private String title;
    private double price;
    private int copiesInStock;
    private int Id;

    public Set() {

    }

    public Set(String title, int Id){
        this.title = title;
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getCopiesInStock() {
        return copiesInStock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setCopiesInStock(int copiesInStock) {
        this.copiesInStock = copiesInStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", copiesInStock=" + copiesInStock +
                ", Id=" + Id +
                '}';
    }

    public void show() {
        System.out.println("Id: " + Id);
        System.out.println("This is the details of the book");
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("CopiesInStock: " + copiesInStock);
    }
    private double discount(int numberOfBooks){
        double discount;
        if (numberOfBooks >= 10)
            discount = 0.10;
        else if(numberOfBooks >= 5)
            discount = 0.05;
        else
            discount = 0;
        return discount;
    }
    public double sell(int numberOfBooks) {
        double sellPrice;

        if(numberOfBooks <= copiesInStock) {
            sellPrice = (price*numberOfBooks) * (1-discount(numberOfBooks));
        }
        else
            sellPrice= 0;
        return sellPrice;
    }

}
