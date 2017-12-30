# druidMonitorTest

---
## 两步打开Druid监控
- 添加druid-spring-boot-starter依赖
```
		<dependency>
			<groupId>com.alibaba</groupId>
			<artifactId>druid-spring-boot-starter</artifactId>
			<version>1.1.0</version>
		</dependency>
```
- 打开访问配置
```
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/test?characterEncoding=utf8&useSSL=true
    username: root
    password: 123456
    driver-class-name: com.mysql.jdbc.Driver #非必需
    type: com.alibaba.druid.pool.DruidDataSource #非必需
    druid:
      initialSize: 2
      minIdle: 2
      maxActive: 30
      ######Druid监控配置######
      WebStatFilter:
        exclusions: '*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*'
      StatViewServlet:
        loginUsername: druid
        loginPassword: druid
```
---

## 本项目使用
- 下载并启动项目
- 访问 [http://localhost:8090/test/usr/add](http://localhost:8090/test/usr/add) 并多次刷新
- 访问 [http://localhost:8090/druid/login.html](http://localhost:8090/druid/login.html)，可以查看相关监控
