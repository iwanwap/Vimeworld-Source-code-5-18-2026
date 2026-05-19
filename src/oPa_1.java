/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gua
 *  Kpa
 */
public final class oPa_1
extends Thread {
    public final /* synthetic */ Kpa I;

    @Override
    public void run() {
        oPa_1 a2;
        oPa_1 oPa_12 = a2;
        while (oPa_12.I.l) {
            try {
                Thread.sleep(Gua.R);
                oPa_12 = a2;
            }
            catch (InterruptedException interruptedException) {
                oPa_12 = a2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public oPa_1(Kpa kpa2, String string) {
        void b2;
        String c2 = string;
        oPa_1 a2 = this;
        a2.I = b2;
        super(c2);
    }
}

