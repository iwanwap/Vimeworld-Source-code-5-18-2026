/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.annotations;

import com.google.gson.annotations.Since;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Since$Proxy
extends Proxy
implements Since {
    private static final Method method$0;
    private static final Method method$1;
    private static final Method method$2;
    private static final Method method$3;
    private static final Method method$4;

    static {
        Class[] classArray = new Class[]{};
        method$0 = Since.class.getMethod("value", classArray);
        classArray = new Class[]{Object.class};
        method$1 = Object.class.getMethod("equals", classArray);
        classArray = new Class[]{};
        method$2 = Object.class.getMethod("hashCode", classArray);
        classArray = new Class[]{};
        method$3 = Object.class.getMethod("toString", classArray);
        classArray = new Class[]{};
        method$4 = Since$Proxy.class.getMethod("annotationType", classArray);
    }

    public Since$Proxy(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public double value() {
        return (Double)this.h.invoke(this, method$0, null);
    }

    @Override
    public boolean equals(Object object) {
        Object[] objectArray = new Object[]{object};
        return (Boolean)this.h.invoke(this, method$1, objectArray);
    }

    @Override
    public int hashCode() {
        return (Integer)this.h.invoke(this, method$2, null);
    }

    @Override
    public String toString() {
        return (String)this.h.invoke(this, method$3, null);
    }

    public Class annotationType() {
        return (Class)this.h.invoke(this, method$4, null);
    }
}

