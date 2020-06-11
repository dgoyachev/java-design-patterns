package pw.goryachev.dp.solid.open_close.corrrect;

import pw.goryachev.dp.solid.open_close.InternetSessionHistory;

import java.util.List;

/**
 * Created by morgan on 11.06.2020
 */

public class ISPSubscriber extends Subscriber {

    private long freeUsage;

    //only for demonstration
    @Override
    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;

        if(chargeableData <= 0) {
            return 0;
        }
        return ((double) chargeableData) * baseRate / 100;
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
}