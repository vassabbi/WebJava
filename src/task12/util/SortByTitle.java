package task12.util;

import java.util.Comparator;

public class SortByTitle implements Comparator<Book> {
	@Override
	public int compare(Book book1, Book book2) {
		return book1.getTitle().compareTo(book2.getTitle());
	}
}