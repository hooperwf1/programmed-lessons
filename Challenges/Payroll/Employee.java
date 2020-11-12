public class Employee {

	static int currentId = 0;

	String name, position;
	double wage;
	int id, hours = 0, totalHours = 0;

	Employee(String name, String position, double wage){
		this.name = name;
		this.position = position;
		this.wage = wage;

		id = currentId;
		currentId++;
	}

	public String getName(){
		return name;
	}

	public String getPosition(){
		return position;
	}

	public int getId(){
		return id;
	}

	public double getWage(){
		return wage;
	}

	public int getHours(){
		return hours;
	}

	public int getTotalHours(){
		return totalHours;
	}

	public void setWage(double wage){
		this.wage = wage;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public void addHours(int hours){
		this.hours += hours;
		this.totalHours += hours;
	}

	public Paycheck requestPaycheck(){
		Paycheck paycheck = new Paycheck(this);
		hours = 0;

		return paycheck;
	}

	public String toString(){
		String response;
		response = "Name: " + name + ", Position: " + position + ", ID: " + id + ", Wage: $" + wage + ", Hours: " + hours + ", Total Hours: " + totalHours;

		return response;
	}

}
