/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Oqa
 *  SOa
 *  ad
 *  cI
 *  if
 *  yD
 */
import java.awt.Color;
import java.util.Iterator;

public final class yD_2
extends jb {
    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        yD_2 a2;
        int c2 = n3;
        yD_2 yD_22 = a2 = this;
        if.C((double)yD_22.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ga.transparent(WF.J()), (Color)Bc.Za.transparent(WF.J()));
        cI.J((Runnable)OF.J((yD)yD_22));
        super.J((int)b2, c2);
        cI.J();
    }

    public yD_2() {
        yD_2 yD_22;
        yD_2 yD_23 = yD_22 = this;
        super(Oqa.ROW, uSa.E, uSa.E);
        yD_23.J(Color.WHITE);
        yD_23.J = lQa.Fa;
        yD_23.I = SOa.w;
        yD_23.f().clear();
        Iterator<String> a2 = WF.l().iterator();
        Object object = a2;
        while (object.hasNext()) {
            String string = (String)a2.next();
            object = a2;
            yD_22.f((ad)new iF(string));
        }
    }

    public static /* synthetic */ void J(yD a2) {
        if.J((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ga, uSa.E != 0);
    }
}

