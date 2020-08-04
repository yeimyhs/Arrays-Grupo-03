public class Ejercicio01 {
	
	public static void main(String[]args){
		
		int [] años = new int [5];
		 
		años[0]=8;
		años[1]=15;
		años[2]=26;
		años[3]=13;
		años[4]=10;

		System.out.println(media(años));
	}
	
	static int media (int[]años) {
		
		int suma=0;
		
		for (int i=0;i<años.length;i++)
			suma+=años[i];
		return suma;
	}
}