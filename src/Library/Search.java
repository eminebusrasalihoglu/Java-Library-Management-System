package Library;

import java.util.Scanner;

public class Search implements IOOperation{
    @Override
    public void oper(Database database, User user) {
        System.out.println("Enter book name");
        Scanner s = new Scanner(System.in);
        String bookName = s.next();
        int i = database.getBook(bookName);
        if(i>-1){
            System.out.println( database.getBook(i).toString());
        }else{
            System.out.println("Book doesn't exist!");
        }
        user.menu(database, user);
    }
}
