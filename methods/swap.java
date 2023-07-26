package methods;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap number code
        // int temp = a;
        // a=b;
        // b=temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "harsh parmar";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "ram jain";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
