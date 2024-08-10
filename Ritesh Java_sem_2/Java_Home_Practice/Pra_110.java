class Book 
{
    private String authorName;

    public  Book(String authorName) 
    {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void displayPublication() {
        // implementation of displayPublication method in Book class
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void displayPublication() {
        // implementation of displayPublication method in BookPublication class
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void displayPublication() {
        // implementation of displayPublication method in PaperPublication class
    }
}

public class Pra_110
{
    public static void main(String[] args) 
    {
        String authorName = args[0];
        String publicationType = args[1];
        String publicationTitle = args[2];

        Book publication;

        if (publicationType.equals("book")) 
        {
            publication = new BookPublication(authorName, publicationTitle);
        } 
        else 
        {
            publication = new PaperPublication(authorName, publicationTitle);
        }

        publication.displayPublication();
    }
}
