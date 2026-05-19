/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  Lra
 *  NTa
 *  Qsa
 *  Usa
 *  WSa
 *  ac
 *  fTa
 *  jpa
 *  lqa
 *  nQa
 *  pqa
 *  uKa
 *  vRa
 */
import java.io.IOException;
import java.net.URI;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class xna
extends EC {
    private static final Logger A = LogManager.getLogger();
    private static final ResourceLocation I = new ResourceLocation(sOa.Y);

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        xna xna2;
        xna xna3 = xna2 = this;
        xna3.i();
        reference var4_7 = (xna3.A - Lsa.L) / uqa.g + NTa.C;
        reference d2 = (xna3.I - UTa.R) / uqa.g + Yqa.i;
        xna3.L.J(oha.J(nqa.V, new Object[uSa.E]), (int)var4_7, (int)d2, BPa.p);
        d2 = d2 + lqa.s;
        Cia cia = xna2.g.z;
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = Cia.J((int)cia.jb.getKeyCode());
        objectArray[vRa.d] = Cia.J((int)cia.L.getKeyCode());
        objectArray[uqa.g] = Cia.J((int)cia.JA.getKeyCode());
        objectArray[yRa.d] = Cia.J((int)cia.gd.getKeyCode());
        xna2.L.J(oha.J(jpa.x, objectArray), (int)var4_7, (int)d2, ypa.U);
        xna2.L.J(oha.J(fTa.F, new Object[uSa.E]), (int)var4_7, (int)(d2 + lqa.s), ypa.U);
        Object[] objectArray2 = new Object[vRa.d];
        objectArray2[uSa.E] = Cia.J((int)cia.ta.getKeyCode());
        xna2.L.J(oha.J(nqa.fa, objectArray2), (int)var4_7, (int)(d2 + osa.c), ypa.U);
        Object[] objectArray3 = new Object[vRa.d];
        objectArray3[uSa.E] = Cia.J((int)cia.xc.getKeyCode());
        xna2.L.J(oha.J(Qra.u, objectArray3), (int)var4_7, (int)(d2 + Qsa.Ha), ypa.U);
        xna2.L.J(oha.J(xqa.fa, new Object[uSa.E]), (int)var4_7, (int)(d2 + WPa.L), gQa.P, BPa.p);
        super.J((int)c2, (int)b2, (float)a2);
    }

    public void A() {
        xna xna2;
        xna xna3 = xna2 = this;
        xna3.E.clear();
        int a2 = nQa.u;
        xna3.E.add(new ac(vRa.d, (int)(xna2.A / uqa.g - rQa.s), (int)(xna2.I / uqa.g + ITa.V + a2), WSa.o, kTa.j, oha.J(Lra.B, new Object[uSa.E])));
        xna2.E.add(new ac(uqa.g, (int)(xna2.A / uqa.g + uqa.g), (int)(xna2.I / uqa.g + ITa.V + a2), WSa.o, kTa.j, oha.J(ITa.d, new Object[uSa.E])));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(ac ac2) throws IOException {
        Object b22 = ac2;
        xna a2 = this;
        switch (((ac)b22).C) {
            case 1: {
                ((ac)b22).J = uSa.E;
                try {
                    b22 = Class.forName(Usa.e);
                    Object object = ((Class)b22).getMethod(csa.i, new Class[uSa.E]).invoke(null, new Object[uSa.E]);
                    Class[] classArray = new Class[vRa.d];
                    classArray[uSa.E] = URI.class;
                    Object[] objectArray = new Object[vRa.d];
                    objectArray[uSa.E] = new URI(Lsa.ia);
                    ((Class)b22).getMethod(ySa.l, classArray).invoke(object, objectArray);
                    return;
                }
                catch (Throwable b22) {
                    A.error(XOa.la, b22);
                    return;
                }
            }
            case 2: {
                a2.g.J((EC)null);
                a2.g.C();
                return;
            }
        }
    }

    public void l() {
        xna a2;
        super.l();
    }

    public xna() {
        xna a2;
    }

    public void i() {
        xna xna2;
        xna xna3 = xna2 = this;
        super.i();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        xna3.g.J().J(I);
        reference var1_3 = (xna3.A - Lsa.L) / uqa.g;
        reference a2 = (xna3.I - UTa.R) / uqa.g;
        xna3.f((int)var1_3, (int)a2, uSa.E, uSa.E, Lsa.L, UTa.R);
    }
}

