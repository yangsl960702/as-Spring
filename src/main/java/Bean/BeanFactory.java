package Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 将BeanDefinition交给BeanFactory等待创建Bean
 */
public class BeanFactory {

    private Map<String, BeanDefination> beanDefinationMap = new ConcurrentHashMap<>();

    public Object getBean(String beanname) {
        return beanDefinationMap.get(beanname).getBean();
    }

    public void registerBeanfination(String beanname, BeanDefination beanDefination) {
        beanDefinationMap.put(beanname, beanDefination);
    }
}
