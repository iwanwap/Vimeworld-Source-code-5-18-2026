/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aaa
 *  ERa
 *  Gg
 *  I
 *  MD
 *  NCa
 *  NTa
 *  Vx
 *  Waa
 *  hra
 *  jy
 *  qta
 *  vRa
 *  waa
 *  ysa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yz_2
extends Vx {
    private int k;
    private final List<Aaa> j;
    private final List<jy> J;
    private final List<XF> A;
    private Gg I;

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        void a2;
        yz_2 yz_22 = this;
        a2.J(rSa.G, yz_22.k);
        waa waa3 = new waa();
        Iterator<Aaa> b2 = yz_22.j.iterator();
        Object object = b2;
        while (object.hasNext()) {
            Aaa aaa2 = (Aaa)b2.next();
            Waa waa4 = new Waa();
            object = b2;
            Waa waa5 = waa4;
            aaa2.f(waa5);
            waa3.J((NCa)waa5);
        }
        a2.J(rua.w, (NCa)waa3);
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(XF xF2) {
        yz_2 yz_22 = this;
        Iterator<XF> b2 = yz_22.A.iterator();
        while (b2.hasNext()) {
            void a2;
            if (!((XF)((Object)b2.next())).equals(a2)) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2) {
        void a2;
        yz_2 yz_22 = this;
        yz_22.I = a2;
        Iterator<Aaa> b2 = yz_22.j.iterator();
        Object object = b2;
        while (object.hasNext()) {
            ((Aaa)b2.next()).J((Gg)a2);
            object = b2;
        }
    }

    public static String J(Ty a2) {
        return new StringBuilder().insert(3 >> 2, bsa.e).append(a2.f()).toString();
    }

    /*
     * WARNING - void declaration
     */
    private jy J(XF xF2) {
        void a2;
        yz_2 yz_22 = this;
        for (jy jy2 : yz_22.J) {
            if (jy2.f().getX() != a2.getX() || jy2.f().getZ() != a2.getZ() || Math.abs(jy2.f().getY() - a2.getY()) > vRa.d) continue;
            return jy2;
        }
        for (Aaa aaa2 : yz_22.j) {
            jy jy2 = aaa2.l((XF)a2);
            if (jy2 == null) continue;
            return jy2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private int J(XF xF2, DZ dZ2, int n2) {
        int n3;
        yz_2 yz_22 = this;
        int d2 = uSa.E;
        int n4 = n3 = vRa.d;
        while (n4 <= tTa.h) {
            void a2;
            void b2;
            void c2;
            if (yz_22.I.j(c2.offset((DZ)b2, n3)) && ++d2 >= a2) {
                return d2;
            }
            n4 = ++n3;
        }
        return d2;
    }

    public yz_2(String string) {
        Object b2 = string;
        yz_2 a2 = this;
        super((String)b2);
        a2.A = Lists.newArrayList();
        a2.J = Lists.newArrayList();
        a2.j = Lists.newArrayList();
    }

    private void d() {
        yz_2 a2;
        if (!a2.A.isEmpty()) {
            yz_2 yz_22 = a2;
            yz_22.f(yz_22.A.remove(uSa.E));
        }
    }

    /*
     * WARNING - void declaration
     */
    private void l(XF xF2) {
        int n2;
        void a2;
        yz_2 yz_22;
        yz_2 yz_23 = yz_22 = this;
        DZ dZ2 = BlockDoor.J((I)yz_23.I, (XF)a2);
        DZ dZ3 = dZ2.getOpposite();
        int b2 = yz_23.J((XF)a2, dZ2, tTa.h);
        if (b2 != (n2 = yz_23.J((XF)a2, dZ3, b2 + vRa.d))) {
            yz_2 yz_24;
            DZ dZ4;
            List<jy> list = yz_22.J;
            if (b2 < n2) {
                dZ4 = dZ2;
                yz_24 = yz_22;
            } else {
                dZ4 = dZ3;
                yz_24 = yz_22;
            }
            list.add(new jy((XF)a2, dZ4, yz_24.k));
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(XF xF2) {
        int n2;
        yz_2 yz_22 = this;
        int n3 = ERa.C;
        int n4 = AQa.P;
        int n5 = ERa.C;
        int n6 = n2 = -n3;
        while (n6 < n3) {
            int n7 = -n4;
            while (n7 < n4) {
                int n8;
                int n9 = -n5;
                while (n9 < n5) {
                    int n10;
                    void a2;
                    Object b2 = a2.add(n2, n8, n10);
                    if (yz_22.J((XF)((Object)b2))) {
                        jy jy2 = yz_22.J((XF)((Object)b2));
                        if (jy2 == null) {
                            yz_22.l((XF)((Object)b2));
                        } else {
                            jy2.J(yz_22.k);
                        }
                    }
                    n9 = ++n10;
                }
                n7 = ++n8;
            }
            n6 = ++n2;
        }
    }

    public void J(XF xF2) {
        Object b2 = xF2;
        yz_2 a2 = this;
        if (a2.A.size() <= ysa.s && !a2.f((XF)((Object)b2))) {
            a2.A.add((XF)((Object)b2));
        }
    }

    private void C() {
        int n2;
        yz_2 yz_22 = this;
        int n3 = n2 = uSa.E;
        while (n3 < yz_22.J.size()) {
            jy jy2 = yz_22.J.get(n2);
            yz_2 a2 = yz_22.J(jy2.f(), fPa.i);
            if (a2 == null) {
                a2 = new Aaa(yz_22.I);
                yz_22.j.add((Aaa)a2);
                yz_22.J();
            }
            a2.J(jy2);
            n3 = ++n2;
        }
        yz_22.J.clear();
    }

    public yz_2(Gg gg2) {
        yz_2 b2 = gg2;
        yz_2 a2 = this;
        super(yz_2.J(((Gg)b2).F));
        a2.A = Lists.newArrayList();
        a2.J = Lists.newArrayList();
        a2.j = Lists.newArrayList();
        a2.I = b2;
        a2.J();
    }

    public void J(Waa waa2) {
        int n2;
        yz_2 b2 = waa2;
        yz_2 a2 = this;
        yz_2 yz_22 = b2;
        a2.k = yz_22.J(rSa.G);
        b2 = yz_22.J(rua.w, NTa.C);
        int n3 = n2 = uSa.E;
        while (n3 < b2.J()) {
            Waa waa3 = b2.J(n2);
            Aaa aaa2 = new Aaa();
            aaa2.J(waa3);
            a2.j.add(aaa2);
            n3 = ++n2;
        }
    }

    private boolean J(XF xF2) {
        Object b2 = xF2;
        yz_2 a2 = this;
        if ((b2 = a2.I.J((XF)((Object)b2)).J()) instanceof BlockDoor) {
            if (((Block)b2).J() == Material.wood) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Aaa J(XF xF2, int n2) {
        yz_2 yz_22 = this;
        Aaa aaa2 = null;
        double d2 = qta.Ka;
        for (Aaa c2 : yz_22.j) {
            void a2;
            float f2;
            double d3;
            void b2;
            double d4 = c2.J().distanceSq((MD)b2);
            if (!(d3 < d2)) continue;
            float f3 = f2 = (float)(a2 + c2.l());
            if (!(d4 <= (double)(f3 * f3))) continue;
            aaa2 = c2;
            d2 = d4;
        }
        return aaa2;
    }

    public List<Aaa> J() {
        yz_2 a2;
        return a2.j;
    }

    public void l() {
        yz_2 yz_22;
        yz_2 yz_23 = yz_22 = this;
        yz_23.k += vRa.d;
        Iterator<Aaa> a2 = yz_23.j.iterator();
        Object object = a2;
        while (object.hasNext()) {
            ((Aaa)a2.next()).f(yz_22.k);
            object = a2;
        }
        yz_2 yz_24 = yz_22;
        yz_24.f();
        yz_24.d();
        yz_24.C();
        if (yz_24.k % hra.i == 0) {
            yz_22.J();
        }
    }

    private void f() {
        yz_2 yz_22 = this;
        Iterator<Aaa> a2 = yz_22.j.iterator();
        while (a2.hasNext()) {
            if (!((Aaa)a2.next()).f()) continue;
            a2.remove();
            yz_22.J();
        }
    }
}

