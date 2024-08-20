package Assignment_LibraryManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Library {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static Book[] library = new Book[100];

    public static void main(String[] args) throws IOException {
        String answer = "";
        do{
            addBooks(input());
            System.out.print("Do you want to enter another book? (yes/no) ");
            answer = br.readLine();
        }while(answer.equalsIgnoreCase("yes"));
        showLibraryInvetory();
        System.out.println("Total number of books created: " + Book.getTotalBooks());
    }

    public static Book input() throws IOException {
        Book book;
        System.out.println("\nEnter details for a new book: ");

        System.out.print("Title: ");
        String title = br.readLine();

        System.out.print("Subtitle (or press Enter to skip): ");
        String subtitle = br.readLine();

        if (subtitle.equals("")){
            book = new Book(title);
        }else{
            book = new Book(title, subtitle);
        }
        return book;
    }

    public static void addBooks(Book book){
        library[Book.getTotalBooks()-1] = book;
    }

    public static void showLibraryInvetory(){
        System.out.println("\nLibrary Inventory: ");
        for (int i = 0; i < Book.getTotalBooks(); i++){
            library[i].display();
        }
    }

}
