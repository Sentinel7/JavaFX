import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class SwitchScene extends Application {

	Scene scene1, scene2;
	VBox layout1, layout2;
	Label label1, label2;
	Button button1, button2;
	
	public static void main(String[] args) {launch(args);}
	
	public void start(Stage window) throws Exception
	{
		// Scene 1
		label1 = new Label("Welcome to Scene 1");
		button1 = new Button("Go to Scene 2");
		button1.setOnAction(e -> window.setScene(scene2));
		
		layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 500, 500);
		
		// Scene 2
		label2 = new Label("This is Scene 2");
		button2 = new Button("This scene sucks, go back to Scene 1");
		button2.setOnAction(e -> window.setScene(scene1));
		
		layout2 = new VBox(20);
		layout2.getChildren().addAll(label2, button2);
		scene2 = new Scene(layout2, 350, 350);
		
		// Add all to window
		window.setScene(scene1);
		window.setTitle("Title of the Window");
		window.show();
	}
	
}
