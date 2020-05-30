package com.ucar.anno;

import com.ucar.constant.PropertyTypeEnum;

/**
 * Description:
 *
 * @author 李自豪（zihao.li01@ucarinc.com）
 * @since 2020/5/15
 */
public @interface ApiProperty {

    String value() default "";

    boolean required() default false;

    String rule() default "";

    String example() default "";

    String desc() default "";
}
