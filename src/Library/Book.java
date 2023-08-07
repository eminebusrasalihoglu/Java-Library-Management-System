package Library;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private String address;
    private String status;
    private int qty;       //copies for sale
    private double price;
    private int brwcopies; //copies for borrowing

    public Book(){}
    public Book(String name, String author, String publisher, String address, int qty, double price, int brwcopies){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.address = address;
        this.qty = qty;
        this.price = price;
        this.brwcopies = brwcopies;
    }

    public String toString(){
        String text = "Book Name: " + name +
                "Book Author: " + author +
                "Book Publisher: " + publisher +
                "Book Collection Address: "+ address+
                "Qty: "+ String.valueOf(qty)+
                "Price: "+ String.valueOf(price)+
                "Borrowing Coppies: "+ String.valueOf(brwcopies);

        return text;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBrwcopies() {
        return brwcopies;
    }

    public void setBrwcopies(int brwcopies) {
        this.brwcopies = brwcopies;
    }
}