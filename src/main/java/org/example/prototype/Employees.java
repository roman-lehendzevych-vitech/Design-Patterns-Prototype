package org.example.prototype;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Employees implements Cloneable {

	private final List<String> empList;
	
	public Employees() {
		empList = new ArrayList<>();
	}
	
	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("Black");
		empList.add("Ivan");
		empList.add("Roman");
		empList.add("Max");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<>(this.getEmpList());
		return new Employees(temp);
	}
}
