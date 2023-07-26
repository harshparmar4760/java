package methods;

public class scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Harsh";
        {
            // int a = 78; // already initialised outside the block in the same method, hence you cannot initialise again.
            a = 99;
            System.out.println(a);
            int c = 30;
            name = "ram";
            System.out.println(name);
            // value initialised in this block , will remain in block
        }
        System.out.println(a);
        System.out.println(name);

        // System.out.println(c); //cannot use outside the block


        // Scoping in for loop
        for (int i = 0; i < 4; i++) {
            System.out.print(i);
        }
    }

    static void random(int marks) {
        int num = 65;
        System.out.println(num);
        System.out.println(marks);
    }
}
