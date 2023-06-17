package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Model;
import view.ResultView;

public class MainController {
    @FXML
    private TextField amountTextField;

    @FXML
    private ComboBox<String> fromCurrencyComboBox;

    @FXML
    private ComboBox<String> toCurrencyComboBox;

    private Model model;

    public void initialize() {
        model = new Model();

        // Populate the currency combo boxes
        fromCurrencyComboBox.getItems().addAll("USD", "EUR", "GBP");
        toCurrencyComboBox.getItems().addAll("USD", "EUR", "GBP");

        // Set default selection
        fromCurrencyComboBox.getSelectionModel().selectFirst();
        toCurrencyComboBox.getSelectionModel().selectLast();
    }

    @FXML
    public void convertButtonClicked() {
        // Retrieve input values
        double amount = Double.parseDouble(amountTextField.getText());
        String fromCurrency = fromCurrencyComboBox.getValue();
        String toCurrency = toCurrencyComboBox.getValue();

        // Set values in the model
        model.setAmount(amount);
        model.setFromCurrency(fromCurrency);
        model.setToCurrency(toCurrency);

        // Perform currency conversion
        model.convertCurrency();

        // Show result view
        ResultView.show(model);
    }
}
