package pw.goryachev.dp.patterns.creational.prototype;

/**
 * Created by morgan on 25.06.2020
 */

public class Point3D {
    public static final Point3D ZERO = new Point3D(0, 0, 0);
    private final int x;
    private final int y;
    private final int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Point3D getZERO() {
        return ZERO;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Point3D normalize() {
        return this;
    }

    public Point3D multiply(int distance) {
        return new Point3D(this.x * distance, this.y * distance, this.z * distance);
    }

    public Point3D add(Point3D finalMove) {
        return new Point3D(this.x + finalMove.getX(), this.y + finalMove.getY(), this.z + finalMove.getZ());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point3D point3D = (Point3D) o;

        if (x != point3D.x) return false;
        if (y != point3D.y) return false;
        return z == point3D.z;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }
}
