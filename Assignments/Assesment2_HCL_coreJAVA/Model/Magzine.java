package Assignments.Assesment2_HCL_coreJAVA.Model;

public class Magzine extends LibraryItem {
    private int issueNumber;

    public Magzine(int id, String title, int year, boolean Available, int issueNumber) {
        super(id, title, year, Available);
        this.issueNumber = issueNumber;
    }

    @Override
    double LateFee(int daysLate) {
        return daysLate * 1.0;
    }
}
