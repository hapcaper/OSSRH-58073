package com.ucar.anno;

import com.ucar.module.NoParam;
import com.ucar.module.NoResult;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description:
 *
 * @author 李自豪（zihao.li01@ucarinc.com）
 * @since 2020/5/15
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiAdapter {
    /**
     * 接口地址
     */
    String value() default "";

    /**
     * 接口名称
     */
    String name() default "";

    /**
     * 接口描述
     */
    String desc() default "";

    /**
     * 接口入参实体类型
     */
    Class<?> apiParam() default NoParam.class;

    /**
     * 接口返回参数实体类型
     */
    Class<?> apiResult() default NoResult.class;

    /**
     * 请求方法类型 默认GET
     */
    String method() default "GET";

}
