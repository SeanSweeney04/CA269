/**
 * Book.java - Assignment 01
 * @author Sean Sweeney
 */

enum BookMedium {
    EBook, PhysicalBook, AudioBook;
}

enum BookGenre {
    Fiction, NonFiction;
}

enum BookRating {
    Rating1, Rating2, Rating3, Rating4, Rating5;
}

class Book {
    // fields are private
    private String title;
    private String author;
    private BookGenre genre;
    private int published;
    private int read_date;
    private BookMedium medium;
    private BookRating rating;

    /**
     * Default constructor takes title, author, and genre
     */
    public Book(String title, String author, BookGenre genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    /**
     * Additional constructor also takes published date
     */
    public Book(String title, String author, BookGenre genre, int published ){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.published = published;
    }

    /**
     * Additional constructor also takes published date,
     * read date, read medium, and rating
     */
    public Book(String title, String author, BookGenre genre, int published, int read_date, BookMedium medium, BookRating rating){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.published = published;
        this.read_date = read_date;
        this.medium = medium;
        this.rating = rating;
    }

    //getters
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public BookGenre getGenre(){
        return this.genre;
    }

    public int getPublishedDate(){
        return this.published;
    }

    public int getReadDate(){
        return this.read_date;
    }

    public BookMedium getMedium(){
        return this.medium;
    }

    public BookRating getRating(){
        return this.rating;
    }

    // setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(BookGenre genre){
        this.genre = genre;
    }

    public void setPublishedDate(int published){
        this.published = published;
    }

    public void setReadDate(int read_date){
        this.read_date = read_date;
    }

    public void setMedium(BookMedium medium){
        this.medium = medium;
    }

    public void setRating(BookRating rating){
        this.rating = rating;
    }

    /**
     * toString implementation
     * Depends on available information
     * For title, an author, and a genre - Title by Author
     * If publication date is present - Title by Author (Year of Publication)
     * If read date, read medium, and rating are present -
     * Title by Author (Year of Publication) - read in Year of Reading, rated rating/5
     */

    public String toString(){
        if (this.rating != null){
            String string_rating = this.rating.toString();
            char num_rating = string_rating.charAt(string_rating.length() - 1);
            return this.title + " by " + this.author + " (" + this.published + ")" + " - read in " + this.read_date + ", rated " + num_rating + "/5";
        }
        else if (this.published != 0){
            return this.title + " by " + this.author + " (" + this.published + ")";
        }
        else{
            return this.title + " by " + this.author;
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Children of Time", "Adrian Tchaikovsky",  BookGenre.Fiction);
        System.out.println(b1);
        Book b2 = new Book("The Fifth Season", "N. K. Jemesin", BookGenre.Fiction, 2015);
        System.
