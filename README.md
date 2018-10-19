记录一些看到过的相见恨晚的技术文章, 收录原则: 
- 通俗易懂
- 深入详细
- 图文并茂

## 数据结构与算法
### 各种树
#### B-树与B+树
+ [漫画：什么是B-树？](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653190965&idx=1&sn=53f78fa037386f85531832cd5322d2a0&chksm=8c9909efbbee80f90512f0c36356c31cc74c388c46388dc2317d43c8f8597298f233ca9c29e9&scene=21#wechat_redirect) (应用于MongoDB)
+ [漫画：什么是B+树？](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653191027&idx=1&sn=4ba22e3ec8bd149f69fc0aba72e4347e&chksm=8c9909a9bbee80bfa1d8497ff0525df130414c1731b5aa5287bf16ea1cf86c8d8e6f20782184&scene=21#wechat_redirect) (应用于MySQL)

## 设计模式

+ [Java 设计模式](https://www.javadoop.com/post/design-pattern#%E5%88%9B%E5%BB%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F) 

补充阅读: [静态嵌套类与内部类](https://blog.csdn.net/a327369238/article/details/52780442)

## JVM
+ [面试常问点：深入剖析JVM的那些事](https://mp.weixin.qq.com/s?__biz=MzI2OTQxMTM4OQ==&mid=2247486633&idx=1&sn=07336f531f3977522c457f237a08fe49&chksm=eae1f9fbdd9670ed3f87a1769f4461ca3959c6dc00e35b42a87de6cfa5392d4c2761687354d6#rd)
+ [Java自定义类加载器与双亲委派模型](https://www.cnblogs.com/wxd0108/p/6681618.html)
+ [Tomcat 类加载器之为何违背双亲委派模型](https://blog.csdn.net/qq_38182963/article/details/78660779)

## Java
### HashMap & ConcurrentHashMap
+ [漫画：什么是HashMap？](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653191907&idx=1&sn=876860c5a9a6710ead5dd8de37403ffc&chksm=8c990c39bbee852f71c9dfc587fd70d10b0eab1cca17123c0a68bf1e16d46d71717712b91509&scene=21#wechat_redirect)
+ [漫画：高并发下的HashMap](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653192000&idx=1&sn=118cee6d1c67e7b8e4f762af3e61643e&chksm=8c990d9abbee848c739aeaf25893ae4382eca90642f65fc9b8eb76d58d6e7adebe65da03f80d&scene=21#wechat_redirect)
+ [漫画：什么是ConcurrentHashMap？](https://mp.weixin.qq.com/s?__biz=MzIxMjE5MTE1Nw==&mid=2653192083&idx=1&sn=5c4becd5724dd72ad489b9ed466329f5&chksm=8c990d49bbee845f69345e4121888ec967df27988bc66afd984a25331d2f6464a61dc0335a54&scene=21#wechat_redirect)
+ [Java7/8 中的 HashMap 和 ConcurrentHashMap 全解析](https://www.javadoop.com/post/hashmap)
+ [《Java源码分析》：ConcurrentHashMap JDK1.8](https://blog.csdn.net/u010412719/article/details/52145145)
+ [为什么ConcurrentHashMap的读操作不需要加锁？](https://www.jianshu.com/p/fbf6d586f43a)

## 并发
+ [Java7/8 中的 HashMap 和 ConcurrentHashMap 全解析](https://www.javadoop.com/post/hashmap)
+ [为什么Goroutine能有上百万个，Java线程却只能有上千个？](https://mp.weixin.qq.com/s/v-Q5aOnYVj7l-kMQopkPLA)
+ [想进大厂？50个多线程面试题，你会多少？（一）](https://segmentfault.com/a/1190000013813740#articleHeader21)  
+ [Java线程池几个参数的理解](https://blog.csdn.net/yinkai1205/article/details/47667971)  
+ [java并发之SynchronousQueue实现原理](https://blog.csdn.net/yanyan19880509/article/details/52562039)

## Spring

### AOP
+ [CGLIB(Code Generation Library)详解](https://blog.csdn.net/danchu/article/details/70238002)  
### MVC
+ [Optional Path Variables with Spring (Boot) Rest MVC](https://www.n-k.de/2016/05/optional-path-variables-with-spring-boot-rest-mvc.html)

## Spring Cloud
+ [Spring Cloud 系列文章](http://www.ityouknow.com/spring-cloud.html)

## HTTP & HTTPS
+ [图解 HTTP 的缓存机制](https://mp.weixin.qq.com/s/nh8mLtCne04UIsfj42SJew)
+ [TCP 三次握手原理，你真的理解吗？](https://mp.weixin.qq.com/s/yH3PzGEFopbpA-jw4MythQ)

## 编码
+ [魔鬼在细节中：Base64 你可能不知道的几个细节](https://liudanking.com/sitelog/%E9%AD%94%E9%AC%BC%E5%9C%A8%E7%BB%86%E8%8A%82%E4%B8%AD%EF%BC%9Abase64-%E4%BD%A0%E5%8F%AF%E8%83%BD%E4%B8%8D%E7%9F%A5%E9%81%93%E7%9A%84%E5%87%A0%E4%B8%AA%E7%BB%86%E8%8A%82/?hmsr=toutiao.io&utm_medium=toutiao.io&utm_source=toutiao.io)

## 数据库
+ [数据库索引到底是什么，是怎样工作的？](https://blog.csdn.net/weiliangliang111/article/details/51333169)
+ [Innodb中的事务隔离级别和锁的关系](https://tech.meituan.com/innodb_lock.html)
+ [MySQL MVCC实现](http://www.sysdb.cn/index.php/2017/07/04/mysql-mvcc/#more-33)
