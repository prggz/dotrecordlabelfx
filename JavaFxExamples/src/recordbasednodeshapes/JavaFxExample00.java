package recordbasednodeshapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxExample00 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Dot Record Label Example00");

		// node definitions with record based node shapes
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample01 = DotRecordBasedJavaFxNode.createExample01();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample02 = DotRecordBasedJavaFxNode.createExample02();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample03 = DotRecordBasedJavaFxNode.createExample03();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample04_1 = DotRecordBasedJavaFxNode.createExample04_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample04_2 = DotRecordBasedJavaFxNode.createExample04_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample04_3 = DotRecordBasedJavaFxNode.createExample04_3();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample05_1 = DotRecordBasedJavaFxNode.createExample05_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample05_2 = DotRecordBasedJavaFxNode.createExample05_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample05_3 = DotRecordBasedJavaFxNode.createExample05_3();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample06_1 = DotRecordBasedJavaFxNode.createExample06_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample06_2 = DotRecordBasedJavaFxNode.createExample06_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample06_3 = DotRecordBasedJavaFxNode.createExample06_3();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample06_4 = DotRecordBasedJavaFxNode.createExample06_4();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample07 = DotRecordBasedJavaFxNode.createExample07();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample08_1 = DotRecordBasedJavaFxNode.createExample08_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample08_2 = DotRecordBasedJavaFxNode.createExample08_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample09_1 = DotRecordBasedJavaFxNode.createExample09_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample09_2 = DotRecordBasedJavaFxNode.createExample09_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample09_3 = DotRecordBasedJavaFxNode.createExample09_3();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample10_1 = DotRecordBasedJavaFxNode.createExample10_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample10_2 = DotRecordBasedJavaFxNode.createExample10_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample10_3 = DotRecordBasedJavaFxNode.createExample10_3();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample10_4 = DotRecordBasedJavaFxNode.createExample10_4();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample10_5 = DotRecordBasedJavaFxNode.createExample10_5();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample11_1 = DotRecordBasedJavaFxNode.createExample11_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample11_2 = DotRecordBasedJavaFxNode.createExample11_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample11_3 = DotRecordBasedJavaFxNode.createExample11_3();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample11_4 = DotRecordBasedJavaFxNode.createExample11_4();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample12_1 = DotRecordBasedJavaFxNode.createExample12_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample12_2 = DotRecordBasedJavaFxNode.createExample12_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample12_3 = DotRecordBasedJavaFxNode.createExample12_3();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample12_4 = DotRecordBasedJavaFxNode.createExample12_4();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample13_1 = DotRecordBasedJavaFxNode.createExample13_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample13_2 = DotRecordBasedJavaFxNode.createExample13_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample13_3 = DotRecordBasedJavaFxNode.createExample13_3();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample13_4 = DotRecordBasedJavaFxNode.createExample13_4();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample14_1 = DotRecordBasedJavaFxNode.createExample14_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample14_2 = DotRecordBasedJavaFxNode.createExample14_2();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample15_1 = DotRecordBasedJavaFxNode.createExample15_1();
		DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample15_2 = DotRecordBasedJavaFxNode.createExample15_2();

		// DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample04_3 =
		// DotRecordBasedJavaFxNode.createExample04_3();

		// TODO: define further DotRecordBasedJafaFxNode objects from the example00.dot
		// file

		// layouting information
		VBox examplesVerticalBox = new VBox(20);

		examplesVerticalBox.getChildren().add(dotRecordBasedJavaFxNodeExample01);
		examplesVerticalBox.getChildren().add(dotRecordBasedJavaFxNodeExample02);
		examplesVerticalBox.getChildren().add(dotRecordBasedJavaFxNodeExample03);

		HBox example4HorizontalBox = new HBox(20);
		example4HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample04_1);
		example4HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample04_2);
		example4HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample04_3);
		examplesVerticalBox.getChildren().add(example4HorizontalBox);

		HBox example5HorizontalBox = new HBox(20);
		example5HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample05_1);
		example5HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample05_2);
		example5HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample05_3);
		examplesVerticalBox.getChildren().add(example5HorizontalBox);

		HBox example6HorizontalBox = new HBox(20);
		example6HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample06_1);
		example6HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample06_2);
		example6HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample06_3);
		example6HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample06_4);
		examplesVerticalBox.getChildren().add(example6HorizontalBox);
		
		examplesVerticalBox.getChildren().add(dotRecordBasedJavaFxNodeExample07);

		HBox example8HorizontalBox = new HBox(20);
		example8HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample08_1);
		example8HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample08_2);
		examplesVerticalBox.getChildren().add(example8HorizontalBox);

		HBox example9HorizontalBox = new HBox(20);
		example9HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample09_1);
		example9HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample09_2);
		example9HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample09_3);
		examplesVerticalBox.getChildren().add(example9HorizontalBox);

		HBox example10HorizontalBox = new HBox(20);
		example10HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_1);
		example10HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_2);
		example10HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_3);
		example10HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_4);
		example10HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_5);
		examplesVerticalBox.getChildren().add(example10HorizontalBox);

		HBox example11HorizontalBox = new HBox(20);
		example11HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample11_1);
		example11HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample11_2);
		example11HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample11_3);
		example11HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample11_4);
		examplesVerticalBox.getChildren().add(example11HorizontalBox);

		HBox example12HorizontalBox = new HBox(20);
		example12HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample12_1);
		example12HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample12_2);
		example12HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample12_3);
		example12HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample12_4);
		examplesVerticalBox.getChildren().add(example12HorizontalBox);

		HBox example13HorizontalBox = new HBox(20);
		example13HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample13_1);
		example13HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample13_2);
		example13HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample13_3);
		example13HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample13_4);
		examplesVerticalBox.getChildren().add(example13HorizontalBox);

		HBox example14HorizontalBox = new HBox(20);
		example14HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample14_1);
		example14HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample14_2);
		examplesVerticalBox.getChildren().add(example14HorizontalBox);

		HBox example15HorizontalBox = new HBox(20);
		example15HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample15_1);
		example15HorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample15_2);
		examplesVerticalBox.getChildren().add(example15HorizontalBox);

		ScrollPane scroll = new ScrollPane(examplesVerticalBox);
		
		Scene scene = new Scene(scroll, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
