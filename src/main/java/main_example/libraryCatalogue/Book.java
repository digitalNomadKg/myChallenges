package main_example.libraryCatalogue;

public class Book {

    private String title;
    private int ISBN;
    private int pageCount;
    private boolean isCheckedOut;
    private int dayCheckedOut = -1;

    public Book(String title, int ISBN, int pageCount, boolean isCheckedOut, int dayCheckedOut) {
        this.title = title;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
        this.isCheckedOut = isCheckedOut;
        this.dayCheckedOut = dayCheckedOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, int currentDay) {
        isCheckedOut = checkedOut;
    }

//    public boolean getDayCheckedOut() {
//        return dayCheckedOut;
//    }

    public void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}
