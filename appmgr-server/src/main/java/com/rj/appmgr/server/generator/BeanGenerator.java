package com.rj.appmgr.server.generator;

import com.baomidou.mybatisplus.generator.config.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.ScriptRunner;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @desc
 * @author larryjay
 * @since 2023/10/24 10:09
*/
@Slf4j
public class BeanGenerator {

    protected static void initDataSource(DataSourceConfig dataSourceConfig) throws SQLException {
        Connection conn = dataSourceConfig.getConn();
        InputStream inputStream = BeanGenerator.class.getResourceAsStream("/sql/app_mgmt_init_table.sql");
        ScriptRunner scriptRunner = new ScriptRunner(conn);
        scriptRunner.setAutoCommit(true);
        scriptRunner.runScript(new InputStreamReader(inputStream));
        conn.close();
    }

    protected static StrategyConfig.Builder strategyConfig(){
        return new StrategyConfig.Builder();
    }

    protected static GlobalConfig.Builder globalConfig(){
        return new GlobalConfig.Builder();
    }

    protected static TemplateConfig.Builder templateConfig(){
        return new TemplateConfig.Builder();
    }

    protected static PackageConfig.Builder packageConfig(){
        return new PackageConfig.Builder();
    }

    protected static InjectionConfig.Builder injectionConfig(){
        return new InjectionConfig.Builder().beforeOutputFile((tableInfo, stringObjectMap) -> {
            log.info("tableInfo : {},objectMap : {}", tableInfo.getEntityName(), stringObjectMap.size());
        });
    }

}
