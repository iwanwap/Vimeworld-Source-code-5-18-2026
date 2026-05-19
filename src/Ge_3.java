/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cg
 *  JQa
 *  Pqa
 *  TF
 *  URa
 *  Uqa
 *  bpa
 *  jpa
 *  pua
 *  uKa
 *  vRa
 *  xJa
 *  xOa
 */
import java.nio.ByteBuffer;
import java.util.Properties;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ge_3 {
    private int g;
    private String L;
    private ByteBuffer E;
    private int m;
    private int C;
    private int i;
    private TF[] M;
    private int k;
    private int j;
    public byte[] J;
    private String A;
    public ResourceLocation I;

    public ResourceLocation J() {
        Ge_3 a2;
        return a2.I;
    }

    public int f() {
        Ge_3 a2;
        if (a2.M.length <= 0) {
            return uSa.E;
        }
        Ge_3 ge_3 = a2;
        if (ge_3.j >= ge_3.M.length) {
            a2.j = uSa.E;
        }
        Ge_3 ge_32 = a2;
        return ge_32.M[ge_32.j].I;
    }

    public String f() {
        Ge_3 a2;
        return a2.L;
    }

    public String J() {
        Ge_3 a2;
        return a2.A;
    }

    public int J() {
        Ge_3 a2;
        return a2.M.length;
    }

    public boolean f() {
        Ge_3 ge_3 = this;
        if (ge_3.M.length <= 0) {
            return uSa.E != 0;
        }
        Ge_3 ge_32 = ge_3;
        if (ge_32.j >= ge_32.M.length) {
            ge_3.j = uSa.E;
        }
        Ge_3 ge_33 = ge_3;
        Ge_3 a2 = ge_33.M[ge_33.j];
        ((TF)a2).J += vRa.d;
        if (((TF)a2).J < ((TF)a2).A) {
            return uSa.E != 0;
        }
        ((TF)a2).J = uSa.E;
        Ge_3 ge_34 = ge_3;
        ge_34.j += vRa.d;
        if (ge_34.j >= ge_3.M.length) {
            ge_3.j = uSa.E;
        }
        return vRa.d != 0;
    }

    public boolean J() {
        Ge_3 ge_3 = this;
        if (ge_3.C < 0) {
            H a2 = Cg.J((ResourceLocation)ge_3.I);
            if (a2 == null) {
                return uSa.E != 0;
            }
            ge_3.C = a2.J();
        }
        if (ge_3.E == null) {
            ge_3.E = xJa.J((int)ge_3.J.length);
            Ge_3 ge_32 = ge_3;
            ge_32.E.put(ge_32.J);
            ge_3.J = null;
        }
        if (!ge_3.f()) {
            return uSa.E != 0;
        }
        Ge_3 ge_33 = ge_3;
        int a2 = ge_33.g * ge_33.k * AQa.P;
        int n2 = ge_33.f();
        if ((n2 = a2 * n2) + a2 > ge_3.E.capacity()) {
            return uSa.E != 0;
        }
        ge_3.E.position(n2);
        uKa.C((int)ge_3.C);
        Ge_3 ge_34 = ge_3;
        Ge_3 ge_35 = ge_3;
        GL11.glTexSubImage2D(BQa.Z, uSa.E, ge_34.m, ge_34.i, ge_35.g, ge_35.k, rSa.Ka, Uqa.P, ge_3.E);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Ge_3(String string, byte[] byArray, String string2, ResourceLocation resourceLocation, int n2, int n3, int n4, int n5, Properties properties, int n6) {
        void a2;
        void b2;
        String i22;
        void c2;
        void d2;
        void e2;
        void f2;
        void g22;
        TF h22;
        Ge_3 j2;
        String k22 = string;
        Ge_3 ge_3 = j2 = this;
        Ge_3 ge_32 = j2;
        Ge_3 ge_33 = j2;
        Ge_3 ge_34 = j2;
        Ge_3 ge_35 = j2;
        Ge_3 ge_36 = j2;
        Ge_3 ge_37 = j2;
        j2.A = null;
        ge_37.L = null;
        ge_36.I = null;
        ge_37.C = pua.o;
        ge_36.m = uSa.E;
        ge_36.i = uSa.E;
        ge_36.g = uSa.E;
        ge_36.k = uSa.E;
        ge_35.M = null;
        ge_35.j = uSa.E;
        ge_35.J = null;
        ge_34.E = null;
        ge_34.A = k22;
        ge_33.L = h22;
        ge_33.I = g22;
        ge_32.m = f2;
        ge_32.i = e2;
        ge_3.g = d2;
        ge_3.k = c2;
        int k22 = d2 * c2 * AQa.P;
        if (((void)i22).length % k22 != 0) {
            Config.J(new StringBuilder().insert(3 & 4, xOa.n).append(((void)i22).length).append(URa.u).append((int)d2).append(Pqa.w).append((int)c2).toString());
        }
        j2.J = i22;
        k22 = ((void)i22).length / k22;
        if (b2.get(UOa.g) != null) {
            int i22 = uSa.E;
            void v7 = b2;
            while (v7.get(new StringBuilder().insert(2 & 5, JQa.j).append(i22).toString()) != null) {
                k22 = i22++ + vRa.d;
                v7 = b2;
            }
        }
        i22 = (String)b2.get(bpa.V);
        int i22 = Config.J(i22, (int)a2);
        j2.M = new TF[k22];
        int n7 = k22 = uSa.E;
        while (n7 < j2.M.length) {
            int h22 = Config.J((String)b2.get(JQa.j + k22), k22);
            int g22 = Config.J((String)b2.get(new StringBuilder().insert(3 & 4, jpa.Ja).append(k22).toString()), i22);
            h22 = new TF(h22, g22);
            j2.M[k22++] = h22;
            n7 = k22;
        }
    }
}

