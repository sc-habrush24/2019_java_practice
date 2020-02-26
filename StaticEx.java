class ArrayUtil {
	int f []; 
	public static int [] contact(int a [], int b []) {
		int c [] = new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		int k =0;
		for(int m=a.length;m<a.length+b.length;m++) {
			c[m]=b[k];
			k++;
		}
		return c;}
		public static void print(int[] c) {
			System.out.print("[");
			for (int x=0;x<c.length;x++) {
				System.out.print(c[x]+" ");
			}
			System.out.print("]");
		}
	}

public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1,5,7,9};
		int [] array2 = {3,6,-1,100,77};
		int [] array3 = ArrayUtil.contact(array1, array2);
		ArrayUtil.print(array3);
		
	}

}