package gui;

import static javafx.scene.layout.BorderStrokeStyle.SOLID;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ControlPane extends VBox {
	
	private CataloguePane catalogue;
	private InputField amountInputField;
	private Button addButton;
	
	public ControlPane () {
		
		setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, SOLID, 
		CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		Text catalogueTitle = new Text();
		catalogueTitle.setText("Choose an item");
		catalogueTitle.setFont(Font.font(18));
		catalogue = new CataloguePane();
		amountInputField = new InputField("Amount to add", "Input number here");
		addButton = new Button("Add");
		addButton.setPrefWidth(150);
		setPrefWidth(200);
		setSpacing(15);
		//root.setWidth(200);
		setAlignment(Pos.CENTER);
		getChildren().addAll(catalogueTitle, catalogue, amountInputField, addButton);
	}

	public CataloguePane getCatalogue() {
		return catalogue;
	}

	public InputField getAmountInputField() {
		return amountInputField;
	}

	public Button getAddButton() {
		return addButton;
	}
	
	

}
