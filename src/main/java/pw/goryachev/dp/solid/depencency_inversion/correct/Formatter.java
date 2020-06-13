package pw.goryachev.dp.solid.depencency_inversion.correct;

public interface Formatter {
	
	public String format(Message message) throws FormatException;
	
}
