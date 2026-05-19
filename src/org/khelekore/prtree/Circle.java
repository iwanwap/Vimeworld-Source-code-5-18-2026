/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import java.util.ArrayList;
import java.util.List;

class Circle<T> {
    private final List<T> data;
    private int currentPos;

    public Circle(int size) {
        this.data = new ArrayList<T>(size);
    }

    public void add(T t2) {
        this.data.add(t2);
    }

    public T get(int pos) {
        return this.data.get(pos %= this.data.size());
    }

    public int getNumElements() {
        return this.data.size();
    }

    public void reset() {
        this.currentPos = 0;
    }

    public T getNext() {
        T ret = this.data.get(this.currentPos++);
        this.currentPos %= this.data.size();
        return ret;
    }
}

