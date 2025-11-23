module calculadora.imc {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    opens io.github.pedroviel.calculadoraimc to javafx.fxml;
    opens io.github.pedroviel.calculadoraimc.controller to javafx.fxml;
    exports io.github.pedroviel.calculadoraimc to javafx.graphics;
}