package Assignments.Assesment2_HCL_coreJAVA.Model;

public class Book extends LibraryItem {
    private String author;

    public Book(int id, String title, int year, boolean Available, String author, int pages) {
        super(id, title, year, Available);
        this.author = author;

    }

    @Override
    double LateFee(int daysLate) {
        return daysLate * 2.0;
    }
}
