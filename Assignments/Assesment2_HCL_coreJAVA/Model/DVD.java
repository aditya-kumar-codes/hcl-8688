package Assignments.Assesment2_HCL_coreJAVA.Model;

public class DVD extends LibraryItem {

    private int duration;

    public DVD(int id, String title, int year, boolean Available, int duration) {
        super(id, title, year, Available);
        this.duration = duration;
    }

    @Override
    double LateFee(int daysLate) {
        return daysLate * 5.0;
    }
}
