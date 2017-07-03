import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class LambdaButton extends Application {

	Button mainButton;

	public static void main(String[] args) {launch(args);}
	
	public void start(Stage window) throws Exception
	{
		window.setTitle("Title of the Window");
		
		mainButton = new Button();
		mainButton.setText("Click me!");
		
		mainButton.setOnAction(e -> System.out.println("This is a lambda expression"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(mainButton);
		
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
}
