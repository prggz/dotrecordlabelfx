package recordbasednodeshapes;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Separator;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class DotRecordBasedJavaFxNode extends HBox {

	public DotRecordBasedJavaFxNode(/*String dotLabel, boolean useRoundedBorders*/) {
		// TODO: implement a general solution
	}
	
	/**
	 * label = "A | B | C | D"
	 */
	public static DotRecordBasedJavaFxNode createExample01() {
        DotRecordBasedJavaFxNode node = new DotRecordBasedJavaFxNode();
        
		Text text1 = new Text("A");
//		Line line = new Line();
//		line.setStartY(node.getHeight());
//		line.setEndY(0);
//		line.setStartX(0);
//		line.setEndX(0);
//		line.setStroke(Color.BLACK);
		Separator separator = new Separator(Orientation.VERTICAL);
		separator.setStyle("border-color:#000000;");
		separator.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, BorderWidths.DEFAULT)));
//		separator.set
        Text text2 = new Text("B");
        Text text3 = new Text("C");
        Text text4 = new Text("D");

        // should be used only for debugging purposes, find a better solution to draw grid borders
      //  node.(true);
        
//        GridPane.setMargin(text1, new Insets(10,5,10,5));
//        GridPane.setMargin(text2, new Insets(10,5,10,5));
//        GridPane.setMargin(text3, new Insets(10,5,10,5));
//        GridPane.setMargin(text4, new Insets(10,5,10,5));
        
//        node.add(text1, 0, 0, 1, 1);
//        node.add(text2, 1, 0, 1, 1);
//        node.add(text3, 2, 0, 1, 1);
//        node.add(text4, 3, 0, 1, 1);
        node.setAlignment(Pos.CENTER);
        node.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT)));
        node.setSpacing(5);
        node.setMinHeight(35);
        node.setWidth(200);
        node.setMaxWidth(0);
        node.setPadding(new Insets(0, 5, 0, 5));
        
        node.getChildren().add(text1);
        node.getChildren().add(node.new RecordBasedLabelLine(node.getContentBias()));
        node.getChildren().add(text2);
        node.getChildren().add(text3);
        node.getChildren().add(text4);

        return node;
	}

	/**
	 * label = "{A | B | C | D}" 
	 */
	public static DotRecordBasedJavaFxNode createExample02() {
		DotRecordBasedJavaFxNode node = new DotRecordBasedJavaFxNode();
		
//		Text text1 = new Text("A");
//        Text text2 = new Text("B");
//        Text text3 = new Text("C");
//        Text text4 = new Text("D");
//
//        // should be used only for debugging purposes, find a better solution to draw grid borders
//        node.setGridLinesVisible(true);
//        
//        GridPane.setMargin(text1, new Insets(10,5,10,5));
//        GridPane.setMargin(text2, new Insets(10,5,10,5));
//        GridPane.setMargin(text3, new Insets(10,5,10,5));
//        GridPane.setMargin(text4, new Insets(10,5,10,5));
//        
//        node.add(text1, 0, 0, 1, 1);
//        node.add(text2, 0, 1, 1, 1);
//        node.add(text3, 0, 2, 1, 1);
//        node.add(text4, 0, 3, 1, 1);
        
        return node;
	}

	/**
	 * label = "A | { B | C } | D"
	 */
	public static DotRecordBasedJavaFxNode createExample03() {
		DotRecordBasedJavaFxNode node = new DotRecordBasedJavaFxNode();
//
//		Text text1 = new Text("A");
//        Text text2 = new Text("B");
//        Text text3 = new Text("C");
//        Text text4 = new Text("D");
//
//        // should be used only for debugging purposes, find a better solution to draw grid borders
//        node.setGridLinesVisible(true);
//        
//        GridPane.setMargin(text1, new Insets(10,5,10,5));
//        GridPane.setMargin(text2, new Insets(5,5,5,5));
//        GridPane.setMargin(text3, new Insets(5,5,5,5));
//        GridPane.setMargin(text4, new Insets(10,5,10,5));
//        
//        node.add(text1, 0, 0, 1, 2);
//        node.add(text2, 1, 0, 1, 1);
//        node.add(text3, 1, 1, 1, 1);
//        node.add(text4, 2, 0, 1, 2);
        
        return node;
	}

	/**
	 * label = "<f0> left|<f1> mid&#92; dle|<f2> right"
	 */
	public static DotRecordBasedJavaFxNode createExample04_1() {
		// TODO: instead of using the example01, provide implementation for example04_1
		DotRecordBasedJavaFxNode node = new DotRecordBasedJavaFxNode();
		
		Text text1 = new Text("left");
		Text text2 = new Text("mid dle");
		Text text3 = new Text("right");
		
		
		return createExample01();
	}

	/**
	 * label = "<f0> one|<f1> two"
	 */
	public static DotRecordBasedJavaFxNode createExample04_2() {
		// TODO: instead of using the example01, provide implementation for example04_2
		return createExample01();
	}

	/**
	 * label = "hello&#92;nworld |{ b |{c|<here> d|e}| f}| g | h"
	 */
	public static DotRecordBasedJavaFxNode createExample04_3() {
		// TODO: instead of using the example01, provide implementation for example04_3
		return createExample01();
	}
	
    // TODO: define further cerateExample... methods
	
	private class RecordBasedLabelLine extends Region {
		Line line = new Line();
		BiConsumer<Double, Double> lineResize;
		
		public RecordBasedLabelLine(Orientation orientation) {
			getChildren().add(line);
			switch (orientation != null ? orientation : Orientation.HORIZONTAL) {
			case VERTICAL:
				lineResize = (width, height) -> line.setEndX(width);
				break;
			case HORIZONTAL:
			default:
				lineResize = (width, height) -> line.setEndY((double) height);
				break;
			}	
		}
		
		@Override
		public void resize(double width, double height) {
			lineResize.accept(Double.valueOf(width), Double.valueOf(height));
			super.resize(width, height);
		}		
	}
}
