module ma.omnichess.game {
    requires javafx.controls;
    requires javafx.fxml;


    opens ma.omnichess.game to javafx.fxml;
    exports ma.omnichess.game;
}