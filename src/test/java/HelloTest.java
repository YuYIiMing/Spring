import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Hello.HelloWorld;

public class HelloTest {
	public static void main(String[] args) {
		/*HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("小明");*/
		
		//配置Spring IOC容器对象
		ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) cx.getBean("helloWorld");
		helloWorld.hello();
	}
}
