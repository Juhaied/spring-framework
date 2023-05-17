package com.springcore.auto.wire.example;

public class Employee {
	private int fee;
    private String name;
    private Department department;
    public int getEid() {
        return fee;
    }
    public void setEid(int eid) {
        this.fee = eid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
	@Override
	public String toString() {
		return "Employee [eid=" + fee + ", name=" + name + ", department=" + department + "]";
	}
      
}
