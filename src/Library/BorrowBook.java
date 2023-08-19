package Library;

import java.util.Scanner;

public class BorrowBook implements IOOperation{
    @Override
    public void oper(Database database, User user) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter book name: ");
        String bookName = s.next();

        int i = database.getBook(bookName);
        if(i>-1){
            Book book = database.getBook(i);
            if(book.getBrwcopies()>1){
                Borrowing borrowing = new Borrowing(book,user);
                book.setBrwcopies(book.getBrwcopies()-1);
                database.borrowBook(borrowing, book, i);
                System.out.println("You must return the book before 14 days from now \n");
            }else{
                System.out.println("This book isn't available for borrowing\n");
            }
        }else{
            System.out.println("Book doesn't exist!");
        }
        user.menu(database, user);
    }
}
