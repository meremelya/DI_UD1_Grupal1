import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;
    
    @FXML
    private Label header;

    @FXML
    private Label labellMax;

    @FXML
    private Label labelDani;
    

    public void initialize() {        
        label.setText("Hello, JavaFX" + ".");
    }
}
