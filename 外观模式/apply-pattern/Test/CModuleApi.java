package Test;

/**
 * @author yaoLong
 * @date 2020-01-09  21:20
 */
public interface CModuleApi {

    //对子系统外部
    public void c1();
    //子系统内部使用
    public void c2();
    //子系统内部使用
    public void c3();

    public void testC();
}
