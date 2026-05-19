/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Ey
 *  Gl
 *  gZ
 *  ld
 *  vL
 *  vRa
 */
public class GX
extends gZ {
    public vL A;
    private boolean I;

    public vL f() {
        GX a2;
        return a2.A;
    }

    public GX J() {
        GX a2;
        a2.I = vRa.d;
        return a2;
    }

    public boolean D() {
        GX a2;
        return a2.I;
    }

    public boolean e() {
        GX a2;
        if (a2.A != null && a2.A instanceof Gl && !(a2.A instanceof Sx)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public GX(String string, vL vL2) {
        void b2;
        GX c2 = vL2;
        GX a2 = this;
        super((String)b2);
        a2.I = uSa.E;
        a2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public ld J(Gl gl2) {
        void a2;
        GX gX = this;
        GX b2 = gX.A instanceof Gl ? ((Gl)gX.A).J() : null;
        String string = new StringBuilder().insert(3 >> 2, Qpa.K).append(gX.d).toString();
        String string2 = new StringBuilder().insert(3 & 4, string).append(vsa.Ga).toString();
        if (b2 != null && b2.l() && Ey.J((String)string2)) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = a2.J();
            objectArray[vRa.d] = gX.A.J();
            objectArray[uqa.g] = b2.J();
            return new CZ(string2, objectArray);
        }
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = a2.J();
        objectArray[vRa.d] = gX.A.J();
        return new CZ(string, objectArray);
    }
}

