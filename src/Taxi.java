public class Taxi extends Car{
    double fareCollected = 0;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }
    public void printTaxi(){
        System.out.println("License: " + getLicensePlate() + ", Toll Fee: " + getTollFee() + ", Passengers: " + getPassengers() + ", Is Electric: " + isElectric() + ", Discount Applied: " + isDiscountApplied() + ", Total Fare: " + fareCollected);
    }


}
