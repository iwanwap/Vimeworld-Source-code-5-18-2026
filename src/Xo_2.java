/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Xo
 *  pm
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class Xo_2
extends GeneratedMessageLite.Builder<pm, Xo>
implements BC {
    public Xo clearImpelY() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.f((pm)((pm)xo_2.instance));
        return a2;
    }

    public /* synthetic */ Xo_2(AN aN2) {
        Xo_2 b2 = aN2;
        Xo_2 a2 = this;
        a2();
    }

    @Override
    public Un getImpelType() {
        Xo_2 a2;
        return ((pm)a2.instance).getImpelType();
    }

    @Override
    public int getImpelTypeValue() {
        Xo_2 a2;
        return ((pm)a2.instance).getImpelTypeValue();
    }

    private Xo_2() {
        super(pm.f());
        Xo_2 a2;
    }

    public Xo addAllCoords(Iterable<? extends Float> iterable) {
        Xo_2 a2;
        Iterable<? extends Float> b2 = iterable;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance), (Iterable)b2);
        return a2;
    }

    public Xo clearId() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.M((pm)((pm)xo_2.instance));
        return a2;
    }

    @Override
    public boolean hasDrag() {
        Xo_2 a2;
        return ((pm)a2.instance).hasDrag();
    }

    @Override
    public boolean getImpelXZOnSides() {
        Xo_2 a2;
        return ((pm)a2.instance).getImpelXZOnSides();
    }

    @Override
    public boolean hasImpelYOnTop() {
        Xo_2 a2;
        return ((pm)a2.instance).hasImpelYOnTop();
    }

    public Xo clearAffectOnlyPlayers() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.D((pm)((pm)xo_2.instance));
        return a2;
    }

    public Xo setId(String string) {
        Xo_2 a2;
        String b2 = string;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance), (String)b2);
        return a2;
    }

    @Override
    public float getImpelY() {
        Xo_2 a2;
        return ((pm)a2.instance).getImpelY();
    }

    @Override
    public int getCoordsCount() {
        Xo_2 a2;
        return ((pm)a2.instance).getCoordsCount();
    }

    @Override
    public boolean hasImpelX() {
        Xo_2 a2;
        return ((pm)a2.instance).hasImpelX();
    }

    public Xo addCoords(float f2) {
        Xo_2 a2;
        float b2 = f2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.l((pm)((pm)xo_2.instance), (float)b2);
        return a2;
    }

    public Xo setImpelZ(float f2) {
        Xo_2 a2;
        float b2 = f2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.C((pm)((pm)xo_2.instance), (float)b2);
        return a2;
    }

    public Xo clearImpelX() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.d((pm)((pm)xo_2.instance));
        return a2;
    }

    public Xo clearImpelYOnTop() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.i((pm)((pm)xo_2.instance));
        return a2;
    }

    public Xo setImpelTypeValue(int n2) {
        Xo_2 a2;
        int b2 = n2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean getDrag() {
        Xo_2 a2;
        return ((pm)a2.instance).getDrag();
    }

    @Override
    public boolean hasImpelZ() {
        Xo_2 a2;
        return ((pm)a2.instance).hasImpelZ();
    }

    @Override
    public float getImpelZ() {
        Xo_2 a2;
        return ((pm)a2.instance).getImpelZ();
    }

    public Xo clearImpelType() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.e((pm)((pm)xo_2.instance));
        return a2;
    }

    public Xo setImpelXZOnSides(boolean bl2) {
        Xo_2 a2;
        boolean b2 = bl2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.l((pm)((pm)xo_2.instance), (boolean)b2);
        return a2;
    }

    @Override
    public boolean hasImpelType() {
        Xo_2 a2;
        return ((pm)a2.instance).hasImpelType();
    }

    @Override
    public List<Float> getCoordsList() {
        Xo_2 a2;
        return Collections.unmodifiableList(((pm)a2.instance).getCoordsList());
    }

    @Override
    public ByteString getIdBytes() {
        Xo_2 a2;
        return ((pm)a2.instance).getIdBytes();
    }

    public Xo clearDrag() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.A((pm)((pm)xo_2.instance));
        return a2;
    }

    @Override
    public boolean hasAffectOnlyPlayers() {
        Xo_2 a2;
        return ((pm)a2.instance).hasAffectOnlyPlayers();
    }

    public Xo setDrag(boolean bl2) {
        Xo_2 a2;
        boolean b2 = bl2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance), (boolean)b2);
        return a2;
    }

    @Override
    public boolean getAffectOnlyPlayers() {
        Xo_2 a2;
        return ((pm)a2.instance).getAffectOnlyPlayers();
    }

    public Xo clearImpelZ() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance));
        return a2;
    }

    public Xo setImpelX(float f2) {
        Xo_2 a2;
        float b2 = f2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.f((pm)((pm)xo_2.instance), (float)b2);
        return a2;
    }

    public Xo setImpelY(float f2) {
        Xo_2 a2;
        float b2 = f2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance), (float)b2);
        return a2;
    }

    @Override
    public float getCoords(int n2) {
        int b2 = n2;
        Xo_2 a2 = this;
        return ((pm)a2.instance).getCoords(b2);
    }

    public Xo setAffectOnlyPlayers(boolean bl2) {
        Xo_2 a2;
        boolean b2 = bl2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.f((pm)((pm)xo_2.instance), (boolean)b2);
        return a2;
    }

    @Override
    public boolean hasImpelY() {
        Xo_2 a2;
        return ((pm)a2.instance).hasImpelY();
    }

    public Xo clearImpelXZOnSides() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.C((pm)((pm)xo_2.instance));
        return a2;
    }

    public Xo setImpelType(Un un2) {
        Xo_2 a2;
        Un b2 = un2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance), (Un)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Xo setCoords(int n2, float f2) {
        void b2;
        Xo_2 a2;
        float c2 = f2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance), (int)b2, (float)c2);
        return a2;
    }

    @Override
    public boolean getImpelYOnTop() {
        Xo_2 a2;
        return ((pm)a2.instance).getImpelYOnTop();
    }

    @Override
    public float getImpelX() {
        Xo_2 a2;
        return ((pm)a2.instance).getImpelX();
    }

    public Xo setIdBytes(ByteString byteString) {
        Xo_2 a2;
        ByteString b2 = byteString;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.J((pm)((pm)xo_2.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public boolean hasImpelXZOnSides() {
        Xo_2 a2;
        return ((pm)a2.instance).hasImpelXZOnSides();
    }

    @Override
    public String getId() {
        Xo_2 a2;
        return ((pm)a2.instance).getId();
    }

    public Xo setImpelYOnTop(boolean bl2) {
        Xo_2 a2;
        boolean b2 = bl2;
        Xo_2 xo_2 = a2 = this;
        xo_2.copyOnWrite();
        pm.C((pm)((pm)xo_2.instance), (boolean)b2);
        return a2;
    }

    public Xo clearCoords() {
        Xo_2 a2;
        Xo_2 xo_2 = a2;
        xo_2.copyOnWrite();
        pm.l((pm)((pm)xo_2.instance));
        return a2;
    }
}

