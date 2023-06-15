module jpabasic.ex1hellojpa {
    requires javafx.controls;
    requires javafx.fxml;


    opens jpabasic.ex1hellojpa to javafx.fxml;
    exports jpabasic.ex1hellojpa;
}