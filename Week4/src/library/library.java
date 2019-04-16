package library;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class library {
    Scanner myScanner = new Scanner(System.in);
    book[] books = new book[8];

    member[] members = new member[5];
    loan[] loans = new loan[2];

    public static void main(String[] args) {
        library lib = new library();
        lib.init();
    }

    private void init() {
        books[0] = new book(1, "In Search of Lost time", "Marcel Proust", "1913");
        books[1] = new book(2, "Ulysses", "James Joyce", "1922");
        books[2] = new book(3, "Moby Dick", "Herman Melville", "1851");
        books[3] = new book(4, "Pride and Prejudice", "Jane Austen", "1813");
        books[4] = new book(5, "The Canterbury Tales", "Geoffrey Chaucer", "1387");
        books[5] = new book(6, "Coming Up for Air", "George Orwell", "1939");
        books[6] = new book(7, "Animal Farm", "George Orwell", "1945");
        books[7] = new book(8, "1984", "George Orwell", "1949");

        members[0] = new member(1, "Dean", "Lewis", (byte)30);
        members[1] = new member(2, "Steve","Beckwith",(byte)55);
        members[2] = new member(3, "Lisa","Crow",(byte)39);
        members[3] = new member(4, "Vicky", "Cross", (byte)37);
        members[4] = new member(5, "Rachel", "Alsop", (byte)25);

        loans[0] = new loan(2, 4);
        loans[1] = new loan(5, 2);

        menu();
    }

    private void menu() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Dean´s Library");
        System.out.println("Select an option from the list below");
        System.out.println("1 - Search for a book");
        System.out.println("2 - Check if a book is available");
        System.out.println("3 - Search for an Author");
        System.out.println("4 - Exit");
        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice){
            case 1:
                searchBook();
                break;
//            case 2:
//                checkBox();
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

        for(int i = 0; i < books.length; i++) {
            if(books[i].bookTitle.equalsIgnoreCase(title)){
                System.out.println("We have that book in the library");
                System.out.println();
                menu();
            }
            else if(i == books.length - 1) {
                System.out.println("Sorry, we do not currently stock that book");
                System.out.println();
                menu();
            }
        }
    }
//    private void checkBox() {
//
//    }
//
    private void searchAuthor() {
        System.out.println("What is the author you would like to look for?");
        String author = myScanner.nextLine();


        for(int i = 0; i < books.length; i++)
            if (books[i].bookAuthor.equalsIgnoreCase(author)) {
                ArrayList results = new ArrayList();
                for (i = 0; i < books.length; i++) {
                    if (books[i].bookAuthor.equalsIgnoreCase(author)) {
                        results.add(books[i].bookTitle);
                    }

                    Collections.sort(results);
                }
                System.out.println("Results for the author: " + author.toUpperCase());
                System.out.print(results);
                System.out.println();
                menu();
            } else if (i == books.length - 1) {
                System.out.println("Sorry, we do not currently stock book(s) from that author");
                System.out.println();
                menu();
            }

    }

}
