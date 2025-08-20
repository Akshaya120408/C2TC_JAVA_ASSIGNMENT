package assignmentthree;

public class Demo {
	public static void main(String[] args) {
        // Inheritance Demo
        Book b1 = new Book(101, "Java Basics", "James Gosling");
        Magazine m1 = new Magazine(201, "Tech Today", 45);

        b1.displayInfo();
        m1.displayInfo();

        // Composition Demo
        Library library = new Library();
        library.addItem(b1);
        library.addItem(m1);

        library.showAllItems();
    }
}
