package org.emamotor.javafx.loginformwithfxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/**
 * @author tanabe
 */
public class FxmlExampleController {

  @FXML
  private Text actiontarget;

  @FXML
  private void handleSubmitButtonAction(ActionEvent event) {
    actiontarget.setText("Sign in button pressed");
  }

}
