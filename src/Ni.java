/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EH
 *  EO
 *  Kl
 *  Ko
 *  Kpa
 *  Ri
 *  SH
 *  UG
 *  YQ
 *  asa
 *  bq
 *  iq
 *  nH
 *  pP
 *  pqa
 *  pua
 *  qh
 *  tG
 *  vL
 *  vRa
 *  yN
 *  zy
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ni {
    private static final long i = 0L;
    private long M;
    public static final Set<Integer> k;
    private static final OX<EH> j;
    private bq J;
    private final Kpa A;
    private long I;

    public static void J(int n2, EH eH) {
        EH b2 = eH;
        int a2 = n2;
        j.J(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(EO eO) {
        Ni b2;
        void a2;
        Ni ni = this;
        int n2 = a2.getId();
        EH eH = j.J(n2);
        if (eH == null) {
            return;
        }
        pP pP2 = eH.C;
        if (pP2 == null) {
            if (a2.getActionCase() == aM.PLAYANIMATION) {
                Ni ni2;
                float f2;
                Ni ni3;
                boolean bl;
                if (EH.J((EH)eH) == null) {
                    EH.J((EH)eH, new ArrayList());
                }
                b2 = a2.getPlayAnimation();
                List list = EH.J((EH)eH);
                String string = b2.getAnimationId();
                if (b2.hasLooped() && b2.getLooped()) {
                    bl = vRa.d;
                    ni3 = b2;
                } else {
                    bl = uSa.E;
                    ni3 = b2;
                }
                if (ni3.hasSpeed()) {
                    f2 = b2.getSpeed();
                    ni2 = b2;
                } else {
                    f2 = pqa.r;
                    ni2 = b2;
                }
                list.add(new gI(string, bl, f2, (ni2.hasForce() && b2.getForce() ? vRa.d : uSa.E) != 0));
            }
            return;
        }
        switch (tG.I[a2.getActionCase().ordinal()]) {
            case 1: {
                while (false) {
                }
                pP2.J();
                return;
            }
            case 2: {
                Ni ni4;
                float f3;
                Ni ni5;
                boolean bl;
                b2 = a2.getPlayAnimation();
                String string = b2.getAnimationId();
                if (b2.hasLooped() && b2.getLooped()) {
                    bl = vRa.d;
                    ni5 = b2;
                } else {
                    bl = uSa.E;
                    ni5 = b2;
                }
                if (ni5.hasSpeed()) {
                    f3 = b2.getSpeed();
                    ni4 = b2;
                } else {
                    f3 = pqa.r;
                    ni4 = b2;
                }
                pP2.J(string, bl, f3, (ni4.hasForce() && b2.getForce() ? vRa.d : uSa.E) != 0);
                return;
            }
            default: {
                return;
            }
        }
    }

    public static int J(vL vL2) {
        vL vL3 = vL2;
        vL a2 = j.J(vL3.M());
        if (a2 != null) {
            return a2.M;
        }
        return pua.o;
    }

    public static pP J(vL vL2) {
        vL vL3 = vL2;
        vL a2 = j.J(vL3.M());
        if (a2 == null) {
            return null;
        }
        return a2.C;
    }

    static {
        j = new OX();
        k = new HashSet<Integer>();
    }

    public static boolean f(vL vL2) {
        vL vL3 = vL2;
        vL a2 = j.J(vL3.M());
        if (a2 == null || a2.E.isEmpty() || a2.E.contains(Kpa.J().z.ld)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean J(vL vL2) {
        vL vL3 = vL2;
        vL a2 = j.J(vL3.M());
        if (a2 != null && a2.k) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Ni(Kpa kpa2) {
        Ni b2 = kpa2;
        Ni a2 = this;
        a2.I = OT.e;
        a2.A = b2;
        a2.l();
    }

    private void l() {
        Ni a2;
        if (a2.J != null) {
            a2.J.J();
        }
        a2.J = new bq(OT.i.g);
    }

    public void f() {
        Object a2;
        Ni ni = this;
        if (OT.e - ni.I > kra.ja) {
            ni.I = OT.e;
            ni.J.f();
        }
        Object object = a2 = ni.J.J().iterator();
        while (object.hasNext()) {
            ((iq)a2.next()).f();
            object = a2;
        }
    }

    public bq J() {
        Ni a2;
        return a2.J;
    }

    public static /* synthetic */ void J(zy a2) {
        ((EH)a2.J()).J();
    }

    public static /* synthetic */ String J(Ni ni, int n2) {
        int b2 = n2;
        Ni a2 = ni;
        String string = new StringBuilder().insert(2 & 5, rRa.J).append(b2).append(asa.y).toString();
        if (a2.A.Ta != null && (b2 = a2.A.Ta.J(b2)) != null) {
            string = new StringBuilder().insert(5 >> 3, string).append(DPa.X).append((int)b2.la).append(TOa.n).append((int)b2.Z).append(TOa.n).append((int)b2.A).toString();
        }
        return string;
    }

    public static /* synthetic */ void J(EH eH, YQ yQ) {
        Iterator a2;
        EH eH2 = eH;
        if (eH2.C == null || eH2.C.J() != a2) {
            if (eH2.C != null) {
                eH2.C.l();
            }
            eH2.C = new pP(eH2.A, (YQ)a2);
        }
        if (EH.J((EH)eH2) != null) {
            Iterator iterator = a2 = EH.J((EH)eH2).iterator();
            while (iterator.hasNext()) {
                Object b2 = (gI)a2.next();
                iterator = a2;
                eH2.C.J(gI.J((gI)b2), gI.f((gI)b2), gI.J((gI)b2), gI.J((gI)b2));
            }
            EH.J((EH)eH2, null);
        }
    }

    public static float J(vL vL2) {
        vL vL3 = vL2;
        vL a2 = j.J(vL3.M());
        if (a2 == null) {
            return pqa.r;
        }
        return a2.g;
    }

    public void J() {
        Ni a2;
        j.J(AI.J());
        j.J();
        k.clear();
        a2.l();
    }

    public void J(int n2) {
        int b22 = n2;
        Ni a2 = this;
        if (a2.A.Ta == null) {
            return;
        }
        vL b22 = a2.A.Ta.J(b22);
        if (b22 == null) {
            return;
        }
        b22.e();
    }

    public static EH J(vL a2) {
        return j.J(a2.M());
    }

    /*
     * Unable to fully structure code
     */
    public void J(aO var1_1) {
        var3_2 = this;
        v0 = a;
        var2_3 = v0.getId();
        if (v0.hasClear() && a.getClear()) {
            b = Ni.j.f(var2_3);
            if (b != null) {
                b.J();
                var3_2.J(var2_3);
            }
            return;
        }
        b = a.getOptions();
        a = Ni.j.J(var2_3);
        if (a == null) {
            a = new EH();
            new EH().A = var2_3;
            Ni.j.J(var2_3, a);
        }
        EH.J((EH)a, (long)OT.e);
        if (b.hasColor()) {
            a.M = b.getColor();
        }
        if (b.hasWidth() && b.hasHeight()) {
            v1 = a;
            v1.m = new Ri(b.getWidth(), b.getHeight());
            var3_2.J(var2_3);
        }
        if (b.hasScale()) {
            a.g = b.getScale();
            var3_2.J(var2_3);
        }
        if (b.hasHurtDeathAnimationDisabled()) {
            a.k = b.getHurtDeathAnimationDisabled();
        }
        if (!b.hasAlwaysRender()) ** GOTO lbl39
        if (b.getAlwaysRender()) {
            Ni.k.add(var2_3);
            v2 = a;
        } else {
            Ni.k.remove(var2_3);
lbl39:
            // 2 sources

            v2 = a;
        }
        v2.E = new HashSet<E>(b.getAllowedPerspectivesList());
        if (b.getTextureCase() == yN.TEXTURE_NOT_SET) ** GOTO lbl49
        if (!(b.hasTexturePath() != false ? (var4_5 = b.getTexturePath()) : (var4_5 = OT.i.C.J(b.getTextureResource()))).isEmpty()) {
            var5_6 = new qh((String)var4_5);
            v3 = b;
            var5_6.J = vRa.d;
            a.J = OT.i.g.J(var5_6, SH.J((Ni)var3_2, (int)var2_3));
        } else {
            a.J = null;
lbl49:
            // 2 sources

            v3 = b;
        }
        if (v3.hasModelOffset()) {
            var4_5 = b.getModelOffset();
            v4 = a;
            v5 = var4_5;
            a.j = v5.getX();
            v4.i = v5.getY();
            v4.L = var4_5.getZ();
        }
        if (b.getModelCase() != Ko.MODEL_NOT_SET && !(b.hasModelPath() != false ? (var4_5 = b.getModelPath()) : (var4_5 = OT.i.C.J(b.getModelResource()))).isEmpty() && (var5_6 = OT.i.C.J((String)var4_5)) != null) {
            var2_4 = a;
            var3_2.J.J((Kl)var5_6, nH.J((EH)var2_4));
        }
        if (b.hasDisableRender()) {
            a.F = b.getDisableRender();
        }
    }

    public static UG J(vL vL2) {
        vL vL3 = vL2;
        vL a2 = j.J(vL3.M());
        if (a2 == null) {
            return null;
        }
        return a2.J;
    }

    public static /* synthetic */ boolean J(Ni ni, zy zy2) {
        Ni b2 = zy2;
        Ni a2 = ni;
        if (a2.A.Ta.J(b2.J()) != null) {
            EH.J((EH)((EH)b2.J()), (long)OT.e);
        } else if (OT.e - EH.J((EH)((EH)b2.J())) > nqa.i) {
            ((EH)b2.J()).J();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

