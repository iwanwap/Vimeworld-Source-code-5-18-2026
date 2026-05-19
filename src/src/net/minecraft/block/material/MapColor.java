/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Fpa
 *  Lra
 *  NTa
 *  Pqa
 *  QSa
 *  Qsa
 *  RPa
 *  RQa
 *  SQa
 *  Spa
 *  Sqa
 *  Ssa
 *  TQa
 *  Tpa
 *  URa
 *  Uta
 *  XTa
 *  Ypa
 *  Zua
 *  bpa
 *  cQa
 *  cRa
 *  fTa
 *  hTa
 *  jRa
 *  kta
 *  lPa
 *  lqa
 *  pPa
 *  psa
 *  pua
 *  uOa
 *  vRa
 *  vpa
 *  wOa
 *  wra
 *  ysa
 */
package net.minecraft.block.material;

public final class MapColor {
    public static final MapColor pinkColor;
    public static final MapColor snowColor;
    public static final MapColor ironColor;
    public static final MapColor blackColor;
    public static final MapColor magentaColor;
    public static final MapColor netherrackColor;
    public static final MapColor terracottaCyanColor;
    public static final MapColor clothColor;
    public static final MapColor limeColor;
    public int colorValue;
    public static final MapColor warpedNyliumColor;
    public static final MapColor blueColor;
    public final int colorIndex;
    public static final MapColor brownColor;
    public static final MapColor greenColor;
    public static final MapColor woodColor;
    private static final String __OBFID = "CL_00000544";
    public static final MapColor terracottaLightGrayColor;
    public static final MapColor waterColor;
    public static final MapColor foliageColor;
    public static final MapColor terracottaWhiteColor;
    public static final MapColor tntColor;
    public static final MapColor warpedStemColor;
    public static final MapColor grayColor;
    public static final MapColor[] mapColorArray;
    public static final MapColor yellowColor;
    public static final MapColor iceColor;
    public static final MapColor cyanColor;
    public static final MapColor dirtColor;
    public static final MapColor quartzColor;
    public static final MapColor silverColor;
    public static final MapColor purpleColor;
    public static final MapColor redColor;
    public static final MapColor lightBlueColor;
    public static final MapColor diamondColor;
    public static final MapColor grassColor;
    public static final MapColor goldColor;
    public static final MapColor glowLichenColor;
    public static final MapColor sandColor;
    public static final MapColor lapisColor;
    public static final MapColor clayColor;
    public static final MapColor adobeColor;
    public static final MapColor airColor;
    public static final MapColor deepslateColor;
    public static final MapColor stoneColor;
    public static final MapColor obsidianColor;
    public static final MapColor emeraldColor;

    public int J(int n2) {
        int a2;
        MapColor mapColor = this;
        int b2 = fTa.Ja;
        if (a2 == yRa.d) {
            b2 = RQa.R;
        }
        if (a2 == uqa.g) {
            b2 = osa.Ja;
        }
        if (a2 == vRa.d) {
            b2 = fTa.Ja;
        }
        if (a2 == 0) {
            b2 = cRa.n;
        }
        MapColor mapColor2 = mapColor;
        a2 = (mapColor2.colorValue >> ERa.C & osa.Ja) * b2 / osa.Ja;
        int n3 = (mapColor2.colorValue >> Yqa.i & osa.Ja) * b2 / osa.Ja;
        b2 = (mapColor2.colorValue & osa.Ja) * b2 / osa.Ja;
        return gsa.X | a2 << ERa.C | n3 << Yqa.i | b2;
    }

    /*
     * WARNING - void declaration
     */
    private MapColor(int n2, int n3) {
        int c2 = n2;
        MapColor b2 = this;
        if (c2 >= 0 && c2 <= Ssa.u) {
            void a2;
            MapColor mapColor = b2;
            mapColor.colorIndex = c2;
            mapColor.colorValue = a2;
            MapColor.mapColorArray[c2] = b2;
            return;
        }
        throw new IndexOutOfBoundsException(Sqa.x);
    }

    static {
        mapColorArray = new MapColor[ysa.s];
        airColor = new MapColor(uSa.E, uSa.E);
        grassColor = new MapColor(vRa.d, Spa.Da);
        sandColor = new MapColor(uqa.g, wta.c);
        clothColor = new MapColor(yRa.d, psa.J);
        tntColor = new MapColor(AQa.P, Zqa.E);
        iceColor = new MapColor(tTa.h, EPa.Ga);
        ironColor = new MapColor(uua.p, qQa.R);
        foliageColor = new MapColor(XTa.W, RPa.j);
        snowColor = new MapColor(Yqa.i, pua.o);
        clayColor = new MapColor(WOa.fa, bpa.G);
        dirtColor = new MapColor(NTa.C, vpa.N);
        stoneColor = new MapColor(pPa.f, Qsa.b);
        waterColor = new MapColor(lqa.s, Zra.p);
        woodColor = new MapColor(uua.s, Jsa.K);
        quartzColor = new MapColor(hpa.Z, Npa.S);
        adobeColor = new MapColor(Ypa.A, lqa.p);
        magentaColor = new MapColor(ERa.C, POa.B);
        lightBlueColor = new MapColor(yta.Ka, SQa.Ka);
        yellowColor = new MapColor(yOa.B, Era.Ka);
        limeColor = new MapColor(wOa.t, Zua.q);
        pinkColor = new MapColor(kTa.j, Qsa.Aa);
        grayColor = new MapColor(wOa.h, uOa.Fa);
        silverColor = new MapColor(cQa.o, Nra.Ja);
        cyanColor = new MapColor(AQa.ba, hTa.Ga);
        purpleColor = new MapColor(osa.c, STa.U);
        blueColor = new MapColor(kTa.g, Uta.k);
        brownColor = new MapColor(ITa.E, kta.R);
        greenColor = new MapColor(Lra.e, osa.B);
        redColor = new MapColor(EPa.O, zOa.D);
        blackColor = new MapColor(ITa.A, ysa.A);
        goldColor = new MapColor(Fsa.d, wOa.H);
        diamondColor = new MapColor(tua.U, Fsa.F);
        lapisColor = new MapColor(fPa.i, URa.j);
        emeraldColor = new MapColor(Zqa.G, mPa.W);
        obsidianColor = new MapColor(Tpa.z, eta.v);
        netherrackColor = new MapColor(TQa.ca, xua.G);
        terracottaWhiteColor = new MapColor(Qsa.Ha, QSa.U);
        terracottaLightGrayColor = new MapColor(Yqa.D, qQa.k);
        terracottaCyanColor = new MapColor(wra.e, tTa.r);
        warpedNyliumColor = new MapColor(Fpa.ca, SPa.Ha);
        warpedStemColor = new MapColor(Upa.D, jRa.u);
        deepslateColor = new MapColor(lPa.p, Pqa.I);
        glowLichenColor = new MapColor(tua.w, WOa.h);
    }
}

