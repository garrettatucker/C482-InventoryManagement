module com.c482.ims {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.c482.ims to javafx.fxml;
    exports com.c482.ims;
}