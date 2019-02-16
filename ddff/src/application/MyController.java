package application;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class MyController implements Initializable {
   private static final String String = null;

   @FXML
   private Button MyButton16; 
   @FXML
   private Button MyButton8; 
   @FXML
   private TextField MyTextField;   

   @FXML
   private Text MyText;
   @Override
   public void initialize(URL location, ResourceBundle resources) {
      
   }
   public void showDateTime(ActionEvent event) {

        MyTextField.setText(String);
      
   }
   public void opa8() {
	   MyText.setText(Integer.toString(Integer.parseInt(MyTextField.getText()), 8));
           }

	   public void opa16() {
		   MyText.setText(Integer.toString(Integer.parseInt(MyTextField.getText()), 16));
	           }
  
}