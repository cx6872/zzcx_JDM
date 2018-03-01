package adapter_design_pattern;

//适配器类，直接关联被适配类，同时实现标准接口  
class Adapter1 implements Target{  
 // 直接关联被适配类  
 private Adaptee adaptee;  
   
 // 可以通过构造函数传入具体需要适配的被适配类对象  
 public Adapter1 (Adaptee adaptee) {  
     this.adaptee = adaptee;  
 }  
   
 public void request() {  
     // 这里是使用委托的方式完成特殊功能  
     this.adaptee.specificRequest();  
 }  
}  


//测试类  
public class Client1 {  
 public static void main(String[] args) {  
     // 使用普通功能类  
     Target concreteTarget = new ConcreteTarget();  
     concreteTarget.request();  
       
     // 使用特殊功能类，即适配类，  
     // 需要先创建一个被适配类的对象作为参数  
     Target adapter = new Adapter1(new Adaptee());  
     adapter.request();  
 }  
}  
