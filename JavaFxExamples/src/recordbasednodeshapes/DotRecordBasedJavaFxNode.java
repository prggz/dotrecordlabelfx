package recordbasednodeshapes;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
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
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public /*abstract*/ class DotRecordBasedJavaFxNode extends HBox {

	
	private static Border RECORD_BORDER = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT));
	private static Border MRECORD_BORDER = new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5), BorderWidths.DEFAULT));
	private static Insets TEXT_MARGINS = new Insets(0, 5, 0, 5);

	
	public DotRecordBasedJavaFxNode(/*String dotLabel, boolean useRoundedBorders*/) {
		RootNode(RECORD_BORDER);
	}
	
	/**
	 * label = "A | B | C | D"
	 */
	public static DotRecordBasedJavaFxNode createExample01() {
        DotRecordBasedJavaFxNode node = new RootNode();
        
		node.addText("A");
        node.getChildren().add(node.new RecordBasedLabelLine(Orientation.HORIZONTAL));
		node.addText("B");
        node.getChildren().add(node.new RecordBasedLabelLine(Orientation.HORIZONTAL));
		node.addText("C");
        node.getChildren().add(node.new RecordBasedLabelLine(Orientation.HORIZONTAL));
		node.addText("D");

        return node;
	}


	/**
	 * label = "{A | B | C | D}" 
	 */
	public static DotRecordBasedJavaFxNode createExample02() {
		DotRecordBasedJavaFxNode node = new RootNode();
		
		VLabelNode vbox = node.new VLabelNode();
        
		node.getChildren().add(vbox);

		vbox.addText("A");
		vbox.addLine();
		vbox.addText("B");
        vbox.addLine();
		vbox.addText("C");
		vbox.addLine();
		vbox.addText("D");
		
        return node;
	}

	/**
	 * label = "A | { B | C } | D"
	 */
	public static DotRecordBasedJavaFxNode createExample03() {
		LabelNode node = new RootNode();
		
		VLabelNode vbox = node.new VLabelNode();
        
		node.addText("A");
		node.addLine();
		node.getChildren().add(vbox);
		vbox.addText("B");
        vbox.addLine();
		vbox.addText("C");
        node.addLine();
		node.addText("D");
		
        return node;
	}

	/**
	 * label = "<f0> left|<f1> mid&#92; dle|<f2> right"
	 */
	public static DotRecordBasedJavaFxNode createExample04_1() {
DotRecordBasedJavaFxNode node = new RootNode();
		
		VLabelNode vbox = node.new VLabelNode();
        
		node.addText("left");
		node.addLine();
		node.addText("mid dle");
        node.addLine();
		node.addText("right");
		
        return node;
	}

	/**
	 * label = "<f0> one|<f1> two"
	 */
	public static DotRecordBasedJavaFxNode createExample04_2() {
		DotRecordBasedJavaFxNode node = new RootNode();
		
		VLabelNode vbox = node.new VLabelNode();
        
		node.addText("one");
		node.addLine();
		node.addText("two");
		
        return node;
	}

	/**
	 * label = "hello&#92;nworld |{ b |{c|<here> d|e}| f}| g | h"
	 */
	public static DotRecordBasedJavaFxNode createExample04_3() {
		DotRecordBasedJavaFxNode node = new RootNode(MRECORD_BORDER);
		
		VLabelNode vbox = node.new VLabelNode();
		DotRecordBasedJavaFxNode hbox = new DotRecordBasedJavaFxNode();
        
		node.addText("hello&#92;nworld");
		node.addLine();
		node.getChildren().add(vbox);
		vbox.addText("b");
        vbox.addLine();
        vbox.getChildren().add(hbox);
		hbox.addText("c");
		hbox.addLine();
		hbox.addText("d");
		hbox.addLine();
		hbox.addText("e");
		vbox.addLine();
		vbox.addText("f");
		node.addLine();
		node.addText("g");
		node.addLine();
		node.addText("h");
		
        return node;
	}
	
	/**
	 * Mrecord
	 * label = "hello&#92;nworld |{ b |{c|<here> d|e}| f}| g | h"
	 */
	public static DotRecordBasedJavaFxNode createExample05_3() {
		LabelNode node = new RootNode();
		LabelNode vbox = node.provideChildNode();
		LabelNode hbox = node.provideChildNode();
        
		node.addText("hello&#92;nworld");
		node.addLine();
		node.getChildren().add(vbox);
		vbox.addText("b");
        vbox.addLine();
        vbox.getChildren().add(hbox);
		hbox.addText("c");
		hbox.addLine();
		hbox.addText("d");
		hbox.addLine();
		hbox.addText("e");
		vbox.addLine();
		vbox.addText("f");
		node.addLine();
		node.addText("g");
		node.addLine();
		node.addText("h");
		
        return node;
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
	

	
	private interface LabelNode {
		public void addText(String string);
		public void addLine();
		public void addRotatedLabel(LabelNode label);
		public LabelNode provideChildNode();
	}
	
	private static class RootNode extends HLabelNode {
		public RootNode() {
	        this(RECORD_BORDER);
		}
		
		public RootNode(Border border) {
	        setBorder(border);
	        setMinHeight(35);
	        setMaxWidth(0);
		}	
	}
	
	private static class HLabelNode extends DotRecordBasedJavaFxNode implements LabelNode {
		public HLabelNode() {
	        setAlignment(Pos.CENTER);
		}
		
		public void addText(String string) {
			Text text = new Text(string);
			setMargin(text, TEXT_MARGINS);
	        getChildren().add(text);
		}
		
		public void addLine() {
			getChildren().add(new RecordBasedLabelLine(Orientation.HORIZONTAL));
		}

		@Override
		public LabelNode provideChildNode() {
			return new VLabelNode();
		}

		@Override
		public void addRotatedLabel(LabelNode label) {
			//can't do this any different due to polymorphism not being possible.
			getChildren().add((Node) label);
		}
	}
	
	private class VLabelNode extends VBox implements LabelNode {	
		public VLabelNode() {
	        setAlignment(Pos.CENTER);
		}
		
		public void addText(String string) {
			Text text = new Text(string);
			setMargin(text, TEXT_MARGINS);
	        getChildren().add(text);
		}
		
		public void addLine() {
			getChildren().add(new RecordBasedLabelLine(Orientation.VERTICAL));
		}
		
		@Override
		public LabelNode provideChildNode() {
			return new HLabelNode();
		}

		@Override
		public void addRotatedLabel(LabelNode label) {
			getChildren().add((Node) label);			
		}
	}
	
}
