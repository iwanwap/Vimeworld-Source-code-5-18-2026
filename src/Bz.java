/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Cra
 *  EQa
 *  ERa
 *  ISa
 *  JSa
 *  JTa
 *  LQa
 *  Lra
 *  Mda
 *  NOa
 *  NPa
 *  NTa
 *  PTa
 *  QFa
 *  Qqa
 *  Qsa
 *  Qta
 *  TPa
 *  TQa
 *  Tpa
 *  Wsa
 *  XSa
 *  XTa
 *  Xsa
 *  Ypa
 *  Yra
 *  Zpa
 *  asa
 *  bSa
 *  bqa
 *  cQa
 *  fsa
 *  hqa
 *  hra
 *  jRa
 *  kPa
 *  lPa
 *  lqa
 *  pPa
 *  pQa
 *  pqa
 *  pua
 *  qta
 *  uOa
 *  vRa
 *  wOa
 *  wPa
 *  yQa
 *  zsa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower$EnumFlowerType;

public final class Bz
extends Enum<Bz> {
    public static final /* enum */ Bz DIAGONAL_RIGHT_MIRROR;
    public static final /* enum */ Bz GRADIENT;
    public static final /* enum */ Bz STRIPE_DOWNRIGHT;
    private String patternID;
    public static final /* enum */ Bz BORDER;
    public static final /* enum */ Bz SQUARE_TOP_RIGHT;
    public static final /* enum */ Bz BRICKS;
    public static final /* enum */ Bz SQUARE_BOTTOM_LEFT;
    public static final /* enum */ Bz MOJANG;
    public static final /* enum */ Bz TRIANGLES_TOP;
    public static final /* enum */ Bz CIRCLE_MIDDLE;
    public static final /* enum */ Bz STRIPE_TOP;
    public static final /* enum */ Bz BASE;
    private String[] craftingLayers;
    public static final /* enum */ Bz HALF_HORIZONTAL;
    public static final /* enum */ Bz TRIANGLE_TOP;
    public static final /* enum */ Bz GRADIENT_UP;
    public static final /* enum */ Bz SQUARE_TOP_LEFT;
    public static final /* enum */ Bz CREEPER;
    public static final /* enum */ Bz HALF_VERTICAL_MIRROR;
    public static final /* enum */ Bz DIAGONAL_LEFT_MIRROR;
    public static final /* enum */ Bz CURLY_BORDER;
    public static final /* enum */ Bz RHOMBUS_MIDDLE;
    public static final /* enum */ Bz HALF_HORIZONTAL_MIRROR;
    public static final /* enum */ Bz STRIPE_MIDDLE;
    public static final /* enum */ Bz STRAIGHT_CROSS;
    public static final /* enum */ Bz STRIPE_BOTTOM;
    public static final /* enum */ Bz STRIPE_DOWNLEFT;
    public static final /* enum */ Bz DIAGONAL_RIGHT;
    public static final /* enum */ Bz TRIANGLES_BOTTOM;
    public static final /* enum */ Bz CROSS;
    public static final /* enum */ Bz STRIPE_RIGHT;
    private static final /* synthetic */ Bz[] $VALUES;
    public static final /* enum */ Bz TRIANGLE_BOTTOM;
    public static final /* enum */ Bz STRIPE_LEFT;
    public static final /* enum */ Bz STRIPE_SMALL;
    public static final /* enum */ Bz HALF_VERTICAL;
    public static final /* enum */ Bz STRIPE_CENTER;
    private Mda patternCraftingStack;
    public static final /* enum */ Bz DIAGONAL_LEFT;
    public static final /* enum */ Bz FLOWER;
    public static final /* enum */ Bz SQUARE_BOTTOM_RIGHT;
    private String patternName;
    public static final /* enum */ Bz SKULL;

    public boolean hasCraftingStack() {
        Bz a2;
        if (a2.patternCraftingStack != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Bz(String string2, String string3) {
        Object c2;
        void b2;
        Bz bz2 = object;
        Object object = string3;
        Bz a2 = bz2;
        a2.craftingLayers = new String[yRa.d];
        Bz bz3 = a2;
        bz3.patternName = b2;
        bz3.patternID = c2;
    }

    public static Bz valueOf(String a2) {
        return Enum.valueOf(Bz.class, a2);
    }

    public String getPatternID() {
        Bz a2;
        return a2.patternID;
    }

    public String getPatternName() {
        Bz a2;
        return a2.patternName;
    }

    public static Bz[] values() {
        return (Bz[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    private Bz(String string2, String string3, Mda mda2) {
        Bz d2;
        void b2;
        void c2;
        Bz bz2 = bz3;
        Bz bz3 = mda2;
        Bz a2 = bz2;
        a2((String)c2, (String)b2);
        a2.patternCraftingStack = d2;
    }

    public boolean hasValidCrafting() {
        Bz a2;
        if (a2.patternCraftingStack != null || a2.craftingLayers[uSa.E] != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String[] getCraftingLayers() {
        Bz a2;
        return a2.craftingLayers;
    }

    public static Bz getPatternByID(String string) {
        int a2;
        String string2 = string;
        Bz[] bzArray = Bz.values();
        int n2 = bzArray.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            Bz bz2 = bzArray[a2];
            if (bz2.patternID.equals(string2)) {
                return bz2;
            }
            n3 = ++a2;
        }
        return null;
    }

    static {
        BASE = new Bz(TPa.Ha, JTa.Z);
        SQUARE_BOTTOM_LEFT = new Bz(jRa.ha, Wsa.O, rQa.W, rQa.W, bSa.j);
        SQUARE_BOTTOM_RIGHT = new Bz(kPa.C, Qra.g, rQa.W, rQa.W, Vra.V);
        SQUARE_TOP_LEFT = new Bz(lPa.y, xua.O, bSa.j, rQa.W, rQa.W);
        SQUARE_TOP_RIGHT = new Bz(asa.K, rSa.r, Vra.V, rQa.W, rQa.W);
        STRIPE_BOTTOM = new Bz(zsa.O, rRa.Z, rQa.W, rQa.W, Qpa.t);
        STRIPE_TOP = new Bz(yQa.F, xqa.Z, Qpa.t, rQa.W, rQa.W);
        STRIPE_LEFT = new Bz(rua.ha, bqa.d, bSa.j, bSa.j, bSa.j);
        STRIPE_RIGHT = new Bz(Zpa.k, xqa.j, Vra.V, Vra.V, Vra.V);
        STRIPE_CENTER = new Bz(Hta.P, pQa.ia, ZSa.A, ZSa.A, ZSa.A);
        STRIPE_MIDDLE = new Bz(Bpa.Fa, APa.z, rQa.W, Qpa.t, rQa.W);
        STRIPE_DOWNRIGHT = new Bz(PQa.i, Lra.F, bSa.j, ZSa.A, Vra.V);
        STRIPE_DOWNLEFT = new Bz(rpa.L, ySa.Ka, Vra.V, ZSa.A, bSa.j);
        STRIPE_SMALL = new Bz(UOa.J, gsa.Ha, SPa.ca, SPa.ca, rQa.W);
        CROSS = new Bz(wua.h, XTa.u, SPa.ca, ZSa.A, SPa.ca);
        STRAIGHT_CROSS = new Bz(hqa.Fa, vsa.H, ZSa.A, Qpa.t, ZSa.A);
        TRIANGLE_BOTTOM = new Bz(Cra.z, pua.C, rQa.W, ZSa.A, SPa.ca);
        TRIANGLE_TOP = new Bz(fsa.U, Qsa.e, SPa.ca, ZSa.A, rQa.W);
        TRIANGLES_BOTTOM = new Bz(XSa.L, eta.V, rQa.W, SPa.ca, ZSa.A);
        TRIANGLES_TOP = new Bz(uOa.l, GPa.ca, ZSa.A, SPa.ca, rQa.W);
        DIAGONAL_LEFT = new Bz(DPa.B, ZSa.X, sqa.Y, bSa.j, rQa.W);
        DIAGONAL_RIGHT = new Bz(ySa.u, WPa.ca, rQa.W, Vra.V, MRa.ca);
        DIAGONAL_LEFT_MIRROR = new Bz(PTa.z, zta.Q, rQa.W, bSa.j, sqa.Y);
        DIAGONAL_RIGHT_MIRROR = new Bz(pqa.O, xTa.N, MRa.ca, Vra.V, rQa.W);
        CIRCLE_MIDDLE = new Bz(Yqa.M, iSa.T, rQa.W, ZSa.A, rQa.W);
        RHOMBUS_MIDDLE = new Bz(nua.e, vRa.aa, ZSa.A, SPa.ca, ZSa.A);
        HALF_VERTICAL = new Bz(Eqa.Ja, Yra.x, sqa.Y, sqa.Y, sqa.Y);
        HALF_HORIZONTAL = new Bz(eta.k, NOa.b, Qpa.t, Qpa.t, rQa.W);
        HALF_VERTICAL_MIRROR = new Bz(Qqa.F, KSa.A, MRa.ca, MRa.ca, MRa.ca);
        HALF_HORIZONTAL_MIRROR = new Bz(BRa.U, hqa.q, rQa.W, Qpa.t, Qpa.t);
        BORDER = new Bz(XOa.d, EQa.Y, Qpa.t, SPa.ca, Qpa.t);
        CURLY_BORDER = new Bz(jRa.p, wPa.A, new Mda(QFa.vC));
        CREEPER = new Bz(qta.B, fsa.V, new Mda(Gea.GB, vRa.d, AQa.P));
        GRADIENT = new Bz(JSa.Y, Lra.f, SPa.ca, ZSa.A, ZSa.A);
        GRADIENT_UP = new Bz(Zpa.fa, Yqa.h, ZSa.A, ZSa.A, SPa.ca);
        BRICKS = new Bz(Xsa.H, hra.T, new Mda(QFa.V));
        SKULL = new Bz(Qta.E, Ypa.U, new Mda(Gea.GB, vRa.d, vRa.d));
        FLOWER = new Bz(hpa.Ha, Qta.d, new Mda((Block)QFa.l, vRa.d, BlockFlower$EnumFlowerType.OXEYE_DAISY.getMeta()));
        MOJANG = new Bz(Cra.N, NPa.w, new Mda(Gea.pb, vRa.d, vRa.d));
        Bz[] bzArray = new Bz[CRa.L];
        bzArray[uSa.E] = BASE;
        bzArray[vRa.d] = SQUARE_BOTTOM_LEFT;
        bzArray[uqa.g] = SQUARE_BOTTOM_RIGHT;
        bzArray[yRa.d] = SQUARE_TOP_LEFT;
        bzArray[AQa.P] = SQUARE_TOP_RIGHT;
        bzArray[tTa.h] = STRIPE_BOTTOM;
        bzArray[uua.p] = STRIPE_TOP;
        bzArray[XTa.W] = STRIPE_LEFT;
        bzArray[Yqa.i] = STRIPE_RIGHT;
        bzArray[WOa.fa] = STRIPE_CENTER;
        bzArray[NTa.C] = STRIPE_MIDDLE;
        bzArray[pPa.f] = STRIPE_DOWNRIGHT;
        bzArray[lqa.s] = STRIPE_DOWNLEFT;
        bzArray[uua.s] = STRIPE_SMALL;
        bzArray[hpa.Z] = CROSS;
        bzArray[Ypa.A] = STRAIGHT_CROSS;
        bzArray[ERa.C] = TRIANGLE_BOTTOM;
        bzArray[yta.Ka] = TRIANGLE_TOP;
        bzArray[yOa.B] = TRIANGLES_BOTTOM;
        bzArray[wOa.t] = TRIANGLES_TOP;
        bzArray[kTa.j] = DIAGONAL_LEFT;
        bzArray[wOa.h] = DIAGONAL_RIGHT;
        bzArray[cQa.o] = DIAGONAL_LEFT_MIRROR;
        bzArray[AQa.ba] = DIAGONAL_RIGHT_MIRROR;
        bzArray[osa.c] = CIRCLE_MIDDLE;
        bzArray[kTa.g] = RHOMBUS_MIDDLE;
        bzArray[ITa.E] = HALF_VERTICAL;
        bzArray[Lra.e] = HALF_HORIZONTAL;
        bzArray[EPa.O] = HALF_VERTICAL_MIRROR;
        bzArray[ITa.A] = HALF_HORIZONTAL_MIRROR;
        bzArray[Fsa.d] = BORDER;
        bzArray[tua.U] = CURLY_BORDER;
        bzArray[fPa.i] = CREEPER;
        bzArray[Zqa.G] = GRADIENT;
        bzArray[Tpa.z] = GRADIENT_UP;
        bzArray[TQa.ca] = BRICKS;
        bzArray[Qsa.Ha] = SKULL;
        bzArray[LQa.c] = FLOWER;
        bzArray[ISa.E] = MOJANG;
        $VALUES = bzArray;
    }

    public Mda getCraftingStack() {
        Bz a2;
        return a2.patternCraftingStack;
    }

    /*
     * WARNING - void declaration
     */
    private Bz(String string2, String string3, String string4, String string5, String string6) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        Bz a2;
        Bz bz2 = object;
        Object object = string6;
        Bz bz3 = a2 = bz2;
        bz3((String)e2, (String)d2);
        bz3.craftingLayers[uSa.E] = c2;
        bz3.craftingLayers[vRa.d] = b2;
        bz3.craftingLayers[uqa.g] = f2;
    }
}

