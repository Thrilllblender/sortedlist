package com.trainingbasket.list;

public class Example implements Comparable {

	int id;
	String name;
	int age;
	int marks;

	static int tempId = 0;

	public Example() {
		id = ++tempId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "-------------\n" + "Id:" + this.id + " Name:" + this.name + " Age:" + this.age + " Marks:" + this.marks;
	}

	@Override
	public int compareTo(Object o) {
		Example example = (Example) o;

		if (this.marks == example.marks) {
			return 0;
		}
		if (this.marks < example.marks) {
			return -1;
		}
		return 1;
	}

}
