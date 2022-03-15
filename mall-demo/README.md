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


## 已经实现的功能

## 正在实现的功能
* springboot项目

## todo list:
后台管理系统包含商品管理、订单管理、会员管理、促销管理、运营管理、内容管理、统计报表、财务管理、权限管理、设置等模块。

## 接口列表：