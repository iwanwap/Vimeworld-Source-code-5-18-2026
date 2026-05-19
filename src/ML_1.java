/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  vRa
 *  wk
 *  yk
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ML_1
implements t {
    public t condition;
    public t ifFalse;
    public t ifTrue;
    private t result;

    @Override
    public boolean J() {
        ML_1 a2;
        return yk.isTrue((double)a2.J());
    }

    @Override
    public double J() {
        ML_1 a2;
        if (yk.isTrue((double)a2.condition.J())) {
            return a2.ifTrue.J();
        }
        return a2.ifFalse.J();
    }

    @Override
    public String J() {
        ML_1 a2;
        if (yk.isTrue((double)a2.condition.J())) {
            return a2.ifTrue.J();
        }
        return a2.ifFalse.J();
    }

    public String toString() {
        ML_1 a2;
        return new StringBuilder().insert(3 & 4, a2.condition.toString()).append(Qpa.T).append(a2.ifTrue.toString()).append(yta.o).append(a2.ifFalse.toString()).toString();
    }

    /*
     * WARNING - void declaration
     */
    public ML_1(t t2, t t3, t t4) {
        void b2;
        void c2;
        ML_1 a2;
        t d2 = t4;
        ML_1 mL_1 = a2 = this;
        ML_1 mL_12 = a2;
        a2.result = new wk(aSa.V);
        a2.condition = c2;
        mL_1.ifTrue = b2;
        mL_1.ifFalse = d2;
    }

    @Override
    public t J() {
        ML_1 mL_1;
        ML_1 a2;
        if (a2.f()) {
            ML_1 mL_12 = a2;
            mL_1 = mL_12;
            a2.result.J(mL_12.J());
        } else {
            ML_1 mL_13 = a2;
            mL_1 = mL_13;
            mL_13.result.J(a2.J());
        }
        return mL_1.result;
    }

    @Override
    public boolean f() {
        ML_1 a2;
        if (a2.ifFalse.f() || a2.ifTrue.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void J(double a2) {
    }

    @Override
    public void J(String object) {
        Object b2 = object;
        object = this;
    }
}

