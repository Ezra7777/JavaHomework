package day11.homework;


import java.util.Scanner;

// done , homework
public class SwitchStatementHomework1 {

//    Write a code that displays the name of the day
//    it declares an int named day whose value represents a day(1-7).
//    The code displays the name of the day, based on the value of the day, using the switch statement.
//

//Input 5
//    Output:
//    Friday
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.print("Input number: ");
    int day = in.nextInt();

    System.out.println(getDayName(day));
}

    // Get the name for the Week
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;
    }
}


