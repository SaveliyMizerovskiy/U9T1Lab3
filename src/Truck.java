public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }
  // Truck's license plate, toll fee, number of passengers, number of axles,and whether it has a trailer.

  public void printTruck(){
    System.out.println("License: " + getLicensePlate() + ", Toll Fee: " + getTollFee() + ", Passengers: " + getPassengers() + ", Axles: " + axles + ", Has Trailer: " + hasTrailer);
  }

  public boolean validateLicensePlate() {
    if (hasTrailer) {
      if (axles > 4) {
        if (getLicensePlate().indexOf("MX") > 0) {
          return true;
        } else {
          return false;
        }
      } else if (axles <= 4) {
        if (getLicensePlate().indexOf("LX") > 0) {
          return true;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}