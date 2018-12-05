import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
// import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GetUserName_EH extends Application {
	private TextField FirstName = new TextField();
	private TextField MiddleName = new TextField();
	private TextField LastName = new TextField();
	private TextField YourName = new TextField();
	@Override
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		// Place nodes in the pane
		pane.add(new Label("First Name:"), 0, 0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("Middle Name:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		pane.add(new Label("Your Name is:"), 0, 3);
		pane.add(new TextField(), 1, 3);
		
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(20);
		hBox.setAlignment(Pos.CENTER);
		Button btAddName = new Button("Add Name");
		Button btExit = new Button("Exit");
		hBox.getChildren().add(btAddName);
		hBox.getChildren().add(btExit);

		btAddName.setOnAction(new AddNameHandlerClass());
		btExit.setOnAction(new ExitHandlerClass());
		/** SAME
		AddNameHandlerClass AddNameHandler = new AddNameHandlerClass();
		btAddName.setOnAction(AddNameHandler);
		ExitHandlerClass ExitHandler = new ExitHandlerClass();
		btExit.setOnAction(ExitHandler);
		*/

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 300, 200);
		primaryStage.setTitle("Get User Name"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}


class AddNameHandlerClass implements EventHandler <ActionEvent> {
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