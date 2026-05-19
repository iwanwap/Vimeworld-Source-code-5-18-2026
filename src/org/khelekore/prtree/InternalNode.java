/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import java.util.List;
import java.util.PriorityQueue;
import org.khelekore.prtree.DistanceCalculator;
import org.khelekore.prtree.DistanceResult;
import org.khelekore.prtree.MBR;
import org.khelekore.prtree.MBRConverter;
import org.khelekore.prtree.MinDist;
import org.khelekore.prtree.MinDistComparator;
import org.khelekore.prtree.Node;
import org.khelekore.prtree.NodeBase;
import org.khelekore.prtree.NodeFilter;

class InternalNode<T>
extends NodeBase<Node<T>, T> {
    public InternalNode(Object[] data) {
        super(data);
    }

    @Override
    public MBR computeMBR(MBRConverter<T> converter) {
        MBR ret = null;
        int s2 = this.size();
        for (int i2 = 0; i2 < s2; ++i2) {
            ret = this.getUnion(ret, ((Node)this.get(i2)).getMBR(converter));
        }
        return ret;
    }

    @Override
    public void expand(MBR mbr, NodeFilter<T> filter, MBRConverter<T> converter, List<T> found, List<Node<T>> nodesToExpand) {
        int s2 = this.size();
        for (int i2 = 0; i2 < s2; ++i2) {
            Node n2 = (Node)this.get(i2);
            if (!mbr.intersects(n2.getMBR(converter))) continue;
            nodesToExpand.add(n2);
        }
    }

    @Override
    public void find(MBR mbr, MBRConverter<T> converter, List<T> result, NodeFilter<T> filter) {
        int s2 = this.size();
        for (int i2 = 0; i2 < s2; ++i2) {
            Node n2 = (Node)this.get(i2);
            if (!mbr.intersects(n2.getMBR(converter))) continue;
            n2.find(mbr, converter, result, filter);
        }
    }

    @Override
    public void nnExpand(DistanceCalculator<T> dc2, NodeFilter<T> filter, List<DistanceResult<T>> drs, int maxHits, PriorityQueue<Node<T>> queue, MinDistComparator<T, Node<T>> mdc) {
        int s2 = this.size();
        for (int i2 = 0; i2 < s2; ++i2) {
            Node n2 = (Node)this.get(i2);
            MBR mbr = n2.getMBR(mdc.converter);
            double minDist = MinDist.get(mbr, mdc.p);
            int t2 = drs.size();
            if (t2 >= maxHits && !(minDist <= drs.get(t2 - 1).getDistance())) continue;
            queue.add(n2);
        }
    }
}

