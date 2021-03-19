# mall-tiny-01
SpingBoot 的小项目

mall整合SpringBoot+MyBatis搭建基本骨架
mysql数据库环境搭建
下载并安装mysql5.7版本，下载地址：https://dev.mysql.com/downloads/installer/
设置数据库帐号密码：root root
下载并安装客户端连接工具Navicat,下载地址：http://www.formysql.com/xiazai.html
创建数据库mall
导入mall的数据库脚本，脚本地址：https://github.com/macrozheng/mall-learning/blob/master/document/sql/mall.sql
项目使用框架介绍
SpringBoot
SpringBoot可以让你快速构建基于Spring的Web应用程序，内置多种Web容器(如Tomcat)，通过启动入口程序的main函数即可运行。

PagerHelper
MyBatis分页插件，简单的几行代码就能实现分页，在与SpringBoot整合时，只要整合了PagerHelper就自动整合了MyBatis。

PageHelper.startPage(pageNum, pageSize);
//之后进行查询操作将自动进行分页
List<PmsBrand> brandList = brandMapper.selectByExample(new PmsBrandExample());
//通过构造PageInfo对象获取分页信息，如当前页码，总页数，总条数
PageInfo<PmsBrand> pageInfo = new PageInfo<PmsBrand>(list);
Copy to clipboardErrorCopied
Druid
alibaba开源的数据库连接池，号称Java语言中最好的数据库连接池。

Mybatis generator
MyBatis的代码生成器，可以根据数据库生成model、mapper.xml、mapper接口和Example，通常情况下的单表查询不用再手写mapper。

项目搭建
使用IDEA初始化一个SpringBoot项目
