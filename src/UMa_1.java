/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  We
 *  XTa
 *  ZOa
 *  ac
 *  cra
 *  pua
 *  vRa
 *  zf
 */
import java.io.IOException;

public final class UMa_1
extends EC {
    private static final Fha[] j;
    private final Cia J;
    private String A;
    private final EC I;

    static {
        Fha[] fhaArray = new Fha[WOa.fa];
        fhaArray[uSa.E] = Fha.CHAT_VISIBILITY;
        fhaArray[vRa.d] = Fha.CHAT_LINKS;
        fhaArray[uqa.g] = Fha.CHAT_OPACITY;
        fhaArray[yRa.d] = Fha.CHAT_LINKS_PROMPT;
        fhaArray[AQa.P] = Fha.CHAT_SCALE;
        fhaArray[tTa.h] = Fha.CHAT_HEIGHT_FOCUSED;
        fhaArray[uua.p] = Fha.CHAT_HEIGHT_UNFOCUSED;
        fhaArray[XTa.W] = Fha.CHAT_WIDTH;
        fhaArray[Yqa.i] = Fha.REDUCED_DEBUG_INFO;
        j = fhaArray;
    }

    public void A() {
        int n2;
        UMa_1 uMa_1 = this;
        int n3 = uSa.E;
        uMa_1.A = oha.J(qQa.Ga, new Object[uSa.E]);
        Fha[] fhaArray = j;
        int n4 = j.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            Object a2 = fhaArray[n2];
            if (((Fha)((Object)a2)).getEnumFloat()) {
                uMa_1.E.add(new We(((Fha)((Object)a2)).returnEnumOrdinal(), (int)(uMa_1.A / uqa.g - BQa.Q + n3 % uqa.g * rRa.f), (int)(uMa_1.I / uua.p + osa.c * (n3 >> vRa.d)), (Fha)((Object)a2)));
            } else {
                UMa_1 uMa_12 = a2;
                uMa_1.E.add(new zf(((Fha)((Object)a2)).returnEnumOrdinal(), (int)(uMa_1.A / uqa.g - BQa.Q + n3 % uqa.g * rRa.f), (int)(uMa_1.I / uua.p + osa.c * (n3 >> vRa.d)), (Fha)((Object)uMa_12), uMa_1.J.J((Fha)((Object)uMa_12))));
            }
            ++n3;
            n5 = ++n2;
        }
        uMa_1.E.add(new ac(ZOa.x, (int)(uMa_1.A / uqa.g - ySa.T), (int)(uMa_1.I / uua.p + sOa.D), oha.J(cra.g, new Object[uSa.E])));
    }

    public void J(ac ac2) throws IOException {
        UMa_1 b2 = ac2;
        UMa_1 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C < ySa.T && b2 instanceof zf) {
                a2.J.f(((zf)b2).f(), vRa.d);
                ((ac)b2).i = a2.J.J(Fha.getEnumOptions(((ac)b2).C));
            }
            if (((ac)b2).C == ZOa.x) {
                UMa_1 uMa_1 = a2;
                uMa_1.g.z.d();
                uMa_1.g.J(a2.I);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public UMa_1(EC eC2, Cia cia) {
        void b2;
        UMa_1 a2;
        UMa_1 c2 = cia;
        UMa_1 uMa_1 = a2 = this;
        uMa_1.I = b2;
        uMa_1.J = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        UMa_1 a2;
        float d2 = f2;
        UMa_1 uMa_1 = a2 = this;
        a2.i();
        UMa_1.J((String)uMa_1.A, (int)(a2.A / uqa.g), (int)kTa.j, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }
}

