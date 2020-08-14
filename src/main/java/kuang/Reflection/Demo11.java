package kuang.Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * @Author: yfzhang
 * @Description:获取方法的范型参数类型
 * @Date: Created in 5:41 PM 2020/7/1
 * @Modified By:
 */
public class Demo11 {
    public void test01(Map<String,Father> fatherMap, List<Father> list){
        System.out.println("test01");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Demo11.class.getMethod("test01",Map.class,List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);

            if(genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments= ((ParameterizedType)genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }
    }
}
