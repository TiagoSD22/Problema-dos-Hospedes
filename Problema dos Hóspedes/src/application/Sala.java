package application;

import java.util.concurrent.Semaphore;

public class Sala {
	public Semaphore assiste, espera, mutex1, mutex2;
	public int canal_atual, n_hospedes_assistindo, n_hospedes_em_espera;
	
	public Sala(){
		assiste = new Semaphore(1);
		espera = new Semaphore(1);
		mutex1 = new Semaphore(1);
		mutex2 = new Semaphore(1);
		canal_atual = 0;
		n_hospedes_assistindo = 0;
		n_hospedes_em_espera = 0;
	}
}
