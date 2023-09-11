public class Greet {
    private String greeting = "Greetings";
    private String name = "Gergely!";
    public void greet(String greeting, String name) {
        System.out.println(greeting + " " + name);
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
