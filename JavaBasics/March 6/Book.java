public class Book 
{
    String title;
    String author;
    double price;

    Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price ;
    }

    Book(Book other)
    {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;

    }

    void displayDetails()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) 
    {
        Book originalbook = new Book("Java Programming", "James Gosling", 30.5);
        System.out.println("Original Book Details: ");
        originalbook.displayDetails();

        Book copiedbook = new Book(originalbook);
        System.out.println("\n copied book details: ");
        copiedbook.displayDetails();
    }

    
}
