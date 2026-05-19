/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  UN
 *  WN
 *  mn
 *  xM
 *  zA
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class eM
extends GeneratedMessageLite.Builder<UN, eM>
implements zA {
    public xM getHoverFinish(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getHoverFinish(b2);
    }

    public eM clearVisibleFinish() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.i((UN)((UN)eM2.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addVisible(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.l((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setVisible(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.i((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public List<xM> getVisibleFinishList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getVisibleFinishList());
    }

    public eM addHover(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    public xM getHoverStart(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getHoverStart(b2);
    }

    public eM removeVisibleFinish(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.e((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addBoth(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.A((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public List<xM> getBothList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getBothList());
    }

    public int getVisibleCount() {
        eM a2;
        return ((UN)a2.instance).getVisibleCount();
    }

    public /* synthetic */ eM(AN aN2) {
        eM b2 = aN2;
        eM a2 = this;
        a2();
    }

    public xM getVisibleFinish(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getVisibleFinish(b2);
    }

    /*
     * WARNING - void declaration
     */
    public eM setVisibleFinish(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.F((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM removeHoverStart(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.A((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    public int getVisibleStartCount() {
        eM a2;
        return ((UN)a2.instance).getVisibleStartCount();
    }

    /*
     * WARNING - void declaration
     */
    public eM setStart(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.I((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setHover(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.k((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public int getStartCount() {
        eM a2;
        return ((UN)a2.instance).getStartCount();
    }

    public List<xM> getHoverFinishList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getHoverFinishList());
    }

    public eM setEditDuration(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.l((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    public eM clearVisibleStart() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.k((UN)((UN)eM2.instance));
        return a2;
    }

    public int getBothCount() {
        eM a2;
        return ((UN)a2.instance).getBothCount();
    }

    public eM setEditEasingValue(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.i((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setHoverStart(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.j((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public int getFinishCount() {
        eM a2;
        return ((UN)a2.instance).getFinishCount();
    }

    public eM addAllVisible(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.f((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    public eM clearHoverStart() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.A((UN)((UN)eM2.instance));
        return a2;
    }

    public eM addAllVisibleStart(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.d((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    public eM removeVisibleStart(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.f((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    public eM addHover(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setHoverStart(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.j((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setFinish(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.H((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setBoth(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.C((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public boolean hasEditEasing() {
        eM a2;
        return ((UN)a2.instance).hasEditEasing();
    }

    public int getHoverCount() {
        eM a2;
        return ((UN)a2.instance).getHoverCount();
    }

    /*
     * WARNING - void declaration
     */
    public eM addHoverStart(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.e((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public eM clearVisible() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.C((UN)((UN)eM2.instance));
        return a2;
    }

    public int getEditDuration() {
        eM a2;
        return ((UN)a2.instance).getEditDuration();
    }

    public eM setEditEasingExprBytes(ByteString byteString) {
        eM a2;
        ByteString b2 = byteString;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (ByteString)b2);
        return a2;
    }

    public eM setEditEasingExpr(String string) {
        eM a2;
        String b2 = string;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (String)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addHoverFinish(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public eM addBoth(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.d((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    public List<xM> getVisibleStartList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getVisibleStartList());
    }

    /*
     * WARNING - void declaration
     */
    public eM addVisibleStart(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.a((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public eM addHoverFinish(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.f((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    public eM clearEditDuration() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.f((UN)((UN)eM2.instance));
        return a2;
    }

    public eM clearStart() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.l((UN)((UN)eM2.instance));
        return a2;
    }

    public boolean hasEditDuration() {
        eM a2;
        return ((UN)a2.instance).hasEditDuration();
    }

    public boolean hasEditEasingExpr() {
        eM a2;
        return ((UN)a2.instance).hasEditEasingExpr();
    }

    public eM addStart(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.M((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    public xM getStart(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getStart(b2);
    }

    public List<xM> getVisibleList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getVisibleList());
    }

    public eM addFinish(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.A((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    public int getHoverFinishCount() {
        eM a2;
        return ((UN)a2.instance).getHoverFinishCount();
    }

    public eM removeHoverFinish(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addBoth(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.A((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM addStart(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.M((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    public eM addAllHoverStart(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.i((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addVisible(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.l((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public List<xM> getFinishList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getFinishList());
    }

    public eM setEditEasing(WN wN2) {
        eM a2;
        eM b2 = wN2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (WN)b2);
        return a2;
    }

    public xM getHover(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getHover(b2);
    }

    public eM addVisible(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.l((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    public eM addHoverFinish(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.f((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    public eM clearEditEasingExpr() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.d((UN)((UN)eM2.instance));
        return a2;
    }

    public eM removeHover(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.d((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    private eM() {
        super(UN.f());
        eM a2;
    }

    public int getHoverStartCount() {
        eM a2;
        return ((UN)a2.instance).getHoverStartCount();
    }

    /*
     * WARNING - void declaration
     */
    public eM setHoverFinish(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.g((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addVisibleFinish(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.f((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addHover(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.G((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public ByteString getEditEasingExprBytes() {
        eM a2;
        return ((UN)a2.instance).getEditEasingExprBytes();
    }

    /*
     * WARNING - void declaration
     */
    public eM setHoverFinish(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.g((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public eM removeVisible(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.M((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setBoth(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.C((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public eM addAllVisibleFinish(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.e((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    public eM addHoverStart(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.e((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    public eM removeFinish(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.C((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    public eM addAllStart(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setVisibleStart(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.d((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setVisibleStart(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.d((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM clearFinish() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.D((UN)((UN)eM2.instance));
        return a2;
    }

    public eM addVisible(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.l((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addHoverStart(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.e((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM addVisibleStart(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.C((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setFinish(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.H((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setVisible(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.i((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public List<xM> getStartList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getStartList());
    }

    public eM addVisibleStart(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.C((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    public eM addAllFinish(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.C((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    public eM addFinish(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.A((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addFinish(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.M((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public eM removeStart(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.G((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setStart(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.I((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public eM addHoverStart(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.e((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    public xM getVisibleStart(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getVisibleStart(b2);
    }

    public eM addVisibleFinish(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.i((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addHover(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.G((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM addAllHover(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.l((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addFinish(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.M((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public xM getFinish(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getFinish(b2);
    }

    public eM addVisibleFinish(xM xM2) {
        eM a2;
        eM b2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.i((UN)((UN)eM2.instance), (xM)b2);
        return a2;
    }

    public xM getVisible(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getVisible(b2);
    }

    /*
     * WARNING - void declaration
     */
    public eM addVisibleFinish(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.f((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM removeBoth(int n2) {
        eM a2;
        int b2 = n2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.D((UN)((UN)eM2.instance), (int)b2);
        return a2;
    }

    public eM addBoth(mn mn2) {
        eM a2;
        eM b2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.d((UN)((UN)eM2.instance), (xM)((xM)b2.build()));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM setHover(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.k((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM clearBoth() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.G((UN)((UN)eM2.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addStart(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.D((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public int getVisibleFinishCount() {
        eM a2;
        return ((UN)a2.instance).getVisibleFinishCount();
    }

    public List<xM> getHoverStartList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getHoverStartList());
    }

    public String getEditEasingExpr() {
        eM a2;
        return ((UN)a2.instance).getEditEasingExpr();
    }

    /*
     * WARNING - void declaration
     */
    public eM setVisibleFinish(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.F((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public List<xM> getHoverList() {
        eM a2;
        return Collections.unmodifiableList(((UN)a2.instance).getHoverList());
    }

    public xM getBoth(int n2) {
        int b2 = n2;
        eM a2 = this;
        return ((UN)a2.instance).getBoth(b2);
    }

    public int getEditEasingValue() {
        eM a2;
        return ((UN)a2.instance).getEditEasingValue();
    }

    /*
     * WARNING - void declaration
     */
    public eM addVisibleStart(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.a((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM clearEditEasing() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public eM addStart(int n2, mn mn2) {
        void b2;
        eM a2;
        eM c2 = mn2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.D((UN)((UN)eM2.instance), (int)b2, (xM)((xM)c2.build()));
        return a2;
    }

    public eM addAllHoverFinish(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.A((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    public eM addAllBoth(Iterable<? extends xM> iterable) {
        eM a2;
        Iterable<? extends xM> b2 = iterable;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.M((UN)((UN)eM2.instance), (Iterable)b2);
        return a2;
    }

    public WN getEditEasing() {
        eM a2;
        return ((UN)a2.instance).getEditEasing();
    }

    /*
     * WARNING - void declaration
     */
    public eM addHoverFinish(int n2, xM xM2) {
        void b2;
        eM a2;
        eM c2 = xM2;
        eM eM2 = a2 = this;
        eM2.copyOnWrite();
        UN.J((UN)((UN)eM2.instance), (int)b2, (xM)c2);
        return a2;
    }

    public eM clearHover() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.e((UN)((UN)eM2.instance));
        return a2;
    }

    public eM clearHoverFinish() {
        eM a2;
        eM eM2 = a2;
        eM2.copyOnWrite();
        UN.M((UN)((UN)eM2.instance));
        return a2;
    }
}

