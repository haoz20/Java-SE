package Assignment_LibraryManagementSystem;

public class Book {
    private String title;
    private String subtitle;
    private static int totalBooks = 0;

    public Book(String title) {
        this.title = title;
        totalBooks++;
    }

    public Book(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
        totalBooks++;
    }

    public void setBookDetails(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getBooksDetails() {
        return "Title: " + this.title + "\nSubtitle: " + this.subtitle;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void display() {
        if (this.subtitle != null) {
            System.out.println("\nTitle: " + this.title);
            System.out.println("Subtitle: " + this.subtitle);
        }else{
            System.out.println("\nTitle: " + this.title);
        }
    }

}
