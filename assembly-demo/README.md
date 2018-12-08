# assembly-demo
    此模块主要利用maven的profiles属性并结合assembly插件来实现多环境配置（推荐，此方式可通过assembly插件规范程序目录结构，配置文件或资源文件外置，便于修改）；
  
# 参考
    1.https://www.cnblogs.com/lianshan/p/7348093.html；
    2.https://www.jianshu.com/p/529ebb3e785e；
    3.https://www.cnblogs.com/hafiz/p/5360195.html；
    
# 构建
    结合程序需要运行的环境，构建相应的环境版本，maven命令:mvn clean package -P *,如：mvn clean package -P dev(dev为pom.xml中的“profiles.profile.id”属性值)