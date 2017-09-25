package recordbasednodeshapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxExample00 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Dot Record Label Example00");

        //node definitions with record based node shapes
        DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample01 = DotRecordBasedJavaFxNode.createExample01();
        DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample02 = DotRecordBasedJavaFxNode.createExample02();
        DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample03 = DotRecordBasedJavaFxNode.createExample03();
        DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample04_1 = DotRecordBasedJavaFxNode.createExample04_1();
        DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample04_2 = DotRecordBasedJavaFxNode.createExample04_2();
        DotRecordBasedJavaFxNode dotRecordBasedJavaFxNodeExample04_3 =  DotRecordBasedJavaFxNode.createExample04_3();
        // TODO: define further DotRecordBasedJafaFxNode objects from the example00.dot file

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
        
  
        Scene scene = new Scene(examplesVerticalBox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
