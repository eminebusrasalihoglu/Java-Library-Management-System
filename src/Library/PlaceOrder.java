package Library;

import java.util.Scanner;

public class PlaceOrder implements IOOperation{
    @Override
    public void oper(Database database, User user) {

        Order order = new Order();
        System.out.println("\nEnter book name:");
        Scanner s = new Scanner(System.in);
        String bookName = s.next();
        int i = database.getBook(bookName);
        if(i<=-1){
            System.out.println("Book doesn't exist");
        }else{
            Book book = database.getBook(i);
            order.setBook(book);
            order.setUser(user);
            System.out.println("Enter qty: ");
            int qty = s.nextInt();
            order.setQty(qty);
            order.setPrice(book.getPrice()*qty);
            int bookIndex = database.getBook(book.getName());
            book.setQty(book.getQty()-qty);
            database.addOrder(order, book, bookIndex);
            System.out.println("Order placed successfully!\n");
        }
        user.menu(database,user);
    }
}
