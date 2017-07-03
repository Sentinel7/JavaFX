import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class ConfirmBoxProgramClosed extends Application {

	Stage mainWindow;
	Button mainButton;

	public static void main(String[] args) {launch(args);}
	
	public void start(Stage window) throws Exception
	{
		mainWindow = window;
		window.setTitle("Title of the Window");
		
		window.setOnCloseRequest(e -> {
			e.consume(); // Consumes the closeProgram method
			closeProgram();
		});
		
		mainButton = new Button("Close Program");
		mainButton.setMinSize(100, 50);
		mainButton.setOnAction(e -> closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().add(mainButton);
		
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
	private void closeProgram()
	{
		boolean answer = ConfirmBox.display("Warning", "Are you sure you want to close?");
		
		if (answer == true)
			mainWindow.close();
	}
	
}
