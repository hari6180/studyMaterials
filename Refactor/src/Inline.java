public class Inline {
    private String getGreeting() {
        return "Hello, World!";
    }

    public void greet() {
        System.out.println(getGreeting());  // <==
    }
}
