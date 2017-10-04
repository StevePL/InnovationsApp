package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class StartPageController {
	
	@FXML
	private TextField usernameTextField;
	
	@FXML
	private PasswordField passwordTextField;
	
	@FXML
	private Button loginButton;
	
	@FXML
	private void onLoginClick() {
		String username = usernameTextField.getText();
		System.out.println(username);
	}
	
}
