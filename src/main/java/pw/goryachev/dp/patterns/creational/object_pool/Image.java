package pw.goryachev.dp.patterns.creational.object_pool;

import java.awt.geom.Point2D;

/**
 * Created by morgan on 27.06.2020
 */

public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}