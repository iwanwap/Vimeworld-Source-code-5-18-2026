/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tpa
 *  aSa
 *  pPa
 *  vRa
 *  wk
 *  yk
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xJ_1
implements t {
    private t result;
    public yk operation;
    public static boolean DEBUG = uSa.E;
    public t b;
    public t a;

    @Override
    public boolean f() {
        xJ_1 a2;
        if (a2.a.f() || a2.b.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public double J() {
        xJ_1 a2;
        if (!a2.f() && a2.operation == yk.EQUALS) {
            if (a2.a.J().equals(a2.b.J())) {
                return oua.i;
            }
            return aSa.V;
        }
        xJ_1 xJ_12 = a2;
        return xJ_12.operation.calculate(xJ_12.a.J(), a2.b.J());
    }

    /*
     * WARNING - void declaration
     */
    public xJ_1(yk yk2, t t2, t t3) {
        void b2;
        void c2;
        xJ_1 a2;
        t d2 = t3;
        xJ_1 xJ_12 = a2 = this;
        xJ_1 xJ_13 = a2;
        a2.result = new wk(aSa.V);
        a2.operation = c2;
        xJ_12.a = b2;
        xJ_12.b = d2;
    }

    @Override
    public String J() {
        xJ_1 a2;
        if (a2.operation == yk.ADD) {
            return new StringBuilder().insert(3 & 4, a2.a.J()).append(a2.b.J()).toString();
        }
        return a2.a.J();
    }

    public String toString() {
        xJ_1 a2;
        if (DEBUG) {
            return new StringBuilder().insert(5 >> 3, pPa.k).append(a2.a.toString()).append(Tpa.E).append(a2.operation.sign).append(Tpa.E).append(a2.b.toString()).append(hpa.b).toString();
        }
        return new StringBuilder().insert(3 & 4, a2.a.toString()).append(Tpa.E).append(a2.operation.sign).append(Tpa.E).append(a2.b.toString()).toString();
    }

    @Override
    public void J(double a2) {
    }

    @Override
    public void J(String object) {
        Object b2 = object;
        object = this;
    }

    @Override
    public t J() {
        xJ_1 xJ_12;
        xJ_1 a2;
        if (!a2.f() && a2.operation == yk.ADD) {
            xJ_1 xJ_13 = a2;
            xJ_12 = xJ_13;
            a2.result.J(xJ_13.J());
        } else {
            xJ_1 xJ_14 = a2;
            xJ_12 = xJ_14;
            xJ_14.result.J(a2.J());
        }
        return xJ_12.result;
    }

    @Override
    public boolean J() {
        xJ_1 a2;
        return yk.isTrue((double)a2.J());
    }
}

