package test;

import bean.Addresslist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.AddressServiceImpl;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class Test {


    public  void main1(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        TestService t = (TestService) ac.getBean("testService");
        t.hello();
    }

    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        AddressServiceImpl service = (AddressServiceImpl) ac.getBean("addressService");
        Addresslist addresslist = new Addresslist();
        addresslist.setName("日照市");
        addresslist.setPhone("12345678");
        service.add(addresslist);

    }
}
