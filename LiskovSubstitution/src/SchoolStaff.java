//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class SchoolStaff {
    public SchoolStaff() {
    }

    private void makeAnnouncements() {
        System.out.println("made announcements..");
    }

    private void takeAttendence() {
        System.out.println("took attendence..");
    }

    private void collectPaperWork() { System.out.println("collected paperwork.."); }

    private void conductHallwayDuties() {
        System.out.println("conducted hallway duties..");
    }
    private void performOtherResponsibilities(){ };

    public void perform() {
        this.makeAnnouncements();
        this.takeAttendence();
        this.collectPaperWork();
        this.conductHallwayDuties();
        this.performOtherResponsibilities();
    }
}
