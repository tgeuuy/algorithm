package test.utils;

import java.lang.reflect.Field;
import java.util.Collection;

public class BusinessFieldRemoveUtil {

    static String JAVA_LANG_STRING = "java.lang.String";

    public static void removeFields(Object object) throws Exception {
        try {
            removeField(object);
        } catch (Exception e) {
            throw new Exception("不需要的业务字段移除失败" + e.getMessage());
        }
    }

    private static void removeField(Object removeObject) throws IllegalAccessException {
        Class<?> infoClass = removeObject.getClass();
        Field[] infoFieldArray = infoClass.getDeclaredFields();
        for (Field field : infoFieldArray) {
            if (field.isAnnotationPresent(IgnoreField.class)) {
                //字段使用了@WxNeedRemove进行标识
                if (field.getType().getTypeName().equals(JAVA_LANG_STRING)) {
                    field.setAccessible(true);
                    field.set(removeObject, null);
                } else {
                    field.setAccessible(true);
                    Object obj = field.get(removeObject);
                    if (obj == null) {
                        continue;
                    }
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        for (Object o : collection) {
                            if (o != null) {
                                removeField(o);
                            }
                        }
                    } else {
                        removeField(obj);
                    }
                }
            }
        }
    }
}
