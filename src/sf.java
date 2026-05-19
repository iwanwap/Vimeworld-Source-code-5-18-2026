/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Epa
 *  JPa
 *  Rua
 *  URa
 *  Waa
 *  Wsa
 *  aSa
 *  bSa
 *  bpa
 *  hqa
 *  vPa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sf
implements D {
    private boolean visible;
    private ResourceLocation texture;
    private int filtering = hqa.s;
    private int color;
    private boolean lighting;
    private boolean normals = uSa.E;
    private boolean smooth = uSa.E;
    private Integer overrideTextureGlId;

    public int f() {
        sf a2;
        return a2.color;
    }

    public sf clone() {
        sf sf2 = this;
        sf a2 = new sf();
        sf sf3 = sf2;
        sf sf4 = a2;
        sf sf5 = sf2;
        a2.texture = sf2.texture;
        a2.filtering = sf5.filtering;
        sf4.normals = sf5.normals;
        sf4.smooth = sf2.smooth;
        a2.visible = sf3.visible;
        a2.lighting = sf3.lighting;
        a2.color = sf2.color;
        return a2;
    }

    public void f(int n2) {
        int b2 = n2;
        sf a2 = this;
        a2.filtering = b2;
    }

    public void J(Waa waa2) {
        sf b2 = waa2;
        sf a2 = this;
        if (b2.J(aSa.f)) {
            sf sf2 = a2;
            sf2.texture = new ResourceLocation(b2.J(aSa.f));
        }
        if (b2.J(Hra.j, Yqa.i)) {
            int n2 = a2.filtering = b2.J(Hra.j).equalsIgnoreCase(bSa.u) ? rSa.z : hqa.s;
        }
        if (b2.J(URa.Q, zOa.v)) {
            a2.normals = b2.f(URa.Q);
        }
        if (b2.J(Rua.K, zOa.v)) {
            a2.smooth = b2.f(Rua.K);
        }
        if (b2.J(vPa.n, zOa.v)) {
            a2.visible = b2.f(vPa.n);
        }
        if (b2.J(Epa.Z, zOa.v)) {
            a2.lighting = b2.f(Epa.Z);
        }
        if (b2.J(JPa.ca, zOa.v)) {
            a2.color = b2.J(JPa.ca);
        }
    }

    public boolean C() {
        sf a2;
        return a2.visible;
    }

    public int J() {
        sf a2;
        return a2.filtering;
    }

    public boolean l() {
        sf a2;
        return a2.lighting;
    }

    public Waa J(Waa waa2) {
        sf b2 = waa2;
        sf a2 = this;
        if (b2 == null) {
            b2 = new Waa();
        }
        if (a2.texture != null) {
            b2.J(aSa.f, a2.texture.J());
        }
        b2.J(Hra.j, a2.filtering == hqa.s ? bpa.q : bSa.u);
        sf sf2 = b2;
        sf2.J(URa.Q, a2.normals);
        sf2.J(Rua.K, a2.smooth);
        sf2.J(vPa.n, a2.visible);
        sf2.J(Epa.Z, a2.lighting);
        sf2.J(JPa.ca, a2.color);
        return sf2;
    }

    public void J(ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        sf a2 = this;
        a2.texture = b2;
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        sf a2 = this;
        a2.smooth = b2;
    }

    public sf() {
        sf a2;
        a2.visible = vRa.d;
        a2.lighting = vRa.d;
        a2.color = Wsa.K;
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        sf a2 = this;
        a2.normals = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        sf a2 = this;
        a2.color = b2;
    }

    public boolean f() {
        sf a2;
        return a2.normals;
    }

    public void J(Integer n2) {
        Integer b2 = n2;
        sf a2 = this;
        a2.overrideTextureGlId = b2;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        sf a2 = this;
        a2.lighting = b2;
    }

    public ResourceLocation J() {
        sf a2;
        return a2.texture;
    }

    public Integer J() {
        sf a2;
        return a2.overrideTextureGlId;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        sf a2 = this;
        a2.visible = b2;
    }

    public boolean J() {
        sf a2;
        return a2.smooth;
    }
}

