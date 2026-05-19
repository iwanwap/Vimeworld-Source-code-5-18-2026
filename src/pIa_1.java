/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eha
 *  FIa
 *  Tpa
 *  aPa
 *  nka
 *  pIa
 */
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pIa_1 {
    private static final Logger A = LogManager.getLogger();
    private static pIa I;

    public void f(FIa fIa2) {
        pIa_1 b2 = fIa2;
        pIa_1 a2 = this;
        pIa_1 pIa_12 = b2;
        pIa_1 pIa_13 = b2;
        pIa_12.J().f((FIa)pIa_13);
        pIa_12.f().f((FIa)b2);
        nka.D((int)pIa_13.J());
    }

    public static void J() {
        I = new pIa_1();
    }

    public pIa_1() {
        pIa_1 a2;
    }

    public void J(FIa fIa2) throws IOException {
        pIa_1 b2 = fIa2;
        pIa_1 a2 = this;
        pIa_1 pIa_12 = b2;
        pIa_1 pIa_13 = b2;
        pIa_12.J().J((FIa)pIa_13);
        pIa_12.f().J((FIa)b2);
        nka.A((int)pIa_13.J());
        if (nka.J((int)pIa_12.J(), (int)nka.V) == 0) {
            A.warn(new StringBuilder().insert(3 & 4, Tpa.J).append(b2.f().J()).append(gsa.o).append(b2.J().J()).append(wta.n).toString());
            A.warn(nka.f((int)b2.J(), (int)CRa.Y));
        }
    }

    public int J() throws Eha {
        pIa_1 pIa_12 = this;
        int a2 = nka.l();
        if (a2 <= 0) {
            throw new Eha(new StringBuilder().insert(3 & 4, aPa.P).append(a2).append(hpa.b).toString());
        }
        return a2;
    }

    public static pIa J() {
        return I;
    }
}

