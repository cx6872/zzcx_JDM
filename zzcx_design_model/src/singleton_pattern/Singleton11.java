package singleton_pattern;


//1����getInstance�����ϼ�ͬ��
public class Singleton11 {
	private Singleton11() {}  
    private static Singleton11 single=null;  
    //��̬��������   
    public static synchronized Singleton11 getInstance() {  
         if (single == null) {    
             single = new Singleton11();  
         }    
        return single;  
    }  
}
