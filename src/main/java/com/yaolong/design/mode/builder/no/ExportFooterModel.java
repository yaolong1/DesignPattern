package com.yaolong.design.mode.builder.no;

/**
 * @program: DesignMode
 * @description: 描述输出到文件尾的内容的对象
 * @author: yaolong
 * @create: 2020-02-16 17:48
 **/
public class ExportFooterModel {
    /**
     * 输出人
     */
    private String exportUser;
    public String getExportUser() {
        return exportUser;
    }
    public void setExportUser(String exportUser) {
        this.exportUser = exportUser;
    }
}