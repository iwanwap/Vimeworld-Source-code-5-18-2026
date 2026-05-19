/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  Kba
 *  OCa
 *  RQa
 *  bFa
 *  bSa
 *  kb
 *  ld
 *  lqa
 *  nQa
 *  nz
 *  pQa
 *  rX
 *  rd
 *  vRa
 *  vy
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.GenericFutureListener;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nz_1
implements kb,
rd {
    public final uba g;
    private bFa L;
    private static final Logger E;
    private SecretKey m;
    private GameProfile C;
    private final OCa i;
    private static final Random M;
    private rX k;
    private final byte[] j;
    private int J;
    private static final AtomicInteger A;
    private String I;

    public static /* synthetic */ GameProfile J(nz a2) {
        return a2.C;
    }

    public void J() {
        nz_1 nz_12;
        nz_1 a2;
        if (a2.k == rX.READY_TO_ACCEPT) {
            nz_1 nz_13 = a2;
            nz_12 = nz_13;
            nz_13.f();
        } else {
            if (a2.k == rX.DELAY_ACCEPT && a2.i.J().J(a2.C.getId()) == null) {
                a2.k = rX.READY_TO_ACCEPT;
                nz_1 nz_14 = a2;
                a2.i.J().J(nz_14.g, nz_14.L);
                a2.L = null;
            }
            nz_12 = a2;
        }
        int n2 = nz_12.J;
        nz_12.J = n2 + vRa.d;
        if (n2 == Jpa.z) {
            a2.J(mSa.L);
        }
    }

    /*
     * WARNING - void declaration
     */
    public GameProfile J(GameProfile gameProfile) {
        void a2;
        nz_1 nz_12 = this;
        UUID b2 = UUID.nameUUIDFromBytes(new StringBuilder().insert(3 ^ 3, Mqa.c).append(a2.getName()).toString().getBytes(Charsets.UTF_8));
        return new GameProfile(b2, a2.getName());
    }

    public static /* synthetic */ SecretKey J(nz a2) {
        return a2.m;
    }

    public static /* synthetic */ OCa J(nz a2) {
        return a2.i;
    }

    public void J(ld ld2) {
        nz_1 b2 = ld2;
        nz_1 a2 = this;
        E.info(new StringBuilder().insert(3 >> 2, a2.J()).append(Bua.E).append(b2.f()).toString());
    }

    public static /* synthetic */ GameProfile J(nz nz2, GameProfile gameProfile) {
        Object b2 = gameProfile;
        nz a2 = nz2;
        a2.C = b2;
        return a2.C;
    }

    public static /* synthetic */ rX J(nz nz2, rX rX2) {
        nz b2 = rX2;
        nz a2 = nz2;
        a2.k = b2;
        return a2.k;
    }

    public void J(VBa vBa2) {
        VBa b2 = vBa2;
        nz_1 a2 = this;
        Validate.validState((a2.k == rX.HELLO ? vRa.d : uSa.E) != 0, bSa.E, new Object[uSa.E]);
        a2.C = b2.J();
        if (a2.i.G() && !a2.g.d()) {
            a2.k = rX.KEY;
            nz_1 nz_12 = a2;
            a2.g.J(new jCa(nz_12.I, nz_12.i.J().getPublic(), a2.j));
            return;
        }
        a2.k = rX.READY_TO_ACCEPT;
    }

    public String J() {
        nz_1 a2;
        if (a2.C != null) {
            return new StringBuilder().insert(2 & 5, a2.C.toString()).append(nQa.T).append(a2.g.J().toString()).append(hpa.b).toString();
        }
        return String.valueOf(a2.g.J());
    }

    public static /* synthetic */ Logger J() {
        return E;
    }

    static {
        A = new AtomicInteger(uSa.E);
        E = LogManager.getLogger();
        M = new Random();
    }

    public void J(String string) {
        Object b22 = string;
        nz_1 a2 = this;
        try {
            E.info(new StringBuilder().insert(3 & 4, RQa.E).append(a2.J()).append(Xpa.E).append((String)b22).toString());
            b22 = new CY((String)b22);
            nz_1 nz_12 = a2;
            nz_12.g.J(new sBa((ld)b22));
            nz_12.g.J((ld)b22);
            return;
        }
        catch (Exception b22) {
            E.error(dua.X, (Throwable)b22);
            return;
        }
    }

    public static /* synthetic */ String J(nz a2) {
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Kba kba2) {
        void a2;
        nz_1 nz_12 = this;
        Validate.validState((nz_12.k == rX.KEY ? vRa.d : uSa.E) != 0, Asa.O, new Object[uSa.E]);
        nz_1 nz_13 = nz_12;
        PrivateKey b2 = nz_13.i.J().getPrivate();
        if (!Arrays.equals(nz_13.j, a2.J(b2))) {
            throw new IllegalStateException(pQa.g);
        }
        nz_12.m = a2.J(b2);
        nz_12.k = rX.AUTHENTICATING;
        nz_12.g.J(nz_12.m);
        new vy((nz)nz_12, lqa.L + A.incrementAndGet()).start();
    }

    /*
     * WARNING - void declaration
     */
    public nz_1(OCa oCa2, uba uba2) {
        void b2;
        nz_1 a2;
        uba c2 = uba2;
        nz_1 nz_12 = a2 = this;
        a2.j = new byte[AQa.P];
        a2.k = rX.HELLO;
        a2.I = Mqa.y;
        nz_12.i = b2;
        nz_12.g = c2;
        M.nextBytes(a2.j);
    }

    public void f() {
        Object a2;
        nz_1 nz_12 = this;
        if (!nz_12.C.isComplete()) {
            nz_1 nz_13 = nz_12;
            nz_13.C = nz_13.J(nz_13.C);
        }
        if ((a2 = nz_12.i.J().J(nz_12.g.J(), nz_12.C)) != null) {
            nz_12.J((String)a2);
            return;
        }
        nz_12.k = rX.ACCEPTED;
        if (nz_12.i.d() >= 0 && !nz_12.g.d()) {
            nz_12.g.J(new iBa(nz_12.i.d()), new eZ((nz)nz_12), new GenericFutureListener[uSa.E]);
        }
        nz_1 nz_14 = nz_12;
        nz_14.g.J(new jAa(nz_12.C));
        if (nz_14.i.J().J(nz_12.C.getId()) != null) {
            nz_12.k = rX.DELAY_ACCEPT;
            nz_12.L = nz_12.i.J().J(nz_12.C);
            return;
        }
        nz_1 nz_15 = nz_12;
        nz_12.i.J().J(nz_15.g, nz_15.i.J().J(nz_12.C));
    }
}

