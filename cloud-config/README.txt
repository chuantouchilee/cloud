springcloud - config：
1、server模块中pom需引入spring-cloud-config-server
2、client模块中pom需引入spring-cloud-config-starter
3、特别提醒，client模块pom文件不能引spring-cloud-config-server，会造成项目启动时不执行远程配置中心环境