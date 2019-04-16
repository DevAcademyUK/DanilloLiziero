package library2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class library {
    Scanner myScanner = new Scanner(System.in);
    List<book> books = new ArrayList<book>();
    List<member> members = new ArrayList<member>();
    List<loan> loans = new ArrayList<loan>();

    public static void main(String[] args) {
        library lib = new library();
        lib.init();
    }

    private void init() {
        books.add(new book(1, "In Search of Lost time", "Marcel Proust", "1913"));
        books.add(new book(2, "Ulysses", "James Joyce", "1922"));
        books.add(new book(3, "Moby Dick", "Herman Melville", "1851"));
        books.add(new book(4, "Pride and Prejudice", "Jane Austen", "1813"));
        books.add(new book(5, "The Canterbury Tales", "Geoffrey Chaucer", "1387"));
        books.add(new book(6, "Coming Up for Air", "George Orwell", "1939"));
        books.add(new book(7, "Animal Farm", "George Orwell", "1945"));
        books.add(new book(8, "1984", "George Orwell", "1949"));

        members.add(new member(1, "Dean", "Lewis", (byte)30));
        members.add(new member(2, "Steve","Beckwith",(byte)55));
        members.add(new member(3, "Lisa","Crow",(byte)39));
        members.add(new member(4, "Vicky", "Cross", (byte)37));
        members.add(new member(5, "Rachel", "Alsop", (byte)25));

        loans.add(new loan(2, 4));
        loans.add(new loan(5, 2));

        menu();
    }

    private void menu() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Dean´s Library");
        System.out.println("Select an option from the list below");
        System.out.println("1 - Search for a library2.book");
        System.out.println("2 - Check if a library2.book is available");
        System.out.println("3 - Search for an Author");
        System.out.println("4 - Exit");
        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice){
            case 1:
                searchBook();
                break;
//            case 2:
//                checkBook();
//                break;
            case 3:
                searchAuthor();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid input provided, please try again");
                menu();
        }
    }

    private void searchBook() {
        System.out.println("What is the name of the book you would like to search for?");
        String title = myScanner.nextLine();

        for(book a : books) {
            System.out.println((a.bookTitle));
        }
        System.out.println("\n");
        Collections.sort(books);

        for(book b : books) {
            System.out.println(b.bookTitle);
        }
    }

    private void searchAuthor() {
        System.out.println("What is the author you would like to look for?");
        String author = myScanner.nextLine();
//        System.out.println("How would you like the list ordered by?");
//        int choice = Integer.parseInt(myScanner.nextLine());




        Collections.sort(books, book.bookAuthorComparator);

        for(book b : books){
            System.out.println(b.bookAuthor);
        }
    }

}
