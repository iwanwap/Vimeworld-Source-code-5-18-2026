/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

public class DistanceResult<T> {
    private final T t;
    private final double dist;

    public DistanceResult(T t2, double dist) {
        this.t = t2;
        this.dist = dist;
    }

    public T get() {
        return this.t;
    }

    public double getDistance() {
        return this.dist;
    }
}

