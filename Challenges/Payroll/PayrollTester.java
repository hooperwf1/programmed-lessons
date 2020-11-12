public class PayrollTester {
	
	public static void main(String[] args){
		Employee employee1 = new Employee("George", "Manager", 25.50);
		Employee employee2 = new Employee("Kyle", "Cashier", 13.00);

		employee1.addHours(10);
		Paycheck paycheck1 = employee1.requestPaycheck();
		employee2.addHours(10);
		Paycheck paycheck2 = employee2.requestPaycheck();

		System.out.println(employee1);
		System.out.println(paycheck1);
		System.out.println(employee2);
		System.out.println(paycheck2);
	}	

}
