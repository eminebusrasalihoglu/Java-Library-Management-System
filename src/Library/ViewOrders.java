package Library;

import java.util.Scanner;

public class ViewOrders implements IOOperation{
    @Override
    public void oper(Database database, User user) {

        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter book name:");
        String bookName = s.next();

        int i = database.getBook(bookName);
        if(i>-1){
            System.out.println("Book\t\tUser\t\tQty\t\tPrice");
            for(Order order : database.getAllOrders()){
                if(order.getBook().getName().matches(bookName)){
                    System.out.println(order.getBook().getName()+"\t\t"+
                            order.getUser().getName()+"\t\t"+order.getQty()+"\t\t"
                    +order.getPrice());
                }
            }

        }else{
            System.out.println("Book doesn't exist!");
        }
        user.menu(database, user);
    }
}
