/*
 * @see http://docs.oracle.com/javase/8/javafx/get-started-tutorial/hello_world.htm
 */
package org.emamotor.javafx.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Hello World, JavaFX Style
 *
 * @see `http://docs.oracle.com/javase/8/javafx/get-started-tutorial/hello_world.htm`
 * @author tanabe
 */
public class HelloWorld extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Button button = new Button();
    button.setText("Say 'HelloWorld'");
    button.setOnAction(event -> System.out.println("Hello World!"));
    StackPane root = new StackPane();
    root.getChildren().add(button);

    Scene scene = new Scene(root, 300, 250);

    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
