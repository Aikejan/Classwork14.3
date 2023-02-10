public class Tehnica {
    private  String marka;
    private int  yearofmode;
    private  String color;
    private  int price;


    public Tehnica(String marka, int yearofmode, String color, int price) {
        this.marka = marka;
        this.yearofmode = yearofmode;
        this.color = color;
        this.price = price;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYearofmode() {
        return yearofmode;
    }

    public void setYearofmode(int yearofmode) {
        this.yearofmode = yearofmode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public  void start(){

        System.out.println(" Jyrsyn");
    }
    public void  stop(){

        System.out.println(" Toktosun");
        }

    @Override
    public String toString() {
        return "Tehnica{" +
                "marka: " + marka + '\'' +
                " yearofmode: " + yearofmode +
                " color: " + color + '\'' +
                " price: " + price+'\''+'}';

    }
}

