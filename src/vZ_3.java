/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dha
 *  ERa
 *  Faa
 */
import java.util.concurrent.Callable;

public final class vZ_3
implements Callable<String> {
    public final /* synthetic */ int j;
    public final /* synthetic */ int J;
    public final /* synthetic */ int A;
    public final /* synthetic */ Faa I;

    /*
     * WARNING - void declaration
     */
    public vZ_3(Faa faa2, int n2, int n3, int n4) {
        void b2;
        void a2;
        vZ_3 vZ_32;
        int n5 = n4;
        vZ_3 vZ_33 = vZ_32 = this;
        vZ_33.I = a2;
        vZ_33.j = n2;
        vZ_32.A = n3;
        vZ_32.J = b2;
    }

    public String J() throws Exception {
        vZ_3 a2;
        vZ_3 vZ_32 = a2;
        return Dha.J((XF)new XF(a2.I.I * ERa.C + a2.j, vZ_32.A, vZ_32.I.G * ERa.C + a2.J));
    }
}

