package Course3Sprint4.P1;

public class Book {

    private int IsbnNumber;
    private String bookTitle;
    private String bookDescription;
    private int bookPrice;

    Author author;

    public Book(Author author){
//        this.IsbnNumber=IsbnNumber;
//        this.bookTitle = bookTitle;
//        this.bookDescription = bookDescription;
//        this.bookPrice = bookPrice;
          this.author=author;
    }

    public int getIsbnNumber() {
        return IsbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        IsbnNumber = isbnNumber;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void displayDetaills(){
        System.out.println("Book ISBN number : " + getIsbnNumber());
        System.out.println("Book Title : " + getBookTitle());
        System.out.println("Book Description : " + getBookDescription());
        System.out.println("Book price : " + getBookPrice());
        System.out.println(author);
    }
}
