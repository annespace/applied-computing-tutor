import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Anne Cho
 */

public class App extends Application{

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button1 = new Button("LEFT");
        Button button2 = new Button("RIGHT");
        HBox buttons = new HBox(20, button1, button2);
        buttons.setAlignment(Pos.CENTER);

        TextField textField = new TextField(" click the buttons ");
        TextField textField2 = new TextField("");

        textField.setAlignment(Pos.CENTER);
        textField2.setAlignment(Pos.CENTER);

        VBox textFields = new VBox(20, textField, textField2);
        textFields.setPadding(new Insets(0, 50, 0, 50));
        textFields.setAlignment(Pos.CENTER);


        VBox layout = new VBox(20, buttons, textFields);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        button1.setOnAction(e -> textField.setText("LEFT clicked"));
        button2.setOnAction(e -> textField.setText("RIGHT clicked"));

        textField2.textProperty().bind(textField.textProperty());


    }

}
