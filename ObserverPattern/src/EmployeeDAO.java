import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	Employee emp1 = new Employee("mike", null, 35000, true);
	Employee emp2 = new Employee("john", null, 45000, true);
	Employee emp3 = new Employee("stever", null, 46000, true);
	List<Employee> employees;
	public List<Employee> generateEmployees(){
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		return employees;
	}
	public void addEmployee(Employee emp){
		employees.add(emp);
	}
}


