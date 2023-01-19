module ecole.gestionecole {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.jfoenix;
    requires jasperreports;




    opens ecole.gestionecole to javafx.fxml;
    exports ecole.gestionecole;
    exports ecole.gestionecole.controller;
    opens ecole.gestionecole.controller to javafx.fxml;
    opens ecole.gestionecole.tableModel to javafx.base;

}