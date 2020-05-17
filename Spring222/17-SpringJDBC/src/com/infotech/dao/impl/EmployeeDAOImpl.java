package com.infotech.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		String SQL="SELECT *FROM employee_table WHERE employeeid=?";
		Employee employee = jdbcTemplate.queryForObject(SQL, new EmployeeRowMapper(), employeeId);
		return employee;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		String SQL="DELETE FROM employee_table WHERE employeeId=?";
		int update = jdbcTemplate.update(SQL, employeeId);
		if(update>0)
			System.out.println("Employee is deleted..");
	}

	@Override
	public void updateEmployeeEmailById(String newEmail, int employeeId) {
		String SQL="UPDATE employee_table set email=? WHERE employeeId=?";
		int update = jdbcTemplate.update(SQL, newEmail,employeeId);
		if(update>0)
			System.out.println("Email is updated..");

	}

	@Override
	public List<Employee> getAllEmployeesDetails() {
		String SQL="SELECT *FROM employee_table";
		return jdbcTemplate.query(SQL, new EmployeeRowMapper());
	}

	@Override
	public void createEmployee(Employee employee) {
	/*	String SQL ="INSERT INTO employee_table(employee_name,email,gender,salary) VALUES(?,?,?,?)";
		int update = jdbcTemplate.update(SQL, new Object[]{employee.getEmployeeName(),employee.getEmail(),employee.getGender(),employee.getSalary()});
	*/
		int update=jdbcTemplate.update("INSERT INTO employee_table(employeename,email,gender,salary) VALUES(?,?,?,?)", employee.getEmployeeName(),employee.getEmail(),employee.getGender(),employee.getSalary());
		if(update>0)
			System.out.println("Employee is created...");
	}
}
