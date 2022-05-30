import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class Coffee {

    @FXML
    private TextArea textarea;

    @FXML
    private Button coffee;

    @FXML
    void onPress(ActionEvent event) throws IOException {
        Scene scene=LoginDemo.getMainScenne();
        scene.setRoot(new FXMLLoader(getClass().getResource("shop.fxml")).load());

    }

}
