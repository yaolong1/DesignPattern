/**
 * @author yaoLong
 * @date 2020-01-08  21:08
 */
/**
 * 对接口的实现
 */
public class Impl2 implements Api{

    @Override
    public void test1(String s) {
        System.out.println("Impl2 s=="+s);
    }
}