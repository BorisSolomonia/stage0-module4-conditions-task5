package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days is 31");
                break;
            case 2:
                System.out.println("Number of days is 28");
                break;
            default:
                System.out.println("Number of days is 30");              

        }
    }
}
