public class Airpiane extends  Tehnica{


    public Airpiane(String marka,int yearofmode, String color, int price) {
        super(marka, yearofmode, color, price);
    }

    public void car(){
        System.out.println(" Available");
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
        return "Airpiane: "+super.toString();
    }
}
