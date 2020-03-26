package com.yaolong.design.mode.builder.no;

/**
 * @program: DesignMode
 * @description: 描述输出到文件头的内容的对象
 * @author: yaolong
 * @create: 2020-02-16 17:45
 **/
public class ExportHeaderModel {
    /**
     * 分公司或门市点编号
     */
    private String depId;
    /**
     * 导出数据的日期
     */
    private String exportDate;
    public String getDepId() {
        return depId;
    }
    public void setDepId(String depId) {
        this.depId = depId;
    }
    public String getExportDate() {
        return exportDate;
    }
    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}