package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewManager {
    private static Stage primaryStage;

    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    public static void showLoginPage() {
        try {
            FXMLLoader loader = new FXMLLoader(ViewManager.class.getResource("/view/LoginView.fxml"));
            primaryStage.setScene(new Scene(loader.load()));
            primaryStage.setTitle("Login Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showCurrencyConversionPage() {
        try {
            FXMLLoader loader = new FXMLLoader(ViewManager.class.getResource("/view/CurrencyConversionView.fxml"));
            primaryStage.setScene(new Scene(loader.load()));
            primaryStage.setTitle("Currency Conversion Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showResultPage() {
        try {
            FXMLLoader loader = new FXMLLoader(ViewManager.class.getResource("/view/ResultView.fxml"));
            primaryStage.setScene(new Scene(loader.load()));
            primaryStage.setTitle("Resilt Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
