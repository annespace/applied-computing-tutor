import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
    /*this launch method is going to instantiate this class into an object.
    also, it calls the start method. */
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Hello World!");
        Scene scene = new Scene(button, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello Anne!!!");
        primaryStage.show();
    }

}
