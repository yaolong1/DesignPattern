/**
 * @author yaoLong
 * @date 2020-01-08  21:08
 */
/**
 * 客户端：测试使用 Api 接口(工厂模式)
 */
public class Client2  {
    public static void main(String[] args){

//        Api api = Factory.createApi(2);
//        api.test1("这是2");
//


        //配置文件方式调用
        Api api2 = Factory.createApi2();
        api2.test1("这是impl2");

    }
}