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
        String text = "Book Name: " + name +"\n"+
                "Book Author: " + author +"\n"+
                "Book Publisher: " + publisher +"\n"+
                "Book Collection Address: "+ address+"\n"+
                "Qty: "+ String.valueOf(qty)+"\n"+
                "Price: "+ String.valueOf(price)+"\n"+
                "Borrowing Coppies: "+ String.valueOf(brwcopies)+"\n";

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

    public String toString2(){
        String text =  name +
                "<N/>" + author +
                "<N/>" + publisher +
                "<N/>"+ address+
                "<N/>"+ String.valueOf(qty)+
                "<N/>"+ String.valueOf(price)+
                "<N/>"+ String.valueOf(brwcopies);

        return text;
    }
    public Book parseBook(String s){
        String[] a = s.split("<N/>");
        Book book = new Book();
        book.setName(a[0]);
        book.setAuthor(a[1]);
        book.setPublisher(a[2]);
        book.setAddress(a[3]);
        book.setQty(Integer.parseInt(a[4]));
        book.setPrice(Double.parseDouble(a[5]));
        book.setBrwcopies(Integer.parseInt(a[6]));
        return book;
    }
}
