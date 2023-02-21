package Classes_Example_By_Building_Simple_Library;

public class LibraryMember {
    private String name;
    private String libraryCardNumber;

    public LibraryMember(String name, String libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getName() {
        return name;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrowBook();
            System.out.println(name + " has borrowed " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is already borrowed.");
        }
    }
}
