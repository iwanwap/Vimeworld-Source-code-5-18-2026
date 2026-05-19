/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import java.util.List;

interface NodeGetter<N> {
    public N getNextNode(int var1);

    public boolean hasMoreNodes();

    public boolean hasMoreData();

    public List<? extends NodeGetter<N>> split(int var1, int var2);
}

