class Book
{
	private String authorname;

	public Book(String authorname)
	{
		this.authorname = authorname;
	}

	public void displayPublication()
	{
		System.out.println("Author Name:"+authorname);
	}

}

class book_Publication extends Book
{
	private String title;

	public book_Publication(String authorname , String title)
	{
		super(authorname);
		this.title = title;
	}

	public void displayPublication()
	{
		System.out.println("Book Publication");
		super.displayPublication();
		System.out.println("Title = "+title);
	}
}

class paper_Publication extends Book
{
	private String title;

	public paper_Publication(String authorname , String title)
	{
		super(authorname);
		this.title = title;
	}

	public void displayPublication()
	{
		System.out.println("Paper Publication");
		super.displayPublication();
		System.out.println("Title = "+title);
	}
}

public class Demo11
{
	public static void main(String[] args) {
		
		try
		{
			Book b1;

			String authorname = args[0];
			String publicationType = args[1];
			String title = args[2];

			if(publicationType.equals("book"))
			{
				b1 = new book_Publication(authorname,title);
			}
			else
			{
				b1 = new paper_Publication(authorname,title);
			}

			b1.displayPublication();
		}catch(Exception e)
		{
			System.out.println("Invalid Output");
		}
	}
}









