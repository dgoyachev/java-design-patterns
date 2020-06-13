package pw.goryachev.dp.solid.depencency_inversion.correct;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintWriter;

class MessagePrinterTest {

    @Test
    void testCorrectRealization() throws IOException {
        Message msg = new Message("This is a message again");
        MessagePrinter printer = new MessagePrinter();
        try(PrintWriter writer = new PrintWriter(System.out)) {
            printer.writeMessage(msg, new JSONFormatter(), writer);
        }
    }
}