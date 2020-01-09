package Test;

/**
 * @author yaoLong
 * @date 2020-01-09  21:17
 *
 * A 模块的接口
 */
public interface AModuleApi {


    public void a1();
    //子系统内部使用
    public void a2();
    //子系统内部使用
    public void a3();

    /**
     * 示意方法，A 模块对外的一个功能方法
     */
    public void testA();
}