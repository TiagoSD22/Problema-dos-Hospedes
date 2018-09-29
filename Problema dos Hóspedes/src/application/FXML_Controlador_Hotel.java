package application;

import javafx.scene.paint.Color;
import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FXML_Controlador_Hotel implements Initializable {
	@FXML
	public Button menu;
	@FXML
	private Button prox;
	@FXML
	public Pane hospedes_pane;
	@FXML
	public Button mostrar_hospedes_bt;
	@FXML
	private ImageView h1_image;
	@FXML
	private ImageView h2_image;
	@FXML
	private ImageView h3_image;
	@FXML
	private ImageView h4_image;
	@FXML
	private ImageView h5_image;
	@FXML
	private ImageView h6_image;
	@FXML
	private ImageView h7_image;
	@FXML
	private ImageView h8_image;
	@FXML
	private ImageView h9_image;
	@FXML
	private ImageView h10_image;
	@FXML 
	private Label h1_label;
	@FXML
	private Label h2_label;
	@FXML
	private Label h3_label;
	@FXML
	private Label h4_label;
	@FXML
	private Label h5_label;
	@FXML
	private Label h6_label;
	@FXML
	private Label h7_label;
	@FXML
	private Label h8_label;
	@FXML
	private Label h9_label;
	@FXML
	private Label h10_label;
	@FXML 
	private Label h1status_label;
	@FXML
	private Label h2status_label;
	@FXML
	private Label h3status_label;
	@FXML
	private Label h4status_label;
	@FXML
	private Label h5status_label;
	@FXML
	private Label h6status_label;
	@FXML
	private Label h7status_label;
	@FXML
	private Label h8status_label;
	@FXML
	private Label h9status_label;
	@FXML
	private Label h10status_label;
	@FXML 
	private Label h1_info;
	@FXML
	private Label h2_info;
	@FXML
	private Label h3_info;
	@FXML
	private Label h4_info;
	@FXML
	private Label h5_info;
	@FXML
	private Label h6_info;
	@FXML
	private Label h7_info;
	@FXML
	private Label h8_info;
	@FXML
	private Label h9_info;
	@FXML
	private Label h10_info;
	@FXML
	private Label canal_info;
	@FXML
	public TextArea log;
	@FXML
	private ScrollPane log_pane;
	@FXML
	private Button log_bt;
	@FXML
	private ImageView canalbg;
	
	public Hospede hospedes[];
	private Thread hospedest[];
	private int n_hospedes;
	
	@FXML
	private ImageView h1;
	@FXML
	private ImageView h2;
	@FXML
	private ImageView h3;
	@FXML
	private ImageView h4;
	@FXML
	private ImageView h5;
	@FXML
	private ImageView h6;
	@FXML
	private ImageView h7;
	@FXML
	private ImageView h8;
	@FXML
	private ImageView h9;
	@FXML
	private ImageView h10;
	@FXML
	private ImageView sala;
	@FXML
	private ImageView bloqueio;
	@FXML
	private ImageView descanso;
	@FXML
	public ImageView controle;
	@FXML
	private ImageView bg;
	@FXML
	private ImageView tv;
	private int h1status,h2status,h3status,h4status,h5status,h6status,h7status,h8status,h9status,h10status;
	public Timeline programas;
	private KeyFrame canal1[];
	private KeyFrame canal2[];
	private KeyFrame canal3[];
	private KeyFrame canal4[];
	private KeyFrame canal5[];
	private KeyFrame canal6[];
	private KeyFrame canal7[];
	private KeyFrame canal8[];
	private KeyFrame canal9[];
	private KeyFrame canal10[];
	public MediaPlayer audio_canal,musica_tutorial;
	public boolean simplificar,mostrar_tutorial;
	private int passo_tutorial = 0;
	private ScaleTransition prox_scale;
	
	public FXML_Controlador_Hotel(){
	}
	
	public void set_simplificar(boolean simplificar){
		this.simplificar = simplificar;
	}
	
	public void set_hospedes(Hospede hospedes[], int n_hospedes){
		this.hospedes = hospedes;
		this.n_hospedes = n_hospedes;
		hospedest = new Thread[n_hospedes];
		for(int i = 0; i < n_hospedes; i++){
			hospedest[i] = new Thread(this.hospedes[i]);
		}
	}
	
	public void Mostrar_Hospede_Tempo(int id,int tempo){
		switch (id) {
		case 1:
			Platform.runLater(() ->{
					try{
						h1_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 2:
			Platform.runLater(() ->{
					try{
						h2_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 3:
			Platform.runLater(() ->{
					try{
						h3_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 4:
			Platform.runLater(() ->{
					try{
						h4_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 5:
			Platform.runLater(() ->{
					try{
						h5_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 6:
			Platform.runLater(() ->{
					try{
						h6_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 7:
			Platform.runLater(() ->{
					try{
						h7_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 8:
			Platform.runLater(() ->{
					try{
						h8_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 9:
			Platform.runLater(() ->{
					try{
						h9_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		case 10:
			Platform.runLater(() ->{
					try{
						h10_info.setText(String.valueOf(tempo));
					}
					catch(Exception e){
						
					}
				});
			break;
		default:
			break;
		}
	}
	
	public void Animacao_Assistir_tv(int id){
		switch (id) {
		case 1:
			h1.setVisible(true);
			if(h1status == 0){
				h1status = 1;
				h1.setX(454);
				h1.setY(445);
				h1status_label.setText("STATUS: ASSISTINDO");
				h1status_label.setTextFill(Color.LIMEGREEN);
				h1_info.relocate(h1.getX() + 20, h1.getY() - 10);
			}
			if(h1status == 2){
				double duracao = 3;
				h1status = 1;
				h1_info.setVisible(false);
				Path caminho = new Path();
				caminho.getElements().add(new MoveTo(1050,530));
				caminho.getElements().add(new LineTo(1000,375));
				caminho.getElements().add(new HLineTo(700));
				caminho.getElements().add(new VLineTo(385));
				caminho.getElements().add(new HLineTo(480));
				caminho.getElements().add(new VLineTo(470));
				
				PathTransition deslocar = new PathTransition();
				deslocar.setNode(h1);
				deslocar.setPath(caminho);
				deslocar.setDuration(Duration.seconds(duracao));
				deslocar.setCycleCount(1);
				deslocar.setAutoReverse(false);
				deslocar.setOnFinished(event -> Platform.runLater(() -> {
					Atualizar_infos(1,454,445,true);
					}));
				deslocar.play();
			}
			if(h1status == 3){
				double duracao = 3;
				h1status = 1;
				h1_info.setVisible(false);
				Path caminho = new Path();
				caminho.getElements().add(new MoveTo(351,44));
				caminho.getElements().add(new LineTo(545,200));
				caminho.getElements().add(new VLineTo(290));
				caminho.getElements().add(new HLineTo(480));
				caminho.getElements().add(new VLineTo(465));
				
				PathTransition deslocar = new PathTransition();
				deslocar.setNode(h1);
				deslocar.setPath(caminho);
				deslocar.setDuration(Duration.seconds(duracao));
				deslocar.setCycleCount(1);
				deslocar.setAutoReverse(false);
				deslocar.setOnFinished(event -> Platform.runLater(() -> {
					Atualizar_infos(1,454,445,true);
					}));
				deslocar.play();
				
			}
			break;
		case 2:
			h2.setVisible(true);
			if(h2status == 0){
				h2status = 1;
				h2.setX(496);
				h2.setY(445);
				h2status_label.setText("STATUS: ASSISTINDO");
				h2status_label.setTextFill(Color.LIMEGREEN);
				h2_info.relocate(h2.getX() + 20, h2.getY() - 10);
			}
			if(h2status == 2){
				double duracao = 3;
				h2status = 1;
				h2_info.setVisible(false);
				Path caminho2 = new Path();
				caminho2.getElements().add(new MoveTo(1050,465));
				caminho2.getElements().add(new LineTo(1000,375));
				caminho2.getElements().add(new HLineTo(700));
				caminho2.getElements().add(new VLineTo(385));
				caminho2.getElements().add(new HLineTo(525));
				caminho2.getElements().add(new VLineTo(470));
				
				PathTransition deslocar2 = new PathTransition();
				deslocar2.setNode(h2);
				deslocar2.setPath(caminho2);
				deslocar2.setDuration(Duration.seconds(duracao));
				deslocar2.setCycleCount(1);
				deslocar2.setAutoReverse(false);
				deslocar2.setOnFinished(event -> Atualizar_infos(2,504,445,true));
					
				deslocar2.play();
			}
			if(h2status == 3){
				double duracao = 3;
				h2status = 1;
				h2_info.setVisible(false);
				Path caminho2 = new Path();
				caminho2.getElements().add(new MoveTo(416,54));
				caminho2.getElements().add(new LineTo(585,200));
				caminho2.getElements().add(new VLineTo(285));
				caminho2.getElements().add(new HLineTo(520));
				caminho2.getElements().add(new VLineTo(465));
				
				PathTransition deslocar2 = new PathTransition();
				deslocar2.setNode(h2);
				deslocar2.setPath(caminho2);
				deslocar2.setDuration(Duration.seconds(duracao));
				deslocar2.setCycleCount(1);
				deslocar2.setAutoReverse(false);
				deslocar2.setOnFinished(event -> 
					Atualizar_infos(2,504,445,true)
				);
				deslocar2.play();
				
			}
			break;
		case 3:
			h3.setVisible(true);
			if(h3status == 0){
				h3status = 1;
				h3.setX(547);
				h3.setY(445);
				h3status_label.setText("STATUS: ASSISTINDO");
				h3status_label.setTextFill(Color.LIMEGREEN);
				h3_info.relocate(h3.getX() + 20, h3.getY() - 10);
			}
			if(h3status == 2){
				double duracao = 3;
				h3status = 1;
				h3_info.setVisible(false);
				Path caminho3 = new Path();
				caminho3.getElements().add(new MoveTo(1050,405));
				caminho3.getElements().add(new LineTo(1000,350));
				caminho3.getElements().add(new HLineTo(700));
				caminho3.getElements().add(new VLineTo(385));
				caminho3.getElements().add(new HLineTo(570));
				caminho3.getElements().add(new VLineTo(470));
				
				PathTransition deslocar3 = new PathTransition();
				deslocar3.setNode(h3);
				deslocar3.setPath(caminho3);
				deslocar3.setDuration(Duration.seconds(duracao));
				deslocar3.setCycleCount(1);
				deslocar3.setAutoReverse(false);
				deslocar3.setOnFinished(event ->
					Atualizar_infos(3,550,440,true));
				deslocar3.play();
			}
			if(h3status == 3){
				double duracao = 3;
				h3status = 1;
				h3_info.setVisible(false);
				Path caminho3 = new Path();
				caminho3.getElements().add(new MoveTo(471,54));
				caminho3.getElements().add(new LineTo(530,200));
				caminho3.getElements().add(new VLineTo(280));
				caminho3.getElements().add(new HLineTo(620));
				caminho3.getElements().add(new VLineTo(420));
				caminho3.getElements().add(new HLineTo(570));
				caminho3.getElements().add(new VLineTo(465));
				
				PathTransition deslocar3 = new PathTransition();
				deslocar3.setNode(h3);
				deslocar3.setPath(caminho3);
				deslocar3.setDuration(Duration.seconds(duracao));
				deslocar3.setCycleCount(1);
				deslocar3.setAutoReverse(false);
				deslocar3.setOnFinished(event -> 
					Atualizar_infos(3,550,440,true));
				deslocar3.play();
				
			}
			break;
		case 4:
			h4.setVisible(true);
			if(h4status == 0){
				h4status = 1;
				h4.setX(595);
				h4.setY(445);
				h4status_label.setText("STATUS: ASSISTINDO");
				h4status_label.setTextFill(Color.LIMEGREEN);
				h4_info.relocate(h4.getX() + 20, h4.getY() - 10);
			}
			if(h4status == 2){
				double duracao = 3;
				h4status = 1;
				h4_info.setVisible(false);
				Path caminho4 = new Path();
				caminho4.getElements().add(new MoveTo(1050,350));
				caminho4.getElements().add(new LineTo(1000,350));
				caminho4.getElements().add(new HLineTo(700));
				caminho4.getElements().add(new VLineTo(385));
				caminho4.getElements().add(new HLineTo(610));
				caminho4.getElements().add(new VLineTo(470));
				
				PathTransition deslocar4 = new PathTransition();
				deslocar4.setNode(h4);
				deslocar4.setPath(caminho4);
				deslocar4.setDuration(Duration.seconds(duracao));
				deslocar4.setCycleCount(1);
				deslocar4.setAutoReverse(false);
				deslocar4.setOnFinished(event ->
					Atualizar_infos(4,600,440,true));
				deslocar4.play();
			}
			if(h4status == 3){
				double duracao = 3;
				h4status = 1;
				h4_info.setVisible(false);
				Path caminho4 = new Path();
				caminho4.getElements().add(new MoveTo(526,54));
				caminho4.getElements().add(new LineTo(530,200));
				caminho4.getElements().add(new VLineTo(280));
				caminho4.getElements().add(new HLineTo(620));
				caminho4.getElements().add(new VLineTo(420));
				caminho4.getElements().add(new HLineTo(610));
				caminho4.getElements().add(new VLineTo(465));
				
				PathTransition deslocar4 = new PathTransition();
				deslocar4.setNode(h4);
				deslocar4.setPath(caminho4);
				deslocar4.setDuration(Duration.seconds(duracao));
				deslocar4.setCycleCount(1);
				deslocar4.setAutoReverse(false);
				deslocar4.setOnFinished(event -> 
					Atualizar_infos(4,600,440,true));
				deslocar4.play();
				
			}
			break;
		case 5:
			h5.setVisible(true);
			if(h5status == 0){
				h5status = 1;
				h5.setX(638);
				h5.setY(445);
				h5status_label.setText("STATUS: ASSISTINDO");
				h5status_label.setTextFill(Color.LIMEGREEN);
				h5_info.relocate(h5.getX() + 20, h5.getY() - 10);
			}
			if(h5status == 2){
				double duracao = 3;
				h5status = 1;
				h5_info.setVisible(false);
				Path caminho5 = new Path();
				caminho5.getElements().add(new MoveTo(1020,300));
				caminho5.getElements().add(new LineTo(1000,350));
				caminho5.getElements().add(new HLineTo(700));
				caminho5.getElements().add(new VLineTo(385));
				caminho5.getElements().add(new HLineTo(660));
				caminho5.getElements().add(new VLineTo(470));
				
				PathTransition deslocar5 = new PathTransition();
				deslocar5.setNode(h5);
				deslocar5.setPath(caminho5);
				deslocar5.setDuration(Duration.seconds(duracao));
				deslocar5.setCycleCount(1);
				deslocar5.setAutoReverse(false);
				deslocar5.setOnFinished(event ->
					Atualizar_infos(5,650,440,true));
				deslocar5.play();
			}
			if(h5status == 3){
				double duracao = 3;
				h5status = 1;
				h5_info.setVisible(false);
				Path caminho5 = new Path();
				caminho5.getElements().add(new MoveTo(581,54));
				caminho5.getElements().add(new LineTo(530,200));
				caminho5.getElements().add(new VLineTo(280));
				caminho5.getElements().add(new HLineTo(620));
				caminho5.getElements().add(new VLineTo(420));
				caminho5.getElements().add(new HLineTo(660));
				caminho5.getElements().add(new VLineTo(465));
				
				PathTransition deslocar5 = new PathTransition();
				deslocar5.setNode(h5);
				deslocar5.setPath(caminho5);
				deslocar5.setDuration(Duration.seconds(duracao));
				deslocar5.setCycleCount(1);
				deslocar5.setAutoReverse(false);
				deslocar5.setOnFinished(event -> 
					Atualizar_infos(5,650,440,true));
				deslocar5.play();
				
			}
			break;
		case 6:
			h6.setVisible(true);
			if(h6status == 0){
				h6status = 1;
				h6.setX(710);
				h6.setY(420);
				h6status_label.setText("STATUS: ASSISTINDO");
				h6status_label.setTextFill(Color.LIMEGREEN);
				h6_info.relocate(710, 440);
			}
			if(h6status == 2){
				double duracao = 3;
				h6status = 1;
				h6_info.setVisible(false);
				Path caminho6 = new Path();
				caminho6.getElements().add(new MoveTo(1025,130));
				caminho6.getElements().add(new LineTo(900,350));
				caminho6.getElements().add(new HLineTo(700));
				caminho6.getElements().add(new VLineTo(385));
				caminho6.getElements().add(new HLineTo(732));
				caminho6.getElements().add(new VLineTo(445));
				
				PathTransition deslocar6 = new PathTransition();
				deslocar6.setNode(h6);
				deslocar6.setPath(caminho6);
				deslocar6.setDuration(Duration.seconds(duracao));
				deslocar6.setCycleCount(1);
				deslocar6.setAutoReverse(false);
				deslocar6.setOnFinished(event ->
					Atualizar_infos(6,690,440,true));
				deslocar6.play();
			}
			if(h6status == 3){
				double duracao = 3;
				h6status = 1;
				h6_info.setVisible(false);
				Path caminho6 = new Path();
				caminho6.getElements().add(new MoveTo(636,54));
				caminho6.getElements().add(new LineTo(530,200));
				caminho6.getElements().add(new VLineTo(280));
				caminho6.getElements().add(new HLineTo(620));
				caminho6.getElements().add(new VLineTo(420));
				caminho6.getElements().add(new HLineTo(732));
				caminho6.getElements().add(new VLineTo(445));
				
				PathTransition deslocar6 = new PathTransition();
				deslocar6.setNode(h6);
				deslocar6.setPath(caminho6);
				deslocar6.setDuration(Duration.seconds(duracao));
				deslocar6.setCycleCount(1);
				deslocar6.setAutoReverse(false);
				deslocar6.setOnFinished(event -> 
					Atualizar_infos(6,690,440,true));
				deslocar6.play();
				
			}
			break;
		case 7:
			h7.setVisible(true);
			if(h7status == 0){
				h7status = 1;
				h7.setX(710);
				h7.setY(370);
				h7status_label.setText("STATUS: ASSISTINDO");
				h7status_label.setTextFill(Color.LIMEGREEN);
				h7_info.relocate(h7.getX() + 20, h7.getY() - 10);
			}
			if(h7status == 2){
				double duracao = 3;
				h7status = 1;
				h7_info.setVisible(false);
				Path caminho7 = new Path();
				caminho7.getElements().add(new MoveTo(900,150));
				caminho7.getElements().add(new VLineTo(350));
				caminho7.getElements().add(new HLineTo(700));
				caminho7.getElements().add(new VLineTo(385));
				caminho7.getElements().add(new LineTo(732,395));
				
				PathTransition deslocar7 = new PathTransition();
				deslocar7.setNode(h7);
				deslocar7.setPath(caminho7);
				deslocar7.setDuration(Duration.seconds(duracao));
				deslocar7.setCycleCount(1);
				deslocar7.setAutoReverse(false);
				deslocar7.setOnFinished(event ->
					Atualizar_infos(7,690,385,true));
					
				deslocar7.play();
			}
			if(h7status == 3){
				double duracao = 3;
				h7status = 1;
				h7_info.setVisible(false);
				Path caminho7 = new Path();
				caminho7.getElements().add(new MoveTo(691,184));
				caminho7.getElements().add(new HLineTo(530));
				caminho7.getElements().add(new VLineTo(280));
				caminho7.getElements().add(new HLineTo(620));
				caminho7.getElements().add(new LineTo(732,395));
				
				PathTransition deslocar7 = new PathTransition();
				deslocar7.setNode(h7);
				deslocar7.setPath(caminho7);
				deslocar7.setDuration(Duration.seconds(duracao));
				deslocar7.setCycleCount(1);
				deslocar7.setAutoReverse(false);
				deslocar7.setOnFinished(event -> 
					Atualizar_infos(7,690,385,true));
				deslocar7.play();
				
			}
			break;
		case 8:
			h8.setVisible(true);
			if(h8status == 0){
				h8status = 1;
				h8.setX(690);
				h8.setY(310);
				h8status_label.setText("STATUS: ASSISTINDO");
				h8status_label.setTextFill(Color.LIMEGREEN);
				h8_info.relocate(h8.getX() + 20, h8.getY() - 10);
			}
			if(h8status == 2){
				double duracao = 3;
				h8status = 1;
				h8_info.setVisible(false);
				Path caminho8 = new Path();
				caminho8.getElements().add(new MoveTo(880,500));
				caminho8.getElements().add(new VLineTo(350));
				caminho8.getElements().add(new HLineTo(700));
				caminho8.getElements().add(new LineTo(712,335));
				
				PathTransition deslocar8 = new PathTransition();
				deslocar8.setNode(h8);
				deslocar8.setPath(caminho8);
				deslocar8.setDuration(Duration.seconds(duracao));
				deslocar8.setCycleCount(1);
				deslocar8.setAutoReverse(false);
				deslocar8.setOnFinished(event ->
					Atualizar_infos(8,710,325,true));
					
				deslocar8.play();
			}
			if(h8status == 3){
				double duracao = 3;
				h8status = 1;
				h8_info.setVisible(false);
				Path caminho8 = new Path();
				caminho8.getElements().add(new MoveTo(361,99));
				caminho8.getElements().add(new HLineTo(530));
				caminho8.getElements().add(new VLineTo(280));
				caminho8.getElements().add(new HLineTo(620));
				caminho8.getElements().add(new VLineTo(420));
				caminho8.getElements().add(new HLineTo(712));
				caminho8.getElements().add(new VLineTo(335));
				
				PathTransition deslocar8 = new PathTransition();
				deslocar8.setNode(h8);
				deslocar8.setPath(caminho8);
				deslocar8.setDuration(Duration.seconds(duracao));
				deslocar8.setCycleCount(1);
				deslocar8.setAutoReverse(false);
				deslocar8.setOnFinished(event -> 
					Atualizar_infos(8,710,325,true));
				deslocar8.play();
			}
			break;
		case 9:
			h9.setVisible(true);
			if(h9status == 0){
				h9status = 1;
				h9.setX(402);
				h9.setY(410);
				h9status_label.setText("STATUS: ASSISTINDO");
				h9status_label.setTextFill(Color.LIMEGREEN);
				h9_info.relocate(h9.getX() + 20, h9.getY() - 10);
			}
			if(h9status == 2){
				double duracao = 3;
				h9status = 1;
				h9_info.setVisible(false);
				Path caminho9 = new Path();
				caminho9.getElements().add(new MoveTo(900,250));
				caminho9.getElements().add(new VLineTo(320));
				caminho9.getElements().add(new HLineTo(780));
				caminho9.getElements().add(new VLineTo(500));
				caminho9.getElements().add(new HLineTo(400));
				caminho9.getElements().add(new VLineTo(410));
				caminho9.getElements().add(new HLineTo(435));
				caminho9.getElements().add(new LineTo(420,430));
				
				PathTransition deslocar9 = new PathTransition();
				deslocar9.setNode(h9);
				deslocar9.setPath(caminho9);
				deslocar9.setDuration(Duration.seconds(duracao));
				deslocar9.setCycleCount(1);
				deslocar9.setAutoReverse(false);
				deslocar9.setOnFinished(event ->
					Atualizar_infos(9,420,420,true));
					
				deslocar9.play();
			}
			if(h9status == 3){
				double duracao = 3;
				h9status = 1;
				h9_info.setVisible(false);
				Path caminho9 = new Path();
				caminho9.getElements().add(new MoveTo(351,154));
				caminho9.getElements().add(new HLineTo(530));
				caminho9.getElements().add(new VLineTo(350));
				caminho9.getElements().add(new HLineTo(430));
				caminho9.getElements().add(new VLineTo(410));
				caminho9.getElements().add(new LineTo(420,430));
				
				PathTransition deslocar9 = new PathTransition();
				deslocar9.setNode(h9);
				deslocar9.setPath(caminho9);
				deslocar9.setDuration(Duration.seconds(duracao));
				deslocar9.setCycleCount(1);
				deslocar9.setAutoReverse(false);
				deslocar9.setOnFinished(event -> 
					Atualizar_infos(9,420,420,true));
				deslocar9.play();
				
			}
			break;
		case 10:
			h10.setVisible(true);
			if(h10status == 0){
				h10status = 1;
				h10.setX(414);
				h10.setY(354);
				h10status_label.setText("STATUS: ASSISTINDO");
				h10status_label.setTextFill(Color.LIMEGREEN);
				h10_info.relocate(h10.getX() + 20, h10.getY() - 10);
			}
			if(h10status == 2){
				double duracao = 3;
				h10status = 1;
				h10_info.setVisible(false);
				Path caminho10 = new Path();
				caminho10.getElements().add(new MoveTo(900,50));
				caminho10.getElements().add(new HLineTo(910));
				caminho10.getElements().add(new VLineTo(350));
				caminho10.getElements().add(new HLineTo(620));
				caminho10.getElements().add(new VLineTo(280));
				caminho10.getElements().add(new HLineTo(450));
				caminho10.getElements().add(new LineTo(435,374));
				
				PathTransition deslocar10 = new PathTransition();
				deslocar10.setNode(h10);
				deslocar10.setPath(caminho10);
				deslocar10.setDuration(Duration.seconds(duracao));
				deslocar10.setCycleCount(1);
				deslocar10.setAutoReverse(false);
				deslocar10.setOnFinished(event ->
					Atualizar_infos(10,432,364,true));
				deslocar10.play();
			}
			if(h10status == 3){
				double duracao = 3;
				h10status = 1;
				h10_info.setVisible(false);
				Path caminho10 = new Path();
				caminho10.getElements().add(new MoveTo(444,147));
				caminho10.getElements().add(new HLineTo(530));
				caminho10.getElements().add(new VLineTo(350));
				caminho10.getElements().add(new HLineTo(430));
				caminho10.getElements().add(new LineTo(435,374));
				
				PathTransition deslocar10 = new PathTransition();
				deslocar10.setNode(h10);
				deslocar10.setPath(caminho10);
				deslocar10.setDuration(Duration.seconds(duracao));
				deslocar10.setCycleCount(1);
				deslocar10.setAutoReverse(false);
				deslocar10.setOnFinished(event -> 
					Atualizar_infos(10,432,364,true));
				deslocar10.play();
				
			}
			break;
		default:
			break;
		}
	}
	
	public void Atualizar_infos(int id, int x, int y,boolean mostrar_info){
		switch (id) {
		case 1:
			Platform.runLater(() -> {
				h1_info.setVisible(mostrar_info);
				h1_info.relocate(x + 20, y - 10);
				if(h1status == 1){
					h1status_label.setText("STATUS: ASSISTINDO");
					h1status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h1status == 2){
					h1status_label.setText("STATUS: DESCANSANDO");
					h1status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h1status == 3){
					h1status_label.setText("STATUS: BLOQUEADO");
					h1status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 2:
			Platform.runLater(() -> {
				h2_info.setVisible(mostrar_info);
				h2_info.relocate(x + 20, y - 10);
				if(h2status == 1){
					h2status_label.setText("STATUS: ASSISTINDO");
					h2status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h2status == 2){
					h2status_label.setText("STATUS: DESCANSANDO");
					h2status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h2status == 3){
					h2status_label.setText("STATUS: BLOQUEADO");
					h2status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 3:
			Platform.runLater(() -> {
				h3_info.setVisible(mostrar_info);
				h3_info.relocate(x + 20, y - 10);
				if(h3status == 1){
					h3status_label.setText("STATUS: ASSISTINDO");
					h3status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h3status == 2){
					h3status_label.setText("STATUS: DESCANSANDO");
					h3status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h3status == 3){
					h3status_label.setText("STATUS: BLOQUEADO");
					h3status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 4:
			Platform.runLater(() -> {
				h4_info.setVisible(mostrar_info);
				h4_info.relocate(x + 20, y - 10);
				if(h4status == 1){
					h4status_label.setText("STATUS: ASSISTINDO");
					h4status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h4status == 2){
					h4status_label.setText("STATUS: DESCANSANDO");
					h4status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h4status == 3){
					h4status_label.setText("STATUS: BLOQUEADO");
					h4status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 5:
			Platform.runLater(() -> {
				h5_info.setVisible(mostrar_info);
				h5_info.relocate(x + 20, y - 10);
				if(h5status == 1){
					h5status_label.setText("STATUS: ASSISTINDO");
					h5status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h5status == 2){
					h5status_label.setText("STATUS: DESCANSANDO");
					h5status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h5status == 3){
					h5status_label.setText("STATUS: BLOQUEADO");
					h5status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 6:
			Platform.runLater(() -> {
				h6_info.setVisible(mostrar_info);
				h6_info.relocate(x + 20, y - 10);
				if(h6status == 1){
					h6status_label.setText("STATUS: ASSISTINDO");
					h6status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h6status == 2){
					h6status_label.setText("STATUS: DESCANSANDO");
					h6status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h6status == 3){
					h6status_label.setText("STATUS: BLOQUEADO");
					h6status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 7:
			Platform.runLater(() -> {
				h7_info.setVisible(mostrar_info);
				h7_info.relocate(x + 20, y - 10);
				if(h7status == 1){
					h7status_label.setText("STATUS: ASSISTINDO");
					h7status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h7status == 2){
					h7status_label.setText("STATUS: DESCANSANDO");
					h7status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h7status == 3){
					h7status_label.setText("STATUS: BLOQUEADO");
					h7status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 8:
			Platform.runLater(() -> {
				h8_info.setVisible(mostrar_info);
				h8_info.relocate(x + 20, y - 10);
				if(h8status == 1){
					h8status_label.setText("STATUS: ASSISTINDO");
					h8status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h8status == 2){
					h8status_label.setText("STATUS: DESCANSANDO");
					h8status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h8status == 3){
					h8status_label.setText("STATUS: BLOQUEADO");
					h8status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 9:
			Platform.runLater(() -> {
				h9_info.setVisible(mostrar_info);
				h9_info.relocate(x + 20, y - 10);
				if(h9status == 1){
					h9status_label.setText("STATUS: ASSISTINDO");
					h9status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h9status == 2){
					h9status_label.setText("STATUS: DESCANSANDO");
					h9status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h9status == 3){
					h9status_label.setText("STATUS: BLOQUEADO");
					h9status_label.setTextFill(Color.RED);
				}
			});
			break;
		case 10:
			Platform.runLater(() -> {
				h10_info.setVisible(mostrar_info);
				h10_info.relocate(x + 20, y - 10);
				if(h10status == 1){
					h10status_label.setText("STATUS: ASSISTINDO");
					h10status_label.setTextFill(Color.LIMEGREEN);
				}
				if(h10status == 2){
					h10status_label.setText("STATUS: DESCANSANDO");
					h10status_label.setTextFill(Color.DODGERBLUE);
				}
				if(h10status == 3){
					h10status_label.setText("STATUS: BLOQUEADO");
					h10status_label.setTextFill(Color.RED);
				}
			});
			break;
		default:
			break;
		}
	}
	
	public void Mostrar_Canal(int canal){
		Platform.runLater(() ->{
			try{
				if(canal != 0){
					Platform.runLater(() -> {
						canal_info.setText("Canal: " + String.valueOf(canal));
						canalbg.setVisible(true);
					});
				}
				else{
					canal_info.setText("");
					canalbg.setVisible(false);
				}
			}
			catch(Exception e){
						
			}
		});
	}
	
	public void Animacao_Descansar(int id){
		double duracao = 3;
		switch (id) {
		case 1:
			h1.setVisible(true);
			h1status = 2;
			h1_info.setVisible(false);
			Path caminho = new Path();
			caminho.getElements().add(new MoveTo(480,465));
			caminho.getElements().add(new VLineTo(385));
			caminho.getElements().add(new HLineTo(700));
			caminho.getElements().add(new VLineTo(375));
			caminho.getElements().add(new HLineTo(1000));
			caminho.getElements().add(new LineTo(1050,530));
			PathTransition deslocar = new PathTransition();
			deslocar.setNode(h1);
			deslocar.setPath(caminho);
			deslocar.setDuration(Duration.seconds(duracao));
			deslocar.setCycleCount(1);
			deslocar.setAutoReverse(false);
			deslocar.setOnFinished(event ->
				Atualizar_infos(1,1025,500,true));
			deslocar.play();
			break;
		case 2:
			h2.setVisible(true);
			h2status = 2;
			h2_info.setVisible(false);
			Path caminho2 = new Path();
			caminho2.getElements().add(new MoveTo(527,460));
			caminho2.getElements().add(new VLineTo(385));
			caminho2.getElements().add(new HLineTo(700));
			caminho2.getElements().add(new VLineTo(375));
			caminho2.getElements().add(new HLineTo(1000));
			caminho2.getElements().add(new LineTo(1050,465));
			PathTransition deslocar2 = new PathTransition();
			deslocar2.setNode(h2);
			deslocar2.setPath(caminho2);
			deslocar2.setDuration(Duration.seconds(duracao));
			deslocar2.setCycleCount(1);
			deslocar2.setAutoReverse(false);
			deslocar2.setOnFinished(event ->
				Atualizar_infos(2,1025,445,true));
			deslocar2.play();
			break;
		case 3:
			h3.setVisible(true);
			h3status = 2;
			h3_info.setVisible(false);
			Path caminho3 = new Path();
			caminho3.getElements().add(new MoveTo(577,455));
			caminho3.getElements().add(new VLineTo(385));
			caminho3.getElements().add(new HLineTo(700));
			caminho3.getElements().add(new VLineTo(375));
			caminho3.getElements().add(new HLineTo(1000));
			caminho3.getElements().add(new LineTo(1050,405));
			PathTransition deslocar3 = new PathTransition();
			deslocar3.setNode(h3);
			deslocar3.setPath(caminho3);
			deslocar3.setDuration(Duration.seconds(duracao));
			deslocar3.setCycleCount(1);
			deslocar3.setAutoReverse(false);
			deslocar3.setOnFinished(event -> 
				Atualizar_infos(3,1025,380,true));
			deslocar3.play();
			break;
		case 4:
			h4.setVisible(true);
			h4status = 2;
			h4_info.setVisible(false);
			Path caminho4 = new Path();
			caminho4.getElements().add(new MoveTo(632,455));
			caminho4.getElements().add(new VLineTo(385));
			caminho4.getElements().add(new HLineTo(700));
			caminho4.getElements().add(new VLineTo(375));
			caminho4.getElements().add(new HLineTo(900));
			caminho4.getElements().add(new LineTo(1050,350));
			PathTransition deslocar4 = new PathTransition();
			deslocar4.setNode(h4);
			deslocar4.setPath(caminho4);
			deslocar4.setDuration(Duration.seconds(duracao));
			deslocar4.setCycleCount(1);
			deslocar4.setAutoReverse(false);
			deslocar4.setOnFinished(event -> 
				Atualizar_infos(4,1025,330,true));
			deslocar4.play();
			break;
		case 5:
			h5.setVisible(true);
			h5status = 2;
			h5_info.setVisible(false);
			Path caminho5 = new Path();
			caminho5.getElements().add(new MoveTo(682,455));
			caminho5.getElements().add(new VLineTo(385));
			caminho5.getElements().add(new HLineTo(700));
			caminho5.getElements().add(new VLineTo(375));
			caminho5.getElements().add(new HLineTo(900));
			caminho5.getElements().add(new LineTo(1020,280));
			PathTransition deslocar5 = new PathTransition();
			deslocar5.setNode(h5);
			deslocar5.setPath(caminho5);
			deslocar5.setDuration(Duration.seconds(duracao));
			deslocar5.setCycleCount(1);
			deslocar5.setAutoReverse(false);
			deslocar5.setOnFinished(event -> 
				Atualizar_infos(5,995,260,true));
			deslocar5.play();
			break;
		case 6:
			h6.setVisible(true);
			h6status = 2;
			h6_info.setVisible(false);
			Path caminho6 = new Path();
			caminho6.getElements().add(new MoveTo(740,420));
			caminho6.getElements().add(new LineTo(680,385));
			caminho6.getElements().add(new HLineTo(700));
			caminho6.getElements().add(new VLineTo(375));
			caminho6.getElements().add(new HLineTo(1000));
			caminho6.getElements().add(new LineTo(1025,130));
			PathTransition deslocar6 = new PathTransition();
			deslocar6.setNode(h6);
			deslocar6.setPath(caminho6);
			deslocar6.setDuration(Duration.seconds(duracao));
			deslocar6.setCycleCount(1);
			deslocar6.setAutoReverse(false);
			deslocar6.setOnFinished(event -> 
				Atualizar_infos(6,990,110,true));
			deslocar6.play();
			break;
		case 7:
			h7.setVisible(true);
			h7status = 2;
			h7_info.setVisible(false);
			Path caminho7 = new Path();
			caminho7.getElements().add(new MoveTo(740,370));
			caminho7.getElements().add(new HLineTo(720));
			caminho7.getElements().add(new VLineTo(400));
			caminho7.getElements().add(new HLineTo(760));
			caminho7.getElements().add(new VLineTo(375));
			caminho7.getElements().add(new HLineTo(950));
			caminho7.getElements().add(new LineTo(900,150));
			PathTransition deslocar7 = new PathTransition();
			deslocar7.setNode(h7);
			deslocar7.setPath(caminho7);
			deslocar7.setDuration(Duration.seconds(duracao));
			deslocar7.setCycleCount(1);
			deslocar7.setAutoReverse(false);
			deslocar7.setOnFinished(event -> 
				Atualizar_infos(7,875,120,true));
			deslocar7.play();
			break;
		case 8:
			h8.setVisible(true);
			h8status = 2;
			h8_info.setVisible(false);
			Path caminho8 = new Path();
			caminho8.getElements().add(new MoveTo(720,310));
			caminho8.getElements().add(new HLineTo(700));
			caminho8.getElements().add(new VLineTo(290));
			caminho8.getElements().add(new HLineTo(750));
			caminho8.getElements().add(new VLineTo(320));
			caminho8.getElements().add(new HLineTo(900));
			caminho8.getElements().add(new LineTo(880,500));
			PathTransition deslocar8 = new PathTransition();
			deslocar8.setNode(h8);
			deslocar8.setPath(caminho8);
			deslocar8.setDuration(Duration.seconds(duracao));
			deslocar8.setCycleCount(1);
			deslocar8.setAutoReverse(false);
			deslocar8.setOnFinished(event -> 
				Atualizar_infos(8,860,470,true));
			deslocar8.play();
			break;
		case 9:
			h9.setVisible(true);
			h9status = 2;
			h9_info.setVisible(false);
			Path caminho9 = new Path();
			caminho9.getElements().add(new MoveTo(420,430));
			caminho9.getElements().add(new HLineTo(435));
			caminho9.getElements().add(new VLineTo(410));
			caminho9.getElements().add(new HLineTo(400));
			caminho9.getElements().add(new VLineTo(500));
			caminho9.getElements().add(new HLineTo(780));
			caminho9.getElements().add(new VLineTo(320));
			caminho9.getElements().add(new HLineTo(950));
			caminho9.getElements().add(new LineTo(900,250));
			PathTransition deslocar9 = new PathTransition();
			deslocar9.setNode(h9);
			deslocar9.setPath(caminho9);
			deslocar9.setDuration(Duration.seconds(duracao));
			deslocar9.setCycleCount(1);
			deslocar9.setAutoReverse(false);
			deslocar9.setOnFinished(event -> 
				Atualizar_infos(9,900,240,true));
			deslocar9.play();
			break;
		case 10:
			h10.setVisible(true);
			h10status = 2;
			h10_info.setVisible(false);
			Path caminho10 = new Path();
			caminho10.getElements().add(new MoveTo(432,374));
			caminho10.getElements().add(new HLineTo(450));
			caminho10.getElements().add(new VLineTo(300));
			caminho10.getElements().add(new HLineTo(650));
			caminho10.getElements().add(new VLineTo(350));
			caminho10.getElements().add(new HLineTo(910));
			caminho10.getElements().add(new LineTo(900,50));
			PathTransition deslocar10 = new PathTransition();
			deslocar10.setNode(h10);
			deslocar10.setPath(caminho10);
			deslocar10.setDuration(Duration.seconds(duracao));
			deslocar10.setCycleCount(1);
			deslocar10.setAutoReverse(false);
			deslocar10.setOnFinished(event -> 
				Atualizar_infos(10,890,40,true));
			deslocar10.play();
			break;
		default:
			break;
		}
	}
	
	public void Animacao_Bloquear(int id){
		switch (id) {
		case 1:
			h1.setVisible(true);
			if(h1status == 0){
				h1status = 3;
				h1.setX(351);
				h1.setY(44);
				h1status_label.setText("STATUS: BLOQUEADO");
				h1status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h1_info.relocate(h1.getX() + 20, h1.getY() - 10);});
			}
			if(h1status == 2){
				double duracao = 3;
				h1status = 3;
				h1_info.setVisible(false);
				Path caminho = new Path();
				caminho.getElements().add(new MoveTo(1050,530));
				caminho.getElements().add(new LineTo(900,375));
				caminho.getElements().add(new VLineTo(150));
				caminho.getElements().add(new HLineTo(400));
				caminho.getElements().add(new LineTo(361,54));
				
				PathTransition deslocar = new PathTransition();
				deslocar.setNode(h1);
				deslocar.setPath(caminho);
				deslocar.setDuration(Duration.seconds(duracao));
				deslocar.setCycleCount(1);
				deslocar.setAutoReverse(false);
				deslocar.setOnFinished(event ->
					Atualizar_infos(1,351,44,false));
				deslocar.play();
			}
			break;
		case 2:
			h2.setVisible(true);
			if(h2status == 0){
				h2status = 3;
				h2.setX(406);
				h2.setY(44);
				h2status_label.setText("STATUS: BLOQUEADO");
				h2status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h2_info.relocate(h2.getX() + 20, h2.getY() - 10);});
			}
			if(h2status == 2){
				double duracao = 3;
				h2status = 3;
				h2_info.setVisible(false);
				Path caminho2 = new Path();
				caminho2.getElements().add(new MoveTo(1050,465));
				caminho2.getElements().add(new LineTo(900,375));
				caminho2.getElements().add(new VLineTo(150));
				caminho2.getElements().add(new HLineTo(400));
				caminho2.getElements().add(new LineTo(416,54));
				
				PathTransition deslocar2 = new PathTransition();
				deslocar2.setNode(h2);
				deslocar2.setPath(caminho2);
				deslocar2.setDuration(Duration.seconds(duracao));
				deslocar2.setCycleCount(1);
				deslocar2.setAutoReverse(false);
				deslocar2.setOnFinished(event -> 
					Atualizar_infos(2,406,44,false));
				deslocar2.play();
			}
			break;
		case 3:
			h3.setVisible(true);
			if(h3status == 0){
				h3status = 3;
				h3.setX(471);
				h3.setY(44);
				h3status_label.setText("STATUS: BLOQUEADO");
				h3status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h3_info.relocate(h3.getX() + 20, h3.getY() - 10);});
			}
			if(h3status == 2){
				double duracao = 3;
				h3status = 3;
				h3_info.setVisible(false);
				Path caminho3 = new Path();
				caminho3.getElements().add(new MoveTo(1050,405));
				caminho3.getElements().add(new LineTo(900,375));
				caminho3.getElements().add(new VLineTo(150));
				caminho3.getElements().add(new HLineTo(500));
				caminho3.getElements().add(new LineTo(471,54));
				
				PathTransition deslocar3 = new PathTransition();
				deslocar3.setNode(h3);
				deslocar3.setPath(caminho3);
				deslocar3.setDuration(Duration.seconds(duracao));
				deslocar3.setCycleCount(1);
				deslocar3.setAutoReverse(false);
				deslocar3.setOnFinished(event -> 
					Atualizar_infos(3,461,44,false));
				deslocar3.play();
			}
			break;
		case 4:
			h4.setVisible(true);
			if(h4status == 0){
				h4status = 3;
				h4.setX(526);
				h4.setY(44);
				h4status_label.setText("STATUS: BLOQUEADO");
				h4status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h4_info.relocate(h4.getX() + 20, h4.getY() - 10);});
			}
			if(h4status == 2){
				double duracao = 3;
				h4status = 3;
				h4_info.setVisible(false);
				Path caminho4 = new Path();
				caminho4.getElements().add(new MoveTo(1050,350));
				caminho4.getElements().add(new LineTo(900,275));
				caminho4.getElements().add(new VLineTo(150));
				caminho4.getElements().add(new HLineTo(600));
				caminho4.getElements().add(new LineTo(526,54));
				
				PathTransition deslocar4 = new PathTransition();
				deslocar4.setNode(h4);
				deslocar4.setPath(caminho4);
				deslocar4.setDuration(Duration.seconds(duracao));
				deslocar4.setCycleCount(1);
				deslocar4.setAutoReverse(false);
				deslocar4.setOnFinished(event -> 
					Atualizar_infos(4,516,44,false));
				deslocar4.play();
			}
			break;
		case 5:
			h5.setVisible(true);
			if(h5status == 0){
				h5status = 3;
				h5.setX(581);
				h5.setY(44);
				h5status_label.setText("STATUS: BLOQUEADO");
				h5status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h5_info.relocate(h5.getX() + 20, h5.getY() - 10);});
			}
			if(h5status == 2){
				double duracao = 3;
				h5status = 3;
				h5_info.setVisible(false);
				Path caminho5 = new Path();
				caminho5.getElements().add(new MoveTo(1020,280));
				caminho5.getElements().add(new LineTo(950,275));
				caminho5.getElements().add(new VLineTo(150));
				caminho5.getElements().add(new HLineTo(650));
				caminho5.getElements().add(new LineTo(581,54));
				
				PathTransition deslocar5 = new PathTransition();
				deslocar5.setNode(h5);
				deslocar5.setPath(caminho5);
				deslocar5.setDuration(Duration.seconds(duracao));
				deslocar5.setCycleCount(1);
				deslocar5.setAutoReverse(false);
				deslocar5.setOnFinished(event -> 
					Atualizar_infos(5,571,44,false));
				deslocar5.play();
			}
			break;
		case 6:
			h6.setVisible(true);
			if(h6status == 0){
				h6status = 3;
				h6.setX(636);
				h6.setY(44);
				h6status_label.setText("STATUS: BLOQUEADO");
				h6status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h6_info.relocate(h6.getX() + 20, h6.getY() - 10);});
			}
			if(h6status == 2){
				double duracao = 3;
				h6status = 3;
				h6_info.setVisible(false);
				Path caminho6 = new Path();
				caminho6.getElements().add(new MoveTo(1025,130));
				caminho6.getElements().add(new LineTo(950,275));
				caminho6.getElements().add(new VLineTo(150));
				caminho6.getElements().add(new HLineTo(680));
				caminho6.getElements().add(new LineTo(636,54));
				
				PathTransition deslocar6 = new PathTransition();
				deslocar6.setNode(h6);
				deslocar6.setPath(caminho6);
				deslocar6.setDuration(Duration.seconds(duracao));
				deslocar6.setCycleCount(1);
				deslocar6.setAutoReverse(false);
				deslocar6.setOnFinished(event -> 
					Atualizar_infos(6,636,44,false));
				deslocar6.play();
			}
			break;
		case 7:
			h7.setVisible(true);
			if(h7status == 0){
				h7status = 3;
				h7.setX(691);
				h7.setY(174);
				h7status_label.setText("STATUS: BLOQUEADO");
				h7status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h7_info.relocate(h7.getX() + 20, h7.getY() - 10);});
			}
			if(h7status == 2){
				double duracao = 3;
				h7status = 3;
				h7_info.setVisible(false);
				Path caminho7 = new Path();
				caminho7.getElements().add(new MoveTo(900,150));
				caminho7.getElements().add(new LineTo(950,275));
				caminho7.getElements().add(new VLineTo(150));
				caminho7.getElements().add(new HLineTo(690));
				caminho7.getElements().add(new LineTo(691,184));
				
				PathTransition deslocar7 = new PathTransition();
				deslocar7.setNode(h7);
				deslocar7.setPath(caminho7);
				deslocar7.setDuration(Duration.seconds(duracao));
				deslocar7.setCycleCount(1);
				deslocar7.setAutoReverse(false);
				deslocar7.setOnFinished(event -> 
					Atualizar_infos(7,636,174,false));
				deslocar7.play();
			}
			break;
		case 8:
			h8.setVisible(true);
			if(h8status == 0){
				h8status = 3;
				h8.setX(351);
				h8.setY(99);
				h8status_label.setText("STATUS: BLOQUEADO");
				h8status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h8_info.relocate(h8.getX() + 20, h8.getY() - 10);});
			}
			if(h8status == 2){
				double duracao = 3;
				h8status = 3;
				h8_info.setVisible(false);
				Path caminho8 = new Path();
				caminho8.getElements().add(new MoveTo(880,500));
				caminho8.getElements().add(new VLineTo(150));
				caminho8.getElements().add(new HLineTo(690));
				caminho8.getElements().add(new LineTo(361,99));
				
				PathTransition deslocar8 = new PathTransition();
				deslocar8.setNode(h8);
				deslocar8.setPath(caminho8);
				deslocar8.setDuration(Duration.seconds(duracao));
				deslocar8.setCycleCount(1);
				deslocar8.setAutoReverse(false);
				deslocar8.setOnFinished(event -> 
					Atualizar_infos(8,381,89,false));
				deslocar8.play();
			}
			break;
		case 9:
			h9.setVisible(true);
			if(h9status == 0){
				h9status = 3;
				h9.setX(351);
				h9.setY(154);
				h9status_label.setText("STATUS: BLOQUEADO");
				h9status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h9_info.relocate(h9.getX() + 20, h9.getY() - 10);});
			}
			if(h9status == 2){
				double duracao = 3;
				h9status = 3;
				h9_info.setVisible(false);
				Path caminho9 = new Path();
				caminho9.getElements().add(new MoveTo(900,250));
				caminho9.getElements().add(new VLineTo(150));
				caminho9.getElements().add(new HLineTo(690));
				caminho9.getElements().add(new LineTo(351,154));
				
				PathTransition deslocar9 = new PathTransition();
				deslocar9.setNode(h9);
				deslocar9.setPath(caminho9);
				deslocar9.setDuration(Duration.seconds(duracao));
				deslocar9.setCycleCount(1);
				deslocar9.setAutoReverse(false);
				deslocar9.setOnFinished(event -> 
					Atualizar_infos(9,371,134,false));
				deslocar9.play();
			}
			break;
		case 10:
			h10.setVisible(true);
			if(h10status == 0){
				h10status = 3;
				h10.setX(406);
				h10.setY(144);
				h10status_label.setText("STATUS: BLOQUEADO");
				h10status_label.setTextFill(Color.RED);
				Platform.runLater(() -> {h10_info.relocate(h10.getX() + 20, h10.getY() - 10);});
			}
			if(h10status == 2){
				double duracao = 3;
				h10status = 3;
				h10_info.setVisible(false);
				Path caminho10 = new Path();
				caminho10.getElements().add(new MoveTo(900,50));
				caminho10.getElements().add(new VLineTo(160));
				caminho10.getElements().add(new HLineTo(780));
				caminho10.getElements().add(new VLineTo(147));
				caminho10.getElements().add(new HLineTo(444));
				
				PathTransition deslocar10 = new PathTransition();
				deslocar10.setNode(h10);
				deslocar10.setPath(caminho10);
				deslocar10.setDuration(Duration.seconds(duracao));
				deslocar10.setCycleCount(1);
				deslocar10.setAutoReverse(false);
				deslocar10.setOnFinished(event -> 
					Atualizar_infos(10,371,134,false));
				deslocar10.play();
			}
			break;
		default:
			break;
		}
	}
	
	public void Setar_Hospede_Imagem(int id, Image img){
		if(id == 1){
			h1_image.setVisible(true);
			h1_image.setImage(img);
			h1.setImage(img);
			h1.setVisible(false);
			h1status = 0;
		}
		if(id == 2){
			h2_image.setVisible(true);
			h2_image.setImage(img);
			h2.setImage(img);
			h2.setVisible(false);
			h2status = 0;
		}
		if(id == 3){
			h3_image.setVisible(true);
			h3_image.setImage(img);
			h3status = 0;
			h3.setVisible(false);
			h3.setImage(img);
		}
		if(id == 4){
			h4_image.setVisible(true);
			h4_image.setImage(img);
			h4status = 0;
			h4.setVisible(false);
			h4.setImage(img);
		}
		if(id == 5){
			h5_image.setVisible(true);
			h5_image.setImage(img);
			h5status = 0;
			h5.setVisible(false);
			h5.setImage(img);
		}
		if(id == 6){
			h6_image.setVisible(true);
			h6_image.setImage(img);
			h6status = 0;
			h6.setVisible(false);
			h6.setImage(img);
		}
		if(id == 7){
			h7_image.setVisible(true);
			h7_image.setImage(img);
			h7status = 0;
			h7.setVisible(false);
			h7.setImage(img);
		}
		if(id == 8){
			h8_image.setVisible(true);
			h8_image.setImage(img);
			h8status = 0;
			h8.setVisible(false);
			h8.setImage(img);
		}
		if(id == 9){
			h9_image.setVisible(true);
			h9_image.setImage(img);
			h9status = 0;
			h9.setVisible(false);
			h9.setImage(img);
		}
		if(id == 10){
			h10_image.setVisible(true);
			h10_image.setImage(img);
			h10status = 0;
			h10.setVisible(false);
			h10.setImage(img);
		}
	}
	public void Setar_Hospede_Label_Info(int id, String info){
		if(id == 1){
			h1_label.setVisible(true);
			h1_label.setText(info);
			h1status_label.setVisible(true);
		}
		if(id == 2){
			h2_label.setVisible(true);
			h2_label.setText(info);
			h2status_label.setVisible(true);
		}
		if(id == 3){
			h3_label.setVisible(true);
			h3_label.setText(info);
			h3status_label.setVisible(true);
		}
		if(id == 4){
			h4_label.setVisible(true);
			h4_label.setText(info);
			h4status_label.setVisible(true);
		}
		if(id == 5){
			h5_label.setVisible(true);
			h5_label.setText(info);
			h5status_label.setVisible(true);
		}
		if(id == 6){
			h6_label.setVisible(true);
			h6_label.setText(info);
			h6status_label.setVisible(true);
		}
		if(id == 7){
			h7_label.setVisible(true);
			h7_label.setText(info);
			h7status_label.setVisible(true);
		}
		if(id == 8){
			h8_label.setVisible(true);
			h8_label.setText(info);
			h8status_label.setVisible(true);
		}
		if(id == 9){
			h9_label.setVisible(true);
			h9_label.setText(info);
			h9status_label.setVisible(true);
		}
		if(id == 10){
			h10_label.setVisible(true);
			h10_label.setText(info);
			h10status_label.setVisible(true);
		}
	}
	
	@SuppressWarnings({ "deprecation" })
	public void Voltar_Menu() throws InterruptedException{
		for(int i = 0; i < this.n_hospedes; i++){
			hospedes[i].Parar_Hospede();
			hospedes[i] = null;
			hospedest[i].stop();
			hospedest[i] = null;
		}
		if(!this.simplificar){
			if(audio_canal.getStatus().equals(MediaPlayer.Status.PLAYING)){
				audio_canal.stop();
			}
			if(programas.getStatus().equals(Animation.Status.RUNNING)){
				programas.stop();
			}
		}
		Menu menu = new Menu();
		menu.start(new Stage());
		menu.Mostrar_Tutorial(false);
		Stage tela = (Stage)this.menu.getScene().getWindow();
		tela.close();
		tela = null;
		System.gc();
	}
	
	public void Animar_Botao(){
		double duracao_animacao = 1.5;
		int deslocamento = 20;
		TranslateTransition deslocar = new TranslateTransition(Duration.seconds(duracao_animacao));
		deslocar.setFromX(-deslocamento);
		deslocar.setToX(4*deslocamento);
		deslocar.setAutoReverse(true);
		deslocar.setCycleCount(Animation.INDEFINITE);
		deslocar.setNode(menu);
		FadeTransition fade = new FadeTransition(Duration.seconds(2*duracao_animacao),menu);
		fade.setFromValue(1);
		fade.setToValue(0.7);
		fade.setAutoReverse(true);
		fade.setCycleCount(Animation.INDEFINITE);
		ParallelTransition paralelo = new ParallelTransition(deslocar,fade);
		paralelo.setAutoReverse(true);
		paralelo.play();
	}
	
	public void Animacao_Hospedes_Panel(){
		double duracao = 1.5;
		TranslateTransition mover_seta = new TranslateTransition(Duration.seconds(duracao),mostrar_hospedes_bt);
		RotateTransition rotacionar_seta = new RotateTransition(Duration.seconds(duracao),mostrar_hospedes_bt);
		ParallelTransition paralelo_seta;
		TranslateTransition mover_pane = new TranslateTransition(Duration.seconds(duracao),hospedes_pane);
		ParallelTransition paralelo_total;
		if(!hospedes_pane.isVisible()){
			mostrar_hospedes_bt.setTooltip(new Tooltip("Esconder hóspedes"));
			hospedes_pane.setVisible(true);
			mover_seta.setFromX(0);
			mover_seta.setToX(270);
			rotacionar_seta.setFromAngle(0.0);
			rotacionar_seta.setToAngle(190.0);
			mover_pane.setFromX(-hospedes_pane.getWidth());
			mover_pane.setToX(0.0);
			paralelo_seta = new ParallelTransition(mover_seta,rotacionar_seta);
			paralelo_total = new ParallelTransition(paralelo_seta,mover_pane);
		}
		else{
			mostrar_hospedes_bt.setTooltip(new Tooltip("Mostrar hóspedes"));
			mover_seta.setFromX(270);
			mover_seta.setToX(0);
			rotacionar_seta.setFromAngle(190.0);
			rotacionar_seta.setToAngle(0.0);
			mover_pane.setFromX(0.0);
			mover_pane.setToX(-hospedes_pane.getWidth());
			paralelo_seta = new ParallelTransition(mover_seta,rotacionar_seta);
			paralelo_total = new ParallelTransition(paralelo_seta,mover_pane);
			paralelo_total.setOnFinished(event -> hospedes_pane.setVisible(false));
		}
		paralelo_total.play();
	}
	
	public void Atualizar_Log(LocalTime instante, String texto){
		javafx.application.Platform.runLater( () -> log.appendText("[" + String.valueOf(instante.getHour()) + ":" + String.valueOf(instante.getMinute()) + ":" + String.valueOf(instante.getSecond()) + "]:" + texto) );
	}
	
	public void Animacao_Log(){
		double duracao = 1.5;
		TranslateTransition mover_seta = new TranslateTransition(Duration.seconds(duracao),log_bt);
		RotateTransition rotacionar_seta = new RotateTransition(Duration.seconds(duracao),log_bt);
		ParallelTransition paralelo_seta;
		TranslateTransition mover_pane = new TranslateTransition(Duration.seconds(duracao),log_pane);
		ParallelTransition paralelo_total;
		log_bt.setVisible(true);
		if(!log_pane.isVisible()){
			log_bt.setTooltip(new Tooltip("Esconder logs"));
			log_pane.setVisible(true);
			mover_seta.setFromX(0);
			mover_seta.setToX(-182);
			rotacionar_seta.setFromAngle(190.0);
			rotacionar_seta.setToAngle(0.0);
			mover_pane.setFromX(log_pane.getWidth());
			mover_pane.setToX(10);
			paralelo_seta = new ParallelTransition(mover_seta,rotacionar_seta);
			paralelo_total = new ParallelTransition(paralelo_seta,mover_pane);
		}
		else{
			log_bt.setTooltip(new Tooltip("Mostrar logs"));
			mover_seta.setFromX(-182);
			mover_seta.setToX(0);
			rotacionar_seta.setFromAngle(0.0);
			rotacionar_seta.setToAngle(190.0);
			mover_pane.setFromX(10);
			mover_pane.setToX(log_pane.getWidth());
			paralelo_seta = new ParallelTransition(mover_seta,rotacionar_seta);
			paralelo_total = new ParallelTransition(paralelo_seta,mover_pane);
			paralelo_total.setOnFinished(event -> log_pane.setVisible(false));
		}
		paralelo_seta.setCycleCount(1);
		paralelo_seta.setAutoReverse(false);
		paralelo_total.play();
	}
	
	public void Colocar_Dicas(){
		Tooltip dica_sala = new Tooltip();
		Tooltip.install(sala, dica_sala);
		dica_sala.setOnShowing(ev -> {// called just prior to being shown
		    dica_sala.setText(String.format("SALA DA TV"));
		});
		Tooltip dica_descanso = new Tooltip();
		Tooltip.install(descanso, dica_descanso);
		dica_descanso.setOnShowing(ev -> {// called just prior to being shown
		    dica_descanso.setText(String.format("SALA DO DESCANSO"));
		});
		Tooltip dica_bloqueio = new Tooltip();
		Tooltip.install(bloqueio, dica_bloqueio);
		dica_bloqueio.setOnShowing(ev -> {// called just prior to being shown
		    dica_bloqueio.setText(String.format("SALA DO BLOQUEIO"));
		});
	}
	
	public void Mostrar_Controle(int id, double duracao){
		Timeline timeline = new Timeline(
				new KeyFrame(Duration.seconds(0),
						new KeyValue (controle.visibleProperty(),true)
				),
				new KeyFrame(Duration.seconds(duracao),
						new KeyValue (controle.visibleProperty(),false)
				)
	    ); 
	    timeline.setCycleCount(1);
	    timeline.setAutoReverse(false);
		switch (id) {
		case 1:
			controle.setLayoutX(454);
			controle.setLayoutY(405);
			controle.setRotate(10);
			timeline.playFromStart();
			break;
		case 2:
			controle.setLayoutX(496);
			controle.setLayoutY(405);
			controle.setRotate(5);
			timeline.playFromStart();
			break;
		case 3:
			controle.setLayoutX(547);
			controle.setLayoutY(405);
			timeline.playFromStart();
			break;
		case 4:
			controle.setLayoutX(585);
			controle.setLayoutY(405);
			controle.setRotate(-5);
			timeline.playFromStart();
			break;
		case 5:
			controle.setLayoutX(638);
			controle.setLayoutY(405);
			controle.setRotate(-10);
			timeline.playFromStart();
			break;
		case 6:
			controle.setLayoutX(670);
			controle.setLayoutY(420);
			controle.setRotate(-45);
			timeline.playFromStart();
			break;
		case 7:
			controle.setLayoutX(670);
			controle.setLayoutY(370);
			controle.setRotate(-50);
			timeline.playFromStart();
			break;
		case 8:
			controle.setLayoutX(650);
			controle.setLayoutY(310);
			controle.setRotate(-90);
			timeline.playFromStart();
			break;
		case 9:
			controle.setLayoutX(442);
			controle.setLayoutY(410);
			controle.setRotate(45);
			timeline.playFromStart();
			break;
		case 10:
			controle.setLayoutX(454);
			controle.setLayoutY(354);
			controle.setRotate(45);
			timeline.playFromStart();
			break;
		default:
			break;
		}
	}
	
	public void Passar_Programa(int canal){
		int c = (canal - 1) % 10;
		switch (c) {
		case 0:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal1[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/1/audio.mp3").toExternalForm()));
			break;
		case 1:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal2[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/2/audio.mp3").toExternalForm()));
			break;
		case 2:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal3[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/3/audio.mp3").toExternalForm()));
			break;
		case 3:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal4[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/4/audio.mp3").toExternalForm()));
			break;
		case 4:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal5[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/5/audio.mp3").toExternalForm()));
			break;
		case 5:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal6[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/6/audio.mp3").toExternalForm()));
			break;
		case 6:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal7[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/7/audio.mp3").toExternalForm()));
			break;
		case 7:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal8[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/8/audio.mp3").toExternalForm()));
			break;
		case 8:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal9[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/9/audio.mp3").toExternalForm()));
			break;
		case 9:
			programas.getKeyFrames().clear();
			for(int i = 0; i < 5; i++){
				programas.getKeyFrames().add(canal10[i]);
			}
			audio_canal = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/TV/Canais/10/audio.mp3").toExternalForm()));
			break;
		default:
			break;
		}
		programas.setDelay(Duration.seconds(0.5));
		programas.setCycleCount(Animation.INDEFINITE);
		audio_canal.setCycleCount(MediaPlayer.INDEFINITE);
		programas.play();
		audio_canal.play();
	}
	
	public void Desligar_Tv(){
		if(audio_canal.getStatus().equals(MediaPlayer.Status.PLAYING)){
			audio_canal.stop();
		}
		if(programas.getStatus().equals(Animation.Status.RUNNING)){
			programas.stop();
		}
		tv.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/desligada.jpg")));
	}
	
	public void Criar_Programas(){
		canal1 = new KeyFrame[5];
		canal1[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/1/1.jpg")))
					);
		canal1[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/1/2.jpg")))
				);
		canal1[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/1/3.jpg")))
				);
		canal1[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/1/4.jpg")))
				);
		canal1[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/1/4.jpg")))
				);
		
		canal2 = new KeyFrame[5];
		canal2[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/2/1.jpg")))
					);
		canal2[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/2/2.jpg")))
				);
		canal2[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/2/3.jpg")))
				);
		canal2[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/2/4.jpg")))
				);
		canal2[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/2/4.jpg")))
				);
		
		canal3 = new KeyFrame[5];
		canal3[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/3/1.jpg")))
					);
		canal3[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/3/2.jpg")))
				);
		canal3[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/3/3.jpg")))
				);
		canal3[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/3/4.jpg")))
				);
		canal3[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/3/4.jpg")))
				);
		
		canal4 = new KeyFrame[5];
		canal4[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/4/1.jpg")))
					);
		canal4[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/4/2.png")))
				);
		canal4[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/4/3.jpg")))
				);
		canal4[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/4/4.jpg")))
				);
		canal4[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/4/4.jpg")))
				);
		
		canal5 = new KeyFrame[5];
		canal5[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/5/1.jpg")))
					);
		canal5[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/5/2.jpg")))
				);
		canal5[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/5/3.jpg")))
				);
		canal5[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/5/4.jpg")))
				);
		canal5[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/5/4.jpg")))
				);
		
		canal6 = new KeyFrame[5];
		canal6[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/6/1.jpg")))
					);
		canal6[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/6/2.jpg")))
				);
		canal6[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/6/3.jpg")))
				);
		canal6[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/6/4.jpg")))
				);
		canal6[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/6/4.jpg")))
				);
		
		canal7 = new KeyFrame[5];
		canal7[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/7/1.jpg")))
					);
		canal7[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/7/2.jpg")))
				);
		canal7[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/7/3.jpg")))
				);
		canal7[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/7/4.jpg")))
				);
		canal7[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/7/4.jpg")))
				);
		
		canal8 = new KeyFrame[5];
		canal8[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/8/1.jpg")))
					);
		canal8[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/8/2.jpg")))
				);
		canal8[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/8/3.jpg")))
				);
		canal8[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/8/4.jpg")))
				);
		canal8[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/8/4.jpg")))
				);
		
		canal9 = new KeyFrame[5];
		canal9[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/9/1.jpg")))
					);
		canal9[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/9/2.jpg")))
				);
		canal9[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/9/3.jpg")))
				);
		canal9[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/9/4.jpg")))
				);
		canal9[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/9/4.jpg")))
				);
		
		canal10 = new KeyFrame[5];
		canal10[0] = new KeyFrame(Duration.seconds(0),
					new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/10/1.jpg")))
					);
		canal10[1] = new KeyFrame(Duration.seconds(5),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/10/2.jpg")))
				);
		canal10[2] = new KeyFrame(Duration.seconds(10),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/10/3.jpg")))
				);
		canal10[3] = new KeyFrame(Duration.seconds(15),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/10/4.jpg")))
				);
		canal10[4] = new KeyFrame(Duration.seconds(20),
				new KeyValue (tv.imageProperty(),new Image(getClass().getResourceAsStream("/Fontes/Imagens/Tv/Canais/10/4.jpg")))
				);
	}
	
	public void Mostrar_Tutorial(int passo){
		switch (passo) {
		case 0:
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/tutorial_cena0.jpg")));
			break;
		case 1:
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/tutorial_cena1.jpg")));
			break;	
		case 2:
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/tutorial_cena2.jpg")));
			break;
		case 3:
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/tutorial_cena3.jpg")));
			break;
		case 4:
			mostrar_hospedes_bt.setVisible(true);
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/tutorial_cena4.jpg")));
			break;
		case 5:
			menu.setVisible(true);
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/tutorial_cena5.jpg")));
			break;
		case 6:
			log_bt.setVisible(true);
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/tutorial_cena6.jpg")));
			break;
		case 7:
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/tutorial_cena7.jpg")));
			break;
		case 8:
			bg.setImage(new Image(getClass().getResourceAsStream("/Fontes/Imagens/bg.jpg")));
			mostrar_hospedes_bt.setDisable(false);
			log_bt.setDisable(false);
			menu.setDisable(false);
			tv.setVisible(true);
			prox.setVisible(false);
			prox_scale.stop();
			Colocar_Dicas();
			if(!this.simplificar){
				Animar_Botao();
				Criar_Programas();
			}
			musica_tutorial.stop();
			for(int i = 0; i < n_hospedes; i++){
				hospedest[i].start();
			}
			break;
		default:
			break;
		}
	}
	
	public void Animar_Prox_Tutorial(){
		prox_scale = new ScaleTransition(Duration.seconds(1), prox);
		prox_scale.setFromX(0.7);
		prox_scale.setFromY(0.7);
		prox_scale.setToX(0.5);
		prox_scale.setToY(0.5);
		prox_scale.setCycleCount(Animation.INDEFINITE);
		prox_scale.setAutoReverse(true);
		prox_scale.play();
	}
	
	public void Incrementar_Passo_Tutorial(){
		this.passo_tutorial++;
		Mostrar_Tutorial(passo_tutorial);
	}
	
	public void Setar_Tutorial(boolean valor){
		this.mostrar_tutorial = valor;
		if(mostrar_tutorial){
			musica_tutorial = new MediaPlayer(new Media(this.getClass().getResource("/Fontes/Sons/tutorial.mp3").toExternalForm()));
			musica_tutorial.setCycleCount(MediaPlayer.INDEFINITE);
			musica_tutorial.play();
			prox.setVisible(true);
			Animar_Prox_Tutorial();
			tv.setVisible(false);
			mostrar_hospedes_bt.setVisible(false);
			menu.setVisible(false);
			log_bt.setVisible(false);
			mostrar_hospedes_bt.setDisable(true);
			log_bt.setDisable(true);
			menu.setDisable(true);
			Mostrar_Tutorial(passo_tutorial);
		}
		else{
			mostrar_hospedes_bt.setDisable(false);
			log_bt.setDisable(false);
			menu.setDisable(false);
			if(!this.simplificar){
				Animar_Botao();
				Criar_Programas();
			}
			tv.setVisible(true);
			for(int i = 0; i < n_hospedes; i++){
				hospedest[i].start();
			}
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mostrar_hospedes_bt.setTooltip(new Tooltip("Mostrar hóspedes"));
		log_bt.setTooltip(new Tooltip("Mostrar logs"));
		menu.setTooltip(new Tooltip("Voltar para o MENU"));
		log.setText("--------HISTÓRICO DE EVENTOS--------\n\n");
		h1_image.setVisible(false);
		h2_image.setVisible(false);
		h3_image.setVisible(false);
		h4_image.setVisible(false);
		h5_image.setVisible(false);
		h6_image.setVisible(false);
		h7_image.setVisible(false);
		h8_image.setVisible(false);
		h9_image.setVisible(false);
		h10_image.setVisible(false);
		h1_label.setVisible(false);
		h2_label.setVisible(false);
		h3_label.setVisible(false);
		h4_label.setVisible(false);
		h5_label.setVisible(false);
		h6_label.setVisible(false);
		h7_label.setVisible(false);
		h8_label.setVisible(false);
		h9_label.setVisible(false);
		h10_label.setVisible(false);
		h1status_label.setVisible(false);
		h2status_label.setVisible(false);
		h3status_label.setVisible(false);
		h4status_label.setVisible(false);
		h5status_label.setVisible(false);
		h6status_label.setVisible(false);
		h7status_label.setVisible(false);
		h8status_label.setVisible(false);
		h9status_label.setVisible(false);
		h10status_label.setVisible(false);
		programas = new Timeline();
	}
}
