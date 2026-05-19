/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class AbstractProtobufList<E>
extends AbstractList<E>
implements Internal.ProtobufList<E> {
    protected static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable;

    AbstractProtobufList() {
        this(true);
    }

    AbstractProtobufList(boolean isMutable) {
        this.isMutable = isMutable;
    }

    @Override
    public boolean equals(Object o2) {
        if (o2 == this) {
            return true;
        }
        if (!(o2 instanceof List)) {
            return false;
        }
        if (!(o2 instanceof RandomAccess)) {
            return super.equals(o2);
        }
        List other = (List)o2;
        int size = this.size();
        if (size != other.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; ++i2) {
            if (this.get(i2).equals(other.get(i2))) continue;
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int size = this.size();
        int hashCode = 1;
        for (int i2 = 0; i2 < size; ++i2) {
            hashCode = 31 * hashCode + this.get(i2).hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean add(E e2) {
        this.ensureIsMutable();
        return super.add(e2);
    }

    @Override
    public void add(int index, E element) {
        this.ensureIsMutable();
        super.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends E> c2) {
        this.ensureIsMutable();
        return super.addAll(c2);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c2) {
        this.ensureIsMutable();
        return super.addAll(index, c2);
    }

    @Override
    public void clear() {
        this.ensureIsMutable();
        super.clear();
    }

    @Override
    public boolean isModifiable() {
        return this.isMutable;
    }

    @Override
    public final void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    @Override
    public E remove(int index) {
        this.ensureIsMutable();
        return super.remove(index);
    }

    @Override
    public boolean remove(Object o2) {
        this.ensureIsMutable();
        int index = this.indexOf(o2);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c2) {
        this.ensureIsMutable();
        return super.removeAll(c2);
    }

    @Override
    public boolean retainAll(Collection<?> c2) {
        this.ensureIsMutable();
        return super.retainAll(c2);
    }

    @Override
    public E set(int index, E element) {
        this.ensureIsMutable();
        return super.set(index, element);
    }

    protected void ensureIsMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }
}

