package com.yaolong.design.mode.LogMannagerAdapter.impl;

import logMannagerOne.Api.LogFileOperateApi;
import logMannagerOne.model.LogModel;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * @author yaoLong
 * @date 2020-01-10  21:34
 *
 * 实现对日志文件的操作
 *
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "OneAdapterLog.log";
    /**
     * 构造方法，传入文件的路径和名称
     * @param logFilePathName 文件的路径和名称
     */
    public LogFileOperate(String logFilePathName) {
        //先判断是否传入了文件的路径和名称，如果是，
        //就重新设置操作的日志文件的路径和名称
        if(logFilePathName!=null &&
                logFilePathName.trim().length()>0){
            this.logFilePathName = logFilePathName;
        }
    }
    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        try {
            File f = new File(logFilePathName);
            if(f.exists()){
                oin = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(f))
                );
                list = (List<LogModel>)oin.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(oin!=null){
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    @Override
    public void writeLogFile(List<LogModel> list){
        File f = new File(logFilePathName);
        ObjectOutputStream oout = null;
        try {
            oout = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(f))
            );
            oout.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                oout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

