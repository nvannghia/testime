module whatever.mycompany.testapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens whatever.mycompany.testapp to javafx.fxml;
    exports whatever.mycompany.testapp;
}
