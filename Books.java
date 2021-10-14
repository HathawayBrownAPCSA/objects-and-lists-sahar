
/**
 * Represents a book for purchase*
 * @author Sahar Maleki
 * @version 9/20/21
 */

public class Books
{
    private String title;
    private int pageCount;
    private int currentPage;
    private double percentFinished;
    
    /** The constructor initializes values for book title, page count, and the users current page.
     * it calculates the percent of the book the user has finished reading
     * 
     * @param t The title of the book
     * @param p The total page count of the book
     * @param c The current page of the book the user is on
     */
    public Books(String t, int c, int p)
    {
        title = t;
        currentPage = c;
        pageCount = p;
        percentFinished = percentDone (c, p);
    }
        
    /** stores the users current page number
     * 
     * @param currentPage the current page the user is on of their book
     * @return currentPage the current page the user is on of their book
     */
    public int getCurrentPage()
    {
        return currentPage;
    }
    
    /** stores the total page count of the book
     * 
     * @param pageCount the total number of pages in the book
     * @return pageCount the total number of pages in the book
     */
    public int getPageCount()
    {
        return pageCount;
    }
    
    /** Updates the value of currentPage to a new value when the user has read more of their book
     * 
     * @param newPage new current page of the user
     * @param percentFinished the percent of the book the user finished (prior to the new page update)
     * @param percentDone the percent of the book the user has finished after updating their page number
     */
    public void setCurrentPage(int newPage)
    {
        currentPage = newPage; 
        percentFinished = percentDone (currentPage, pageCount);
    }
    
    /** Returns an int with the parameter formatted as a percent, to get the percent the user has already read of the book
     * 
     * @param percentDone the percent to be displayed
     * @return the percent of the book the user has finished so far (as a double)
     */
    private double percentDone(double current, double total)
    {
        double ans = (double) current / total;
        return ans * 100.0;
    }
    
    /** Returns a string & double percent value to express the % of the book that the user has finished
     * 
     * @param includes all prev. variables (percentFinished, title, currentPage, pageCount)
     * @return a statement telling the user the percent of the book they've finished, as well as the number of total pages they've read. 
     */
    public String toString()
    {
        return "You've finished" + " " + percentFinished + "% of " + title + " after reading " + currentPage + " out of " + pageCount + " total pages.";
    }
}
