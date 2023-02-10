public class Motorbike extends Tehnica{


    public Motorbike(String marka, int  yearofmode, String color, int price) {
        super(marka, yearofmode, color, price);
    }

    public  void name(){
        System.out.println(" Best brand");
    }


    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public String toString() {
        return "Motorbike: "+super.toString();
    }
}











