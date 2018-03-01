package concurrency_books_example;

public class Books {
	private int id;// 图书ID
	private String name; // 图书名称
	private int number; // 图书数量

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public Books(String name, int number) {
		this.name = name;
		this.number = number;
	}

	// 借书
	public void taskBooks(int count) {
		number -= count;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 存书
	public void stockBooks(int count) {
		number += count;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}