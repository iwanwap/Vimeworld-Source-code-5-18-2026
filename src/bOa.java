/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  ERa
 *  LQa
 *  NOa
 *  NQa
 *  Qta
 *  Rba
 *  SOa
 *  Spa
 *  Vua
 *  Woa
 *  Ysa
 *  ac
 *  caa
 *  cra
 *  hra
 *  jRa
 *  ld
 *  lqa
 *  pua
 *  uRa
 *  vRa
 *  vpa
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public final class bOa
extends EC {
    private ac C;
    private Woa i;
    private Woa M;
    private boolean k;
    private static final Logger j = LogManager.getLogger();
    private final caa J;
    private ac A;
    private ac I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        bOa a2;
        int d2 = n4;
        bOa bOa2 = a2 = this;
        super.J((int)c2, (int)b2, d2);
        bOa2.i.J((int)c2, (int)b2, d2);
        bOa2.M.J((int)c2, (int)b2, d2);
    }

    public void A() {
        bOa a2;
        Keyboard.enableRepeatEvents(vRa.d != 0);
        bOa bOa2 = a2;
        bOa2.E.clear();
        a2.C = new ac(uSa.E, (int)(a2.A / uqa.g - AQa.P - Jpa.Ha), (int)(a2.I / AQa.P + sOa.D + lqa.s), Jpa.Ha, kTa.j, oha.J(cra.g, new Object[uSa.E]));
        bOa2.E.add(a2.C);
        a2.I = new ac(vRa.d, (int)(a2.A / uqa.g + AQa.P), (int)(a2.I / AQa.P + sOa.D + lqa.s), Jpa.Ha, kTa.j, oha.J(SOa.l, new Object[uSa.E]));
        a2.E.add(a2.I);
        a2.A = new ac(AQa.P, (int)(a2.A / uqa.g + Jpa.Ha - kTa.j), Jpa.Ha, kTa.j, kTa.j, zOa.p);
        a2.E.add(a2.A);
        bOa bOa3 = a2;
        bOa bOa4 = a2;
        bOa3.i = new Woa(uqa.g, bOa4.L, (int)(bOa4.A / uqa.g - Jpa.Ha), vpa.o, vpa.Ja, kTa.j);
        bOa3.i.M(BQa.h);
        bOa3.i.l(vRa.d != 0);
        bOa3.i.f(a2.J.f());
        bOa bOa5 = a2;
        bOa3.M = new Woa(yRa.d, bOa5.L, (int)(bOa5.A / uqa.g - Jpa.Ha), Jpa.Ha, Qta.Da, kTa.j);
        bOa3.M.M(BQa.h);
        bOa3.M.d(uSa.E != 0);
        bOa3.M.f(Vua.m);
        bOa3.k = bOa3.J.J();
        bOa3.J();
        a2.C.J = a2.i.f().trim().length() > 0 ? vRa.d : uSa.E;
    }

    public bOa(caa caa2) {
        bOa b2 = caa2;
        bOa a2 = this;
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        bOa a2;
        int c3 = n2;
        bOa bOa2 = a2 = this;
        a2.i.J((char)b2, c3);
        bOa2.M.J((char)b2, c3);
        bOa2.C.J = a2.i.f().trim().length() > 0 ? vRa.d : uSa.E;
        int n3 = bOa2.C.J ? 1 : 0;
        if (c3 != EPa.O && c3 != yRa.r) {
            if (c3 == vRa.d) {
                bOa bOa3 = a2;
                bOa3.J(bOa3.I);
                return;
            }
        } else {
            bOa bOa4 = a2;
            bOa4.J(bOa4.C);
        }
    }

    public void l() {
        bOa a2;
        a2.i.C();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        bOa bOa2 = this;
        bOa2.i();
        bOa.J((String)oha.J(NQa.g, new Object[uSa.E]), (int)(bOa2.A / uqa.g), (int)kTa.j, (int)pua.o);
        bOa.f((String)oha.J(NOa.j, new Object[uSa.E]), (int)(bOa2.A / uqa.g - Jpa.Ha), (int)LQa.c, (int)xra.R);
        bOa2.i.J();
        int d2 = jRa.X;
        int n4 = uSa.E;
        bOa.f((String)oha.J(oua.Q, new Object[uSa.E]), (int)(bOa2.A / uqa.g - Jpa.Ha), (int)(d2 + n4++ * bOa2.L.u), (int)xra.R);
        bOa.f((String)oha.J(Spa.D, new Object[uSa.E]), (int)(bOa2.A / uqa.g - Jpa.Ha), (int)(d2 + n4++ * bOa2.L.u), (int)xra.R);
        bOa.f((String)oha.J(Ysa.c, new Object[uSa.E]), (int)(bOa2.A / uqa.g - Jpa.Ha), (int)(d2 + n4++ * bOa2.L.u), (int)xra.R);
        bOa.f((String)oha.J(pua.ga, new Object[uSa.E]), (int)(bOa2.A / uqa.g - Jpa.Ha), (int)(d2 + n4++ * bOa2.L.u), (int)xra.R);
        bOa bOa3 = bOa2;
        bOa.f((String)Mqa.y, (int)(bOa3.A / uqa.g - Jpa.Ha), (int)(d2 + n4++ * bOa2.L.u), (int)xra.R);
        if (bOa3.M.f().length() > 0) {
            d2 = d2 + n4 * bOa2.L.u + ERa.C;
            bOa.f((String)oha.J(hra.Ha, new Object[uSa.E]), (int)(bOa2.A / uqa.g - Jpa.Ha), (int)d2, (int)xra.R);
            bOa2.M.J();
        }
        super.J((int)c2, (int)b2, (float)a2);
    }

    private void J() {
        bOa a2;
        if (a2.J.J()) {
            a2.A.i = zOa.p;
            if (a2.J.f() != null) {
                bOa bOa2 = a2;
                bOa2.M.f(bOa2.J.f().f());
                return;
            }
        } else {
            a2.A.i = DPa.ba;
            a2.M.f(Vua.m);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(ac ac2) throws IOException {
        void a2;
        bOa bOa2 = this;
        if (a2.J) {
            if (a2.C == vRa.d) {
                bOa bOa3 = bOa2;
                bOa2.J.J(bOa3.k);
                bOa3.g.J((EC)null);
                return;
            }
            if (a2.C == 0) {
                Lca b2 = new Lca(Unpooled.buffer());
                bOa bOa4 = bOa2;
                b2.writeByte(bOa2.J.J());
                bOa2.J.J((ByteBuf)b2);
                b2.writeString(bOa4.i.f());
                b2.writeBoolean(bOa2.J.J());
                bOa2.g.J().J((KC)new Rba(uRa.ca, b2));
                if (!bOa4.J.J()) {
                    bOa2.J.f((ld)null);
                }
                bOa2.g.J((EC)null);
                return;
            }
            if (a2.C == AQa.P) {
                bOa bOa5 = bOa2;
                bOa5.J.J((!bOa5.J.J() ? vRa.d : uSa.E) != 0);
                bOa2.J();
            }
        }
    }

    public void M() {
        Keyboard.enableRepeatEvents(uSa.E != 0);
    }
}

