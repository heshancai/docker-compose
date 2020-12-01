#指定基础镜像 必须放在第一行
FROM java:8
#拷贝当前路径的所有的jar 到指定路径中/app.jar
COPY *.jar /app.jar
#容器启动时需要执行的命令
#CMD ["--server.port:8080"]
#设置镜像暴露端口给主机做映射 可以设置多个
EXPOSE 8888
# ENTRYPOINT与CMD命令相似
#区别: ENTRYPOINT 中的参数始终会被使用，而 CMD 的额外参数可以在容器启动时动态替换掉
#如果 Docker 镜像的用途是运行应用程序或服务 应该优先使用 Exec 格式的 ENTRYPOINT 指令
#不管是哪种方式，创建容器后，通过dokcer ps查看容器信息时，COMMOND列会显示最终生效的容器启动命令
ENTRYPOINT ["java","-jar","/app.jar"]