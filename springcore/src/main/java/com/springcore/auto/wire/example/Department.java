package com.springcore.auto.wire.example;

public class Department {
    private String deptName;
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + "]";
	}
}