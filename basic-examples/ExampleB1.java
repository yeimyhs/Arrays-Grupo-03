public class Ejercicio01 {
	
	public static void main(String[]args){
		
		int [] a�os = new int [5];
		 
		a�os[0]=8;
		a�os[1]=15;
		a�os[2]=26;
		a�os[3]=13;
		a�os[4]=10;

		System.out.println(media(a�os));
	}
	
	static int media (int[]a�os) {
		
		int suma=0;
		
		for (int i=0;i<a�os.length;i++)
			suma+=a�os[i];
		return suma;
	}
}