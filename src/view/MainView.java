package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView {
    public static void show() {
        try {
            FXMLLoader loader = new FXMLLoader(MainView.class.getResource("/view/MainView.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("Currency Conversion System");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
