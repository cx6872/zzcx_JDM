package chain_of_responsibility_partern;
/**
 * @version 1.00
 * @author chenxu
 * @date 2017年12月11日 下午2:36:11
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

    /** user申请人 free报销费用 */
    public abstract void doHandler(String user, double free);

}

//项目经理
class ProjectHandler extends ConsumeHandler {

    @Override
    public void doHandler(String user, double free) {
        if (free < 500) {

            if (user.equals("lwx")) {
                System.out.println("给予报销:" + free);
            } else {
                System.out.println("报销不通过");
            }

        } else {
            if (getNextHandler() != null) {

                getNextHandler().doHandler(user, free);
            }
        }

    }
}
//部门经理
class DeptHandler extends ConsumeHandler {
    
    @Override
    public void doHandler(String user, double free) {
        if (free < 1000) {
            
            if (user.equals("zy")) {
                System.out.println("给予报销:" + free);
            } else {
                System.out.println("报销不通过");
            }
            
        } else {
            if (getNextHandler() != null) {
                
                getNextHandler().doHandler(user, free);
            }
        }
        
    }
}
//总经理
class GeneralHandler extends ConsumeHandler {
    @Override
    public void doHandler(String user, double free) {
        if (free >=1000) {
            
            if (user.equals("lwxzy")) {
                System.out.println("给予报销:" + free);
            } else {
                System.out.println("报销不通过");
            }
            
        } else {
            if (getNextHandler() != null) {
                
                getNextHandler().doHandler(user, free);
            }
        }
        
    }
}
