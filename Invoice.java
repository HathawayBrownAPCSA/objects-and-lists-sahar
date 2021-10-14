/**
 * Makes a list of books being read
 *
 * @author APCSA @ HB//Sahar Maleki
 * @version 9/23/21->9/24/21
 */

import java.util.ArrayList;

public class Invoice
{
    ArrayList<Books> bookList;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice()
    {
        bookList = new ArrayList<Books>();
    }
    
     /** adds item i to the list of books
     * 
     * @param bookList list of books the user is currently reading
     */
    public void addItem(Books i)
    {
        bookList.add(i);
    }
    
    /** prints the "invoice"/booklist to show user how many books are in their list & the total number of pages in them all
     * 
     * @param bookList list of books the user is currently reading
     * @param getTotal total number of pages of all of the books the user is currently reading 
     * @return nunmber of books in the list and total number of pages
     */
    public void printInvoice()
    {
        System.out.println ("\n");
            
        for (Books item : bookList)
        {
            System.out.println(item);
        }
        
        System.out.println("\n" + bookList.size() + " books are in your list.");
        System.out.println("The total number of pages you will have read after finishing all of these books is: " + getTotal());
    }
    
    /** gets the total number of pages in all the books the user is currently reading
     * 
     * @param bookList list of books the user is currently reading
     * @param getTotal gets the total number of pages of all of the books the user is currently reading
     * @param totalPages represents the actual total number of pages in all the users current books
     * @return total number of pages in the users current books
     */
    public int getTotal()
    {
        int totalPages = 0;
        
        for (Books item : bookList)
        {
            totalPages += item.getPageCount();
        }
        
        return totalPages;
    }
}
