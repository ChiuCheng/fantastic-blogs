记录一些看到过的相见恨晚的技术文章, 收录原则: 
- 通俗易懂
- 深入详细
- 图文并茂

## 数据结构与算法
### 各种树
#### B-树与B+树
+ [漫画：什么是B-树？](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653190965&idx=1&sn=53f78fa037386f85531832cd5322d2a0&chksm=8c9909efbbee80f90512f0c36356c31cc74c388c46388dc2317d43c8f8597298f233ca9c29e9&scene=21#wechat_redirect) (应用于MongoDB)
+ [漫画：什么是B+树？](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653191027&idx=1&sn=4ba22e3ec8bd149f69fc0aba72e4347e&chksm=8c9909a9bbee80bfa1d8497ff0525df130414c1731b5aa5287bf16ea1cf86c8d8e6f20782184&scene=21#wechat_redirect) (应用于MySQL)

### 算法
+ [十大经典排序算法](https://github.com/xiatianhappy666/fantastic-blogs/blob/master/doc/Algorithm/Sorting.md)

## 设计模式

+ [Java 设计模式](https://www.javadoop.com/post/design-pattern#%E5%88%9B%E5%BB%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F) 

补充阅读: [静态嵌套类与内部类](https://blog.csdn.net/a327369238/article/details/52780442)

+ [单例模式](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653192251&idx=2&sn=4acce2985ab4fcc908235891c9213628&chksm=8c99f2e1bbee7bf7f64132bb58d3023f79b3c11fe2043dcd29fe07f4ddb5b3c7d375252d8555&scene=21#wechat_redirect)

## JVM
+ [面试常问点：深入剖析JVM的那些事](https://mp.weixin.qq.com/s?__biz=MzI2OTQxMTM4OQ==&mid=2247486633&idx=1&sn=07336f531f3977522c457f237a08fe49&chksm=eae1f9fbdd9670ed3f87a1769f4461ca3959c6dc00e35b42a87de6cfa5392d4c2761687354d6#rd)
+ [理解Java中的弱引用](https://droidyue.com/blog/2014/10/12/understanding-weakreference-in-java/)
+ [Java自定义类加载器与双亲委派模型](https://www.cnblogs.com/wxd0108/p/6681618.html)
+ [Tomcat 类加载器之为何违背双亲委派模型](https://blog.csdn.net/qq_38182963/article/details/78660779)



## Java

### 进程 & 线程 & 协程
+ [进程线程与协程的区别](https://github.com/xiatianhappy666/fantastic-blogs/blob/master/doc/ProcessAndThread/DefinitionAndDiff.md)
+ [多进程还是多线程?](https://yq.aliyun.com/articles/500587)
+ [进程状态](http://www.cnblogs.com/zxf98/p/5716296.html)
+ [进程fork函数详解](https://www.bilibili.com/video/av32769980/)
+ [进程的分类](https://blog.csdn.net/zjwson/article/details/53321488)
+ [进程间通信(IPC)](https://www.cnblogs.com/CheeseZH/p/5264465.html)


### HashMap & ConcurrentHashMap
+ [漫画：什么是HashMap？](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653191907&idx=1&sn=876860c5a9a6710ead5dd8de37403ffc&chksm=8c990c39bbee852f71c9dfc587fd70d10b0eab1cca17123c0a68bf1e16d46d71717712b91509&scene=21#wechat_redirect)
+ [漫画：高并发下的HashMap](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653192000&idx=1&sn=118cee6d1c67e7b8e4f762af3e61643e&chksm=8c990d9abbee848c739aeaf25893ae4382eca90642f65fc9b8eb76d58d6e7adebe65da03f80d&scene=21#wechat_redirect)
+ [漫画：什么是ConcurrentHashMap？](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653192083&idx=1&sn=5c4becd5724dd72ad489b9ed466329f5&chksm=8c990d49bbee845f69345e4121888ec967df27988bc66afd984a25331d2f6464a61dc0335a54&scene=21#wechat_redirect)
+ [Java7/8 中的 HashMap 和 ConcurrentHashMap 全解析](https://www.javadoop.com/post/hashmap)
+ [《Java源码分析》：ConcurrentHashMap JDK1.8](https://blog.csdn.net/u010412719/article/details/52145145)
+ [为什么ConcurrentHashMap的读操作不需要加锁？](https://www.jianshu.com/p/fbf6d586f43a)


### JAVA自定义注解详解
+ [注解（Annotation）自定义注解入门](http://www.cnblogs.com/peida/archive/2013/04/24/3036689.html)
+ [注解（Annotation）--注解处理器](https://www.cnblogs.com/peida/archive/2013/04/26/3038503.html)


## JAVA其他知识点
+ [理解Java中的ThreadLocal](https://droidyue.com/blog/2016/03/13/learning-threadlocal-in-java/)
+ [CPU 100% 排查优化实践](https://github.com/xiatianhappy666/fantastic-blogs/blob/master/doc/ProcessAndThread/CPUtroubleShooting.md)
+ [Java 线程池异常处理](https://www.jianshu.com/p/281958d20b04)


## 并发
+ [Java7/8 中的 HashMap 和 ConcurrentHashMap 全解析](https://www.javadoop.com/post/hashmap)
+ [为什么Goroutine能有上百万个，Java线程却只能有上千个？](https://mp.weixin.qq.com/s/v-Q5aOnYVj7l-kMQopkPLA)
+ [想进大厂？50个多线程面试题，你会多少？（一）](https://segmentfault.com/a/1190000013813740#articleHeader21)  
+ [Java线程池几个参数的理解](https://blog.csdn.net/yinkai1205/article/details/47667971)  
+ [java并发之SynchronousQueue实现原理](https://blog.csdn.net/yanyan19880509/article/details/52562039)

## 分布式
+ [在Transactional加锁中的坑](https://blog.52itstyle.com/archives/2952/)

## 服务器

### Tomcat
+ [Tomcat中NIO源码分析/JavaDoop](https://www.javadoop.com/post/tomcat-nio)
+ Tomcat Connector配置及应用
	* [详解tomcat的连接数与线程池](https://www.cnblogs.com/kismetv/p/7806063.html#t23)
	* [Tomcat在限流中的应用](https://blog.52itstyle.com/archives/2982/)
+ [详解Tomcat 配置文件server.xml](http://www.cnblogs.com/kismetv/p/7228274.html#title2-2)

### Nginx


## Spring

### AOP
+ [JAVA动态代理机制详解](http://www.cnblogs.com/xiaoluo501395377/p/3383130.html)
+ [Spring + AOP + 自定义注解](https://blog.csdn.net/qq_27093465/article/details/78800100)
+ [CGLIB(Code Generation Library)详解](https://blog.csdn.net/danchu/article/details/70238002)  
### MVC
+ [Optional Path Variables with Spring (Boot) Rest MVC](https://www.n-k.de/2016/05/optional-path-variables-with-spring-boot-rest-mvc.html)

## Spring Cloud
+ [Spring Cloud 系列文章](http://www.ityouknow.com/spring-cloud.html)

## HTTP & HTTPS
+ [图解 HTTP 的缓存机制](https://mp.weixin.qq.com/s/nh8mLtCne04UIsfj42SJew)
+ [TCP 三次握手原理，你真的理解吗？](https://mp.weixin.qq.com/s/yH3PzGEFopbpA-jw4MythQ)
+ [COOKIE和SESSION有什么区别？](https://www.zhihu.com/question/19786827/answer/28752144)
+ [单点登录原理与简单实现](https://www.cnblogs.com/ywlaker/p/6113927.html)

## 编码
+ [魔鬼在细节中：Base64 你可能不知道的几个细节](https://liudanking.com/sitelog/%E9%AD%94%E9%AC%BC%E5%9C%A8%E7%BB%86%E8%8A%82%E4%B8%AD%EF%BC%9Abase64-%E4%BD%A0%E5%8F%AF%E8%83%BD%E4%B8%8D%E7%9F%A5%E9%81%93%E7%9A%84%E5%87%A0%E4%B8%AA%E7%BB%86%E8%8A%82/?hmsr=toutiao.io&utm_medium=toutiao.io&utm_source=toutiao.io)

## 数据库
+ [Innodb中的事务隔离级别和锁的关系](https://tech.meituan.com/innodb_lock.html)
+ [4种事务的隔离级别，InnoDB如何巧妙实现？](https://mp.weixin.qq.com/s/x_7E2R2i27Ci5O7kLQF0UA)
+ [Innodb & MyISAM 区别](https://github.com/xiatianhappy666/fantastic-blogs/blob/master/doc/DataBase/Innodb&MyISAMDiff.md)
+ [InnoDB的并发控制，锁，事务模型, MVCC, 快照读](https://mp.weixin.qq.com/s/R3yuitWpHHGWxsUcE0qIRQ)
+ [Innodb 锁机制](https://mp.weixin.qq.com/s/wGOxro3uShp2q5w97azx5A)
+ [MySQL MVCC实现](http://www.sysdb.cn/index.php/2017/07/04/mysql-mvcc/#more-33)
+ [事务隔离+Spring](https://blog.csdn.net/soonfly/article/details/70305585)
+ [事务传播+Spring](https://blog.csdn.net/soonfly/article/details/70305683)

### 索引&Tips
+ [数据库索引到底是什么，是怎样工作的？](https://blog.csdn.net/weiliangliang111/article/details/51333169)
+ [架构师之路——数据库索引为什么设计成这样？](https://mp.weixin.qq.com/s/YMbRJwyjutGMD1KpI_fS0A)
+ [索引的创建与删除](https://github.com/xiatianhappy666/fantastic-blogs/blob/master/doc/DataBase/IndexCRUD.md)
+ [复合索引/联合索引](https://github.com/xiatianhappy666/fantastic-blogs/blob/master/doc/DataBase/CompositeIndex.md)
+ [索引注意点&Sql优化Tips](https://github.com/xiatianhappy666/fantastic-blogs/blob/master/doc/DataBase/IndexRules.md)
+ [架构师之路——MyISAM与InnoDB的索引差异](https://mp.weixin.qq.com/s/FUXPXKfKyjxAvMUFHZm9UQ)
