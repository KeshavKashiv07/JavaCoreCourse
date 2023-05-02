package Course3Sprint4.P1;

public class Author {

    private String authorName;
    private String authorPenName;

    public Author(){
        this.authorName= getAuthorName();
        this.authorPenName=getAuthorPenName();

    }


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }

    @Override
    public String toString() {
        return "Author { " + "authorName = " + authorName + ", authorPenName = " + authorPenName  + " }";
    }
}
