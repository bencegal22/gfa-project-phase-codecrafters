public class HoroscopeAntonin {

    private String horoscope = "Rat";
    private String month = "december";

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public void future (String horoscope, String month) {
        System.out.println("Your future looks like " + horoscope);
        System.out.println(month);
    }
}
