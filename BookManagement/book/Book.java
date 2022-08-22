package com.book;

public class Book
{
    public String bookId;
    public String title;
    public String author;
    public String category;
    public float price;

    //  PARAMETERIZED CONSTRUCTOR
    public Book(String bookId, String title, String author, String category, float price)
    {
        //  TRY BLOCK TO THROW DEFINED EXCEPTION 'InvalidBookException'
        try
        {
            //  IF-ELSE STATEMENT -- 1.
            //  IF-ELSE STATEMENT FOR THE BOOK-ID.
            //  IF BOOK-ID SATISFY THE IF STATEMENT IT IS THEN GOOD TO GO.
            //  OTHERWISE, THROW THE DEFINED EXCEPTION 'InvalidBookException'.
            if ((bookId.charAt(0) == 'B') && (bookId.length() == 4))
            {
                this.bookId = bookId;
            }
            else
            {
                throw new InvalidBookException("BOOK ID MUST START WITH 'B' AND LENGTH MUST BE '4'....");
            }

            //  IF-ELSE STATEMENT -- 2.
            //  IF-ELSE STATEMENT FOR THE PRICE.
            //  IF PRICE SATISFY THE IF STATEMENT IT IS THEN GOOD TO GO.
            //  OTHERWISE, THROW THE DEFINED EXCEPTION 'InvalidBookException'.
            if (price > 0.00f)
            {
                this.price = price;
            }
            else
            {
                throw new InvalidBookException("PRICE CAN NOT BE NEGATIVE");
            }

            //  IF-ELSE-IF STATEMENT -- 3.
            //  IF-ELSE-IF STATEMENT FOR THE CATEGORY.
            //  IF CATEGORY SATISFY THIS STATEMENTS IT IS THEN GOOD TO GO.
            //  OTHERWISE, THROW THE DEFINED EXCEPTION 'InvalidBookException'.
            if (category.equals("Science"))
            {
                this.category = category;
            } else if (category.equals("Friction"))
            {
                this.category = category;
            } else if (category.equals("Technology"))
            {
                this.category = category;
            } else if (category.equals("Other"))
            {
                this.category = category;
            }else
            {
                throw new InvalidBookException("CATEGORY MUST BE 'Science' or 'Friction' or 'Technology' or 'Other'");
            }

            this.title = title;
            this.author = author;

        //  CATCH BLOCH TO HANDLE THROWN EXCEPTION...
        } catch (InvalidBookException e)
        {
            throw new RuntimeException(e);
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
