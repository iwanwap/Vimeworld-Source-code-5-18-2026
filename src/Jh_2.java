/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Jh
 *  Mda
 *  iJa
 *  pqa
 */
import org.lwjgl.util.vector.Vector3f;

public final class Jh_2 {
    public Mda j;
    private Vector3f J;
    private Vector3f A;
    private Vector3f I;

    public static /* synthetic */ Vector3f l(Jh jh2, Vector3f vector3f) {
        Object b2 = vector3f;
        Jh a2 = jh2;
        a2.A = b2;
        return a2.A;
    }

    public iJa J() {
        Jh_2 a2;
        if (a2.J == null && a2.I == null && a2.A == null) {
            return null;
        }
        if (a2.J == null) {
            Jh_2 jh_2 = a2;
            jh_2.J = new Vector3f(JPa.N, JPa.N, JPa.N);
        }
        if (a2.I == null) {
            a2.I = new Vector3f(JPa.N, JPa.N, JPa.N);
        }
        if (a2.A == null) {
            a2.A = new Vector3f(pqa.r, pqa.r, pqa.r);
        }
        Jh_2 jh_2 = a2;
        return new iJa(jh_2.J, jh_2.I, a2.A);
    }

    public Jh_2(Mda mda2) {
        Jh_2 b2 = mda2;
        Jh_2 a2 = this;
        a2.j = b2;
    }

    public static /* synthetic */ Vector3f f(Jh jh2, Vector3f vector3f) {
        Object b2 = vector3f;
        Jh a2 = jh2;
        a2.I = b2;
        return a2.I;
    }

    public static /* synthetic */ Vector3f J(Jh jh2, Vector3f vector3f) {
        Object b2 = vector3f;
        Jh a2 = jh2;
        a2.J = b2;
        return a2.J;
    }
}

