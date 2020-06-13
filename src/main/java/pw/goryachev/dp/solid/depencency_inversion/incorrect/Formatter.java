package pw.goryachev.dp.solid.depencency_inversion.incorrect;

//Common interface for classes formatting Message object
public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
