package Switch;

import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // if (fruit.equals("mango")){
            // System.out.println("King of Fruit");
            // }
        // else if (fruit.equals("Apple")){
            // System.out.println("a red color of Fruit");
        // }
                
        // String fruit = in.next();
        // switch (fruit) {
        //     case "mango":
        //         System.out.println("king for fruit");
        //         break;
        //     case "apple":
        //         System.out.println("red color fruit");
        //         break;
        //     case "orange":
        //         System.out.println("orange colour fruit");
        //         break;
        //     default:
        //         System.out.println("please enter a valid fruit");
        // }

        int day = in.nextInt();
        // switch (day) {
        //     case 1 -> System.out.println("Monday");            
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        // }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");            
            case 6,7 -> System.out.println("Weekend");

        }
    }
}