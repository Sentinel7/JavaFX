import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class AlertBoxProgram extends Application {
	
	Button mainButton;
	
	public static void main(String[] args) {launch(args);}
	
	public void start(Stage window) throws Exception
	{
		window.setTitle("Title of the Window");
		
		mainButton = new Button("Click me!");
		mainButton.setMinSize(100, 50);
		mainButton.setOnAction(e -> AlertBox.display("Title of Window", "Wow, this alert box is awesome!"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(mainButton);
		
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
}
