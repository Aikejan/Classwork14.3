public class Main {
    public static void main(String[] args) {
        Airpiane airpiane = new Airpiane("X7",1980,"Silver",287465);
        BMW bmw = new BMW("Samurai",2015,"White",200000);
        Havrvester havrvester = new Havrvester("Tucano",1977, " Red",10000);
        Motorbike motorbike = new Motorbike("Agusta",2002, " Black",5000);
        System.out.println(airpiane);
        airpiane.start();
        airpiane.car();
        System.out.println(bmw);
        bmw.different();
        System.out.println(havrvester);
        havrvester.year();
        System.out.println(motorbike);
        motorbike.name();

    }
}