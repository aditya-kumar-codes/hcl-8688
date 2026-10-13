package Assignments.Assesment2_HCL_coreJAVA.Model;

public interface Borrowable {
    boolean isAvailable();
    void borrow();
    void giveBack();
}
