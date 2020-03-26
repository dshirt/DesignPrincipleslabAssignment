/*John Lawless
* g00351835@gmit.ie
*
* This class was created as a parent class for all types of Subscriber
* It is an abstract class and contains an abstract method which must be overridden
* and defined in any class that extends this class
* An object cannot be creates directly from this abstract class
* All common variables and methods are contained in this class*/



package ie.gmit.open;

public abstract class Subscriber {

    private Long subscriberId;

    private String address;

    private Long phoneNumber;

    private int baseRate;



    public Subscriber(Long subscriberId, String address, Long phoneNumber, int baseRate) {
        this.subscriberId = subscriberId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.baseRate = baseRate;
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
    //This class is declared but not defined here
    //It must be defined and implemented in any
    //class that extends Subscriber
   public abstract double calculateBill ();
}
