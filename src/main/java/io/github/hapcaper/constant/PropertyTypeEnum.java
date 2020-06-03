package io.github.hapcaper.constant;

/**
 * Description:
 *
 * @author 李自豪（zihao.li01@ucarinc.com）
 * @since 2020/5/15
 */
public enum PropertyTypeEnum {
    STRING("String"),NUMBER("Number"),
    BOOLEAN("Boolean"),ARRAY("Array"),
    OBJECT("Object"),MAP("Map");

    private String name;

    PropertyTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
