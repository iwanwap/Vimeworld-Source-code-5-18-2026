/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  XCa
 *  ld
 *  vRa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XCa_2
implements KC<Pd> {
    private ld A;
    private byte I;

    public XCa_2() {
        XCa_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public XCa_2(ld ld2, byte by2) {
        void b2;
        XCa_2 a2;
        byte c2 = by2;
        XCa_2 xCa_2 = a2 = this;
        xCa_2.A = b2;
        xCa_2.I = c2;
    }

    @Override
    public void J(Lca lca) throws IOException {
        XCa_2 a2;
        Lca b2 = lca;
        XCa_2 xCa_2 = a2 = this;
        xCa_2.A = b2.readChatComponent();
        xCa_2.I = b2.readByte();
    }

    public XCa_2(ld ld2) {
        XCa_2 b2 = ld2;
        XCa_2 a2 = this;
        a2((ld)b2, (byte)vRa.d);
    }

    public byte J() {
        XCa_2 a2;
        return a2.I;
    }

    public boolean J() {
        XCa_2 a2;
        if (a2.I == vRa.d || a2.I == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ld J() {
        XCa_2 a2;
        return a2.A;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        XCa_2 a2 = this;
        Object object = b2;
        ((Lca)object).writeChatComponent(a2.A);
        ((Lca)object).writeByte(a2.I);
    }

    @Override
    public void J(Pd pd2) {
        XCa_2 b2 = pd2;
        XCa_2 a2 = this;
        b2.J((XCa)a2);
    }
}

