package pack1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailExtractor {

	public static void main(String[] args) {
		 String text = "Hey, there how are you? this is my email id abc345@gmail.com";
	        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");

	        Matcher matcher = pattern.matcher(text);
	        while (matcher.find()) {
	            System.out.println("Email found: " + matcher.group());
	        }
	    }
	}

