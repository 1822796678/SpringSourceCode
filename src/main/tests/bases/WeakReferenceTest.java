package bases;

import com.entites.Car;
import org.junit.Test;

import java.lang.ref.WeakReference;

/**
 * 关于虚引用
 * 参考文章: https://blog.csdn.net/qq_33663983/article/details/78349641
 */
public class WeakReferenceTest {

    /**
     * 程序运行: 在运行一段时间后，程序打印出了 "Object has been collected."，
     * 这说明 weak reference 指向的对象被回收了
     * 值得注意的一点，即使有 car 引用指向对象，且 car 是一个 strong reference ,
     * weak reference 指向的对象仍然被回收了，这是因为 java 的编译器在发现进入
     * while 循环后， car 已经没有被使用了，所以进行了优化
     */
    @Test
    public void weakReferenceTest(){
        Car car = new Car("红色","120元");
        WeakReference<Car> carWeakReference = new WeakReference<Car>(car);
        int i = 0;
        while (true){
            if(carWeakReference.get()!=null){
                i++;
                System.out.println("Object is alive for "+i+ " loops - "+carWeakReference);
            }else {
                System.out.println("Object has been collected.");
                break;
            }
        }
    }

    @Test
    public void weakReferenceTest2(){
        Car car = new Car("红色","120元");
        WeakReference<Car> carWeakReference = new WeakReference<Car>(car);
        int i = 0;
        while (true){
            if(carWeakReference.get()!=null){
                i++;
                System.out.println("Object is alive for "+i+ " loops - "+carWeakReference);
            }else {
                System.out.println("Object has been collected.");
                break;
            }
        }
        System.out.println("here is the strong reference 'car' "+car);//use the strong reference out the while loop
    }
}




















