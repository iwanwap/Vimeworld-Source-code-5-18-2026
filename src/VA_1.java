/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Cia
 *  FPa
 *  Le
 *  PF
 *  VA
 *  bqa
 *  if
 *  ob
 *  pqa
 *  uKa
 *  uRa
 *  vB
 */
import java.awt.Color;

public final class VA_1
extends vB {
    private final ob A;
    private static VA I = null;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        VA_1 a2 = this;
        if (b2 == false && e2 != false) {
            VA_1.J((VA)a2);
        }
    }

    public VA_1(ob ob2) {
        VA_1 b2 = ob2;
        VA_1 a2 = this;
        super(uSa.E, uSa.E, tua.i, kTa.j, (Color)Bc.Ja, null);
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        int c22 = n2;
        VA_1 b2 = this;
        uKa.B();
        b2.j = (b2.A != false ? (I == b2 ? Bc.Za : Bc.Ga) : (I == b2 ? Bc.Ga : Bc.Ja)).transparent(WF.J());
        super.J(c22, (int)a2);
        uKa.B();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)WF.J());
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(KPa.n, (int)(b2.I + hpa.y), (int)(b2.J + FPa.T), (I == b2 ? Bc.Ba : Bc.qa).transparent(WF.J()).getRGB(), uSa.E != 0);
        String c22 = WF.d.get(OT.i.B.voiceChatKeyBind);
        if (c22 == null) {
            c22 = Cia.J((int)OT.i.B.voiceChatKeyBind);
        }
        if.J((String)c22, (double)(b2.I + b2.k - bqa.E), (double)(b2.J + uRa.I), (float)pqa.r, (float)WF.J(), uSa.E != 0);
    }

    public static void J(VA a2) {
        I = a2;
    }

    public static VA J() {
        return I;
    }
}

