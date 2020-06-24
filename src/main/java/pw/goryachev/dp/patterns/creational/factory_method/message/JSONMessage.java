package pw.goryachev.dp.patterns.creational.factory_method.message;

/**
 * Created by morgan on 24.06.2020
 */

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}