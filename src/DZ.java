/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AX
 *  Bsa
 *  DX
 *  MD
 *  NTa
 *  Oz
 *  Pb
 *  Ppa
 *  Tpa
 *  Zpa
 *  aPa
 *  aqa
 *  fpa
 *  hTa
 *  pua
 *  vRa
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public final class DZ
extends Enum<DZ>
implements Pb {
    private static final /* synthetic */ DZ[] $VALUES;
    public static final /* enum */ DZ SOUTH;
    private final int index;
    private final int horizontalIndex;
    public static final /* enum */ DZ EAST;
    public static final /* enum */ DZ UP;
    private final MD directionVec;
    private final DX axisDirection;
    private final int opposite;
    private final RX axis;
    public static final /* enum */ DZ DOWN;
    public static final /* enum */ DZ WEST;
    private static final DZ[] HORIZONTALS;
    private static final Map<String, DZ> NAME_LOOKUP;
    public static final /* enum */ DZ NORTH;
    private final String name;
    public static final DZ[] VALUES;

    /*
     * Enabled aggressive block sorting
     */
    public DZ rotateY() {
        DZ a2;
        switch (AX.A[a2.ordinal()]) {
            case 1: {
                return EAST;
            }
            case 2: {
                return SOUTH;
            }
            case 3: {
                return WEST;
            }
            case 4: {
                return NORTH;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(5 >> 3, aqa.q).append((Object)a2).toString());
    }

    public static DZ byName(String a2) {
        if (a2 == null) {
            return null;
        }
        return NAME_LOOKUP.get(a2.toLowerCase());
    }

    public int getIndex() {
        DZ a2;
        return a2.index;
    }

    public static DZ random(Random a2) {
        return DZ.values()[a2.nextInt(DZ.values().length)];
    }

    /*
     * WARNING - void declaration
     */
    public static DZ func_181076_a(DX dX, RX rX) {
        void a2;
        int b2;
        DX dX2 = dX;
        DZ[] dZArray = DZ.values();
        int n2 = dZArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            DZ dZ = dZArray[b2];
            if (dZ.getAxisDirection() == dX2 && dZ.getAxis() == a2) {
                return dZ;
            }
            n3 = ++b2;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, Eqa.F).append(dX2).append(Tpa.E).append(a2).toString());
    }

    public static DZ getFront(int a2) {
        return VALUES[Oz.f((int)(a2 % VALUES.length))];
    }

    public RX getAxis() {
        DZ a2;
        return a2.axis;
    }

    private DZ rotateX() {
        DZ a2;
        switch (AX.A[a2.ordinal()]) {
            case 1: {
                while (false) {
                }
                return DOWN;
            }
            default: {
                throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, Bta.A).append((Object)a2).toString());
            }
            case 3: {
                return UP;
            }
            case 5: {
                return NORTH;
            }
            case 6: {
                return SOUTH;
            }
        }
    }

    public DX getAxisDirection() {
        DZ a2;
        return a2.axisDirection;
    }

    private DZ rotateZ() {
        DZ a2;
        switch (AX.A[a2.ordinal()]) {
            case 2: {
                while (false) {
                }
                return DOWN;
            }
            default: {
                throw new IllegalStateException(new StringBuilder().insert(3 >> 2, Bsa.r).append((Object)a2).toString());
            }
            case 4: {
                return UP;
            }
            case 5: {
                return EAST;
            }
            case 6: {
                return WEST;
            }
        }
    }

    public String getName() {
        DZ a2;
        return a2.name;
    }

    public static DZ[] values() {
        return (DZ[])$VALUES.clone();
    }

    static {
        int n2;
        DOWN = new DZ(uSa.E, vRa.d, pua.o, Nta.T, DX.NEGATIVE, RX.Y, new MD(uSa.E, pua.o, uSa.E));
        UP = new DZ(vRa.d, uSa.E, pua.o, dsa.a, DX.POSITIVE, RX.Y, new MD(uSa.E, vRa.d, uSa.E));
        NORTH = new DZ(uqa.g, yRa.d, uqa.g, hTa.d, DX.NEGATIVE, RX.Z, new MD(uSa.E, uSa.E, pua.o));
        SOUTH = new DZ(yRa.d, uqa.g, uSa.E, vsa.k, DX.POSITIVE, RX.Z, new MD(uSa.E, uSa.E, vRa.d));
        WEST = new DZ(AQa.P, tTa.h, vRa.d, NTa.U, DX.NEGATIVE, RX.X, new MD(pua.o, uSa.E, uSa.E));
        EAST = new DZ(tTa.h, AQa.P, yRa.d, Zpa.D, DX.POSITIVE, RX.X, new MD(vRa.d, uSa.E, uSa.E));
        DZ[] dZArray = new DZ[uua.p];
        dZArray[uSa.E] = DOWN;
        dZArray[vRa.d] = UP;
        dZArray[uqa.g] = NORTH;
        dZArray[yRa.d] = SOUTH;
        dZArray[AQa.P] = WEST;
        dZArray[tTa.h] = EAST;
        $VALUES = dZArray;
        VALUES = new DZ[uua.p];
        HORIZONTALS = new DZ[AQa.P];
        NAME_LOOKUP = Maps.newHashMap();
        DZ[] dZArray2 = DZ.values();
        int n3 = dZArray2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            DZ dZ;
            DZ.VALUES[dZ.index] = dZ = dZArray2[n2];
            if (dZ.getAxis().isHorizontal()) {
                DZ.HORIZONTALS[dZ.horizontalIndex] = dZ;
            }
            NAME_LOOKUP.put(dZ.getName2().toLowerCase(), dZ);
            n4 = ++n2;
        }
    }

    public static DZ getHorizontal(int a2) {
        return HORIZONTALS[Oz.f((int)(a2 % HORIZONTALS.length))];
    }

    public DZ getOpposite() {
        DZ a2;
        return DZ.getFront(a2.opposite);
    }

    public static DZ valueOf(String a2) {
        return Enum.valueOf(DZ.class, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static DZ getFacingFromVector(float f2, float f3, float f4) {
        int n2;
        float f5 = f2;
        DZ dZ = NORTH;
        float f6 = CRa.V;
        DZ[] dZArray = DZ.values();
        int n3 = dZArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            float f7;
            void a2;
            void b2;
            DZ c2 = dZArray[n2];
            float f8 = f5 * (float)c2.directionVec.getX() + b2 * (float)c2.directionVec.getY() + a2 * (float)c2.directionVec.getZ();
            if (f7 > f6) {
                f6 = f8;
                dZ = c2;
            }
            n4 = ++n2;
        }
        return dZ;
    }

    /*
     * Enabled aggressive block sorting
     */
    public DZ rotateYCCW() {
        DZ a2;
        switch (AX.A[a2.ordinal()]) {
            case 1: {
                return WEST;
            }
            case 2: {
                return NORTH;
            }
            case 3: {
                return EAST;
            }
            case 4: {
                return SOUTH;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(2 & 5, aPa.N).append((Object)a2).toString());
    }

    public int getFrontOffsetY() {
        DZ a2;
        if (a2.axis == RX.Y) {
            return a2.axisDirection.getOffset();
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private DZ(int n3, int n4, int n5, String string2, DX dX, RX rX, MD mD) {
        DZ h;
        void c2;
        void b2;
        void d2;
        void f2;
        void e2;
        void g;
        DZ a2;
        DZ dZ = dZ2;
        DZ dZ2 = mD;
        DZ dZ3 = a2 = dZ;
        DZ dZ4 = a2;
        DZ dZ5 = a2;
        a2.index = g;
        dZ5.horizontalIndex = e2;
        dZ5.opposite = f2;
        dZ4.name = d2;
        dZ4.axis = b2;
        dZ3.axisDirection = c2;
        dZ3.directionVec = h;
    }

    public String getName2() {
        DZ a2;
        return a2.name;
    }

    public MD getDirectionVec() {
        DZ a2;
        return a2.directionVec;
    }

    public int getFrontOffsetZ() {
        DZ a2;
        if (a2.axis == RX.Z) {
            return a2.axisDirection.getOffset();
        }
        return uSa.E;
    }

    public int getHorizontalIndex() {
        DZ a2;
        return a2.horizontalIndex;
    }

    public static DZ fromAngle(double a2) {
        return DZ.getHorizontal(Oz.f((double)(a2 / fpa.ba + kTa.B)) & yRa.d);
    }

    public int getFrontOffsetX() {
        DZ a2;
        if (a2.axis == RX.X) {
            return a2.axisDirection.getOffset();
        }
        return uSa.E;
    }

    public String toString() {
        DZ a2;
        return a2.name;
    }

    /*
     * Enabled aggressive block sorting
     */
    public DZ rotateAround(RX rX) {
        Enum b2 = rX;
        DZ a2 = this;
        switch (AX.I[b2.ordinal()]) {
            case 1: {
                if (a2 != WEST && a2 != EAST) {
                    return a2.rotateX();
                }
                return a2;
            }
            case 2: {
                if (a2 != UP && a2 != DOWN) {
                    return a2.rotateY();
                }
                return a2;
            }
            case 3: {
                if (a2 != NORTH && a2 != SOUTH) {
                    return a2.rotateZ();
                }
                return a2;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(3 & 4, Ppa.d).append(b2).toString());
    }
}

