package com.ucar.anno;

import com.ucar.constant.PropertyTypeEnum;

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
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiProperty {

    String value() default "";

    boolean required() default false;

    String rule() default "";

    String example() default "";

    String desc() default "";
}
