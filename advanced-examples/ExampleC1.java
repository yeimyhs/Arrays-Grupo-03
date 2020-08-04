public class Ejercicio2 {
	
	public static void main(String[]args){
		
		int [][] años = new int [2][2];
		 
		años[0][0]=1;
		años[0][1]=2;
		años[1][0]=3;
		años[1][1]=4;
		
		System.out.println(matriz(años));
	}
	
	public static int matriz (int[][]años) {
		
		int suma=0;
		int filas=años.length;
		int columnas=años[0].length;
		
		for (int i=0;i<filas;i++) {
			
			for(int j=0;j<columnas;j++)
				suma+=años[i][j];
		}
			
		return suma;
	}
}