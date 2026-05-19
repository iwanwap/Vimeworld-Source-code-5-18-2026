/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Pd
 *  ld
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ICa
implements KC<Pd> {
    private Gg J;
    private ld[] A;
    private XF I;

    public ld[] J() {
        ICa a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public ICa(Gg gg2, XF xF, ld[] ldArray) {
        void b2;
        void c2;
        ld[] d2 = ldArray;
        ld[] a2 = this;
        a2.J = c2;
        a2.I = b2;
        ld[] ldArray2 = new ld[AQa.P];
        ldArray2[uSa.E] = d2[uSa.E];
        ldArray2[vRa.d] = d2[vRa.d];
        ldArray2[uqa.g] = d2[uqa.g];
        ldArray2[yRa.d] = d2[yRa.d];
        a2.A = ldArray2;
    }

    @Override
    public void J(Pd pd2) {
        ICa b2 = pd2;
        ICa a2 = this;
        b2.J(a2);
    }

    public ICa() {
        ICa a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        int b2;
        void a2;
        ICa iCa = this;
        a2.writeBlockPos(iCa.I);
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            a2.writeChatComponent(iCa.A[b2++]);
            n2 = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        int b2;
        void a2;
        ICa iCa;
        ICa iCa2 = iCa = this;
        iCa2.I = a2.readBlockPos();
        iCa2.A = new ld[AQa.P];
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            iCa.A[b2++] = a2.readChatComponent();
            n2 = b2;
        }
    }

    public XF J() {
        ICa a2;
        return a2.I;
    }
}

