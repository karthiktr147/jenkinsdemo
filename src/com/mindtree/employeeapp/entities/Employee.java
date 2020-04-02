package com.mindtree.employeeapp.entities;

public class Employee implements Comparable<Employee>
{
	private String mId;
	private String employeeName;
	private float salary;
	private String track;
	public Employee() {
		super();
	}

	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	
	@Override
	public int compareTo(Employee arg0) {	
		return (int) (this.getSalary()-arg0.getSalary());		
	}
	@Override
	public String toString() {
		return "Employee [mId=" + mId + ", employeeName=" + employeeName + ", salary=" + salary + ", track=" + track
				+ "]";
	}
	

}
