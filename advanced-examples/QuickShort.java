
public class QuickShort {
	public static void main (String []args) {
		int []a = {4,10,2,9,56,-26};
		QS(a,0,a.length-1);
	//	System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]);
		for (int i = 1; i <= a.length; i++) {
			System.out.println(a[i-1]+" ");
		}
	}
	//vector o arreglo
	static void QS(int[] vector, int primero, int ultimo){
	     int i=primero, j=ultimo;
	     int pivote=vector[(primero + ultimo) / 2];
	     //divide y venceras , ve por partes 
	     int aux;
	 
	     do
	     {
	          while(vector[i]<pivote) i++;      
	          while(vector[j]>pivote) j--;
	 
	          if (i<=j)
	          {
	               aux=vector[j];
	               vector[j]=vector[i];
	               vector[i]=aux;
	               i++;
	               j--;
	          }
	     }
	     while (i<=j);
	 
	     if(primero<j)
	     {
	          QS(vector,primero, j);
	     }

	     if(ultimo>i)
	     {
	    	 QS(vector,i, ultimo);
	     }
	}
}
