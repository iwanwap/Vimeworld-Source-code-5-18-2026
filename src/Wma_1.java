/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rna
 *  aqa
 *  pY
 */
import java.net.UnknownHostException;

public final class Wma_1
implements Runnable {
    public final /* synthetic */ Rna I;

    public Wma_1(Rna rna) {
        Wma_1 b2 = rna;
        Wma_1 a2 = this;
        a2.I = b2;
    }

    @Override
    public void run() {
        Wma_1 a2;
        try {
            Rna.J((Rna)a2.I).J().f(Rna.J((Rna)a2.I));
            return;
        }
        catch (UnknownHostException unknownHostException) {
            Wma_1 wma_1 = a2;
            Rna.J((Rna)wma_1.I).pingToServer = fqa.Da;
            Rna.J((Rna)wma_1.I).serverMOTD = pY.DARK_RED + aqa.s;
            return;
        }
        catch (Exception exception) {
            Wma_1 wma_1 = a2;
            Rna.J((Rna)wma_1.I).pingToServer = fqa.Da;
            Rna.J((Rna)wma_1.I).serverMOTD = pY.DARK_RED + Qpa.L;
            return;
        }
    }
}

