using System;
class jaggedArray{
	static void Main(){
		int[][]arr = new int[4][];
		
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[1];
		arr[3]=new int[4];
		
		arr[0][0]=25;
		arr[0][1]=56;
		arr[0][2]=37;
		arr[1][0]=43;
		arr[1][1]=17;
		arr[2][0]=23;
		arr[3][0]=83;
		arr[3][1]=73;
		arr[3][2]=54;
		arr[3][3]=78;
		
		foreach(int[] i in arr){
			foreach(int j in i){
				Console.Write(j+" ");
			}
			Console.WriteLine();
		}
	}
}