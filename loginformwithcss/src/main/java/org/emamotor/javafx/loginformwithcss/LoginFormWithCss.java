package org.emamotor.javafx.loginformwithcss;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Fancy Forms with JavaFX CSS
 *
 * @see `http://docs.oracle.com/javase/8/javafx/get-started-tutorial/css.htm`
 * @author tanabe
 */
public class LoginFormWithCss extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("JavaFX Welcome");

    GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(10);
    gridPane.setVgap(10);
    gridPane.setPadding(new Insets(25, 25, 25, 25));

    Scene scene = new Scene(gridPane, 350, 275);
    primaryStage.setScene(scene);
    String css = LoginFormWithCss.class.getResource("/style.css").toExternalForm();
    scene.getStylesheets().add(css);

    Text sceneTitle = new Text("Welcome");
    sceneTitle.setId("welcome-text");
    gridPane.add(sceneTitle, 0, 0, 2, 1);

    Label userName = new Label("User Name");
    gridPane.add(userName, 0, 1);

    TextField userTextField = new TextField();
    gridPane.add(userTextField, 1, 1);

    Label password = new Label("Password");
    gridPane.add(password, 0, 2);

    PasswordField passwordField = new PasswordField();
    gridPane.add(passwordField, 1, 2);

    Button signInButton = new Button("Sign in");
    HBox hBox = new HBox(10);
    hBox.setAlignment(Pos.BOTTOM_RIGHT);
    hBox.getChildren().add(signInButton);
    gridPane.add(hBox, 1, 4);

    Text actionTarget = new Text();
    gridPane.add(actionTarget, 1, 6);

    signInButton.setOnAction(event -> {
      actionTarget.setId("actiontarget");
      actionTarget.setText("Sign in button pressed");
    });

    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
