package Assignments.Assesment2_HCL_coreJAVA.Model;


public class LibraryItem {
    public static boolean id=1001;
    private int year;
    private boolean Available;
    private String title;

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return Available;
    }

    public int getYear() {
        return year;
    }
//    public LibraryItem(String title, int year, boolean available) {
//        this.title = title;
//        this.year = year;
//        Available = available;
//    }

    public LibraryItem(int id, String title, int year, boolean Available) {
        this.title = title;

        this.year = year;
        try{
            if(year < 1900 || year > 2026){
                throw new IllegalArgumentException("Year should be between 1900 and 2024");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        this.Available = Available;
        id++;
    }
    abstract double LateFee(int daysLate);

}
