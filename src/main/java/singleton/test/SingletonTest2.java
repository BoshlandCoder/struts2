package singleton.test;

/**
 * 静态内部类
 *
 * Created by Administrator on 2017/6/22.
 */
public class SingletonTest2 {


	/**
	 * 什么是线程安全？
	 *
	 * 如果你的代码所在的进程中有多个线程在同时运行，而这些线程可能会同时运行这段代码。如果每次运行结果和单线程运行的结果是一样的，
	 * 而且其他的变量的值也和预期的是一样的，就是线程安全的。
	 * 或者说：一个类或者程序所提供的接口对于线程来说是原子操作，或者多个线程之间的切换不会导致该接口的执行结果存在二义性,
	 * 也就是说我们不用考虑同步的问题，那就是线程安全的。
	 */


	public SingletonTest2() {
	}

	public static SingletonTest2 getInstance() {
		return LazyHoder.instance;
	}

	private static class LazyHoder {
		private static final SingletonTest2 instance = new SingletonTest2();
	}

}
