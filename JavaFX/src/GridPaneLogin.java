import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class GridPaneLogin extends Application {

	Button mainButton;

	public static void main(String[] args) {launch(args);}
	
	public void start(Stage window) throws Exception
	{
		window.setTitle("GridPane Login Screen");
		
		// Setup GridPane layout
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		// Username
		Label nameLabel = new Label("Username:");
		GridPane.setConstraints(nameLabel, 0, 0); // Sets position for object on grid
		
		TextField nameInput = new TextField();
		nameInput.setPromptText("Username");
		GridPane.setConstraints(nameInput, 1, 0);
		
		// Password
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 0, 1);
		
		PasswordField passInput = new PasswordField();
		passInput.setPromptText("Password");
		GridPane.setConstraints(passInput, 1, 1);
		
		// Login button
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 2);
		
		
		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
		Scene scene = new Scene(grid, 300, 200);
		window.setScene(scene);
		window.show();
	}
	
}
