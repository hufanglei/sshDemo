package test;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class TestService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("hello "+ getName());
    }

}

