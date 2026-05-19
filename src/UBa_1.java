/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  UBa
 *  iaa
 *  pua
 *  uBa
 *  vBa
 */
import java.io.IOException;

public final class UBa_1
implements KC<Pd> {
    public int k;
    public uBa j;
    public int J;
    public String A;
    public int I;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public UBa_1(iaa iaa2, uBa uBa2) {
        void b2;
        void a2;
        UBa_1 uBa_1 = this;
        uBa_1.j = a2;
        UBa_1 c2 = b2.f();
        switch (vBa.I[a2.ordinal()]) {
            case 1: {
                uBa_1.k = b2.J();
                uBa_1.J = c2 == null ? pua.o : c2.M();
                return;
            }
            case 2: {
                uBa_1.I = b2.J().M();
                uBa_1.J = c2 == null ? pua.o : c2.M();
                uBa_1.A = b2.J().f();
                return;
            }
        }
    }

    public UBa_1() {
        UBa_1 a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        UBa_1 a2;
        Lca b2 = lca;
        UBa_1 uBa_1 = a2 = this;
        b2.writeEnumValue((Enum<?>)uBa_1.j);
        if (uBa_1.j == uBa.END_COMBAT) {
            Object object = b2;
            ((Lca)object).writeVarIntToBuffer(a2.k);
            ((Lca)object).writeInt(a2.J);
            return;
        }
        if (a2.j == uBa.ENTITY_DIED) {
            Object object = b2;
            ((Lca)object).writeVarIntToBuffer(a2.I);
            ((Lca)object).writeInt(a2.J);
            b2.writeString(a2.A);
        }
    }

    @Override
    public void J(Pd pd2) {
        UBa_1 b2 = pd2;
        UBa_1 a2 = this;
        b2.J((UBa)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        UBa_1 a2 = this;
        a2.j = b2.readEnumValue(uBa.class);
        if (a2.j == uBa.END_COMBAT) {
            UBa_1 uBa_1 = a2;
            uBa_1.k = b2.readVarIntFromBuffer();
            uBa_1.J = b2.readInt();
            return;
        }
        if (a2.j == uBa.ENTITY_DIED) {
            UBa_1 uBa_1 = a2;
            Object object = b2;
            a2.I = ((Lca)object).readVarIntFromBuffer();
            uBa_1.J = ((Lca)object).readInt();
            uBa_1.A = b2.readStringFromBuffer(BQa.h);
        }
    }
}

