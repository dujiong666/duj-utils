package duj.utils.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class GetObjectUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		GetObjectUtil.applicationContext = applicationContext;
	}
	
	//通过给定名称拿到spring管理的对象
	public static Object getBeanByName(String beanName) {  
        if (applicationContext == null){  
            return null;  
        }  
        return applicationContext.getBean(beanName);
    }  
  
	//通过给定类型拿到spring管理的对象
    public static <T> T getBean(Class<T> type) {  
        return applicationContext.getBean(type);  
    }
	
}
