import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {

    @FXML
    private Label username;

    @FXML
    private Label password;

    @FXML
    private TextField fin1;

    @FXML
    private TextField fin2;

    @FXML
    private Button button;

    @FXML
    void onPress(ActionEvent event) throws IOException {
        Scene scene=LoginDemo.getMainScenne();
        scene.setRoot(new FXMLLoader(getClass().getResource("coffee.fxml")).load());


    }

}
