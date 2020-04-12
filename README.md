# 使用Java Web知识对数据库进行操作
### servlet原理
* 部署Web应用服务，利用Tomcat启动应用程序，此时Tomcat作为Servlet容器，会创建并初始化Servlet。
* 通过浏览器访问Web应用服务器，利用Http通讯协议传递数据；
* 当访问到达时，Servlet容器创建HttpServletRequest和HttpServletResponse对象，并且将请求数据放入HttpServletRequest中；
* Servlet容器根据传递的url通过匹配web.xml中配置的Servlet路径，找到对应的Servlet，传递请求和响应对象。
* Servlet中根据请求方式调用doGet或doPost方法，处理请求数据，将响应数据放入HttpServletResponse，返回给Servlet容器；
* Servlet容器解析响应数据，根据HTTP通讯协议，返回给浏览器，浏览器解析并展示数据。

### 项目介绍
本项目通过采用jsp和servlet之间的交互来完成对数据库的增删改查操作，**本项目与其他javaweb项目不同的是在同一页面显示操作后的结果**<br>
在项目开发过程中，出现的最大问题就是空指针问题，因为如果在同一界面显示操作结果，在首次加载jsp文件中的脚本时，因为并未运行servlet，导致有的属性值为空，这里我的解决办法是加上try...catch语句块，在首次运行时捕获到空指针异常，在异常处理中让页面运行servlet。
