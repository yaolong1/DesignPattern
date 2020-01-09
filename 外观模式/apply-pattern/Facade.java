/**
 *
 */
public class Facade {
    /**
     * 客户端需要的，一个简单的调用代码生成的功能
     */
    public void generate() {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }


    /**
     * 客户端调用
     * @param args
     */
    public static void main(String[] args) {

        //使用 Facade
        new Facade().generate();
    }
}