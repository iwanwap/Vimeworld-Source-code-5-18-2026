/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FI
 *  ISa
 *  JPa
 *  Oz
 *  QM
 *  UG
 *  Ypa
 *  cN
 *  pqa
 *  pua
 *  vRa
 *  ysa
 */
public final class sI_3 {
    public float P;
    public float u;
    public b O;
    public float t;
    public float R;
    public int Q;
    public UG N;
    public float T;
    public float p;
    public int n;
    public byte[] s;
    public float w;
    public float W;
    public b q;
    public float x;
    public b v;
    public float o;
    public int h;
    public int K;
    public boolean H;
    public int c;
    public b B;
    public int d;
    public float a;
    public int b;
    public String l;
    public boolean e;
    public boolean G;
    public int D;
    public int f;
    public b F;
    public float g;
    public b L;
    public FI E;
    public float m;
    public float C;
    public float i;
    public float M;
    public float k;
    public float j;
    public float J;
    public float A;
    public b I;

    public sI_3() {
        sI_3 a2;
        sI_3 sI_32 = a2;
        sI_3 sI_33 = a2;
        sI_3 sI_34 = a2;
        sI_3 sI_35 = a2;
        a2.t = pqa.r;
        a2.w = JPa.N;
        a2.W = WRa.e;
        a2.D = ISa.l;
        a2.K = uSa.E;
        a2.Q = pua.o;
        a2.n = ysa.s;
        a2.d = Ypa.A;
        a2.e = uSa.E;
        a2.G = uSa.E;
        a2.H = uSa.E;
        sI_35.E = null;
        sI_35.F = null;
        sI_34.I = null;
        sI_34.L = null;
        sI_33.v = null;
        sI_33.q = null;
        sI_32.O = null;
        sI_32.B = null;
        sI_32.p = pqa.r;
    }

    /*
     * Unable to fully structure code
     */
    public sI_3(cN var1_1) {
        b = var1_1;
        a = this;
        v0 = b;
        v1 = a;
        v2 = b;
        v3 = a;
        v4 = b;
        v5 = a;
        v6 = b;
        v7 = a;
        v8 = a;
        v9 = a;
        v10 = a;
        v11 = a;
        super();
        a.t = pqa.r;
        a.w = JPa.N;
        a.W = WRa.e;
        a.D = ISa.l;
        a.K = uSa.E;
        a.Q = pua.o;
        a.n = ysa.s;
        a.d = Ypa.A;
        a.e = uSa.E;
        a.G = uSa.E;
        a.H = uSa.E;
        v11.E = null;
        v11.F = null;
        v10.I = null;
        v10.L = null;
        v9.v = null;
        v9.q = null;
        v8.O = null;
        v8.B = null;
        v8.p = pqa.r;
        v7.x = b.getX();
        v7.A = b.getY();
        a.a = v6.getZ();
        v5.o = v6.getSpreadX();
        v5.k = b.getSpreadY();
        a.P = v4.getSpreadZ();
        v3.M = v4.getMotionX();
        v3.g = b.getMotionY();
        a.C = v2.getMotionZ();
        v1.u = v2.getSpreadMotionX();
        v1.m = b.getSpreadMotionY();
        a.i = v0.getSpreadMotionZ();
        if (v0.hasScale()) {
            a.t = b.getScale();
        }
        a.j = b.getSpreadScale();
        if (b.hasAirFriction()) {
            a.W = b.getAirFriction();
        }
        a.J = b.getSpreadAirFriction();
        if (b.hasGravity()) {
            a.w = b.getGravity();
        }
        a.T = b.getSpreadGravity();
        if (b.hasDuration()) {
            a.D = b.getDuration();
        }
        v12 = a;
        v13 = b;
        a.c = b.getSpreadDuration();
        v12.b = v13.getDelay();
        v12.f = v13.getSpreadDelay();
        if (b.hasFade()) {
            a.K = b.getFade();
        }
        if (b.hasLight()) {
            a.d = Oz.f((int)b.getLight(), (int)uSa.E, (int)Ypa.A);
        }
        if (b.hasDynamicLight()) {
            a.e = b.getDynamicLight();
        }
        if (b.hasColor()) {
            a.Q = b.getColor();
        }
        if (b.hasRenderDistance()) {
            a.n = b.getRenderDistance();
        }
        if (!b.hasRandomMirror()) ** GOTO lbl-1000
        switch (JG.I[b.getRandomMirror().ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                a.G = vRa.d;
                v14 = b;
                break;
            }
            case 2: {
                a.H = vRa.d;
                v14 = b;
                break;
            }
            case 3: {
                v15 = a;
                v15.H = vRa.d;
                v15.G = vRa.d;
            }
            default: lbl-1000:
            // 2 sources

            {
                v14 = b;
            }
        }
        if (v14.hasAttachment()) {
            a.E = FI.J((QM)b.getAttachment());
        }
        if (b.hasImagePath()) {
            v16 = b;
            v17 = v16;
            a.l = v16.getImagePath();
        } else if (b.hasResource()) {
            v18 = b;
            v17 = v18;
            a.l = OT.i.C.J(v18.getResource());
        } else {
            throw new IllegalArgumentException(eta.n);
        }
        if (v17.hasGifSpeed()) {
            a.p = b.getGifSpeed();
        }
        a.R = b.getSpreadGifSpeed();
        if (b.hasDelayExpr()) {
            a.F = aj.I.J(b.getDelayExpr());
        }
        if (b.hasOffsetXExpr()) {
            a.I = aj.I.J(b.getOffsetXExpr());
        }
        if (b.hasOffsetYExpr()) {
            a.L = aj.I.J(b.getOffsetYExpr());
        }
        if (b.hasOffsetZExpr()) {
            a.v = aj.I.J(b.getOffsetZExpr());
        }
        if (b.hasMotionXExpr()) {
            a.q = aj.I.J(b.getMotionXExpr());
        }
        if (b.hasMotionYExpr()) {
            a.O = aj.I.J(b.getMotionYExpr());
        }
        if (b.hasMotionZExpr()) {
            a.B = aj.I.J(b.getMotionZExpr());
        }
    }
}

