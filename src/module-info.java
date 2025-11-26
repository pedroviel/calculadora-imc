module calculadora.imc {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    opens calculadoraimc to javafx.fxml;
    opens calculadoraimc.controller to javafx.fxml;
    exports calculadoraimc to javafx.graphics;
}