import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainView;
import view.ViewManager;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
      ViewManager.setPrimaryStage(primaryStage);
        ViewManager.showLoginPage();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
