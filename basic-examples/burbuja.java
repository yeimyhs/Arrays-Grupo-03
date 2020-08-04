
public class burbuja {
	public static void main (String []args) {
		int []n = {4,10,2,9};
		int []o = new int [4];
		o=OrdBurbuja(n);
		System.out.println(o[0]+","+o[1]+","+o[2]+","+o[3]);
	}
	
	public static int [] OrdBurbuja(int[]n) {
		int aux;
		int t = n.length;
		for (int i = 1; i < t; i++) {
			for (int k = t-1; k>= i;k--) {
				if(n[k] < n[k-1]) {
					aux = n[k];
					n[k] = n[k-1];
					n[k-1]= aux ;
				}
			}
		}
		return n ;
	}

}
