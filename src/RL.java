/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 *  pPa
 *  vRa
 *  vpa
 *  wk
 */
public abstract class RL
implements t {
    public t result;
    public String name;
    public t[] args;

    public t J(int n2) {
        int b2 = n2;
        RL a2 = this;
        if (b2 < 0 || b2 >= a2.args.length) {
            throw new IllegalStateException(new StringBuilder().insert(3 & 4, VPa.v).append(b2).append(vpa.V).append(a2.args.length).toString());
        }
        return a2.args[b2].J();
    }

    @Override
    public void J(double a2) {
    }

    /*
     * WARNING - void declaration
     */
    public RL(t[] tArray, String string) throws Exception {
        void a2;
        int c22;
        void b2;
        RL rL2 = this;
        RL rL3 = rL2;
        rL3.result = new wk(aSa.V);
        if (((void)b2).length < rL2.J()) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = rL2.f();
            objectArray[vRa.d] = rL2.J();
            objectArray[uqa.g] = ((void)b2).length;
            String c22 = String.format(eta.t, objectArray);
            throw new Exception(c22);
        }
        int n2 = c22 = uSa.E;
        while (n2 < ((void)b2).length) {
            int n3 = c22++;
            rL2.J(n3, (t)b2[n3]);
            n2 = c22;
        }
        rL2.args = b2;
        rL2.name = a2;
    }

    public int J() {
        return uSa.E;
    }

    public String toString() {
        int n2;
        RL rL2 = this;
        Object a2 = Mqa.y;
        int n3 = n2 = uSa.E;
        while (n3 < rL2.args.length) {
            a2 = new StringBuilder().insert(2 & 5, (String)a2).append(rL2.args[n2].toString()).toString();
            if (n2 < rL2.args.length - vRa.d) {
                a2 = new StringBuilder().insert(2 & 5, (String)a2).append(TOa.n).toString();
            }
            n3 = ++n2;
        }
        return new StringBuilder().insert(3 & 4, rL2.f()).append(pPa.k).append((String)a2).append(hpa.b).toString();
    }

    @Override
    public void J(String object) {
        Object b2 = object;
        object = this;
    }

    public void J(int n2, t t2) {
        t c2 = t2;
        t2 = this;
    }

    public String f() {
        RL a2;
        return a2.name;
    }
}

