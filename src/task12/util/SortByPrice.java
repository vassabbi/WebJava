package task12.util;

import java.util.Comparator;

public class SortByPrice implements Comparator<Book> {
	@Override
	public int compare(Book book1, Book book2) {
		return Integer.compare(book1.getPrice(), book2.getPrice());
	}
}