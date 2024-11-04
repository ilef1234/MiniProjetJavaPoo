module org.example.miniprojet {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.miniprojet to javafx.fxml;
    exports org.example.miniprojet;
}