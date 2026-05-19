/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HY
 *  KBa
 *  fA
 *  ld
 *  qta
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KBa_3
implements KC<fA> {
    private ld[] A;
    private XF I;

    /*
     * WARNING - void declaration
     */
    public KBa_3(XF xF2, ld[] ldArray) {
        void b2;
        ld[] c2 = ldArray;
        ld[] a2 = this;
        a2.I = b2;
        ld[] ldArray2 = new ld[AQa.P];
        ldArray2[uSa.E] = c2[uSa.E];
        ldArray2[vRa.d] = c2[vRa.d];
        ldArray2[uqa.g] = c2[uqa.g];
        ldArray2[yRa.d] = c2[yRa.d];
        a2.A = ldArray2;
    }

    public ld[] J() {
        KBa_3 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        int b2;
        void a2;
        KBa_3 kBa_3;
        KBa_3 kBa_32 = kBa_3 = this;
        kBa_32.I = a2.readBlockPos();
        kBa_32.A = new ld[AQa.P];
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            ld ld2 = HY.J((String)a2.readStringFromBuffer(qta.N));
            kBa_3.A[b2++] = ld2;
            n2 = b2;
        }
    }

    @Override
    public void J(fA fA2) {
        KBa_3 b2 = fA2;
        KBa_3 a2 = this;
        b2.J((KBa)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        int b2;
        void a2;
        KBa_3 kBa_3 = this;
        a2.writeBlockPos(kBa_3.I);
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            String string = HY.J((ld)kBa_3.A[b2]);
            a2.writeString(string);
            n2 = ++b2;
        }
    }

    public XF J() {
        KBa_3 a2;
        return a2.I;
    }

    public KBa_3() {
        KBa_3 a2;
    }
}

