/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  HY
 *  OCa
 *  Waa
 *  aaa
 *  bpa
 *  gEa
 *  kaa
 *  ld
 *  ny
 *  oGa
 *  pua
 *  uY
 *  vL
 *  vRa
 *  via
 */
import com.google.gson.JsonParseException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aaa_1
extends uY {
    public int k;
    private boolean j;
    public final ld[] J;
    private Sx A;
    private final via I;

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        int b2;
        void a2;
        aaa_1 aaa_12 = this;
        super.J((Waa)a2);
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            String string = HY.J((ld)aaa_12.J[b2]);
            StringBuilder stringBuilder = new StringBuilder().append(bpa.P).append(b2 + vRa.d);
            a2.J(stringBuilder.toString(), string);
            n2 = ++b2;
        }
        aaa_12.I.f((Waa)a2);
    }

    public static /* synthetic */ via J(aaa a2) {
        return a2.I;
    }

    public boolean J() {
        aaa_1 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        int b2;
        void a2;
        aaa_1 aaa_12 = this;
        aaa_12.j = uSa.E;
        super.f((Waa)a2);
        eY eY2 = new eY((aaa)aaa_12);
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            String string = a2.J(bpa.P + (b2 + vRa.d));
            ld ld2 = HY.J((String)string);
            try {
                aaa_12.J[b2] = ny.J((u)eY2, (ld)ld2, (vL)null);
            }
            catch (oGa oGa2) {
                try {
                    aaa_12.J[b2] = ld2;
                }
                catch (JsonParseException jsonParseException) {
                    aaa_12.J[b2] = new CY(string);
                }
            }
            n2 = ++b2;
        }
        aaa_12.I.J((Waa)a2);
    }

    public boolean C() {
        return vRa.d != 0;
    }

    public void J(Sx sx2) {
        Object b2 = sx2;
        aaa_1 a2 = this;
        a2.A = b2;
    }

    public Sx J() {
        aaa_1 a2;
        return a2.A;
    }

    public boolean J(Sx sx2) {
        int n2;
        kaa a2;
        aaa_1 aaa_12 = this;
        a2 = new kaa((aaa)aaa_12, (Sx)a2);
        int n3 = n2 = uSa.E;
        while (n3 < aaa_12.J.length) {
            Object b2;
            Object object = b2 = aaa_12.J[n2] == null ? null : aaa_12.J[n2].J();
            if (b2 != null && b2.J() != null && ((PEa)(b2 = b2.J())).J() == gEa.RUN_COMMAND) {
                OCa.J().J().J((u)a2, ((PEa)b2).J());
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    public via J() {
        aaa_1 a2;
        return a2.I;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        aaa_1 a2 = this;
        a2.j = b2;
        if (!a2.j) {
            a2.A = null;
        }
    }

    public KC J() {
        ld[] ldArray = this;
        ld[] a2 = new ld[AQa.P];
        System.arraycopy(ldArray.J, uSa.E, a2, uSa.E, AQa.P);
        return new ICa(ldArray.worldObj, ldArray.pos, a2);
    }

    public aaa_1() {
        aaa_1 a2;
        ld[] ldArray = new ld[AQa.P];
        ldArray[uSa.E] = new CY(Mqa.y);
        ldArray[vRa.d] = new CY(Mqa.y);
        ldArray[uqa.g] = new CY(Mqa.y);
        ldArray[yRa.d] = new CY(Mqa.y);
        a2.J = ldArray;
        aaa_1 aaa_12 = a2;
        aaa_12.k = pua.o;
        aaa_12.j = vRa.d;
        aaa_1 aaa_13 = a2;
        aaa_13.I = new via();
    }
}

