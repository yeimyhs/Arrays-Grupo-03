public class Ejercicio2 {
	
	public static void main(String[]args){
		
		int [][] a�os = new int [2][2];
		 
		a�os[0][0]=1;
		a�os[0][1]=2;
		a�os[1][0]=3;
		a�os[1][1]=4;
		
		System.out.println(matriz(a�os));
	}
	
	public static int matriz (int[][]a�os) {
		
		int suma=0;
		int filas=a�os.length;
		int columnas=a�os[0].length;
		
		for (int i=0;i<filas;i++) {
			
			for(int j=0;j<columnas;j++)
				suma+=a�os[i][j];
		}
			
		return suma;
	}
}