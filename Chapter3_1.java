import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;

public class Chapter3_1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("1");
			textInputDialog.setTitle("Print vs Printf Demo");
			textInputDialog.setContentText("Select option 1 for print and option 2 for printf demo");
		Optional<String> input = textInputDialog.showAndWait();
		String option = input.get();

		if(option.equals("1")) {
			System.out.println("You have select 1");
		} else if (option.equals("2")) {
			System.out.printf("Hello %s \n "," Michael");
			System.out.printf("Charcter: %c \n", 65);
			System.out.printf("Decimal: %d \n", 6, 1997);
			System.out.printf("Exponents: %e \n", 3.14567);
			System.out.printf("Float; %f \n", 3.344);
		}
	}
}
