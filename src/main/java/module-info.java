module fhtw.libreoeffis {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens fhtw.libreoeffis to javafx.fxml;
    exports fhtw.libreoeffis;
}