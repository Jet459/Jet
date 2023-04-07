package com.demo;

public class demo1 {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof demo1)) return false;

        demo1 demo1 = (demo1) o;

        return name != null ? name.equals(demo1.name) : demo1.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
