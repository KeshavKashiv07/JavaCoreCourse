package Course3Sprint4.P1;

public class BookImpl {

    public static void main(String[] args) {

        Author author = new Author();
        author.setAuthorName("Jon Dani-fer");
        author.setAuthorPenName("J.D");


        Book book = new Book(author);
        book.setIsbnNumber(123);
        book.setBookTitle("Oops In Java");
        book.setBookDescription("Learn Java");
        book.setBookPrice(500);

        book.displayDetaills();

        System.out.println( author.toString());

    }
}
