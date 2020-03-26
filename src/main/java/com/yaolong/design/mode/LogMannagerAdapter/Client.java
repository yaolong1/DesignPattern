package com.yaolong.design.mode.LogMannagerAdapter;

import com.yaolong.design.mode.LogMannagerAdapter.Target.LogDbOperateApi;
import com.yaolong.design.mode.LogMannagerAdapter.adapter.AdapterExample;
import com.yaolong.design.mode.LogMannagerAdapter.adapter.AdapterExample2;
import logMannagerOne.Api.LogFileOperateApi;
import logMannagerOne.impl.LogFileOperate;
import logMannagerOne.model.LogModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaoLong
 * @date 2020-01-10  22:02
 *
 * 使用适配器的客户端
 */
public class Client {
    public static void main(String[] args) {

        //准备日志内容，也就是测试的数据
        LogModel lm1 = new LogModel();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2010-03-02 10:08:18");
        lm1.setLogContent("这是一个测试");
        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lm1);

        //创建新版操作日志的接口对象
        LogDbOperateApi api = new AdapterExample2("OneAdapterLog.log");

        //保存日志文件
        api.createLog(lm1);
        //读取日志文件的内容
        List<LogModel> allLog = api.getAllLog();
        System.out.println("allLog="+allLog);

    }
}