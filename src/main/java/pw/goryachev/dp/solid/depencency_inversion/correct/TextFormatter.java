package pw.goryachev.dp.solid.depencency_inversion.correct;

public class TextFormatter implements Formatter{

	public String format(Message message){
		return message.getTimestamp()+":"+message.getMsg();
	}
}
