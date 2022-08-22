package com.book;

import java.util.ArrayList;

public class BookStore
{
    //  CREATING AN ARRAYLIST.
    ArrayList<Book> list = new ArrayList<>();

    //  'addBook()' TO ADD BOOK OBJECT INTO THE ARRAYLIST.
    public void addBook(Book b)
    {
        //  ADDING BOOK OBJECT.
        list.add(b);
    }

    //  'searchByTitle()' TO SEARCH BOOKS BY TITLE AND IF FOUND DISPLAY DETAILS.
    public void searchByTitle(String title)
    {
        //  FOR-EACH LOOP TO GET ELEMENTS.
        //  TRAVERSING.
        for (Book b : list)
        {
            //  IF-ELSE STATEMENT & CONDITION.
            if (title.contains(b.title))
            {
                //  PRINT STATEMENT.
                System.out.println("BookId  :  "+"  "+b.bookId+"  "+"Title  :  "+"  "+b.title+"  "+"Author  :  "+"  "+b.author+"  "+"Category  :  "+"  "+b.category+"  "+"Price  :  "+"  "+b.price);

                //  BREAK STATEMENT TO BREAK THE FLOW.
                break;
            }
            else
            {
                //  PRINT STATEMENT.
                System.out.println("SORRY! NO RESULTS FOUND... ");

                //  BREAK STATEMENT TO BREAK THE FLOW.
                break;
            }
        }
    }

    //  'searchByAuthor()' TO SEARCH BOOKS BY AUTHOR AND IF FOUND DISPLAY DETAILS.
    public void searchByAuthor(String author)
    {
        //  FOR-EACH LOOP TO GET ELEMENTS.
        //  TRAVERSING.
        for (Book b : list)
        {
            //  IF-ELSE STATEMENT & CONDITION.
            if (author.contains(b.author))
            {
                //  PRINT STATEMENT.
                System.out.println("BookId  :  "+"  "+b.bookId+"  "+"Title  :  "+"  "+b.title+"  "+"Author  :  "+"  "+b.author+"  "+"Category  :  "+"  "+b.category+"  "+"Price  :  "+"  "+b.price);

                //  BREAK STATEMENT TO BREAK THE FLOW.
                break;
            }
            else
            {
                //  PRINT STATEMENT.
                System.out.println("SORRY! NO RESULTS FOUND... ");

                //  BREAK STATEMENT TO BREAK THE FLOW.
                break;
            }
        }
    }

    //  'displayAll()' TO PRINT DETAILS OF ALL BOOKS.
    public void displayAll()
    {
        //  FOR-EACH LOOP TO GET ELEMENTS.
        //  TRAVERSING.
        for (Book b : list)
        {
            //  PRINT STATEMENT.
            System.out.println("BookId  :  "+"  "+b.bookId+"  "+"Title  :  "+"  "+b.title+"  "+"Author  :  "+"  "+b.author+"  "+"Category  :  "+"  "+b.category+"  "+"Price  :  "+"  "+b.price);

            //  BREAK STATEMENT TO BREAK THE FLOW.
            break;
        }
    }
}
