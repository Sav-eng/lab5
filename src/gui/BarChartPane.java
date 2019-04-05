package gui;

import static javafx.scene.layout.BorderStrokeStyle.SOLID;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart.*;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class BarChartPane extends VBox {

	private ObservableList<Data<String, Number>> barChartDataList = FXCollections.observableArrayList();;
	
	public BarChartPane () {
		
		this.setBorder(new Border(new BorderStroke(Color.LIGHTGRAY, SOLID, 
		CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
		this.setAlignment(Pos.TOP_CENTER);
		setPrefWidth(400);
		setPadding(new Insets(10,10,10,10));
		setSpacing(10);
		
		Label label = createHeaderLabel();
		BarChart<String, Number>barChart = createBarChart();
		getChildren().addAll(label ,barChart);
	}
	
	public int addItem(String item, int amount) {

		java.util.Iterator<Data<String, Number>> x = barChartDataList.iterator();
		int ret=-1;
		while(x.hasNext()) {
			Data<String, Number>y = x.next();
			if(y.getXValue()==item) {
				ret += amount + y.getYValue().intValue();
				y.setYValue(y.getYValue().intValue() + amount);
			}
		}
		if(ret == -1)return ret;
		else return ret +1;
	}
	
	public Label createHeaderLabel() {
		Label label = new Label();
		label.setText("Item Summary");
		label.setFont(Font.font(24));
		return label;

	}
	
	public BarChart<String, Number> createBarChart() {
		
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.setLabel("Item");
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("Amount");
		
		barChartDataList.add(new Data<String, Number>("Wood",0));
		barChartDataList.add(new Data<String, Number>("Iron",0));
		barChartDataList.add(new Data<String, Number>("Iron Plate",0));
		barChartDataList.add(new Data<String, Number>("Iron Sword",0));
		barChartDataList.add(new Data<String, Number>("Gem",0));
		barChartDataList.add(new Data<String, Number>("Other",0));
		
		Series<String, Number>series = new Series<String, Number>(barChartDataList);
		
		BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
		barChart.getData().add(series);
		barChart.setLegendVisible(false);
		return barChart;
		// TODO Implements and return a BarChart
		
	}
	
}
