/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  EC
 *  Kpa
 *  NTa
 *  QF
 *  Sf
 *  Vz
 *  Xoa
 *  fTa
 *  pua
 *  uKa
 *  uRa
 *  vRa
 *  zU
 */
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.EmojisConfiguration;
import ru.vimeworld.minidot.atlas.emoji.MiniDotEmoji;

public final class XMa
extends QF {
    private MiniDotEmoji k;
    private final int j;
    public static final EmojisConfiguration J = ConfigurationService.J(EmojisConfiguration.class);
    private Xoa A;
    private final char I;

    public void J(Xoa xoa2) {
        XMa b2 = xoa2;
        XMa a2 = this;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        XMa xMa;
        void a2;
        XMa b2;
        int c22 = n2;
        XMa xMa2 = b2 = this;
        xMa2.f(c22, (int)a2);
        He c22 = Sf.J((char)xMa2.I);
        if (c22 == null) {
            return;
        }
        if (b2.j != pua.o) {
            if (zU.M.f((MiniDotItem)b2.k)) {
                XMa xMa3 = b2;
                xMa = xMa3;
                c22.J(b2.I, (int)xMa3.J, NTa.C, NTa.C, pua.o);
            } else {
                uKa.B();
                XMa xMa4 = b2;
                xMa = xMa4;
                c22.J(b2.I, (int)xMa4.J, NTa.C, NTa.C, cPa.d);
                uKa.k();
            }
        } else {
            c22.J(b2.I, (int)b2.J, NTa.C, NTa.C, pua.o);
            xMa = b2;
        }
        if (xMa.A != false && Xoa.j.f()) {
            Xoa.j.f().J(b2.I - uRa.I, uSa.W);
            Xoa.j.l().J((double)(b2.J - uRa.I), uSa.W);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        XMa a2 = this;
        if (b2 != false || e2 == false) {
            return;
        }
        if (a2.k != null && !zU.M.f((MiniDotItem)a2.k)) {
            return;
        }
        if (!EC.l() && !Sf.J().contains(a2.I + Mqa.y)) {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(a2.I + Mqa.y), null);
            Kpa.J().c.J(new CY(new StringBuilder().insert(3 ^ 3, fTa.f).append(a2.I).toString()).J(new Vz()));
            return;
        }
        a2.A.L.J(a2.I, pua.o);
    }

    /*
     * WARNING - void declaration
     */
    public XMa(char c2, int n2) {
        void b2;
        int c3 = n2;
        XMa a2 = this;
        super(uSa.E, uSa.E, NTa.C, NTa.C, null, null, null);
        a2.I = b2;
        a2.j = c3;
        if (a2.j != pua.o) {
            a2.k = J.J(c3).J();
        }
    }

    public void f() {
        XMa a2;
        Xoa.j.d((a2.A != false && Xoa.j.f() ? vRa.d : uSa.E) != 0);
    }
}

