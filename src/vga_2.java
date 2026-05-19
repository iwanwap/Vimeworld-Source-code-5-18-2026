/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BEa
 *  Gl
 *  Hda
 *  JPa
 *  JSa
 *  LGa
 *  Mda
 *  NTa
 *  Ssa
 *  kba
 *  pPa
 *  qta
 *  sia
 *  vL
 *  vRa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class vga_2
extends wga {
    private static final int[] k;
    private static final String[] j;
    public final int J;
    private static final int[] A;
    private static final int[] I;

    /*
     * WARNING - void declaration
     */
    public float J(int n2, LGa lGa) {
        void a2;
        int c2 = n2;
        vga_2 b2 = this;
        if (b2.J == 0) {
            return (float)c2 * oQa.z;
        }
        if (b2.J == vRa.d && a2 == LGa.UNDEAD) {
            return (float)c2 * MTa.y;
        }
        if (b2.J == uqa.g && a2 == LGa.ARTHROPOD) {
            return (float)c2 * MTa.y;
        }
        return JPa.N;
    }

    public int J(int n2) {
        int b2 = n2;
        vga_2 a2 = this;
        return I[a2.J] + (b2 - vRa.d) * k[a2.J];
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gl gl2, vL vL2, int n2) {
        vga_2 d2 = vL2;
        vga_2 b2 = this;
        if (d2 instanceof Gl) {
            d2 = (Gl)d2;
            if (b2.J == uqa.g && d2.J() == LGa.ARTHROPOD) {
                void a2;
                void c22;
                int c22 = kTa.j + c22.J().nextInt(NTa.C * a2);
                d2.J(new kba(Hda.N.O, c22, yRa.d));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public vga_2(int n2, ResourceLocation resourceLocation, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        vga_2 a2 = this;
        super((int)d2, (ResourceLocation)c2, (int)b2, sia.WEAPON);
        a2.J = e2;
    }

    public int f() {
        return tTa.h;
    }

    public boolean J(wga wga2) {
        vga_2 b2 = wga2;
        vga_2 a2 = this;
        if (!(b2 instanceof vga_2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        vga_2 a2;
        return new StringBuilder().insert(3 & 4, qta.G).append(j[a2.J]).toString();
    }

    static {
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = JSa.H;
        stringArray[vRa.d] = Ssa.P;
        stringArray[uqa.g] = JPa.X;
        j = stringArray;
        int[] nArray = new int[yRa.d];
        nArray[uSa.E] = vRa.d;
        nArray[vRa.d] = tTa.h;
        nArray[uqa.g] = tTa.h;
        I = nArray;
        int[] nArray2 = new int[yRa.d];
        nArray2[uSa.E] = pPa.f;
        nArray2[vRa.d] = Yqa.i;
        nArray2[uqa.g] = Yqa.i;
        k = nArray2;
        int[] nArray3 = new int[yRa.d];
        nArray3[uSa.E] = kTa.j;
        nArray3[vRa.d] = kTa.j;
        nArray3[uqa.g] = kTa.j;
        A = nArray3;
    }

    public boolean J(Mda mda2) {
        vga_2 b2 = mda2;
        vga_2 a2 = this;
        if (b2.J() instanceof BEa) {
            return vRa.d != 0;
        }
        return super.J((Mda)b2);
    }

    public int f(int n2) {
        int b2 = n2;
        vga_2 a2 = this;
        return a2.J(b2) + A[a2.J];
    }
}

