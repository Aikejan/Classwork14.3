public class BMW extends Tehnica{


    public BMW(String marka, int  yearofmode, String color, int price) {
        super(marka, yearofmode, color, price);
    }




    public void different(){
        System.out.println(" Shining");
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
        return "BMW: "+ super.toString();
    }
}

