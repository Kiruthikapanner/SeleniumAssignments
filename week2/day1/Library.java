package week2.day1;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		
		Library libraryManagement = new Library();
		String returnBook = libraryManagement.addBook("Selenium Webdriver");
		libraryManagement.issueBook();
		System.out.println("Book Title: "+returnBook);
	}

}
