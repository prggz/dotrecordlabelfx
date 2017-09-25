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
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public /* abstract */ class DotRecordBasedJavaFxNode extends HBox {

	private static Border RECORD_BORDER = new Border(
			new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT));
	private static Border MRECORD_BORDER = new Border(
			new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(10), BorderWidths.DEFAULT));
	private static Insets TEXT_MARGINS = new Insets(1.5f, 7, 1.5f, 7);

	protected DotRecordBasedJavaFxNode(/* String dotLabel, boolean useRoundedBorders */) {
	}

	/**
	 * label = "A | B | C | D"
	 */
	public static DotRecordBasedJavaFxNode createExample01() {
		RootNode root = new RootNode();

		root.addText("A");
		root.addText("B");
		root.addText("C");
		root.addText("D");

		return root;
	}

	/**
	 * label = "{A | B | C | D}"
	 */
	public static DotRecordBasedJavaFxNode createExample02() {
		RootNode node = new RootNode();

		LabelNode vbox = node.provideChildNode();

		node.addRotatedLabel(vbox);

		vbox.addText("A");
		vbox.addText("B");
		vbox.addText("C");
		vbox.addText("D");

		return node;
	}

	/**
	 * label = "A | { B | C } | D"
	 */
	public static DotRecordBasedJavaFxNode createExample03() {
		RootNode node = new RootNode();

		LabelNode vbox = node.provideChildNode();

		node.addText("A");
		node.addRotatedLabel(vbox);
		vbox.addText("B");
		vbox.addText("C");
		node.addText("D");

		return node;
	}

	/**
	 * label = "<f0> left|<f1> mid&#92; dle|<f2> right"
	 */
	public static DotRecordBasedJavaFxNode createExample04_1() {
		RootNode node = new RootNode();

		node.addText("left");
		node.addText("mid dle");
		node.addText("right");

		return node;
	}

	/**
	 * label = "<f0> one|<f1> two"
	 */
	public static DotRecordBasedJavaFxNode createExample04_2() {
		RootNode node = new RootNode();

		node.addText("one");
		node.addText("two");

		return node;
	}

	/**
	 * label = "hello&#92;nworld |{ b |{c|<here> d|e}| f}| g | h"
	 */
	public static DotRecordBasedJavaFxNode createExample04_3() {
		RootNode node = new RootNode();

		LabelNode vbox = node.provideChildNode();
		LabelNode hbox = vbox.provideChildNode();

		node.addText("hello&#92;nworld");
		node.addRotatedLabel(vbox);
		vbox.addText("b");
		vbox.addRotatedLabel(hbox);
		hbox.addText("c");
		hbox.addText("d");
		hbox.addText("e");
		vbox.addText("f");
		node.addText("g");
		node.addText("h");

		return node;
	}

	/**
	 * Mrecord label = "hello&#92;nworld |{ b |{c|<here> d|e}| f}| g | h"
	 */
	public static DotRecordBasedJavaFxNode createExample05_3() {
		RootNode node = new RootNode(MRECORD_BORDER);
		LabelNode vbox = node.provideChildNode();
		LabelNode hbox = node.provideChildNode();

		node.addText("hello&#92;nworld");
		node.addRotatedLabel(vbox);
		vbox.addText("b");
		vbox.addRotatedLabel(hbox);
		hbox.addText("c");
		hbox.addText("d");
		hbox.addText("e");
		vbox.addText("f");
		node.addText("g");
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

		// public void addLine();
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

		@Override
		public void addRotatedLabel(LabelNode label) {
			setHgrow((Node) label, Priority.ALWAYS);
			setPrefWidth(35);
			setMaxWidth(35);
			setMinHeight(0);
			super.addRotatedLabel(label);
		}

	}

	private static class HLabelNode extends DotRecordBasedJavaFxNode implements LabelNode {
		boolean firstField = true;

		public HLabelNode() {
			setAlignment(Pos.CENTER);
		}

		@Override
		public LabelNode provideChildNode() {
			return new VLabelNode();
		}

		public void addText(String string) {
			firstFieldCheck();
			Text text = new Text(string);
			setMargin(text, TEXT_MARGINS);
			getChildren().add(text);
		}

		@Override
		public void addRotatedLabel(LabelNode label) {
			firstFieldCheck();
			getChildren().add((Node) label);
		}

		private void firstFieldCheck() {
			if (!firstField)
				addLine();
			else
				firstField = false;
		}

		private void addLine() {
			getChildren().add(new RecordBasedLabelLine(Orientation.HORIZONTAL));
		}

	}

	private class VLabelNode extends VBox implements LabelNode {
		boolean firstField = true;

		public VLabelNode() {
			setAlignment(Pos.CENTER);
		}

		@Override
		public LabelNode provideChildNode() {
			return new HLabelNode();
		}

		public void addText(String string) {
			firstFieldCheck();
			Text text = new Text(string);
			setMargin(text, TEXT_MARGINS);
			getChildren().add(text);
		}

		@Override
		public void addRotatedLabel(LabelNode label) {
			firstFieldCheck();
			getChildren().add((Node) label);
		}

		private void firstFieldCheck() {
			if (!firstField)
				addLine();
			else
				firstField = false;
		}

		private void addLine() {
			getChildren().add(new RecordBasedLabelLine(Orientation.VERTICAL));
		}

	}

}
