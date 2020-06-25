package pw.goryachev.dp.patterns.creational.prototype;

/**
 * Created by morgan on 25.06.2020
 */

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }


    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit)super.clone();
        unit.initialize();
        return unit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();

    public GameUnit(int x, int y, int z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, int distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }
}