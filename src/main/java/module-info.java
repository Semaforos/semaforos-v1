module co.edu.uptc.semaforos {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uptc.semaforos to javafx.fxml;
    exports co.edu.uptc.semaforos;
    exports co.edu.uptc.semaforos.controllers;
    opens co.edu.uptc.semaforos.controllers to javafx.fxml;
}