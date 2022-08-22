package com.bookutil;

import com.book.BookStore;
import com.book.Book;
import java.util.Scanner;

public class BookUtil
{
    public static void main(String[] args)
    {
        //  CREATING 'BookStore' CLASS OBJECT
        BookStore bookStoreObj = new BookStore();

        //  DECLARING A FOR LOOP TO ENTER ELEMENTS '3' TIMES ENTRY
        for (int i = 1; i <= 3; i++)
        {
            //  PRINT STATEMENT.
            System.out.println("PLEASE ENTER BOOK-ID, AND REMEMBER BOOK-ID MUST START WITH B AND CONTAIN 4 CHARACTERS...");
            //  CREATED 'SCANNER' CLASS OBJECT 'scanBookId'.
            Scanner scanBookId = new Scanner(System.in);
            //  TAKING USER-INPUT.
            String bookId = scanBookId.nextLine();

            //  PRINT STATEMENT.
            System.out.println("PLEASE ENTER THE TITLE OF THE BOOK...");
            //  CREATED 'SCANNER' CLASS OBJECT 'scanTitle'.
            Scanner scanTitle = new Scanner(System.in);
            //  TAKING USER-INPUT.
            String title = scanTitle.nextLine();

            //  PRINT STATEMENT.
            System.out.println("PLEASE ENTER AUTHOR NAME...");
            //  CREATED 'SCANNER' CLASS OBJECT 'scanAuthor'.
            Scanner scanAuthor = new Scanner(System.in);
            //  TAKING USER-INPUT.
            String author = scanAuthor.nextLine();

            //  PRINT STATEMENT.
            System.out.println("PLEASE ENTER BOOK CATEGORY, AND REMEMBER CATEGORY MUST BE 'Science' or 'Friction' or 'Technology' or 'Other'...");
            //  CREATED 'SCANNER' CLASS OBJECT 'scanCategory'.
            Scanner scanCategory = new Scanner(System.in);
            //  TAKING USER-INPUT.
            String category = scanCategory.nextLine();

            //  PRINT STATEMENT.
            System.out.println("PLEASE ENTER THE PRICE, AND REMEMBER PRICE CANNOT BE NEGATIVE...");
            //  CREATED 'SCANNER' CLASS OBJECT 'scanPrice'.
            Scanner scanPrice = new Scanner(System.in);
            //  TAKING USER-INPUT.
            float price = scanPrice.nextFloat();

            //  CALLING 'addBook()' FROM 'BookStore' CLASS WITH 'BookStore' CLASS'S OBJECT 'bookStoreObj'.
            //  CALLING 'BooK' CLASS CONSTRUCTOR INSIDE IT
            bookStoreObj.addBook(new Book(bookId,title,author,category,price));
            //  CALLING 'displayAll()' FROM 'BookStore' CLASS WITH 'BookStore' CLASS'S OBJECT 'bookStoreObj'.
            bookStoreObj.displayAll();


        }

        //  CREATED 'SCANNER' CLASS OBJECT 'scan'.
        Scanner scan = new Scanner(System.in);

        //  PRINT STATEMENT.
        System.out.println("PLEASE ENTER TITLE TO SEARCH BOOK");
        //  TAKING USER-INPUT.
        String title = scan.nextLine();
        //  PRINT STATEMENT.
        System.out.println("SEARCH RESULT FOR YOU");
        //  CALLING 'searchByTitle()' FROM 'BookStore' CLASS WITH THE HELP OF 'bookStoreObj' OBJECT.
        //  AND THE METHOD DOES ITS OPERATION WITH THE STRING INPUT.
        bookStoreObj.searchByTitle(title);

        //  PRINT STATEMENT.
        System.out.println("PLEASE ENTER AUTHOR TO SEARCH BOOK");
        //  TAKING USER-INPUT.
        String author = scan.nextLine();
        //  PRINT STATEMENT.
        System.out.println("SEARCH RESULT FOR YOU");
        //  CALLING 'searchByAuthor()' FROM 'BookStore' CLASS WITH THE HELP OF 'bookStoreObj' OBJECT.
        //  AND THE METHOD DOES ITS OPERATION WITH THE STRING INPUT.
        bookStoreObj.searchByAuthor(author);

        //  PRINT STATEMENT.
        System.out.println("THANK YOU...");

        // CLOSING THE 'scan' OBJECT
        scan.close();
    }
}
