//2D Jagged Array
class TwoDJaggedArray{
	public static void main(String[] args){
		int[][] a = new int[2][]; //Only first dimensional size is fixed
		a[0] = new int[3]; //2nd Dimension first row
		a[1] = new int[2]; //2nd Dimension second row
		
		System.out.println(a[0][0]);
	}
}