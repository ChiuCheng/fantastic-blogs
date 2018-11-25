## 什么时候使用索引
1. 表的主关键字
2. 表的字段唯一约束
3. 直接条件查询的字段  
如zl_yhjbqk（用户基本情况）中的qc_bh（区册编号）
```
select * from zl_yhjbqk where qc_bh='7001'
```
4. 查询中与其它表关联的字段  
字段常常建立了外键关系, 如zl_ydcf（用电成份）中的jldb_bh（计量点表编号）
```
select * from zl_ydcf a,zl_yhdb b where a.jldb_bh=b.jldb_bh and b.jldb_bh=’540100214511’
```
5. 查询中排序的字段  
排序的字段如果通过索引去访问那将大大提高排序速度
```
select * from zl_yhjbqk order by qc_bh（建立qc_bh索引）
// One more example
select * from zl_yhjbqk where qc_bh=’7001’ order by cb_sx（建立qc_bh+cb_sx索引，注：只是一个索引，其中包括qc_bh和cb_sx字段）
```
6. 查询中统计或分组统计的字段
```
select max(hbs_bh) from zl_yhjbqk

select qc_bh,count(*) from zl_yhjbqk group by qc_bh
```

## 什么情况下应不建或少建索引
1. 表记录太少
2. 经常插入、删除、修改的表/字段
3. 没有区分度的表字段


## 索引SQL优化Tips

设计好MySql的索引可以让你的数据库飞起来。设计MySql索引的时候有一下几点注意:  

1. [架构师之路——SQL技巧](https://mp.weixin.qq.com/s/dGcgts4NNTmVQNRT-j2MZw)

2. 复合索引

- 比如有一条语句是这样的：`select * from users where area='beijing' and age=22;`, 如果我们是在area和age上分别创建单个索引的话，由于mysql查询每次只能使用一个索引，所以虽然这样已经相对不做索引时全表扫描提高了很多效率，但是如果在area、age两列上创建复合索引的话将带来更高的效率。如果我们创建了(area, age, salary)的复合索引，那么其实相当于创建了(area,age,salary)、(area,age)、(area)三个索引，这被称为最佳左前缀特性。因此我们在创建复合索引时应该将最常用作限制条件的列放在最左边，依次递减。

3. 索引不会包含有NULL值的列
- 只要列中包含有NULL值都将不会被包含在索引中，复合索引中只要有一列含有NULL值，那么这一列对于此复合索引就是无效的。

5. 排序的索引问题
- mysql查询*只使用一个索引*，因此如果where子句中已经使用了索引的话，那么order by中的列是不会使用索引的。因此数据库默认排序可以符合要求的情况下不要使用排序操作；尽量不要包含多个列的排序，如果需要最好给这些列创建`复合索引`。

6. like语句操作
- 一般情况下不鼓励使用like操作，如果非使用不可，如何使用也是一个问题。like “%aaa%” 不会使用索引而like “aaa%”可以使用索引。

7. 不要在列上进行运算
```
select * from users where
YEAR(adddate)
```

8. 不使用负向条件查询，如`!=` & `NOT IN`