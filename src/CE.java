/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  DQa
 *  Fpa
 *  JPa
 *  NCa
 *  PTa
 *  Waa
 *  pqa
 *  tca
 *  vRa
 */
import java.util.Objects;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CE
implements D {
    private boolean reset;
    private String name;
    private int tick;
    private boolean clamp;
    private float fade;
    private float speed;

    public void J(String string) {
        String b2 = string;
        CE a2 = this;
        a2.name = b2;
    }

    public int J() {
        CE a2;
        return a2.tick;
    }

    public CE(String string) {
        CE a2;
        String b2 = string;
        CE cE = a2 = this;
        a2.name = Mqa.y;
        a2.clamp = vRa.d;
        a2.reset = vRa.d;
        a2.speed = pqa.r;
        cE.fade = eua.C;
        cE.tick = uSa.E;
        cE.name = b2;
    }

    public boolean l() {
        CE a2;
        return a2.clamp;
    }

    public String J() {
        CE a2;
        return a2.name;
    }

    /*
     * WARNING - void declaration
     */
    public void J(NCa nCa2) {
        void a2;
        CE cE = this;
        if (a2 instanceof Waa) {
            CE b2 = (Waa)a2;
            if (b2.J(DQa.N, Yqa.i)) {
                cE.name = b2.J(DQa.N);
            }
            if (b2.J(PTa.D, zOa.v)) {
                cE.clamp = b2.f(PTa.D);
            }
            if (b2.J(JPa.z, zOa.v)) {
                cE.reset = b2.f(JPa.z);
            }
            if (b2.J(Fpa.C, zOa.v)) {
                cE.speed = b2.J(Fpa.C);
            }
            if (b2.J(ATa.R, zOa.v)) {
                cE.fade = b2.J(ATa.R);
            }
            if (b2.J(rSa.G, zOa.v)) {
                cE.tick = b2.J(rSa.G);
                return;
            }
        } else if (a2 instanceof tca) {
            cE.name = ((tca)a2).J();
        }
    }

    public CE() {
        CE a2;
        a2.name = Mqa.y;
        a2.clamp = vRa.d;
        a2.reset = vRa.d;
        a2.speed = pqa.r;
        a2.fade = eua.C;
        a2.tick = uSa.E;
    }

    public float f() {
        CE a2;
        return a2.fade;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        void a2;
        CE cE = this;
        if (a2 instanceof CE) {
            CE b2 = (CE)a2;
            if (Objects.equals(cE.name, b2.name) && cE.clamp == b2.clamp && cE.reset == b2.reset && cE.speed == b2.speed && cE.fade == b2.fade && cE.tick == b2.tick) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return super.equals(a2);
    }

    public void f(float f2) {
        float b2 = f2;
        CE a2 = this;
        a2.fade = b2;
    }

    public float J() {
        CE a2;
        return a2.speed;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        CE a2 = this;
        a2.reset = b2;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        CE a2 = this;
        a2.clamp = b2;
    }

    public NCa J() {
        CE cE = this;
        if (!cE.name.isEmpty() && cE.J()) {
            return new tca(cE.name);
        }
        CE a2 = new Waa();
        if (!cE.name.isEmpty()) {
            a2.J(DQa.N, cE.name);
        }
        if (!cE.clamp) {
            a2.J(PTa.D, uSa.E != 0);
        }
        if (!cE.reset) {
            a2.J(JPa.z, uSa.E != 0);
        }
        if (cE.speed != pqa.r) {
            a2.J(Fpa.C, cE.speed);
        }
        if (cE.fade != eua.C) {
            a2.J(ATa.R, (int)cE.fade);
        }
        if (cE.tick != 0) {
            a2.J(rSa.G, cE.tick);
        }
        return a2;
    }

    public void J(float f2) {
        float b2 = f2;
        CE a2 = this;
        a2.speed = b2;
    }

    public boolean f() {
        CE a2;
        return a2.reset;
    }

    public void J(int n2) {
        int b2 = n2;
        CE a2 = this;
        a2.tick = b2;
    }

    public boolean J() {
        CE a2;
        if (a2.clamp && a2.reset && a2.speed == pqa.r && a2.fade == eua.C && a2.tick == 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

