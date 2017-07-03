import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class EmbeddingLayouts extends Application {

	Button mainButton;

	public static void main(String[] args) {launch(args);}
	
	public void start(Stage window) throws Exception
	{
		window.setTitle("Embedding Layouts");
		
		HBox topMenu = new HBox(10);
		Button buttonA = new Button("File");
		Button buttonB = new Button("Edit");
		Button buttonC = new Button("View");
		topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
		
		VBox leftMenu = new VBox(20);
		Button buttonD = new Button("D");
		Button buttonE = new Button("E");
		Button buttonF = new Button("F");
		leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);
		leftMenu.setAlignment(Pos.CENTER);
		
		BorderPane layout = new BorderPane();
		layout.setTop(topMenu);
		layout.setLeft(leftMenu);
		
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
}
