package bases;

import com.entites.Car;
import org.junit.Test;
import org.springframework.beans.BeanMetadataAttribute;

import java.beans.BeanDescriptor;
import java.beans.FeatureDescriptor;

/**
 * Created by admin on 2021/11/25.
 */
public class BeanDescriptorTest {


    /**
     * FeatureDescriptor 功能描述对象
     *
     */
    @Test
    public void featureDescriptorTest(){
        FeatureDescriptor featureDescriptor = new FeatureDescriptor();

    }

    /**
     * 它是一个 bean 的描述信息类，它继承了 FeatureDescriptor 功能描述类
     */
    @Test
    public void beanDescriptorTest(){
        BeanDescriptor beanDescriptor = new BeanDescriptor(Car.class);
        System.out.println(beanDescriptor);
    }


}
