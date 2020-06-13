package pw.goryachev.dp.solid.depencency_inversion.incorrect;

import java.io.IOException;

//Thrown by formatter
public class FormatException extends IOException {
	
	public FormatException(Exception cause) {
		super(cause);
	}
}
