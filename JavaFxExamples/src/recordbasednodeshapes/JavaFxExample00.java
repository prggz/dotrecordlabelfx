package recordbasednodeshapes;

import javafx.application.Application;
import javafx.scene.Scene;
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

		HBox exampleAHorizontalBox = new HBox(20);
		exampleAHorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_1);
		exampleAHorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_2);
		exampleAHorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_3);
		exampleAHorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_4);
		exampleAHorizontalBox.getChildren().add(dotRecordBasedJavaFxNodeExample10_5);
		examplesVerticalBox.getChildren().add(exampleAHorizontalBox);

		Scene scene = new Scene(examplesVerticalBox, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
