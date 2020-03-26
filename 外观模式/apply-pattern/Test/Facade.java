package Test;

/**
 * @author yaoLong
 * @date 2020-01-09  21:22
 * 外观对象
 */
public  class Facade implements FacadeApi {

    private AModuleApi a;
    private BModuleApi b;
    private CModuleApi c;

    public Facade(){
        this.a = new AModuleImpl();
        this.b = new BModuleImpl();
        this.c = new CModuleImpl();
    }


    @Override
    public void a1() {
        AModuleApi a = new AModuleImpl();
        a.a1();
    }

    @Override
    public void b1() {
        BModuleApi b = new BModuleImpl();
        b.b1();
    }
    @Override
    public void c1() {
        CModuleApi c = new CModuleImpl();
        c.c1();
    }

    /**
     * 示意方法，满足客户需要的功能
     */
    @Override
    public void test(){
        //在内部实现的时候，可能会调用到内部的多个模块
        this.a.testA();
        this.b.testB();
        this.c.testC();
    }

    /**
     * 通过工厂调用外观类再由外观类调用子系统
     * @param args
     */
    public static void main(String[] args) {
       new Facade().test();
//        api.a1();

    }
}