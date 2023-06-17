package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Model;
import view.MainView;

public class ResultController {
    @FXML
    private Label resultLabel;

    private Model model;

    public void initialize() {
    }

    public void setModel(Model model) {
        this.model = model;
        updateResultLabel();
    }

    private void updateResultLabel() {
        // Format the result as desired
        String resultText = String.format("%.2f %s = %.2f %s",
                model.getAmount(), model.getFromCurrency(),
                model.getConvertedAmount(), model.getToCurrency());
        resultLabel.setText(resultText);
    }

    @FXML
    public void backButtonClicked() {
        // Close the result view and show the main view
        Stage stage = (Stage) resultLabel.getScene().getWindow();
        stage.close();
        MainView.show();
    }
}
