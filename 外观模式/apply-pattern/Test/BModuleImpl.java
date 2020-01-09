package Test;

/**
 * @author yaoLong
 * @date 2020-01-09  21:21
 */
public class BModuleImpl implements BModuleApi{
    @Override
    public void b1() {
        System.out.println("这是b1调用了一下方法");
        b2();
        b3();
        testB();

    }

    @Override
    public void b2() {
        System.out.println("b2");
    }

    @Override
    public void b3() {
        System.out.println("b2");
    }

    @Override
    public void testB() {
        System.out.println("testb");
    }
}