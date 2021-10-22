package task12.util;

import java.util.Comparator;

public class SortByAuthorThenTitle implements Comparator<Book>{
	@Override
	public int compare(Book book1, Book book2) {
		Comparator<Book> cmp = new SortByAuthor().thenComparing(new SortByTitle());
		return cmp.compare(book1, book2);
	}
}
