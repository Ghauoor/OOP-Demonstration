package Classes_Example_By_Building_Simple_Library;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0446310789");

        LibraryMember member1 = new LibraryMember("Ghayoor Hussain", "12345");
        LibraryMember member2 = new LibraryMember("Naruto", "67890");

        member1.borrowBook(book1);
        member2.borrowBook(book2);
        member1.borrowBook(book2);
    }
}
