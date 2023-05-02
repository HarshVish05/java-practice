class Book{
    String bookName;
    String authorName;
    int pages;

}





public class ArrayDemo {
    public static void main(String[] args) {
        int nums[] = new int[10];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        // for (int j : nums) {
            
        //     System.out.println(j);
        // }

        Book b1 = new Book();
        b1.bookName="Dumb Witness";
        b1.authorName="Agatha Christie";
		b1.pages=256;

        Book b2 = new Book();
        b2.bookName="The 48 laws of power";
        b2.authorName="Robert Greene";
		b2.pages=600;

        Book b3 = new Book();
        b3.bookName="The murder of Roger Ackroyd";
        b3.authorName="Agatha Christie";
		b3.pages=301;

        Book bookList[] = new Book[3];
        bookList[0]=b1;
        bookList[1]=b2;
        bookList[2]=b3;

        // for (Book book : bookList) {
        //     System.out.println(book.bookName+" written by "+book.authorName+" contains "+book.pages+"pages");
        // }

    }
}
