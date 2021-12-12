package beans;

import com.entites.Car;
import org.junit.Test;
import org.springframework.beans.*;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.util.ReflectionUtils;

/**
 * Created by admin on 2021/11/25.
 */
public class BeansTest {

    /**
     * BeanInfoFactory 接口， 获取bean 的接口方法
     * Ordered 接口
     * ExtendedBeanInfo 是一个内部类，不能被外部访问，可以查看其源码
     * Bean 信息工厂， 它实现了  BeanInfoFactory, Ordered 接口
     *
     */
    public void BeanInfoFactoryTest(){
        BeanInfoFactory beanInfoFactory = new ExtendedBeanInfoFactory();
    }


    /**
     * bean 元数据属性
     * 实现了  BeanMetadataElement 接口
     */
    @Test
    public void  beanMetadataAttributeTest(){
        BeanMetadataAttribute beanMetadataAttribute = new BeanMetadataAttribute("car",new Car("红色","120元"));
        System.out.println("name :"+beanMetadataAttribute.getName() + " ,value: "+beanMetadataAttribute.getValue()+" , source: "+beanMetadataAttribute.getSource());
    }

    /**
     * AttributeAccessorSupport  属性访问支持
     *
     */
    @Test
    public void beanMetadataAttributeAccessorTest(){
        BeanMetadataAttributeAccessor beanMetadataAttributeAccessor = new BeanMetadataAttributeAccessor();
    }

    /**
     * Bean 的一个工具类， 涉及到的对象有:
     *  ParameterNameDiscoverer  参数名发现接口
     *  BeanInstantiationException  实列化异常
     *  ReflectionUtils   反射工具类
     */
    @Test
    public void beansUtils(){
        BeanUtils beanUtils =  null;
        ParameterNameDiscoverer parameterNameDiscoverer = null;
        ReflectionUtils reflectionUtils = null;
    }
}
