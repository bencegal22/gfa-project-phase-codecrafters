public class Greet {
    private String name = "Gergely";
    public void greet(String name) {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
