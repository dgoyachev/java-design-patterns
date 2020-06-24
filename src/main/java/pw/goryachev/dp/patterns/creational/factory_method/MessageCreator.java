package pw.goryachev.dp.patterns.creational.factory_method;

/**
 * Created by morgan on 24.06.2020
 */

import pw.goryachev.dp.patterns.creational.factory_method.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory method
    protected abstract Message createMessage();
}