package com.masai.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int detpId;
	private String name;
	private String location;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department", fetch = FetchType.EAGER)
	List<Employee> employeeSet = new ArrayList<>();

	public int getDetpId() {
		return detpId;
	}

	public void setDetpId(int detpId) {
		this.detpId = detpId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(List<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}

	@Override
	public String toString() {
		return "Department{" + "detpId=" + detpId + ", name='" + name + '\'' + ", location='" + location + '\'' + '}';
	}
}