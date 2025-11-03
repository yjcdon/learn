package org.example.processEnum;

public enum ProcessEnum {
    SUBMIT("submit", "提交阶段"),
    TEST("test", "测试阶段"),
    RELEASE("release", "发布阶段"),
    NOT_PASS("notPass", "不通过");


    private String name;
    private String desc;

    ProcessEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
