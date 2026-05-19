/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  ERa
 *  Gl
 *  ID
 *  ISa
 *  JPa
 *  JQa
 *  KTa
 *  Kpa
 *  Lra
 *  MA
 *  Mda
 *  NTa
 *  Uf
 *  VEa
 *  Vua
 *  Waa
 *  XSa
 *  XTa
 *  Xd
 *  Xja
 *  Yea
 *  Ypa
 *  aD
 *  eAa
 *  eD
 *  fF
 *  fua
 *  jc
 *  kba
 *  kf
 *  kpa
 *  lqa
 *  mF
 *  nLa
 *  pPa
 *  pqa
 *  pua
 *  uKa
 *  vL
 *  vRa
 *  wd
 */
import com.google.common.collect.Maps;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector4f;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eD_3 {
    private String e;
    private mF G;
    public static final FloatBuffer D;
    private final Matrix4f f;
    private aD F;
    private kf g;
    private final Sx L;
    private MiniDotEmote E;
    private final Kpa m;
    private Waa C;
    private static final Map<String, ResourceLocation> i;
    private long M;
    public static final float[] k;
    private fF j;
    private int J;
    private sE A;
    private final Vector4f I;

    public void J(mF mF2) {
        eD_3 b2 = mF2;
        eD_3 a2 = this;
        a2.G = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void f(wd wd2) {
        eAa eAa2;
        void a2;
        eD_3 eD_32 = this;
        eD_3 b2 = eD_32.L.J(uEa.HEAD);
        if (!(b2 == null || a2 == null || (eAa2 = b2.J()) instanceof VEa && ((VEa)eAa2).J() == uEa.HEAD)) {
            uKa.e();
            eD_3 eD_33 = eD_32;
            eD_33.J((wd)a2);
            uKa.J((float)JPa.N, (float)rta.o, (float)JPa.N);
            uKa.J((float)Hra.Ga, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.l((float)Jpa.y, (float)Jpa.y, (float)Jpa.y);
            eD_33.m.J().J(eD_32.L, (Mda)b2, Xja.HEAD);
            uKa.D();
        }
    }

    public void C() {
        eD_3 a2;
        eD_3 eD_32 = a2;
        eD_32.f();
        if (eD_32.A != null) {
            eD_3 eD_33 = a2;
            eD_33.J();
            eD_33.A.f(a2.L);
        }
    }

    public void J(String string) {
        String b2 = string;
        eD_3 a2 = this;
        a2.e = b2;
    }

    public Vector4f J() {
        eD_3 a2;
        return a2.I;
    }

    private void l() {
        eD_3 a2;
        eD_3 eD_32 = a2;
        eD_32.J(XSa.D, uEa.HEAD);
        eD_32.J(DQa.n, uEa.CHEST);
        eD_32.J(KTa.b, uEa.LEGS);
        eD_32.J(Yua.ja, uEa.FEET);
    }

    public void J(Waa waa2) {
        eD_3 b2 = waa2;
        eD_3 a2 = this;
        a2.C = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, int n2, int n3, float f4, float f5, float f6) {
        void g2;
        void f72;
        void b2;
        void c2;
        void a22;
        void d22;
        void e22;
        eD_3 eD_32;
        eD_3 eD_33 = eD_32 = this;
        eD_33.f();
        if (eD_33.j == null || eD_32.j.J().isEmpty()) {
            return;
        }
        nLa.J();
        uKa.o();
        uKa.K();
        uKa.J();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        eD_3 eD_34 = eD_32;
        float h22 = eD_34.F.J();
        GL11.glPushMatrix();
        fua.J((float)((float)e22), (float)((float)d22), (float)vua.ha);
        fua.f((float)(a22 * h22), (float)(-a22 * h22), (float)(a22 * h22));
        XF e22 = eD_34.L.N;
        int d22 = eD_34.L.t;
        int a22 = eD_34.L.ha;
        boolean h22 = eD_34.L.C();
        Mda mda2 = eD_34.L.J();
        vL vL2 = eD_34.L.ja;
        Collection collection = eD_34.L.J();
        eD_3 eD_35 = eD_32;
        eD_35.L.ba = c2;
        eD_35.L.t = eD_35.L.ba;
        eD_34.L.ga = eD_35.L.ba;
        eD_32.L.h = b2;
        eD_32.L.N = eD_32.L.h;
        eD_3 eD_36 = eD_32;
        eD_3 eD_37 = eD_32;
        eD_37.L.ja = null;
        eD_37.L.ha = uSa.E;
        eD_37.L.U();
        eD_37.L.K.j[eD_32.L.K.J] = null;
        eD_36.L.J(uSa.E != 0);
        uKa.e();
        uKa.J((float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)f72, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)g2, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)JPa.N, (float)vqa.T, (float)JPa.N);
        eD_36.J((ID)eD_36.j.J().get(uSa.E), (float)c2, JPa.N);
        uKa.D();
        GL11.glPopMatrix();
        uKa.u();
        uKa.c();
        nLa.C();
        uKa.E();
        eD_3 eD_38 = eD_32;
        int n4 = d22;
        eD_32.L.ba = n4;
        eD_38.L.t = n4;
        eD_38.L.ga = n4;
        eD_32.L.N = e22;
        eD_32.L.h = eD_32.L.N;
        eD_32.L.J(h22);
        eD_32.L.ha = a22;
        if (vL2 != null) {
            eD_32.L.ja = vL2;
        }
        Iterator iterator = g2 = collection.iterator();
        while (iterator.hasNext()) {
            kba f72 = (kba)g2.next();
            iterator = g2;
            eD_32.L.J(f72);
        }
        if (mda2 != null) {
            eD_32.L.K.j[eD_32.L.K.J] = mda2;
        }
    }

    public void J(kf kf2) {
        eD_3 b2 = kf2;
        eD_3 a2 = this;
        a2.g = b2;
        if (a2.A != null) {
            a2.A.f((kf)b2);
        }
    }

    private void J(String string, uEa uEa2) {
        ResourceLocation a2;
        Object c2 = string;
        Object b2 = this;
        sf sf2 = (sf)((eD_3)b2).J().f().get(c2);
        if (sf2 == null) {
            return;
        }
        if (((eD_3)b2).C.J(zta.b, NTa.C) && ((eD_3)b2).C.J(zta.b).J((String)c2)) {
            return;
        }
        c2 = ((eD_3)b2).L.J((uEa)((Object)a2));
        if (c2 == null || !(c2.J() instanceof VEa)) {
            sf sf3 = sf2;
            sf3.J(uSa.E != 0);
            sf3.J(pua.o);
            return;
        }
        if ((a2 = ((eD_3)b2).J((Mda)c2, (uEa)((Object)a2), null)) == null) {
            sf sf4 = sf2;
            sf4.J(uSa.E != 0);
            sf4.J(pua.o);
            return;
        }
        VEa vEa2 = (VEa)c2.J();
        sf sf5 = sf2;
        sf5.J(vRa.d != 0);
        sf5.J(a2);
        sf5.J(pua.o);
        if (vEa2.f((Mda)c2) != pua.o) {
            sf2.J(vEa2.f((Mda)c2));
        }
    }

    public void J(wd wd2) {
        eD_3 b2 = wd2;
        eD_3 a2 = this;
        a2.J(b2.e());
    }

    public void J(long a2) {
        b.M = a2;
    }

    static {
        i = Maps.newHashMap();
        D = BufferUtils.createFloatBuffer(ERa.C);
        k = new float[ERa.C];
    }

    public Matrix4f J() {
        eD_3 a2;
        return a2.f;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Xd xd2, float f2, float f3) {
        void a2;
        void c2;
        eD_3 eD_32 = this;
        wd wd2 = (wd)c2.J().get(eD_32.F.f());
        if (wd2 != null) {
            void b2;
            eD_3 eD_33 = eD_32;
            float f4 = eD_33.L.ga + (eD_32.L.t - eD_32.L.ga) * a2;
            reference d2 = eD_33.L.h + (eD_32.L.N - eD_32.L.h) * a2;
            f4 = (b2 - f4) / Hra.Ga * pua.j;
            d2 = d2 / Hra.Ga * pua.j;
            wd wd3 = wd2;
            wd3.J((float)d2);
            wd3.C(f4);
        }
        if (eD_32.A != null) {
            eD_32.A.J((Xd)c2, (float)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private ResourceLocation J(Mda mda2, uEa uEa2, String string) {
        void a2;
        ResourceLocation c2;
        Object d2 = uEa2;
        eD_3 b2 = this;
        VEa vEa2 = (VEa)c2.J();
        d2 = new StringBuilder().insert(3 ^ 3, Vua.i).append(vEa2.J().getName()).append(JQa.B).append(d2 == uEa.LEGS ? uqa.g : vRa.d).append(a2 == null ? Mqa.y : new StringBuilder().insert(3 >> 2, IPa.W).append((String)a2).toString()).append(KPa.C).toString();
        c2 = i.get(d2);
        if (c2 == null) {
            c2 = new ResourceLocation((String)d2);
            i.put((String)d2, c2);
        }
        return c2;
    }

    public void f() {
        eD_3 eD_32 = this;
        if (eD_32.j != null) {
            return;
        }
        eD_3 a2 = jD.J().J(eD_32.e);
        if (a2 != null) {
            eD_3 eD_33 = eD_32;
            eD_33.j = a2;
            eD_33.G = jD.J().J(a2.J());
            eD_33.F.J(eD_32.G.J());
            eD_33.F.J(eD_32.C);
            eD_3 eD_34 = eD_32;
            eD_33.A = new sE((eD)eD_32);
            eD_33.A.f(eD_32.g);
            eD_33.M = eD_33.G.J();
        }
    }

    public void J() {
        eD_3 a2;
        eD_3 eD_32 = a2;
        eD_32.J += vRa.d;
        if (eD_32.J > NTa.C) {
            a2.J = uSa.E;
            if (a2.M < a2.G.J()) {
                a2.j = null;
                a2.f();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Xd xd2, float f2, float f3) {
        void a2;
        void b2;
        wd wd2;
        void c2;
        Iterator d2;
        eD_3 eD_32 = this;
        Iterator iterator = d2 = c2.J().iterator();
        while (iterator.hasNext()) {
            wd2 = (wd)d2.next();
            iterator = d2;
            wd2.f();
        }
        eD_32.f((Xd)c2, (float)b2, (float)a2);
        Iterator iterator2 = d2 = c2.J().iterator();
        while (iterator2.hasNext()) {
            wd2 = (wd)d2.next();
            iterator2 = d2;
            c2.k[wd2.J()] = wd2.l();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(ID iD2, float f2, float f3) {
        void a2;
        void b22;
        eD_3 c2;
        eD_3 d2 = iD2;
        eD_3 eD_32 = c2 = this;
        eD_32.l();
        d2 = d2.J();
        d2 = eD_32.A.J((Xd)d2);
        float f4 = pqa.r;
        if (eD_32.L.C()) {
            f4 = !c2.L.f((Sx)Kpa.J().c) ? VPa.i : JPa.N;
        }
        eD_3 eD_33 = c2;
        eD_33.J((Xd)d2, (float)b22, (float)a2);
        Iterator iterator = b22 = eD_33.j.J().iterator();
        while (iterator.hasNext()) {
            ID iD3 = (ID)b22.next();
            iterator = b22;
            ID iD4 = iD3;
            iD4.J((Xd)d2);
            iD4.J(f4);
            iD4.f();
        }
        uKa.o();
        eD_3 eD_34 = c2;
        boolean b22 = MA.f((Gl)eD_34.L, (float)a2);
        eD_34.j.J(c2.F.f());
        if (b22) {
            MA.C();
        }
        uKa.E();
        eD_3 eD_35 = d2;
        c2.J((Xd)eD_35);
        eD_3 eD_36 = c2;
        eD_36.f((wd)eD_35.J().get(eD_36.F.f()));
        if (c2.E != null && c2.g != null) {
            eD_3 eD_37 = c2;
            c2.J().J(c2.L, (Xd)d2, (eD)eD_37, (int)eD_37.J().J((float)a2), (float)a2);
        }
    }

    public mF J() {
        eD_3 a2;
        return a2.G;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Xd xd2) {
        eD_3 eD_32 = this;
        if (!eD_32.F.J()) {
            return;
        }
        eD_3 eD_33 = eD_32;
        float f2 = eD_33.F.l();
        Mda mda2 = eD_33.L.J();
        if (mda2 != null && eD_32.F.J() != null) {
            Object b2;
            Object object = b2 = eD_32.F.J().values().iterator();
            while (object.hasNext()) {
                void a2;
                Uf uf2 = (Uf)b2.next();
                object = b2;
                eD_32.J(mda2, (Xd)a2, uf2, Xja.THIRD_PERSON, f2);
            }
        }
    }

    public aD J() {
        eD_3 a2;
        return a2.F;
    }

    public Waa J() {
        eD_3 a2;
        return a2.C;
    }

    /*
     * WARNING - void declaration
     */
    private float J(float f2, float f3, float f4) {
        void a2;
        void c2;
        float d2 = f3;
        eD_3 b2 = this;
        float f5 = d2 = d2 - c2;
        while (f5 < xua.V) {
            f5 = d2 + CRa.ja;
        }
        float f6 = d2;
        while (f6 >= Hra.Ga) {
            f6 = d2 - CRa.ja;
        }
        return (float)(c2 + a2 * d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2) {
        eD_3 eD_32;
        void b2;
        void c2;
        void d222;
        vL vL2;
        void a2;
        eD_3 eD_33 = this;
        if (eD_33.j == null || eD_33.j.J().isEmpty()) {
            return;
        }
        if (eD_33.J() != null && eD_33.J() != null) {
            eD_33.J().J((float)eD_33.J().J());
        }
        uKa.m();
        uKa.K();
        uKa.B();
        uKa.o();
        uKa.f((int)Lra.k, (int)kpa.J);
        eD_3 eD_34 = eD_33;
        eD_3 eD_35 = eD_33;
        float e2 = eD_34.J(eD_34.L.Ma, eD_35.L.ba, (float)a2);
        if (eD_35.L.B() && (vL2 = eD_33.L.ja) instanceof Yea) {
            vL vL3 = vL2;
            e2 = eD_33.J(vL3.s, vL3.X, (float)a2);
            e2 += ISa.a;
        }
        eD_3 eD_36 = eD_33;
        float f3 = eD_36.F.f();
        GL11.glPushMatrix();
        fua.J((double)d222, (double)c2, (double)b2);
        boolean d222 = jc.J();
        float f4 = f3;
        fua.f((float)f4, (float)f4, (float)f4);
        if (eD_36.L.p()) {
            eD_3 eD_37 = eD_33;
            eD_32 = eD_37;
            uKa.J((float)eD_37.L.F(), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)zta.B, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        } else {
            fua.J((float)(Hra.Ga - (e2 - Hra.Ga)), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            eD_32 = eD_33;
        }
        eD_32.J((ID)eD_33.j.J().get(uSa.E), e2, (float)a2);
        if (d222) {
            jc.J();
        }
        GL11.glPopMatrix();
        uKa.h();
        uKa.E();
    }

    public void J(aD aD2) {
        eD_3 b2 = aD2;
        eD_3 a2 = this;
        a2.F = b2;
    }

    public fF J() {
        eD_3 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public void J(MiniDotEmote miniDotEmote, double d2, double d3, double d4, float f2) {
        void f3;
        void b2;
        void c2;
        void d5;
        void e2;
        eD_3 a2;
        float f4 = f2;
        eD_3 eD_32 = a2 = this;
        a2.J((MiniDotEmote)e2);
        eD_32.J((double)d5, (double)c2, (double)b2, (float)f3);
        eD_32.J((MiniDotEmote)null);
    }

    public void J(MiniDotEmote miniDotEmote) {
        MiniDotEmote b2 = miniDotEmote;
        eD_3 a2 = this;
        a2.E = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        eD_3 a2 = this;
        a2.J = b2;
    }

    public int J() {
        eD_3 a2;
        return a2.J;
    }

    public String J() {
        eD_3 a2;
        return a2.e;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Waa waa2) {
        void b2;
        eD_3 a2;
        eD_3 c2 = waa2;
        eD_3 eD_32 = a2 = this;
        eD_3 eD_33 = a2;
        eD_33.j = null;
        eD_33.A = null;
        eD_32.e = b2;
        eD_32.C = c2;
    }

    public sE J() {
        eD_3 a2;
        return a2.A;
    }

    public Kpa J() {
        eD_3 a2;
        return a2.m;
    }

    public MiniDotEmote J() {
        eD_3 a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public eD_3(Sx sx2, String string, Waa waa2) {
        void b2;
        void c2;
        eD_3 d2 = waa2;
        eD_3 a2 = this;
        eD_3 eD_32 = a2;
        a2.F = new aD();
        eD_32.I = new Vector4f();
        a2.f = new Matrix4f();
        a2.L = c2;
        a2.J((String)b2, (Waa)d2);
        a2.m = Kpa.J();
    }

    public kf J() {
        eD_3 a2;
        return a2.g;
    }

    public void J(fF fF2) {
        eD_3 b2 = fF2;
        eD_3 a2 = this;
        a2.j = b2;
    }

    public long J() {
        eD_3 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Xd xd2, Uf uf2, Xja xja2, float f2) {
        wd d2;
        void b22;
        eD_3 f3 = uf2;
        eD_3 c2 = this;
        int b22 = b22 == Xja.THIRD_PERSON ? vRa.d : uSa.E;
        if ((d2 = (wd)d2.J().get(f3.J())) != null) {
            void e2;
            eD_3 eD_32;
            void v0;
            void a2;
            uKa.e();
            c2.J(d2);
            uKa.J((float)f3.f(), (float)f3.J(), (float)f3.C());
            if (b22 != 0) {
                v0 = -a2;
                eD_32 = f3;
            } else {
                v0 = a2;
                eD_32 = f3;
            }
            uKa.l((float)(v0 * eD_32.M()), (float)(a2 * f3.e()), (float)(a2 * f3.d()));
            eD_3 eD_33 = f3;
            uKa.J((float)eD_33.A(), (float)pqa.r, (float)JPa.N, (float)JPa.N);
            uKa.J((float)eD_33.l(), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            uKa.J((float)eD_33.i(), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            c2.m.J().J(c2.L, (Mda)e2, Xja.THIRD_PERSON);
            uKa.D();
        }
    }

    public void J(Matrix4f matrix4f) {
        Matrix4f b2 = matrix4f;
        eD_3 a2 = this;
        eD_3.k[uSa.E] = b2.m00;
        eD_3.k[vRa.d] = b2.m10;
        eD_3.k[uqa.g] = b2.m20;
        eD_3.k[yRa.d] = b2.m30;
        eD_3.k[AQa.P] = b2.m01;
        eD_3.k[tTa.h] = b2.m11;
        eD_3.k[uua.p] = b2.m21;
        eD_3.k[XTa.W] = b2.m31;
        eD_3.k[Yqa.i] = b2.m02;
        eD_3.k[WOa.fa] = b2.m12;
        eD_3.k[NTa.C] = b2.m22;
        eD_3.k[pPa.f] = b2.m32;
        eD_3.k[lqa.s] = b2.m03;
        eD_3.k[uua.s] = b2.m13;
        eD_3.k[hpa.Z] = b2.m23;
        eD_3.k[Ypa.A] = b2.m33;
        D.clear();
        D.put(k);
        D.flip();
        GL11.glMultMatrix(D);
    }
}

