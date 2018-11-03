package com.mateuszw;

public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static class InstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
