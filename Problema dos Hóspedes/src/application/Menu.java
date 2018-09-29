package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;


public class Menu extends Application {
	private FXML_Controlador menu;
	
	public void Mostrar_Tutorial(boolean valor){
		menu.Setar_Turorial(valor);
	}
	
	public void Fechar(){
		menu = null;
		System.gc();
		Platform.exit();
		System.exit(0);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_Menu.fxml"));
			menu = new FXML_Controlador();
			loader.setController(menu);
			Pane root = loader.load();
			Scene tela = new Scene(root,710,530);
			primaryStage.setScene(tela);
			primaryStage.setTitle("MENU");
			primaryStage.setResizable(false);
			primaryStage.setOnCloseRequest(event -> {
				event.consume();
				Fechar();
			});
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/Fontes/Imagens/icone.jpg")));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
