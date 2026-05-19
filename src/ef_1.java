/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  F
 *  JPa
 *  Kd
 *  Le
 *  PF
 *  ZOa
 *  ad
 *  hqa
 *  if
 *  lE
 */
import java.awt.Color;

public final class ef_1
extends ad
implements F {
    private final rc k;
    private final Xe j;
    private float J;
    private final Ii A;
    private final rc I;

    public void J(int n2, int n3) {
        ef_1 a2;
        int c2 = n3;
        ef_1 ef_12 = a2 = this;
        ef_12.J = ef_12.j.J().J();
        ef_12.I = (rc)(ef_12.j.J().f() + a2.j.J().l() / KPa.y - a2.k / KPa.y);
        ef_12.J = (float)((double)ef_12.j.f() / KPa.y - a2.j.J().J() / KPa.y - hqa.ha - a2.j);
        ef_1 ef_13 = a2;
        ef_1 ef_14 = a2;
        if.J((double)ef_12.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)ef_13.k.transparent(ef_13.J), (Color)ef_14.I.transparent(ef_14.J), (Kd)Kd.S_X2);
        ef_12.A.J(Iqa.e, (int)(a2.I + a2.k / KPa.y - (double)a2.A.f(Iqa.e) / KPa.y), (int)(a2.J + Wqa.Z), Bc.Ba.transparent(a2.J).getRGB(), uSa.E != 0);
        ef_12.A.J(UOa.Q, (int)(a2.I + a2.k / KPa.y - (double)a2.A.f(UOa.Q) / KPa.y), (int)(a2.J + Wqa.Z + DPa.Aa), Bc.Ba.transparent(a2.J).getRGB(), uSa.E != 0);
    }

    public ef_1(Xe xe) {
        ef_1 a2;
        Object b2 = xe;
        ef_1 ef_12 = a2 = this;
        ef_1 ef_13 = a2;
        ef_13.J = JPa.N;
        ef_12.j = b2;
        ef_13.A = Le.J((PF)PF.VIME_ART, (lE)lE.THIN, (int)EPa.O);
        ef_12.k = Bc.Ea;
        ef_12.I = Bc.Ja;
        ef_12.k = (rc)ZOa.W;
        ef_12.j = (Xe)Asa.y;
    }
}

