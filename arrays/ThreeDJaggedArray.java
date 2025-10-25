//3D Jagged Array
class ThreeDJaggedArray{
	public static void main(String[] args){
		int[][][] a = new int[2][][]; //Only first dimensional size is fixed
		a[0] = new int[3]; //first block - 3 sub arrays
		a[0][1] = new int[2]; // first sub array of size 2
		a[0][2] = new int[2]; // first sub array of size 2
		a[0][3] = new int[3]; // first sub array of size 3
		
		a[1] = new int[2][2];//second block
							// 2x2  sub arrays (fully initialized)
		
	}
}