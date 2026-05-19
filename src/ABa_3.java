/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ABa
 *  Fpa
 *  JPa
 *  NQa
 *  Oz
 *  Pd
 *  Qsa
 *  hra
 */
import java.io.IOException;
import org.apache.commons.lang3.Validate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ABa_3
implements KC<Pd> {
    private int M;
    private int k;
    private float j;
    private int J;
    private int A;
    private String I;

    public double l() {
        ABa_3 a2;
        return (float)a2.k / Qsa.k;
    }

    @Override
    public void J(Pd pd2) {
        ABa_3 b2 = pd2;
        ABa_3 a2 = this;
        b2.J((ABa)a2);
    }

    public ABa_3() {
        ABa_3 a2;
        a2.J = vqa.F;
    }

    public float f() {
        ABa_3 a2;
        return a2.j;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        ABa_3 a2 = this;
        b2.writeString(a2.I);
        b2.writeInt(a2.M);
        b2.writeInt(a2.J);
        b2.writeInt(a2.k);
        b2.writeFloat(a2.j);
        b2.writeByte(a2.A);
    }

    public String J() {
        ABa_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public ABa_3(String string, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        void c2;
        void d5;
        void e2;
        float g2;
        void f4;
        float f5 = f3;
        ABa_3 a2 = this;
        a2.J = vqa.F;
        Validate.notNull(f4, dua.T, new Object[uSa.E]);
        void v0 = g2;
        ABa_3 aBa_3 = a2;
        ABa_3 aBa_32 = a2;
        a2.I = f4;
        aBa_32.M = (int)(e2 * Wqa.Z);
        aBa_32.J = (int)(d5 * Wqa.Z);
        aBa_3.k = (int)(c2 * Wqa.Z);
        aBa_3.j = b2;
        a2.A = (int)(v0 * Fpa.o);
        g2 = Oz.J((float)v0, (float)JPa.N, (float)NQa.Y);
    }

    @Override
    public void J(Lca lca) throws IOException {
        ABa_3 a2;
        Lca b2 = lca;
        ABa_3 aBa_3 = a2 = this;
        Object object = b2;
        ABa_3 aBa_32 = a2;
        Object object2 = b2;
        a2.I = ((Lca)object2).readStringFromBuffer(hra.Ja);
        aBa_32.M = ((Lca)object2).readInt();
        aBa_32.J = b2.readInt();
        a2.k = ((Lca)object).readInt();
        aBa_3.j = ((Lca)object).readFloat();
        aBa_3.A = b2.readUnsignedByte();
    }

    public float J() {
        ABa_3 a2;
        return (float)a2.A / Fpa.o;
    }

    public double f() {
        ABa_3 a2;
        return (float)a2.M / Qsa.k;
    }

    public double J() {
        ABa_3 a2;
        return (float)a2.J / Qsa.k;
    }
}

