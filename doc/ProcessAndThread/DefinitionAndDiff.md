## 进程 线程 协程的概念与区别
### 1. 概念
进程
- 进程是具有一定独立功能的程序关于某个数据集合上的一次运行活动,**进程是系统进行资源分配和调度的一个独立单位**。每个进程都有自己的独立内存空间，不同进程通过进程间通信来通信。由于进程比较重量，占据独立的内存，所以上下文进程间的切换开销（栈、寄存器、虚拟内存、文件句柄等）比较大，但相对比较稳定安全。

线程
- 线程是进程的一个实体,**是CPU调度和分派的基本单位**,它是比进程更小的能独立运行的基本单位.线程自己基本上不拥有系统资源,只拥有一点在运行中必不可少的资源(如程序计数器,一组寄存器和栈),但是它可与同属一个进程的其他的线程共享进程所拥有的全部资源。线程间通信主要通过共享内存，上下文切换很快，资源开销较少，但相比进程不够稳定容易丢失数据。

协程(Python)
- 协程是一种**用户态的轻量级线程**，协程的调度完全由用户控制。协程拥有自己的寄存器上下文和栈。协程调度切换时，将寄存器上下文和栈保存到其他地方，在切回来的时候，恢复先前保存的寄存器上下文和栈，直接操作栈则基本没有内核切换的开销，可以不加锁的访问全局变量，所以上下文的切换非常快。


### 3. 区别
进程与线程
1. 进程是资源的分配和调度的一个独立单元，而线程是CPU调度的基本单元
2. 同一个进程可以包括多个线程，并且线程共享整个进程的资源（寄存器、堆栈、上下文），一个进程至少包括一个线程。
3. 进程的创建调用fork或者vfork，而线程的创建调用pthread_create，进程结束后它拥有的所有线程都将销毁，而线程的结束不会影响同个进程中的其他线程
4. 线程中执行时一般都要进行同步和互斥，因为他们共享同一进程的所有资源

协程和线程
1. 线程进程都是同步机制，而协程则是异步
2. 协程避免了无意义的调度，由此可以提高性能，但也因此，程序员必须自己承担调度的责任，同时协程也失去了标准线程使用多CPU的能力。

