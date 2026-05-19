/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  IN
 *  Lm
 *  Ma
 *  To
 *  WM
 *  eO
 *  hN
 *  pn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Collections;
import java.util.List;

public final class hN_3
extends GeneratedMessageLite.Builder<To, hN>
implements Ma {
    public hN addAllColumns(Iterable<? extends WM> iterable) {
        hN_3 a2;
        Iterable<? extends WM> b2 = iterable;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance), (Iterable)b2);
        return a2;
    }

    public hN setRowHoverColor(int n2) {
        hN_3 a2;
        int b2 = n2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.l((To)((To)hN_32.instance), (int)b2);
        return a2;
    }

    public hN clearMaxRows() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.d((To)((To)hN_32.instance));
        return a2;
    }

    public boolean hasTitle() {
        hN_3 a2;
        return ((To)a2.instance).hasTitle();
    }

    public int getRowsCount() {
        hN_3 a2;
        return ((To)a2.instance).getRowsCount();
    }

    public String getTitle() {
        hN_3 a2;
        return ((To)a2.instance).getTitle();
    }

    /*
     * WARNING - void declaration
     */
    public hN setRows(int n2, Lm lm2) {
        void b2;
        hN_3 a2;
        hN_3 c2 = lm2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance), (int)b2, (An)((An)c2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public hN addColumns(int n2, WM wM2) {
        void b2;
        hN_3 a2;
        hN_3 c2 = wM2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (int)b2, (WM)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public hN setColumns(int n2, WM wM2) {
        void b2;
        hN_3 a2;
        hN_3 c2 = wM2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance), (int)b2, (WM)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public hN setColumns(int n2, IN iN2) {
        void b2;
        hN_3 a2;
        hN_3 c2 = iN2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance), (int)b2, (WM)((WM)c2.build()));
        return a2;
    }

    public hN setFont(pn pn2) {
        hN_3 a2;
        hN_3 b2 = pn2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance), (pn)b2);
        return a2;
    }

    public hN clearRowHoverColor() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.i((To)((To)hN_32.instance));
        return a2;
    }

    public hN clearHeadingColor() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.l((To)((To)hN_32.instance));
        return a2;
    }

    public hN setHeadingColor(int n2) {
        hN_3 a2;
        int b2 = n2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.C((To)((To)hN_32.instance), (int)b2);
        return a2;
    }

    public hN removeRows(int n2) {
        hN_3 a2;
        int b2 = n2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.e((To)((To)hN_32.instance), (int)b2);
        return a2;
    }

    public hN setDrawBack(boolean bl2) {
        hN_3 a2;
        boolean b2 = bl2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (boolean)b2);
        return a2;
    }

    public int getTitleColor() {
        hN_3 a2;
        return ((To)a2.instance).getTitleColor();
    }

    public boolean hasMaxRows() {
        hN_3 a2;
        return ((To)a2.instance).hasMaxRows();
    }

    public hN addColumns(IN iN2) {
        hN_3 a2;
        hN_3 b2 = iN2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (WM)((WM)b2.build()));
        return a2;
    }

    public int getHeadingColor() {
        hN_3 a2;
        return ((To)a2.instance).getHeadingColor();
    }

    public pn getFont() {
        hN_3 a2;
        return ((To)a2.instance).getFont();
    }

    public boolean hasFont() {
        hN_3 a2;
        return ((To)a2.instance).hasFont();
    }

    public hN clearScrollbarColor() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.M((To)((To)hN_32.instance));
        return a2;
    }

    public int getScrollbarColor() {
        hN_3 a2;
        return ((To)a2.instance).getScrollbarColor();
    }

    public hN addRows(An an2) {
        hN_3 a2;
        MessageLiteOrBuilder b2 = an2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (An)b2);
        return a2;
    }

    public boolean hasHeadingColor() {
        hN_3 a2;
        return ((To)a2.instance).hasHeadingColor();
    }

    public hN setFont(eO eO2) {
        hN_3 a2;
        hN_3 b2 = eO2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance), (pn)((pn)b2.build()));
        return a2;
    }

    public boolean hasRadius() {
        hN_3 a2;
        return ((To)a2.instance).hasRadius();
    }

    public int getRadius() {
        hN_3 a2;
        return ((To)a2.instance).getRadius();
    }

    public hN addColumns(WM wM2) {
        hN_3 a2;
        hN_3 b2 = wM2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (WM)b2);
        return a2;
    }

    public hN setRadius(int n2) {
        hN_3 a2;
        int b2 = n2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.i((To)((To)hN_32.instance), (int)b2);
        return a2;
    }

    public ByteString getTitleBytes() {
        hN_3 a2;
        return ((To)a2.instance).getTitleBytes();
    }

    public List<An> getRowsList() {
        hN_3 a2;
        return Collections.unmodifiableList(((To)a2.instance).getRowsList());
    }

    public hN clearRows() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance));
        return a2;
    }

    public List<WM> getColumnsList() {
        hN_3 a2;
        return Collections.unmodifiableList(((To)a2.instance).getColumnsList());
    }

    public hN clearRadius() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.D((To)((To)hN_32.instance));
        return a2;
    }

    public hN clearTitle() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.A((To)((To)hN_32.instance));
        return a2;
    }

    public hN setScrollbarColor(int n2) {
        hN_3 a2;
        int b2 = n2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.d((To)((To)hN_32.instance), (int)b2);
        return a2;
    }

    public boolean hasTitleColor() {
        hN_3 a2;
        return ((To)a2.instance).hasTitleColor();
    }

    public boolean hasRowHoverColor() {
        hN_3 a2;
        return ((To)a2.instance).hasRowHoverColor();
    }

    public hN setTitleColor(int n2) {
        hN_3 a2;
        int b2 = n2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.M((To)((To)hN_32.instance), (int)b2);
        return a2;
    }

    public hN clearDrawBack() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.C((To)((To)hN_32.instance));
        return a2;
    }

    private hN_3() {
        super(To.f());
        hN_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public hN setRows(int n2, An an2) {
        void b2;
        hN_3 a2;
        MessageLiteOrBuilder c2 = an2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance), (int)b2, (An)c2);
        return a2;
    }

    public An getRows(int n2) {
        int b2 = n2;
        hN_3 a2 = this;
        return ((To)a2.instance).getRows(b2);
    }

    public hN clearColumns() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance));
        return a2;
    }

    public hN clearFont() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.e((To)((To)hN_32.instance));
        return a2;
    }

    public hN setTitleBytes(ByteString byteString) {
        hN_3 a2;
        ByteString b2 = byteString;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (ByteString)b2);
        return a2;
    }

    public WM getColumns(int n2) {
        int b2 = n2;
        hN_3 a2 = this;
        return ((To)a2.instance).getColumns(b2);
    }

    public int getRowHoverColor() {
        hN_3 a2;
        return ((To)a2.instance).getRowHoverColor();
    }

    public boolean hasDrawBack() {
        hN_3 a2;
        return ((To)a2.instance).hasDrawBack();
    }

    public boolean getDrawBack() {
        hN_3 a2;
        return ((To)a2.instance).getDrawBack();
    }

    public int getColumnsCount() {
        hN_3 a2;
        return ((To)a2.instance).getColumnsCount();
    }

    /*
     * WARNING - void declaration
     */
    public hN addColumns(int n2, IN iN2) {
        void b2;
        hN_3 a2;
        hN_3 c2 = iN2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (int)b2, (WM)((WM)c2.build()));
        return a2;
    }

    public int getMaxRows() {
        hN_3 a2;
        return ((To)a2.instance).getMaxRows();
    }

    /*
     * WARNING - void declaration
     */
    public hN addRows(int n2, An an2) {
        void b2;
        hN_3 a2;
        MessageLiteOrBuilder c2 = an2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (int)b2, (An)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public hN addRows(int n2, Lm lm2) {
        void b2;
        hN_3 a2;
        hN_3 c2 = lm2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (int)b2, (An)((An)c2.build()));
        return a2;
    }

    public boolean hasScrollbarColor() {
        hN_3 a2;
        return ((To)a2.instance).hasScrollbarColor();
    }

    public hN addAllRows(Iterable<? extends An> iterable) {
        hN_3 a2;
        Iterable<? extends An> b2 = iterable;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (Iterable)b2);
        return a2;
    }

    public hN setTitle(String string) {
        hN_3 a2;
        String b2 = string;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (String)b2);
        return a2;
    }

    public hN removeColumns(int n2) {
        hN_3 a2;
        int b2 = n2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.f((To)((To)hN_32.instance), (int)b2);
        return a2;
    }

    public hN clearTitleColor() {
        hN_3 a2;
        hN_3 hN_32 = a2;
        hN_32.copyOnWrite();
        To.G((To)((To)hN_32.instance));
        return a2;
    }

    public hN mergeFont(pn pn2) {
        hN_3 a2;
        hN_3 b2 = pn2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (pn)b2);
        return a2;
    }

    public hN setMaxRows(int n2) {
        hN_3 a2;
        int b2 = n2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (int)b2);
        return a2;
    }

    public hN addRows(Lm lm2) {
        hN_3 a2;
        hN_3 b2 = lm2;
        hN_3 hN_32 = a2 = this;
        hN_32.copyOnWrite();
        To.J((To)((To)hN_32.instance), (An)((An)b2.build()));
        return a2;
    }

    public /* synthetic */ hN_3(AN aN2) {
        hN_3 b2 = aN2;
        hN_3 a2 = this;
        a2();
    }
}

