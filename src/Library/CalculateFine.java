package Library;

import java.util.Scanner;

public class CalculateFine implements IOOperation {
    @Override
    public void oper(Database database, User user) {
        System.out.println("Enter book name: ");
        Scanner s = new Scanner(System.in);
        String bookName = s.next();

        boolean g = true;
        for(Borrowing b : database.getBrws()){
            if(b.getBook().getName().matches(bookName) && b.getUser().getName().matches(user.getName())){
                if(b.getDaysleft()>0){
                    System.out.println("You are late!\n ou have to pay "+b.getDaysleft()*50+"as fine");
                }else{
                    System.out.println("You don't have to pay fine\n");
                }
                g = false;
                break;
            }
        }
        if(g){
            System.out.println("You didn't borrow this book");
        }
        user.menu(database, user);
    }
}
