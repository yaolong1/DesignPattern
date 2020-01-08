import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author yaoLong
 * @date 2020-01-08  21:24
 */
public class Factory {


    public static Api createApi(int condition){
        Api api = null;

        if(condition == 1){
            api = new Impl1();
        }else if(condition == 2){
            api = new Impl2();
        }
        return api;

    }

    /**
     * 可配置的简单工厂
     *  具体创建 Api 的方法，根据配置文件的参数来创建接口
     * @return
     */
    public static Api createApi2()  {

        Properties p = new Properties();

        InputStream in = null;

        in = Factory.class.getResourceAsStream("FactoryTest.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            System.out.println(
                    "装载工厂配置文件出错了，具体的堆栈信息如下：");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //用反射去创建，那些例外处理等完善的工作这里就不做了

        Api api = null;

        try {
            api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return api;

    }


}
