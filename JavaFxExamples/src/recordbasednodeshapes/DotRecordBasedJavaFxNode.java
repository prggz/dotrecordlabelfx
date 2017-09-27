package recordbasednodeshapes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import org.apache.commons.lang.StringEscapeUtils;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class DotRecordBasedJavaFxNode extends HBox {

	private static Border RECORD_BORDER = new Border(
			new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT));
	private static Border MRECORD_BORDER = new Border(
			new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(10), BorderWidths.DEFAULT));
	private static Insets TEXT_MARGINS = new Insets(1.5f, 7, 1.5f, 7);
	private static double SIZE_BASE;
	private static double PREF_HEIGHT = 3 * SIZE_BASE;
	private static double PREF_WIDTH = 2 * SIZE_BASE;

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
	 * Mrecord label = "<f0> left|<f1> mid&#92; dle|<f2> right"
	 */
	public static DotRecordBasedJavaFxNode createExample05_1() {
		RootNode node = new RootNode(MRECORD_BORDER);

		node.addText("left");
		node.addText("mid dle");
		node.addText("right");

		return node;
	}

	/**
	 * Mrecord label = "<f0> one|<f1> two"
	 */
	public static DotRecordBasedJavaFxNode createExample05_2() {
		RootNode node = new RootNode(MRECORD_BORDER);

		node.addText("one");
		node.addText("two");

		return node;
	}

	/**
	 * Mrecord label = "hello&#92;nworld |{ b |{c|<here> d|e}| f}| g | h"
	 */
	public static DotRecordBasedJavaFxNode createExample05_3() {
		RootNode node = new RootNode(MRECORD_BORDER);
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

	// example06_1 [label = "<f0> 0x10ba8| <f1>"]
	public static DotRecordBasedJavaFxNode createExample06_1() {
		RootNode node = new RootNode();

		node.addText("0x10ba8");
		node.addText(" ");

		return node;
	}
	// example06_2 [label = "<f0> 0xf7fc4380| <f1> | <f2> |-1"]

	public static DotRecordBasedJavaFxNode createExample06_2() {
		RootNode node = new RootNode();

		node.addText("0xf7fc4380");
		node.addText(" ");
		node.addText(" ");
		node.addText("-1");
		return node;
	}

	// example06_3 [label = "<f0> 3.43322790286038071e-06|44.79998779296875|0"]
	public static DotRecordBasedJavaFxNode createExample06_3() {
		RootNode node = new RootNode();

		node.addText("3.43322790286038071e-06");
		node.addText("44.79998779296875");
		node.addText("0");

		return node;
	}

	// example06_4 [label = "<f0> (nil)| | |-1"]
	public static DotRecordBasedJavaFxNode createExample06_4() {
		RootNode node = new RootNode();
		LabelNode vbox = node.provideChildNode();
		LabelNode hbox = node.provideChildNode();

		node.addText("(nil)");
		node.addText("");
		node.addText("");
		node.addText("-1");

		return node;
	}

	// example07 [label = "<f0> |<f1> G|<f2> "]
	public static DotRecordBasedJavaFxNode createExample07() {
		RootNode node = new RootNode();
		LabelNode vbox = node.provideChildNode();
		LabelNode hbox = node.provideChildNode();

		node.addText("");
		node.addText("G");
		node.addText("");

		return node;
	}

	// example08_1 [label = "<f0> |<f1> |<f2> |<f3> |<f4> |<f5> |<f6> | "]
	public static DotRecordBasedJavaFxNode createExample08_1() {
		RootNode node = new RootNode();
		LabelNode vbox = node.provideChildNode();
		LabelNode hbox = node.provideChildNode();

		node.addText("");
		node.addText("");
		node.addText("");
		node.addText("");
		node.addText("");
		node.addText("");
		node.addText("");
		node.addText("");

		return node;
	}

	// example08_2 [label = "{<n> n14 | 719 |<p> }"]
	public static DotRecordBasedJavaFxNode createExample08_2() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("n14");
		node.addText("719");
		node.addText(" ");

		root.addRotatedLabel(node);

		return root;
	}
	// example09_1 [label = "{Animal|+ name : string\l+ age : int\l|+ die() :
	// void\l}"]

	public static DotRecordBasedJavaFxNode createExample09_1() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("Animal");
		node.addText("+ name : string\\l+ age : int\\l");
		node.addText("+ die() : void\\l");

		root.addRotatedLabel(node);
		return root;
	}

	// example09_2 [label = "{Dog||+ bark() : void\l}"]
	public static DotRecordBasedJavaFxNode createExample09_2() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("Dog");
		node.addText(" ");
		node.addText("+ bark() : void\\l");

		root.addRotatedLabel(node);

		return root;
	}

	// example09_3 [label = "{Cat||+ meow() : void\l}"]
	public static DotRecordBasedJavaFxNode createExample09_3() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("Cat");
		node.addText(" ");
		node.addText("+ meow() : void\\l");

		root.addRotatedLabel(node);

		return root;
	}

	// example10_1 [label = "{AbstractSuffixTree|+ text\n+ root|...}"]
	public static DotRecordBasedJavaFxNode createExample10_1() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("AbstractSuffixTree");
		node.addText("+ text\\n+ root");
		node.addText("...");

		root.addRotatedLabel(node);

		return root;
	}

	// example10_2 [label = "{SimpleSuffixTree|...| + constructTree()\l...}"]
	public static DotRecordBasedJavaFxNode createExample10_2() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("SimpleSuffixTree");
		node.addText("...");

		node.addText("+ constructTree()\\l...");

		root.addRotatedLabel(node);
		return root;
	}

	// example10_3 [label = "{CompactSuffixTree|...| + compactNodes()\l...}"]
	public static DotRecordBasedJavaFxNode createExample10_3() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("SimpleSuffixTree");
		node.addText("...");

		node.addText("+ compactNodes()\\l...");

		root.addRotatedLabel(node);
		return root;
	}

	// example10_4 [label = "{SuffixTreeNode|...|+ addSuffix(...)\l...}"]
	public static DotRecordBasedJavaFxNode createExample10_4() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("SuffixTreeNode");
		node.addText("...");

		node.addText("+ addSuffix(...)\\l...");

		root.addRotatedLabel(node);
		return root;
	}

	// example10_5 [label = "{SuffixTreeEdge|...|+ compactLabel(...)\l...}"]
	public static DotRecordBasedJavaFxNode createExample10_5() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		node.addText("SuffixTreeEdge");
		node.addText("...");

		node.addText("+ compactLabel(...)\\l...");

		root.addRotatedLabel(node);
		return root;
	}

	// example11_1 [label="{<f0> 1.0|<f1> One process here\n\n\n}" shape=Mrecord]
	public static DotRecordBasedJavaFxNode createExample11_1() {
		RootNode root = new RootNode(MRECORD_BORDER);
		LabelNode node = root.provideChildNode();

		node.addText("1.0");
		node.addText("One process here\\n\\n\\n");

		root.addRotatedLabel(node);
		return root;
	}

	// example11_2 [label="{<f0> 2.0|<f1> Other process here\n\n\n}" shape=Mrecord]
	public static DotRecordBasedJavaFxNode createExample11_2() {
		RootNode root = new RootNode(MRECORD_BORDER);
		LabelNode node = root.provideChildNode();

		node.addText("2.0");
		node.addText("Other process here\\n\\n\\n");

		root.addRotatedLabel(node);
		return root;
	}

	// example11_3 [label="<f0> |<f1> Data store one"]
	public static DotRecordBasedJavaFxNode createExample11_3() {
		RootNode node = new RootNode();

		node.addText(" ");
		node.addText("Data store one");

		return node;
	}

	// example11_4 [label="<f0> |<f1> Data store two"]
	public static DotRecordBasedJavaFxNode createExample11_4() {
		RootNode node = new RootNode();

		node.addText(" ");
		node.addText("Data store two");

		return node;
	}

	// example12_1 [label="{{SPACE|24}|00}"]
	public static DotRecordBasedJavaFxNode createExample12_1() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();
		LabelNode subnode = node.provideChildNode();

		root.addRotatedLabel(node);
		node.addRotatedLabel(subnode);
		subnode.addText("SPACE");
		subnode.addText("24");
		node.addText("00");

		return root;
	}

	// example12_2 [label="{{DOT|1}|0101010}"]
	public static DotRecordBasedJavaFxNode createExample12_2() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();
		LabelNode subnode = node.provideChildNode();

		root.addRotatedLabel(node);
		node.addRotatedLabel(subnode);
		subnode.addText("DOT");
		subnode.addText("1");
		node.addText("0101010");

		return root;
	}

	// example12_3 [label="{{COMA|1}|0110110}"]
	public static DotRecordBasedJavaFxNode createExample12_3() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();
		LabelNode subnode = node.provideChildNode();

		root.addRotatedLabel(node);
		node.addRotatedLabel(subnode);
		subnode.addText("COMA");
		subnode.addText("1");
		node.addText("0110110");

		return root;
	}

	// example12_4 [label="{{C|6}|11111}"]
	public static DotRecordBasedJavaFxNode createExample12_4() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();
		LabelNode subnode = node.provideChildNode();

		root.addRotatedLabel(node);
		node.addRotatedLabel(subnode);
		subnode.addText("C");
		subnode.addText("6");
		node.addText("11111");

		return root;
	}

	// example13_1 [label = "\n\nDecl|{name|access|decl_flags|extern_c_linkage}"]
	public static DotRecordBasedJavaFxNode createExample13_1() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		root.addText("\\n\\nDecl");
		root.addRotatedLabel(node);
		node.addText("name");
		node.addText("access");
		node.addText("decl_flags");
		node.addText("extern_c_linkage");

		return root;
	}

	// example13_2 [label = "Nontype_decl|{type}"]
	public static DotRecordBasedJavaFxNode createExample13_2() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		root.addText("Nontype_decl");
		root.addRotatedLabel(node);
		node.addText("type");

		return root;
	}

	// example13_3 [label = "Function_decl|{formals|defaults}"]
	public static DotRecordBasedJavaFxNode createExample13_3() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		root.addText("Function_decl");
		root.addRotatedLabel(node);
		node.addText("formals");
		node.addText("defaults");

		return root;
	}

	// example13_4 [label = "Function|{body}"]
	public static DotRecordBasedJavaFxNode createExample13_4() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		root.addText("Function");
		root.addRotatedLabel(node);
		node.addText("body");

		return root;
	}

	// example14_1
	// [label="{org.eclipse.gef.dot.internal.\lDotAttributes.DoubleValidator\n|-
	// minValue\l|+ DoubleValidator()\l+ validate()\l}"]

	public static DotRecordBasedJavaFxNode createExample14_1() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		root.addRotatedLabel(node);
		node.addText("org.eclipse.gef.dot.internal.\\lDotAttributes.DoubleValidator\\n");
		node.addText("-minValue\\l");
		node.addText("+ DoubleValidator()\\l+ validate()\\l");

		return root;
	}

	// example14_2
	// [label="{org.eclipse.gef.dot.internal.\lDotAttributes.IAttributeValueValidator\l\<
	// Double \>\n||+ validate()\l}"]
	public static DotRecordBasedJavaFxNode createExample14_2() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		root.addRotatedLabel(node);
		node.addText("org.eclipse.gef.dot.internal.\\lDotAttributes.IAttributeValueValidator\\l<Double>\\n");
		node.addText(" ");
		node.addText("+ validate()\\l");

		return root;
	}

	// example15_1 [label="{Injector\n||}"]

	public static DotRecordBasedJavaFxNode createExample15_1() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		root.addRotatedLabel(node);
		node.addText("Injector\\n");
		node.addText(" ");
		node.addText(" ");

		return root;
	}

	// example15_2 [label="{org.eclipse.gef.dot.internal.\lDotAttributes\n|+
	// _NAME__GNE\l+ _TYPE__G\l+ ARROWHEAD__E\l+ ARROWSIZE__E\l+ ARROWTAIL__E\l+
	// BB__GC\l+ BGCOLOR__GC\l+ CLUSTERRANK__G\l+ COLOR__CNE\l+
	// COLORSCHEME__GCNE\land 30 more...\l- DIRTYPE_PARSER\l- DIRTYPE_SERIALIZER\l-
	// LAYOUT_SERIALIZER\l- CLUSTERMODE_PARSER\l- CLUSTERMODE_SERIALIZER\l-
	// OUTPUTMODE_PARSER\l- OUTPUTMODE_SERIALIZER\l- PAGEDIR_PARSER\l-
	// PAGEDIR_SERIALIZER\l- RANKDIR_PARSER\land 35 more...\l|+ isCluster()\l+
	// getContext()\l+ validateAttributeRawValue()\l+ _getNameRaw()\l+ _getName()\l+
	// _getNameRaw()\l+ _getName()\l+ _getType()\l+ _setNameRaw()\l+ _setName()\land
	// 314 more...\l- serializeAttributeValue()\l- parseAttributeValue()\l-
	// validateAttributeRawValue()\l- checkAttributeRawValue()\l}"]
	public static DotRecordBasedJavaFxNode createExample15_2() {
		RootNode root = new RootNode();
		LabelNode node = root.provideChildNode();

		root.addRotatedLabel(node);
		node.addText("org.eclipse.gef.dot.internal.\\lDotAttributes\\n");
		node.addText(
				"+ _NAME__GNE\\l+ _TYPE__G\\l+ ARROWHEAD__E\\l+ ARROWSIZE__E\\l+ ARROWTAIL__E\\l+ BB__GC\\l+ BGCOLOR__GC\\l+ CLUSTERRANK__G\\l+ COLOR__CNE\\l+ COLORSCHEME__GCNE\\land 30 more...\\l- DIRTYPE_PARSER\\l- DIRTYPE_SERIALIZER\\l- LAYOUT_SERIALIZER\\l- CLUSTERMODE_PARSER\\l- CLUSTERMODE_SERIALIZER\\l- OUTPUTMODE_PARSER\\l- OUTPUTMODE_SERIALIZER\\l- PAGEDIR_PARSER\\l- PAGEDIR_SERIALIZER\\l- RANKDIR_PARSER\\land 35 more...\\l");
		node.addText(
				"+ isCluster()\\l+ getContext()\\l+ validateAttributeRawValue()\\l+ _getNameRaw()\\l+ _getName()\\l+ _getNameRaw()\\l+ _getName()\\l+ _getType()\\l+ _setNameRaw()\\l+ _setName()\\land 314 more...\\l- serializeAttributeValue()\\l- parseAttributeValue()\\l- validateAttributeRawValue()\\l- checkAttributeRawValue()\\l");

		return root;
	}

	private static class RecordBasedLabelLine extends Region {
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

		public void addRotatedLabel(LabelNode label);

		public LabelNode provideChildNode();
	}

	private static class RootNode extends HLabelNode {
		public RootNode() {
			this(RECORD_BORDER);
		}

		public RootNode(Border border) {
			setBorder(border);
			setPrefHeight(PREF_HEIGHT);
			setPrefWidth(PREF_WIDTH);

			// TODO check if there is a better way to achieve this
			setMaxHeight(USE_PREF_SIZE);
			setMaxWidth(USE_PREF_SIZE);
		}

		@Override
		public void addRotatedLabel(LabelNode label) {
			setHgrow((Node) label, Priority.ALWAYS);
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
			separatorUnlessFirstField();
			Node text = new TextHelper(string).getNode();
			setMargin(text, TEXT_MARGINS);
			getChildren().add(text);
		}

		@Override
		public void addRotatedLabel(LabelNode label) {
			separatorUnlessFirstField();
			getChildren().add((Node) label);
		}

		private void separatorUnlessFirstField() {
			if (!firstField)
				addLine();
			else
				firstField = false;
		}

		private void addLine() {
			getChildren().add(new RecordBasedLabelLine(Orientation.HORIZONTAL));
		}

	}

	private static class VLabelNode extends VBox implements LabelNode {
		boolean firstField = true;

		public VLabelNode() {
			setAlignment(Pos.CENTER);
		}

		@Override
		public LabelNode provideChildNode() {
			return new HLabelNode();
		}

		public void addText(String string) {
			separatorUnlessFirstField();
			Node text = new TextHelper(string).getNode();
			setMargin(text, TEXT_MARGINS);
			getChildren().add(text);
		}

		@Override
		public void addRotatedLabel(LabelNode label) {
			separatorUnlessFirstField();
			getChildren().add((Node) label);
		}

		private void separatorUnlessFirstField() {
			if (!firstField)
				addLine();
			else
				firstField = false;
		}

		private void addLine() {
			getChildren().add(new RecordBasedLabelLine(Orientation.VERTICAL));
		}

	}

	private static class TextLine {
		Pos pos = null;
		String line = "";

		public TextLine(String line, Pos pos) {
			this.line = line;
			this.pos = pos;
		}
	}

	private static class TextHelper {
		private final String string;

		public TextHelper(String string) {
			// HTML unescaped
			string = StringEscapeUtils.unescapeHtml(string);
			// Whitespace removed
			string = string.replaceAll("\t\\s+", "\t").replaceAll(" \\s+", " ").replaceAll("[^ \t&&\\s]+", "");
			// Whitespace unescaped
			this.string = string.replaceAll("\\\\(\\s)", "$1");
		}

		public Node getNode() {
			VBox textContainer = new VBox();
			textContainer.setAlignment(Pos.CENTER);
			List<TextLine> lines = makeLines(string);
			for (TextLine line : lines) {
				HBox alignmentBox = new HBox();
				alignmentBox.setAlignment(line.pos != null ? line.pos : Pos.CENTER);
				alignmentBox.getChildren().add(new Text(line.line));
				textContainer.getChildren().add(alignmentBox);
			}
			return textContainer;
		}

		private List<TextLine> makeLines(String string) {
			List<TextLine> lines = new ArrayList<TextLine>();
			int index = 0;
			int indexLast = -1;
			do {
				int indexNew = string.indexOf('\\', Math.max(index, indexLast + 1));
				Pos pos = null;
				String substring;
				try {
					substring = string.substring(index, indexNew);
					switch (string.charAt(indexNew + 1)) {
					case 'n':
						pos = Pos.CENTER;
						break;
					case 'l':
						pos = Pos.CENTER_LEFT;
						break;
					case 'r':
						pos = Pos.CENTER_RIGHT;
						break;
					default:
						indexLast = indexNew;
						continue;
					}
					index = indexNew + 2;
				} catch (IndexOutOfBoundsException e) {
					if (index >= string.length())
						break;
					substring = string.substring(index);
					index = indexNew;
				}
				lines.add(new TextLine(substring, pos));
			} while (index >= 0);

			return lines;
		}
	}

}
