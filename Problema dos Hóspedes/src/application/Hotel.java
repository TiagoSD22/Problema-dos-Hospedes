package application;

import java.util.Random;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Hotel extends Application {
	
	public Hospede hospedes[];
	public int n_hospedes,n_canais,t_min_assistir, t_max_assistir, t_min_descanso, t_max_descanso;
	public Sala sala;
	private boolean simplificar,mostrar_tutorial;
	public FXML_Controlador_Hotel hotel;
	
	public Hotel(int n_hospedes, int n_canais, int t_min_assistir, int t_max_assistir, int t_min_descanso, int t_max_descanso,boolean simplificar,boolean mostrar_tutorial){
		this.n_hospedes = n_hospedes;
		this.n_canais = n_canais;
		this.t_min_assistir = t_min_assistir;
		this.t_max_assistir = t_max_assistir;
		this.t_min_descanso = t_min_descanso;
		this.t_max_descanso = t_max_descanso;
		this.simplificar = simplificar;
		this.mostrar_tutorial = mostrar_tutorial;
	}
	
	public void Criar_Hospedes(Pane root,FXML_Controlador_Hotel hotel){
		int i,canalf,t_assistir,t_descanso,s;
		char sexo;
		hospedes = new Hospede[n_hospedes];
		sala = new Sala();
		Random rand = new Random();
		for(i = 0; i < n_hospedes; i++){
			canalf = 1 + rand.nextInt(n_canais);
			t_assistir = t_min_assistir + rand.nextInt((t_max_assistir - t_min_assistir) + 1);
			t_descanso = t_min_descanso + rand.nextInt((t_max_descanso - t_min_descanso) + 1);
			s = 1 + rand.nextInt(100);
			if(s <= 50){
				sexo = 'F';
			}
			else{
				sexo = 'M';
			}
			hospedes[i] = new Hospede(root,hotel,sala,i+1,sexo,canalf,t_assistir,t_descanso);
		}
	}
	
	public void Parar(Stage s){
		int i;
		for(i = 0; i < n_hospedes; i++){
			hospedes[i].Parar_Hospede();
			hospedes[i] = null;;
		}
		hotel = null;
		s = null;
		System.gc();
	    Platform.exit();
		System.exit(0);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML_InHotel.fxml"));
			hotel = new FXML_Controlador_Hotel();
			loader.setController(hotel);
			Pane root = loader.load();
			Scene tela = new Scene(root,1280,668);
			primaryStage.setScene(tela);
			primaryStage.setTitle("INTERIOR DO HOTEL");
			primaryStage.setResizable(false);
			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/Fontes/Imagens/icone.jpg")));
			primaryStage.setOnCloseRequest(event -> {
				event.consume();
				Parar(primaryStage);
			});
			primaryStage.show();
			hotel.set_simplificar(this.simplificar);
			Criar_Hospedes(root,hotel);
			hotel.set_hospedes(hospedes,n_hospedes);
			hotel.Setar_Tutorial(this.mostrar_tutorial);
			int i;
			for(i = 0; i < n_hospedes; i++){
				hospedes[i].setHotel(hotel);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
