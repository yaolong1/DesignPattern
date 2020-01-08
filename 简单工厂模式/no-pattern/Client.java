/**
 * @author yaoLong
 * @date 2020-01-08  21:08
 */
/**
 * 客户端：测试使用 Api 接口（普通）
 */
public class Client {
    public static void main(String[] args) {
        Api api = new Impl();
        api.test1("哈哈，不要紧张，只是个测试而已！");
    }
}