/*
 * Decompiled with CFR 0.152.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.logging.log4j.core.config.plugins.PluginNode;

public class PluginNode$Proxy
extends Proxy
implements PluginNode {
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
        method$3 = PluginNode$Proxy.class.getMethod("annotationType", classArray);
    }

    public PluginNode$Proxy(InvocationHandler invocationHandler) {
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

