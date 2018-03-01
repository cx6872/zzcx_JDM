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
//        books.stockBooks(1000); // 存入1000本书  
//        books.taskBooks(1000);  
//        System.out.println(Thread.currentThread().getName() + ":"  
//                + books.getNumber());   
//        }
        books.stockBooks(1000); // 存入1000本书  
        books.taskBooks(1000);  
        System.out.println(Thread.currentThread().getName() + ":"  
                + books.getNumber());  
        
    }  
    public static void main(String[] args) {  
        Books books = new Books("金瓶梅", 1000); // 初始化的时候先存入1000本金瓶梅  
        bibliotheca bibliotheca = new bibliotheca(books); // 把图书注入到图书馆里  
        Thread threads[] = new Thread[10]; // 模拟10个线程  
        for (int i = 0; i < 10; i++) {  
            threads[i] = new Thread(bibliotheca, "Thread" + i);  
            threads[i].start();  
        }  
  
    }  
}  
