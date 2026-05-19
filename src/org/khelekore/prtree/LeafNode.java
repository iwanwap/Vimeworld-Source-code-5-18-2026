/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import org.khelekore.prtree.DistanceCalculator;
import org.khelekore.prtree.DistanceResult;
import org.khelekore.prtree.MBR;
import org.khelekore.prtree.MBRConverter;
import org.khelekore.prtree.MinDistComparator;
import org.khelekore.prtree.Node;
import org.khelekore.prtree.NodeBase;
import org.khelekore.prtree.NodeFilter;
import org.khelekore.prtree.SimpleMBR;

class LeafNode<T>
extends NodeBase<T, T> {
    private static final Comparator<DistanceResult<?>> comp = new Comparator<DistanceResult<?>>(){

        @Override
        public int compare(DistanceResult<?> d1, DistanceResult<?> d2) {
            return Double.compare(d1.getDistance(), d2.getDistance());
        }
    };

    public LeafNode(Object[] data) {
        super(data);
    }

    public MBR getMBR(T t2, MBRConverter<T> converter) {
        return new SimpleMBR(t2, converter);
    }

    @Override
    public MBR computeMBR(MBRConverter<T> converter) {
        MBR ret = null;
        int s2 = this.size();
        for (int i2 = 0; i2 < s2; ++i2) {
            ret = this.getUnion(ret, this.getMBR(this.get(i2), converter));
        }
        return ret;
    }

    @Override
    public void expand(MBR mbr, NodeFilter<T> filter, MBRConverter<T> converter, List<T> found, List<Node<T>> nodesToExpand) {
        this.find(mbr, converter, found, filter);
    }

    @Override
    public void find(MBR mbr, MBRConverter<T> converter, List<T> result, NodeFilter<T> filter) {
        int s2 = this.size();
        for (int i2 = 0; i2 < s2; ++i2) {
            Object t2 = this.get(i2);
            if (!mbr.intersects(t2, converter) || !filter.accept(t2)) continue;
            result.add(t2);
        }
    }

    @Override
    public void nnExpand(DistanceCalculator<T> dc2, NodeFilter<T> filter, List<DistanceResult<T>> drs, int maxHits, PriorityQueue<Node<T>> queue, MinDistComparator<T, Node<T>> mdc) {
        int s2 = this.size();
        for (int i2 = 0; i2 < s2; ++i2) {
            Object t2 = this.get(i2);
            if (!filter.accept(t2)) continue;
            double dist = dc2.distanceTo(t2, mdc.p);
            int n2 = drs.size();
            if (n2 >= maxHits && !(dist < drs.get(n2 - 1).getDistance())) continue;
            this.add(drs, new DistanceResult(t2, dist), maxHits);
        }
    }

    private void add(List<DistanceResult<T>> drs, DistanceResult<T> dr2, int maxHits) {
        int pos;
        int n2 = drs.size();
        if (n2 == maxHits) {
            drs.remove(n2 - 1);
        }
        if ((pos = Collections.binarySearch(drs, dr2, comp)) < 0) {
            pos = -(pos + 1);
        }
        drs.add(pos, dr2);
    }
}

