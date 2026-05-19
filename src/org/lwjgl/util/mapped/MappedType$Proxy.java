/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.util.mapped;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.lwjgl.util.mapped.MappedType;

public class MappedType$Proxy
extends Proxy
implements MappedType {
    private static final Method method$0;
    private static final Method method$1;
    private static final Method method$2;
    private static final Method method$3;
    private static final Method method$4;
    private static final Method method$5;
    private static final Method method$6;
    private static final Method method$7;

    static {
        Class[] classArray = new Class[]{};
        method$0 = MappedType.class.getMethod("cacheLinePadding", classArray);
        classArray = new Class[]{};
        method$1 = MappedType.class.getMethod("align", classArray);
        classArray = new Class[]{};
        method$2 = MappedType.class.getMethod("padding", classArray);
        classArray = new Class[]{};
        method$3 = MappedType.class.getMethod("autoGenerateOffsets", classArray);
        classArray = new Class[]{Object.class};
        method$4 = Object.class.getMethod("equals", classArray);
        classArray = new Class[]{};
        method$5 = Object.class.getMethod("hashCode", classArray);
        classArray = new Class[]{};
        method$6 = Object.class.getMethod("toString", classArray);
        classArray = new Class[]{};
        method$7 = MappedType$Proxy.class.getMethod("annotationType", classArray);
    }

    public MappedType$Proxy(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public boolean cacheLinePadding() {
        return (Boolean)this.h.invoke(this, method$0, null);
    }

    @Override
    public int align() {
        return (Integer)this.h.invoke(this, method$1, null);
    }

    @Override
    public int padding() {
        return (Integer)this.h.invoke(this, method$2, null);
    }

    @Override
    public boolean autoGenerateOffsets() {
        return (Boolean)this.h.invoke(this, method$3, null);
    }

    @Override
    public boolean equals(Object object) {
        Object[] objectArray = new Object[]{object};
        return (Boolean)this.h.invoke(this, method$4, objectArray);
    }

    @Override
    public int hashCode() {
        return (Integer)this.h.invoke(this, method$5, null);
    }

    @Override
    public String toString() {
        return (String)this.h.invoke(this, method$6, null);
    }

    public Class annotationType() {
        return (Class)this.h.invoke(this, method$7, null);
    }
}

