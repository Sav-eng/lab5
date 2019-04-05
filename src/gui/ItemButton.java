package gui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import static javafx.scene.layout.BorderStrokeStyle.SOLID;

public class ItemButton extends Button {
	
	private String item;
	
	public ItemButton (String item) {
		
		// TODO Completes ItemButton's constructor
		this.setPadding(new Insets(5,5,5,5));
		this.item = item;
		setBorder(new Border(new BorderStroke(Color.GRAY, SOLID, 
		CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		String url;
		switch(item) {
			case "Wood" : url = "Wood.png"; break;
			case "Iron" : url = "Iron_ore.png"; break;
			case "Iron Plate" : url = "Iron_plate.png"; break;
			case "Iron Sword" : url = "Iron_Sword.png"; break;
			case "Gem"	: url = "Gem.png"; break;
			default : url = "Other.png";
		}
		Image image = new Image("file:res/" + url);
		this.setGraphic(new ImageView(image));
		this.unhighlight();
	}
	
	public void highlight() {
		this.setBackground(new Background(new BackgroundFill(Color.AQUAMARINE, null, null)));
	}
	
	public void unhighlight() {
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));		
	}
	
	public String getItem() {
		return this.item;
	}
	
}
