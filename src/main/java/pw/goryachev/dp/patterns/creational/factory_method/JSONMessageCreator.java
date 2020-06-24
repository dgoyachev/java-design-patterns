package pw.goryachev.dp.patterns.creational.factory_method;

/**
 * Created by morgan on 24.06.2020
 */

import pw.goryachev.dp.patterns.creational.factory_method.message.JSONMessage;
import pw.goryachev.dp.patterns.creational.factory_method.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}