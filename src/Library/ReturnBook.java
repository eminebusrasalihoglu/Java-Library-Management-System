package Library;

import java.util.Scanner;

public class ReturnBook implements IOOperation{
    @Override
    public void oper(Database database, User user) {
        System.out.println("Enter book name: ");
        Scanner s = new Scanner(System.in);
        String bookName = s.next();
        if(!database.getBrws().isEmpty()){
            for(Borrowing b : database.getBrws()){
                if(b.getBook().getName().matches(bookName)&&
                b.getUser().getName().matches(user.getName())){
                    Book book = b.getBook();
                    int i = database.getAllBooks().indexOf(book);
                    if(b.getDaysleft()<10){
                        System.out.println("You are late!\n ou have to pay "+Math.abs(b.getDaysleft()*50)+"as fine");

                    }
                    book.setBrwcopies(book.getBrwcopies()+1);
                    database.returnBook(b, book, i);
                    System.out.println("Book returned\n Thank you!\n");
                    break;
                }else{
                    System.out.println("You didn't borrow this book!\n");
                }
            }
        }else{
            System.out.println("You didn't borrow this book!\n");
        }
        user.menu(database, user);
    }
}
