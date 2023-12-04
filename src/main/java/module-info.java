module com.example.task6_prototype {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task6_prototype to javafx.fxml;
    exports com.example.task6_prototype;
}