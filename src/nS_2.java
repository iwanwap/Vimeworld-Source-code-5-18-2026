/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CV
 *  JPa
 *  Js
 *  Kpa
 *  Qu
 *  pqa
 *  vQa
 *  vRa
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nS_2 {
    private float transitionDurationTicks;
    private List<Qu> transitionBones;
    private final List<Js> dynamicBones;
    private float transitionEndTime;
    private float currentStartTime;
    private xB current;
    private final Map<String, xB> animations;

    public xB J(String string) {
        String b2 = string;
        nS_2 a2 = this;
        return a2.animations.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2) {
        float f3;
        void a2;
        Iterator<Js> iterator;
        nS_2 nS_22 = this;
        Iterator<Js> iterator2 = iterator = nS_22.dynamicBones.iterator();
        while (iterator2.hasNext()) {
            nS_2 b2 = iterator.next();
            iterator2 = iterator;
            nS_2.J((Js)b2);
        }
        if (nS_22.current != null) {
            nS_2 nS_23 = nS_22;
            nS_2 nS_24 = nS_22;
            nS_23.current.f(nS_24.currentStartTime);
            nS_23.current.J((float)a2);
            nS_23.currentStartTime = nS_24.current.J();
        }
        float f4 = nS_22.transitionEndTime - a2;
        if (f3 > JPa.N) {
            float b2 = pqa.r - f4 / nS_22.transitionDurationTicks;
            Iterator<Qu> iterator3 = a2 = nS_22.transitionBones.iterator();
            while (iterator3.hasNext()) {
                Qu qu = a2.next();
                Js js2 = Qu.J((Qu)qu);
                iterator3 = a2;
                Qu qu2 = qu;
                js2.scaleX = nS_2.J(Qu.J((Qu)qu2), js2.scaleX, b2);
                js2.scaleY = nS_2.J(Qu.f((Qu)qu2), js2.scaleY, b2);
                js2.scaleZ = nS_2.J(Qu.M((Qu)qu2), js2.scaleZ, b2);
                js2.rotationX = nS_2.J(Qu.C((Qu)qu2), js2.rotationX, b2);
                js2.rotationY = nS_2.J(Qu.l((Qu)qu2), js2.rotationY, b2);
                js2.rotationZ = nS_2.J(Qu.i((Qu)qu2), js2.rotationZ, b2);
                js2.rotationPointX = nS_2.J(Qu.A((Qu)qu2), js2.rotationPointX, b2);
                js2.rotationPointY = nS_2.J(Qu.d((Qu)qu2), js2.rotationPointY, b2);
                js2.rotationPointZ = nS_2.J(Qu.e((Qu)qu2), js2.rotationPointZ, b2);
            }
        } else {
            nS_22.transitionBones.clear();
        }
    }

    public xB J() {
        nS_2 a2;
        return a2.current;
    }

    private static float f() {
        return (float)Kpa.J().N.f() + CV.M;
    }

    /*
     * WARNING - void declaration
     */
    public void J(xB xB2) {
        void a2;
        nS_2 nS_22 = this;
        if (nS_22.current == a2) {
            return;
        }
        float f2 = nS_2.f();
        if (nS_22.current != null) {
            nS_2 nS_23 = nS_22;
            nS_23.f(f2);
            HashSet<Js> hashSet = new HashSet<Js>();
            ArrayList<Qu> arrayList = new ArrayList<Qu>();
            for (Js js2 : nS_23.current.J()) {
                if (!hashSet.add(js2)) continue;
                arrayList.add(new Qu(js2));
            }
            if (a2 != null) {
                for (Js js2 : a2.J()) {
                    if (!hashSet.add(js2)) continue;
                    arrayList.add(new Qu(js2));
                }
            }
            for (Qu qu : nS_22.transitionBones) {
                if (!hashSet.add(Qu.J((Qu)qu))) continue;
                arrayList.add(new Qu(Qu.J((Qu)qu)));
            }
            nS_22.transitionBones = arrayList;
            nS_22.current.J();
            nS_22.transitionEndTime = f2 + nS_22.transitionDurationTicks;
        }
        nS_22.currentStartTime = vqa.T;
        nS_22.current = a2;
    }

    /*
     * WARNING - void declaration
     */
    public nS_2(List<Js> list, Map<String, xB> map) {
        void b2;
        nS_2 a2;
        Map<String, xB> c2 = map;
        nS_2 nS_22 = a2 = this;
        a2.transitionBones = Collections.emptyList();
        a2.transitionDurationTicks = vQa.q;
        nS_22.dynamicBones = b2;
        nS_22.animations = c2;
    }

    public boolean J() {
        nS_2 a2;
        if (a2.current == null) {
            return vRa.d != 0;
        }
        nS_2 nS_22 = a2;
        nS_22.current.f(nS_22.currentStartTime);
        return nS_22.current.J();
    }

    public void J(float f2) {
        float b2 = f2;
        nS_2 a2 = this;
        a2.transitionDurationTicks = b2 * eta.e;
    }

    private static void J(Js a2) {
        Js js2 = a2;
        js2.scaleX = pqa.r;
        js2.scaleY = pqa.r;
        js2.scaleZ = pqa.r;
        js2.rotationX = JPa.N;
        js2.rotationY = JPa.N;
        js2.rotationZ = JPa.N;
        js2.rotationPointX = js2.origRotationPointX;
        js2.rotationPointY = js2.origRotationPointY;
        js2.rotationPointZ = js2.origRotationPointZ;
    }

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4) {
        void b2;
        float a2;
        float c2 = f4;
        float f5 = a2 = f2;
        return f5 + (b2 - f5) * c2;
    }

    public Collection<String> J() {
        nS_2 a2;
        return a2.animations.keySet();
    }

    public float J() {
        nS_2 a2;
        if (a2.current == null || a2.current.J()) {
            return JPa.N;
        }
        return (nS_2.f() - a2.current.J()) / eta.e;
    }
}

