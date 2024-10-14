package Gestionemedia;

public class Voti {
	
	private int NDiscendenti = 5;
	private int NDiscipline = 3;
	
	private int [][] voti = new int [NDiscendenti][NDiscipline];

	public Voti(int [][] VotiDaAssegnare){
		this.voti = VotiDaAssegnare;
	}
	
	public double mediaDiscendente (int indiceDiscendente) {
		double somma = 0;
		
		for (int i=0;i<NDiscipline;i++) {
			somma += voti[i][indiceDiscendente];
		}
		return somma/NDiscipline;
	}
	

	public double mediaDisciplina (int indiceDisciplina) {
		double media = 0;
		
		for(int i=0;i<NDiscendenti;i++) {
			media += voti[indiceDisciplina][i];
		}
		return media/NDiscendenti;
	}
		
 
}
