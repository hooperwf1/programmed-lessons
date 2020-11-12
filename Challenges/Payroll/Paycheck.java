public class Paycheck {
	
	Employee employee;
	double amount, wage;
	int hours;
	boolean erroneous;

	Paycheck(Employee employee){
		this.employee = employee;
		this.wage = employee.getWage();
		this.hours = employee.getHours();

		amount = (hours * wage) * 0.85f;

		erroneous = hours > 100 || amount > 1500.f;
	}

	public Employee getEmployee(){
		return employee;
	}

	public double getAmount(){
		return amount;
	}

	public double getWage(){
		return wage;
	}

	public int getHours(){
		return hours;
	}

	public boolean isErroneous(){
		return erroneous;
	}

	public String toString(){
		String response;
		response = "Amount: " + amount + ", Hours: " + hours + ", Wage: " + wage + ", Employee Name: " + employee.getName() + ", Employee ID: " + employee.getId();

		if(erroneous){
			response += ", Erroneous Paycheck!";
		}

		return response;
	}

}
