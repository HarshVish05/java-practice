import java.util.ArrayList;

public class Library {
    ArrayList<String> bookList = new ArrayList<String>();

    public void adding (String book){
        bookList.add(book);
    }
    public void show() {
        System.out.println(bookList);
    }
}
