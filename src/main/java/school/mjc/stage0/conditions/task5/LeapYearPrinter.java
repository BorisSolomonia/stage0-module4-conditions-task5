package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int e = year%400;
        switch (e){
            case 0:
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
        }
    }
}
