package pw.goryachev.dp.patterns.creational.object_pool;

import java.awt.geom.Point2D;

/**
 * Created by morgan on 27.06.2020
 */

//concrete reusable
public class Bitmap implements Image {

    private Point2D location;

    private final String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+name+" @ "+location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap is reset");
    }
}