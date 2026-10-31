# Campus Trade 校园二手交易平台

Java 后端学习项目（大一 · 2026 秋 → 2027 春）。

## 技术栈

| 层 | 技术 |
|---|---|
| 语言 | Java 21 |
| 构建 | Maven |
| 框架 | Spring Boot 3.x |
| 数据库 | MySQL 8.x |
| 缓存 | Redis（后期） |
| 部署 | Linux + Docker（后期） |

## 路线图

- [ ] 阶段一：Java 基础 + 控制台版（11 月）
- [ ] 阶段二：MySQL + MyBatis（12 月）
- [ ] 阶段三：Spring Boot REST API（12 月底—1 月）
- [ ] 阶段四：鉴权、缓存、部署上线（1 月—寒假）

## 目录结构

```
campus-trade/
├── pom.xml                            Maven 配置（JDK 21）
├── src/
│   ├── main/java/com/campustrade/     主代码
│   │   └── HelloWorld.java
│   └── test/java/com/campustrade/     单元测试
│       └── HelloWorldTest.java
└── README.md
```

## 如何运行

需要 **JDK 21** 和 **Maven 3.9+**。

```powershell
# 编译 + 跑测试 + 打包（最常用）
mvn clean package

# 直接运行
mvn -q exec:java

# 运行打好的 jar
java -jar target/campus-trade-0.1.0-SNAPSHOT.jar
```

预期输出：

```
Hello, 校园二手交易平台! 环境搭建成功。
Java 版本: 21.0.13
JDK 安装路径: ...
```
