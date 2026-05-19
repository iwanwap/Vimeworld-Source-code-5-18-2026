/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fA
 *  vRa
 */
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class YAa
implements KC<fA> {
    private String A;
    private XF I;

    public YAa(String string) {
        String b2 = string;
        YAa a2 = this;
        a2(b2, null);
    }

    @Override
    public void f(Lca lca) throws IOException {
        int n2;
        YAa a2;
        Lca b2 = lca;
        YAa yAa2 = a2 = this;
        b2.writeString(StringUtils.substring(yAa2.A, uSa.E, BQa.h));
        int n3 = n2 = yAa2.I != null ? vRa.d : uSa.E;
        b2.writeBoolean(n3 != 0);
        if (n3 != 0) {
            b2.writeBlockPos(a2.I);
        }
    }

    public XF J() {
        YAa a2;
        return a2.I;
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        YAa a2 = this;
        Object object = b2;
        a2.A = ((Lca)object).readStringFromBuffer(BQa.h);
        if (((Lca)object).readBoolean()) {
            a2.I = b2.readBlockPos();
        }
    }

    @Override
    public void J(fA fA2) {
        YAa b2 = fA2;
        YAa a2 = this;
        b2.J(a2);
    }

    /*
     * WARNING - void declaration
     */
    public YAa(String string, XF xF2) {
        void b2;
        YAa a2;
        Object c2 = xF2;
        YAa yAa2 = a2 = this;
        yAa2.A = b2;
        yAa2.I = c2;
    }

    public String J() {
        YAa a2;
        return a2.A;
    }

    public YAa() {
        YAa a2;
    }
}

