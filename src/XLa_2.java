/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  Eba
 *  JAa
 *  JMa
 *  Kpa
 *  Poa
 *  XLa
 *  iMa
 *  l
 *  lma
 *  poa
 *  xoa
 */
import com.google.common.util.concurrent.Futures;

public final class XLa_2
implements l {
    public final /* synthetic */ JMa I;

    public void J(boolean bl, int n2) {
        XLa_2 xLa_2;
        boolean c2 = bl;
        XLa_2 b2 = this;
        iMa.J((iMa)b2.I.A, (Kpa)Kpa.J());
        if (c2) {
            if (iMa.J((iMa)b2.I.A).J() != null) {
                iMa.J((iMa)b2.I.A).J().J(poa.ENABLED);
            }
            XLa_2 xLa_22 = b2;
            xLa_2 = xLa_22;
            iMa.J((iMa)xLa_22.I.A).J((KC)new JAa(b2.I.I, Eba.ACCEPTED));
            Futures.addCallback(iMa.J((iMa)xLa_22.I.A).J().J(b2.I.J, b2.I.I), new Poa((XLa)b2));
        } else {
            if (iMa.J((iMa)b2.I.A).J() != null) {
                iMa.J((iMa)b2.I.A).J().J(poa.DISABLED);
            }
            XLa_2 xLa_23 = b2;
            xLa_2 = xLa_23;
            iMa.J((iMa)xLa_23.I.A).J((KC)new JAa(b2.I.I, Eba.DECLINED));
        }
        xoa.J((lma)iMa.J((iMa)xLa_2.I.A).J());
        iMa.J((iMa)b2.I.A).J((EC)null);
    }

    public XLa_2(JMa jMa2) {
        XLa_2 b2 = jMa2;
        XLa_2 a2 = this;
        a2.I = b2;
    }
}

