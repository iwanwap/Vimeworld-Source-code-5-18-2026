/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jp
 *  KI
 *  Kpa
 *  RG
 *  Rk
 *  Tg
 *  Vi
 *  ZK
 *  fj
 *  nI
 *  vRa
 *  xi
 */
import java.util.ArrayList;
import java.util.Iterator;

public final class Hi {
    public static final Hi A;
    public final KI[] I;

    public Hi(Rk rk) {
        Iterator a2;
        Hi hi = this;
        ArrayList<Hi> arrayList = new ArrayList<Hi>(a2.getEntriesCount());
        Iterator iterator = a2 = a2.getEntriesList().iterator();
        while (iterator.hasNext()) {
            Object b2;
            ZK zK = (ZK)a2.next();
            switch (Vi.I[zK.getType().ordinal()]) {
                case 1: {
                    Object object = new xi();
                    break;
                }
                case 2: {
                    Object object = new Wh(zK.getKey());
                    break;
                }
                case 3: {
                    Object object = new RG();
                    break;
                }
                case 4: {
                    Object object = new nI(zK.getBlock());
                    break;
                }
                case 5: {
                    Object object = new fj(zK.getKey());
                    break;
                }
                case 6: {
                    Object object = new Bi(Jp.fromProto((FK)zK.getEntityType()));
                    break;
                }
                default: {
                    throw new IllegalArgumentException(Mqa.y);
                }
            }
            object.I = zK.getShow();
            iterator = a2;
            arrayList.add((Hi)b2);
        }
        hi.I = arrayList.toArray(new KI[uSa.E]);
    }

    public Hi(KI ... kIArray) {
        KI[] b2 = kIArray;
        KI[] a2 = this;
        a2.I = b2;
    }

    static {
        KI[] kIArray = new KI[vRa.d];
        kIArray[uSa.E] = new xi().J(vRa.d != 0);
        A = new Hi(kIArray);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, Tg tg) {
        boolean bl;
        int c2;
        Hi hi = this;
        int bl2 = uSa.E;
        KI[] kIArray = hi.I;
        int n2 = hi.I.length;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            void a2;
            void b2;
            KI kI2 = kIArray[c2];
            if (kI2.J((Kpa)b2, (Tg)a2)) {
                bl = kI2.I;
            }
            n3 = ++c2;
        }
        return bl;
    }
}

