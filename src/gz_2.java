/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CZ
 *  Ey
 *  Gl
 *  ld
 *  vL
 *  vRa
 */
public final class gz_2
extends GX {
    private vL I;

    /*
     * WARNING - void declaration
     */
    public gz_2(String string, vL vL2, vL vL3) {
        void b2;
        void c2;
        gz_2 d2 = vL3;
        gz_2 a2 = this;
        super((String)c2, (vL)b2);
        a2.I = d2;
    }

    @Override
    public vL f() {
        gz_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ld J(Gl gl2) {
        void a2;
        gz_2 gz_22 = this;
        ld ld2 = gz_22.I == null ? gz_22.A.J() : gz_22.I.J();
        gz_2 b2 = gz_22.I instanceof Gl ? ((Gl)gz_22.I).J() : null;
        String string = new StringBuilder().insert(3 & 4, Qpa.K).append(gz_22.d).toString();
        String string2 = new StringBuilder().insert(2 & 5, string).append(vsa.Ga).toString();
        if (b2 != null && b2.l() && Ey.J((String)string2)) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = a2.J();
            objectArray[vRa.d] = ld2;
            objectArray[uqa.g] = b2.J();
            return new CZ(string2, objectArray);
        }
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = a2.J();
        objectArray[vRa.d] = ld2;
        return new CZ(string, objectArray);
    }

    public vL J() {
        gz_2 a2;
        return a2.A;
    }
}

