/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  dT
 */
public final class QR
extends Hs {
    /*
     * Unable to fully structure code
     */
    public void f(dT var1_1) {
        b = var1_1;
        a = this;
        var2_2 = a.model.J((dT)b);
        if (b.view != gt.OUTFIT) ** GOTO lbl10
        if (b.player.q()) {
            v0 = b;
            var2_2.J(a.model.J());
        } else {
            var2_2.J(null);
lbl10:
            // 2 sources

            v0 = b;
        }
        if (v0.view == gt.GUI) {
            var2_2.J(a.model.J());
        }
    }

    public QR() {
        QR a2;
    }
}

