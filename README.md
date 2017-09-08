# JDBC-maven

1. 使用 maven 说明


- 项目说明：
    
```maven
<groupId>com.test</groupId>
<artifactId>Test-JDBC</artifactId>
<version>1.0-SNAPSHOT</version>
```
    
- 配置远程仓库：

```
<repositories>
    <repository>
        <id>aliyun</id>
        <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    </repository>
    <repository>
        <id>ep-commons</id>
        <url>https://raw.githubusercontent.com/wenka/maven-repo/snapshot/</url>
    </repository>
</repositories>
```

- 添加依赖

```
 <dependencies>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.10</version>
    </dependency>
 </dependencies>
```

2. jdbc

PreparedStatement 下标从 1 开始。