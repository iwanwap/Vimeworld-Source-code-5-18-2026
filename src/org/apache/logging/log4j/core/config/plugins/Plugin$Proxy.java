/*
 * Decompiled with CFR 0.152.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.logging.log4j.core.config.plugins.Plugin;

public class Plugin$Proxy
extends Proxy
implements Plugin {
    private static final Method method$0;
    private static final Method method$1;
    private static final Method method$2;
    private static final Method method$3;
    private static final Method method$4;
    private static final Method method$5;
    private static final Method method$6;
    private static final Method method$7;
    private static final Method method$8;

    static {
        Class[] classArray = new Class[]{};
        method$0 = Plugin.class.getMethod("name", classArray);
        classArray = new Class[]{};
        method$1 = Plugin.class.getMethod("deferChildren", classArray);
        classArray = new Class[]{};
        method$2 = Plugin.class.getMethod("category", classArray);
        classArray = new Class[]{};
        method$3 = Plugin.class.getMethod("printObject", classArray);
        classArray = new Class[]{};
        method$4 = Plugin.class.getMethod("elementType", classArray);
        classArray = new Class[]{Object.class};
        method$5 = Object.class.getMethod("equals", classArray);
        classArray = new Class[]{};
        method$6 = Object.class.getMethod("hashCode", classArray);
        classArray = new Class[]{};
        method$7 = Object.class.getMethod("toString", classArray);
        classArray = new Class[]{};
        method$8 = Plugin$Proxy.class.getMethod("annotationType", classArray);
    }

    public Plugin$Proxy(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    @Override
    public String name() {
        return (String)this.h.invoke(this, method$0, null);
    }

    @Override
    public boolean deferChildren() {
        return (Boolean)this.h.invoke(this, method$1, null);
    }

    @Override
    public String category() {
        return (String)this.h.invoke(this, method$2, null);
    }

    @Override
    public boolean printObject() {
        return (Boolean)this.h.invoke(this, method$3, null);
    }

    @Override
    public String elementType() {
        return (String)this.h.invoke(this, method$4, null);
    }

    @Override
    public boolean equals(Object object) {
        Object[] objectArray = new Object[]{object};
        return (Boolean)this.h.invoke(this, method$5, objectArray);
    }

    @Override
    public int hashCode() {
        return (Integer)this.h.invoke(this, method$6, null);
    }

    @Override
    public String toString() {
        return (String)this.h.invoke(this, method$7, null);
    }

    public Class annotationType() {
        return (Class)this.h.invoke(this, method$8, null);
    }
}

