/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Kpa
 *  Lba
 *  Lz
 *  QW
 *  Vca
 *  XTa
 *  YV
 *  fA
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 *  vL
 *  vRa
 */
import io.netty.util.concurrent.FastThreadLocalThread;
import java.io.IOException;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Lba_3
implements KC<fA> {
    private Lz J;
    private QW A;
    private YV<Vca> I;

    /*
     * WARNING - void declaration
     */
    public Lba_3(vL vL2, Vca vca2) {
        void b2;
        void a2;
        Lba_3 lba_3 = this;
        Lba_3 lba_32 = lba_3;
        lba_32.A = new QW(uSa.E);
        Ax.J();
        int n2 = uSa.E;
        if (a2 == Vca.ATTACK && b2 instanceof Sx) {
            Lba_3 c2 = Kpa.J().J();
            if (c2 != null && c2 != b2) {
                Object[] objectArray = new Object[WOa.fa];
                objectArray[uSa.E] = KQa.k;
                objectArray[vRa.d] = ((vL)c2).la;
                objectArray[uqa.g] = ((vL)c2).Z + (double)c2.l();
                objectArray[yRa.d] = ((vL)c2).A;
                objectArray[AQa.P] = (double)((vL)c2).d;
                objectArray[tTa.h] = (double)((Gl)c2).t;
                objectArray[uua.p] = b2.la;
                objectArray[XTa.W] = b2.Z;
                objectArray[Yqa.i] = b2.A;
                if (NativeClassLoaderUtils.call((Object)objectArray) != null) {
                    n2 = b2.M();
                }
            }
        } else {
            n2 = b2.M();
        }
        Lba_3 lba_33 = lba_3;
        lba_33.I = new YV((Object)a2);
        lba_33.A = new QW(n2);
    }

    public vL J(Gg gg2) {
        Lba_3 b2 = gg2;
        Lba_3 a2 = this;
        return b2.J(a2.A.J());
    }

    public Vca J() {
        Lba_3 a2;
        return (Vca)a2.I.I;
    }

    /*
     * WARNING - void declaration
     */
    public Lba_3(vL vL2, Lz lz2) {
        void b2;
        Lba_3 c2 = lz2;
        Lba_3 a2 = this;
        a2((vL)b2, Vca.INTERACT_AT);
        a2.J = c2;
    }

    public Lba_3() {
        Lba_3 a2;
        Lba_3 lba_3 = a2;
        lba_3.A = new QW(uSa.E);
        if (!(Thread.currentThread() instanceof FastThreadLocalThread)) {
            throw new IllegalStateException();
        }
        Ax.J();
    }

    public Lz J() {
        Lba_3 a2;
        return a2.J;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Lba_3 a2 = this;
        Object object = b2;
        ((Lca)object).writeVarIntToBuffer(a2.A.J());
        ((Lca)object).writeEnumValue((Enum)a2.I.I);
        if (a2.I.I == Vca.INTERACT_AT) {
            b2.writeFloat((float)a2.J.A);
            b2.writeFloat((float)a2.J.j);
            b2.writeFloat((float)a2.J.J);
        }
    }

    @Override
    public void J(fA fA2) {
        Lba_3 b2 = fA2;
        Lba_3 a2 = this;
        b2.J((Lba)a2);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Lca b2 = lca;
        Lba_3 a2 = this;
        if (!(Thread.currentThread() instanceof FastThreadLocalThread)) {
            throw new IllegalStateException();
        }
        a2.A = new QW(b2.readVarIntFromBuffer());
        Lba_3 lba_3 = a2;
        lba_3.I = new YV((Object)b2.readEnumValue(Vca.class));
        if (a2.I.I == Vca.INTERACT_AT) {
            a2.J = new Lz((double)b2.readFloat(), (double)b2.readFloat(), (double)b2.readFloat());
        }
    }
}

