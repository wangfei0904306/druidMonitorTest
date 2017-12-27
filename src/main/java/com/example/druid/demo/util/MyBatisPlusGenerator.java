package com.example.druid.demo.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * mybatis-plus代码生成器(用于生成entity)<br>
 * 注意:<br>
 * 因为没用mybatis-plus的Service和Controller所以生成完之后要删掉TTT目录
 *
 * @author stylefeng
 * @Date 2017/5/21 12:38
 */
public class MyBatisPlusGenerator {

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D://test");//这里写你自己的java目录
        gc.setFileOverride(true);//是否覆盖
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        //gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setAuthor("xuran");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                return super.processTypeConvert(fieldType);
            }
        });
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix(new String[]{"_"});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        
        String[] includeTables = {"usr"};
        strategy.setInclude(includeTables);
        
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(null);

        /**
         * 下面的包名都根据实际情况编写
         */
        String modularName = "auth";

        pc.setEntity("com.iciyun.adi.microframe." + modularName + ".persistence.entity");
        pc.setMapper("com.iciyun.adi.microframe." + modularName + ".persistence.mapper");
        pc.setXml("com.iciyun.adi.microframe." + modularName + ".persistence.mapper.xml");
        pc.setService("com.iciyun.adi.microframe." + modularName + ".persistence.service");
        pc.setServiceImpl("com.iciyun.adi.microframe." + modularName + ".persistence.service.impl");
        pc.setController("com.iciyun.adi.microframe." + modularName + ".controller");
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();
    }

}