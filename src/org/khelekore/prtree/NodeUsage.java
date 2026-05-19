/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

class NodeUsage<T> {
    private final T data;
    private int id;

    public NodeUsage(T data, int id2) {
        this.data = data;
        this.id = id2;
    }

    public T getData() {
        return this.data;
    }

    public int getOwner() {
        return this.id;
    }

    public void changeOwner(int id2) {
        this.id = id2;
    }

    public void use() {
        if (this.id < 0) {
            throw new RuntimeException("Trying to use already used node");
        }
        this.id = -this.id;
    }

    public boolean isUsed() {
        return this.id < 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{data: " + this.data + ", id: " + this.id + "}";
    }
}

