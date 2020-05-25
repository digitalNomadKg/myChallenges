package main_example.libraryCatalogue;

public class Book {

    String title;
    int ISBN;
    int pageCount;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    public Book(String customTitle, int customISBN, int customPageCount, boolean customIsCheckedOut, int customDayCheckedOut) {
        this.title = customTitle;
        this.ISBN = customISBN;
        this.pageCount = customPageCount;
        this.isCheckedOut = customIsCheckedOut;
        this.dayCheckedOut = customDayCheckedOut;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setIsCheckedOut(boolean checkedOut, int currentDay) {
        isCheckedOut = checkedOut;
    }

    public void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }


}
