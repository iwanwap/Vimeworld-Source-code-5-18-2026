/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  NMa
 *  UIa
 *  Vna
 *  ld
 *  mca
 *  vRa
 *  yb
 */
import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Vna_1 {
    private ResourceLocation F;
    private long g;
    private boolean L;
    private ResourceLocation E;
    private final GameProfile m;
    private String C;
    private long i;
    private int M;
    private ld k;
    private int j;
    private long J;
    private Daa A;
    private int I;

    public int l() {
        Vna_1 a2;
        return a2.j;
    }

    public GameProfile J() {
        Vna_1 a2;
        return a2.m;
    }

    public static /* synthetic */ ResourceLocation f(Vna vna, ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        Vna a2 = vna;
        a2.E = b2;
        return a2.E;
    }

    public long l() {
        Vna_1 a2;
        return a2.g;
    }

    public void l(long a2) {
        b.i = a2;
    }

    public static /* synthetic */ String J(Vna a2) {
        return a2.C;
    }

    public void l(int n2) {
        int b2 = n2;
        Vna_1 a2 = this;
        a2.I = b2;
    }

    public int f() {
        Vna_1 a2;
        return a2.I;
    }

    public void f(long a2) {
        b.g = a2;
    }

    public void f(int n2) {
        int b2 = n2;
        Vna_1 a2 = this;
        a2.j = b2;
    }

    public void J(ld ld2) {
        Vna_1 b2 = ld2;
        Vna_1 a2 = this;
        a2.k = b2;
    }

    public static /* synthetic */ String J(Vna vna, String string) {
        Object b2 = string;
        Vna a2 = vna;
        a2.C = b2;
        return a2.C;
    }

    public ResourceLocation f() {
        Vna_1 a2;
        if (a2.F == null) {
            a2.J();
        }
        if (a2.F == UIa.J()) {
            return null;
        }
        return a2.F;
    }

    public String J() {
        Vna_1 a2;
        if (a2.C == null) {
            return UIa.J((UUID)a2.m.getId());
        }
        return a2.C;
    }

    public void J(long a2) {
        b.J = a2;
    }

    public Daa J() {
        Vna_1 a2;
        return a2.A;
    }

    public Vna_1(GameProfile gameProfile) {
        Vna_1 a2;
        GameProfile b2 = gameProfile;
        Vna_1 vna_1 = a2 = this;
        a2.L = uSa.E;
        a2.j = uSa.E;
        a2.M = uSa.E;
        a2.i = nqa.i;
        vna_1.J = nqa.i;
        vna_1.g = nqa.i;
        vna_1.m = b2;
    }

    public ld J() {
        Vna_1 a2;
        return a2.k;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J() {
        Vna_1 vna_1;
        Vna_1 a2 = vna_1 = this;
        synchronized (a2) {
            if (!vna_1.L) {
                vna_1.L = vRa.d;
                Kpa.J().J().J(vna_1.m, (yb)new NMa((Vna)vna_1), vRa.d != 0);
            }
            return;
        }
    }

    public boolean J() {
        Vna_1 a2;
        if (a2.E != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ResourceLocation J() {
        Vna_1 a2;
        if (a2.E == null) {
            a2.J();
        }
        Vna_1 vna_1 = a2;
        return Objects.firstNonNull(vna_1.E, UIa.J((UUID)vna_1.m.getId()));
    }

    public void J(int n2) {
        int b2 = n2;
        Vna_1 a2 = this;
        a2.M = b2;
    }

    public static /* synthetic */ ResourceLocation J(Vna vna, ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        Vna a2 = vna;
        a2.F = b2;
        return a2.F;
    }

    public void J(Daa daa) {
        Object b2 = daa;
        Vna_1 a2 = this;
        a2.A = b2;
    }

    public long f() {
        Vna_1 a2;
        return a2.J;
    }

    public Vna_1(PCa pCa) {
        Vna_1 a2;
        PCa b2 = pCa;
        Vna_1 vna_1 = a2 = this;
        Object object = b2;
        Vna_1 vna_12 = a2;
        a2.L = uSa.E;
        a2.j = uSa.E;
        a2.M = uSa.E;
        a2.i = nqa.i;
        vna_12.J = nqa.i;
        vna_12.g = nqa.i;
        vna_12.m = b2.J();
        a2.A = ((PCa)object).J();
        vna_1.I = ((PCa)object).J();
        vna_1.k = b2.J();
    }

    public int J() {
        Vna_1 a2;
        return a2.M;
    }

    public long J() {
        Vna_1 a2;
        return a2.i;
    }

    public mca J() {
        Vna_1 a2;
        return Kpa.J().Ta.J().l(a2.J().getName());
    }
}

