package dao;

import java.util.List;

import Exception.EmployeeNotFoundException;
import dto.Employee;

public interface IEmployeeDao {

	
	public void addEmployee(Employee employee);
	
	public void deleteEmployee(int empId);
	
	public void updateEmployee(Employee employee);
	
	public Employee findEmployee(Employee employee) throws EmployeeNotFoundException;
	
	public List<Employee>  showAllEmployee();
 	
	
	
	
}
