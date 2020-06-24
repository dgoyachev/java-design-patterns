package pw.goryachev.dp.patterns.creational.factory_method;

/**
 * Created by morgan on 24.06.2020
 */

import pw.goryachev.dp.patterns.creational.factory_method.message.Message;
import pw.goryachev.dp.patterns.creational.factory_method.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
