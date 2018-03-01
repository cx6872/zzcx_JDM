package chain_of_responsibility_partern;
/**
 * @version 1.00
 * @author chenxu
 * @date 2017��12��11�� ����2:36:59
 * 
 */

//���ģʽ֮������ģʽ                       https://www.cnblogs.com/draem0507/p/3784130.html
public class Test {
	public static void main(String[] args) {

        /*ConcreteHandler handler1 = new ConcreteHandler();
        ConcreteHandler handler2 = new ConcreteHandler();
        handler1.setNextHandler(handler2);
        handler1.doHandler();*/
        
        ProjectHandler projectHandler =new ProjectHandler();
        DeptHandler deptHandler =new DeptHandler();
        GeneralHandler generalHandler =new GeneralHandler();
        projectHandler.setNextHandler(deptHandler);
        deptHandler.setNextHandler(generalHandler);
        projectHandler.doHandler("lwx", 450);
        projectHandler.doHandler("lwx", 600);
        projectHandler.doHandler("zy", 600);
        projectHandler.doHandler("zy", 1500);
        projectHandler.doHandler("lwxzy", 1500);
    }
}
