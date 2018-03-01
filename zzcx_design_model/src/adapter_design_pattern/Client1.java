package adapter_design_pattern;

//�������ֱ࣬�ӹ����������࣬ͬʱʵ�ֱ�׼�ӿ�  
class Adapter1 implements Target{  
 // ֱ�ӹ�����������  
 private Adaptee adaptee;  
   
 // ����ͨ�����캯�����������Ҫ����ı����������  
 public Adapter1 (Adaptee adaptee) {  
     this.adaptee = adaptee;  
 }  
   
 public void request() {  
     // ������ʹ��ί�еķ�ʽ������⹦��  
     this.adaptee.specificRequest();  
 }  
}  


//������  
public class Client1 {  
 public static void main(String[] args) {  
     // ʹ����ͨ������  
     Target concreteTarget = new ConcreteTarget();  
     concreteTarget.request();  
       
     // ʹ�����⹦���࣬�������࣬  
     // ��Ҫ�ȴ���һ����������Ķ�����Ϊ����  
     Target adapter = new Adapter1(new Adaptee());  
     adapter.request();  
 }  
}  
