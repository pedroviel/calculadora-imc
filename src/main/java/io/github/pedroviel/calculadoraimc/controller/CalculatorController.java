package io.github.pedroviel.calculadoraimc.controller;

import io.github.pedroviel.calculadoraimc.model.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Double.parseDouble;

public class CalculatorController implements Initializable {

    @FXML
    private Button calculateBtn;

    @FXML
    private TextField heightField;

    @FXML
    private TextField weightField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    void calculateBMI(ActionEvent event) {

        try {
            String heightText = heightField.getText().replace(",", ".");
            String weightText = weightField.getText().replace(",", ".");

            double height = parseDouble(heightText);
            double weight = parseDouble(weightText);

            if (height <= 0 || weight <= 0) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERRO");
                alert.setHeaderText("Valor inválido");
                alert.setContentText("A altura e o peso, devem ser maiores do que 0!");
                alert.show();

                return;
            }

            Person person = new Person();

            person.setWeight(weight);
            person.setHeight(height);

            double BMI = person.calculateBMI();
            String formattedBMI = String.format("%.2f", BMI);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Resultado do IMC");
            alert.setHeaderText("Seu IMC é: " + formattedBMI);

            alert.setContentText(person.getClassification());

            alert.show();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERRO");
            alert.setHeaderText("Valor inválido");
            alert.setContentText("Por favor, insira valores numéricos para o peso e altura!");
            alert.show();
        }
    }
}
