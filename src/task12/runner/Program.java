package task12.runner;

import task12.util.Book;
import task12.util.ProgrammerBook;

public class Program {

	public static void main(String[] args) {
		Book book1 = new Book("Гарри Поттер", "Джуан Роулинг", 30, 3);
		Book book2 = new Book("Гарри Поттер", "Джуан Роулинг", 25, 4);
		ProgrammerBook book3 = new ProgrammerBook("c#", "Antuan Pop", 100, 5, "c#", 3);
		ProgrammerBook book4 = new ProgrammerBook("c#", "Antuan Pop", 110, 1, "c#", 3);
		ProgrammerBook book5 = new ProgrammerBook("c#", "Antuan Pop", 100, 5, "c#", 4);
		
		System.out.println(book1.toString());
		System.out.println(book1.equals(book2));
		System.out.println(book3.toString());
		System.out.println(book3.equals(book4));
		System.out.println(book3.equals(book5));
		
	}

}
