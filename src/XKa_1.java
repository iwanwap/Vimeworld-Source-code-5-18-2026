/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XKa
 *  pqa
 *  psa
 *  pua
 *  ula
 *  vRa
 */
public final class XKa_1
implements Comparable {
    private final int mipmapLevelHolder;
    private final int height;
    private float scaleFactor;
    private boolean rotated;
    private final int width;
    private static final String __OBFID = "CL_00001055";
    private final KLa theTexture;

    public int getHeight() {
        XKa_1 a2;
        if (a2.rotated) {
            return ula.J((int)((int)((float)a2.width * a2.scaleFactor)), (int)a2.mipmapLevelHolder);
        }
        return ula.J((int)((int)((float)a2.height * a2.scaleFactor)), (int)a2.mipmapLevelHolder);
    }

    public void rotate() {
        XKa_1 a2;
        a2.rotated = !a2.rotated ? vRa.d : uSa.E;
    }

    public int compareTo(Object object) {
        Object b2 = object;
        XKa_1 a2 = this;
        return a2.compareTo((XKa)((XKa_1)b2));
    }

    public int compareTo(XKa xKa2) {
        XKa_1 b2 = xKa2;
        XKa_1 a2 = this;
        if (a2.getHeight() == b2.getHeight()) {
            if (a2.getWidth() == b2.getWidth()) {
                if (a2.theTexture.J() == null) {
                    if (b2.theTexture.J() == null) {
                        return uSa.E;
                    }
                    return pua.o;
                }
                return a2.theTexture.J().compareTo(b2.theTexture.J());
            }
            int n2 = a2.getWidth() < b2.getWidth() ? vRa.d : pua.o;
            return n2;
        }
        int n3 = a2.getHeight() < b2.getHeight() ? vRa.d : pua.o;
        return n3;
    }

    public String toString() {
        XKa_1 a2;
        return new StringBuilder().insert(3 & 4, psa.j).append(a2.width).append(KQa.S).append(a2.height).append(Vra.e).append(a2.theTexture.J()).append((char)ySa.Z).toString();
    }

    public int getWidth() {
        XKa_1 a2;
        if (a2.rotated) {
            return ula.J((int)((int)((float)a2.height * a2.scaleFactor)), (int)a2.mipmapLevelHolder);
        }
        return ula.J((int)((int)((float)a2.width * a2.scaleFactor)), (int)a2.mipmapLevelHolder);
    }

    public void setNewDimension(int n2) {
        int b2 = n2;
        XKa_1 a2 = this;
        if (a2.width > b2 && a2.height > b2) {
            a2.scaleFactor = (float)b2 / (float)Math.min(a2.width, a2.height);
        }
    }

    public boolean isRotated() {
        XKa_1 a2;
        return a2.rotated;
    }

    public KLa getAtlasSprite() {
        XKa_1 a2;
        return a2.theTexture;
    }

    /*
     * WARNING - void declaration
     */
    public XKa_1(KLa kLa2, int n2) {
        void b2;
        int c2 = n2;
        XKa_1 a2 = this;
        void v0 = b2;
        a2.scaleFactor = pqa.r;
        a2.theTexture = b2;
        a2.width = v0.J();
        a2.height = v0.f();
        a2.mipmapLevelHolder = c2;
        a2.rotated = ula.J((int)a2.height, (int)c2) > ula.J((int)a2.width, (int)c2) ? vRa.d : uSa.E;
    }
}

