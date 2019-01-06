# labManagerPlatform

后台管理平台后端简要介绍

管理平台是前后端分离的两个项目，后端部分只负责处理请求，使用的是`SSM框架`。

### Controller

对于具体的业务请求，都封装在各自的controller中，值得注意的是所有的**文件操作**都用是在[fileController](https://github.com/ysusoftware/labManagerPlatform/blob/master/src/main/java/org/software/ysu/controller/fileController.java)中。使用的是tomcat服务器，通过[jersey](https://jersey.github.io/)进行的远程文件操作。

### interceptor 

单拦截器实现的权限控制和登录拦截。具体逻辑见代码。但是有少许不足之处后续可能会有所改善。目前测试未发下问题。

### pojo

pojo比较特殊的一点在于他有一些用以前台展示的展示类和与layui配套的前台响应类。例如[layuiResponse](https://github.com/ysusoftware/labManagerPlatform/blob/master/src/main/java/org/software/ysu/pojo/layuiResponse.java)。

### 加密算法

DES盐值加密。不做过多介绍。

