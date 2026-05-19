/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A
 *  Oqa
 *  ad
 *  ge
 *  qF
 *  vRa
 */
import java.util.stream.Collectors;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IE_2
extends jb
implements A {
    private boolean j;
    private final Yd I;

    public boolean J() {
        IE_2 a2;
        return a2.j;
    }

    public void J() {
        int n2;
        IE_2 iE_2 = this;
        iE_2.f().clear();
        Object a2 = WF.f().stream().filter(Vf.J()).collect(Collectors.toList());
        int n3 = n2 = a2.size() >= tTa.h ? vRa.d : uSa.E;
        if (!iE_2.j && a2.size() >= tTa.h) {
            a2 = a2.subList(uSa.E, AQa.P);
        }
        a2 = a2.iterator();
        Object object = a2;
        while (object.hasNext()) {
            qF qF2 = (qF)a2.next();
            if (qF2 == null) {
                object = a2;
                continue;
            }
            iE_2.f((ad)new ge(qF2.A));
            object = a2;
        }
        if (n2 != 0) {
            IE_2 iE_22 = iE_2;
            iE_22.f((ad)iE_22.I);
        }
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        IE_2 a2 = this;
        if (a2.j == b2) {
            return;
        }
        a2.j = b2;
        a2.J();
    }

    public IE_2() {
        IE_2 a2;
        IE_2 iE_2 = a2;
        super(Oqa.ROW, uSa.E, uSa.E);
        IE_2 iE_22 = a2;
        iE_2.I = new Yd(a2);
        iE_22.j = uSa.E;
        iE_2.J();
    }

    public static /* synthetic */ boolean J(qF a2) {
        if (a2.I >= System.currentTimeMillis()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

