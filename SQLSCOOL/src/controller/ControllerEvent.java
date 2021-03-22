package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ControllerEvent {
	
	@FXML AnchorPane border_pan;
	private boolean isOpen = true;
	
	
	@FXML
	public void startHomePage(MouseEvent event) throws IOException {
		Stage stage =   (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane pan = FXMLLoader.load(getClass().getResource("/view/fileXml/home.fxml"));
		Scene scene = new Scene(pan,1000,800);
		stage.setScene(scene);
	}
	

	
	@FXML
	public void openChapitre(MouseEvent event) throws IOException {
		Stage stage =   (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane pan = FXMLLoader.load(getClass().getResource("/view/fileXml/chapitre.fxml"));
		Scene scene = new Scene(pan,1000,800);
		stage.setScene(scene);
	}

     
	@FXML 
	public void closeAndOpenSideBar(MouseEvent event) {
		Stage stage =   (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane anchorPane = (AnchorPane) stage.getScene().rootProperty().get(); 
		ScrollPane scrollPane = (ScrollPane) anchorPane.getChildren().get(1); 
		AnchorPane anchorPane2 = (AnchorPane) scrollPane.getContent(); 
		VBox sideBar = (VBox) anchorPane2.getChildren().get(0);
		if(isOpen) {
			isOpen = false;
			sideBar.setVisible(isOpen);
		} else {
			isOpen = true;
			sideBar.setVisible(isOpen);
		}
	} 
		
	@FXML 
	public void closeAndOpenParametreSideBare(MouseEvent event) {
		System.out.println("pa");
		Stage stage =   (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane anchorPane = (AnchorPane) stage.getScene().rootProperty().get(); 
		VBox sideBare = (VBox) anchorPane.getChildren().get(1);
		if(isOpen) {
			isOpen = false;
			sideBare.setVisible(isOpen);
		} else {
			isOpen = true;
			sideBare.setVisible(isOpen);
		}
	}
	
	@FXML public void openParametre(MouseEvent event) throws IOException {
		Stage stage =   (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane pan = FXMLLoader.load(getClass().getResource("/view/fileXml/parametre.fxml"));
		Scene scene = new Scene(pan,1000,800);
		stage.setScene(scene);
	}
	@FXML 
	public void openchapitre(MouseEvent event) throws IOException {
		Stage stage =   (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane pan = FXMLLoader.load(getClass().getResource("/view/fileXml/chapitre.fxml"));
		Scene scene = new Scene(pan,1000,800);
		stage.setScene(scene);
	}
	
	@FXML
	public void openExercice(MouseEvent event) throws IOException {
		Stage stage =   (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane pan = (AnchorPane) stage.getScene().rootProperty().get();
		ScrollPane scrollPane = (ScrollPane) pan.getChildren().get(1);
		AnchorPane anchorPane = (AnchorPane) scrollPane.getContent();
		VBox containerRight = (VBox) anchorPane.getChildren().get(1); 
		VBox pan1 = FXMLLoader.load(getClass().getResource("/view/fileXml/containerTutoriel.fxml"));
		containerRight.getChildren().add(pan1);
	}
		
	@FXML 
	public void openTraveauPratique(MouseEvent event) throws IOException {
		Stage stage =   (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane pan = FXMLLoader.load(getClass().getResource("/view/fileXml/stageExercice.fxml"));
		Scene scene = new Scene(pan,1000,800);
		stage.setScene(scene);
	}
	
	
	private void creatComponent() {
		VBox component = new VBox();
	}

}
