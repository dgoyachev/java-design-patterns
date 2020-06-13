package pw.goryachev.dp.solid.interface_segregation.correct.entity;

import java.time.LocalDateTime;

/**
 * Created by morgan on 13.06.2020
 */

public class Order extends Entity {

    private LocalDateTime orderPlacedOn;

    private double totalValue;

    public LocalDateTime getOrderPlacedOn() {
        return orderPlacedOn;
    }

    public void setOrderPlacedOn(LocalDateTime orderPlacedOn) {
        this.orderPlacedOn = orderPlacedOn;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
