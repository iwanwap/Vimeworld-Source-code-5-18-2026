/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Ssa
 *  TPa
 *  Tpa
 *  XTa
 *  Ypa
 *  cQa
 *  cRa
 *  lqa
 *  pPa
 *  uOa
 *  vRa
 */
public final class cX_2 {
    public static final char[] I;

    public static boolean J(char a2) {
        if (a2 != TPa.Aa && a2 >= fPa.i && a2 != cRa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static String J(String string) {
        int a2;
        String string2 = string;
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = string2.toCharArray();
        int n2 = cArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            char c2 = cArray[a2];
            if (cX_2.J(c2)) {
                stringBuilder.append(c2);
            }
            n3 = ++a2;
        }
        return stringBuilder.toString();
    }

    static {
        char[] cArray = new char[Ypa.A];
        cArray[uSa.E] = uOa.F;
        cArray[vRa.d] = NTa.C;
        cArray[uqa.g] = uua.s;
        cArray[yRa.d] = WOa.fa;
        cArray[AQa.P] = uSa.E;
        cArray[tTa.h] = lqa.s;
        cArray[uua.p] = zua.m;
        cArray[XTa.W] = Ssa.u;
        cArray[Yqa.i] = cQa.i;
        cArray[WOa.fa] = iSa.ca;
        cArray[NTa.C] = Psa.M;
        cArray[pPa.f] = ITa.V;
        cArray[lqa.s] = cPa.Ea;
        cArray[uua.s] = Tpa.z;
        cArray[hpa.Z] = lQa.R;
        I = cArray;
    }

    public cX_2() {
        cX_2 a2;
    }
}

