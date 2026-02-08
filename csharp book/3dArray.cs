using System;
class array{
	static void Main(){
		Console.Write("Enter size of dimenshion:");
		int d=int.Parse(Console.ReadLine());
		Console.Write("Enter size of row:");
		int r=int.Parse(Console.ReadLine());
		Console.Write("Enter size of column:");
		int c=int.Parse(Console.ReadLine());
		int[,,]arr = new int[d,r,c];
		
		for(int i=0;i<arr.GetLength(0);i++){
			for(int j=0;j<arr.GetLength(1);j++){
				for(int k=0;k<arr.GetLength(2);k++){
					Console.Write("Enter value of [{0},{1},{2}]:",i,j,k);
					arr[i,j,k]=int.Parse(Console.ReadLine());
				}
			}
		}
		
		for(int i=0;i<arr.GetLength(0);i++){
			for(int j=0;j<arr.GetLength(1);j++){
				for(int k=0;k<arr.GetLength(2);k++){
					Console.Write(arr[i,j,k]+" ");
				}
				Console.WriteLine();
			}
			Console.WriteLine();
		}
	}
}