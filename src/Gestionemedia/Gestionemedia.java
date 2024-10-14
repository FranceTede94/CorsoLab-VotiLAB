package Gestionemedia;

public class Gestionemedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] VotiLab = {
				
				{10, 5, 7, 8, 7},
				{10, 6, 8, 7, 10},
				{8, 2, 5, 8, 5}
				
		};
		
		Voti Voti = new Voti(VotiLab);
		
		System.out.println(Voti.mediaDiscendente(0));
		System.out.println(Voti.mediaDisciplina(0));
		

		
	}	
		
}
