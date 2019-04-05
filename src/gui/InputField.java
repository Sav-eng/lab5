package gui;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;

public class InputField extends VBox {
	
	private TextField textField;
	
	public InputField(String title, String promptText) {
		this.setPadding(new Insets(10,10,10,10));
		this.setSpacing(5);
		
		Label label = new Label();
		label.setText(title);
		label.setFont(Font.font(18));
		//label.setAlignment(Pos.CENTER);
		setAlignment(Pos.CENTER);
		textField = new TextField();
		//textField.setAlignment(Pos.CENTER);
		textField.setPromptText(promptText);;
		
		this.getChildren().addAll(label,textField);
	}

	public String getText() {
		return textField.getText().trim();
	}
	
}
