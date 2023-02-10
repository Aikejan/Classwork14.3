public class Havrvester  extends Tehnica {


    public Havrvester(String marka,int yearofmode, String color, int price) {
        super(marka, yearofmode, color, price);
    }

    public void year(){
        System.out.println(" Super");
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
        return "Havrvester: "+super.toString();
    }
}
