package sample;
// package fxmlexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
        primaryStage.setTitle("Como te llamas? Shakira? Shakira?");
        primaryStage.setScene(new Scene(root, 400, 275));
        primaryStage.show();
    }

		@FXML
		private Text actiontarget;

		@FXML
		protected void handleSubmitButtonAction(ActionEvent event) {
			actiontarget.setText("Sign in button pressed");
		}

    public static void main(String[] args) {
        launch(args);
    }
}