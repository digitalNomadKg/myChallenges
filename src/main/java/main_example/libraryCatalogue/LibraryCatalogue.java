package main_example.libraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();

    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.050;
    double feePerLateDay = 1.00;

    //Constructors
    public LibraryCatalogue(Map<String, Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String, Book> collection,
                            int lengthOfCheckoutPeriod, double initialLateFee, double feePerLAteDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLAteDay;
    }

    //Getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);

    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    //Setters
    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    //Instance methods:
    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is a due on day " +
                    (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $ " + (getInitialLateFee() + daysLate * getFeePerLateDay()) +
                    " because your book is " + daysLate + " days overdue.");
        } else {
            System.out.println("Book returned. Thanks");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out."
                + " It should be back on day " + (book.getDayCheckedOut()) + getLengthOfCheckoutPeriod() + ".");

    }

    public static void main(String[] args) {
        System.out.println("run:");
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harryPotter = new Book("Harry Potter", 908222, 550, true, 12);
        bookCollection.put("Harry Potter", harryPotter);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(15);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");

    }
}
