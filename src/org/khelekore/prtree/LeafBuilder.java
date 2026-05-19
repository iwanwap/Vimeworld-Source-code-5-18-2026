/*
 * Decompiled with CFR 0.152.
 */
package org.khelekore.prtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.khelekore.prtree.Circle;
import org.khelekore.prtree.NodeComparators;
import org.khelekore.prtree.NodeFactory;
import org.khelekore.prtree.NodeUsage;

class LeafBuilder {
    private final int dimensions;
    private final int branchFactor;

    public LeafBuilder(int dimensions, int branchFactor) {
        this.dimensions = dimensions;
        this.branchFactor = branchFactor;
    }

    public <T, N> void buildLeafs(Collection<? extends T> ls2, NodeComparators<T> comparators, NodeFactory<N> nf2, List<N> leafNodes) {
        int i2;
        ArrayList<NodeUsage<T>> nodes = new ArrayList<NodeUsage<T>>(ls2.size());
        for (T t2 : ls2) {
            nodes.add(new NodeUsage<T>(t2, 1));
        }
        Circle<Noder<T, N>> getters = new Circle<Noder<T, N>>(this.dimensions * 2);
        for (i2 = 0; i2 < this.dimensions; ++i2) {
            this.addGetterAndSplitter(nodes, comparators.getMinComparator(i2), getters);
        }
        for (i2 = 0; i2 < this.dimensions; ++i2) {
            this.addGetterAndSplitter(nodes, comparators.getMaxComparator(i2), getters);
        }
        this.getLeafs(1, ls2.size(), getters, nf2, leafNodes);
    }

    private <T, N> void addGetterAndSplitter(List<NodeUsage<T>> nodes, Comparator<T> tcomp, Circle<Noder<T, N>> getters) {
        NodeUsageComparator<T> comp = new NodeUsageComparator<T>(tcomp);
        Collections.sort(nodes, comp);
        ArrayList<NodeUsage<T>> sortedNodes = new ArrayList<NodeUsage<T>>(nodes);
        getters.add(new Noder(sortedNodes));
    }

    private <T, N> void getLeafs(int id2, int totalNumberOfElements, Circle<Noder<T, N>> getters, NodeFactory<N> nf2, List<N> leafNodes) {
        ArrayList<Partition> partitionsToExpand = new ArrayList<Partition>();
        int[] pos = new int[2 * this.dimensions];
        partitionsToExpand.add(new Partition(id2, totalNumberOfElements, pos));
        while (!partitionsToExpand.isEmpty()) {
            int nodesToGet;
            Partition p2 = (Partition)partitionsToExpand.remove(0);
            getters.reset();
            for (int i2 = 0; i2 < getters.getNumElements() && (nodesToGet = Math.min(p2.numElementsLeft, this.branchFactor)) != 0; ++i2) {
                Noder<T, N> noder = getters.getNext();
                leafNodes.add(((Noder)noder).getNextNode(p2, i2, nodesToGet, nf2));
                Partition partition = p2;
                partition.numElementsLeft = partition.numElementsLeft - nodesToGet;
            }
            if (p2.numElementsLeft <= 0) continue;
            int splitPos = this.getSplitPos(p2.id) % getters.getNumElements();
            Noder<T, N> s2 = getters.get(splitPos);
            ((Noder)s2).split(p2, splitPos, p2.numElementsLeft, p2.id, 2 * p2.id, 2 * p2.id + 1, partitionsToExpand);
        }
    }

    private int getSplitPos(int n2) {
        int splitPos = 0;
        while (n2 >= 2) {
            n2 >>= 1;
            ++splitPos;
        }
        return splitPos;
    }

    private static class Partition {
        private final int id;
        private int numElementsLeft;
        private int[] currentPositions;

        public Partition(int id2, int numElementsLeft, int[] currentPositions) {
            this.id = id2;
            this.numElementsLeft = numElementsLeft;
            this.currentPositions = currentPositions;
        }

        public String toString() {
            return this.getClass().getSimpleName() + "{id: " + this.id + ", numElementsLeft: " + this.numElementsLeft + ", currentPositions: " + Arrays.toString(this.currentPositions) + "}";
        }
    }

    private static class Noder<T, N> {
        private final List<NodeUsage<T>> data;

        private Noder(List<NodeUsage<T>> data) {
            this.data = data;
        }

        private N getNextNode(Partition p2, int gi2, int maxObjects, NodeFactory<N> nf2) {
            int i2;
            Object[] nodeData = new Object[maxObjects];
            int s2 = this.data.size();
            for (i2 = 0; i2 < maxObjects; ++i2) {
                while (p2.currentPositions[gi2] < s2 && this.isUsedNode(p2, p2.currentPositions[gi2])) {
                    int[] nArray = p2.currentPositions;
                    int n2 = gi2;
                    nArray[n2] = nArray[n2] + 1;
                }
                NodeUsage nu2 = this.data.set(p2.currentPositions[gi2], null);
                nodeData[i2] = nu2.getData();
                nu2.use();
            }
            for (i2 = 0; i2 < nodeData.length; ++i2) {
                if (nodeData[i2] != null) continue;
                for (int j2 = 0; j2 < this.data.size(); ++j2) {
                    System.err.println(j2 + ": " + this.data.get(j2));
                }
                throw new NullPointerException("Null data found at: " + i2);
            }
            return nf2.create(nodeData);
        }

        private boolean isUsedNode(Partition p2, int pos) {
            NodeUsage<T> nu2 = this.data.get(pos);
            return nu2 == null || nu2.isUsed() || nu2.getOwner() != p2.id;
        }

        private void split(Partition p2, int gi2, int nodesToMark, int fromId, int toId1, int toId2, List<Partition> partitionsToExpand) {
            int sizePart2 = nodesToMark / 2;
            int sizePart1 = nodesToMark - sizePart2;
            int startPos = p2.currentPositions[gi2];
            int startPos2 = this.markPart(sizePart1, fromId, toId1, startPos);
            this.markPart(sizePart2, fromId, toId2, startPos2);
            partitionsToExpand.add(0, new Partition(toId1, sizePart1, p2.currentPositions));
            int[] pos = (int[])p2.currentPositions.clone();
            pos[gi2] = startPos2;
            partitionsToExpand.add(1, new Partition(toId2, sizePart2, pos));
        }

        private int markPart(int numToMark, int fromId, int toId, int startPos) {
            while (numToMark > 0) {
                NodeUsage<T> nu2;
                while ((nu2 = this.data.get(startPos)) == null || nu2.getOwner() != fromId) {
                    ++startPos;
                }
                nu2.changeOwner(toId);
                --numToMark;
            }
            return startPos;
        }
    }

    private static class NodeUsageComparator<T>
    implements Comparator<NodeUsage<T>> {
        private Comparator<T> sorter;

        public NodeUsageComparator(Comparator<T> sorter) {
            this.sorter = sorter;
        }

        @Override
        public int compare(NodeUsage<T> n1, NodeUsage<T> n2) {
            return this.sorter.compare(n1.getData(), n2.getData());
        }
    }
}

