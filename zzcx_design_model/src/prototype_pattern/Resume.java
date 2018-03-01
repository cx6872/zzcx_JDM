package prototype_pattern;

import java.util.ArrayList;

/**
 * @version 1.00
 * @author chenxu
 * @date 2018年2月28日 下午4:26:10
 * 
 */
public class Resume implements Cloneable {

	public String name = null;
	public int age = 0;
	public String sex = null;
	public ArrayList<String> famMem = new ArrayList<>();
	public WorkExperience work = null;

	public Resume(String name, ArrayList<String> famMem) {
		this.name = name;
		this.famMem = famMem;
		work = new WorkExperience();
	}// Resume

	public void setName(String name) {
		this.name = name;
	}// setName

	public void setPersonal(String sex, int age) {
		this.age = age;
		this.sex = sex;
	}// setPersonal

	public void setWork(String timeArea, String company) {
		work.timeArea = timeArea;
		work.company = company;
	}// setWork

	/**
	 * 重些clone()方法为public类型，为每个字段都创建新的对象，已实现深拷贝功能。
	 */
	@Override
	public Resume clone() throws CloneNotSupportedException {
		int age = this.age;
		String sex = this.sex;
		String name = new String(this.name);
		ArrayList<String> famMem = new ArrayList<>(this.famMem);

		Resume copy = new Resume(name, famMem);
		copy.setPersonal(sex, age);
		copy.setWork(this.work.timeArea, this.work.company);
		return copy;
	}// clone

	public void display() {
		System.out.println(this.name + " " + this.sex + " " + this.age);
		System.out.print("Family member: ");
		for (String elem : famMem)
			System.out.print(elem + " ");
		System.out.println();
		System.out.print("Work experience: " + this.work.timeArea);
		System.out.println(" " + this.work.company);
	}// display

}/* Resume */
