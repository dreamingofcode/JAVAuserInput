import java.util.Scanner;

public class ThirtyDaysFunctions {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);

        System.out.println("Which month (1-12)? ");
        int month= input.nextInt();
 
        System.out.println(monthDays(month)+ " days hath "+ monthName(month));
    }

    public static String monthName(int month) {
        String name = "error";
        if (month == 1) {
            name = "January";
        } else if (month == 2) {
            name = "February";
        } else if (month == 3) {
            name = "March";
        }
        if (month == 4) {
            name = "April";
        }
        if (month == 5) {
            name = "May";
        }
        if (month == 6) {
            name = "June";
        }
        if (month == 7) {
            name = "July";
        }
        if (month == 8) {
            name = "August";
        }
        if (month == 9) {
            name = "September";
        }
        if (month == 10) {
            name = "October";
        }
        if (month == 11) {
            name = "November";
        }
        if (month == 12) {
            name = "December";
        }
        return name;
    }
/**
 * returns the number of days
 * @param month
 * @return
 */
    public static int monthDays(int month) {
        int days;

        switch (month) {
            case 9:
            case 4:
            case 6:
            case 11:
                days = 30;
                break;
            case 2: days=28;
            break;
            default:days=31;

        }
        return days;
    }
}
