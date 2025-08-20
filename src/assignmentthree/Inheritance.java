package assignmentthree;
//Base class Item
class Item {
 int id;
 String title;

 public Item(int id, String title) {
     this.id = id;
     this.title = title;
 }

 public void displayInfo() {
     System.out.println("ID: " + id + ", Title: " + title);
 }
}

//Subclass Book (is-a Item)
class Book extends Item {
 String author;

 public Book(int id, String title, String author) {
     super(id, title);
     this.author = author;
 }

 @Override
 public void displayInfo() {
     System.out.println("Book: [ID: " + id + ", Title: " + title + ", Author: " + author + "]");
 }
}

//Subclass Magazine (is-a Item)
class Magazine extends Item {
 int issueNumber;

 public Magazine(int id, String title, int issueNumber) {
     super(id, title);
     this.issueNumber = issueNumber;
 }

 @Override
 public void displayInfo() {
     System.out.println("Magazine: [ID: " + id + ", Title: " + title + ", Issue: " + issueNumber + "]");
 }
}

public class Inheritance {

}
