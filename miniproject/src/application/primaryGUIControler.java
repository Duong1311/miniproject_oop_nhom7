package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class primaryGUIControler  extends Controller {
	@FXML
	
	
	public void AddVertex(ActionEvent event) throws IOException
	{	
		
		FXMLLoader loader= new FXMLLoader(getClass().getResource("DrawGraphPanel.fxml"));
		Parent root = loader.load();
		stage = (Stage)( (Node) event.getSource() ).getScene().getWindow();
		scene = new Scene(root);
		showGraph(( AnchorPane)root,graph);
			
		addVertexController controller = new  addVertexController();
	  	controller.addVertex(root,scene);
	    
	    stage.setScene(scene);
		stage.show();
	}
	
	
	public void AddEdge(ActionEvent event) throws IOException
	{	
		
		FXMLLoader loader= new FXMLLoader(getClass().getResource("DrawEdgePanel.fxml"));
		Parent root = loader.load();
		stage = (Stage)( (Node) event.getSource() ).getScene().getWindow();
		scene = new Scene(root);
		
		showGraph(( AnchorPane)root,graph);
		addEdgeController controller = new  addEdgeController();
	  	controller.addEdge(root,scene);
	  	
		stage.setScene(scene);
		stage.show();
	}
	
	public void TopoSort(ActionEvent event) throws IOException{
		FXMLLoader loader= new FXMLLoader(getClass().getResource("TopoSort.fxml"));
		Parent root = loader.load();
		stage = (Stage)( (Node) event.getSource() ).getScene().getWindow();
		scene = new Scene(root);
		//TopoSortController controller = new  TopoSortController();
	  	
		
		showGraph(( AnchorPane)root,graph);
		
		stage.setScene(scene);
		stage.show();
	}
	
	
	
	
	
	
}