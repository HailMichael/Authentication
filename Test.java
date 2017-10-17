import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Test extends Application {

	@Override
	public void start(Stage stage)
	{
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKLE = 5;
		final int PENNY = 1;

		TextInputDialog input = new TextInputDialog();
		Optional<String> value = input.showAndWait();
		String amount = value.get();
		int qChange = Integer.parseInt(amount)*100 / QUARTER;

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Change Amount");
		alert.setContentText("The change in Quarter is " + qChange);
		alert.showAndWait();
	}
}
