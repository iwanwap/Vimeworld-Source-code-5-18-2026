/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GY
 *  Mda
 *  NCa
 *  NTa
 *  Uz
 *  Waa
 *  rba
 *  vRa
 *  waa
 */
import java.io.IOException;
import java.util.ArrayList;

public final class GY_3
extends ArrayList<Uz> {
    public GY_3() {
        GY_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public Uz canRecipeBeUsed(Mda mda2, Mda mda3, int n2) {
        int d22;
        void b2;
        void c2;
        void a22;
        GY_3 gY_3 = this;
        if (a22 > 0 && a22 < gY_3.size()) {
            GY_3 d22 = (Uz)gY_3.get((int)a22);
            if (!gY_3.func_181078_a((Mda)c2, d22.J()) || (b2 != null || d22.J()) && (!d22.J() || !gY_3.func_181078_a((Mda)b2, d22.f())) || c2.E < d22.J().E || d22.J() && b2.E < d22.f().E) {
                return null;
            }
            return d22;
        }
        int n3 = d22 = uSa.E;
        while (n3 < gY_3.size()) {
            Uz a22 = (Uz)gY_3.get(d22);
            if (gY_3.func_181078_a((Mda)c2, a22.J()) && c2.E >= a22.J().E && (!a22.J() && b2 == null || a22.J() && gY_3.func_181078_a((Mda)b2, a22.f()) && b2.E >= a22.f().E)) {
                return a22;
            }
            n3 = ++d22;
        }
        return null;
    }

    public static GY readFromBuf(Lca lca) throws IOException {
        int n2;
        Lca lca2 = lca;
        GY_3 gY_3 = new GY_3();
        int n3 = lca2.readByte() & osa.Ja;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Lca lca3 = lca2;
            Lca a2 = lca3.readItemStackFromBuffer();
            Mda mda2 = lca3.readItemStackFromBuffer();
            Mda mda3 = null;
            if (lca3.readBoolean()) {
                mda3 = lca2.readItemStackFromBuffer();
            }
            Lca lca4 = lca2;
            boolean bl2 = lca4.readBoolean();
            int n5 = lca4.readInt();
            int n6 = lca4.readInt();
            a2 = new Uz((Mda)a2, mda3, mda2, n5, n6);
            if (bl2 && n5 < n6) {
                a2.J();
            }
            gY_3.add(a2);
            n4 = ++n2;
        }
        return gY_3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean func_181078_a(Mda mda2, Mda mda3) {
        void b2;
        GY_3 c2 = mda3;
        GY_3 a2 = this;
        if (Mda.l((Mda)b2, (Mda)c2) && (!c2.M() || b2.M() && rba.J((NCa)c2.J(), (NCa)b2.J(), uSa.E != 0))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public GY_3(Waa waa2) {
        GY_3 a2;
        GY_3 b2 = waa2;
        GY_3 gY_3 = a2 = this;
        gY_3.readRecipiesFromTags((Waa)b2);
    }

    public Waa getRecipiesAsTags() {
        int a2;
        GY_3 gY_3 = this;
        Waa waa2 = new Waa();
        waa waa3 = new waa();
        int n2 = a2 = uSa.E;
        while (n2 < gY_3.size()) {
            Uz uz2 = (Uz)gY_3.get(a2);
            waa3.J((NCa)uz2.J());
            n2 = ++a2;
        }
        Waa waa4 = waa2;
        waa4.J(vua.ga, (NCa)waa3);
        return waa4;
    }

    public void readRecipiesFromTags(Waa waa2) {
        int n2;
        GY_3 b2 = waa2;
        GY_3 a2 = this;
        b2 = b2.J(vua.ga, NTa.C);
        int n3 = n2 = uSa.E;
        while (n3 < b2.J()) {
            Waa waa3 = b2.J(n2);
            a2.add(new Uz(waa3));
            n3 = ++n2;
        }
    }

    public void writeToBuf(Lca lca) {
        Lca b2 = lca;
        GY_3 a2 = this;
        b2.writeByte((byte)(a2.size() & osa.Ja));
        int n2 = uSa.E;
        int n3 = n2;
        while (n3 < a2.size()) {
            Uz uz2 = (Uz)a2.get(n2);
            Object object = b2;
            Uz uz3 = uz2;
            b2.writeItemStackToBuffer(uz3.J());
            ((Lca)object).writeItemStackToBuffer(uz3.l());
            Mda mda2 = uz2.f();
            ((Lca)object).writeBoolean((mda2 != null ? vRa.d : uSa.E) != 0);
            if (mda2 != null) {
                b2.writeItemStackToBuffer(mda2);
            }
            b2.writeBoolean(uz2.l());
            b2.writeInt(uz2.f());
            b2.writeInt(uz2.J());
            n3 = ++n2;
        }
    }
}

