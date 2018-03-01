package chain_of_responsibility_partern;
/**
 * @version 1.00
 * @author chenxu
 * @date 2017年12月11日 下午2:34:34
 * 
 */
abstract class Handler {

    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void doHandler();

}

class ConcreteHandler extends Handler {

    @Override
    public void doHandler() {

        if (getNextHandler() != null) {

            System.out.println("还有责任链");
            getNextHandler().doHandler();
        } else {

            System.out.println("我自己处理" + toString());
        }

    }
}
