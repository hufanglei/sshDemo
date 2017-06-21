package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class Test {


    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        TestService t = (TestService) ac.getBean("testService");
        t.hello();
    }
}
