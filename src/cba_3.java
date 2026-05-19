/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  QFa
 *  TQa
 *  XTa
 *  bAa
 *  iea
 *  uQa
 *  vRa
 */
import net.minecraft.block.Block;

public final class cba_3 {
    private Object[][] I;

    /*
     * WARNING - void declaration
     */
    public void J(bAa bAa2) {
        void a2;
        int b2;
        cba_3 cba_32 = this;
        int n2 = b2 = uSa.E;
        while (n2 < cba_32.I.length) {
            Block block = (Block)cba_32.I[b2][uSa.E];
            Mda mda2 = (Mda)cba_32.I[b2][vRa.d];
            Object[] objectArray = new Object[tTa.h];
            objectArray[uSa.E] = Qpa.t;
            objectArray[vRa.d] = Qpa.t;
            objectArray[uqa.g] = Qpa.t;
            objectArray[yRa.d] = Character.valueOf((char)TQa.ca);
            objectArray[AQa.P] = mda2;
            a2.J(new Mda(block), objectArray);
            Object[] objectArray2 = new Object[yRa.d];
            objectArray2[uSa.E] = uQa.Y;
            objectArray2[vRa.d] = Character.valueOf((char)TQa.ca);
            objectArray2[uqa.g] = block;
            a2.J(mda2, objectArray2);
            n2 = ++b2;
        }
        Object[] objectArray = new Object[tTa.h];
        objectArray[uSa.E] = Qpa.t;
        objectArray[vRa.d] = Qpa.t;
        objectArray[uqa.g] = Qpa.t;
        objectArray[yRa.d] = Character.valueOf((char)TQa.ca);
        objectArray[AQa.P] = Gea.hc;
        a2.J(new Mda(Gea.Bb), objectArray);
        Object[] objectArray3 = new Object[yRa.d];
        objectArray3[uSa.E] = uQa.Y;
        objectArray3[vRa.d] = Character.valueOf((char)TQa.ca);
        objectArray3[uqa.g] = Gea.Bb;
        a2.J(new Mda(Gea.hc, WOa.fa), objectArray3);
    }

    public cba_3() {
        cba_3 a2;
        Object[][] objectArrayArray = new Object[WOa.fa][];
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = QFa.WC;
        objectArray[vRa.d] = new Mda(Gea.Bb, WOa.fa);
        objectArrayArray[uSa.E] = objectArray;
        Object[] objectArray2 = new Object[uqa.g];
        objectArray2[uSa.E] = QFa.eB;
        objectArray2[vRa.d] = new Mda(Gea.GA, WOa.fa);
        objectArrayArray[vRa.d] = objectArray2;
        Object[] objectArray3 = new Object[uqa.g];
        objectArray3[uSa.E] = QFa.ca;
        objectArray3[vRa.d] = new Mda(Gea.b, WOa.fa);
        objectArrayArray[uqa.g] = objectArray3;
        Object[] objectArray4 = new Object[uqa.g];
        objectArray4[uSa.E] = QFa.Ab;
        objectArray4[vRa.d] = new Mda(Gea.kc, WOa.fa);
        objectArrayArray[yRa.d] = objectArray4;
        Object[] objectArray5 = new Object[uqa.g];
        objectArray5[uSa.E] = QFa.qA;
        objectArray5[vRa.d] = new Mda(Gea.Q, WOa.fa, iea.BLUE.getDyeDamage());
        objectArrayArray[AQa.P] = objectArray5;
        Object[] objectArray6 = new Object[uqa.g];
        objectArray6[uSa.E] = QFa.Rc;
        objectArray6[vRa.d] = new Mda(Gea.zc, WOa.fa);
        objectArrayArray[tTa.h] = objectArray6;
        Object[] objectArray7 = new Object[uqa.g];
        objectArray7[uSa.E] = QFa.Ea;
        objectArray7[vRa.d] = new Mda(Gea.qc, WOa.fa, uSa.E);
        objectArrayArray[uua.p] = objectArray7;
        Object[] objectArray8 = new Object[uqa.g];
        objectArray8[uSa.E] = QFa.uA;
        objectArray8[vRa.d] = new Mda(Gea.DC, WOa.fa);
        objectArrayArray[XTa.W] = objectArray8;
        Object[] objectArray9 = new Object[uqa.g];
        objectArray9[uSa.E] = QFa.iA;
        objectArray9[vRa.d] = new Mda(Gea.ua, WOa.fa);
        objectArrayArray[Yqa.i] = objectArray9;
        a2.I = objectArrayArray;
    }
}

