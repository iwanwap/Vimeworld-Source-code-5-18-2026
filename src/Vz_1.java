/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  KTa
 *  Vz
 *  Xsa
 *  Zpa
 *  kta
 *  pEa
 *  pY
 *  pua
 *  qy
 *  vRa
 *  wOa
 *  zTa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Vz_1
implements D {
    private static final Vz rootStyle = new yy();
    private Boolean flip;
    private String emit;
    private Boolean italic;
    private Boolean waving;
    private Boolean aberration;
    private Boolean rainbow;
    private PEa chatClickEvent;
    private Boolean shaking;
    private String insertion;
    private Vz parentStyle;
    private Boolean shimmer;
    private pY color;
    private Boolean animatedGradient;
    private Boolean glitchy;
    private qy hexColor;
    private Boolean bold;
    private Boolean strikethrough;
    private Boolean underlined;
    private Boolean obfuscated;
    private pEa chatHoverEvent;

    public static /* synthetic */ pEa J(Vz vz2, pEa pEa2) {
        Vz b2 = pEa2;
        Vz a2 = vz2;
        a2.chatHoverEvent = b2;
        return a2.chatHoverEvent;
    }

    private Vz l() {
        Vz_1 a2;
        if (a2.parentStyle == null) {
            return rootStyle;
        }
        return a2.parentStyle;
    }

    public static /* synthetic */ qy J(Vz vz2, qy qy2) {
        Vz b2 = qy2;
        Vz a2 = vz2;
        a2.hexColor = b2;
        return a2.hexColor;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof Vz_1)) {
            return uSa.E != 0;
        }
        b2 = (Vz_1)b2;
        if (((Vz_1)a2).F() != ((Vz_1)b2).F() || ((Vz_1)a2).J() != ((Vz_1)b2).J() || ((Vz_1)a2).J() != ((Vz_1)b2).J() || ((Vz_1)a2).C() != ((Vz_1)b2).C() || ((Vz_1)a2).G() != ((Vz_1)b2).G() || ((Vz_1)a2).M() != ((Vz_1)b2).M() || ((Vz_1)a2).f() != ((Vz_1)b2).f() || ((Vz_1)a2).i() != ((Vz_1)b2).i() || (((Vz_1)a2).J() == null ? ((Vz_1)b2).J() != null : !((Vz_1)a2).J().equals(((Vz_1)b2).J())) || (((Vz_1)a2).J() == null ? ((Vz_1)b2).J() != null : !((Vz_1)a2).J().equals((Object)((Vz_1)b2).J())) || !(((Vz_1)a2).J() != null ? ((Vz_1)a2).J().equals(((Vz_1)b2).J()) : ((Vz_1)b2).J() == null)) {
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public Vz F(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.underlined = b2;
        return a2;
    }

    public Vz k(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.aberration = b2;
        return a2;
    }

    public static /* synthetic */ String f(Vz a2) {
        return a2.insertion;
    }

    public boolean j() {
        Vz_1 a2;
        if (a2.rainbow == null) {
            return a2.l().j();
        }
        return a2.rainbow;
    }

    public Vz G(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.bold = b2;
        return a2;
    }

    public static /* synthetic */ Boolean F(Vz a2) {
        return a2.rainbow;
    }

    public Vz_1() {
        Vz_1 a2;
    }

    public static /* synthetic */ Boolean F(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.waving = b2;
        return a2.waving;
    }

    public String toString() {
        Vz_1 a2;
        return new StringBuilder().insert(3 ^ 3, oua.r).append((a2.parentStyle != null ? vRa.d : uSa.E) != 0).append(Bta.B).append(a2.color).append(Zra.Da).append(a2.hexColor).append(gua.J).append(a2.bold).append(Zpa.Ha).append(a2.italic).append(Xsa.Q).append(a2.underlined).append(dqa.j).append(a2.strikethrough).append(tTa.G).append(a2.obfuscated).append(zTa.Z).append(a2.shimmer).append(vTa.Aa).append(a2.rainbow).append(KTa.O).append(a2.glitchy).append(pua.ja).append(a2.waving).append(Vra.j).append(a2.aberration).append(wOa.Fa).append(a2.shaking).append(Lsa.f).append(a2.chatClickEvent).append(kta.o).append(a2.chatHoverEvent).append(zTa.v).append(a2.insertion).append((char)CRa.L).append((char)ySa.Z).toString();
    }

    public static /* synthetic */ Boolean k(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.bold = b2;
        return a2.bold;
    }

    public Vz D(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.shaking = b2;
        return a2;
    }

    public Vz A(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.obfuscated = b2;
        return a2;
    }

    public static /* synthetic */ Boolean G(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.glitchy = b2;
        return a2.glitchy;
    }

    public static /* synthetic */ Boolean D(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.flip = b2;
        return a2.flip;
    }

    public static /* synthetic */ Boolean A(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.italic = b2;
        return a2.italic;
    }

    public static /* synthetic */ String f(Vz vz2, String string) {
        Object b2 = string;
        Vz a2 = vz2;
        a2.insertion = b2;
        return a2.insertion;
    }

    public static /* synthetic */ Boolean i(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.obfuscated = b2;
        return a2.obfuscated;
    }

    public static /* synthetic */ pY J(Vz vz2, pY pY2) {
        Vz b2 = pY2;
        Vz a2 = vz2;
        a2.color = b2;
        return a2.color;
    }

    public Vz J(Vz vz2) {
        Vz_1 b2 = vz2;
        Vz_1 a2 = this;
        a2.parentStyle = b2;
        return a2;
    }

    public int hashCode() {
        Vz_1 vz_1 = this;
        int a2 = vz_1.color.hashCode();
        a2 = tua.U * a2 + vz_1.hexColor.hashCode();
        a2 = tua.U * a2 + vz_1.bold.hashCode();
        a2 = tua.U * a2 + vz_1.italic.hashCode();
        a2 = tua.U * a2 + vz_1.underlined.hashCode();
        a2 = tua.U * a2 + vz_1.strikethrough.hashCode();
        a2 = tua.U * a2 + vz_1.obfuscated.hashCode();
        a2 = tua.U * a2 + vz_1.chatClickEvent.hashCode();
        a2 = tua.U * a2 + vz_1.chatHoverEvent.hashCode();
        a2 = tua.U * a2 + vz_1.insertion.hashCode();
        return a2;
    }

    public static /* synthetic */ pEa J(Vz a2) {
        return a2.chatHoverEvent;
    }

    public Vz i(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.italic = b2;
        return a2;
    }

    public static /* synthetic */ Boolean k(Vz a2) {
        return a2.bold;
    }

    public static /* synthetic */ Boolean G(Vz a2) {
        return a2.strikethrough;
    }

    public Vz J(pY pY2) {
        Vz_1 b2 = pY2;
        Vz_1 a2 = this;
        a2.color = b2;
        return a2;
    }

    public static /* synthetic */ Boolean M(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.aberration = b2;
        return a2.aberration;
    }

    public String l() {
        Vz_1 vz_1;
        Object object = this;
        if (((Vz_1)object).A()) {
            if (((Vz_1)object).parentStyle != null) {
                return ((Vz_1)object).parentStyle.l();
            }
            return Mqa.y;
        }
        StringBuilder a2 = new StringBuilder();
        Vz_1 vz_12 = object;
        qy qy2 = vz_12.J();
        pY pY2 = vz_12.J();
        if (qy2 != null) {
            vz_1 = object;
            a2.append(Yqa.k).append(qy2.J(), uqa.g, Yqa.i);
        } else {
            if (pY2 != null) {
                a2.append(pY2);
            }
            vz_1 = object;
        }
        if (vz_1.F()) {
            a2.append(pY.BOLD);
        }
        if (((Vz_1)object).C()) {
            a2.append(pY.ITALIC);
        }
        if (((Vz_1)object).i()) {
            a2.append(pY.UNDERLINE);
        }
        if (((Vz_1)object).G()) {
            a2.append(pY.OBFUSCATED);
        }
        if (((Vz_1)object).M()) {
            a2.append(pY.SHIMMER);
        }
        if (((Vz_1)object).j()) {
            a2.append(pY.RAINBOW);
        }
        if (((Vz_1)object).f()) {
            a2.append(pY.STRIKETHROUGH);
        }
        if (((Vz_1)object).k()) {
            a2.append(pY.SHAKING);
        }
        if (((Vz_1)object).d()) {
            a2.append(pY.WAVING);
        }
        if (((Vz_1)object).l()) {
            a2.append(pY.ABERRATION);
        }
        if (((Vz_1)object).J()) {
            a2.append(pY.GLITCHY);
        }
        if (((Vz_1)object).D()) {
            a2.append(pY.FLIP);
        }
        if (((Vz_1)object).f() != null) {
            a2.append(pY.EMIT).append(((Vz_1)object).f());
        }
        if (((Vz_1)object).e()) {
            a2.append(pY.ANIMATED_GRADIENT);
        }
        return a2.toString();
    }

    public Vz f(String string) {
        String b2 = string;
        Vz_1 a2 = this;
        a2.emit = b2;
        return a2;
    }

    public Vz f() {
        Vz_1 vz_1 = this;
        Vz_1 a2 = new Vz_1();
        Vz vz2 = a2.G(vz_1.F());
        Vz_1 vz_12 = a2;
        a2.i(vz_1.C());
        vz_12.M(vz_1.f());
        a2.F(vz_1.i());
        a2.A(vz_1.G());
        a2.C(vz_1.M());
        a2.J(vz_1.j());
        a2.d(vz_1.J());
        a2.f(vz_1.d());
        a2.k(vz_1.l());
        a2.D(vz_1.k());
        a2.J(vz_1.J());
        a2.J(vz_1.J());
        a2.J(vz_1.J());
        a2.J(vz_1.J());
        a2.J(vz_1.J());
        a2.f(vz_1.f());
        a2.e(vz_1.D());
        a2.l(vz_1.e());
        return vz_12;
    }

    public static /* synthetic */ Boolean D(Vz a2) {
        return a2.italic;
    }

    public static /* synthetic */ Boolean e(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.shaking = b2;
        return a2.shaking;
    }

    public Vz J() {
        Vz_1 vz_1 = this;
        Vz_1 a2 = new Vz_1();
        Vz_1 vz_12 = vz_1;
        Vz_1 vz_13 = a2;
        Vz_1 vz_14 = vz_1;
        Vz_1 vz_15 = a2;
        Vz_1 vz_16 = vz_1;
        Vz_1 vz_17 = a2;
        Vz_1 vz_18 = vz_1;
        Vz_1 vz_19 = a2;
        Vz_1 vz_110 = vz_1;
        Vz_1 vz_111 = a2;
        Vz_1 vz_112 = vz_1;
        Vz_1 vz_113 = a2;
        vz_113.bold = vz_1.bold;
        vz_113.italic = vz_1.italic;
        a2.strikethrough = vz_112.strikethrough;
        vz_111.underlined = vz_112.underlined;
        vz_111.obfuscated = vz_1.obfuscated;
        a2.shimmer = vz_110.shimmer;
        vz_19.rainbow = vz_110.rainbow;
        vz_19.glitchy = vz_1.glitchy;
        a2.waving = vz_18.waving;
        vz_17.aberration = vz_18.aberration;
        vz_17.shaking = vz_1.shaking;
        a2.color = vz_16.color;
        vz_15.hexColor = vz_16.hexColor;
        vz_15.chatClickEvent = vz_1.chatClickEvent;
        a2.chatHoverEvent = vz_14.chatHoverEvent;
        vz_13.parentStyle = vz_14.parentStyle;
        vz_13.insertion = vz_1.insertion;
        a2.emit = vz_12.emit;
        a2.animatedGradient = vz_12.animatedGradient;
        a2.flip = vz_1.flip;
        return a2;
    }

    public static /* synthetic */ Boolean A(Vz a2) {
        return a2.underlined;
    }

    public Vz J(String string) {
        String b2 = string;
        Vz_1 a2 = this;
        a2.insertion = b2;
        return a2;
    }

    public static /* synthetic */ Boolean d(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.rainbow = b2;
        return a2.rainbow;
    }

    public static /* synthetic */ Boolean i(Vz a2) {
        return a2.shaking;
    }

    public Vz J(PEa pEa2) {
        PEa b2 = pEa2;
        Vz_1 a2 = this;
        a2.chatClickEvent = b2;
        return a2;
    }

    public static /* synthetic */ Boolean C(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.animatedGradient = b2;
        return a2.animatedGradient;
    }

    public static /* synthetic */ String J(Vz vz2, String string) {
        Object b2 = string;
        Vz a2 = vz2;
        a2.emit = b2;
        return a2.emit;
    }

    public static /* synthetic */ PEa J(Vz vz2, PEa pEa2) {
        Object b2 = pEa2;
        Vz a2 = vz2;
        a2.chatClickEvent = b2;
        return a2.chatClickEvent;
    }

    public boolean F() {
        Vz_1 a2;
        if (a2.bold == null) {
            return a2.l().F();
        }
        return a2.bold;
    }

    public static /* synthetic */ Boolean M(Vz a2) {
        return a2.shimmer;
    }

    public pEa J() {
        Vz_1 a2;
        if (a2.chatHoverEvent == null) {
            return a2.l().J();
        }
        return a2.chatHoverEvent;
    }

    public boolean k() {
        Vz_1 a2;
        if (a2.shaking == null) {
            return a2.l().k();
        }
        return a2.shaking;
    }

    public boolean G() {
        Vz_1 a2;
        if (a2.obfuscated == null) {
            return a2.l().G();
        }
        return a2.obfuscated;
    }

    public boolean D() {
        Vz_1 a2;
        if (a2.flip == null) {
            return a2.l().D();
        }
        return a2.flip;
    }

    public String f() {
        Vz_1 a2;
        if (a2.emit == null) {
            return a2.l().f();
        }
        return a2.emit;
    }

    public static /* synthetic */ PEa J(Vz a2) {
        return a2.chatClickEvent;
    }

    public Vz M(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.strikethrough = b2;
        return a2;
    }

    public Vz e(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.flip = b2;
        return a2;
    }

    public Vz d(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.glitchy = b2;
        return a2;
    }

    public boolean A() {
        Vz_1 a2;
        if (a2.bold == null && a2.italic == null && a2.hexColor == null && a2.strikethrough == null && a2.underlined == null && a2.obfuscated == null && a2.color == null && a2.shimmer == null && a2.chatClickEvent == null && a2.chatHoverEvent == null && a2.rainbow == null && a2.aberration == null && a2.glitchy == null && a2.shaking == null && a2.waving == null && a2.animatedGradient == null && a2.flip == null && a2.emit == null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean i() {
        Vz_1 a2;
        if (a2.underlined == null) {
            return a2.l().i();
        }
        return a2.underlined;
    }

    public Vz J(pEa pEa2) {
        Vz_1 b2 = pEa2;
        Vz_1 a2 = this;
        a2.chatHoverEvent = b2;
        return a2;
    }

    public boolean M() {
        Vz_1 a2;
        if (a2.shimmer == null) {
            return a2.l().M();
        }
        return a2.shimmer;
    }

    public Vz C(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.shimmer = b2;
        return a2;
    }

    public static /* synthetic */ Boolean l(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.strikethrough = b2;
        return a2.strikethrough;
    }

    public Vz l(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.animatedGradient = b2;
        return a2;
    }

    public static /* synthetic */ Boolean e(Vz a2) {
        return a2.aberration;
    }

    public pY J() {
        Vz_1 a2;
        if (a2.color == null) {
            return a2.l().J();
        }
        return a2.color;
    }

    public Vz f(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.waving = b2;
        return a2;
    }

    public Vz J(qy qy2) {
        Vz_1 b2 = qy2;
        Vz_1 a2 = this;
        a2.hexColor = b2;
        return a2;
    }

    public static /* synthetic */ Boolean d(Vz a2) {
        return a2.obfuscated;
    }

    public static /* synthetic */ qy J(Vz a2) {
        return a2.hexColor;
    }

    public static /* synthetic */ Boolean C(Vz a2) {
        return a2.glitchy;
    }

    public static /* synthetic */ Boolean f(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.shimmer = b2;
        return a2.shimmer;
    }

    public static /* synthetic */ String J(Vz a2) {
        return a2.emit;
    }

    public boolean e() {
        Vz_1 a2;
        if (a2.animatedGradient == null) {
            return a2.l().e();
        }
        return a2.animatedGradient;
    }

    public static /* synthetic */ Boolean l(Vz a2) {
        return a2.waving;
    }

    public Vz J(Boolean bl) {
        Boolean b2 = bl;
        Vz_1 a2 = this;
        a2.rainbow = b2;
        return a2;
    }

    public PEa J() {
        Vz_1 a2;
        if (a2.chatClickEvent == null) {
            return a2.l().J();
        }
        return a2.chatClickEvent;
    }

    public boolean d() {
        Vz_1 a2;
        if (a2.waving == null) {
            return a2.l().d();
        }
        return a2.waving;
    }

    public boolean C() {
        Vz_1 a2;
        if (a2.italic == null) {
            return a2.l().C();
        }
        return a2.italic;
    }

    public String J() {
        Vz_1 a2;
        if (a2.insertion == null) {
            return a2.l().J();
        }
        return a2.insertion;
    }

    public static /* synthetic */ Boolean J(Vz vz2, Boolean bl) {
        Object b2 = bl;
        Vz a2 = vz2;
        a2.underlined = b2;
        return a2.underlined;
    }

    public static /* synthetic */ Boolean f(Vz a2) {
        return a2.flip;
    }

    public qy J() {
        Vz_1 a2;
        if (a2.hexColor == null) {
            return a2.l().J();
        }
        return a2.hexColor;
    }

    public boolean l() {
        Vz_1 a2;
        if (a2.aberration == null) {
            return a2.l().l();
        }
        return a2.aberration;
    }

    public static /* synthetic */ Boolean J(Vz a2) {
        return a2.animatedGradient;
    }

    public boolean f() {
        Vz_1 a2;
        if (a2.strikethrough == null) {
            return a2.l().f();
        }
        return a2.strikethrough;
    }

    public boolean J() {
        Vz_1 a2;
        if (a2.glitchy == null) {
            return a2.l().J();
        }
        return a2.glitchy;
    }

    public static /* synthetic */ pY J(Vz a2) {
        return a2.color;
    }
}

