/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aSa
 */
import java.awt.Color;

public final class Rt
implements Cloneable {
    private final Color color;
    private final String icon;
    private final String texture;
    private final String name;

    public String getIcon() {
        Rt a2;
        return a2.icon;
    }

    public Rt clone() {
        try {
            Rt a2;
            return (Rt)super.clone();
        }
        catch (Exception exception) {
            return null;
        }
    }

    public String toString() {
        Rt a2;
        return new StringBuilder().insert(3 >> 2, tSa.a).append(a2.name).append((char)CRa.L).append(aSa.e).append(a2.texture).append((char)CRa.L).append(cTa.h).append(a2.icon).append((char)CRa.L).append(Bta.B).append(a2.color).append((char)ySa.Z).toString();
    }

    public String getTexture() {
        Rt a2;
        return a2.texture;
    }

    /*
     * WARNING - void declaration
     */
    public Rt(String string, String string2, String string3, Color color) {
        void b2;
        Color e2;
        void c2;
        void d2;
        Rt a2;
        Rt rt2 = color2;
        Color color2 = color;
        Rt rt3 = a2 = rt2;
        Rt rt4 = a2;
        rt4.name = d2;
        rt4.texture = c2;
        rt3.color = e2;
        rt3.icon = b2;
    }

    public Color getColor() {
        Rt a2;
        return a2.color;
    }

    public String getName() {
        Rt a2;
        return a2.name;
    }
}

