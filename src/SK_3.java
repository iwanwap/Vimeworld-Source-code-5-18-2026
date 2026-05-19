/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SK
 *  WN
 *  sG
 *  vRa
 *  xM
 */
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class SK_3 {
    public boolean B;
    public float d;
    public Float a;
    public float b;
    public Integer l;
    public SK e;
    public String G;
    public String D;
    public boolean f;
    public int F;
    public String g;
    public String L;
    public K E;
    public Float m;
    public float C;
    public Float i;
    public float M;
    public int k;
    public Float j;
    public String J;
    public Float A;
    public float I;

    public SK J() {
        SK_3 sK_3 = this;
        SK_3 a2 = new SK_3();
        SK_3 sK_32 = sK_3;
        SK_3 sK_33 = a2;
        SK_3 sK_34 = sK_3;
        a2.E = sK_3.E;
        a2.F = sK_34.F;
        sK_33.I = -sK_34.I;
        sK_33.d = -sK_3.d;
        a2.b = -sK_32.b;
        a2.C = -sK_32.C;
        a2.M = -sK_3.M;
        return a2;
    }

    public SK_3(xM xM2) {
        SK_3 sK_3;
        SK_3 sK_32;
        SK_3 sK_33;
        SK_3 sK_34;
        SK_3 sK_35;
        SK_3 b2 = xM2;
        SK_3 a2 = this;
        a2.f = uSa.E;
        a2.E = sG.A;
        a2.F = osa.Ja;
        a2.k = osa.Ja;
        a2.f = vRa.d;
        if (b2.hasXExact()) {
            SK_3 sK_36 = b2;
            sK_35 = sK_36;
            a2.i = Float.valueOf(sK_36.getXExact());
        } else if (b2.hasXExpr()) {
            SK_3 sK_37 = b2;
            sK_35 = sK_37;
            a2.G = sK_37.getXExpr();
        } else {
            a2.I = b2.getX();
            sK_35 = b2;
        }
        if (sK_35.hasYExact()) {
            SK_3 sK_38 = b2;
            sK_34 = sK_38;
            a2.a = Float.valueOf(sK_38.getYExact());
        } else {
            SK_3 sK_39 = a2;
            if (b2.hasYExpr()) {
                sK_39.g = b2.getYExpr();
                sK_34 = b2;
            } else {
                sK_39.d = b2.getY();
                sK_34 = b2;
            }
        }
        if (sK_34.hasRotateExact()) {
            SK_3 sK_310 = b2;
            sK_33 = sK_310;
            a2.j = Float.valueOf(sK_310.getRotateExact());
        } else {
            SK_3 sK_311 = a2;
            if (b2.hasRotateExpr()) {
                sK_311.J = b2.getRotateExpr();
                sK_33 = b2;
            } else {
                sK_311.b = b2.getRotate();
                sK_33 = b2;
            }
        }
        if (sK_33.hasDuration()) {
            SK_3 sK_312 = a2;
            sK_312.F = sK_312.k = b2.getDuration();
        }
        if (b2.hasNextDelay()) {
            a2.k = b2.getNextDelay();
        }
        if (b2.hasColor()) {
            a2.l = b2.getColor();
        }
        if (b2.hasEasing()) {
            SK_3 sK_313 = b2;
            sK_32 = sK_313;
            a2.E = sG.J((WN)sK_313.getEasing(), (K)a2.E);
        } else {
            if (b2.hasEasingExpr()) {
                a2.E = sG.J((String)b2.getEasingExpr(), (K)a2.E);
            }
            sK_32 = b2;
        }
        if (sK_32.hasScaleExact()) {
            SK_3 sK_314 = a2;
            sK_314.m = sK_314.A = Float.valueOf(b2.getScaleExact());
            sK_3 = b2;
        } else if (b2.hasScaleExpr()) {
            SK_3 sK_315 = a2;
            sK_315.D = sK_315.L = b2.getScaleExpr();
            sK_3 = b2;
        } else if (b2.hasScale()) {
            SK_3 sK_316 = a2;
            sK_316.C = sK_316.M = b2.getScale();
            sK_3 = b2;
        } else {
            SK_3 sK_317;
            if (b2.hasScaleXExact()) {
                SK_3 sK_318 = b2;
                sK_317 = sK_318;
                a2.m = Float.valueOf(sK_318.getScaleXExact());
            } else if (b2.hasScaleXExpr()) {
                SK_3 sK_319 = b2;
                sK_317 = sK_319;
                a2.D = sK_319.getScaleXExpr();
            } else {
                if (b2.hasScaleX()) {
                    a2.C = b2.getScaleX();
                }
                sK_317 = b2;
            }
            if (sK_317.hasScaleYExact()) {
                SK_3 sK_320 = b2;
                sK_3 = sK_320;
                a2.A = Float.valueOf(sK_320.getScaleYExact());
            } else if (b2.hasScaleYExpr()) {
                SK_3 sK_321 = b2;
                sK_3 = sK_321;
                a2.L = sK_321.getScaleYExpr();
            } else {
                if (b2.hasScaleY()) {
                    a2.M = b2.getScaleY();
                }
                sK_3 = b2;
            }
        }
        if (sK_3.hasNext()) {
            SK_3 sK_322 = a2;
            sK_322.e = new SK_3(b2.getNext());
        }
        if (b2.hasCyclic() && b2.getCyclic()) {
            a2.B = vRa.d;
            a2.J();
        }
    }

    public SK_3() {
        SK_3 a2;
        a2.f = uSa.E;
        a2.E = sG.A;
        a2.F = osa.Ja;
        a2.k = osa.Ja;
    }

    private void J() {
        SK_3 sK_3 = this;
        if (sK_3.e != null) {
            Set set = Collections.newSetFromMap(new IdentityHashMap());
            set.add(sK_3);
            set.add(sK_3.e);
            SK_3 a2 = sK_3.e;
            SK_3 sK_32 = a2;
            while (sK_32.e != null) {
                a2 = a2.e;
                if (set.contains(a2)) {
                    sK_3.B = uSa.E;
                    return;
                }
                set.add(a2);
                sK_32 = a2;
            }
            a2.e = sK_3;
        }
    }

    public SK_3(SK sK2) {
        SK_3 a2;
        SK_3 b2 = sK2;
        SK_3 sK_3 = a2 = this;
        SK_3 sK_32 = b2;
        SK_3 sK_33 = a2;
        SK_3 sK_34 = b2;
        SK_3 sK_35 = a2;
        SK_3 sK_36 = b2;
        SK_3 sK_37 = a2;
        SK_3 sK_38 = b2;
        SK_3 sK_39 = a2;
        SK_3 sK_310 = b2;
        SK_3 sK_311 = a2;
        SK_3 sK_312 = b2;
        SK_3 sK_313 = a2;
        SK_3 sK_314 = b2;
        a2.f = uSa.E;
        a2.E = sG.A;
        a2.F = osa.Ja;
        a2.k = osa.Ja;
        a2.l = sK_314.l;
        sK_313.E = sK_314.E;
        sK_313.I = b2.I;
        a2.i = sK_312.i;
        sK_311.G = sK_312.G;
        sK_311.d = b2.d;
        a2.a = sK_310.a;
        sK_39.g = sK_310.g;
        sK_39.C = b2.C;
        a2.m = sK_38.m;
        sK_37.D = sK_38.D;
        sK_37.M = b2.M;
        a2.A = sK_36.A;
        sK_35.L = sK_36.L;
        sK_35.b = b2.b;
        a2.j = sK_34.j;
        sK_33.J = sK_34.J;
        sK_33.F = b2.F;
        a2.k = sK_32.k;
        sK_3.e = sK_32.e;
        sK_3.B = b2.B;
    }
}

