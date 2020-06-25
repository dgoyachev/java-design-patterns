package pw.goryachev.dp.patterns.creational.prototype;

/**
 * Created by morgan on 26.06.2020
 */

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Swordsman "+state+" @ " + getPosition();
    }

    @Override
    protected void reset() {
        state = "idle";
    }
}