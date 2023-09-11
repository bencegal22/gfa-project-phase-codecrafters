public class Cheer {
    private String language = "Java";
    public void cheer(){
        System.out.println(language);
    }

    public String getTeamName() {
        return language;
    }

    public void setTeamName(String language) {
        this.language = language;
    }
}
