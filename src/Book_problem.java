import java.util.Scanner;

class Book{
    int bookId;
    String bookName;
    int bookPrice;
    String bookAuthor;
    static String libraryName = "Kolkata Library";
    public Book(int Id, String Name, int Price, String Author){
        bookId = Id;
        bookName = Name;
        bookPrice = Price;
        bookAuthor = Author;
    }
    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public int getBookPrice() {
        return bookPrice;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public static String getLibraryName() {
        return libraryName;
    }
    void display(){
        System.out.println("Book Id - " + getBookId() + " Book Name" + getBookName() + " Book Price" + getBookPrice() + " Book Author - " +bookAuthor);
    }
}
public class Book_problem {
    static Book createBook(int bookId, String bookName, int bookPrice, String bookAuthor) {
        return new Book(bookId, bookName, bookPrice, bookAuthor); // anonymous
//        Book obj = new Book(bookId,bookName,bookPrice,bookAuthor);
//        return obj;
    }
    public static void main(String[] args) {
        int bookId;
        String bookName;
        int bookPrice;
        String bookAuthor;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter book id - ");
            bookId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter book name - ");
            bookName = sc.nextLine();
            System.out.println("Enter book price - ");
            bookPrice = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter book author- - ");
            bookAuthor = sc.nextLine();

            Book b = Book_problem.createBook(bookId, bookName, bookPrice, bookAuthor);
            b.display();
            System.out.println("-------------------------------------------------------");
        }
    }
}