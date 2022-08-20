package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if(year <= 0 || month <= 0 || month > 12){
            System.out.println("invalid date");
        }else {
            boolean isLeap = isLeapYear(year);
            System.out.println(daysInMonth(isLeap,month));
        }
    }

    private int daysInMonth(boolean isLeap, int month){
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12 :
                return 31;
            case 4, 6, 9, 11:
                return 30;
            default:
                return isLeap ? 29 : 28;
        }
    }

    private boolean isLeapYear(int year){
        switch (year%4){
            case 0:
                switch (year%100){
                    case 0:
                        switch (year%400){
                            case 0:
                                return true;
                            default:
                                return false;
                        }
                    default: return true;
                }
            default:return false;
        }
    }
}
