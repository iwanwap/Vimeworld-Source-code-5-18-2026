/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Cra
 *  ID
 *  Kpa
 *  Qta
 *  fF
 *  kf
 *  pqa
 *  rf
 *  ue
 *  vRa
 *  xE
 *  ye
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL15;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fF_1 {
    private final String j;
    private final List<ID> J;
    private rf A;
    private final Kpa I;

    public String J() {
        fF_1 a2;
        return a2.j;
    }

    public void J() {
        Object a2;
        fF_1 fF_12 = this;
        Object object = a2 = fF_12.J.iterator();
        while (object.hasNext()) {
            ((ID)a2.next()).l();
            object = a2;
        }
        fF_12.J.clear();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Map<String, sf> map) {
        Object b2;
        fF_1 fF_12 = this;
        Object object = b2 = fF_12.J.iterator();
        while (object.hasNext()) {
            void a2;
            ID iD2 = (ID)b2.next();
            iD2.J(fF_12.I, a2 == null ? null : (sf)a2.get(iD2.J()));
            object = b2;
        }
        GL15.glBindBuffer(Qta.T, uSa.E);
        GL15.glBindBuffer(Ata.v, uSa.E);
    }

    public fF J() {
        Iterator iterator;
        fF_1 fF_12 = this;
        Iterator iterator2 = iterator = xE.J((rf)fF_12.A).entrySet().iterator();
        while (iterator2.hasNext()) {
            Object a2 = iterator.next();
            String string = (String)a2.getKey();
            ye ye2 = (ye)a2.getValue();
            a2 = new ID((fF)fF_12, (String)a2.getKey(), ye2);
            iterator2 = iterator;
            a2.J(new ResourceLocation(Cra.V, new StringBuilder().insert(3 & 4, Asa.v).append(fF_12.j).append(hpa.m).append(string).append(Nra.X).toString()));
            fF_12.J.add((ID)a2);
        }
        fF_1 fF_13 = fF_12;
        fF_13.A.f();
        return fF_13;
    }

    public void f(rf rf2) {
        fF_1 a2;
        fF_1 b2 = rf2;
        fF_1 fF_12 = a2 = this;
        fF_12.A = b2;
        fF_12.J();
        fF_12.J();
    }

    public void J(rf rf2) {
        fF_1 b2 = rf2;
        fF_1 a2 = this;
        a2.A = b2;
    }

    public List<ID> J() {
        fF_1 a2;
        return a2.J;
    }

    public Kpa J() {
        fF_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public kf J(kf kf2, CE cE, boolean bl, int n2) {
        void a2;
        void b2;
        void d2;
        void c2;
        fF_1 fF_12 = this;
        fF_1 e2 = (ue)fF_12.A.J().get(c2.J());
        if (e2 == null) {
            return null;
        }
        if (d2 != null && d2.J() == e2) {
            void v0 = d2;
            v0.J((CE)c2);
            v0.J(pqa.r);
            return v0;
        }
        return new kf((ue)e2, (CE)c2, (boolean)b2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public kf J(kf kf2, CE cE, boolean bl) {
        void b2;
        void c2;
        boolean d2 = bl;
        fF_1 a2 = this;
        return a2.J((kf)c2, (CE)b2, d2, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public fF_1(String string, rf rf2) {
        void b2;
        fF_1 a2;
        fF_1 c2 = rf2;
        fF_1 fF_12 = a2 = this;
        fF_12.j = b2;
        fF_12.A = c2;
        fF_12.I = Kpa.J();
        fF_1 fF_13 = a2;
        fF_13.J = new ArrayList<ID>();
    }

    public rf J() {
        fF_1 a2;
        return a2.A;
    }
}

