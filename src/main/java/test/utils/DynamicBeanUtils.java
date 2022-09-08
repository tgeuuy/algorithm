package test.utils;

import com.google.common.collect.Maps;
import net.sf.cglib.beans.BeanGenerator;
import net.sf.cglib.beans.BeanMap;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyDescriptor;
import java.util.Map;

public class DynamicBeanUtils {

    private static final Logger logger = LoggerFactory.getLogger(DynamicBeanUtils.class);

    public static Object getTarget(Object dest, Map<String, Object> addProperties) {
        PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
        //得到原对象的属性
        PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(dest);
        Map<String, Class<?>> propertyMap = Maps.newHashMap();
        for (PropertyDescriptor d : descriptors) {
            if (!"class".equalsIgnoreCase(d.getName())) {
                propertyMap.put(d.getName(), d.getPropertyType());
            }
        }

        System.out.println(propertyMap);
        addProperties.forEach((k, v) -> propertyMap.remove(k, v.getClass()));
        System.out.println(propertyMap);
        //构建新的对象
        DynamicBean dynamicBean = new DynamicBean(dest.getClass(), propertyMap);

        System.out.println(dynamicBean.toString());

        for (Map.Entry<String, Class<?>> entry : propertyMap.entrySet()) {
            try {
                if (!addProperties.containsKey(entry.getKey())) {//原来的值
                    dynamicBean.setValue(entry.getKey(), propertyUtilsBean.getNestedProperty(dest, entry.getKey()));
                } else {//新增的值
                    dynamicBean.setValue(entry.getKey(), addProperties.get(entry.getKey()));
                }
            } catch (Exception e) {
                logger.error(e.getMessage(), e);
            }
        }
        return dynamicBean.getTarget();
    }

    private static class DynamicBean {
        /**
         * 目标对象
         */
        private Object target;

        /**
         * 属性集合
         */
        private BeanMap beanMap;

        public DynamicBean(Class<?> superclass, Map<String, Class<?>> propertyMap) {
            this.target = generateBean(superclass, propertyMap);
            this.beanMap = BeanMap.create(this.target);
        }


        /**
         * bean 添加属性和值
         *
         * @param property
         * @param value
         */
        public void setValue(String property, Object value) {
            beanMap.put(property, value);
        }

        /**
         * bean 添加属性和值
         *
         * @param property
         * @param value
         */
        public void removeValue(String property, Object value) {
            beanMap.remove(property, value);
        }

        /**
         * 获取属性值
         *
         * @param property
         * @return
         */
        public Object getValue(String property) {
            return beanMap.get(property);
        }

        /**
         * 获取对象
         *
         * @return
         */
        public Object getTarget() {
            return this.target;
        }


        /**
         * 根据属性生成对象
         *
         * @param superclass
         * @param propertyMap
         * @return
         */
        private Object generateBean(Class<?> superclass, Map<String, Class<?>> propertyMap) {
            BeanGenerator generator = new BeanGenerator();
            if (null != superclass) {
                generator.setSuperclass(superclass);
            }

            BeanGenerator.addProperties(generator, propertyMap);
            return generator.create();
        }

        @Override
        public String toString() {
            return "DynamicBean{" +
                    "target=" + target +
                    ", beanMap=" + beanMap +
                    '}';
        }
    }

}
