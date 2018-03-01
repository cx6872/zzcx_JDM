package chain_of_responsibility_partern;
/**
 * @version 1.00
 * @author chenxu
 * @date 2017��12��11�� ����2:34:34
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

            System.out.println("����������");
            getNextHandler().doHandler();
        } else {

            System.out.println("���Լ�����" + toString());
        }

    }
}
