package concurrency_books_example;

public class Books {
	private int id;// ͼ��ID
	private String name; // ͼ������
	private int number; // ͼ������

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

	// ����
	public void taskBooks(int count) {
		number -= count;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// ����
	public void stockBooks(int count) {
		number += count;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}