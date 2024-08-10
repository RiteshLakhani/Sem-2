class Book 
{
    private String authorName;
    
    public Book(String authorName)
    {
        this.authorName = authorName;
    }
    
    public void displayPublication() 
    {
        System.out.println("Author Name: " + authorName);
    }
}

class BookPublication extends Book 
{
    private String title;
    
    public BookPublication(String authorName, String title) 
    {
        super(authorName);
        this.title = title;
    }
    
    public void displayPublication() 
    {
        System.out.println("Book Publication:");
        super.displayPublication();
        System.out.println("Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;
    
    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }
    
    public void displayPublication() {
        System.out.println("Paper Publication:");
        super.displayPublication();
        System.out.println("Title: " + title);
    }
}

public class Main
 {
    public static void main(String[] args)
     {
      
        try 
        {
            Book publication ; //Reference of obj;   

       
        String authorName = args[0];
        String publicationType = args[1];
        String title = args[2];
        
        //Usage of DMD;
    
            if(publicationType.equals("book")) 
            {
                publication = new BookPublication(authorName, title); //DMD usge. Book publication = new BookPublication(authorName, title);
            }
            else 
            {
                publication = new PaperPublication(authorName, title); // Book publication = new PaperPublication(authorName, title);
            }
            publication.displayPublication();
        }
        catch(Exception e)
        {
            System.out.println("Invalid Input");
        }
        
    }
}
