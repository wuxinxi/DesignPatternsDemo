package com.wxx.design.design_01_single;

/**
 * @author TangRen
 * @create 2019-06-16 20:11
 * @TODO: 单例模式:双重检查锁定
 * 优点：资源利用率高，只有在第一次使用的时候对象才被实例化
 * 缺点：第一次加载稍微慢
 * 解释：
 * 1.第一次判null:为了避免不必要的同步
 * 2.第二次判null:为了防止多线程情况下出现null指针
 * 假设线程A 执行到了new SinglePatternDoubleCheckLock(),实际上它并不是一个原子操作，会被编译成多条汇编指令：
 * 1.给SinglePatternDoubleCheckLock分配内存
 * 2.调用SinglePatternDoubleCheckLock的构造函数，初始化成员字段
 * 3.将instance指向分配的内存空间，这个时候instance就不是空的了
 *
 * 这个顺序并非一定是按照顺序执行，在JDK1.5直接JVM处理的顺序并不一定是1-2-3，如果出现了1-3-2，在3刚被执行完2还未执行时被切换到线程B,
 * 这时对象已经是非null的，如果B直接使用instance就会出现错误因为2还没有被执行，也就是DCL失效，1.5之后添加 volatile 保证instance对象
 * 每次都从主内存中读取，当前volatile也会带来一点性能上的影响
 *
 * <p>
 * 延伸:
 * volatile：保证此变量对所有的线程的可见性、禁止指令重排序优化
 * 指令重排序：是指CPU采用了允许将多条指令不按程序规定的顺序分开发送给各相应电路单元处理
 *
 * 可见性：是指线程之间的可见性，一个线程修改的状态对于另外一个线程时可见的，比如volatile修饰的变量就具有可见性，volatile修饰的变量不
 * 允许线程内部缓存和重排序即它是直接修改内存，所以对其他线程时可见的，但不确保具有原子性，比如volatile int a=0,只有有一个a++,a具有可
 * 见性，但是a++依然是一个非原子操作，也就是这个操作存在线程安全问题
 *
 * 原子性:原子是最小的单位，具有不可分割性，不需要synchronized,所谓原子操作就是不会被线程调度机制所打断的操作，
 * 这个操作一旦执行就一直运行到结束，中间不会有切换线程的。java中synchronized 、lock、unlock中操作保持原子性
 *
 * 有序性：java提供了volatile 和 synchronized来保证线程之间操作的有效性。
 *
 *
 */
public class SinglePatternDoubleCheckLock {
    public volatile static SinglePatternDoubleCheckLock instance;

    private SinglePatternDoubleCheckLock() {

    }

    public static SinglePatternDoubleCheckLock getInstance() {
        if (instance == null) {
            synchronized (SinglePatternDoubleCheckLock.class) {
                if (instance == null) {
                    instance = new SinglePatternDoubleCheckLock();
                }
            }
        }
        return instance;
    }


}
