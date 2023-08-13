package Library;

import java.util.ArrayList;

public class ViewBooks implements IOOperation {
    @Override
    public void oper(Database database, User user) {

        ArrayList<Book> books = database.getAllBooks();
        System.out.println("Name\tAuthor\tPublisher\tCLA\tStatus\tQty\tPrice\tBorrowing Copies");
        for (Book b : books){
            System.out.println(b.getName()+"\t"+b.getAuthor()+"\t"+b.getPublisher()+"\t"+
                    b.getAddress()+"\t"+b.getStatus()+"\t"+b.getQty()+"\t"+b.getPrice()+"\t"+
                    b.getBrwcopies());
        }
        user.menu(database, user);
    }
}
