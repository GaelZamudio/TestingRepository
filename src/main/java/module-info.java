module com.testing.testingrepository {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.testing.testingrepository to javafx.fxml;
    exports com.testing.testingrepository;
}