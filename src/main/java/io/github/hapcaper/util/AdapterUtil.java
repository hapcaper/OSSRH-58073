package io.github.hapcaper.util;

import io.github.hapcaper.anno.ApiAdapter;
import io.github.hapcaper.module.NoParam;
import io.github.hapcaper.module.NoResult;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 *
 * @author 李自豪（zihao.li01@ucarinc.com）
 * @since 2020/5/15
 */
public class AdapterUtil {

    @NotNull
    public static List<Field> allParamField(@NotNull ApiAdapter apiAdapter) {
        Class<?> aClass = apiAdapter.apiParam();
        if (aClass.equals(NoParam.class)) {
            return new LinkedList<>();
        }
        return getFields(aClass);
    }

    @NotNull
    public static List<Field> allResultField(@NotNull ApiAdapter apiAdapter) {
        Class<?> aClass = apiAdapter.apiResult();
        if (aClass.equals(NoResult.class)) {
            return new LinkedList<>();
        }
        return getFields(aClass);
    }

    @NotNull
    private static List<Field> getFields(@NotNull Class<?> aClass) {
        Field[] fields = aClass.getFields();
        List<Field> fieldList = new LinkedList<>();
        for (Field field : fields) {
            String name = field.getName();
            Class<?> type = field.getType();
            if (type.getName().contains("$") || "serialVersionUID".equals(name)) {
                //1.内部类class会有一个外部类class的引用 eg:this$0 会造成死循环 栈溢出 这里处理一下
                //2.有的返回类会继承Serializable serialVersionUID不认为是参数
                continue;
            }
            fieldList.add(field);
        }
        return fieldList;
    }

}
