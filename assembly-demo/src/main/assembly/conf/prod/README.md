# 部署流程说明：
    1、根据实际需要，修改conf目录下的application.properties文件中相应的配置，如：spring.profiles.active(配置激活哪个application配置文件)等；
    2、根据实际需要，修改conf目录下的application-dev.properties文件中相应的配置（开发环境），如：数据源、数据库连接池、tomcat端口、grpc端口等；
    3、根据实际需要，修改conf目录下的application-prod.properties文件中相应的配置（生产环境），如：数据源、数据库连接池、tomcat端口、grpc端口等；
    4、根据实际需要，修改conf目录下的activity.properties文件中相应的配置，如：活动日期、集卡日期、抽奖日期、集卡限额、抽奖限额、中奖权重等；
    5、根据实际需要，修改conf/dubbo目录下的*-consumer.xml文件中相应的配置，如：zookeeper注册中心的地址等；
    6、根据实际需要，修改conf目录下的logback.xml文件中相应的配置，如：日志存储位置、日志输出级别等；
    7、若操作系统为window,运行bin目录下的start.bat文件即可启动服务；若操作系统为Linux,运行bin目录下的start.sh文件即可启动服务；

# 备注
    1、若在Linux操作系统下，执行.sh文件出现“$'\r': 未找到命令”、“附近有语法错误”等错误，先通过以下步骤尝试解决：
        1）.通过“vim ***.sh”、“:set ff”来查看该.sh文件的编码格式（“***”为文件名，替换即可）；
        2）.若执行结果为“fileformat=dos”,则通过“:set ff=unix”、“:wq”命令来修改文件编码；若执行结果为“fileformat=unix”,说明shell脚本格式正确，但存在错误，请联系开发人员；
    2、若在Linux操作系统下，执行.sh文件出现“权限不够”错误，请通过“chmod +x ***.sh”命令来给相应的.sh文件添加可执行权限。
    3、bin目录下的autoDeploy.sh文件为自动部署sh脚本，需结合实际情况进行修改才能使用；
    4、bin目录下的autoDeployStart.sh文件为自动部署启动sh脚本，需结合实际情况进行修改才能使用；
    
# 配置文件修改详细说明
    1、修改conf目录下的application.properties文件：
        1）.修改"spring.profiles.active"字段，即激活哪个application配置文件，如：激活“application-dev.properties”文件，则“spring.profiles.active=dev”；
    2、修改conf目录下的application-*.properties文件：
        1）.修改"server.port"字段，即tomcat端口（若配置中的端口未使用，则无需修改）；
        2）.修改"grpc.server.port"字段，即grpc服务端口（若配置中的端口未使用，则无需修改）；
    3、修改conf/dubbo目录下的accounting-consumer.xml文件：
        1）.修改"<dubbo:registry />"标签中的“address”属性，即zk注册中心；
    4、修改conf/dubbo目录下的dubbo-consumer.xml文件：
        1）.修改"<dubbo:registry />"标签中的“address”属性，即zk注册中心；
    5、修改conf目录下的init.xml文件：
        1）.修改活动的相关信息，如：开始时间、结束时间；
    6、修改conf目录下的logback.xml文件：
        1）.修改“<root level="">”标签中的“level”属性,即日志打印级别；