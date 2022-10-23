import java.util.ArrayList;
import java.util.Arrays;


public class Run {


    public static void main(String[] args) {

        Country usa = new Country("unitedStateOfAmerica",'U');
        Country fra = new Country("france",'F');
        Country ger = new Country("germany",'G');
        Country kra = new Country("korea",'K');
        Country jpn = new Country("japan",'J');

        Market market1 = new Market("market1",Arrays.asList(usa,fra,jpn));
        Market market2 = new Market("market2",Arrays.asList(ger,kra,fra));
        Market market3 = new Market("market3",Arrays.asList(usa,jpn,kra));
        Market market4 = new Market("market4",Arrays.asList(fra,usa,ger));
        Market market5 = new Market("market5",Arrays.asList(kra,ger,jpn));

        Dimension dimension1 = new Dimension(1400,1820,300);
        Dimension dimension2 = new Dimension(1450,1870,400);
        Dimension dimension3 = new Dimension(1500,1930,500);
        Dimension dimension4 = new Dimension(1530,1970,480);
        Dimension dimension5 = new Dimension(1550,1950,450);
        Dimension dimension6 = new Dimension(1600,1920,600);
        Dimension dimension7 = new Dimension(1650,1850,350);
        Dimension dimension8 = new Dimension(1700,1920,550);
        Dimension dimension9 = new Dimension(1750,1870,350);
        Dimension dimension10 =new Dimension(1800,1900,370);

        ArrayList<Dimension> dimensionList1 = new ArrayList<>();
        dimensionList1.add(dimension1);
        dimensionList1.add(dimension2);
        dimensionList1.add(dimension3);
        ArrayList<Dimension> dimensionList2 = new ArrayList<>();
        dimensionList2.add(dimension4);
        dimensionList2.add(dimension5);
        dimensionList2.add(dimension6);
        ArrayList<Dimension> dimensionList3 = new ArrayList<>();
        dimensionList3.add(dimension7);
        dimensionList3.add(dimension8);
        dimensionList3.add(dimension9);
        ArrayList<Dimension> dimensionList4 = new ArrayList<>();
        dimensionList4.add(dimension10);
        dimensionList4.add(dimension1);
        dimensionList4.add(dimension2);
        ArrayList<Dimension> dimensionList5 = new ArrayList<>();
        dimensionList5.add(dimension5);
        dimensionList5.add(dimension8);
        dimensionList5.add(dimension3);

        Producent Toyota1 = new Producent("Toyota","Corolla");
        Producent Toyota2 = new Producent("Toyota","Prius");
        Producent Dodge3 = new Producent("Dodge","Caravan");
        Producent BMW4 = new Producent("BMW","X5");
        Producent BMW5 = new Producent("BMW","X6");
        Producent BMW6 = new Producent("BMW","5");
        Producent BMW7 = new Producent("BMW","3");
        Producent Peugeot8 = new Producent("Peugeot","405");
        Producent Peugeot9 = new Producent("Peugeot","407");
        Producent Peugeot10 = new Producent("Porsche","Panamera");

        Car car1 = new Car(Peugeot10,true,market1,"standart",dimensionList1);
        Car car2 = new Car(Peugeot10,false,market2,"premiun",dimensionList2);
        Car car3 = new Car(Peugeot9,true,market3,"econom",dimensionList3);
        Car car4 = new Car(Toyota1,false,market4,"standart",dimensionList4);
        Car car5 = new Car(Toyota2,true,market5,"premiun",dimensionList5);
        Car car6 = new Car(BMW6,true,market2,"econom",dimensionList2);
        Car car7 = new Car(Dodge3,true,market3,"standart",dimensionList3);
        Car car8 = new Car(BMW4,true,market4,"standart",dimensionList4);
        Car car9 = new Car(Toyota1,true,market5,"premiun",dimensionList5);
        Car car10 = new Car(BMW7,false,market3,"econom",dimensionList4);
        Car car11 = new Car(Toyota2,true,market4,"standart",dimensionList3);
        Car car12 = new Car(BMW5,false,market5,"standart",dimensionList5);
        Car car13 = new Car(Peugeot8,true,market2,"econom",dimensionList1);
        Car car14 = new Car(BMW4,false,market1,"standart",dimensionList2);
        Car car15 = new Car(Peugeot9,true,market1,"premiun",dimensionList1);

        ArrayList <Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        cars.add(car11);
        cars.add(car12);
        cars.add(car13);
        cars.add(car14);
        cars.add(car15);


        Car.searchAuto(cars);

            //System.out.println(dimension2.high);

        }

    }



