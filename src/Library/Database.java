package Library;

import java.util.ArrayList;
import java.io.File;
public class Database {

    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<String> userNames = new ArrayList<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<String> bookNames = new ArrayList<String>();

    private File usersFile = new File(Main.class.getClassLoader().getResource("data\\Users").getFile());
    private File booksFile = new File(Main.class.getClassLoader().getResource("data\\Books").getFile());

    public Database(){
        if(!usersFile.exists()){
            usersFile.mkdirs();
        }
        if(!booksFile.exists()){
            booksFile.mkdirs();
        }
    }

    public void addUser(User u) {
        users.add(u);
        userNames.add(u.getName());
    }

    public int login( String phoneNumber, String email) {
        int n = -1;
        for(User u : users) {
            if(u.getPhoneNumber().matches(phoneNumber) && u.getEmail().matches(email)) {
                n = users.indexOf(u);
                break;
            }
        }
        return n;
    }

    public User getUser(int n) {
        return users.get(n);
    }

    public void addBook(Book book){
        books.add(book);
        bookNames.add(book.getName());
    }
}
