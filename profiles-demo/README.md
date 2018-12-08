# assembly-demo
    此模块主要利用maven的profiles属性实现多环境配置；
  
# 参考
    1.https://www.cnblogs.com/nfcm/p/7550772.html；
    2.https://www.cnblogs.com/0201zcr/p/6262762.html；
    3.https://www.cnblogs.com/hafiz/p/5360195.html；
    4.https://blog.csdn.net/qq_35603331/article/details/75091342；
    
# 构建
    结合程序需要运行的环境，构建相应的环境版本，maven命令:mvn clean package -P *,如：mvn clean package -P dev(dev为pom.xml中的“profiles.profile.id”属性值)