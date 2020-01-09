package Test;

/**
 * @author yaoLong
 * @date 2020-01-09  21:21
 */
public class CModuleImpl implements CModuleApi{
    @Override
    public void c1() {
        System.out.println("这是c1调用了一下方法");
        c2();
        c3();
        testC();

    }

    @Override
    public void c2() {
        System.out.println("c2");
    }

    @Override
    public void c3() {
        System.out.println("c2");
    }

    @Override
    public void testC() {
        System.out.println("testc");
    }
}