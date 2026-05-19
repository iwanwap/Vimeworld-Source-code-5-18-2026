/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Bb
 *  Bsa
 *  ERa
 *  Ega
 *  Gg
 *  HA
 *  JPa
 *  JQa
 *  Kpa
 *  Mda
 *  NTa
 *  Rba
 *  Woa
 *  XTa
 *  kPa
 *  kea
 *  lPa
 *  lqa
 *  pqa
 *  pua
 *  uKa
 *  vRa
 *  wOa
 *  wra
 */
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;

public final class yma_3
extends Ama
implements Bb {
    private static final ResourceLocation k = new ResourceLocation(kPa.Y);
    private rda J;
    private Woa A;
    private kea I;

    public void A() {
        yma_3 yma_32;
        yma_3 yma_33 = yma_32 = this;
        super.A();
        Keyboard.enableRepeatEvents(vRa.d != 0);
        yma_3 yma_34 = yma_32;
        reference var1_3 = (yma_33.A - yma_34.j) / uqa.g;
        reference a2 = (yma_34.I - yma_32.F) / uqa.g;
        yma_3 yma_35 = yma_32;
        yma_33.A = new Woa(uSa.E, yma_32.L, (int)(var1_3 + ITa.V), (int)(a2 + osa.c), Bsa.E, lqa.s);
        yma_33.A.C(pua.o);
        yma_33.A.e(pua.o);
        yma_33.A.J(uSa.E != 0);
        yma_33.A.M(Fsa.d);
        yma_33.I.J((Bb)yma_32);
        yma_33.I.f((Bb)yma_32);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Ega ega2, int n2, Mda mda2) {
        void b2;
        yma_3 d2 = mda2;
        yma_3 a2 = this;
        if (b2 == false) {
            a2.A.f(d2 == null ? Mqa.y : d2.J());
            a2.A.d((d2 != null ? vRa.d : uSa.E) != 0);
            if (d2 != null) {
                a2.J();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        yma_3 a2;
        float d2 = f2;
        yma_3 yma_32 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        uKa.L();
        uKa.k();
        yma_32.A.J();
    }

    private void J() {
        yma_3 yma_32;
        yma_3 yma_33 = yma_32 = this;
        Object a2 = yma_33.A.f();
        sEa sEa2 = yma_33.J.J(uSa.E);
        if (sEa2 != null && sEa2.J() && !sEa2.J().l() && ((String)a2).equals(sEa2.J().J())) {
            a2 = Mqa.y;
        }
        yma_3 yma_34 = yma_32;
        yma_34.J.J((String)a2);
        yma_34.g.c.F.J((KC)new Rba(nua.i, new Lca(Unpooled.buffer()).writeString((String)a2)));
    }

    /*
     * WARNING - void declaration
     */
    public yma_3(kea kea2, Gg gg2) {
        void a2;
        yma_3 b2;
        yma_3 c2 = kea2;
        yma_3 yma_32 = b2 = this;
        yma_3 yma_33 = b2;
        yma_3 yma_34 = b2;
        super((Ega)new rda((kea)c2, (Gg)a2, (Sx)Kpa.J().c));
        yma_32.I = c2;
        yma_32.J = (rda)yma_33.I;
    }

    public void M() {
        yma_3 a2;
        yma_3 yma_32 = a2;
        super.M();
        Keyboard.enableRepeatEvents(uSa.E != 0);
        yma_32.I.J((Bb)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        yma_3 a2;
        int d2 = n4;
        yma_3 yma_32 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        yma_32.A.J((int)c2, (int)b2, d2);
    }

    public void J(float f2, int n2, int n3) {
        Object d2 = n2;
        yma_3 b2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        yma_3 yma_32 = b2;
        yma_32.g.J().J(k);
        yma_3 yma_33 = b2;
        reference c2 = (yma_32.A - yma_33.j) / uqa.g;
        d2 = (yma_33.I - b2.F) / uqa.g;
        yma_3 yma_34 = b2;
        yma_32.f((int)c2, (int)d2, uSa.E, uSa.E, yma_34.j, yma_34.F);
        yma_3 yma_35 = b2;
        yma_32.f((int)(c2 + lPa.p), d2 + kTa.j, uSa.E, yma_35.F + (yma_35.J.J(uSa.E).J() ? uSa.E : ERa.C), Iqa.M, ERa.C);
        if ((b2.J.J(uSa.E).J() || b2.J.J(vRa.d).J()) && !b2.J.J(uqa.g).J()) {
            yma_3 yma_36 = b2;
            yma_36.f((int)(c2 + zOa.v), d2 + wra.e, yma_36.j, uSa.E, EPa.O, wOa.h);
        }
    }

    public void J(Ega ega2, HA object) {
        yma_3 c2 = object;
        object = this;
    }

    public void J(int n2, int n3) {
        yma_3 yma_32 = this;
        uKa.L();
        uKa.k();
        yma_32.L.J(oha.J(vua.r, new Object[uSa.E]), Psa.M, uua.p, tpa.i);
        if (yma_32.J.j > 0) {
            int n4;
            int b2 = JQa.c;
            int a2 = vRa.d;
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = yma_32.J.j;
            String string = oha.J(lqa.v, objectArray);
            if (yma_32.J.j >= wra.P && !yma_32.g.c.h.f()) {
                string = oha.J(yta.z, new Object[uSa.E]);
                b2 = BPa.g;
                n4 = a2;
            } else if (!yma_32.J.J(uqa.g).J()) {
                n4 = a2 = uSa.E;
            } else {
                if (!yma_32.J.J(uqa.g).J(yma_32.I.k)) {
                    b2 = BPa.g;
                }
                n4 = a2;
            }
            if (n4 != 0) {
                yma_3 yma_33;
                a2 = gsa.X | (b2 & sOa.fa) >> uqa.g | b2 & gsa.X;
                yma_3 yma_34 = yma_32;
                int n5 = yma_32.j - Yqa.i - yma_34.L.J(string);
                int c2 = Vra.b;
                if (yma_34.L.f()) {
                    yma_3.J((int)(n5 - yRa.d), (int)(c2 - uqa.g), (int)(yma_32.j - XTa.W), (int)(c2 + NTa.C), (int)gsa.X);
                    yma_3.J((int)(n5 - uqa.g), (int)(c2 - vRa.d), (int)(yma_32.j - Yqa.i), (int)(c2 + WOa.fa), (int)JPa.s);
                    yma_33 = yma_32;
                } else {
                    yma_3 yma_35 = yma_32;
                    yma_33 = yma_35;
                    yma_35.L.J(string, n5, c2 + vRa.d, a2);
                    yma_32.L.J(string, n5 + vRa.d, c2, a2);
                    yma_32.L.J(string, n5 + vRa.d, c2 + vRa.d, a2);
                }
                yma_33.L.J(string, n5, c2, b2);
            }
        }
        uKa.P();
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        yma_3 a2 = this;
        if (a2.A.J((char)b2, c3)) {
            a2.J();
            return;
        }
        super.J((char)b2, c3);
    }

    public void J(Ega ega2, List<Mda> list) {
        yma_3 c2 = ega2;
        yma_3 b2 = this;
        yma_3 yma_32 = c2;
        b2.J((Ega)yma_32, uSa.E, yma_32.J(uSa.E).J());
    }

    public void J(Ega ega2, int n2, int n3) {
        int d2 = n3;
        yma_3 yma_32 = this;
    }
}

