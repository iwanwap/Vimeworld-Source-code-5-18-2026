/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Gaa
 *  JSa
 *  Lga
 *  Vz
 *  fia
 *  ld
 *  oGa
 *  vL
 *  vRa
 *  yX
 */
public final class ny_3 {
    public ny_3() {
        ny_3 a2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ld J(u var0, ld var1_1, vL var2_2) throws oGa {
        block11: {
            block12: {
                block10: {
                    c = var1_1;
                    b = var0;
                    var4_3 = null;
                    if (!(c instanceof yX)) break block10;
                    var3_4 /* !! */  = (yX)c;
                    var5_5 = var3_4 /* !! */ .d();
                    if (fia.J((String)var5_5)) {
                        var6_8 = fia.J((u)b, (String)var5_5, vL.class);
                        if (var6_8.size() != vRa.d) {
                            throw new Lga();
                        }
                        var5_5 = ((vL)var6_8.get(uSa.E)).J();
                    }
                    var4_3 = a != null && var5_5.equals(JSa.a) != false ? new yX(a.J(), var3_4 /* !! */ .C()) : new yX(var5_5, var3_4 /* !! */ .C());
                    ((yX)var4_3).J(var3_4 /* !! */ .J());
                    v0 = c;
                    break block11;
                }
                if (!(c instanceof Gaa)) break block12;
                var3_4 /* !! */  = ((Gaa)c).C();
                var4_3 = fia.J((u)b, (String)var3_4 /* !! */ );
                if (var4_3 == null) {
                    var4_3 = new CY(Mqa.y);
                }
                ** GOTO lbl39
            }
            if (c instanceof CY) {
                var4_3 = new CY(((CY)c).C());
                v0 = c;
            } else {
                if (!(c instanceof CZ)) {
                    return c;
                }
                var3_4 /* !! */  = ((CZ)c).J();
                v1 = var5_6 = uSa.E;
                while (v1 < ((Vz)var3_4 /* !! */ ).length) {
                    var6_8 = var3_4 /* !! */ [var5_6];
                    if (var6_8 instanceof ld) {
                        var3_4 /* !! */ [var5_6] = ny_3.J(b, (ld)var6_8, (vL)a);
                    }
                    v1 = ++var5_6;
                }
                var4_3 = new CZ(((CZ)c).C(), (Object[])var3_4 /* !! */ );
lbl39:
                // 2 sources

                v0 = c;
            }
        }
        var3_4 /* !! */  = v0.J();
        if (var3_4 /* !! */  != null) {
            var4_3.J(var3_4 /* !! */ .J());
        }
        v2 = var5_7 = c.J().iterator();
        while (v2.hasNext()) {
            var6_8 = (ld)var5_7.next();
            v2 = var5_7;
            var4_3.J(ny_3.J(b, (ld)var6_8, (vL)a));
        }
        return var4_3;
    }
}

