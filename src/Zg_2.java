/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tpa
 *  Zg
 *  vRa
 *  yra
 */
public final class Zg_2
implements Comparable<Zg> {
    public int height;
    public int y;
    public int width;
    public int score2;
    public String name;
    public boolean rotated;
    public int score1;
    public int x;
    public boolean canRotate;

    @Override
    public int compareTo(Zg zg2) {
        Zg_2 b2 = zg2;
        Zg_2 a2 = this;
        return a2.name.compareTo(b2.name);
    }

    public void set(Zg zg2) {
        Zg_2 a2;
        Zg_2 b2 = zg2;
        Zg_2 zg_2 = a2 = this;
        Zg_2 zg_22 = b2;
        Zg_2 zg_23 = a2;
        Zg_2 zg_24 = b2;
        Zg_2 zg_25 = a2;
        Zg_2 zg_26 = b2;
        a2.name = zg_26.name;
        zg_25.x = zg_26.x;
        zg_25.y = b2.y;
        a2.width = zg_24.width;
        zg_23.height = zg_24.height;
        zg_23.rotated = b2.rotated;
        a2.canRotate = zg_22.canRotate;
        zg_2.score1 = zg_22.score1;
        zg_2.score2 = b2.score2;
    }

    /*
     * WARNING - void declaration
     */
    public Zg_2(int n2, int n3) {
        void b2;
        Zg_2 a2;
        int c2 = n3;
        Zg_2 zg_2 = a2 = this;
        a2.canRotate = vRa.d;
        zg_2.width = b2;
        zg_2.height = c2;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (a2.getClass() != b2.getClass()) {
            return uSa.E != 0;
        }
        b2 = (Zg_2)b2;
        if (((Zg_2)a2).name == null ? ((Zg_2)b2).name != null : !((Zg_2)a2).name.equals(((Zg_2)b2).name)) {
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public String toString() {
        Zg_2 a2;
        return new StringBuilder().insert(3 >> 2, a2.name).append(dqa.X).append(a2.x).append(yra.t).append(a2.y).append(Tpa.E).append(a2.width).append(rRa.X).append(a2.height).append(XOa.D).toString();
    }

    public Zg_2(Zg zg2) {
        Zg_2 a2;
        Zg_2 b2 = zg2;
        Zg_2 zg_2 = a2 = this;
        Zg_2 zg_22 = b2;
        a2.canRotate = vRa.d;
        a2.x = b2.x;
        a2.y = zg_22.y;
        zg_2.width = zg_22.width;
        zg_2.height = b2.height;
    }

    public Zg_2() {
        Zg_2 a2;
        a2.canRotate = vRa.d;
    }
}

