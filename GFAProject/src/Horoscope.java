
public class Horoscope {

    private String horoscope = "Rat";
    private String month = "december";

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public void future (String horoscope, String month) {
        System.out.println(horoscope);
        System.out.println(month);
    }


}
