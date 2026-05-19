/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AX
 *  hra
 *  vRa
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;

public final class LX
extends Enum<LX>
implements Predicate<DZ>,
Iterable<DZ> {
    private static final /* synthetic */ LX[] $VALUES;
    public static final /* enum */ LX HORIZONTAL = new LX();
    public static final /* enum */ LX VERTICAL = new LX();

    /*
     * WARNING - void declaration
     */
    public DZ random(Random random) {
        void a2;
        DZ[] dZArray = this;
        DZ[] b2 = dZArray.facings();
        return b2[a2.nextInt(b2.length)];
    }

    @Override
    public boolean apply(DZ dZ2) {
        Enum b2 = dZ2;
        LX a2 = this;
        if (b2 != null && ((DZ)b2).getAxis().getPlane() == a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static LX[] values() {
        return (LX[])$VALUES.clone();
    }

    @Override
    public Iterator<DZ> iterator() {
        LX a2;
        return Iterators.forArray(a2.facings());
    }

    /*
     * Enabled aggressive block sorting
     */
    public DZ[] facings() {
        LX a2;
        switch (AX.J[a2.ordinal()]) {
            case 1: {
                DZ[] dZArray = new DZ[AQa.P];
                dZArray[uSa.E] = DZ.NORTH;
                dZArray[vRa.d] = DZ.EAST;
                dZArray[uqa.g] = DZ.SOUTH;
                dZArray[yRa.d] = DZ.WEST;
                return dZArray;
            }
            case 2: {
                DZ[] dZArray = new DZ[uqa.g];
                dZArray[uSa.E] = DZ.UP;
                dZArray[vRa.d] = DZ.DOWN;
                return dZArray;
            }
        }
        throw new Error(hra.L);
    }

    static {
        LX[] lXArray = new LX[uqa.g];
        lXArray[uSa.E] = HORIZONTAL;
        lXArray[vRa.d] = VERTICAL;
        $VALUES = lXArray;
    }

    public static LX valueOf(String a2) {
        return Enum.valueOf(LX.class, a2);
    }

    private LX() {
        int a2 = n2;
        LX lX2 = this;
    }
}

