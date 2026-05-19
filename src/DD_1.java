/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  DD
 *  Oqa
 *  SOa
 *  ad
 *  cI
 *  if
 *  vF
 *  wE
 */
import java.awt.Color;
import java.util.Iterator;

public final class DD_1
extends jb {
    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        DD_1 a2;
        int c2 = n3;
        DD_1 dD_1 = a2 = this;
        if.C((double)dD_1.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ga.transparent(WF.J()), (Color)Bc.Za.transparent(WF.J()));
        cI.J((Runnable)wE.J((DD)dD_1));
        super.J((int)b2, c2);
        cI.J();
    }

    public DD_1() {
        DD_1 dD_1;
        DD_1 dD_12 = dD_1 = this;
        super(Oqa.ROW, uSa.E, uSa.E);
        dD_12.J(Color.WHITE);
        dD_12.J = cPa.x;
        dD_12.I = SOa.w;
        dD_12.f().clear();
        Iterator<byte[]> a2 = WF.J().iterator();
        Object object = a2;
        while (object.hasNext()) {
            byte[] byArray = (byte[])a2.next();
            object = a2;
            dD_1.f((ad)new vF(byArray));
        }
    }

    public static /* synthetic */ void J(DD a2) {
        if.J((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ga, uSa.E != 0);
    }
}

