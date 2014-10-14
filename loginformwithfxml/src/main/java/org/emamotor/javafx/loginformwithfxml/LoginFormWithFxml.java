package org.emamotor.javafx.loginformwithfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Using FXML to Create a User Interface
 *
 * @see `http://docs.oracle.com/javase/8/javafx/get-started-tutorial/fxml_tutorial.htm`
 * @author tanabe
 */
public class LoginFormWithFxml extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/fxml_example.fxml"));

    Scene scene = new Scene(root, 350, 275);

    primaryStage.setTitle("FXML Welcome");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
