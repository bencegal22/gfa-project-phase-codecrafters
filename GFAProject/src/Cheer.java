public class Cheer {
    private String language = "Java";
    private String teamName= "CodeCrafters";
    public void cheer(String parameter){
        //System.out.println(language + " " + teamName);
        System.out.println("Cheer for " + parameter);
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
