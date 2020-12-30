# readme

dubbo入门demo。 可参考[文档](https://dubbo.apache.org/zh/docs/v2.7/user/configuration/annotation/)。

项目部分：

- `application.yml`中指定了注册中心是nacos，端口为8848。
- `provider-api`为消费者和生产者共用依赖。
- `provider-impl`生产者。
- `consumer`消费者。

启动流程： 1.启动本地nacos；2.启动多个生产者实例，可以通过添加VM参数`-Dserver.port=8071 -Ddubbo.protocol. port=20881`
、`-Dserver.port=8070 -Ddubbo.protocol.port=20880`来启动多个生产者实例； 3.启动消费者。 现在调用消费者的web接口，会看到生产者的控制台中打出日志。

## todo
