## InnoDB & MyISAM 主要区别

### Main diffenrece
- https://mp.weixin.qq.com/s?__biz=MjM5ODYxMDA5OQ==&mid=2651961428&idx=1&sn=31a9eb967941d888fbd4bb2112e9602b&chksm=bd2d0d888a5a849e7ebaa7756a8bc1b3d4e2f493f3a76383fc80f7e9ce7657e4ed2f6c01777d&scene=21#wechat_redirect

### 事务支持
- MyISAM：强调的是性能，每次查询具有原子性,其执行数度比InnoDB类型更快，但是不提供事务支持。
- InnoDB：提供事务支持事务，外部键等高级数据库功能。 具有事务(commit)、回滚(rollback)和崩溃修复能力(crash recovery capabilities)的事务安全(transaction-safe (ACID compliant))型表。

### CRUD操作
- MyISAM：如果执行大量的SELECT，MyISAM是更好的选择。
- InnoDB：如果你的数据执行大量的INSERT或UPDATE，出于性能方面的考虑，应该使用InnoDB表。

### 存储引擎选择的基本原则
- 采用MyISAM引擎
  1. R/W > 100:1 且update相对较少
  2. 并发不高
  3. 表数据量小
  4. 硬件资源有限

- 采用InnoDB引擎
  1. R/W比较小，频繁更新大字段
  2. 表数据量超过1000万，并发高
  3. 安全性和可用性要求高