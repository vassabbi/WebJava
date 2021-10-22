package task12.util;

import java.util.Comparator;

public class SortByAuthorThenTitleThenPrice implements Comparator<Book> {
	@Override
	public int compare(Book book1, Book book2) {
		Comparator<Book> cmp = new SortByAuthor().thenComparing(new SortByTitle()).thenComparing(new SortByPrice());
		return cmp.compare(book1, book2);
	}
}
