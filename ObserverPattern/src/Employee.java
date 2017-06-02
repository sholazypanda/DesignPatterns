import java.util.Date;

public class Employee {

	private String name;
	private Date date;
	private int salary;
	public int employeeID;
	private boolean working = false;
	private static int COUNTER;
	public Employee(String name, Date date, int salary, boolean working) {
		
		this.name = name;
		this.date = date;
		this.salary = salary;
		this.working = working;
		employeeID = COUNTER++;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", date=" + date + ", salary=" + salary + ", working=" + working + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

}
