package test.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestBean bean = new TestBean();
        bean.setName("张三");
        bean.setAge("12");
        bean.setPassword("1111");
        bean.setState("111");
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", "12");
        //添加参数age--->29
        Object obj = DynamicBeanUtils.getTarget(bean, map);
        //打印结果
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        for(Method method:declaredMethods){
            if(method.getName().startsWith("get")){
                Object o=method.invoke(obj);
                System.out.println("属性值get方法->"+o);
            }
        }
    }
}
