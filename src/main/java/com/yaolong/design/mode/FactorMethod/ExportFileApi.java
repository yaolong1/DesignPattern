package com.yaolong.design.mode.FactorMethod;


/**
 * 导出文件接口
 * @author yaolong
 */
public interface ExportFileApi {

    /**
     * 导出内容成为文件
     * @param data 示意：需要保存的数据
     * @return 是否导出成功
     */
    public boolean export(String data);

}
