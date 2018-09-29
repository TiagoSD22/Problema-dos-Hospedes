package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.Bloom;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FXML_Controlador implements Initializable {
	
	private MediaPlayer musica;
	private boolean existe_erro;
	@FXML
	private AnchorPane tela;
	@FXML
	private ImageView img_menu;
	@FXML
	private Button play_bt;
	@FXML
	private TextField n_canais,t_min_assistir,t_min_descansar,t_max_assistir,t_max_descansar; 
	@FXML
	private Spinner<Integer> n_hospedes;
	@FXML
	private ImageView alerta;
	@FXML
	private Pane menu_principal;
	@FXML
	private Pane welcome;
	@FXML 
	private ImageView welcomebg;
	@FXML
	private CheckBox simplificar;
	@FXML
	private CheckBox pular_tutorial;
	public boolean mostrar_tutorial = true;
	
	public FXML_Controlador(){
	}
	
	public void Fade_Menu(){
		double duracao_fade = 4.5;
		FadeTransition fade_in_img = new FadeTransition(Duration.seconds(duracao_fade),img_menu);
		FadeTransition fade_in_bt = new FadeTransition(Duration.seconds(duracao_fade),play_bt);
		FadeTransition fade_in_n_hospedes = new FadeTransition(Duration.seconds(duracao_fade),n_hospedes);
		FadeTransition fade_in_n_canais = new FadeTransition(Duration.seconds(duracao_fade),n_canais);
		FadeTransition fade_in_t_min_assistir = new FadeTransition(Duration.seconds(duracao_fade),t_min_assistir);
		FadeTransition fade_in_t_max_assistir = new FadeTransition(Duration.seconds(duracao_fade),t_max_assistir);
		FadeTransition fade_in_t_min_descansar = new FadeTransition(Duration.seconds(duracao_fade),t_min_descansar);
		FadeTransition fade_in_t_max_descansar = new FadeTransition(Duration.seconds(duracao_fade),t_max_descansar);
		fade_in_img.setFromValue(0.0);
		fade_in_img.setToValue(1.0);
		fade_in_bt.setFromValue(0.0);
		fade_in_bt.setToValue(0.4);
		fade_in_n_hospedes.setFromValue(0.0);
		fade_in_n_hospedes.setToValue(0.7);
		fade_in_n_canais.setFromValue(0.0);
		fade_in_n_canais.setToValue(0.7);
		fade_in_t_min_assistir.setFromValue(0.0);
		fade_in_t_min_assistir.setToValue(0.7);
		fade_in_t_max_assistir.setFromValue(0.0);
		fade_in_t_max_assistir.setToValue(0.7);
		fade_in_t_min_descansar.setFromValue(0.0);
		fade_in_t_min_descansar.setToValue(0.7);
		fade_in_t_max_descansar.setFromValue(0.0);
		fade_in_t_max_descansar.setToValue(0.7);
		ParallelTransition paralelo1 = new ParallelTransition(fade_in_img,fade_in_bt);
		ParallelTransition paralelo2 = new ParallelTransition(fade_in_n_hospedes,fade_in_n_canais);
		ParallelTransition paralelo3 = new ParallelTransition(paralelo1,paralelo2);
		ParallelTransition paralelo4 = new ParallelTransition(fade_in_t_min_assistir,fade_in_t_max_assistir);
		ParallelTransition paralelo5 = new ParallelTransition(paralelo3,paralelo4);
		ParallelTransition paralelo6 = new ParallelTransition(fade_in_t_min_descansar,fade_in_t_max_descansar);
		ParallelTransition paralelo7 = new ParallelTransition(paralelo5,paralelo6);
		paralelo7.setOnFinished(event -> Animar_Botao());
		paralelo7.play();
	}
	
	public void Setar_Turorial(boolean valor){
		this.mostrar_tutorial = valor;
		if(!valor){
			this.pular_tutorial.setVisible(false);
		}
	}
	
	public void Animar_Botao(){
		ScaleTransition scale = new ScaleTransition(Duration.seconds(1.7),play_bt);
		FadeTransition fade = new FadeTransition(Duration.seconds(1.7),play_bt);
		Bloom bloom = new Bloom(1.0);
		Timeline timeline = new Timeline(
				new KeyFrame(Duration.seconds(3), 
						new KeyValue(bloom.thresholdProperty(),1.0)),
				new KeyFrame(Duration.seconds(7), 
						new KeyValue(bloom.thresholdProperty(),0.8)),
				new KeyFrame(Duration.seconds(11), 
						new KeyValue(bloom.thresholdProperty(),1.0)),
				new KeyFrame(Duration.seconds(16), 
						new KeyValue(bloom.thresholdProperty(),1.0))
		);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.setAutoReverse(true);
		img_menu.setEffect(bloom);
		scale.setToX(1.15);
		scale.setToY(1.15);
		fade.setFromValue(0.35);
		fade.setToValue(0.8);
		ParallelTransition paralelo = new ParallelTransition(scale,fade);
		ParallelTransition paralelo2 = new ParallelTransition(paralelo,timeline);
		paralelo.setAutoReverse(true);
		paralelo.setCycleCount(Animation.INDEFINITE);
		paralelo2.setAutoReverse(true);
		paralelo2.setCycleCount(Animation.INDEFINITE);
		paralelo2.play();
	}
	
	public void Alerta_Animacao(){
		FadeTransition fade = new FadeTransition(Duration.seconds(2.5),alerta);
		FadeTransition fade2 = new FadeTransition(Duration.seconds(2),alerta);
		alerta.setVisible(true);
		fade.setFromValue(0.2);
		fade.setToValue(0.75);
		fade.setCycleCount(1);
		fade.setAutoReverse(true);
		fade2.setFromValue(0.75);
		fade2.setToValue(0.0);
		fade.setOnFinished(event -> fade2.play());
		fade2.setOnFinished(event -> alerta.setVisible(false));
		fade.play();
	}
	
	public boolean Expressao_Numerica(String texto){
		for(char c : texto.toCharArray()){
			if(Character.isAlphabetic(c)){
				return false;
			}
		}
		return true;
	}
	
	public void Fechar_Menu(){
		boolean simples = false;
		if(simplificar.isSelected()){
			simples = true;
		}
		Hotel hotel = new Hotel(Integer.valueOf(n_hospedes.getEditor().getText()), Integer.valueOf(n_canais.getText()), Integer.valueOf(t_min_assistir.getText()),Integer.valueOf(t_max_assistir.getText()),Integer.valueOf(t_min_descansar.getText()),Integer.valueOf(t_max_descansar.getText()),simples,mostrar_tutorial);
		hotel.start(new Stage());
		Stage tela = (Stage)play_bt.getScene().getWindow();
		tela.close();
		tela = null;
	}
	
	@FXML
	private void Play_Pressionado(ActionEvent event){
		existe_erro = false;
		if(n_hospedes.getEditor().getText().isEmpty() || n_canais.getText().isEmpty() || t_min_assistir.getText().isEmpty() || t_min_descansar.getText().isEmpty() || t_max_assistir.getText().isEmpty() || t_max_descansar.getText().isEmpty()){
			existe_erro = true;
			//Algum campo vazio
		}
		else{
			if(!Expressao_Numerica(n_hospedes.getEditor().getText()) || !Expressao_Numerica(n_canais.getText()) || !Expressao_Numerica(t_min_assistir.getText()) || !Expressao_Numerica(t_max_assistir.getText()) || !Expressao_Numerica(t_min_descansar.getText()) || !Expressao_Numerica(t_max_descansar.getText())){
				existe_erro = true;
				//Algum valor nao numerico
			}
			else{
				if(Integer.valueOf(n_hospedes.getEditor().getText()) <= 0  || Integer.valueOf(n_canais.getText()) <= 0 || Integer.valueOf(t_min_assistir.getText()) <= 0 || Integer.valueOf(t_max_assistir.getText()) <= 0 || Integer.valueOf(t_min_descansar.getText()) <= 0 || Integer.valueOf(t_max_descansar.getText()) <= 0){
					existe_erro = true;
					//Algum valor negativo ou igual a 0
				}
				if(Integer.valueOf(n_hospedes.getEditor().getText()) > 10 || (Integer.valueOf(t_max_assistir.getText()) <= Integer.valueOf(t_min_assistir.getText())) || (Integer.valueOf(t_max_descansar.getText()) <= Integer.valueOf(t_min_descansar.getText()))){
					existe_erro = true;
					//Algum intervalo inconsistente ou mais de 10 hospedes
				}
			}
		}
		if(!existe_erro){
			play_bt.setDisable(true);
			n_hospedes.setDisable(true);
			n_canais.setDisable(true);
			t_min_assistir.setDisable(true);
			t_max_assistir.setDisable(true);
			t_min_descansar.setDisable(true);
			t_max_descansar.setDisable(true);
			double duracao = 2.0;
			welcome.setVisible(true);
			musica.stop();
			if(!simplificar.isSelected()){
				musica = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/start_run.mp3").toExternalForm()));
			}
			else{
				welcomebg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/welcome8bit.jpg")));
				musica = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/start_run8bit.wav").toExternalForm()));
			}
			if(pular_tutorial.isSelected()){
				mostrar_tutorial = false;
			}
			musica.play();
			FadeTransition fade_menu = new FadeTransition(Duration.seconds(duracao),menu_principal);
			FadeTransition fade_welcome = new FadeTransition(Duration.seconds(duracao),welcome);
			fade_menu.setFromValue(1.0);
			fade_menu.setToValue(0.0);
			fade_welcome.setFromValue(0.0);
			fade_welcome.setToValue(1.0);
			Timeline timeline = new Timeline();
		    KeyFrame key = new KeyFrame(Duration.seconds(2.5),
		                   new KeyValue (tela.getScene().getWindow().opacityProperty(), 0)); 
		    timeline.getKeyFrames().add(key); 
		    timeline.setOnFinished(e -> Fechar_Menu());
			ParallelTransition paralelo = new ParallelTransition(fade_menu,fade_welcome);
			paralelo.setOnFinished(e -> timeline.play());  
			paralelo.play();
		}
		else{
			if(!alerta.isVisible()){
				Alerta_Animacao();
			}
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,1);        
		n_hospedes.setValueFactory(valueFactory);  
		simplificar.setTooltip(new Tooltip("Selecione para carregar uma versão simplificada do programa, sem áudios e animações na TV."));
		t_min_assistir.setTooltip(new Tooltip("Tempo mínimo"));
		t_max_assistir.setTooltip(new Tooltip("Tempo máximo"));
		t_min_descansar.setTooltip(new Tooltip("Tempo mínimo"));
		t_max_descansar.setTooltip(new Tooltip("Tempo máximo"));
		pular_tutorial.setTooltip(new Tooltip("Eu já estive aqui, sei o que fazer..."));
		musica = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/menu_musica.mp3").toExternalForm()));
		musica.setCycleCount(MediaPlayer.INDEFINITE);
		musica.play();
		Fade_Menu();
	}
}
