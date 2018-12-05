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

public class AdditionGameGUI_EventHandler_02 extends Application {
	
	private TextField tfFirstName = new TextField();
	private TextField tfMiddleName = new TextField();
	private TextField tfLastName = new TextField();
	private TextField tfYourName = new TextField();
	
	@Override
	public void start (Stage StageGetUserName) {
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5);
		pane.setVgap(5);
		
		// Set properties for UI
		pane.setAlignment(Pos.CENTER);
		tfFirstName.setAlignment(Pos.CENTER_LEFT);
		tfMiddleName.setAlignment(Pos.CENTER_LEFT);
		tfLastName.setAlignment(Pos.CENTER_LEFT);
		tfYourName.setAlignment(Pos.CENTER_LEFT);
		tfYourName.setEditable(false);

		// Place nodes in the pane
		pane.add(new Label("First Name"), 0, 0);
		pane.add(tfFirstName, 1, 0);
		pane.add(new Label("Middle Name"), 0, 1);
		pane.add(tfMiddleName, 1, 1);
		pane.add(new Label("Last Name"), 0, 2);
		pane.add(tfLastName, 1, 2);
		pane.add(new Label("Your Name is"), 0, 3);
		pane.add(tfYourName, 1, 3);
		
		// Hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btAddName = new Button("Add Name");
		Button btNext = new Button("Next");
		Button btExit = new Button("Exit");
		hBox.getChildren().add(btAddName);
		hBox.getChildren().add(btNext);
		hBox.getChildren().add(btExit);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 300, 200);
		StageGetUserName.setTitle("Get User Name"); // Set the stage title
		StageGetUserName.setScene(scene); // Place the scene in the stage
		StageGetUserName.show(); // Display the stage
		
		btAddName.setOnAction(e -> showName());
		//btNext.setOnAction(e -> StageChooseCal.show());
		btExit.setOnAction(e -> StageGetUserName.close());

		
		
		
	}

	private void showName() {
		String userName = tfFirstName.getText() + " " + tfMiddleName.getText() + " " + tfLastName.getText();
		tfYourName.setText(userName);
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}