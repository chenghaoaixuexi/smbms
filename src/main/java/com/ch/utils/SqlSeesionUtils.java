package com.ch.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenghao
 * @purpose：获取SqlSessoinFactory实例
 * @备注：
 * @data 2022年04月19日 23:08
 */
public class SqlSeesionUtils {

    private static SqlSessionFactory factory;

    //静态代码块随着类的加载直会创建一次，意味只创建一个SqlSeesionFactory，避免浪费资源
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSeesion(){

        return factory.openSession();
    }

}
