class Book
{
	private String authorName;

	public Book(String authorName)
	{
		this.authorName = authorName;
	}

	public void displayPublication()
	{
		System.out.println("Author Name: "+authorName);
	}
}

class BookPublication extends Book
{
	private String title;

	public BookPublication(String authorName , String title)
	{
		super(authorName);
		this.title = title;
	}

	public void displayPublication()
	{
		System.out.println("---BookPublication---");
		super.displayPublication();
		System.out.println("Title: "+title);
	}
}

class PaperPublication extends Book
{
	private String title;

	public PaperPublication(String authorName , String title)
	{
		super(authorName);
		this.title = title;
	}

	public void displayPublication()
	{
		System.out.println("---PaperPublication---");
		super.displayPublication();
		System.out.println("Title: "+title);
	}
}

public class Imp{
	public static void main(String[] args)
	{
		
		try{
			Book b1 ;

			String authorName = args[0];
			String publicationType = args[1];
			String title = args[2];

			if(publicationType.equals("book"))
			{
				b1 = new BookPublication(authorName,title);
			}
			else
			{
				b1 = new PaperPublication(authorName,title);
			}

			b1.displayPublication();
		}catch(Exception e){
			e.printStackTrace();
		}

	}	
}