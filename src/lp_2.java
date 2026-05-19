/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Er
 *  Gl
 *  IR
 *  JPa
 *  JTa
 *  Jh
 *  Joa
 *  Kh
 *  Kpa
 *  Ri
 *  Sk
 *  Vna
 *  Vua
 *  XM
 *  aSa
 *  aqa
 *  bSa
 *  cI
 *  k
 *  kea
 *  kqa
 *  lp
 *  pua
 *  qH
 *  sMa
 *  uKa
 *  vRa
 *  zU
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Mouse;

public final class lp_2
extends nP {
    private static final jU E;
    private boolean m;
    private boolean C;
    private float i;
    private volatile ResourceLocation M;
    private final kea k;
    private static final Vna j;
    private int J;
    private float A;
    private Vna I;

    public lp_2(k k2, XM xM) {
        Object a2;
        lp_2 b2;
        Object c2 = k2;
        lp_2 lp_22 = b2 = this;
        super((k)c2, (XM)a2);
        lp_2 lp_23 = b2;
        b2.k = new kea((Sx)Kpa.J().c);
        lp_23.C = uSa.E;
        b2.J = Fsa.d;
        b2.A = JPa.N;
        lp_22.i = JPa.N;
        lp_22.m = uSa.E;
        lp_22.M = null;
        c2 = a2.getEPlayer();
        if (((Hm)c2).hasUuid()) {
            a2 = ByteBuffer.wrap(((Hm)c2).getUuid().toByteArray());
            b2.I = new Vna(new GameProfile(new UUID(((ByteBuffer)a2).getLong(), ((ByteBuffer)a2).getLong()), null));
            Sk.J((Runnable)IR.J((lp)b2));
        }
        if (!((Hm)c2).hasUuid() && ((Hm)c2).hasNickname()) {
            a2 = ((Hm)c2).getNickname();
            b2.I = new Vna(new GameProfile(UUID.fromString(Nta.ca), (String)a2));
            String string = aqa.l;
            lp_2 lp_24 = b2;
            string = string.replace(Fsa.I, lp_24.I.J().getId().toString().replace(Vua.m, Mqa.y));
            string = string.replace(JTa.x, (CharSequence)a2);
            lp_24.I.J().getProperties().put(oua.D, new Property(oua.D, Base64.getEncoder().encodeToString(string.getBytes(StandardCharsets.UTF_8)), bSa.z));
            Sk.J((Runnable)uQ.J((lp)b2));
        }
        if (((Hm)c2).hasScale()) {
            b2.J = ((Hm)c2).getScale();
        }
        if (((Hm)c2).hasYaw()) {
            b2.A = ((Hm)c2).getYaw();
        }
        if (((Hm)c2).hasPitch()) {
            b2.i = ((Hm)c2).getPitch();
        }
        if (((Hm)c2).hasFollowMouse()) {
            b2.m = ((Hm)c2).getFollowMouse();
        }
        if (((Hm)c2).hasHelmet() && (a2 = qH.J((String)((Hm)c2).getHelmet())) != null) {
            b2.k.A[yRa.d] = ((Jh)a2).j;
        }
        if (((Hm)c2).hasChestplate() && (a2 = qH.J((String)((Hm)c2).getChestplate())) != null) {
            b2.k.A[uqa.g] = ((Jh)a2).j;
        }
        if (((Hm)c2).hasLeggings() && (a2 = qH.J((String)((Hm)c2).getLeggings())) != null) {
            b2.k.A[vRa.d] = ((Jh)a2).j;
        }
        if (((Hm)c2).hasBoots() && (a2 = qH.J((String)((Hm)c2).getBoots())) != null) {
            b2.k.A[uSa.E] = ((Jh)a2).j;
        }
        if (((Hm)c2).hasItemInHand() && (a2 = qH.J((String)((Hm)c2).getItemInHand())) != null) {
            b2.k.j[uSa.E] = ((Jh)a2).j;
            b2.k.J = uSa.E;
        }
    }

    public static /* synthetic */ void J(double b2, double a2) {
        Kh.J((double)aSa.V, (double)aSa.V, (double)b2, (double)a2, (int)pua.o);
    }

    public static /* synthetic */ void f(lp a2) {
        Kpa.J().J().fillProfileProperties(a2.I.J(), vRa.d != 0);
        a2.C = vRa.d;
        a2.M = a2.I.J();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(long l2) {
        lp_2 lp_22;
        lp_2 lp_23;
        lp_2 lp_24 = lp_23 = this;
        double d2 = lp_24.J();
        double d3 = lp_24.f();
        cI.J((Runnable)Er.J((double)d2, (double)d3));
        jU jU2 = zU.M.J();
        zU.M.J(E);
        lp_2 b2 = Kpa.J().c;
        Vna vna = ((ANa)b2).A;
        ((ANa)b2).A = lp_23.C ? lp_23.I : j;
        kea kea2 = ((ANa)b2).K;
        ((ANa)b2).K = lp_23.k;
        int n2 = (int)d2 / uqa.g;
        int n3 = (int)(d3 / KPa.y + (double)lp_23.J);
        uKa.J();
        if (lp_23.m) {
            void a22;
            Ri a22 = lp_23.J((long)a22);
            int n4 = new sMa(Kpa.J()).l();
            float f2 = (float)(-((double)((float)Mouse.getX() / (float)n4 - a22.I) - d2 / KPa.y));
            float f3 = (float)((double)((float)Mouse.getY() / (float)n4 - a22.A) - d3 / KPa.y - (double)lp_23.J / KPa.y);
            Joa.J((int)n2, (int)n3, (int)lp_23.J, (float)f2, (float)f3, (Gl)b2);
            lp_22 = b2;
        } else {
            lp_2 lp_25 = lp_23;
            Joa.f((int)n2, (int)n3, (int)lp_25.J, (float)lp_25.A, (float)lp_23.i, (Gl)b2);
            lp_22 = b2;
        }
        ((ANa)lp_22).A = vna;
        ((ANa)b2).K = kea2;
        zU.M.J(jU2);
        cI.J();
    }

    public static /* synthetic */ void J(lp a2) {
        a2.C = vRa.d;
        a2.I.J();
    }

    static {
        j = new Vna(new GameProfile(UUID.fromString(Nta.ca), kqa.U));
        E = new jU();
    }
}

