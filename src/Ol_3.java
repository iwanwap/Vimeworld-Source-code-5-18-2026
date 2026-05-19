/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hia
 *  JSa
 *  Kl
 *  Kpa
 *  Ol
 *  Ppa
 *  Sk
 *  Wj
 *  YL
 *  dQa
 *  pua
 *  qoa
 *  sb
 *  sj
 *  uQa
 *  vRa
 *  xNa
 */
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.util.ResourceLocation;

public final class Ol_3 {
    public static final String J = "texteria-sound";
    private final Map<String, YL> A;
    private final Kpa I;

    public void f() {
        Object a2;
        Ol_3 ol_3 = this;
        Object object = a2 = ol_3.A.entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)a2.next();
            ol_3.I.J().f((X)entry.getValue());
            object = a2;
        }
        ol_3.A.clear();
    }

    public void J() {
        Ol_3 a2;
        ((Hia)a2.I.J()).I.put(Bta.H, new sj((Ol)a2));
    }

    public static /* synthetic */ Kpa J(Ol a2) {
        return a2.I;
    }

    public void J(String string) {
        Object b2;
        String a2;
        Ol_3 ol_3 = this;
        if (a2.endsWith(JSa.a)) {
            void v0 = a2;
            a2 = v0.substring(uSa.E, v0.length() - vRa.d);
            b2 = ol_3.A.entrySet().iterator();
            while (b2.hasNext()) {
                Map.Entry<String, YL> entry = b2.next();
                if (!entry.getKey().startsWith(a2)) continue;
                ol_3.I.J().f((X)entry.getValue());
                b2.remove();
            }
            return;
        }
        b2 = (X)ol_3.A.remove(a2);
        if (b2 != null) {
            ol_3.I.J().f(b2);
        }
    }

    public Ol_3(Kpa kpa2) {
        Ol_3 b2 = kpa2;
        Ol_3 a2 = this;
        Ol_3 ol_3 = a2;
        a2.A = new HashMap<String, YL>();
        a2.I = b2;
    }

    public static /* synthetic */ void J(Ol ol2, YL yL2) {
        Ol b2 = yL2;
        Ol a2 = ol2;
        super.J((YL)b2);
    }

    public void f(YL yL2) {
        Kl kl2;
        Ol_3 b2 = yL2;
        Ol_3 a2 = this;
        if (((YL)b2).m.startsWith(uQa.Y) && (kl2 = OT.i.C.J(((YL)b2).m.substring(vRa.d))) != null && kl2.J().isDone()) {
            ((YL)b2).m = pua.v + kl2.f() + Lsa.D;
            a2.J((YL)b2);
            return;
        }
        if ((((YL)b2).m.startsWith(Ppa.g) || ((YL)b2).m.startsWith(rSa.ba)) && (kl2 = OT.i.C.J(((YL)b2).m, nua.Ha)).J()) {
            ((YL)b2).m = new StringBuilder().insert(2 & 5, fqa.u).append(kl2.J()).toString();
            a2.J((YL)b2);
            return;
        }
        if (((YL)b2).m.startsWith(Ppa.g) || ((YL)b2).m.startsWith(rSa.ba) || ((YL)b2).m.startsWith(uQa.Y)) {
            Sk.J((Runnable)new Wj((Ol)a2, (YL)b2));
            return;
        }
        a2.J((YL)b2);
    }

    private void J(YL yL2) {
        Ol_3 b2 = yL2;
        Ol_3 a2 = this;
        Ol_3 ol_3 = b2;
        Object object = ol_3.J();
        xNa xNa2 = new xNa((ResourceLocation)object, oua.i, oua.i, ((YL)b2).I);
        xNa2.J((sb)new wma(new qoa((ResourceLocation)object, oua.i, oua.i, ((YL)b2).A), vRa.d));
        a2.I.J().J.J(xNa2);
        if (((YL)ol_3).C != null) {
            object = (X)a2.A.put(((YL)b2).C, (YL)b2);
            if (object != null) {
                a2.I.J().f((X)object);
            }
        } else if (((YL)b2).F) {
            a2.A.put(UUID.randomUUID().toString(), (YL)b2);
        }
        a2.I.J().J((X)((Object)b2));
    }

    public File J(ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        Ol_3 a2 = this;
        if (((String)(b2 = ((ResourceLocation)b2).J())).startsWith(pua.v) && ((String)(b2 = ((String)b2).substring(tTa.h))).startsWith(dQa.M) && ((String)b2).endsWith(Lsa.D)) {
            Object object = b2;
            b2 = ((String)object).substring(uSa.E, ((String)object).length() - AQa.P);
        }
        return new File(a2.I.p, (String)b2);
    }
}

