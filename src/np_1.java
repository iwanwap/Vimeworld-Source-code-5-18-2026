/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Ip
 *  NTa
 *  PTa
 *  RQa
 *  Tpa
 *  XM
 *  XTa
 *  Zua
 *  asa
 *  dpa
 *  fO
 *  fsa
 *  k
 *  pPa
 *  pua
 *  vRa
 */
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class np_1
extends Ip {
    private static final Pattern A = Pattern.compile(kTa.X);
    public String[] I;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void l(long l2) {
        int n2;
        void a2;
        np_1 np_12 = this;
        int n3 = (int)(a2 % asa.fa);
        int n4 = (int)((a2 /= asa.fa) % RQa.N);
        int n5 = (int)((a2 /= RQa.N) % RQa.N);
        int n6 = (int)((a2 /= RQa.N) % wua.S);
        int n7 = (int)(a2 /= wua.S);
        int n8 = n2 = uSa.E;
        while (true) {
            if (n8 >= np_12.I.length) {
                super.D();
                return;
            }
            Matcher b2 = A.matcher(np_12.I[n2]);
            StringBuffer stringBuffer = new StringBuffer();
            while (b2.find()) {
                int n9;
                block31: {
                    String string = b2.group(vRa.d);
                    int n10 = pua.o;
                    switch (string.hashCode()) {
                        case 68: {
                            if (!string.equals(dpa.ga)) break;
                            n9 = n10 = uSa.E;
                            break block31;
                        }
                        case 2176: {
                            if (!string.equals(Tpa.N)) break;
                            n9 = n10 = vRa.d;
                            break block31;
                        }
                        case 72: {
                            if (!string.equals(sSa.O)) break;
                            n9 = n10 = uqa.g;
                            break block31;
                        }
                        case 2304: {
                            if (!string.equals(Zra.K)) break;
                            n9 = n10 = yRa.d;
                            break block31;
                        }
                        case 77: {
                            if (!string.equals(Cra.j)) break;
                            n9 = n10 = AQa.P;
                            break block31;
                        }
                        case 2464: {
                            if (!string.equals(fsa.J)) break;
                            n9 = n10 = tTa.h;
                            break block31;
                        }
                        case 1064901855: {
                            if (!string.equals(qsa.f)) break;
                            n9 = n10 = uua.p;
                            break block31;
                        }
                        case 83: {
                            if (!string.equals(Iqa.W)) break;
                            n9 = n10 = XTa.W;
                            break block31;
                        }
                        case 2656: {
                            if (!string.equals(xra.fa)) break;
                            n9 = n10 = Yqa.i;
                            break block31;
                        }
                        case 1970096767: {
                            if (!string.equals(PTa.f)) break;
                            n9 = n10 = WOa.fa;
                            break block31;
                        }
                        case 109: {
                            if (!string.equals(gsa.R)) break;
                            n9 = n10 = NTa.C;
                            break block31;
                        }
                        case 3488: {
                            if (!string.equals(Zua.s)) break;
                            n10 = pPa.f;
                        }
                    }
                    n9 = n10;
                }
                switch (n9) {
                    case 0: 
                    case 1: {
                        b2.appendReplacement(stringBuffer, Mqa.y + n7);
                        break;
                    }
                    case 2: {
                        b2.appendReplacement(stringBuffer, new StringBuilder().insert(5 >> 3, Mqa.y).append(n6).toString());
                        break;
                    }
                    case 3: {
                        b2.appendReplacement(stringBuffer, np_1.toString(n6, uqa.g));
                        break;
                    }
                    case 4: {
                        b2.appendReplacement(stringBuffer, new StringBuilder().insert(3 >> 2, Mqa.y).append(n5).toString());
                        break;
                    }
                    case 5: {
                        b2.appendReplacement(stringBuffer, np_1.toString(n5, uqa.g));
                        break;
                    }
                    case 6: {
                        b2.appendReplacement(stringBuffer, new StringBuilder().insert(2 & 5, Mqa.y).append((long)(a2 / asa.fa / RQa.N)).toString());
                        break;
                    }
                    case 7: {
                        b2.appendReplacement(stringBuffer, new StringBuilder().insert(3 ^ 3, Mqa.y).append(n4).toString());
                        break;
                    }
                    case 8: {
                        b2.appendReplacement(stringBuffer, np_1.toString(n4, uqa.g));
                        break;
                    }
                    case 9: {
                        b2.appendReplacement(stringBuffer, new StringBuilder().insert(3 & 4, Mqa.y).append((long)(a2 / asa.fa)).toString());
                        break;
                    }
                    case 10: {
                        if (n3 < ySa.T) {
                            b2.appendReplacement(stringBuffer, GPa.J);
                            break;
                        }
                        b2.appendReplacement(stringBuffer, np_1.toString(n3, vRa.d));
                        break;
                    }
                    case 11: {
                        b2.appendReplacement(stringBuffer, np_1.toString(n3, uqa.g));
                        break;
                    }
                }
            }
            b2.appendTail(stringBuffer);
            np_12.e[n2++] = stringBuffer.toString();
            n8 = n2;
        }
    }

    public void J(fO fO2) {
        np_1 b2 = fO2;
        np_1 a2 = this;
        np_1 np_12 = b2;
        super.J((fO)np_12);
        if (np_12.hasEText() && b2.getEText().getTextCount() > 0) {
            a2.I = Arrays.copyOf(a2.e, a2.e.length);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String toString(int n2, int n3) {
        void a2;
        StringBuilder b2;
        int n4 = n2;
        StringBuilder stringBuilder = b2 = new StringBuilder(n4 + Mqa.y);
        while (stringBuilder.length() < a2) {
            StringBuilder stringBuilder2 = b2;
            stringBuilder = stringBuilder2;
            stringBuilder2.insert(uSa.E, GPa.J);
        }
        if (b2.length() > a2) {
            return b2.substring(uSa.E, (int)a2);
        }
        return b2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public np_1(k k2, XM xM2) {
        void b2;
        np_1 a2;
        np_1 c2 = xM2;
        np_1 np_12 = a2 = this;
        super((k)b2, (XM)c2);
        a2.I = Arrays.copyOf(np_12.e, a2.e.length);
    }
}

