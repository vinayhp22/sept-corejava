class EqualityOperators{
	public static void main(String[] args){
		
		System.out.println(10==20); //false
		System.out.println('a'=='b'); //false 		
		System.out.println('a'==97.0); //true ('a' -> 97, compared with double 97.0)
		System.out.println(false != true); //true
		System.out.println(false == false); //true
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = t1;
		System.out.println(t1 == t2); // false(different objects)
		System.out.println(t1 == t3); // true(same references)
		
		Thread t1 = new Thread();
		Object obj = new Object();
		String str = new String();
		System.out.println(t1 == obj); //false(Valid comparision, Thread is-a Object)
		System.out.println(str == obj); //false(Valid comparision, String is-a Object)
		//System.out.println(t1 == str); //C.E: incomparable types: Thread and String
		
		String name = new String("ajay");
		System.out.println(name == null); //false
		String name1 = null;
		System.out.println(name1 == null); //true
		System.out.println(null == null); //true
		
		String str1 = new String("Charan");
		String str2 = new String("Charan");
		System.out.println(str1 == str2); //false - (different references/objects)
		System.out.println(str1.equals(str2)); //true - (same content)
		
	}
}