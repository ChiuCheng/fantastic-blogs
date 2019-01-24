## CPU 100% 排查优化实践

jstack是java自带的一种堆栈跟踪工具。jstack用于打印出给定的java进程ID或core file或远程调试服务的Java堆栈信息。被程序员们常用来找出最耗cpu的线程并定位错误代码。

### Step:
1. 使用`top`查找到占用CPU高的进程的pid
2. 定位问题线程的pid (此处pid为上一步找到的进程id)
    2.1 方法一：使用top查询该进程下所有线程的运行情况, command: top -Hp pid
    2.2 方法二：使用ps查看该进程的线程情况, command: ps -mp pid -o THREAD,tid,time
3. 将线程的tid转换为16进制 (此处的tid为上一步找到的占CPU高的线程id), command: printf ‘%x\n’ tid
4. 用jstack打印线程信息, command: jstack pid > pid.log
5. 在输出文件中寻找上面得到的tid, 就能定位到我们要的信息。或者利用可视化工具(https://fastthread.io/ -> CPU Threads)直接分析日志