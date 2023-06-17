package model;

public class Model {
    private double amount;
    private String fromCurrency;
    private String toCurrency;
    private double convertedAmount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    // Perform the currency conversion calculation
    public void convertCurrency() {
        // Add your currency conversion logic here
        // You can use external APIs or pre-defined conversion rates
        // For simplicity, let's assume a 1:1 conversion rate
        convertedAmount = amount;
    }
}
