import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
	Button btn = new Button();
        Button btn2 = new Button();
        btn.setText("Diga 'Ola'");
        btn2.setText("Diga 'Ola' 2!");
        btn.setLayoutY(100);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Ola!");
            }
        });
        
        HBox root = new HBox();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        
        Scene scene = new Scene(root, 150, 25);
        
        primaryStage.setTitle("Ola!");
        primaryStage.setScene(scene);
        primaryStage.show();
	//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}