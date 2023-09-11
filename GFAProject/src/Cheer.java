public class Cheer {
    private String language = "Java";
    private String teamName= "CodeCrafters";
    public void cheer(){
        System.out.println(language + " " + teamName);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
