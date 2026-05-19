/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Iba
 *  Jda
 *  OCa
 *  ada
 *  bFa
 *  ica
 *  jba
 *  mca
 *  qca
 *  vRa
 *  vba
 *  wOa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Wca_3
extends qca {
    private final OCa J;
    private final Set<ica> A;
    private vba I;

    public void J(vba vba2) {
        Wca_3 b2 = vba2;
        Wca_3 a2 = this;
        a2.I = b2;
    }

    public void J(jba jba2) {
        Wca_3 a2;
        Wca_3 b2 = jba2;
        Wca_3 wca_3 = a2 = this;
        super.J((jba)b2);
        if (wca_3.A.contains(b2.J())) {
            a2.J.J().J((KC)new Iba((jba)b2));
        }
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void e(ica ica2) {
        void a2;
        Wca_3 wca_3;
        Wca_3 wca_32 = wca_3 = this;
        List<KC> list = wca_32.J((ica)a2);
        for (bFa bFa2 : wca_32.J.J().J()) {
            Iterator<KC> iterator = list.iterator();
            while (iterator.hasNext()) {
                Iterator<KC> iterator2;
                KC kC2 = iterator2.next();
                iterator = iterator2;
                bFa2.I.J(kC2);
            }
        }
        wca_3.A.remove(a2);
    }

    /*
     * WARNING - void declaration
     */
    public void d(ica ica2) {
        void a2;
        Wca_3 wca_3;
        Wca_3 wca_32 = wca_3 = this;
        List<KC> list = wca_32.f((ica)a2);
        for (bFa bFa2 : wca_32.J.J().J()) {
            Iterator<KC> iterator = list.iterator();
            while (iterator.hasNext()) {
                Iterator<KC> iterator2;
                KC kC2 = iterator2.next();
                iterator = iterator2;
                bFa2.I.J(kC2);
            }
        }
        wca_3.A.add((ica)a2);
    }

    /*
     * Unable to fully structure code
     */
    public void J(int var1_1, ica var2_2) {
        c = var2_2;
        v0 = a = this;
        var3_3 = v0.J((int)b);
        super.J((int)b, (ica)c);
        if (var3_3 == c || var3_3 == null) ** GOTO lbl11
        if (a.J(var3_3) > 0) {
            v1 = c;
            a.J.J().J((KC)new ada((int)b, (ica)c));
        } else {
            a.e(var3_3);
lbl11:
            // 2 sources

            v1 = c;
        }
        if (v1 == null) ** GOTO lbl19
        if (a.A.contains((Object)c)) {
            v2 = a;
            v3 = v2;
            v2.J.J().J((KC)new ada((int)b, (ica)c));
        } else {
            a.d((ica)c);
lbl19:
            // 2 sources

            v3 = a;
        }
        v3.J();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, String string2) {
        void b2;
        Wca_3 a2 = this;
        Object c2 = string2;
        if (super.J((String)b2, (String)c2)) {
            Wca_3 wca_3 = a2;
            c2 = wca_3.J((String)c2);
            String[] stringArray = new String[vRa.d];
            stringArray[uSa.E] = b2;
            wca_3.J.J().J(new Dca((mca)c2, Arrays.asList(stringArray), yRa.d));
            a2.J();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<KC> f(ica ica2) {
        jba a2;
        Wca_3 wca_3 = this;
        ArrayList<KC> arrayList = Lists.newArrayList();
        arrayList.add((KC)new Jda((ica)a2, uSa.E));
        int b2 = uSa.E;
        int n2 = b2;
        while (n2 < wOa.t) {
            if (wca_3.J(b2) == a2) {
                arrayList.add((KC)new ada(b2, (ica)a2));
            }
            n2 = ++b2;
        }
        Iterator iterator = b2 = wca_3.J((ica)a2).iterator();
        while (iterator.hasNext()) {
            a2 = (jba)b2.next();
            iterator = b2;
            arrayList.add((KC)new Iba(a2));
        }
        return arrayList;
    }

    public void J() {
        Wca_3 a2;
        if (a2.I != null) {
            a2.I.J();
        }
    }

    public void C(ica ica2) {
        Wca_3 a2;
        Wca_3 b2 = ica2;
        Wca_3 wca_3 = a2 = this;
        super.C((ica)b2);
        if (wca_3.A.contains((Object)b2)) {
            a2.e((ica)b2);
        }
        a2.J();
    }

    public void l(ica ica2) {
        Wca_3 a2;
        Wca_3 b2 = ica2;
        Wca_3 wca_3 = a2 = this;
        super.l((ica)b2);
        if (wca_3.A.contains((Object)b2)) {
            a2.J.J().J((KC)new Jda((ica)b2, uqa.g));
        }
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, mca mca2) {
        void b2;
        Wca_3 a2;
        Wca_3 c2 = mca2;
        Wca_3 wca_3 = a2 = this;
        super.J((String)b2, (mca)c2);
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = b2;
        wca_3.J.J().J(new Dca((mca)c2, Arrays.asList(stringArray), AQa.P));
        a2.J();
    }

    public void J(mca mca2) {
        Wca_3 a2;
        Wca_3 b2 = mca2;
        Wca_3 wca_3 = a2 = this;
        super.J((mca)b2);
        wca_3.J.J().J(new Dca((mca)b2, uSa.E));
        wca_3.J();
    }

    /*
     * WARNING - void declaration
     */
    public int J(ica ica2) {
        int b2;
        Wca_3 wca_3 = this;
        int n2 = uSa.E;
        int n3 = b2 = uSa.E;
        while (n3 < wOa.t) {
            void a2;
            if (wca_3.J(b2) == a2) {
                ++n2;
            }
            n3 = ++b2;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public List<KC> J(ica ica2) {
        void a2;
        Wca_3 wca_3 = this;
        ArrayList<KC> arrayList = Lists.newArrayList();
        arrayList.add((KC)new Jda((ica)a2, vRa.d));
        int b2 = uSa.E;
        int n2 = b2;
        while (n2 < wOa.t) {
            if (wca_3.J(b2) == a2) {
                arrayList.add((KC)new ada(b2, (ica)a2));
            }
            n2 = ++b2;
        }
        return arrayList;
    }

    public Wca_3(OCa oCa2) {
        Wca_3 b2 = oCa2;
        Wca_3 a2 = this;
        a2.A = Sets.newHashSet();
        a2.J = b2;
    }

    public void J(ica ica2) {
        Wca_3 a2;
        Wca_3 b2 = ica2;
        Wca_3 wca_3 = a2 = this;
        super.J((ica)b2);
        wca_3.J();
    }

    public void f(mca mca2) {
        Wca_3 a2;
        Wca_3 b2 = mca2;
        Wca_3 wca_3 = a2 = this;
        super.f((mca)b2);
        wca_3.J.J().J(new Dca((mca)b2, vRa.d));
        wca_3.J();
    }

    /*
     * WARNING - void declaration
     */
    public void f(String string, ica ica2) {
        void b2;
        Wca_3 a2;
        Wca_3 c2 = ica2;
        Wca_3 wca_3 = a2 = this;
        super.f((String)b2, (ica)c2);
        wca_3.J.J().J((KC)new Iba((String)b2, (ica)c2));
        wca_3.J();
    }

    public void J(String string) {
        Wca_3 a2;
        Object b2 = string;
        Wca_3 wca_3 = a2 = this;
        super.J((String)b2);
        wca_3.J.J().J((KC)new Iba((String)b2));
        wca_3.J();
    }

    public void C(mca mca2) {
        Wca_3 a2;
        Wca_3 b2 = mca2;
        Wca_3 wca_3 = a2 = this;
        super.C((mca)b2);
        wca_3.J.J().J(new Dca((mca)b2, uqa.g));
        wca_3.J();
    }
}

