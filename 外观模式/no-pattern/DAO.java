/**
 * @author yaoLong
 * @date 2020-01-09  20:52
 * 示意生成数据层的模块
 */
public class DAO {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenDAO()){
            System.out.println("正在生成数据层代码文件");
        }
    }
}