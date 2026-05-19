/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  Kpa
 *  Sf
 *  Ysa
 *  vRa
 *  wra
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.imageio.ImageIO;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class DF {
    private final InputStream m;
    private final boolean C;
    private kE i;
    private final int M;
    private final ResourceLocation k;
    private final BufferedImage j;
    private final IResource J;
    private final int A;
    private final Map<Character, He> I;

    public int hashCode() {
        DF a2;
        Object[] objectArray = new Object[tTa.h];
        objectArray[uSa.E] = a2.k;
        objectArray[vRa.d] = a2.J;
        objectArray[uqa.g] = a2.m;
        objectArray[yRa.d] = a2.A;
        objectArray[AQa.P] = a2.M;
        return Objects.hash(objectArray);
    }

    public He J(char c2) {
        char b2 = c2;
        DF a2 = this;
        return a2.I.get(Character.valueOf(b2));
    }

    public Map<Character, He> J() {
        DF a2;
        return a2.I;
    }

    public DF(ResourceLocation resourceLocation) {
        DF dF2;
        ResourceLocation b2 = resourceLocation;
        DF a2 = this;
        DF dF3 = a2;
        a2.I = new LinkedHashMap<Character, He>();
        a2.k = b2;
        try {
            IResource iResource = Kpa.J().J().J(new ResourceLocation(b2.f(), b2.J().replace(KPa.C, Epa.k)));
            String string = Config.J(iResource.J());
            a2.i = Sf.J().fromJson(string, kE.class);
            dF2 = a2;
        }
        catch (IOException iOException) {
            dF2 = a2;
            a2.i = new kE(AQa.P, AQa.P, wra.P, wra.P, vRa.d != 0);
        }
        dF2.C = a2.i.J();
        try {
            DF dF4 = a2;
            dF4.J = Kpa.J().J().J(b2);
            dF4.m = dF4.J.J();
            dF4.j = ImageIO.read(dF4.m);
            if (dF4.j == null) {
                throw new IOException(new StringBuilder().insert(2 & 5, Ysa.p).append(b2.J()).toString());
            }
            DF dF5 = a2;
            dF5.A = dF5.j.getWidth();
            dF5.M = dF5.j.getHeight();
            dF5.J();
            return;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public kE J() {
        DF a2;
        return a2.i;
    }

    public IResource J() {
        DF a2;
        return a2.J;
    }

    public InputStream J() {
        DF a2;
        return a2.m;
    }

    public boolean J() {
        DF a2;
        return a2.C;
    }

    private void J() {
        int n2;
        DF dF2;
        DF dF3 = dF2 = this;
        dF3.I.clear();
        DF dF4 = dF2;
        int n3 = dF3.A / (dF2.i.f() + dF4.i.l());
        int n4 = dF4.M / (dF2.i.C() + dF2.i.J());
        int[] nArray = new int[dF3.i.f() * dF2.i.C()];
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            int n6 = uSa.E;
            while (n6 < n3) {
                int n7;
                int a22 = n7 * dF2.i.f() + n7 * dF2.i.l();
                int n8 = n2 * dF2.i.C() + n2 * dF2.i.J();
                DF dF5 = dF2;
                if (dF5.J(dF5.j, nArray, a22, n8, dF2.i.f(), dF2.i.C())) break;
                He a22 = new He(dF2, Sf.M, a22, n8, dF2.i.f(), dF2.i.C());
                dF2.I.put(Character.valueOf(Sf.M), a22);
                Sf.J((He)a22);
                n6 = ++n7;
            }
            n5 = ++n2;
        }
    }

    public int f() {
        DF a2;
        return a2.A;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 == null || a2.getClass() != b2.getClass()) {
            return uSa.E != 0;
        }
        b2 = (DF)b2;
        if (((DF)a2).A == ((DF)b2).A && ((DF)a2).M == ((DF)b2).M && Objects.equals(((DF)a2).k, ((DF)b2).k) && Objects.equals(((DF)a2).J, ((DF)b2).J) && Objects.equals(((DF)a2).m, ((DF)b2).m)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public BufferedImage J() {
        DF a2;
        return a2.j;
    }

    public ResourceLocation J() {
        DF a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(BufferedImage bufferedImage, int[] nArray, int n2, int n3, int n4, int n5) {
        void e22;
        void a2;
        void b2;
        void c2;
        void f2;
        int g2 = n2;
        DF d2 = this;
        f2.getRGB(g2, (int)c2, (int)b2, (int)a2, (int[])e22, uSa.E, (int)b2);
        f2 = e22;
        int e22 = ((void)f2).length;
        int n6 = g2 = uSa.E;
        while (n6 < e22) {
            if (f2[g2] >> osa.c != false) {
                return uSa.E != 0;
            }
            n6 = ++g2;
        }
        return vRa.d != 0;
    }

    public int J() {
        DF a2;
        return a2.M;
    }
}

