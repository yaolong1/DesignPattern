package Test;

/**
 * @author yaoLong
 * @date 2020-01-09  21:20
 */
public class AModuleImpl implements AModuleApi{
    @Override
    public void a1() {
        System.out.println("这是a1调用了一下方法");
        a2();
        a3();
        testA();

    }

    @Override
    public void a2() {
        System.out.println("a2");
    }

    @Override
    public void a3() {
        System.out.println("a3");
    }

    @Override
    public void testA() {
        System.out.println("testA");
    }
}