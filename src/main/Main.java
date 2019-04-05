package main;

import gui.BarChartPane;
import gui.ControlPane;
import gui.EventManager;
import gui.ItemLogPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		HBox root = new HBox();
		root.setPadding(new Insets(10,10,10,10));
		root.setSpacing(10);
		ControlPane controlPane = new ControlPane();
		BarChartPane barChartPane = new BarChartPane();
		ItemLogPane itemLogPane = new ItemLogPane();
		EventManager eventManager = new EventManager(barChartPane, itemLogPane, controlPane.getCatalogue());
		eventManager.setUpAddButtonEvent(controlPane.getAddButton(), controlPane.getAmountInputField());
		
		root.getChildren().addAll(controlPane, barChartPane, itemLogPane);
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Blacksmith's Inventory Manager");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String [] args) {
		launch(args);
	}
}
