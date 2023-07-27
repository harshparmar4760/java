package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // systax
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(67);
        // list.add(672);
        // list.add(647);
        // list.add(667);
        // list.add(667);
        // list.add(676);
        // list.add(678);
        // list.add(687);
        // list.add(967);

        // System.out.println(list);
        // list.set(0, 690);

        // list.remove(2);

        // System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
           list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
            
        }
        // System.out.println(list);
    }
}
