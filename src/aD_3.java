/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  DQa
 *  NCa
 *  NTa
 *  Spa
 *  Uf
 *  Waa
 *  XTa
 *  Zpa
 *  aD
 *  jE
 *  pqa
 *  vRa
 *  vpa
 *  waa
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class aD_3
implements D {
    private final Map<String, Uf> rightHands;
    private float scaleGui;
    private float scale;
    private Map<String, sf> meshes;
    private String name = Mqa.y;
    private jE actions;
    private String head;
    private String primaryMesh = Mqa.y;
    private float scaleItems;
    private boolean renderHeldItems;

    public void l(String string) {
        String b2 = string;
        aD_3 a2 = this;
        a2.head = b2;
    }

    public boolean J() {
        aD_3 a2;
        return a2.renderHeldItems;
    }

    public Map<String, sf> f() {
        aD_3 a2;
        return a2.meshes;
    }

    public void l(float f2) {
        float b2 = f2;
        aD_3 a2 = this;
        a2.scaleItems = b2;
    }

    public float l() {
        aD_3 a2;
        return a2.scaleItems;
    }

    public Map<String, Uf> J() {
        aD_3 a2;
        return a2.rightHands;
    }

    public void J(Map<String, sf> map) {
        Map<String, sf> b2 = map;
        aD_3 a2 = this;
        a2.meshes = b2;
    }

    public Waa J(Waa waa2) {
        Waa waa3;
        aD_3 b2 = waa2;
        aD_3 a2 = this;
        if (b2 == null) {
            b2 = new Waa();
        }
        if (!a2.name.isEmpty()) {
            b2.J(DQa.N, a2.name);
        }
        if (a2.scale != pqa.r) {
            b2.J(Ira.S, a2.scale);
        }
        if (a2.scaleGui != pqa.r) {
            b2.J(nqa.q, a2.scaleGui);
        }
        if (a2.scaleItems != pqa.r) {
            b2.J(Zpa.Ka, a2.scaleItems);
        }
        if (!a2.renderHeldItems) {
            b2.J(XTa.D, a2.renderHeldItems);
        }
        if (!a2.head.equals(WRa.q)) {
            b2.J(Spa.fa, a2.head);
        }
        if (!a2.rightHands.isEmpty()) {
            aD_3 aD_32 = a2;
            b2.J(wsa.a, (NCa)aD_32.J(aD_32.rightHands));
        }
        if ((waa3 = a2.actions.J(null)) != null && !waa3.J()) {
            b2.J(vpa.a, (NCa)waa3);
        }
        if (!a2.meshes.isEmpty()) {
            Iterator<Map.Entry<String, sf>> iterator;
            waa3 = new Waa();
            Iterator<Map.Entry<String, sf>> iterator2 = iterator = a2.meshes.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<String, sf> entry = iterator.next();
                waa3.J(entry.getKey(), (NCa)entry.getValue().J((Waa)null));
                iterator2 = iterator;
            }
            b2.J(zta.b, (NCa)waa3);
        }
        return b2;
    }

    private Waa J(Map<String, Uf> map) {
        Iterator b2 = map;
        aD_3 a2 = this;
        Waa waa2 = new Waa();
        Iterator iterator = b2 = b2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = b2.next();
            waa2.J((String)entry.getKey(), (NCa)((Uf)entry.getValue()).J(null));
            iterator = b2;
        }
        return waa2;
    }

    public void J(Waa waa2) {
        aD_3 b2 = waa2;
        aD_3 a2 = this;
        if (b2.J(DQa.N, Yqa.i)) {
            a2.name = b2.J(DQa.N);
        }
        if (b2.J(Ira.S, zOa.v)) {
            a2.scale = b2.J(Ira.S);
        }
        if (b2.J(nqa.q, zOa.v)) {
            a2.scaleGui = b2.J(nqa.q);
        }
        if (b2.J(Zpa.Ka, zOa.v)) {
            a2.scaleItems = b2.J(Zpa.Ka);
        }
        if (b2.J(XTa.D, zOa.v)) {
            a2.renderHeldItems = b2.f(XTa.D);
        }
        if (b2.J(wsa.a)) {
            aD_3 aD_32 = a2;
            aD_32.J(aD_32.rightHands, b2.J(wsa.a));
        }
        if (b2.J(Spa.fa, Yqa.i)) {
            a2.head = b2.J(Spa.fa);
        }
        if (b2.J(vpa.a, NTa.C)) {
            a2.actions.J(b2.J(vpa.a));
        }
        if (b2.J(zta.b, NTa.C)) {
            b2 = b2.J(zta.b);
            for (String string : b2.J()) {
                NCa nCa2 = b2.J(string);
                sf sf2 = a2.meshes.get(string);
                if (sf2 == null) {
                    sf2 = new sf();
                    a2.meshes.put(string, sf2);
                }
                if (nCa2.J() != NTa.C) continue;
                sf2.J((Waa)nCa2);
            }
        }
    }

    public String f() {
        aD_3 a2;
        return a2.head;
    }

    public aD_3() {
        aD_3 a2;
        a2.scale = pqa.r;
        a2.scaleGui = pqa.r;
        a2.scaleItems = pqa.r;
        a2.renderHeldItems = vRa.d;
        aD_3 aD_32 = a2;
        a2.rightHands = new HashMap<String, Uf>();
        a2.head = WRa.q;
        a2.actions = new jE();
        a2.meshes = new HashMap<String, sf>();
    }

    public void f(String string) {
        String b2 = string;
        aD_3 a2 = this;
        a2.primaryMesh = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Map<String, Uf> map, NCa nCa2) {
        block3: {
            Object c22;
            void a2;
            void b2;
            block2: {
                aD_3 aD_32 = this;
                b2.clear();
                if (a2.J() != WOa.fa) break block2;
                waa waa2 = (waa)a2;
                int c22 = uSa.E;
                int n2 = waa2.J();
                int n3 = c22;
                while (n3 < n2) {
                    String string;
                    String string2 = string = waa2.J(c22);
                    String string3 = string;
                    b2.put(string3, new Uf(string3));
                    n3 = ++c22;
                }
                break block3;
            }
            if (a2.J() != NTa.C) break block3;
            Waa waa3 = (Waa)a2;
            Object object = c22 = waa3.J().iterator();
            while (object.hasNext()) {
                String string = (String)c22.next();
                ((Uf)b2.computeIfAbsent(string, Ud.J())).J(waa3.J(string));
                object = c22;
            }
        }
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        aD_3 a2 = this;
        a2.renderHeldItems = b2;
    }

    public float f() {
        aD_3 a2;
        return a2.scale;
    }

    public float J() {
        aD_3 a2;
        return a2.scaleGui;
    }

    public void f(float f2) {
        float b2 = f2;
        aD_3 a2 = this;
        a2.scaleGui = b2;
    }

    public String J() {
        aD_3 a2;
        return a2.name;
    }

    public void J(float f2) {
        float b2 = f2;
        aD_3 a2 = this;
        a2.scale = b2;
    }

    public void J(aD aD2) {
        Map.Entry<String, Object> entry;
        aD_3 a2;
        aD_3 b2 = aD2;
        aD_3 aD_32 = a2 = this;
        aD_3 aD_33 = b2;
        aD_3 aD_34 = a2;
        aD_3 aD_35 = b2;
        a2.name = b2.name;
        a2.primaryMesh = aD_35.primaryMesh;
        aD_34.scale = aD_35.scale;
        aD_34.scaleGui = b2.scaleGui;
        a2.scaleItems = aD_33.scaleItems;
        a2.renderHeldItems = aD_33.renderHeldItems;
        aD_32.head = b2.head;
        a2.actions.J(b2.actions);
        aD_32.rightHands.clear();
        aD_32.meshes.clear();
        Iterator<Map.Entry<String, Object>> iterator = b2.rightHands.entrySet().iterator();
        Iterator<Map.Entry<String, Object>> iterator2 = iterator;
        while (iterator2.hasNext()) {
            entry = iterator.next();
            a2.rightHands.put(entry.getKey(), entry.getValue().clone());
            iterator2 = iterator;
        }
        iterator = b2.meshes.entrySet().iterator();
        Iterator<Map.Entry<String, sf>> iterator3 = iterator;
        while (iterator3.hasNext()) {
            entry = iterator.next();
            a2.meshes.put(entry.getKey(), ((sf)entry.getValue()).clone());
            iterator3 = iterator;
        }
    }

    public void J(String string) {
        String b2 = string;
        aD_3 a2 = this;
        a2.name = b2;
    }

    public jE J() {
        aD_3 a2;
        return a2.actions;
    }

    public void J(jE jE2) {
        aD_3 b2 = jE2;
        aD_3 a2 = this;
        a2.actions = b2;
    }
}

