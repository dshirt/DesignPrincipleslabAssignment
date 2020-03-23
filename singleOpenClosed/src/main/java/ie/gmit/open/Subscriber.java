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

   public abstract double calculateBill ();
}
