/*
 * Decompiled with CFR 0.152.
 */
package org.lwjgl.util.mapped;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.lwjgl.util.mapped.CacheLinePad;

public class CacheLinePad$Proxy
extends Proxy
implements CacheLinePad {
    private static final Method method$0;
    private static final Method method$1;
    private static final Method method$2;
    private static final Method method$3;
    private static final Method method$4;
    private static final Method method$5;

    static {
        Class[] classArray = new Class[]{};
        method$0 = CacheLinePad.class.getMethod("after", classArray);
        classArray = new Class[]{};
        method$1 = CacheLinePad.class.getMethod("before", classArray);
        classArray = new Class[]{Object.class};
        method$2 = Object.class.getMethod("equals", classArray);
        classArray = new Class[]{};
        method$3 = Object.class.getMethod("hashCode", classArray);
        classArray = new Class[]{};
        method$4 = Object.class.getMethod("toString", classArray);
        classArray = new Class[]{};
        method$5 = CacheLinePad$Proxy.class.getMethod("annotationType", classArray);
    }

    public CacheLinePad$Proxy(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public boolean after() {
        return (Boolean)this.h.invoke(this, method$0, null);
    }

    @Override
    public boolean before() {
        return (Boolean)this.h.invoke(this, method$1, null);
    }

    @Override
    public boolean equals(Object object) {
        Object[] objectArray = new Object[]{object};
        return (Boolean)this.h.invoke(this, method$2, objectArray);
    }

    @Override
    public int hashCode() {
        return (Integer)this.h.invoke(this, method$3, null);
    }

    @Override
    public String toString() {
        return (String)this.h.invoke(this, method$4, null);
    }

    public Class annotationType() {
        return (Class)this.h.invoke(this, method$5, null);
    }
}

