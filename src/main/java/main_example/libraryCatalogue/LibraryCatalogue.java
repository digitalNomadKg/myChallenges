package main_example.libraryCatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();

    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.050;
    double feePerLateDay = 1.00;

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

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public int getCurrentDay() {
        return this.currentDay;
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

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

//    public void checkOutBook(String title) {
//        Book book = getBook(title);
//        if (book.getDayCheckedOut()) {
//            sorryBookAlreadyCheckedOut(book);
//        } else {
//            book.setCheckedOut(true, currentDay);
//            System.out.println("You just checked out " + title + ". It is a due on day" +
//                    (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
//        }
//
//    }
//
//    public void returnBook(String title) {
//        Book book =getBook(title);
//        int daysLate = currentDay-(book.getDayCheckedOut()+ getLengthOfCheckoutPeriod());
//
//    }

    public void sorryBookAlreadyCheckedOut(Book book) {

    }


    public static void main(String[] args) {

    }

}
