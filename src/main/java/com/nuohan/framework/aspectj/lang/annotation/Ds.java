package com.nuohan.framework.aspectj.lang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import com.nuohan.framework.aspectj.lang.constant.DataSourceName;

/**
 * 自定义多数据源切换注解
 * 
 * @author nuohan
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ds
{
    /**
     * 切换数据源值
     */
    String name() default DataSourceName.MASTER;
}
