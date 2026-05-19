/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  wk
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class AK_3
implements t {
    public t value;
    public t result;

    @Override
    public String J() {
        AK_3 a2;
        return a2.value.J();
    }

    public abstract void J();

    public AK_3(t t2) {
        t b2 = t2;
        AK_3 a2 = this;
        AK_3 aK_3 = a2;
        a2.result = new wk(aSa.V);
        a2.value = b2;
    }

    @Override
    public t J() {
        AK_3 a2;
        AK_3 aK_3 = a2;
        aK_3.J();
        return aK_3.result;
    }

    @Override
    public void J(double a2) {
        AK_3 b2;
        b2.value.J(a2);
    }

    @Override
    public boolean f() {
        AK_3 a2;
        return a2.value.f();
    }

    @Override
    public boolean J() {
        AK_3 a2;
        return a2.value.J();
    }

    @Override
    public double J() {
        AK_3 a2;
        return a2.value.J();
    }

    @Override
    public void J(String string) {
        String b2 = string;
        AK_3 a2 = this;
        a2.value.J(b2);
    }
}

