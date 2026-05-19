/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lz
 *  Pqa
 *  aSa
 *  uRa
 *  vRa
 *  xy
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xy_3 {
    public final double M;
    public final double k;
    public final double j;
    public final double J;
    public final double A;
    public final double I;

    public double l(xy xy2, double d2) {
        double a2;
        xy_3 c2 = xy2;
        xy_3 b2 = this;
        if (c2.M > b2.j && c2.j < b2.M && c2.k > b2.I && c2.I < b2.k) {
            if (a2 > aSa.V && c2.A <= b2.J) {
                double d3;
                double d4 = b2.J - c2.A;
                if (d3 < a2) {
                    a2 = d4;
                }
            } else if (a2 < aSa.V && c2.J >= b2.A) {
                double d5;
                double d6 = b2.A - c2.J;
                if (d5 > a2) {
                    a2 = d6;
                }
            }
            return a2;
        }
        return a2;
    }

    private boolean C(Lz lz2) {
        xy_3 b2 = lz2;
        xy_3 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (((Lz)b2).j >= a2.j && ((Lz)b2).j <= a2.M && ((Lz)b2).J >= a2.I && ((Lz)b2).J <= a2.k) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public xy_3(XF xF2, XF xF3) {
        void b2;
        xy_3 a2;
        Object c2 = xF3;
        xy_3 xy_32 = a2 = this;
        Object object = c2;
        xy_3 xy_33 = a2;
        void v3 = b2;
        a2.J = v3.getX();
        xy_33.j = v3.getY();
        xy_33.I = b2.getZ();
        a2.A = object.getX();
        xy_32.M = object.getY();
        xy_32.k = c2.getZ();
    }

    public xy J(xy xy2) {
        xy_3 a2;
        xy_3 b2 = xy2;
        xy_3 xy_32 = a2 = this;
        double d2 = Math.min(xy_32.J, b2.J);
        double d3 = Math.min(xy_32.j, b2.j);
        double d4 = Math.min(xy_32.I, b2.I);
        double d5 = Math.max(xy_32.A, b2.A);
        double d6 = Math.max(xy_32.M, b2.M);
        double d7 = Math.max(xy_32.k, b2.k);
        return new xy_3(d2, d3, d4, d5, d6, d7);
    }

    public boolean J(xy xy2) {
        xy_3 b2 = xy2;
        xy_3 a2 = this;
        if (b2.A > a2.J && b2.J < a2.A) {
            if (b2.M > a2.j && b2.j < a2.M) {
                if (b2.k > a2.I && b2.I < a2.k) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public static xy J(double f2, double e2, double d2, double c2, double b2, double a2) {
        double d3 = Math.min(f2, c2);
        double d4 = Math.min(e2, b2);
        double d5 = Math.min(d2, a2);
        c2 = Math.max(f2, c2);
        e2 = Math.max(e2, b2);
        d2 = Math.max(d2, a2);
        return new xy_3(d3, d4, d5, c2, e2, d2);
    }

    public double f(xy xy2, double d2) {
        double a2;
        xy_3 c2 = xy2;
        xy_3 b2 = this;
        if (c2.A > b2.J && c2.J < b2.A && c2.M > b2.j && c2.j < b2.M) {
            if (a2 > aSa.V && c2.k <= b2.I) {
                double d3;
                double d4 = b2.I - c2.k;
                if (d3 < a2) {
                    a2 = d4;
                }
            } else if (a2 < aSa.V && c2.I >= b2.k) {
                double d5;
                double d6 = b2.k - c2.I;
                if (d5 > a2) {
                    a2 = d6;
                }
            }
            return a2;
        }
        return a2;
    }

    public xy C(double c2, double b2, double a2) {
        xy_3 d2;
        return new xy_3(d2.J + c2, d2.j + b2, d2.I + a2, d2.A + c2, d2.M + b2, d2.k + a2);
    }

    private boolean l(Lz lz2) {
        xy_3 b2 = lz2;
        xy_3 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (((Lz)b2).A >= a2.J && ((Lz)b2).A <= a2.A && ((Lz)b2).J >= a2.I && ((Lz)b2).J <= a2.k) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public xy l(double c2, double b2, double a2) {
        double d2;
        double d3;
        xy_3 d4;
        xy_3 xy_32 = d4;
        double d5 = xy_32.J;
        double d6 = xy_32.j;
        double d7 = xy_32.I;
        double d8 = xy_32.A;
        double d9 = xy_32.M;
        double d10 = xy_32.k;
        if (c2 < aSa.V) {
            d5 += c2;
            d3 = b2;
        } else {
            if (c2 > aSa.V) {
                d8 += c2;
            }
            d3 = b2;
        }
        if (d3 < aSa.V) {
            d6 += b2;
            d2 = a2;
        } else {
            if (b2 > aSa.V) {
                d9 += b2;
            }
            d2 = a2;
        }
        if (d2 < aSa.V) {
            d7 += a2;
        } else if (a2 > aSa.V) {
            d10 += a2;
        }
        return new xy_3(d5, d6, d7, d8, d9, d10);
    }

    public xy_3(double f2, double e2, double d2, double c2, double b2, double a2) {
        xy_3 g2;
        xy_3 xy_32 = g2;
        xy_3 xy_33 = g2;
        xy_3 xy_34 = g2;
        xy_34.J = Math.min(f2, c2);
        xy_34.j = Math.min(e2, b2);
        xy_33.I = Math.min(d2, a2);
        xy_33.A = Math.max(f2, c2);
        xy_32.M = Math.max(e2, b2);
        xy_32.k = Math.max(d2, a2);
    }

    public String toString() {
        xy_3 a2;
        return new StringBuilder().insert(5 >> 3, Fsa.e).append(a2.J).append(TOa.n).append(a2.j).append(TOa.n).append(a2.I).append(Pqa.V).append(a2.A).append(TOa.n).append(a2.M).append(TOa.n).append(a2.k).append(XOa.D).toString();
    }

    public xy f(double c2, double b2, double a2) {
        xy_3 d2;
        xy_3 xy_32 = d2;
        double d3 = xy_32.J - c2;
        double d4 = xy_32.j - b2;
        double d5 = xy_32.I - a2;
        c2 = xy_32.A + c2;
        b2 = xy_32.M + b2;
        a2 = xy_32.k + a2;
        return new xy_3(d3, d4, d5, c2, b2, a2);
    }

    public RY J(Lz lz2, Lz lz3) {
        Lz a2;
        DZ b2;
        xy_3 xy_32 = this;
        void v0 = b2;
        Lz lz4 = v0.l(a2, xy_32.J);
        Lz lz5 = v0.l(a2, xy_32.A);
        Lz lz6 = v0.f(a2, xy_32.j);
        Lz lz7 = v0.f(a2, xy_32.M);
        Lz lz8 = v0.J(a2, xy_32.I);
        a2 = v0.J(a2, xy_32.k);
        if (!xy_32.C(lz4)) {
            lz4 = null;
        }
        if (!xy_32.C(lz5)) {
            lz5 = null;
        }
        if (!xy_32.l(lz6)) {
            lz6 = null;
        }
        if (!xy_32.l(lz7)) {
            lz7 = null;
        }
        if (!xy_32.f(lz8)) {
            lz8 = null;
        }
        if (!xy_32.f(a2)) {
            a2 = null;
        }
        xy_3 c2 = null;
        if (lz4 != null) {
            c2 = lz4;
        }
        if (lz5 != null && (c2 == null || b2.l(lz5) < b2.l((Lz)c2))) {
            c2 = lz5;
        }
        if (lz6 != null && (c2 == null || b2.l(lz6) < b2.l((Lz)c2))) {
            c2 = lz6;
        }
        if (lz7 != null && (c2 == null || b2.l(lz7) < b2.l((Lz)c2))) {
            c2 = lz7;
        }
        if (lz8 != null && (c2 == null || b2.l(lz8) < b2.l((Lz)c2))) {
            c2 = lz8;
        }
        if (a2 != null && (c2 == null || b2.l(a2) < b2.l((Lz)c2))) {
            c2 = a2;
        }
        if (c2 == null) {
            return null;
        }
        b2 = null;
        b2 = c2 == lz4 ? DZ.WEST : (c2 == lz5 ? DZ.EAST : (c2 == lz6 ? DZ.DOWN : (c2 == lz7 ? DZ.UP : (c2 == lz8 ? DZ.NORTH : DZ.SOUTH))));
        return new RY((Lz)c2, b2);
    }

    public boolean J() {
        xy_3 a2;
        if (Double.isNaN(a2.J) || Double.isNaN(a2.j) || Double.isNaN(a2.I) || Double.isNaN(a2.A) || Double.isNaN(a2.M) || Double.isNaN(a2.k)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private boolean f(Lz lz2) {
        xy_3 b2 = lz2;
        xy_3 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (((Lz)b2).A >= a2.J && ((Lz)b2).A <= a2.A && ((Lz)b2).j >= a2.j && ((Lz)b2).j <= a2.M) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double J() {
        xy_3 a2;
        xy_3 xy_32 = a2;
        double d2 = xy_32.A - a2.J;
        xy_3 xy_33 = a2;
        double d3 = xy_32.M - xy_33.j;
        double d4 = xy_33.k - a2.I;
        return (d2 + d3 + d4) / uRa.I;
    }

    public double J(xy xy2, double d2) {
        double a2;
        xy_3 c2 = xy2;
        xy_3 b2 = this;
        if (c2.A > b2.J && c2.J < b2.A && c2.k > b2.I && c2.I < b2.k) {
            if (a2 > aSa.V && c2.M <= b2.j) {
                double d3;
                double d4 = b2.j - c2.M;
                if (d3 < a2) {
                    a2 = d4;
                }
            } else if (a2 < aSa.V && c2.j >= b2.M) {
                double d5;
                double d6 = b2.M - c2.j;
                if (d5 > a2) {
                    a2 = d6;
                }
            }
            return a2;
        }
        return a2;
    }

    public boolean J(Lz lz2) {
        xy_3 b2 = lz2;
        xy_3 a2 = this;
        if (((Lz)b2).A > a2.J && ((Lz)b2).A < a2.A) {
            if (((Lz)b2).j > a2.j && ((Lz)b2).j < a2.M) {
                if (((Lz)b2).J > a2.I && ((Lz)b2).J < a2.k) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public xy J(double c2, double b2, double a2) {
        xy_3 d2;
        xy_3 xy_32 = d2;
        double d3 = xy_32.J + c2;
        double d4 = xy_32.j + b2;
        double d5 = xy_32.I + a2;
        c2 = xy_32.A - c2;
        b2 = xy_32.M - b2;
        a2 = xy_32.k - a2;
        return new xy_3(d3, d4, d5, c2, b2, a2);
    }
}

