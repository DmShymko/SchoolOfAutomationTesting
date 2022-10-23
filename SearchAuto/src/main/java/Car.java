import java.util.ArrayList;

   public class Car {

       Producent producent;
       boolean isAutomaticGear;
       Market market;
       String segment;
       ArrayList <Dimension> dimensions;

       public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
           this.producent = producent;
           this.isAutomaticGear = isAutomaticGear;
           this.market = market;
           this.segment = segment;
           this.dimensions = dimensions;
       }

       public Producent getProducent() {
           return producent;
       }

       public void setProducent(Producent producent) {
           this.producent = producent;
       }

       public boolean isAutomaticGear() {
           return isAutomaticGear;
       }

       public void setAutomaticGear(boolean automaticGear) {
           isAutomaticGear = automaticGear;
       }

       public Market getMarket() {
           return market;
       }

       public void setMarket(Market market) {
           this.market = market;
       }

       public String getSegment() {
           return segment;
       }

       public void setSegment(String segment) {
           this.segment = segment;
       }

       public ArrayList<Dimension> getDimensions() {
           return dimensions;
       }

       public void setDimensions(ArrayList<Dimension> dimensions) {
           this.dimensions = dimensions;
       }

       @Override
       public String toString() {
           return "Car{" +
                   "producent=" + producent +
                   ", isAutomaticGear=" + isAutomaticGear +
                   ", market=" + market +
                   ", segment='" + segment + '\'' +
                   ", dimensions=" + dimensions +
                   '}';
       }

       public static void searchAuto (ArrayList<Car> carArrayList){
           for (Car car : carArrayList){
               if (car.getProducent().model.equals("BMW")) {
                   if (car.isAutomaticGear==true){
                       for (Dimension dimension : car.dimensions){
                           if (dimension.tankCapacity == 480){
                               System.out.println(car.getProducent().model + " "+car.getProducent().type+ " " +
                                       car.isAutomaticGear + " " + dimension.tankCapacity+ " "
                                       +car.market.countries.get(0).countryName+" "+car.market.countries.get(0).countrySign);
                           }
                       }

                       }
                   }
               }
           }
       }



