package com.rj.appmgr.server.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.sql.SQLException;
import java.util.Collections;

@Slf4j
public class MysqlGenerator extends BeanGenerator{

    @Value("spring.datasource.url")
    private static String url;
    @Value("spring.datasource.username")
    private static String username;
    @Value("spring.datasource.password")
    private static String password;

    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/app_mgmt?useUnicode=true&characterEncoding=utf-8"
            ,"rayjay","mysql").schema("app_mgmt");

    public static void main(String[] args) throws SQLException {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        System.out.println(url);
        initDataSource(DATA_SOURCE_CONFIG.build());
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                .globalConfig(builder -> {
                    builder.author("larryjay").enableSwagger().fileOverride().outputDir(projectPath + "/appmgr-server/generator/ms/java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.rj.appmgr.server")
                            .moduleName("ms")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath + "/appmgr-server/generator/ms/mappers"));
                })
                .strategyConfig((scanner,builder) -> {
//                    builder.addInclude(scanner.apply("请输入表名，多个表名用,隔开"));
                })
//                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}
