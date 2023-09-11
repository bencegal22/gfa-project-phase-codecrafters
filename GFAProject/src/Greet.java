public class Greet {
    private String greeting = "Greetings!";
    public void greet(String greeting) {
        System.out.println(greeting);
    }

    public String getgreeting() {
        return greeting;
    }

    public void setgreeting(String greeting) {
        this.greeting = greeting;
    }
}
