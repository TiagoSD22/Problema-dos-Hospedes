package application;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;

public class Hospede implements Runnable{
		public int id,canal_favorito,tempo_assistir,tempo_descanso;
		public char sexo;
		public Sala sala;
		public boolean rodar = true;
		public Pane pane;
		private FXML_Controlador_Hotel fh;
		private Image hospede_imagem;
		private boolean firsttime = true;
		private AudioClip tv_on_off;
		private boolean ligou = false;
		
		public Hospede(Pane pane,FXML_Controlador_Hotel fh, Sala sala, int id, char sexo, int canal_favorito,int tempo_assistir, int tempo_descanso){
			this.pane = pane;
			this.id = id;
			this.sexo = sexo;
			this.canal_favorito = canal_favorito;
			this.tempo_assistir = tempo_assistir;
			this.tempo_descanso = tempo_descanso;
			this.sala = sala;
			this.fh = fh;
			if(this.sexo == 'F'){
				if(this.id == 1){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h1.png"));
				}
				if(this.id == 2){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h2.png"));
				}
				if(this.id == 3){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h3.png"));
				}
				if(this.id == 4){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h4.png"));
				}
				if(this.id == 5){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h5.png"));
				}
				if(this.id == 6){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h6.png"));
				}
				if(this.id == 7){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h7.png"));
				}
				if(this.id == 8){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h8.png"));
				}
				if(this.id == 9){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h9.png"));
				}
				if(this.id == 10){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Mulheres/h10.png"));
				}
			}
			else{
				if(this.id == 1){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h1.png"));
				}
				if(this.id == 2){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h2.png"));
				}
				if(this.id == 3){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h3.png"));
				}
				if(this.id == 4){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h4.png"));
				}
				if(this.id == 5){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h5.png"));
				}
				if(this.id == 6){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h6.png"));
				}
				if(this.id == 7){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h7.png"));
				}
				if(this.id == 8){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h8.png"));
				}
				if(this.id == 9){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h9.png"));
				}
				if(this.id == 10){
					hospede_imagem = new Image(getClass().getResourceAsStream("/Fontes/Imagens/Hospedes/Homens/h10.png"));
				}
			}
			this.fh.Setar_Hospede_Imagem(this.id, hospede_imagem);
			this.fh.Setar_Hospede_Label_Info(this.id,"Id: " + this.id + "    Canal Favorito: " + this.canal_favorito + "\nAssiste por: " + this.tempo_assistir + "s.    Descansa por: " + this.tempo_descanso + "s.");
			tv_on_off = new AudioClip(this.getClass().getResource("/Fontes/Sons/TV/tv_on_off.mp3").toString());
		}
		
		public void setHotel(FXML_Controlador_Hotel fh){
			this.fh = fh;
		}
		
		public void Parar_Hospede() {
			this.rodar = false;
			if(!fh.simplificar){
				tv_on_off.stop();
			}
		}
		
		public void Assistir_TV(){
			long inicio;
			LocalTime instante = LocalTime.now();
			fh.Atualizar_Log(instante,"\n->Hospede " + id + " assistindo canal " + sala.canal_atual + ".\n\n");
			inicio = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
			int tempo = tempo_assistir - (int)(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - inicio);
			int ultimo_tempo = tempo; 
			fh.Mostrar_Hospede_Tempo(this.id,tempo);
			while(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - inicio < tempo_assistir && this.rodar){
				tempo = tempo_assistir - (int)(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - inicio);
				if(ultimo_tempo - tempo >= 1){
					fh.Mostrar_Hospede_Tempo(this.id,tempo);
					ultimo_tempo = tempo;
				}
			}
			instante = LocalTime.now();
			fh.Atualizar_Log(instante,"\n->Hospede " + id + " parou de assistir canal " + sala.canal_atual + ".\n\n");
		}
		
		public void Descansar(){
			LocalTime instante = LocalTime.now();
			fh.Atualizar_Log(instante,"\n->Hospede " + id + " descansando.\n\n");
			long inicio = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
			int tempo = tempo_descanso - (int)(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - inicio);
			int ultimo_tempo = tempo; 
			fh.Mostrar_Hospede_Tempo(this.id,tempo);
			while(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - inicio < tempo_descanso && this.rodar){
				tempo = tempo_descanso - (int)(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - inicio);
				if(ultimo_tempo - tempo >= 1){
					fh.Mostrar_Hospede_Tempo(this.id,tempo);
					ultimo_tempo = tempo;
				}
			}
			instante = LocalTime.now();
			fh.Atualizar_Log(instante, "\n->Hospede " + id + " saiu do descanso.\n\n");
		}
		
		@Override
		public void run() {
			LocalTime momento;
			while(rodar){
				try {
					sala.assiste.acquire();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				if(sala.canal_atual == 0 || sala.canal_atual == canal_favorito){
					if(sala.canal_atual == 0){
						ligou = true;
						sala.canal_atual = canal_favorito;
						try {
							sala.espera.acquire();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					sala.n_hospedes_assistindo++;
					sala.assiste.release();
					Platform.runLater(() -> {fh.Animacao_Assistir_tv(this.id);});
					if(!firsttime){
						try {
							TimeUnit.SECONDS.sleep(3);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					firsttime = false;
					if(ligou){
						if(!fh.simplificar){
							fh.Mostrar_Controle(this.id,1);
							tv_on_off.setVolume(10);
							tv_on_off.play();
							fh.Passar_Programa(sala.canal_atual);
						}
						ligou = false;
					}
					fh.Mostrar_Canal(sala.canal_atual);
					momento = LocalTime.now();
					fh.Atualizar_Log(momento,"\n->Tv sintonizada no canal " + sala.canal_atual + ".\n\n");
					Assistir_TV(); //função para "assistir" tv
					try {
						sala.mutex1.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					sala.n_hospedes_assistindo--;
					if(sala.n_hospedes_assistindo == 0){
						if(!fh.simplificar){
							fh.Mostrar_Controle(this.id,0.2);
							tv_on_off.setVolume(10);
							tv_on_off.play();
							fh.Desligar_Tv();
						}
						sala.canal_atual = 0;
						fh.Mostrar_Canal(0);
						momento = LocalTime.now();
						fh.Atualizar_Log(momento,"\n->Tv desligada.\n\n");
						sala.espera.release(sala.n_hospedes_em_espera + 1);
					}
					sala.mutex1.release();
					Platform.runLater(() -> {fh.Animacao_Descansar(this.id);});
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Descansar(); //função para "descansar"
				}
				else{
					sala.n_hospedes_em_espera++;
					sala.assiste.release();
					Platform.runLater(() -> {fh.Animacao_Bloquear(this.id);});
					if(!firsttime){
						try {
							TimeUnit.SECONDS.sleep(3);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					firsttime = false;
					momento = LocalTime.now();
					fh.Atualizar_Log(momento,"\n->Hospede " + id + " bloqueado.\n\n" );
					try {
						sala.espera.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					try {
						sala.mutex2.acquire();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					sala.n_hospedes_em_espera--;
					sala.mutex2.release();
				}
			}
		}
	}