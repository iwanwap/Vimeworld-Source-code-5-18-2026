/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.eventbus;

import com.google.common.eventbus.AllowConcurrentEvents;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AllowConcurrentEvents$Proxy
extends Proxy
implements AllowConcurrentEvents {
    private static final Method method$0;
    private static final Method method$1;
    private static final Method method$2;
    private static final Method method$3;

    static {
        Class[] classArray = new Class[]{Object.class};
        method$0 = Object.class.getMethod("equals", classArray);
        classArray = new Class[]{};
        method$1 = Object.class.getMethod("hashCode", classArray);
        classArray = new Class[]{};
        method$2 = Object.class.getMethod("toString", classArray);
        classArray = new Class[]{};
        method$3 = AllowConcurrentEvents$Proxy.class.getMethod("annotationType", classArray);
    }

    public AllowConcurrentEvents$Proxy(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public boolean equals(Object object) {
        Object[] objectArray = new Object[]{object};
        return (Boolean)this.h.invoke(this, method$0, objectArray);
    }

    @Override
    public int hashCode() {
        return (Integer)this.h.invoke(this, method$1, null);
    }

    @Override
    public String toString() {
        return (String)this.h.invoke(this, method$2, null);
    }

    public Class annotationType() {
        return (Class)this.h.invoke(this, method$3, null);
    }
}

