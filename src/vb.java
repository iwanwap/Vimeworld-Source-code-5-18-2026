/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Dla
 *  Gg
 *  JPa
 *  Kpa
 *  MQa
 *  Mda
 *  aSa
 *  kba
 *  nLa
 *  nka
 *  pqa
 *  uKa
 *  vL
 *  vRa
 */
import java.util.Collection;
import net.minecraft.client.model.ModelPlayer;

public final class vb {
    public vb() {
        vb a2;
    }

    private static void J() {
        nLa.C();
        uKa.E();
        uKa.i((int)nka.P);
        uKa.z();
        uKa.i((int)nka.v);
        uKa.u();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, int n5, int n6, float f2, float f3) {
        void f4;
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n7 = n2;
        ANa g = Kpa.J().c;
        float f5 = g.ba;
        float f6 = g.d;
        float f7 = g.t;
        uKa.a();
        uKa.J();
        uKa.e();
        vb.J((int)e2, (int)d2, (int)c2, (float)b2, (float)a2, n7, (int)f4);
        Kpa.J().J().J((vL)g, aSa.V, aSa.V, aSa.V, JPa.N, pqa.r);
        ANa aNa2 = g;
        g.N = f6;
        aNa2.ba = f5;
        aNa2.t = f7;
        uKa.D();
        uKa.D();
        vb.J();
    }

    public static void J(Runnable runnable) {
        Runnable runnable2 = runnable;
        Runnable a2 = Kpa.J().c;
        oLa oLa2 = Kpa.J().J();
        Object object = ((Dla)oLa2.J((vL)a2)).J();
        Runnable runnable3 = a2;
        int n2 = ((Sx)((Object)runnable3)).ha;
        boolean bl = runnable3.C();
        Mda mda2 = ((Sx)((Object)runnable3)).J();
        vL vL2 = ((Sx)((Object)runnable3)).ja;
        int n3 = ((Sx)((Object)runnable3)).Aa;
        Collection collection = runnable3.J();
        Mda[] mdaArray = ((Sx)((Object)runnable3)).K.A;
        oLa oLa3 = oLa2;
        boolean bl2 = oLa3.J();
        boolean bl3 = oLa3.l();
        boolean bl4 = oLa3.C();
        float f2 = ((Sx)((Object)runnable3)).w;
        Gg gg2 = oLa2.j;
        int n4 = ((Sx)((Object)runnable3)).a;
        float f3 = ((Sx)((Object)runnable3)).i;
        int n5 = ((Sx)((Object)runnable3)).ca;
        boolean bl5 = ((ModelPlayer)object).bipedCape.isHidden;
        boolean bl6 = oLa2.f();
        ((ModelPlayer)object).bipedCape.isHidden = vRa.d;
        ((Sx)((Object)runnable3)).ha = uSa.E;
        runnable3.J(uSa.E != 0);
        ((Sx)((Object)runnable3)).ja = null;
        ((Sx)((Object)runnable3)).Aa = (int)null;
        ((Sx)((Object)runnable3)).a = uSa.E;
        runnable3.U();
        ((Sx)((Object)runnable3)).K.j[((Sx)((Object)a2)).K.J] = null;
        ((Sx)((Object)runnable3)).K.A = new Mda[AQa.P];
        Runnable runnable4 = a2;
        Runnable runnable5 = a2;
        Runnable runnable6 = a2;
        ((Sx)((Object)runnable6)).w = JPa.N;
        ((Sx)((Object)runnable6)).i = JPa.N;
        ((Sx)((Object)runnable6)).ca = uSa.E;
        oLa oLa4 = oLa2;
        oLa2.l(uSa.E != 0);
        oLa4.J(uSa.E != 0);
        oLa4.C(uSa.E != 0);
        oLa2.f(vRa.d != 0);
        oLa4.J((Gg)null);
        runnable2.run();
        ((ModelPlayer)object).bipedCape.isHidden = bl5;
        ((Sx)((Object)a2)).ha = n2;
        a2.J(bl);
        ((Sx)((Object)a2)).ja = vL2;
        ((Sx)((Object)a2)).Aa = n3;
        ((Sx)((Object)a2)).K.j[((Sx)((Object)a2)).K.J] = mda2;
        ((Sx)((Object)a2)).K.A = mdaArray;
        ((Sx)((Object)runnable5)).a = n4;
        ((Sx)((Object)runnable5)).w = f2;
        ((Sx)((Object)runnable4)).i = f3;
        ((Sx)((Object)runnable4)).ca = n5;
        Object object2 = object = collection.iterator();
        while (object2.hasNext()) {
            kba kba2 = (kba)object.next();
            object2 = object;
            a2.J(kba2);
        }
        oLa oLa5 = oLa2;
        oLa oLa6 = oLa2;
        oLa6.f(bl6);
        oLa6.J(gg2);
        oLa5.l(bl2);
        oLa5.J(bl3);
        oLa2.C(bl4);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(int n2, int n3, int n4, float f2, float f3) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f4 = f3;
        int a2 = n2;
        vb.J(uSa.E, uSa.E, a2, (int)d2, (int)c2, (float)b2, (float)e2);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, int n3, int n4, float f2, float f3, int n5, int n6) {
        void b2;
        void a2;
        void d2;
        void c2;
        void e2;
        void f4;
        int n7 = n2;
        ANa g = Kpa.J().c;
        uKa.J((float)n7, (float)((float)f4), (float)vua.ha);
        uKa.l((float)((float)(-e2)), (float)((float)e2), (float)((float)e2));
        uKa.l((float)pqa.r, (float)pqa.r, (float)MQa.L);
        uKa.J((float)Hra.Ga, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.J((float)Era.h, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        nLa.l();
        uKa.J((float)opa.z, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        ANa aNa2 = g;
        g.N = c2;
        aNa2.ba = d2;
        aNa2.t = d2;
        uKa.e();
        uKa.J((float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)((float)a2), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)((float)b2), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)JPa.N, (float)vqa.T, (float)JPa.N);
    }
}

