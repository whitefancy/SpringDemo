# 商城应用的Spring boot实现

## 参考项目： https://github.com/macrozheng/mall

## 部署方式

### 直接在本机部署 java 8 环境

```shell
./mvnw package && java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### 使用Dockerfile部署到本机的docker环境

```shell
# 编译
docker build -t sd/app-demo .
# 部署
docker run -p 8081:8080 sd/app-demo

# 访问 http://localhost:8081/hello?name=keel
# 容器 4eaa3fdf4dc0   sd/app-demo              "java -jar /app.jar"     23 seconds ago 
```

### 链接docker中的mysql数据库

创建数据库

```shell
# from the host
> docker exec -it 9be9a51f3b6b bash
$ mysql -u root
mysql> create database db_example; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'simple'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
# 在部署到生产环境时进行一些安全更改 
# 撤销与 Spring 应用程序关联的用户的所有权限：
# 应用程序必须具有某些权限，因此使用以下命令授予应用程序所需的最低权限：
mysql> revoke all on db_example.* from 'springuser'@'%';
mysql> grant select, insert, delete, update on db_example.* to 'springuser'@'%';
```

## 已经实现的功能

## 正在实现的功能

* springboot项目

## todo list:

后台管理系统包含商品管理、订单管理、会员管理、促销管理、运营管理、内容管理、统计报表、财务管理、权限管理、设置等模块。

## 接口列表：

* server成功启动测试：http://localhost:8080/hello?name=keel
* json返回测试：http://localhost:8080/greeting
* mysql测试：

```shell
$ curl localhost:8080/demo/add -d name=First -d email=someemail@someemailprovider.com
$ curl 'localhost:8080/demo/all'
```

## 其他

Edit Starter插件
> 在下面的marketplace中，的搜索栏中输入 Edit Starter 或者Spring Tool 都可以找到 Edit Starter。点击安装即可 移除插件，直接删除 <dependency>
就行，不用去再调这个界面，除非添加插件或者修改插件（修改可以先删在加） 大功告成，以后不用在浪费脑力去记 artifactId 和 groupId ，在手敲<dependency>，需要什么，选什么就行 导航到https://start.spring.io
下面我在增加一个redis和springDataJpa，鼠标可以放在pom.xml任何位置，然后右键，点击 ‘Generate’ 再点击 “Edit Starters”