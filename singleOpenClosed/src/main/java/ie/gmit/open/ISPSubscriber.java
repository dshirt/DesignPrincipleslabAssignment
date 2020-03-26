/*John Lawless
 * g00351835@gmit.ie
 *
 * this class extends the subscriber class and implements
 * and defines the calculateBill method as it pertains to
 * an ISP Subscriber
 * */

package ie.gmit.open;

import java.util.List;
//look into Abstract methods
public class ISPSubscriber extends Subscriber {
    //This variable is not common to all
    private long freeUsage;

    //all common variables come from the super class
    public ISPSubscriber(Long subscriberId, String address, Long phoneNumber, int baseRate, long freeUsage) {
        super(subscriberId, address, phoneNumber, baseRate);
        this.freeUsage = freeUsage;
    }

    /**
     * @return the freeUsage
     */
    public long getFreeUsage() {
        return freeUsage;
    }

    /**
     * @param freeUsage the freeUsage to set
     */
    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    //calculateBill() is defined here for the ISPSubscriber class
    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(getSubscriberId());
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*getBaseRate()/100;
    }
}