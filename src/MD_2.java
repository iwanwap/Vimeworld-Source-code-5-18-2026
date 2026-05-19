/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MD
 *  Oz
 *  uOa
 *  vRa
 */
import com.google.common.base.Objects;

public class MD_2
implements Comparable<MD> {
    private final int x;
    public static final MD NULL_VECTOR = new MD_2(uSa.E, uSa.E, uSa.E);
    private final int y;
    private final int z;

    public double distanceSqToCenter(double c2, double b2, double a2) {
        MD_2 d2;
        MD_2 mD_2 = d2;
        c2 = (double)mD_2.getX() + kTa.B - c2;
        b2 = (double)mD_2.getY() + kTa.B - b2;
        a2 = (double)mD_2.getZ() + kTa.B - a2;
        double d3 = c2;
        double d4 = b2;
        double d5 = a2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public MD_2(double c2, double b2, double a2) {
        d2(Oz.f((double)c2), Oz.f((double)b2), Oz.f((double)a2));
        MD_2 d2;
    }

    public MD crossProduct(MD mD2) {
        MD_2 b2 = mD2;
        MD_2 a2 = this;
        return new MD_2(a2.getY() * b2.getZ() - a2.getZ() * b2.getY(), a2.getZ() * b2.getX() - a2.getX() * b2.getZ(), a2.getX() * b2.getY() - a2.getY() * b2.getX());
    }

    public int getX() {
        MD_2 a2;
        return a2.x;
    }

    public int hashCode() {
        MD_2 a2;
        return (a2.getY() + a2.getZ() * tua.U) * tua.U + a2.getX();
    }

    public double distanceSq(double c2, double b2, double a2) {
        MD_2 d2;
        MD_2 mD_2 = d2;
        c2 = (double)mD_2.getX() - c2;
        b2 = (double)mD_2.getY() - b2;
        a2 = (double)mD_2.getZ() - a2;
        double d3 = c2;
        double d4 = b2;
        double d5 = a2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public int getY() {
        MD_2 a2;
        return a2.y;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof MD_2)) {
            return uSa.E != 0;
        }
        b2 = (MD_2)b2;
        if (((MD_2)a2).getX() != ((MD_2)b2).getX()) {
            return uSa.E != 0;
        }
        if (((MD_2)a2).getY() != ((MD_2)b2).getY()) {
            return uSa.E != 0;
        }
        if (((MD_2)a2).getZ() == ((MD_2)b2).getZ()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getZ() {
        MD_2 a2;
        return a2.z;
    }

    public double distanceSq(MD mD2) {
        MD_2 b2 = mD2;
        MD_2 a2 = this;
        return a2.distanceSq(b2.getX(), b2.getY(), b2.getZ());
    }

    public String toString() {
        MD_2 a2;
        return Objects.toStringHelper(a2).add(rRa.X, a2.getX()).add(uOa.Ja, a2.getY()).add(oua.v, a2.getZ()).toString();
    }

    /*
     * WARNING - void declaration
     */
    public MD_2(int n2, int n3, int n4) {
        void b2;
        void c2;
        MD_2 a2;
        int d2 = n4;
        MD_2 mD_2 = a2 = this;
        a2.x = c2;
        mD_2.y = b2;
        mD_2.z = d2;
    }

    @Override
    public int compareTo(MD mD2) {
        MD_2 b2 = mD2;
        MD_2 a2 = this;
        if (a2.getY() == b2.getY()) {
            if (a2.getZ() == b2.getZ()) {
                return a2.getX() - b2.getX();
            }
            return a2.getZ() - b2.getZ();
        }
        return a2.getY() - b2.getY();
    }
}

