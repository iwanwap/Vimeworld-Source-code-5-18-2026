/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CR
 *  Fr
 *  PQ
 *  Tr
 *  fO
 *  k
 *  pua
 *  sq
 *  tp
 *  vRa
 */
public final class PQ_3
extends tp {
    public int j;
    public int A;
    public mQ I;

    public void l(Bp bp2) {
        PQ_3 a2;
        Object b2 = bp2;
        PQ_3 pQ_3 = a2 = this;
        super.l((Bp)b2);
        if (pQ_3.j >= 0 || a2.A >= 0) {
            a2.J((Bp)b2);
        }
    }

    public PQ_3(ko ko2) {
        ko b2 = ko2;
        PQ_3 a2 = this;
        ko ko3 = b2;
        a2(ko3.getId());
        if (ko3.hasDefaultStartAnimationDuration()) {
            a2.j = b2.getDefaultStartAnimationDuration();
        }
        if (b2.hasDefaultFinishAnimationDuration()) {
            a2.A = b2.getDefaultFinishAnimationDuration();
        }
        a2.J(b2.getElementsList());
        if (b2.hasBehavior()) {
            a2.J(b2.getBehavior());
        }
        sq[] sqArray = new sq[vRa.d];
        sqArray[uSa.E] = new Tr((PQ)a2).J(vRa.d != 0);
        a2.w = new Fr(CR.SCREEN, sqArray);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Bp bp2, fO fO2) {
        void a2;
        PQ_3 b2;
        Object c2 = bp2;
        PQ_3 pQ_3 = b2 = this;
        super.J((Bp)c2, (fO)a2);
        pQ_3.f((Bp)c2);
    }

    private void f(Bp bp2) {
        Object b2 = bp2;
        PQ_3 a2 = this;
        if (a2.j >= 0 || a2.A >= 0) {
            a2.J((Bp)b2);
        }
    }

    private PQ_3(String string) {
        Object b2 = string;
        PQ_3 a2 = this;
        super((k)OT.i.F, (String)b2, dua.ca, dua.ca);
        a2.j = pua.o;
        a2.A = pua.o;
        a2.j = vRa.d;
        a2.c = yG.TOP_LEFT;
    }

    private void J(Bp bp2) {
        Object b2 = bp2;
        PQ_3 a2 = this;
        if (!((Bp)b2).L.j.f && a2.j >= 0) {
            ((Bp)b2).L.j.F = ((Bp)b2).L.j.k = a2.j;
            Object object = b2;
            ((Bp)object).f(((Bp)b2).L.j, ((Bp)object).F);
        }
        if (!((Bp)b2).L.J.f && a2.A >= 0) {
            ((Bp)b2).L.J.F = ((Bp)b2).L.j.k = a2.A;
            ((Bp)b2).m = a2.A;
        }
        if (b2 instanceof tp) {
            b2 = ((tp)b2).J().iterator();
            Object object = b2;
            while (object.hasNext()) {
                Bp bp3 = (Bp)b2.next();
                object = b2;
                a2.J(bp3);
            }
        }
    }

    public void l() {
        PQ_3 a2;
        if (a2.i > OT.e) {
            a2.i = OT.e;
        }
    }
}

