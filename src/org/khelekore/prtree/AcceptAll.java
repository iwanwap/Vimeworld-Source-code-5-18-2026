/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import org.khelekore.prtree.NodeFilter;

public class AcceptAll<T>
implements NodeFilter<T> {
    @Override
    public boolean accept(T t2) {
        return true;
    }
}

