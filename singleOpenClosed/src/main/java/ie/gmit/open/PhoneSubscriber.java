/*John Lawless
 * g00351835@gmit.ie
 *
 * this class extends the subscriber class and implements
 * and defines the calculateBill method as it pertains to
 * an Phone Subscriber
 * */

package ie.gmit.open;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

     //PhoneSubscriber has no variables outside of those inherited from Subscriber
    public PhoneSubscriber(Long subscriberId, String address, Long phoneNumber, int baseRate) {
        super(subscriberId, address, phoneNumber, baseRate);
    }

    //calculateBill() is defined here for the PhoneSubscriber class
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(getSubscriberId());
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*getBaseRate()/100;
    }

}