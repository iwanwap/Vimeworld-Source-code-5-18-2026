/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  DBa
 *  ERa
 *  EY
 *  Faa
 *  Gg
 *  Gua
 *  Ypa
 *  bFa
 *  lqa
 *  psa
 *  uY
 *  vRa
 *  wba
 *  ysa
 */
import com.google.common.collect.Lists;
import java.util.List;

public final class QX {
    private final List<bFa> i;
    private final Baa M;
    private int k;
    private int j;
    private short[] J;
    private long A;
    public final /* synthetic */ EY I;

    public void f() {
        QX qX = this;
        if (qX.j != 0) {
            if (qX.j == vRa.d) {
                QX qX2 = qX;
                QX qX3 = qX;
                int n2 = (qX2.J[uSa.E] >> lqa.s & Ypa.A) + qX3.M.j * ERa.C;
                int n3 = qX2.J[uSa.E] & osa.Ja;
                int n4 = (qX3.J[uSa.E] >> Yqa.i & Ypa.A) + qX.M.A * ERa.C;
                Object a2 = new XF(n2, n3, n4);
                QX qX4 = qX;
                qX2.J((KC)new wba((Gg)EY.J((EY)qX.I), (XF)((Object)a2)));
                if (EY.J((EY)qX2.I).J((XF)((Object)a2)).J().a()) {
                    QX qX5 = qX;
                    qX5.J(EY.J((EY)qX5.I).J((XF)((Object)a2)));
                }
            } else if (qX.j == ysa.s) {
                int n5;
                QX qX6 = qX;
                int n6 = qX6.M.j * ERa.C;
                int n7 = qX6.M.A * ERa.C;
                QX qX7 = qX;
                qX7.J((KC)new DBa(EY.J((EY)qX7.I).J(qX.M.j, qX.M.A), uSa.E != 0, qX.k));
                int n8 = n5 = uSa.E;
                while (n8 < ERa.C) {
                    if ((qX.k & vRa.d << n5) != 0) {
                        int a2 = n5 << AQa.P;
                        int n9 = n6;
                        List list = EY.J((EY)qX.I).J(n9, a2, n7, n9 + ERa.C, a2 + ERa.C, n7 + ERa.C);
                        int n10 = uSa.E;
                        while (n10 < list.size()) {
                            int n11;
                            qX.J((uY)list.get(n11++));
                            n10 = n11;
                        }
                    }
                    n8 = ++n5;
                }
            } else {
                int n12;
                QX qX8 = qX;
                qX.J(new eba(qX8.j, qX8.J, EY.J((EY)qX.I).J(qX.M.j, qX.M.A)));
                int n13 = n12 = uSa.E;
                while (n13 < qX.j) {
                    QX qX9 = qX;
                    QX qX10 = qX;
                    int n14 = (qX9.J[n12] >> lqa.s & Ypa.A) + qX10.M.j * ERa.C;
                    int n15 = qX9.J[n12] & osa.Ja;
                    int a2 = (qX10.J[n12] >> Yqa.i & Ypa.A) + qX.M.A * ERa.C;
                    XF xF = new XF(n14, n15, a2);
                    if (EY.J((EY)qX9.I).J(xF).J().a()) {
                        QX qX11 = qX;
                        qX11.J(EY.J((EY)qX11.I).J(xF));
                    }
                    n13 = ++n12;
                }
            }
            QX qX12 = qX;
            qX12.j = uSa.E;
            qX12.k = uSa.E;
        }
    }

    private void J(Faa faa2) {
        QX b2 = faa2;
        QX a2 = this;
        QX qX = b2;
        qX.f(qX.J() + EY.J((EY)a2.I).l() - a2.A);
        a2.A = EY.J((EY)a2.I).l();
    }

    private void J(uY uY2) {
        Object b2 = uY2;
        QX a2 = this;
        if (b2 != null && (b2 = b2.J()) != null) {
            a2.J((KC)b2);
        }
    }

    public void f(bFa bFa2) {
        QX b2 = bFa2;
        QX a2 = this;
        if (a2.i.contains(b2)) {
            Faa faa2 = EY.J((EY)a2.I).J(a2.M.j, a2.M.A);
            if (faa2.l()) {
                ((bFa)b2).I.J((KC)new DBa(faa2, vRa.d != 0, uSa.E));
            }
            QX qX = a2;
            qX.i.remove(b2);
            ((bFa)b2).M.remove(a2.M);
            if (qX.i.isEmpty()) {
                QX qX2 = a2;
                long l2 = (long)qX2.M.j + Gua.R | (long)a2.M.A + Gua.R << fPa.i;
                qX2.J(faa2);
                QX qX3 = a2;
                EY.J((EY)qX2.I).f(l2);
                EY.J((EY)a2.I).remove(qX3);
                if (qX3.j > 0) {
                    EY.f((EY)a2.I).remove(a2);
                }
                a2.I.J().f.J(a2.M.j, a2.M.A);
            }
        }
    }

    public static /* synthetic */ List J(QX a2) {
        return a2.i;
    }

    public void J(bFa bFa2) {
        QX b2 = bFa2;
        QX a2 = this;
        if (a2.i.contains(b2)) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = b2;
            objectArray[vRa.d] = a2.M.j;
            objectArray[uqa.g] = a2.M.A;
            EY.J().debug(psa.y, objectArray);
            return;
        }
        if (a2.i.isEmpty()) {
            a2.A = EY.J((EY)a2.I).l();
        }
        a2.i.add((bFa)b2);
        ((bFa)b2).M.add(a2.M);
    }

    /*
     * WARNING - void declaration
     */
    public QX(EY eY2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        QX a2 = this;
        a2.I = c2;
        a2.i = Lists.newArrayList();
        a2.J = new short[ysa.s];
        QX qX = a2;
        a2.M = new Baa((int)b2, d2);
        c2.J().f.l((int)b2, d2);
    }

    public void J() {
        QX a2;
        QX qX = a2;
        qX.J(EY.J((EY)a2.I).J(a2.M.j, qX.M.A));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) {
        int d2 = n3;
        QX b2 = this;
        if (b2.j == 0) {
            EY.f((EY)b2.I).add(b2);
        }
        QX qX = b2;
        qX.k |= vRa.d << (d2 >> AQa.P);
        if (qX.j < ysa.s) {
            void a2;
            short c2;
            c2 = (short)(c2 << lqa.s | a2 << Yqa.i | d2);
            int n5 = d2 = uSa.E;
            while (n5 < b2.j) {
                if (b2.J[d2] == c2) {
                    return;
                }
                n5 = ++d2;
            }
            int n6 = b2.j;
            b2.j = n6 + vRa.d;
            b2.J[n6] = c2;
        }
    }

    public static /* synthetic */ Baa J(QX a2) {
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public void J(KC kC2) {
        int b2;
        QX qX = this;
        int n2 = b2 = uSa.E;
        while (n2 < qX.i.size()) {
            bFa bFa2 = qX.i.get(b2);
            if (!bFa2.M.contains(qX.M)) {
                void a2;
                bFa2.I.J((KC)a2);
            }
            n2 = ++b2;
        }
    }
}

