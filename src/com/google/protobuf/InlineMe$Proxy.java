/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.InlineMe;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InlineMe$Proxy
extends Proxy
implements InlineMe {
    private static final Method method$0;
    private static final Method method$1;
    private static final Method method$2;
    private static final Method method$3;
    private static final Method method$4;
    private static final Method method$5;
    private static final Method method$6;

    static {
        Class[] classArray = new Class[]{};
        method$0 = InlineMe.class.getMethod("replacement", classArray);
        classArray = new Class[]{};
        method$1 = InlineMe.class.getMethod("imports", classArray);
        classArray = new Class[]{};
        method$2 = InlineMe.class.getMethod("staticImports", classArray);
        classArray = new Class[]{Object.class};
        method$3 = Object.class.getMethod("equals", classArray);
        classArray = new Class[]{};
        method$4 = Object.class.getMethod("hashCode", classArray);
        classArray = new Class[]{};
        method$5 = Object.class.getMethod("toString", classArray);
        classArray = new Class[]{};
        method$6 = InlineMe$Proxy.class.getMethod("annotationType", classArray);
    }

    public InlineMe$Proxy(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public String replacement() {
        return (String)this.h.invoke(this, method$0, null);
    }

    @Override
    public String[] imports() {
        return (String[])this.h.invoke(this, method$1, null);
    }

    @Override
    public String[] staticImports() {
        return (String[])this.h.invoke(this, method$2, null);
    }

    @Override
    public boolean equals(Object object) {
        Object[] objectArray = new Object[]{object};
        return (Boolean)this.h.invoke(this, method$3, objectArray);
    }

    @Override
    public int hashCode() {
        return (Integer)this.h.invoke(this, method$4, null);
    }

    @Override
    public String toString() {
        return (String)this.h.invoke(this, method$5, null);
    }

    public Class annotationType() {
        return (Class)this.h.invoke(this, method$6, null);
    }
}

