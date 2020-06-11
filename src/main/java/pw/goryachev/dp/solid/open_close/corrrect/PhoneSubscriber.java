package pw.goryachev.dp.solid.open_close.corrrect;

import pw.goryachev.dp.solid.open_close.CallHistory;

import java.util.List;

/**
 * Created by morgan on 11.06.2020
 */

public class PhoneSubscriber extends Subscriber {

    //only for demonstration - open for extension
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return ((double) totalDuration) * baseRate / 100;
    }
}