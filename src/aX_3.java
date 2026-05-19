/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  D
 *  FTa
 *  Hfa
 *  JZ
 *  Kb
 *  OZ
 *  Tz
 *  Ypa
 *  aX
 *  kta
 *  ky
 *  ld
 *  lqa
 *  pEa
 *  pY
 *  qz
 *  rz
 *  uRa
 *  vRa
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aX_3
implements D {
    private final lb field_150957_c;
    public static Hd field_111202_k;
    private static NumberFormat numberFormat;
    public final String statId;
    private final ld statName;
    private Class<? extends Kb> field_150956_d;
    private final Hd type;
    public static Hd simpleStatType;
    public boolean isIndependent;
    public static Hd timeStatType;
    public static Hd distanceStatType;
    private static DecimalFormat decimalFormat;

    public aX f() {
        aX_3 a2;
        a2.isIndependent = vRa.d;
        return a2;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public aX J(Class<? extends Kb> clazz) {
        Class<? extends Kb> b2 = clazz;
        aX_3 a2 = this;
        a2.field_150956_d = b2;
        return a2;
    }

    public Class<? extends Kb> J() {
        aX_3 a2;
        return a2.field_150956_d;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 != null && a2.getClass() == b2.getClass()) {
            b2 = (aX_3)b2;
            return ((aX_3)a2).statId.equals(((aX_3)b2).statId);
        }
        return uSa.E != 0;
    }

    static {
        numberFormat = NumberFormat.getIntegerInstance(Locale.US);
        simpleStatType = new rz();
        decimalFormat = new DecimalFormat(kta.V);
        timeStatType = new ky();
        distanceStatType = new qz();
        field_111202_k = new OZ();
    }

    public lb J() {
        aX_3 a2;
        return a2.field_150957_c;
    }

    /*
     * WARNING - void declaration
     */
    public aX_3(String string, ld ld2, Hd hd2) {
        void b2;
        void c2;
        aX_3 a2;
        Hd d2 = hd2;
        aX_3 aX_32 = a2 = this;
        a2.statId = c2;
        aX_32.statName = b2;
        aX_32.type = d2;
        aX_3 aX_33 = a2;
        aX_32.field_150957_c = new JZ((aX)a2);
        lb.A.put(a2.field_150957_c.J(), a2.field_150957_c);
    }

    /*
     * WARNING - void declaration
     */
    public aX_3(String string, ld ld2) {
        void b2;
        aX_3 c2 = ld2;
        aX_3 a2 = this;
        a2((String)b2, (ld)c2, simpleStatType);
    }

    public aX J() {
        aX_3 a2;
        if (Tz.o.containsKey(a2.statId)) {
            throw new RuntimeException(new StringBuilder().insert(3 & 4, lqa.D).append(((aX_3)Tz.o.get((Object)a2.statId)).statName).append(Zqa.z).append(a2.statName).append(ypa.j).append(a2.statId).toString());
        }
        Tz.Aa.add(a2);
        Tz.o.put(a2.statId, a2);
        return a2;
    }

    public String toString() {
        aX_3 a2;
        return new StringBuilder().insert(5 >> 3, Wqa.L).append(a2.statId).append(Ypa.t).append(a2.statName).append(uRa.m).append(a2.isIndependent).append(FTa.f).append(a2.type).append(kta.U).append(a2.field_150957_c).append((char)ySa.Z).toString();
    }

    public int hashCode() {
        aX_3 a2;
        return a2.statId.hashCode();
    }

    public String J(int n2) {
        int b2 = n2;
        aX_3 a2 = this;
        return a2.type.J(b2);
    }

    public static /* synthetic */ NumberFormat J() {
        return numberFormat;
    }

    public ld f() {
        aX_3 a2;
        aX_3 aX_32 = this;
        aX_3 aX_33 = a2 = aX_32.statName.J();
        a2.J().J(pY.GRAY);
        aX_33.J().J(new pEa(Hfa.SHOW_ACHIEVEMENT, (ld)new CY(aX_32.statId)));
        return aX_33;
    }

    public ld J() {
        aX_3 aX_32 = this;
        aX_3 a2 = aX_32.f();
        ld ld2 = new CY(dqa.X).J((ld)a2).J(XOa.D);
        ld2.J(a2.J());
        return ld2;
    }

    public static /* synthetic */ DecimalFormat J() {
        return decimalFormat;
    }
}

