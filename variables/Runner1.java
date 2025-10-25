class Runner1{
	//Instance variables
	int i = 20;
	String name = "Yash";
	//Static variables
	static int j = 40;
	static String collge = "ABC College";
	
	public Runner1(){
		System.out.println("Running Runner1");
	}
	public static void main(String[] args){
		//Local Variables
		int x;
		String text = "Vtech";
		int[] arr = {10, 20, 30, 40};

		System.out.println(x);
		System.out.println(text);
		System.out.println(arr[0] +" "+ arr[1]+" "+ arr[2] +" "+ arr[3]);
		System.out.println(Runner1.j);
		System.out.println(Runner1.collge);

		Runner1 runnerObj = new Runner1();
		System.out.println(runnerObj.i);
		System.out.println(runnerObj.name);
		System.out.println(runnerObj.j);

		Runner1 runnerObj1 = new Runner1();
		

	}
}