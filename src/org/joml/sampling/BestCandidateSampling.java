/*
 * Decompiled with CFR 0.152.
 */
package org.joml.sampling;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.joml.Random;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.sampling.Callback2d;
import org.joml.sampling.Callback3d;
import org.joml.sampling.Math;

public class BestCandidateSampling {

    public static class Cube {
        private int numSamples;
        private int numCandidates = 60;
        private long seed;

        public Cube seed(long seed) {
            this.seed = seed;
            return this;
        }

        public Cube numSamples(int numSamples) {
            this.numSamples = numSamples;
            return this;
        }

        public Cube numCandidates(int numCandidates) {
            this.numCandidates = numCandidates;
            return this;
        }

        public Cube generate(final float[] xyzs) {
            final IntHolder i2 = new IntHolder();
            return this.generate(new Callback3d(){

                public void onNewSample(float x2, float y2, float z2) {
                    xyzs[3 * i2.value + 0] = x2;
                    xyzs[3 * i2.value + 1] = y2;
                    xyzs[3 * i2.value + 2] = z2;
                    ++i2.value;
                }
            });
        }

        public Cube generate(final FloatBuffer xyzs) {
            final IntHolder i2 = new IntHolder();
            final int pos = xyzs.position();
            return this.generate(new Callback3d(){

                public void onNewSample(float x2, float y2, float z2) {
                    xyzs.put(pos + 3 * i2.value + 0, x2);
                    xyzs.put(pos + 3 * i2.value + 1, y2);
                    xyzs.put(pos + 3 * i2.value + 2, z2);
                    ++i2.value;
                }
            });
        }

        public Cube generate(Callback3d callback) {
            Octree octree = new Octree(-1.0f, -1.0f, -1.0f, 2.0f);
            Random rnd = new Random(this.seed);
            for (int i2 = 0; i2 < this.numSamples; ++i2) {
                float bestX = 0.0f;
                float bestY = 0.0f;
                float bestZ = 0.0f;
                float bestDist = 0.0f;
                for (int c2 = 0; c2 < this.numCandidates; ++c2) {
                    float z2;
                    float y2;
                    float x2 = rnd.nextFloat() * 2.0f - 1.0f;
                    float minDist = octree.nearest(x2, y2 = rnd.nextFloat() * 2.0f - 1.0f, z2 = rnd.nextFloat() * 2.0f - 1.0f, bestDist, Float.POSITIVE_INFINITY);
                    if (!(minDist > bestDist)) continue;
                    bestDist = minDist;
                    bestX = x2;
                    bestY = y2;
                    bestZ = z2;
                }
                callback.onNewSample(bestX, bestY, bestZ);
                octree.insert(new Vector3f(bestX, bestY, bestZ));
            }
            return this;
        }
    }

    private static class Octree {
        private static final int MAX_OBJECTS_PER_NODE = 32;
        private static final int PXNYNZ = 0;
        private static final int NXNYNZ = 1;
        private static final int NXPYNZ = 2;
        private static final int PXPYNZ = 3;
        private static final int PXNYPZ = 4;
        private static final int NXNYPZ = 5;
        private static final int NXPYPZ = 6;
        private static final int PXPYPZ = 7;
        private float minX;
        private float minY;
        private float minZ;
        private float hs;
        private ArrayList objects;
        private Octree[] children;

        Octree(float minX, float minY, float minZ, float size) {
            this.minX = minX;
            this.minY = minY;
            this.minZ = minZ;
            this.hs = size * 0.5f;
        }

        private void split() {
            this.children = new Octree[8];
            this.children[1] = new Octree(this.minX, this.minY, this.minZ, this.hs);
            this.children[0] = new Octree(this.minX + this.hs, this.minY, this.minZ, this.hs);
            this.children[2] = new Octree(this.minX, this.minY + this.hs, this.minZ, this.hs);
            this.children[3] = new Octree(this.minX + this.hs, this.minY + this.hs, this.minZ, this.hs);
            this.children[5] = new Octree(this.minX, this.minY, this.minZ + this.hs, this.hs);
            this.children[4] = new Octree(this.minX + this.hs, this.minY, this.minZ + this.hs, this.hs);
            this.children[6] = new Octree(this.minX, this.minY + this.hs, this.minZ + this.hs, this.hs);
            this.children[7] = new Octree(this.minX + this.hs, this.minY + this.hs, this.minZ + this.hs, this.hs);
        }

        private void insertIntoChild(Vector3f o2) {
            this.children[this.octant(o2.x, o2.y, o2.z)].insert(o2);
        }

        void insert(Vector3f object) {
            if (this.children != null) {
                this.insertIntoChild(object);
                return;
            }
            if (this.objects != null && this.objects.size() == 32) {
                this.split();
                for (int i2 = 0; i2 < this.objects.size(); ++i2) {
                    this.insertIntoChild((Vector3f)this.objects.get(i2));
                }
                this.objects = null;
                this.insertIntoChild(object);
            } else {
                if (this.objects == null) {
                    this.objects = new ArrayList(32);
                }
                this.objects.add(object);
            }
        }

        private int octant(float x2, float y2, float z2) {
            if (x2 < this.minX + this.hs) {
                if (y2 < this.minY + this.hs) {
                    if (z2 < this.minZ + this.hs) {
                        return 1;
                    }
                    return 5;
                }
                if (z2 < this.minZ + this.hs) {
                    return 2;
                }
                return 6;
            }
            if (y2 < this.minY + this.hs) {
                if (z2 < this.minZ + this.hs) {
                    return 0;
                }
                return 4;
            }
            if (z2 < this.minZ + this.hs) {
                return 3;
            }
            return 7;
        }

        float nearest(float x2, float y2, float z2, float lowerBound, float upperBound) {
            float up2 = upperBound;
            if (x2 < this.minX - upperBound || x2 > this.minX + this.hs * 2.0f + upperBound || y2 < this.minY - upperBound || y2 > this.minY + this.hs * 2.0f + upperBound || z2 < this.minZ - upperBound || z2 > this.minZ + this.hs * 2.0f + upperBound) {
                return up2;
            }
            if (this.children != null) {
                int i2 = this.octant(x2, y2, z2);
                for (int c2 = 0; c2 < 8; ++c2) {
                    float n1 = this.children[i2].nearest(x2, y2, z2, lowerBound, up2);
                    if ((up2 = Math.min(n1, up2)) <= lowerBound) {
                        return lowerBound;
                    }
                    i2 = i2 + 1 & 7;
                }
                return up2;
            }
            float up22 = up2 * up2;
            float lb2 = lowerBound * lowerBound;
            for (int i3 = 0; this.objects != null && i3 < this.objects.size(); ++i3) {
                Vector3f o2 = (Vector3f)this.objects.get(i3);
                float d2 = o2.distanceSquared(x2, y2, z2);
                if (d2 <= lb2) {
                    return lowerBound;
                }
                if (!(d2 < up22)) continue;
                up22 = d2;
            }
            return Math.sqrt(up22);
        }
    }

    public static class Quad {
        private int numSamples;
        private int numCandidates = 60;
        private long seed;

        public Quad seed(long seed) {
            this.seed = seed;
            return this;
        }

        public Quad numSamples(int numSamples) {
            this.numSamples = numSamples;
            return this;
        }

        public Quad numCandidates(int numCandidates) {
            this.numCandidates = numCandidates;
            return this;
        }

        public Quad generate(final float[] xyzs) {
            final IntHolder i2 = new IntHolder();
            return this.generate(new Callback2d(){

                public void onNewSample(float x2, float y2) {
                    xyzs[2 * i2.value + 0] = x2;
                    xyzs[2 * i2.value + 1] = y2;
                    ++i2.value;
                }
            });
        }

        public Quad generate(final FloatBuffer xys) {
            final IntHolder i2 = new IntHolder();
            final int pos = xys.position();
            return this.generate(new Callback2d(){

                public void onNewSample(float x2, float y2) {
                    xys.put(pos + 3 * i2.value + 0, x2);
                    xys.put(pos + 3 * i2.value + 1, y2);
                    ++i2.value;
                }
            });
        }

        public Quad generate(Callback2d callback) {
            QuadTree qtree = new QuadTree(-1.0f, -1.0f, 2.0f);
            Random rnd = new Random(this.seed);
            for (int i2 = 0; i2 < this.numSamples; ++i2) {
                float bestX = 0.0f;
                float bestY = 0.0f;
                float bestDist = 0.0f;
                for (int c2 = 0; c2 < this.numCandidates; ++c2) {
                    float y2;
                    float x2 = rnd.nextFloat() * 2.0f - 1.0f;
                    float minDist = qtree.nearest(x2, y2 = rnd.nextFloat() * 2.0f - 1.0f, bestDist, Float.POSITIVE_INFINITY);
                    if (!(minDist > bestDist)) continue;
                    bestDist = minDist;
                    bestX = x2;
                    bestY = y2;
                }
                callback.onNewSample(bestX, bestY);
                qtree.insert(new Vector2f(bestX, bestY));
            }
            return this;
        }
    }

    public static class Disk {
        private int numSamples;
        private int numCandidates = 60;
        private long seed;

        public Disk seed(long seed) {
            this.seed = seed;
            return this;
        }

        public Disk numSamples(int numSamples) {
            this.numSamples = numSamples;
            return this;
        }

        public Disk numCandidates(int numCandidates) {
            this.numCandidates = numCandidates;
            return this;
        }

        public Disk generate(final float[] xys) {
            final IntHolder i2 = new IntHolder();
            return this.generate(new Callback2d(){

                public void onNewSample(float x2, float y2) {
                    xys[2 * i2.value + 0] = x2;
                    xys[2 * i2.value + 1] = y2;
                    ++i2.value;
                }
            });
        }

        public Disk generate(final FloatBuffer xys) {
            final IntHolder i2 = new IntHolder();
            final int pos = xys.position();
            return this.generate(new Callback2d(){

                public void onNewSample(float x2, float y2) {
                    xys.put(pos + 3 * i2.value + 0, x2);
                    xys.put(pos + 3 * i2.value + 1, y2);
                    ++i2.value;
                }
            });
        }

        public Disk generate(Callback2d callback) {
            QuadTree qtree = new QuadTree(-1.0f, -1.0f, 2.0f);
            Random rnd = new Random(this.seed);
            for (int i2 = 0; i2 < this.numSamples; ++i2) {
                float bestX = 0.0f;
                float bestY = 0.0f;
                float bestDist = 0.0f;
                for (int c2 = 0; c2 < this.numCandidates; ++c2) {
                    float y2;
                    float x2;
                    while ((x2 = rnd.nextFloat() * 2.0f - 1.0f) * x2 + (y2 = rnd.nextFloat() * 2.0f - 1.0f) * y2 > 1.0f) {
                    }
                    float minDist = qtree.nearest(x2, y2, bestDist, Float.POSITIVE_INFINITY);
                    if (!(minDist > bestDist)) continue;
                    bestDist = minDist;
                    bestX = x2;
                    bestY = y2;
                }
                callback.onNewSample(bestX, bestY);
                qtree.insert(new Vector2f(bestX, bestY));
            }
            return this;
        }
    }

    private static class QuadTree {
        private static final int MAX_OBJECTS_PER_NODE = 32;
        private static final int PXNY = 0;
        private static final int NXNY = 1;
        private static final int NXPY = 2;
        private static final int PXPY = 3;
        private float minX;
        private float minY;
        private float hs;
        private ArrayList objects;
        private QuadTree[] children;

        QuadTree(float minX, float minY, float size) {
            this.minX = minX;
            this.minY = minY;
            this.hs = size * 0.5f;
        }

        private void split() {
            this.children = new QuadTree[4];
            this.children[1] = new QuadTree(this.minX, this.minY, this.hs);
            this.children[0] = new QuadTree(this.minX + this.hs, this.minY, this.hs);
            this.children[2] = new QuadTree(this.minX, this.minY + this.hs, this.hs);
            this.children[3] = new QuadTree(this.minX + this.hs, this.minY + this.hs, this.hs);
        }

        private void insertIntoChild(Vector2f o2) {
            this.children[this.quadrant(o2.x, o2.y)].insert(o2);
        }

        void insert(Vector2f object) {
            if (this.children != null) {
                this.insertIntoChild(object);
                return;
            }
            if (this.objects != null && this.objects.size() == 32) {
                this.split();
                for (int i2 = 0; i2 < this.objects.size(); ++i2) {
                    this.insertIntoChild((Vector2f)this.objects.get(i2));
                }
                this.objects = null;
                this.insertIntoChild(object);
            } else {
                if (this.objects == null) {
                    this.objects = new ArrayList(32);
                }
                this.objects.add(object);
            }
        }

        private int quadrant(float x2, float y2) {
            if (x2 < this.minX + this.hs) {
                if (y2 < this.minY + this.hs) {
                    return 1;
                }
                return 2;
            }
            if (y2 < this.minY + this.hs) {
                return 0;
            }
            return 3;
        }

        float nearest(float x2, float y2, float lowerBound, float upperBound) {
            float ub2 = upperBound;
            if (x2 < this.minX - upperBound || x2 > this.minX + this.hs * 2.0f + upperBound || y2 < this.minY - upperBound || y2 > this.minY + this.hs * 2.0f + upperBound) {
                return ub2;
            }
            if (this.children != null) {
                int i2 = this.quadrant(x2, y2);
                for (int c2 = 0; c2 < 4; ++c2) {
                    float n1 = this.children[i2].nearest(x2, y2, lowerBound, ub2);
                    if ((ub2 = Math.min(n1, ub2)) <= lowerBound) {
                        return lowerBound;
                    }
                    i2 = i2 + 1 & 3;
                }
                return ub2;
            }
            float ub22 = ub2 * ub2;
            float lb2 = lowerBound * lowerBound;
            for (int i3 = 0; this.objects != null && i3 < this.objects.size(); ++i3) {
                Vector2f o2 = (Vector2f)this.objects.get(i3);
                float d2 = o2.distanceSquared(x2, y2);
                if (d2 <= lb2) {
                    return lowerBound;
                }
                if (!(d2 < ub22)) continue;
                ub22 = d2;
            }
            return Math.sqrt(ub22);
        }
    }

    public static class Sphere {
        private boolean onHemisphere;
        private int numSamples;
        private int numCandidates = 60;
        private long seed;

        public Sphere generate(final float[] xyzs) {
            final IntHolder i2 = new IntHolder();
            return this.generate(new Callback3d(){

                public void onNewSample(float x2, float y2, float z2) {
                    xyzs[3 * i2.value + 0] = x2;
                    xyzs[3 * i2.value + 1] = y2;
                    xyzs[3 * i2.value + 2] = z2;
                    ++i2.value;
                }
            });
        }

        public Sphere generate(final FloatBuffer xyzs) {
            final IntHolder i2 = new IntHolder();
            final int pos = xyzs.position();
            return this.generate(new Callback3d(){

                public void onNewSample(float x2, float y2, float z2) {
                    xyzs.put(pos + 3 * i2.value + 0, x2);
                    xyzs.put(pos + 3 * i2.value + 1, y2);
                    xyzs.put(pos + 3 * i2.value + 2, z2);
                    ++i2.value;
                }
            });
        }

        public Sphere seed(long seed) {
            this.seed = seed;
            return this;
        }

        public Sphere numSamples(int numSamples) {
            this.numSamples = numSamples;
            return this;
        }

        public Sphere numCandidates(int numCandidates) {
            this.numCandidates = numCandidates;
            return this;
        }

        public Sphere onHemisphere(boolean onHemisphere) {
            this.onHemisphere = onHemisphere;
            return this;
        }

        public Sphere generate(Callback3d callback) {
            Random rnd = new Random(this.seed);
            Node otree = new Node();
            for (int i2 = 0; i2 < this.numSamples; ++i2) {
                float bestX = Float.NaN;
                float bestY = Float.NaN;
                float bestZ = Float.NaN;
                float bestDist = 0.0f;
                for (int c2 = 0; c2 < this.numCandidates; ++c2) {
                    float minDist;
                    float x2;
                    float x1;
                    while ((x1 = rnd.nextFloat() * 2.0f - 1.0f) * x1 + (x2 = rnd.nextFloat() * 2.0f - 1.0f) * x2 > 1.0f) {
                    }
                    float sqrt = (float)Math.sqrt(1.0 - (double)(x1 * x1) - (double)(x2 * x2));
                    float x3 = 2.0f * x1 * sqrt;
                    float y2 = 2.0f * x2 * sqrt;
                    float z2 = 1.0f - 2.0f * (x1 * x1 + x2 * x2);
                    if (this.onHemisphere) {
                        z2 = Math.abs(z2);
                    }
                    if (!((minDist = otree.nearest(x3, y2, z2)) > bestDist)) continue;
                    bestDist = minDist;
                    bestX = x3;
                    bestY = y2;
                    bestZ = z2;
                }
                callback.onNewSample(bestX, bestY, bestZ);
                otree.insert(new Vector3f(bestX, bestY, bestZ));
            }
            return this;
        }

        private static final class Node {
            private static final int MAX_OBJECTS_PER_NODE = 32;
            private float v0x;
            private float v0y;
            private float v0z;
            private float v1x;
            private float v1y;
            private float v1z;
            private float v2x;
            private float v2y;
            private float v2z;
            private float cx;
            private float cy;
            private float cz;
            private float arc;
            private ArrayList objects;
            private Node[] children;

            Node() {
                this.children = new Node[8];
                float s2 = 1.0f;
                this.arc = (float)java.lang.Math.PI * 2;
                this.children[0] = new Node(-s2, 0.0f, 0.0f, 0.0f, 0.0f, s2, 0.0f, s2, 0.0f);
                this.children[1] = new Node(0.0f, 0.0f, s2, s2, 0.0f, 0.0f, 0.0f, s2, 0.0f);
                this.children[2] = new Node(s2, 0.0f, 0.0f, 0.0f, 0.0f, -s2, 0.0f, s2, 0.0f);
                this.children[3] = new Node(0.0f, 0.0f, -s2, -s2, 0.0f, 0.0f, 0.0f, s2, 0.0f);
                this.children[4] = new Node(-s2, 0.0f, 0.0f, 0.0f, -s2, 0.0f, 0.0f, 0.0f, s2);
                this.children[5] = new Node(0.0f, 0.0f, s2, 0.0f, -s2, 0.0f, s2, 0.0f, 0.0f);
                this.children[6] = new Node(s2, 0.0f, 0.0f, 0.0f, -s2, 0.0f, 0.0f, 0.0f, -s2);
                this.children[7] = new Node(0.0f, 0.0f, -s2, 0.0f, -s2, 0.0f, -s2, 0.0f, 0.0f);
            }

            private Node(float x0, float y0, float z0, float x1, float y1, float z1, float x2, float y2, float z2) {
                this.v0x = x0;
                this.v0y = y0;
                this.v0z = z0;
                this.v1x = x1;
                this.v1y = y1;
                this.v1z = z1;
                this.v2x = x2;
                this.v2y = y2;
                this.v2z = z2;
                this.cx = (this.v0x + this.v1x + this.v2x) / 3.0f;
                this.cy = (this.v0y + this.v1y + this.v2y) / 3.0f;
                this.cz = (this.v0z + this.v1z + this.v2z) / 3.0f;
                float invCLen = Math.invsqrt(this.cx * this.cx + this.cy * this.cy + this.cz * this.cz);
                this.cx *= invCLen;
                this.cy *= invCLen;
                this.cz *= invCLen;
                float arc1 = this.greatCircleDist(this.cx, this.cy, this.cz, this.v0x, this.v0y, this.v0z);
                float arc2 = this.greatCircleDist(this.cx, this.cy, this.cz, this.v1x, this.v1y, this.v1z);
                float arc3 = this.greatCircleDist(this.cx, this.cy, this.cz, this.v2x, this.v2y, this.v2z);
                float dist = Math.max(Math.max(arc1, arc2), arc3);
                this.arc = dist *= 1.7f;
            }

            private void split() {
                float w0x = this.v1x + this.v2x;
                float w0y = this.v1y + this.v2y;
                float w0z = this.v1z + this.v2z;
                float len0 = Math.invsqrt(w0x * w0x + w0y * w0y + w0z * w0z);
                w0x *= len0;
                w0y *= len0;
                w0z *= len0;
                float w1x = this.v0x + this.v2x;
                float w1y = this.v0y + this.v2y;
                float w1z = this.v0z + this.v2z;
                float len1 = Math.invsqrt(w1x * w1x + w1y * w1y + w1z * w1z);
                w1x *= len1;
                w1y *= len1;
                w1z *= len1;
                float w2x = this.v0x + this.v1x;
                float w2y = this.v0y + this.v1y;
                float w2z = this.v0z + this.v1z;
                float len2 = Math.invsqrt(w2x * w2x + w2y * w2y + w2z * w2z);
                this.children = new Node[4];
                this.children[0] = new Node(this.v0x, this.v0y, this.v0z, w2x *= len2, w2y *= len2, w2z *= len2, w1x, w1y, w1z);
                this.children[1] = new Node(this.v1x, this.v1y, this.v1z, w0x, w0y, w0z, w2x, w2y, w2z);
                this.children[2] = new Node(this.v2x, this.v2y, this.v2z, w1x, w1y, w1z, w0x, w0y, w0z);
                this.children[3] = new Node(w0x, w0y, w0z, w1x, w1y, w1z, w2x, w2y, w2z);
            }

            private void insertIntoChild(Vector3f o2) {
                for (int i2 = 0; i2 < this.children.length; ++i2) {
                    Node c2 = this.children[i2];
                    if (!Node.isPointOnSphericalTriangle(o2.x, o2.y, o2.z, c2.v0x, c2.v0y, c2.v0z, c2.v1x, c2.v1y, c2.v1z, c2.v2x, c2.v2y, c2.v2z, 1.0E-6f)) continue;
                    c2.insert(o2);
                    return;
                }
            }

            void insert(Vector3f object) {
                if (this.children != null) {
                    this.insertIntoChild(object);
                    return;
                }
                if (this.objects != null && this.objects.size() == 32) {
                    this.split();
                    for (int i2 = 0; i2 < 32; ++i2) {
                        this.insertIntoChild((Vector3f)this.objects.get(i2));
                    }
                    this.objects = null;
                    this.insertIntoChild(object);
                } else {
                    if (this.objects == null) {
                        this.objects = new ArrayList(32);
                    }
                    this.objects.add(object);
                }
            }

            private static boolean isPointOnSphericalTriangle(float x2, float y2, float z2, float v0X, float v0Y, float v0Z, float v1X, float v1Y, float v1Z, float v2X, float v2Y, float v2Z, float epsilon) {
                float edge1X = v1X - v0X;
                float edge2Z = v2Z - v0Z;
                float edge2Y = v2Y - v0Y;
                float pvecX = y2 * edge2Z - z2 * edge2Y;
                float edge1Y = v1Y - v0Y;
                float edge2X = v2X - v0X;
                float pvecY = z2 * edge2X - x2 * edge2Z;
                float edge1Z = v1Z - v0Z;
                float pvecZ = x2 * edge2Y - y2 * edge2X;
                float det = edge1X * pvecX + edge1Y * pvecY + edge1Z * pvecZ;
                if (det > -epsilon && det < epsilon) {
                    return false;
                }
                float tvecX = -v0X;
                float tvecY = -v0Y;
                float tvecZ = -v0Z;
                float invDet = 1.0f / det;
                float u2 = (tvecX * pvecX + tvecY * pvecY + tvecZ * pvecZ) * invDet;
                if (u2 < 0.0f || u2 > 1.0f) {
                    return false;
                }
                float qvecX = tvecY * edge1Z - tvecZ * edge1Y;
                float qvecY = tvecZ * edge1X - tvecX * edge1Z;
                float qvecZ = tvecX * edge1Y - tvecY * edge1X;
                float v2 = (x2 * qvecX + y2 * qvecY + z2 * qvecZ) * invDet;
                if (v2 < 0.0f || u2 + v2 > 1.0f) {
                    return false;
                }
                float t2 = (edge2X * qvecX + edge2Y * qvecY + edge2Z * qvecZ) * invDet;
                return t2 >= epsilon;
            }

            private int child(float x2, float y2, float z2) {
                for (int i2 = 0; i2 < this.children.length; ++i2) {
                    Node c2 = this.children[i2];
                    if (!Node.isPointOnSphericalTriangle(x2, y2, z2, c2.v0x, c2.v0y, c2.v0z, c2.v1x, c2.v1y, c2.v1z, c2.v2x, c2.v2y, c2.v2z, 1.0E-5f)) continue;
                    return i2;
                }
                return 0;
            }

            private float greatCircleDist(float x1, float y1, float z1, float x2, float y2, float z2) {
                float dot = x1 * x2 + y1 * y2 + z1 * z2;
                return (float)(-1.5707963267948966 * (double)dot + 1.5707963267948966);
            }

            float nearest(float x2, float y2, float z2) {
                return this.nearest(x2, y2, z2, Float.POSITIVE_INFINITY);
            }

            float nearest(float x2, float y2, float z2, float n2) {
                float gcd = this.greatCircleDist(x2, y2, z2, this.cx, this.cy, this.cz);
                if (gcd - this.arc > n2) {
                    return n2;
                }
                float nr2 = n2;
                if (this.children != null) {
                    int num = this.children.length;
                    int mod = num - 1;
                    int i2 = this.child(x2, y2, z2);
                    for (int c2 = 0; c2 < num; ++c2) {
                        float n1 = this.children[i2].nearest(x2, y2, z2, nr2);
                        nr2 = Math.min(n1, nr2);
                        i2 = i2 + 1 & mod;
                    }
                    return nr2;
                }
                for (int i3 = 0; this.objects != null && i3 < this.objects.size(); ++i3) {
                    Vector3f o2 = (Vector3f)this.objects.get(i3);
                    float d2 = this.greatCircleDist(o2.x, o2.y, o2.z, x2, y2, z2);
                    if (!(d2 < nr2)) continue;
                    nr2 = d2;
                }
                return nr2;
            }
        }
    }

    private static final class IntHolder {
        int value;

        private IntHolder() {
        }
    }
}

