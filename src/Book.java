public class Book {
    String nameOfBook;
    int publicAge;
    String authorType;
    public Book(java.lang.String nameOfBook, int publicAge, java.lang.String authorType) {
        this.nameOfBook = nameOfBook;
        this.publicAge = publicAge;
        this.authorType = authorType;
    }
    public String getNameOfBook() {
        return this.nameOfBook;
    }
    public int getPublicAge() {
        return this.publicAge;
    }
    public int setPublicAge(int publicAge) {
        this.publicAge = publicAge;
        return this.publicAge;
    }
    public String getAuthorType() {
        return this.authorType;
    }
}