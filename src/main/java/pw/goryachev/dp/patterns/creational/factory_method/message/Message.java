package pw.goryachev.dp.patterns.creational.factory_method.message;

/**
 * Created by morgan on 24.06.2020
 */

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() {
        //Adds some default headers
    }

    public void encrypt() {
        //# Has some code to encrypt the content
    }
}