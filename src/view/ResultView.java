package view;

import controller.ResultController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Model;

import java.io.IOException;

public class ResultView {
    public static void show(Model model) {
        try {
            FXMLLoader loader = new FXMLLoader(ResultView.class.getResource("/view/ResultView.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("Conversion Result");
            ResultController controller = loader.getController();
            controller.setModel(model);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
