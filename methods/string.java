package methods;

public class string {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);

        String personalised = myGreet("harsh parmar");
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String message = "hello " + name;
        return message;
    }
    
    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
