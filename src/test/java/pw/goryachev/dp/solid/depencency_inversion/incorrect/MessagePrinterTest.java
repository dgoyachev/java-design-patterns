package pw.goryachev.dp.solid.depencency_inversion.incorrect;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pw.goryachev.dp.solid.depencency_inversion.incorrect.Message;
import pw.goryachev.dp.solid.depencency_inversion.incorrect.MessagePrinter;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MessagePrinterTest {

    @Test
    void testIncorrectRealization() throws IOException {
        Message msg = new Message("This is a message again");
        MessagePrinter printer = new MessagePrinter();
        printer.writeMessage(msg, "test_msg.txt");
    }
}