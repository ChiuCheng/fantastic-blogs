## 复合索引/联合索引
- 联合索引又叫复合索引。对于复合索引：Mysql从左到右的使用索引中的字段，一个查询可以只使用索引中的一部份，但只能是最左侧部分。例如索引是key index （a,b,c）。 可以支持a | a,b| a,b,c 3种组合进行查找，但不支持 b,c进行查找 .当最左侧字段是常量引用时，索引就十分有效。
- 两个或更多个列上的索引被称作复合索引。

## 索引原则
1. 索引越少越好
原因：主要在修改数据时，第个索引都要进行更新，降低写速度。
2. 符合最左原则, 最窄的字段放在键的左边
3. 需要加索引的字段，要在where条件中
4. 如果where条件中是OR关系，加索引不起作用

## 创建复合索引（联合索引）
```
CREATE INDEX PIndex
ON Persons (LastName, FirstName)
```
又如:
```
CREATE TABLE Persons
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
CONSTRAINT pk_PersonID PRIMARY KEY (P_Id,LastName)
)
```

## 举个栗子
利用索引中的附加列，您可以缩小搜索的范围，但使用一个具有两列的索引 不同于使用两个单独的索引。复合索引的结构与电话簿类似，人名由姓和名构成，电话簿首先按姓氏对进行排序，然后按名字对有相同姓氏的人进行排序。如果您知 道姓，电话簿将非常有用；如果您知道姓和名，电话簿则更为有用，但如果您只知道名不姓，电话簿将没有用处。

所以说创建复合索引时，`应该仔细考虑列的顺序`。对索引中的所有列执行搜索或仅对前几列执行搜索时，复合索引非常有用；仅对后面的任意列执行搜索时，复合索引则没有用处。

```
优： select * from test where a=10 and b>50

差： select * from test where b>50

优： select * from test order by a

差： select * from test order by b

差： select * from test order by c

优： select * from test where a=10 order by a

优： select * from test where a=10 order by b

差： select * from test where a=10 order by c

优： select * from test where a>10 order by a

差： select * from test where a>10 order by b

差： select * from test where a>10 order by c

优： select * from test where a=10 and b=10 order by a

优： select * from test where a=10 and b=10 order by b

优： select * from test where a=10 and b=10 order by c

优： select * from test where a=10 and b=10 order by a

优： select * from test where a=10 and b>10 order by b

差： select * from test where a=10 and b>10 order by c

```

