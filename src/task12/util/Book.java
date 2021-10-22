package task12.util;

public class Book implements Cloneable, Comparable<Book> {
	private String title;
	private String author;
	private int price;
	private static int edition;
	private int isbn;
	
	public Book(String title, String author, int price, int isbn) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice(){
		return price;
	}
	
	public int getEdition(){
        return Book.edition;
    }
    
    public static void setEdition(int edition){
    	Book.edition = edition;
    }
    
    @Override
    public String toString() {
    	return "Title: " + this.title + ", author: " + this.author;
    }
    
    @Override
    public int hashCode() {
    	return this.title.hashCode() + this.author.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj == null || obj.getClass() != this.getClass()) {
    		return false;
    	}
    	Book b = (Book)obj;
    	return (title != null && title.equals(b.getTitle()) && author != null && author.equals(b.getAuthor()));
    }
    
    @Override
    public Book clone(){
        return new Book(this.title, this.author, this.price, this.isbn);
    }
    
    @Override
    public int compareTo(Book book){
        return this.isbn - book.isbn;
    }
}
