import Bean.BeanDefination;
import Bean.BeanFactory;
import Bean.User;
import org.junit.Test;

public class ApiTest {

    @Test
    public void beanInIoc() {
        User user = new User();
        BeanDefination beanDefination = new BeanDefination(user);

        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanfination("user", beanDefination);

        User bean = (User) beanFactory.getBean("user");
        bean.pint();
    }
}
