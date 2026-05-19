/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Fr
 *  Jo
 *  NQa
 *  SRa
 *  XM
 *  ZRa
 *  cp
 *  k
 *  kqa
 *  pL
 *  pPa
 *  pua
 */
import com.google.common.cache.CacheLoader;
import java.util.Base64;

public final class CQ_1
extends CacheLoader<String, Bp> {
    public CQ_1() {
        CQ_1 a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Bp J(String string) throws Exception {
        Object b2 = string;
        CQ_1 a2 = this;
        try {
            int n2;
            if (((String)b2).startsWith(ZRa.ga)) {
                n2 = ((String)b2).lastIndexOf(NQa.h);
                b2 = n2 == pua.o ? ((String)b2).substring(WOa.fa) : ((String)b2).substring(WOa.fa, n2);
            } else {
                Object object = b2;
                n2 = ((String)b2).endsWith(NQa.h) ? ((String)object).length() - uqa.g : ((String)object).length();
                Object object2 = b2;
                b2 = ((String)b2).startsWith(SRa.Aa) ? ((String)object2).substring(pPa.f, n2) : ((String)object2).substring(tTa.h, n2);
            }
            cp cp2 = new cp();
            b2 = XM.J((byte[])Base64.getDecoder().decode((String)b2));
            Bp bp2 = Bp.J((XM)b2, (k)cp2);
            if (bp2.w == Fr.I) {
                bp2.w = Fr.A;
            }
            cp2.J(bp2);
            return bp2;
        }
        catch (Exception exception) {
            Bp bp3;
            Jo jo2;
            OT.b.error(BQa.a, (Throwable)exception);
            Jo jo3 = jo2 = XM.J();
            jo2.setKind(MM.TEXT);
            jo3.setEText(pL.J().addText(kqa.M));
            b2 = new cp();
            Bp bp4 = bp3 = Bp.J((XM)jo3.build(), (k)b2);
            bp4.w = Fr.A;
            b2.J(bp4);
            return bp4;
        }
    }
}

