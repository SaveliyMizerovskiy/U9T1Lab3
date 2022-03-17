public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public void printCar(){
    System.out.println("License: " + getLicensePlate() + ", Toll Fee: " + getTollFee() + ", Passengers: " + getPassengers() + ", Is Electric: " + electric + ", Discount Applied: " + discountApplied);
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut) {
    if (getPassengers() <= numOut){
      return false;
    } else {
      setPassengers(getPassengers() - numOut);
      return true;
    }
  }

  public void applyDiscount() {
    if (discountApplied != true){
      if (isElectric()){
        setTollFee(getTollFee()*0.5);
        discountApplied = true;
      }
    }
  }
}