import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Anne Cho
 */

public class MyButtonEventHandler implements EventHandler {

    @Override
    public void handle(Event event) {
        System.out.println(event.getEventType());
    }

}
