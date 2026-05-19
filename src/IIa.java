/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eha
 *  FIa
 *  JTa
 *  Kpa
 *  U
 *  XTa
 *  ZRa
 *  aKa
 *  aSa
 *  gHa
 *  mka
 *  oqa
 *  pKa
 *  pqa
 *  uKa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import org.lwjgl.util.vector.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IIa {
    private Matrix4f C;
    public final gHa i;
    private final FIa M;
    private final List<String> k;
    public final gHa j;
    private final List<Object> J;
    private final List<Integer> A;
    private final List<Integer> I;

    /*
     * WARNING - void declaration
     */
    public IIa(U u2, String string, gHa gHa2, gHa gHa3) throws Eha, IOException {
        IIa e2;
        void b2;
        void c2;
        void d2;
        IIa a2;
        IIa iIa = iIa2;
        IIa iIa2 = gHa3;
        IIa iIa3 = a2 = iIa;
        a2.J = Lists.newArrayList();
        a2.k = Lists.newArrayList();
        a2.A = Lists.newArrayList();
        a2.I = Lists.newArrayList();
        IIa iIa4 = a2;
        a2.M = new FIa((U)d2, (String)c2);
        iIa3.j = b2;
        iIa3.i = e2;
    }

    public void f() {
        IIa a2;
        a2.M.C();
    }

    public FIa J() {
        IIa a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, Object object, int n2, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        IIa a2;
        int n4 = n3;
        IIa iIa = a2 = this;
        IIa iIa2 = a2;
        iIa.k.add(iIa2.k.size(), (String)d2);
        iIa.J.add(a2.J.size(), c2);
        iIa2.A.add(a2.A.size(), (int)b2);
        iIa.I.add(a2.I.size(), (int)e2);
    }

    private void J() {
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.k();
        uKa.u();
        uKa.c();
        uKa.I();
        uKa.L();
        uKa.C();
        uKa.H();
        uKa.C((int)uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        void a232;
        int b232;
        IIa iIa;
        IIa iIa2 = iIa = this;
        iIa2.J();
        iIa2.j.f();
        float f3 = iIa2.i.C;
        float f4 = iIa2.i.m;
        uKa.f((int)uSa.E, (int)uSa.E, (int)((int)f3), (int)((int)f4));
        iIa2.M.J(Yqa.S, (Object)iIa.j);
        int n2 = b232 = uSa.E;
        while (n2 < iIa.J.size()) {
            IIa iIa3 = iIa;
            iIa3.M.J(iIa3.k.get(b232), iIa.J.get(b232));
            iIa.M.f(new StringBuilder().insert(3 ^ 3, Cqa.L).append(b232).toString()).J((float)iIa.A.get(b232).intValue(), (float)iIa.I.get(++b232).intValue());
            n2 = b232;
        }
        IIa iIa4 = iIa;
        IIa iIa5 = iIa;
        iIa4.M.f(ZRa.Q).J(iIa5.C);
        iIa4.M.f(opa.c).J((float)iIa.j.C, (float)iIa.j.m);
        iIa5.M.f(oqa.k).J(f3, f4);
        iIa4.M.f(JTa.m).J((float)a232);
        Kpa b232 = Kpa.J();
        iIa4.M.f(uqa.S).J((float)b232.t, (float)b232.k);
        iIa4.M.f();
        iIa4.i.e();
        iIa4.i.J(uSa.E != 0);
        uKa.J(uSa.E != 0);
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
        pKa pKa2 = pKa.J();
        aKa a232 = pKa2.J();
        aKa aKa2 = a232;
        aKa aKa3 = a232;
        aKa3.J(XTa.W, mka.I);
        aKa3.J(aSa.V, (double)f4, sra.M).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
        aKa2.J((double)f3, (double)f4, sra.M).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
        aKa2.J((double)f3, aSa.V, sra.M).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
        aKa2.J(aSa.V, aSa.V, sra.M).J(osa.Ja, osa.Ja, osa.Ja, osa.Ja).M();
        pKa2.J();
        uKa.J(vRa.d != 0);
        uKa.J(vRa.d != 0, vRa.d != 0, vRa.d != 0, vRa.d != 0);
        iIa4.M.J();
        iIa4.i.f();
        iIa4.j.d();
        for (Object e2 : iIa4.J) {
            if (!(e2 instanceof gHa)) continue;
            ((gHa)e2).d();
        }
    }

    public void J(Matrix4f matrix4f) {
        Matrix4f b2 = matrix4f;
        IIa a2 = this;
        a2.C = b2;
    }
}

