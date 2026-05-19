/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  JPa
 *  Le
 *  Oqa
 *  PF
 *  Xoa
 *  Zta
 *  ad
 *  jpa
 *  lE
 *  pua
 *  vB
 *  vRa
 */
import java.awt.Color;
import java.util.Iterator;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.EmojisConfiguration;

public final class sma_1
extends vB {
    private final eF J;
    private final String A;
    private static final EmojisConfiguration I = ConfigurationService.J(EmojisConfiguration.class);

    /*
     * WARNING - void declaration
     */
    public sma_1(String string, String string2) {
        int n2;
        void a22;
        char[] b2;
        sma_1 sma_12;
        sma_1 sma_13 = sma_12 = this;
        super(uSa.E, uSa.E, jpa.E, uSa.E, (Color)Bc.W.transparent(JPa.N), null);
        sma_12.J = new eF(Oqa.COLUMN, uua.p);
        sma_12.J.J(FRa.S);
        sma_13.J.f(vRa.d != 0);
        sma_13.J.J(uSa.E != 0);
        sma_13.A = b2;
        b2 = a22.toCharArray();
        int a22 = b2.length;
        int n3 = n2 = uSa.E;
        while (n3 < a22) {
            char c2 = b2[n2];
            int n4 = pua.o;
            if (I.J(c2) != null) {
                n4 = I.J(c2).J();
            }
            sma_12.J.f((ad)new XMa(c2, n4));
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        sma_1 a2;
        int c2 = n3;
        sma_1 sma_12 = a2 = this;
        sma_12.f((int)b2, c2);
        sma_12.k = FRa.S;
        sma_12.j = sma_12.J.J() + Zta.ba;
        sma_1 sma_13 = a2;
        Le.J((PF)PF.VIME_ART, (lE)lE.THIN, (int)hpa.Z).J(sma_13.A, (int)sma_13.I, (int)a2.J, Bc.Ba.getRGB(), uSa.E != 0);
        sma_12.J.C((double)a2.I);
        sma_12.J.l((double)(a2.J + Zta.ba));
        sma_12.J.J((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl2 = bl;
        sma_1 a2 = this;
        a2.J.J((int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Xoa xoa2) {
        sma_1 sma_12 = this;
        Iterator<ad> b2 = sma_12.J.f().iterator();
        Object object = b2;
        while (object.hasNext()) {
            void a2;
            ad ad2 = (ad)b2.next();
            if (!(ad2 instanceof XMa)) {
                object = b2;
                continue;
            }
            ((XMa)ad2).J((Xoa)a2);
            object = b2;
        }
    }
}

