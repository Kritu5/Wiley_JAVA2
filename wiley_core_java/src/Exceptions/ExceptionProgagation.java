package Exceptions;



public class ExceptionProgagation {
	
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught " + e.getMessage());
		}
	}

	public static void method1() throws Exception {
		// TODO Auto-generated method stub
		method2();
	}

	public static void method2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Expection occured in the method2");
	}

}
