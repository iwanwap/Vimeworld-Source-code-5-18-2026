/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  FB
 *  IA
 *  Oqa
 *  VA
 *  ad
 *  cI
 *  if
 *  ob
 */
import java.awt.Color;

public final class ob_2
extends jb {
    private final FB A;
    private final VA I;

    public void M() {
        ob_2 a2;
        ob_2 ob_22 = a2;
        ob_22.f((ad)ob_22.I);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        ob_2 a2;
        int c2 = n3;
        ob_2 ob_22 = a2 = this;
        if.C((double)ob_22.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ja.transparent(WF.J()), (Color)Bc.Ga.transparent(WF.J()));
        cI.J((Runnable)IA.J((ob)ob_22));
        super.J((int)b2, c2);
        cI.J();
    }

    public void J() {
        ob_2 a2;
        ob_2 ob_22 = a2;
        ob_22.J((ad)ob_22.I);
    }

    public ob_2() {
        ob_2 a2;
        ob_2 ob_22 = a2;
        super(Oqa.ROW, uSa.E, uSa.E);
        ob_2 ob_23 = a2;
        ob_22.A = new FB((ob)a2);
        ob_23.I = new VA((ob)a2);
        ob_22.f((ad)ob_22.A);
        if (OT.i.B.voiceChatKeyBindToggle) {
            a2.M();
        }
    }

    public static /* synthetic */ void J(ob a2) {
        if.J((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Color.WHITE, uSa.E != 0);
    }
}

