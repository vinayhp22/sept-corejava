class PrintExample {
	public static void main(String[] args){
		
		System.out.println("-----println()-----");

		System.out.println("Ajay");
		System.out.println("Sasi");
		System.out.println("Charan");
		
		System.out.println("-----print()-----");
		System.out.print("Ajay");
		System.out.print("Sasi");
		System.out.print("Charan");
		System.out.printf("%n");
		System.out.println("-----printf()-----");
		
		System.out.printf("%-10s %5s %10s %10s %n","Item", "Qty", "Price", "Stock");
		System.out.printf("%-10s %5d %10.2f %10d%% %n","Apple", 3, 60.50, 50);
		System.out.printf("%-10s %5d %10.2f %10d%% %n","Banana", 2, 25.00, 100);

		
	}
}