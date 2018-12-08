# multi-environment
    此demo主要利用maven的profiles属性及结合assembly插件来配置多环境，具体模块如下：
        1.profiles-demo:此模块主要利用maven的profiles属性来实现多环境配置；
        2.assembly-demo:此模块主要利用maven的profiles属性并结合assembly插件来实现多环境配置（推荐，此方式可通过assembly插件规范程序目录结构，配置文件或资源文件外置，便于修改）；