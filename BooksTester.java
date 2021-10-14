/**
 * Tests the book class.
 *
 * @author Sahar Maleki
 * @version 9/20/21
 */

import java.util.Scanner;

public class BooksTester
{
    
    public static void main (String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        Invoice myList = new Invoice();
        
        // prompts user for the number of books they are currently reading
        System.out.print("How many books are on your list? ");
        int bookCount = kbd.nextInt();
        String dummy = kbd.nextLine();
        
        //prompts user for the information listed within the loop for all books within their list of books being currently read (stored in bookCount)
        for (int i = 0; i < bookCount; i++)
            {
                // asks user for the title of their book
                System.out.print("Book title:");
                String bookTitle = kbd.nextLine();
            
                // asks user for the page number they are currently on
                System.out.print("Your current page number:");
                int currentPage = kbd.nextInt();
            
                // asks user for the total number of pages in their book
                System.out.print("Total number of pages:");
                int pageCount = kbd.nextInt();
                String dummyY = kbd.nextLine();
            
                // prints out & stores the information given by the user to use in the statement regarding the amount of their book they have finished
                Books item1 = new Books(bookTitle, currentPage, pageCount);
                
                System.out.println(item1);
                
                // prompts user for their new page number and resets the currentPage parameter to be equal to that new v
                    //System.out.print("Now what page are you on?: ");
                    //int newPage = kbd.nextInt();
                    //item1.setCurrentPage(newPage);
            
                myList.addItem (item1);
        }
        myList.printInvoice();  
        kbd.close();
    }
}
