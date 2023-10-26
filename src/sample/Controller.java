package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class Controller {

	@FXML
	private TextArea textInput;

	@FXML
	private TextArea morseOutput;

	@FXML
	private Label switchText;

	@FXML
	MorseCodeTranslator morseCodeTranslator = new MorseCodeTranslator();

	boolean morseToText = false;
	public void updateMorseCode(KeyEvent keyEvent) {
		if(morseToText){
			morseOutput.setText(morseCodeTranslator.translateToText(textInput.getText()));
		}else {
			morseOutput.setText(morseCodeTranslator.translateToMorse(textInput.getText()));
		}
	}

	public void switchStyle(ActionEvent actionEvent) {
		boolean a=(morseToText=!morseToText);
		if(a){
			switchText.setText("Morse to Text");
		}else{
			switchText.setText("Text to Morse");
		}

	}

}
