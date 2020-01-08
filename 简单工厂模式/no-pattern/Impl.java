/**
 * @author yaoLong
 * @date 2020-01-08  21:08
 */
/**
 * 对接口的实现
 */
public class Impl implements Api{
    @Override
    public void test1(String s) {
        System.out.println("Impl=="+s);
    }
}