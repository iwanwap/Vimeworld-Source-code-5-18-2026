/*
 * Decompiled with CFR 0.152.
 */
package org.joml.sampling;

import java.util.ArrayList;
import org.joml.Random;
import org.joml.Vector2f;
import org.joml.sampling.Callback2d;
import org.joml.sampling.Math;

public class PoissonSampling {

    public static class Disk {
        private final Vector2f[] grid;
        private final float diskRadius;
        private final float diskRadiusSquared;
        private final float minDist;
        private final float minDistSquared;
        private final float cellSize;
        private final int numCells;
        private final Random rnd;
        private final ArrayList processList;

        public Disk(long seed, float diskRadius, float minDist, int k2, Callback2d callback) {
            this.diskRadius = diskRadius;
            this.diskRadiusSquared = diskRadius * diskRadius;
            this.minDist = minDist;
            this.minDistSquared = minDist * minDist;
            this.rnd = new Random(seed);
            this.cellSize = minDist / (float)Math.sqrt(2.0);
            this.numCells = (int)(diskRadius * 2.0f / this.cellSize) + 1;
            this.grid = new Vector2f[this.numCells * this.numCells];
            this.processList = new ArrayList();
            this.compute(k2, callback);
        }

        private void compute(int k2, Callback2d callback) {
            float y2;
            float x2;
            while ((x2 = this.rnd.nextFloat() * 2.0f - 1.0f) * x2 + (y2 = this.rnd.nextFloat() * 2.0f - 1.0f) * y2 > 1.0f) {
            }
            Vector2f initial = new Vector2f(x2, y2);
            this.processList.add(initial);
            callback.onNewSample(initial.x, initial.y);
            this.insert(initial);
            while (!this.processList.isEmpty()) {
                int i2 = this.rnd.nextInt(this.processList.size());
                Vector2f sample = (Vector2f)this.processList.get(i2);
                boolean found = false;
                for (int s2 = 0; s2 < k2; ++s2) {
                    float angle = this.rnd.nextFloat() * ((float)java.lang.Math.PI * 2);
                    float radius = this.minDist * (this.rnd.nextFloat() + 1.0f);
                    x2 = (float)((double)radius * Math.sin_roquen_9((double)angle + 1.5707963267948966));
                    y2 = (float)((double)radius * Math.sin_roquen_9(angle));
                    if ((x2 += sample.x) * x2 + (y2 += sample.y) * y2 > this.diskRadiusSquared || this.searchNeighbors(x2, y2)) continue;
                    found = true;
                    callback.onNewSample(x2, y2);
                    Vector2f f2 = new Vector2f(x2, y2);
                    this.processList.add(f2);
                    this.insert(f2);
                    break;
                }
                if (found) continue;
                this.processList.remove(i2);
            }
        }

        private boolean searchNeighbors(float px2, float py2) {
            float invCellSize = 1.0f / this.cellSize;
            int row = (int)((py2 + this.diskRadius) * invCellSize);
            int col = (int)((px2 + this.diskRadius) * invCellSize);
            if (this.grid[row * this.numCells + col] != null) {
                return true;
            }
            int minX = Math.max(0, col - 1);
            int minY = Math.max(0, row - 1);
            int maxX = Math.min(col + 1, this.numCells - 1);
            int maxY = Math.min(row + 1, this.numCells - 1);
            for (int y2 = minY; y2 <= maxY; ++y2) {
                for (int x2 = minX; x2 <= maxX; ++x2) {
                    float dy2;
                    float dx2;
                    Vector2f v2 = this.grid[y2 * this.numCells + x2];
                    if (v2 == null || !((dx2 = v2.x - px2) * dx2 + (dy2 = v2.y - py2) * dy2 < this.minDistSquared)) continue;
                    return true;
                }
            }
            return false;
        }

        private void insert(Vector2f p2) {
            float invCellSize = 1.0f / this.cellSize;
            int row = (int)((p2.y + this.diskRadius) * invCellSize);
            int col = (int)((p2.x + this.diskRadius) * invCellSize);
            this.grid[row * this.numCells + col] = p2;
        }
    }
}

