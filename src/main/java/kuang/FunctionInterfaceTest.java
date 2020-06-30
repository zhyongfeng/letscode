package kuang;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 9:58 AM 2020/6/14
 * @Modified By:
 */
public class FunctionInterfaceTest {

    public static void main(String[] args) {
        Function function = (Function<String, String>) str -> str;
        System.out.println(function.apply("adsf"));


        Predicate<String> predicate = (str) -> {return str.isEmpty();};
        System.out.println(predicate.test("123"));


        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("consumer");


        Supplier<String> supplier = () -> {return "1024";};
        System.out.println(supplier.get());
    }
}
