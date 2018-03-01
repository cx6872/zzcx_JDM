package singleton_pattern;


//1、在getInstance方法上加同步
public class Singleton11 {
	private Singleton11() {}  
    private static Singleton11 single=null;  
    //静态工厂方法   
    public static synchronized Singleton11 getInstance() {  
         if (single == null) {    
             single = new Singleton11();  
         }    
        return single;  
    }  
}
