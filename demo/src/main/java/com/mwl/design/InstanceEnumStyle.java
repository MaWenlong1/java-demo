package com.mwl.design;

/**
 * @author mawenlong
 * @date 2019-06-28 09:29
 *
 * 枚举实现单例
 */
public class InstanceEnumStyle {

    private InstanceEnumStyle() {}

    public static InstanceEnumStyle getInstance() {
        return Singleton.INSTANCE.getSingle();
    }

    private static enum Singleton {
        INSTANCE;

        private InstanceEnumStyle instance;

        private Singleton () {
            instance = new InstanceEnumStyle();
        }

        public InstanceEnumStyle getSingle() {
            return instance;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    InstanceEnumStyle instanceEnumStyle = InstanceEnumStyle.getInstance();
                    System.out.println("hashCode:" + instanceEnumStyle.hashCode());
                }
            }).start();
        }
    }

}
