package chain_of_responsibility_partern;
/**
 * @version 1.00
 * @author chenxu
 * @date 2017��12��11�� ����2:36:11
 * 
 */

abstract class ConsumeHandler {

    private ConsumeHandler nextHandler;

    public ConsumeHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ConsumeHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /** user������ free�������� */
    public abstract void doHandler(String user, double free);

}

//��Ŀ����
class ProjectHandler extends ConsumeHandler {

    @Override
    public void doHandler(String user, double free) {
        if (free < 500) {

            if (user.equals("lwx")) {
                System.out.println("���豨��:" + free);
            } else {
                System.out.println("������ͨ��");
            }

        } else {
            if (getNextHandler() != null) {

                getNextHandler().doHandler(user, free);
            }
        }

    }
}
//���ž���
class DeptHandler extends ConsumeHandler {
    
    @Override
    public void doHandler(String user, double free) {
        if (free < 1000) {
            
            if (user.equals("zy")) {
                System.out.println("���豨��:" + free);
            } else {
                System.out.println("������ͨ��");
            }
            
        } else {
            if (getNextHandler() != null) {
                
                getNextHandler().doHandler(user, free);
            }
        }
        
    }
}
//�ܾ���
class GeneralHandler extends ConsumeHandler {
    @Override
    public void doHandler(String user, double free) {
        if (free >=1000) {
            
            if (user.equals("lwxzy")) {
                System.out.println("���豨��:" + free);
            } else {
                System.out.println("������ͨ��");
            }
            
        } else {
            if (getNextHandler() != null) {
                
                getNextHandler().doHandler(user, free);
            }
        }
        
    }
}
