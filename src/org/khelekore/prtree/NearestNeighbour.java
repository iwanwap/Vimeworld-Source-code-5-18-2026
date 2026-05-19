/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import org.khelekore.prtree.DistanceCalculator;
import org.khelekore.prtree.DistanceResult;
import org.khelekore.prtree.MBRConverter;
import org.khelekore.prtree.MinDistComparator;
import org.khelekore.prtree.Node;
import org.khelekore.prtree.NodeFilter;
import org.khelekore.prtree.PointND;

class NearestNeighbour<T> {
    private final MBRConverter<T> converter;
    private final NodeFilter<T> filter;
    private final int maxHits;
    private final Node<T> root;
    private final DistanceCalculator<T> dc;
    private final PointND p;

    public NearestNeighbour(MBRConverter<T> converter, NodeFilter<T> filter, int maxHits, Node<T> root, DistanceCalculator<T> dc2, PointND p2) {
        this.converter = converter;
        this.filter = filter;
        this.maxHits = maxHits;
        this.root = root;
        this.dc = dc2;
        this.p = p2;
    }

    public List<DistanceResult<T>> find() {
        ArrayList<DistanceResult<T>> ret = new ArrayList<DistanceResult<T>>(this.maxHits);
        MinDistComparator nc2 = new MinDistComparator(this.converter, this.p);
        PriorityQueue queue = new PriorityQueue(20, nc2);
        queue.add(this.root);
        while (!queue.isEmpty()) {
            Node n2 = (Node)queue.remove();
            n2.nnExpand(this.dc, this.filter, ret, this.maxHits, queue, nc2);
        }
        return ret;
    }
}

