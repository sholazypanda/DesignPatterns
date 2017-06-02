import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject{
	private List<IObserver> observerList;
	private List<Employee> employees;
	private EmployeeDAO empDao;

	private Employee emp;
	private String msg;
	public EmployeeManagementSystem() {
		
		observerList = new ArrayList<IObserver>();
		empDao = new EmployeeDAO();
		employees = empDao.generateEmployees();
	}

	public void hireNewEmployee(Employee emp) {
		// TODO Auto-generated method stub
		this.emp = emp;
		employees.add(emp);
		msg = "Hired";
		//empDao.addEmployee(emp);
		//System.out.println(emp.toString()+"hired");
		notifyObservers();
	}

	public void registerObserver(IObserver observerObject) {
		// TODO Auto-generated method stub
		observerList.add(observerObject);
		//this.observerObj = observerObj;
	}

	public void modifyEmployeeName(int empId, String empName) {
		// TODO Auto-generated method stube
		boolean notify = false;
		for(Employee emp:employees){
			System.out.println(emp.employeeID);
			if(empId == emp.employeeID){
				emp.setName(empName);
				this.emp = emp;
				this.msg = "Employee modified";
				notify = true;
			}
		}
		if(notify)
			notifyObservers();
		//System.out.println("emp modified");
		//notifyObservers();
	}
	public void notifyObservers(){
		for(IObserver ob:observerList){
			ob.callme(emp,msg);
		}
	}

	@Override
	public void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		observerList.remove(o);
	}
}
