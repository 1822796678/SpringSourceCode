package context;

import com.entites.Car;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;

/**
 * Created by admin on 2021/11/27.
 */
public class ApplicationContextTest {


    /**
     *  ClassPathXmlApplicationContext
     *  AbstractXmlApplicationContext
     *  AbstractRefreshableConfigApplicationContext
     *  AbstractRefreshableApplicationContext
     *  AbstractApplicationContext
     *  DefaultResourceLoader
     */
    @Test
    public void applicationContextTest(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Car car = applicationContext.getBean("car",Car.class);
        System.out.println(car);
    }


    /**
     * 默认监听 bean  的工厂类，在使用 application.getBean() 时
     * 继承
     * AbstractAutowireCapableBeanFactory
     * AbstractBeanFactory
     * FactoryBeanRegistrySupport
     * DefaultSingletonBeanRegistry
     * SimpleAliasRegistry
     *
     * PropertyEditorRegistrar 这个类的作用是？？？
     */
    @Test
    public void DefaultListableBeanFactoryTest(){
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
    }

    /**
     * 默认资源加载
     */
    @Test
    public void defaultResourceLoader(){
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void  abstractApplicationContextTest(){
        AbstractApplicationContext abstractApplicationContext = new AbstractApplicationContext() {
            @Override
            protected void refreshBeanFactory() throws BeansException, IllegalStateException {

            }

            @Override
            protected void closeBeanFactory() {

            }

            @Override
            public ConfigurableListableBeanFactory getBeanFactory() throws IllegalStateException {
                return null;
            }
        };
    }
}
