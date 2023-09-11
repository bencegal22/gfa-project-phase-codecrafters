
public class Horoscope {

    private String horoscope = "Rat";
    private String month = "december";

    public void future (String horoscope, String month) {
        System.out.println("Your future looks like parameter " + horoscope + " " + month);
    }

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

}
