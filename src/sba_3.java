/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  QFa
 *  TQa
 *  XAa
 *  XTa
 *  asa
 *  bAa
 *  iea
 *  vRa
 */
public final class sba_3 {
    /*
     * WARNING - void declaration
     */
    public void J(bAa bAa2) {
        void a2;
        int b2;
        sba_3 sba_32 = this;
        iea[] ieaArray = iea.values();
        int n2 = ieaArray.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            iea iea2 = ieaArray[b2];
            Object[] objectArray = new Object[XTa.W];
            objectArray[uSa.E] = Qpa.t;
            objectArray[vRa.d] = Qpa.t;
            objectArray[uqa.g] = asa.c;
            objectArray[yRa.d] = Character.valueOf((char)TQa.ca);
            objectArray[AQa.P] = new Mda(QFa.cd, vRa.d, iea2.getMetadata());
            objectArray[tTa.h] = Character.valueOf((char)cPa.Ea);
            objectArray[uua.p] = Gea.t;
            a2.J(new Mda(Gea.gC, vRa.d, iea2.getDyeDamage()), objectArray);
            n3 = ++b2;
        }
        void v2 = a2;
        v2.J((UB)new XAa(null));
        v2.J((UB)new aca(null));
    }

    public sba_3() {
        sba_3 a2;
    }
}

