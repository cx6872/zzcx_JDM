package concurrency_books_example;

public class bibliotheca implements Runnable {  
    private Books books;  
  
    public bibliotheca(Books books) {  
        super();  
        this.books = books;  
    }  
  
    public Books getBooks() {  
        return books;  
    }  
  
    public void setBooks(Books books) {  
        this.books = books;  
    }  
  
    @Override  
    public void run() {  
//        synchronized(this){  
//        books.stockBooks(1000); // ����1000����  
//        books.taskBooks(1000);  
//        System.out.println(Thread.currentThread().getName() + ":"  
//                + books.getNumber());   
//        }
        books.stockBooks(1000); // ����1000����  
        books.taskBooks(1000);  
        System.out.println(Thread.currentThread().getName() + ":"  
                + books.getNumber());  
        
    }  
    public static void main(String[] args) {  
        Books books = new Books("��ƿ÷", 1000); // ��ʼ����ʱ���ȴ���1000����ƿ÷  
        bibliotheca bibliotheca = new bibliotheca(books); // ��ͼ��ע�뵽ͼ�����  
        Thread threads[] = new Thread[10]; // ģ��10���߳�  
        for (int i = 0; i < 10; i++) {  
            threads[i] = new Thread(bibliotheca, "Thread" + i);  
            threads[i].start();  
        }  
  
    }  
}  
