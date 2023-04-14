
import java.util.Date;


public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hi, " + name + ". It is very lovely to meet you!";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Today's date is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        
        if (conversation.indexOf("Alexis") > -1) {
            return conversation;
        }

        if (conversation.indexOf("Alfred") > -1) {
            return conversation;
        }

        return conversation;
    }
    
}

