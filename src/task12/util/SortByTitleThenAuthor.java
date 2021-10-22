package task12.util;

import java.util.Comparator;

public class SortByTitleThenAuthor implements Comparator<Book>{
	@Override
	public int compare(Book book1, Book book2) {
		Comparator<Book> cmp = new SortByTitle().thenComparing(new SortByAuthor());
		return cmp.compare(book1, book2);
	}
}
