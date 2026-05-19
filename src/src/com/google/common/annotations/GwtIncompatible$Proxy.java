/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.annotations;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GwtIncompatible$Proxy
extends Proxy
implements GwtIncompatible {
    private static final Method method$0;
    private static final Method method$1;
    private static final Method method$2;
    private static final Method method$3;
    private static final Method method$4;

    static {
        Class[] classArray = new Class[]{};
        method$0 = GwtIncompatible.class.getMethod("value", classArray);
        classArray = new Class[]{Object.class};
        method$1 = Object.class.getMethod("equals", classArray);
        classArray = new Class[]{};
        method$2 = Object.class.getMethod("hashCode", classArray);
        classArray = new Class[]{};
        method$3 = Object.class.getMethod("toString", classArray);
        classArray = new Class[]{};
        method$4 = GwtIncompatible$Proxy.class.getMethod("annotationType", classArray);
    }

    public GwtIncompatible$Proxy(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public String value() {
        return (String)this.h.invoke(this, method$0, null);
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

