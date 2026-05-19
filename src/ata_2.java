/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Sqa
 *  ata
 *  vRa
 */
public final class ata_2
implements Comparable<ata> {
    public int posY;
    public int posZ;
    public int posX;

    public ata_2() {
        ata_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public float getDistanceSquared(int n2, int n3, int n4) {
        void b22;
        void c22;
        ata_2 a2;
        int d22 = n4;
        ata_2 ata_22 = a2 = this;
        float c22 = ata_22.posX - c22;
        float b22 = ata_22.posY - b22;
        float d22 = ata_22.posZ - d22;
        float f2 = c22;
        float f3 = b22;
        float f4 = d22;
        return f2 * f2 + f3 * f3 + f4 * f4;
    }

    /*
     * WARNING - void declaration
     */
    public void set(int n2, int n3, int n4) {
        void b2;
        void c2;
        ata_2 a2;
        int d2 = n4;
        ata_2 ata_22 = a2 = this;
        a2.posX = c2;
        ata_22.posY = b2;
        ata_22.posZ = d2;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        ata_2 a2 = this;
        if (!(b2 instanceof ata_2)) {
            return uSa.E != 0;
        }
        b2 = (ata_2)b2;
        if (a2.posX == ((ata_2)b2).posX && a2.posY == ((ata_2)b2).posY && a2.posZ == ((ata_2)b2).posZ) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getDistanceSquaredToChunkCoordinates(ata ata2) {
        ata_2 b2 = ata2;
        ata_2 a2 = this;
        ata_2 ata_22 = b2;
        return a2.getDistanceSquared(ata_22.posX, ata_22.posY, b2.posZ);
    }

    public ata_2(ata ata2) {
        ata_2 a2;
        ata_2 b2 = ata2;
        ata_2 ata_22 = a2 = this;
        ata_2 ata_23 = b2;
        a2.posX = ata_23.posX;
        ata_22.posY = ata_23.posY;
        ata_22.posZ = b2.posZ;
    }

    public int hashCode() {
        ata_2 a2;
        ata_2 ata_22 = a2;
        return ata_22.posX + ata_22.posZ << Yqa.i + a2.posY << ERa.C;
    }

    /*
     * WARNING - void declaration
     */
    public ata_2(int n2, int n3, int n4) {
        void b2;
        void c2;
        ata_2 a2;
        int d2 = n4;
        ata_2 ata_22 = a2 = this;
        a2.posX = c2;
        ata_22.posY = b2;
        ata_22.posZ = d2;
    }

    public String toString() {
        ata_2 a2;
        return new StringBuilder().insert(3 >> 2, Sqa.k).append(a2.posX).append(vua.S).append(a2.posY).append(csa.u).append(a2.posZ).append((char)ySa.Z).toString();
    }

    @Override
    public int compareTo(ata ata2) {
        ata_2 b2 = ata2;
        ata_2 a2 = this;
        if (a2.posY == b2.posY) {
            if (a2.posZ == b2.posZ) {
                return a2.posX - b2.posX;
            }
            return a2.posZ - b2.posZ;
        }
        return a2.posY - b2.posY;
    }
}

