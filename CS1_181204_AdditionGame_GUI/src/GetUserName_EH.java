import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GetUserName_EH extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btAdd = new Button("Add Name");
		Button btExit = new Button("Exit");
		hBox.getChildren().add(btAdd);
		hBox.getChildren().add(btExit);

		// Place nodes in the pane
		pane.add(new Label("First Name:"), 0, 0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("MI:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		
		pane.add(hBox, 1, 3);
		
		AddHandlerClass handler1 = new AddHandlerClass();
		btAdd.setOnAction(handler1);
		
		ExitHandlerClass handler2 = new ExitHandlerClass();
		btExit.setOnAction(handler2);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,300,200);
		primaryStage.setTitle("ShowGridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}


class AddHandlerClass implements EventHandler <ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("AddName Button Clicked");
	}
}

class ExitHandlerClass implements EventHandler <ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Exit Button Clicked");
	}
}