/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RE
 *  Xd
 *  dg
 *  vRa
 *  wd
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.vecmath.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xd_3 {
    private final String i;
    private final Map<String, wd> M;
    public Matrix4f[] k;
    private final List<wd> j;
    private List<wd> J;
    private String A;
    private boolean I;

    public Xd_3(String string) {
        Xd_3 a2;
        String b2 = string;
        Xd_3 xd_3 = a2 = this;
        a2.A = Mqa.y;
        Xd_3 xd_32 = a2;
        xd_32.M = new HashMap<String, wd>();
        xd_3.j = new ArrayList<wd>();
        xd_3.J = new ArrayList<wd>();
        xd_3.i = b2;
    }

    public void J(Matrix4f[] matrix4fArray) {
        Matrix4f[] b2 = matrix4fArray;
        Matrix4f[] a2 = this;
        a2.k = b2;
    }

    public Map<String, wd> J() {
        Xd_3 a2;
        return a2.M;
    }

    public void J(String string) {
        String b2 = string;
        Xd_3 a2 = this;
        a2.A = b2;
    }

    public List<wd> f() {
        Xd_3 a2;
        return a2.J;
    }

    public List<wd> J() {
        Xd_3 a2;
        return a2.j;
    }

    public void J(List<wd> list) {
        List<wd> b2 = list;
        Xd_3 a2 = this;
        a2.J = b2;
    }

    public void J() {
        Xd_3 xd_3 = this;
        if (xd_3.I) {
            return;
        }
        ArrayList<wd> arrayList = new ArrayList<wd>();
        for (wd a2 : xd_3.M.values()) {
            if (a2.J()) {
                arrayList.add(a2);
            }
            if (!a2.J().isEmpty()) {
                wd wd2 = a2;
                wd2.J(xd_3.M.get(wd2.J()));
                wd wd3 = a2;
                wd wd4 = a2;
                wd3.J().set(wd4.J().d());
                wd3.J().invert();
                wd4.J().mul(a2.d());
                continue;
            }
            a2.J().set(a2.d());
        }
        if (!arrayList.isEmpty()) {
            xd_3.J = arrayList;
        }
        Xd_3 xd_32 = xd_3;
        xd_32.j.sort(Comparator.comparingInt(RE.J()));
        xd_32.k = new Matrix4f[xd_32.j.size()];
        xd_3.I = vRa.d;
    }

    public void J(wd wd2) {
        Xd_3 b2 = wd2;
        Xd_3 a2 = this;
        a2.M.put(b2.f(), (wd)b2);
        a2.j.add((wd)b2);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Xd_3 a2 = this;
        a2.I = b2;
    }

    public String f() {
        Xd_3 a2;
        return a2.i;
    }

    public String J() {
        Xd_3 a2;
        return a2.A;
    }

    public Matrix4f[] J() {
        Xd_3 a2;
        return a2.k;
    }

    public boolean J() {
        Xd_3 a2;
        return a2.I;
    }

    public void J(Xd xd2) {
        Object b2 = xd2;
        Xd_3 a2 = this;
        Object object = b2 = ((Xd_3)b2).j.iterator();
        while (object.hasNext()) {
            wd wd2 = (wd)b2.next();
            wd wd3 = a2.M.get(wd2.f());
            if (wd3 == null) {
                object = b2;
                continue;
            }
            wd3.J(wd2.J());
            object = b2;
        }
        a2.j.sort(Comparator.comparingInt(dg.J()));
    }
}

