public class Count {
    private int monthOfBirth = 04;
    private int yearOfBirth = 1998;
    public void count(){
        System.out.println("I born in " + monthOfBirth + " of " + yearOfBirth);
    }

    public int getMonthOfBirt() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }
}
