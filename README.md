# 使用Java Web知识对数据库进行操作
### servlet原理
* 部署Web应用服务，利用Tomcat启动应用程序，此时Tomcat作为Servlet容器，会创建并初始化Servlet。
* 通过浏览器访问Web应用服务器，利用Http通讯协议传递数据；
* 当访问到达时，Servlet容器创建HttpServletRequest和HttpServletResponse对象，并且将请求数据放入HttpServletRequest中；
* Servlet容器根据传递的url通过匹配web.xml中配置的Servlet路径，找到对应的Servlet，传递请求和响应对象。
* Servlet中根据请求方式调用doGet或doPost方法，处理请求数据，将响应数据放入HttpServletResponse，返回给Servlet容器；
* Servlet容器解析响应数据，根据HTTP通讯协议，返回给浏览器，浏览器解析并展示数据。
