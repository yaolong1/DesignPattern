package com.yaolong.design.mode.flyweight.yes;

import com.yaolong.design.mode.flyweight.no.TestDB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: DesignMode
 * @description: 安全管理，实现成单例
 * @author: yaolong
 * @create: 2020-03-01 11:15
 **/
public class SecurityMgr {

    private static SecurityMgr securityMgr = new SecurityMgr();

    private SecurityMgr() {

    }

    public static SecurityMgr getSecurityMgr() {
        return securityMgr;
    }


    /**
     * 再运行期间，用来存放登录人员对应的权限
     * 在web中通常是存入session中
     */
    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    /**
     * 模拟登录的功能
     *
     * @param user 登录的用户
     */
    public void login(String user) {
        //登录时就需要把该用户所拥有的权限，从数据库中取出来，放到缓存中去
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }

    /**
     * 判断某用户对某个安全实体是否拥有某种权限
     *
     * @param user           被检测权限的用户
     * @param securityEntity 安全实体
     * @param permit         权限
     * @return true 表示拥有相应权限，false 表示没有相应权限
     */
    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> col = map.get(user);
        if (col == null || col.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }
        for (Flyweight fm : col) {
            //输出当前实例，看看是否同一个实例对象
            System.out.println("fm==" + fm);
            if (fm.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 从数据库中获取某人所拥有的权限
     *
     * @param user 需要获取所拥有的权限的人员
     * @return 某人所拥有的权限
     */
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<Flyweight>();
        for (String s : TestDB.colDB) {
            String ss[] = s.split(",");
            if (ss[0].equals(user)) {
                Flyweight fm = FlyweightFactory.getInstance()
                        .getFlyweight(ss[1] + "," + ss[2]);

                col.add(fm);
            }
        }
        return col;
    }
}


