/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WE
 *  vRa
 */
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qD_2 {
    private WE[] I = new WE[uSa.E];

    public WE J(int n2) {
        int b2 = n2;
        qD_2 a2 = this;
        return a2.I[b2];
    }

    public qD_2() {
        qD_2 a2;
    }

    public int J() {
        qD_2 a2;
        return a2.I.length;
    }

    public String toString() {
        qD_2 qD_22 = this;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(dqa.X);
        int a2 = uSa.E;
        int n2 = a2;
        while (n2 < qD_22.I.length) {
            WE wE2 = qD_22.I[a2];
            if (a2 > 0) {
                stringBuffer.append(TOa.n);
            }
            stringBuffer.append(wE2.toString());
            n2 = ++a2;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(XOa.D);
        return stringBuffer2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2) {
        int b2;
        qD_2 qD_22 = this;
        int n3 = b2 = uSa.E;
        while (n3 < qD_22.I.length) {
            void a2;
            if (qD_22.I[b2].J((int)a2)) {
                return vRa.d != 0;
            }
            n3 = ++b2;
        }
        return uSa.E != 0;
    }

    public void J(WE wE2) {
        qD_2 b2 = wE2;
        qD_2 a2 = this;
        a2.I = (WE[])Config.J((Object[])a2.I, b2);
    }
}

