/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  KH
 *  Um
 *  en
 *  lMa
 *  pqa
 *  rna
 */
import java.util.EnumMap;
import java.util.Map;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class YL_2
implements X {
    public boolean F;
    private static final Map<Um, rna> g = new EnumMap<Um, rna>(Um.class);
    public lMa L;
    public float E;
    public String m;
    public String C;
    public int i;
    public float M;
    public KH k;
    public float j;
    public ResourceLocation J;
    public boolean A;
    public rna I;

    static {
        g.put(Um.MASTER, rna.MASTER);
        g.put(Um.MUSIC, rna.RECORDS);
        g.put(Um.RECORDS, rna.RECORDS);
        g.put(Um.WEATHER, rna.WEATHER);
        g.put(Um.BLOCKS, rna.BLOCKS);
        g.put(Um.MOBS, rna.MOBS);
        g.put(Um.ANIMALS, rna.ANIMALS);
        g.put(Um.PLAYERS, rna.PLAYERS);
        g.put(Um.AMBIENT, rna.AMBIENT);
    }

    @Override
    public float C() {
        YL_2 a2;
        return (float)a2.k.k;
    }

    @Override
    public ResourceLocation J() {
        YL_2 a2;
        if (a2.J != null) {
            return a2.J;
        }
        return new ResourceLocation(Bta.H, a2.m);
    }

    public YL_2(en en2) {
        YL_2 yL_2;
        YL_2 b2 = en2;
        YL_2 a2 = this;
        a2.A = uSa.E;
        a2.I = rna.AMBIENT;
        a2.M = pqa.r;
        a2.j = pqa.r;
        YL_2 yL_22 = a2;
        a2.k = new KH();
        a2.L = lMa.NONE;
        a2.F = uSa.E;
        a2.i = uSa.E;
        a2.E = JPa.N;
        if (b2.hasPath()) {
            YL_2 yL_23 = b2;
            yL_2 = yL_23;
            a2.m = yL_23.getPath();
        } else if (b2.hasResource()) {
            YL_2 yL_24 = b2;
            yL_2 = yL_24;
            a2.m = OT.i.C.J(yL_24.getResource());
        } else {
            throw new IllegalArgumentException(EPa.T);
        }
        if (yL_2.hasId()) {
            a2.C = b2.getId();
        }
        if (b2.hasStreaming()) {
            a2.A = b2.getStreaming();
        }
        if (b2.hasCategory()) {
            a2.I = YL_2.J(b2.getCategory(), a2.I);
        }
        if (b2.hasPitch()) {
            a2.M = b2.getPitch();
        }
        if (b2.hasVolume()) {
            a2.j = b2.getVolume();
        }
        if (b2.hasRepeat()) {
            a2.F = b2.getRepeat();
        }
        if (b2.hasRepeatDelay()) {
            a2.i = b2.getRepeatDelay();
        }
        if (b2.hasDistance()) {
            a2.E = b2.getDistance();
        }
        if (b2.hasX() || b2.hasY() || b2.hasZ()) {
            YL_2 yL_25 = a2;
            yL_25.k = new KH((double)b2.getX(), (double)b2.getY(), (double)b2.getZ());
            yL_25.L = lMa.LINEAR;
        }
    }

    @Override
    public float d() {
        YL_2 a2;
        return a2.j;
    }

    @Override
    public float l() {
        YL_2 a2;
        return a2.M;
    }

    @Override
    public float J() {
        YL_2 a2;
        return (float)a2.k.J;
    }

    private static rna J(Um um2, rna rna2) {
        Um b2 = rna2;
        Um a2 = um2;
        return g.getOrDefault(a2, (rna)b2);
    }

    public float e() {
        YL_2 a2;
        return a2.E;
    }

    @Override
    public lMa J() {
        YL_2 a2;
        return a2.L;
    }

    @Override
    public float f() {
        YL_2 a2;
        return (float)a2.k.j;
    }

    @Override
    public int J() {
        YL_2 a2;
        return a2.i;
    }

    public YL_2() {
        YL_2 a2;
        a2.A = uSa.E;
        a2.I = rna.AMBIENT;
        a2.M = pqa.r;
        a2.j = pqa.r;
        YL_2 yL_2 = a2;
        a2.k = new KH();
        a2.L = lMa.NONE;
        a2.F = uSa.E;
        a2.i = uSa.E;
        a2.E = JPa.N;
    }

    @Override
    public boolean J() {
        YL_2 a2;
        return a2.F;
    }
}

