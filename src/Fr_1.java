/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AP
 *  CR
 *  Fr
 *  IQ
 *  JR
 *  Jp
 *  Kk
 *  Kpa
 *  Lr
 *  Pl
 *  Rua
 *  TO
 *  ZO
 *  fP
 *  fp
 *  jp
 *  qp
 *  sL
 *  sQ
 *  sq
 *  vRa
 *  xP
 *  yp
 *  yra
 *  zP
 */
import java.util.ArrayList;

public final class Fr_1 {
    public CR j;
    private final sq[] J;
    public static final Fr A;
    public static final Fr I;

    static {
        sq[] sqArray = new sq[uqa.g];
        sqArray[uSa.E] = new UP().J(vRa.d != 0);
        sqArray[vRa.d] = new sQ().J(vRa.d != 0);
        I = new Fr_1(CR.HUD, sqArray);
        sq[] sqArray2 = new sq[vRa.d];
        sqArray2[uSa.E] = new fp().J(vRa.d != 0);
        A = new Fr_1(CR.SCREEN, sqArray2);
    }

    /*
     * WARNING - void declaration
     */
    public Fr_1(yl yl2) {
        void a2;
        Fr_1 fr_1 = this;
        fr_1.j = CR.HUD;
        ArrayList<Fr_1> arrayList = new ArrayList<Fr_1>(a2.getEntriesCount());
        for (Kk kk2 : a2.getEntriesList()) {
            Object object;
            Object b2 = null;
            switch (IQ.I[kk2.getType().ordinal()]) {
                case 1: {
                    object = b2 = new fp();
                    break;
                }
                case 2: {
                    object = b2 = new UP();
                    break;
                }
                case 3: {
                    object = b2 = new yp(Sp.fromProto((sL)kk2.getGuiType()).clazz);
                    break;
                }
                case 4: {
                    try {
                        object = b2 = new yp(Class.forName(kk2.getClassName()));
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        OT.b.warn(new StringBuilder().insert(2 & 5, Rua.w).append(kk2.getClassName()).append(yra.F).toString());
                        object = b2;
                    }
                    break;
                }
                case 5: {
                    object = b2 = new qp(kk2.getInventoryName());
                    break;
                }
                case 6: {
                    object = b2 = new sQ();
                    break;
                }
                case 7: {
                    object = b2 = new AP();
                    break;
                }
                case 8: {
                    object = b2 = new Lr();
                    break;
                }
                case 9: {
                    object = b2 = new cr();
                    break;
                }
                case 10: {
                    object = b2 = new kq(kk2.getKey());
                    break;
                }
                case 11: {
                    object = b2 = new zP(Jp.fromProto((FK)kk2.getEntityType()));
                    break;
                }
                case 12: {
                    object = b2 = new TO();
                    break;
                }
                case 13: {
                    object = b2 = new ZO(kk2.getElementId());
                    break;
                }
                case 14: {
                    object = b2 = new fP();
                    break;
                }
                case 15: {
                    object = b2 = new xp();
                    break;
                }
                case 16: {
                    object = b2 = new Sq();
                    break;
                }
                case 17: {
                    object = b2 = new jp(kk2.getElementId());
                    break;
                }
                case 18: {
                    object = b2 = new Dp(kk2.getElementId());
                    break;
                }
                case 19: {
                    object = b2 = new xP(kk2.getElementId());
                    break;
                }
                case 20: {
                    object = b2 = new JR(kk2.getKey());
                    break;
                }
                case 21: {
                    object = b2 = new LP((Fr)new Fr_1(kk2.getSub1()), (Fr)new Fr_1(kk2.getSub2()), vp.OR);
                    break;
                }
                case 22: {
                    b2 = new LP((Fr)new Fr_1(kk2.getSub1()), (Fr)new Fr_1(kk2.getSub2()), vp.AND);
                }
                default: {
                    object = b2;
                }
            }
            if (object == null) continue;
            ((sq)b2).I = kk2.getShow();
            arrayList.add((Fr_1)b2);
        }
        fr_1.J = arrayList.toArray(new sq[uSa.E]);
        if (a2.hasLayer()) {
            fr_1.j = CR.fromProto((Pl)a2.getLayer());
        }
    }

    /*
     * WARNING - void declaration
     */
    public Fr_1(CR cR, sq ... sqArray) {
        void b2;
        sq[] c2 = sqArray;
        sq[] a2 = this;
        a2.j = CR.HUD;
        a2.j = b2;
        a2.J = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, Bp bp) {
        boolean bl;
        int c2;
        Fr_1 fr_1 = this;
        int bl2 = uSa.E;
        sq[] sqArray = fr_1.J;
        int n2 = fr_1.J.length;
        int n3 = c2 = uSa.E;
        while (n3 < n2) {
            void a2;
            void b2;
            sq sq2 = sqArray[c2];
            if (sq2.J((Kpa)b2, (Bp)a2)) {
                bl = sq2.J();
            }
            n3 = ++c2;
        }
        return bl;
    }
}

