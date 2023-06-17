package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import view.ViewManager;

public class CurrencyConversionController {
    @FXML
    private TextField amountTextField;

    @FXML
    private ComboBox<String> fromCurrencyComboBox;

    @FXML
    private ComboBox<String> toCurrencyComboBox;

    @FXML
    public void convertButtonClicked() {
        // Perform the currency conversion logic
        // ...

        // For simplicity, let's assume the conversion is successful
        ViewManager.showResultPage();
    }

    @FXML
    public void logoutButtonClicked() {
        ViewManager.showLoginPage();
    }
}
