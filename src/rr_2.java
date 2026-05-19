/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GQ
 *  Gr
 *  Kh
 *  TI
 *  Tg
 *  UG
 *  UI
 *  Wsa
 *  XM
 *  XTa
 *  Yra
 *  aSa
 *  k
 *  kta
 *  pqa
 *  qh
 *  rr
 *  uKa
 *  uN
 */
import org.apache.commons.codec.digest.DigestUtils;

public class rr_2
extends nP {
    public UI M;
    public PG k;
    public final UG j;
    private final boolean J;
    public float A;
    public int I;

    public UG J(qh qh2) {
        rr_2 b2 = qh2;
        rr_2 a2 = this;
        if ((b2 = OT.i.g.J((qh)b2, GQ.J((rr)a2))) == null) {
            throw new IllegalStateException(Yra.B);
        }
        return b2;
    }

    @Override
    public float e() {
        rr_2 a2;
        return a2.j.J();
    }

    public rr_2(k k2, XM xM2) {
        rr_2 rr_22;
        String a2;
        rr_2 c2 = k2;
        rr_2 b2 = this;
        super((k)c2, (XM)a2);
        b2.A = pqa.r;
        b2.I = Wsa.K;
        b2.M = UI.CLAMP;
        c2 = a2.getEImage();
        if (c2.hasLoadingColor()) {
            b2.I = c2.getLoadingColor();
        }
        if (c2.hasGifSpeed()) {
            b2.A = c2.getGifSpeed();
        }
        if (c2.hasRenderHint()) {
            b2.M = UI.fromProto((uN)c2.getRenderHint());
        }
        if (c2.hasPath()) {
            a2 = c2.getPath();
        } else if (c2.hasResource()) {
            a2 = OT.i.C.J(c2.getResource());
        } else if (c2.hasImageData()) {
            a2 = new StringBuilder().insert(3 >> 2, FRa.W).append(DigestUtils.md5Hex(c2.getImageData().toByteArray())).toString();
        } else {
            throw new IllegalArgumentException(Qra.N);
        }
        a2 = new qh(a2);
        if (c2.hasImageData()) {
            ((qh)a2).C = c2.getImageData().toByteArray();
        }
        if (c2.hasGifStreaming()) {
            ((qh)a2).i = c2.getGifStreaming() ? TI.ENABLED : TI.DISABLED;
        }
        ((qh)a2).M = b2.M;
        if (c2.hasHttpCache()) {
            ((qh)a2).m = c2.getHttpCache();
        }
        if (c2.hasHttpCacheDuration()) {
            ((qh)a2).k = c2.getHttpCacheDuration();
        }
        if (c2.hasMemCache()) {
            ((qh)a2).A = c2.getMemCache();
        }
        b2.J = ((qh)a2).A;
        b2.j = b2.J((qh)a2);
        rr_2 rr_23 = b2;
        b2.k = new PG(b2.F);
        if (Math.abs(rr_22.A - pqa.r) > ZSa.r) {
            b2.k.j = b2.A;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void J(long a2) {
        rr_2 b2;
        switch (Gr.I[b2.j.I.ordinal()]) {
            case 1: {
                rr_2 rr_22 = b2;
                Kh.J((double)aSa.V, (double)aSa.V, (double)b2.J(), (double)b2.f(), (int)rr_22.l(rr_22.I), (double)b2.I.f());
                return;
            }
            case 2: {
                Kh.J((double)aSa.V, (double)aSa.V, (double)b2.J(), (double)b2.f(), (int)b2.f(sra.ca), (double)b2.I.f());
                return;
            }
            case 3: {
                uKa.H();
                rr_2 rr_23 = b2;
                rr_2.J(rr_23.x.J);
                rr_23.j.J((rr)b2);
                return;
            }
        }
    }

    public static /* synthetic */ String J(rr rr2) {
        rr rr3 = rr2;
        Object a2 = new StringBuilder().insert(2 & 5, kta.z).append(rr3.J()).append(XTa.Z).toString();
        if (rr3.s instanceof Tg) {
            Tg tg2 = (Tg)rr3.s;
            a2 = new StringBuilder().insert(3 >> 2, (String)a2).append(DPa.X).append(tg2.e).toString();
        }
        return a2;
    }

    @Override
    public void J() {
        rr_2 a2;
        if (!a2.J && a2.j != null) {
            a2.j.J();
        }
        super.J();
    }

    @Override
    public float d() {
        rr_2 a2;
        return a2.j.f();
    }
}

