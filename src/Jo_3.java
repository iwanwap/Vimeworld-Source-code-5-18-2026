/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Dn
 *  FM
 *  Fm
 *  JN
 *  Jo
 *  Km
 *  OL
 *  Rn
 *  Tm
 *  To
 *  UN
 *  Vo
 *  WJ
 *  Wn
 *  XM
 *  Yo
 *  aN
 *  an
 *  cm
 *  dl
 *  em
 *  go
 *  hN
 *  nk
 *  oO
 *  pL
 *  qK
 *  qO
 *  un
 *  wn
 *  xN
 *  zk
 *  zn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Collections;
import java.util.List;

public final class Jo_3
extends GeneratedMessageLite.Builder<XM, Jo>
implements va {
    public Jo setEText(qK qK2) {
        Jo_3 a2;
        Jo_3 b2 = qK2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (pL)((pL)b2.build()));
        return a2;
    }

    public Jo mergeETextClock(dl dl2) {
        Jo_3 a2;
        Jo_3 b2 = dl2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (dl)b2);
        return a2;
    }

    public Jo setETextClock(QK qK2) {
        Jo_3 a2;
        GeneratedMessageLite.Builder b2 = qK2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (dl)((dl)b2.build()));
        return a2;
    }

    public Jo setEProgressBar(qO qO2) {
        Jo_3 a2;
        Jo_3 b2 = qO2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (qO)b2);
        return a2;
    }

    @Override
    public String getScaleYExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).getScaleYExpr();
    }

    @Override
    public rm getEContainer() {
        Jo_3 a2;
        return ((XM)a2.instance).getEContainer();
    }

    @Override
    public boolean hasRotateExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).hasRotateExpr();
    }

    public Jo setAnimation(UN uN2) {
        Jo_3 a2;
        Jo_3 b2 = uN2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (UN)b2);
        return a2;
    }

    public Jo setERectangle(zn zn2) {
        Jo_3 a2;
        Jo_3 b2 = zn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Fm)((Fm)b2.build()));
        return a2;
    }

    public Jo setERadialProgressBar(un un2) {
        Jo_3 a2;
        Jo_3 b2 = un2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Wn)((Wn)b2.build()));
        return a2;
    }

    @Override
    public boolean getTooltipDrawVanillaBackground() {
        Jo_3 a2;
        return ((XM)a2.instance).getTooltipDrawVanillaBackground();
    }

    public Jo mergeAnimation(UN uN2) {
        Jo_3 a2;
        Jo_3 b2 = uN2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (UN)b2);
        return a2;
    }

    public Jo setScaleY(float f2) {
        Jo_3 a2;
        float b2 = f2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.l((XM)((XM)jo_3.instance), (float)b2);
        return a2;
    }

    public Jo mergeEContainer(rm rm2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = rm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (rm)b2);
        return a2;
    }

    public Jo setScaleYExpr(String string) {
        Jo_3 a2;
        String b2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.C((XM)((XM)jo_3.instance), (String)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Jo setTooltip(int n2, String string) {
        void b2;
        Jo_3 a2;
        String c2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (int)b2, (String)c2);
        return a2;
    }

    @Override
    public xN getERadialSlider() {
        Jo_3 a2;
        return ((XM)a2.instance).getERadialSlider();
    }

    @Override
    public float getScaleY() {
        Jo_3 a2;
        return ((XM)a2.instance).getScaleY();
    }

    public Jo clearDuration() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.K((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public MM getKind() {
        Jo_3 a2;
        return ((XM)a2.instance).getKind();
    }

    @Override
    public ByteString getScaleXExprBytes() {
        Jo_3 a2;
        return ((XM)a2.instance).getScaleXExprBytes();
    }

    @Override
    public float getScaleX() {
        Jo_3 a2;
        return ((XM)a2.instance).getScaleX();
    }

    public Jo mergeEProgressTimer(Bm bm2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = bm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Bm)b2);
        return a2;
    }

    @Override
    public float getScale() {
        Jo_3 a2;
        return ((XM)a2.instance).getScale();
    }

    public Jo setScaleXExpr(String string) {
        Jo_3 a2;
        String b2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.e((XM)((XM)jo_3.instance), (String)b2);
        return a2;
    }

    private Jo_3() {
        super(XM.f());
        Jo_3 a2;
    }

    @Override
    public String getScaleXExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).getScaleXExpr();
    }

    @Override
    public Fm getERectangle() {
        Jo_3 a2;
        return ((XM)a2.instance).getERectangle();
    }

    @Override
    public UN getAnimation() {
        Jo_3 a2;
        return ((XM)a2.instance).getAnimation();
    }

    @Override
    public boolean hasEText() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEText();
    }

    public Jo mergeETextInput(SJ sJ2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = sJ2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (SJ)b2);
        return a2;
    }

    @Override
    public boolean hasScaleX() {
        Jo_3 a2;
        return ((XM)a2.instance).hasScaleX();
    }

    @Override
    public boolean hasY() {
        Jo_3 a2;
        return ((XM)a2.instance).hasY();
    }

    @Override
    public boolean hasEMiniDot() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEMiniDot();
    }

    public Jo mergeETable(To to2) {
        Jo_3 a2;
        Jo_3 b2 = to2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (To)b2);
        return a2;
    }

    public Jo clearHoverGroup() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.G((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearEProgressBar() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.A((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public wn getOnClick() {
        Jo_3 a2;
        return ((XM)a2.instance).getOnClick();
    }

    public Jo clearAnimation() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.e((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearHoverable() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.q((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo addTooltipBytes(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.e((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    public Jo setEButton(oO oO2) {
        Jo_3 a2;
        Jo_3 b2 = oO2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Dn)((Dn)b2.build()));
        return a2;
    }

    public Jo setKind(MM mM2) {
        Jo_3 a2;
        MM b2 = mM2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (MM)b2);
        return a2;
    }

    public Jo clearXExpr() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.s((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasScaleXExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).hasScaleXExpr();
    }

    public Jo clearRotate() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.b((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasDelay() {
        Jo_3 a2;
        return ((XM)a2.instance).hasDelay();
    }

    @Override
    public boolean hasPosition() {
        Jo_3 a2;
        return ((XM)a2.instance).hasPosition();
    }

    public Jo clearRotateExpr() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setHoverGroupBytes(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public boolean hasXExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).hasXExpr();
    }

    public Jo setPositionValue(int n2) {
        Jo_3 a2;
        int b2 = n2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (int)b2);
        return a2;
    }

    public Jo setETextTimer(OL oL2) {
        Jo_3 a2;
        Jo_3 b2 = oL2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (OL)b2);
        return a2;
    }

    public Jo clearPosition() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.Y((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasFloatPosition() {
        Jo_3 a2;
        return ((XM)a2.instance).hasFloatPosition();
    }

    public Jo setVisibility(nk nk2) {
        Jo_3 a2;
        Jo_3 b2 = nk2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (yl)((yl)b2.build()));
        return a2;
    }

    public Jo mergeBehavior(xm xm2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = xm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (xm)b2);
        return a2;
    }

    @Override
    public boolean hasScaleYExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).hasScaleYExpr();
    }

    public Jo setBehavior(Tm tm2) {
        Jo_3 a2;
        Jo_3 b2 = tm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (xm)((xm)b2.build()));
        return a2;
    }

    public Jo setYExprBytes(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.i((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public boolean hasOnClick() {
        Jo_3 a2;
        return ((XM)a2.instance).hasOnClick();
    }

    public Jo mergeETextTimer(OL oL2) {
        Jo_3 a2;
        Jo_3 b2 = oL2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (OL)b2);
        return a2;
    }

    @Override
    public float getX() {
        Jo_3 a2;
        return ((XM)a2.instance).getX();
    }

    public Jo clearEImage9Slice() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.k((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setColor(int n2) {
        Jo_3 a2;
        int b2 = n2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (int)b2);
        return a2;
    }

    public Jo setEContainer(rm rm2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = rm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (rm)b2);
        return a2;
    }

    public Jo mergeEPlayer(Hm hm2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = hm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (Hm)b2);
        return a2;
    }

    @Override
    public boolean hasERadialProgressBar() {
        Jo_3 a2;
        return ((XM)a2.instance).hasERadialProgressBar();
    }

    public Jo clearBehavior() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.o((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearUuid() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.R((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasScaleY() {
        Jo_3 a2;
        return ((XM)a2.instance).hasScaleY();
    }

    public Jo mergeEImage9Slice(em em2) {
        Jo_3 a2;
        Jo_3 b2 = em2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (em)b2);
        return a2;
    }

    @Override
    public boolean hasEImage9Slice() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEImage9Slice();
    }

    @Override
    public List<String> getTooltipList() {
        Jo_3 a2;
        return Collections.unmodifiableList(((XM)a2.instance).getTooltipList());
    }

    public Jo setETable(To to2) {
        Jo_3 a2;
        Jo_3 b2 = to2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (To)b2);
        return a2;
    }

    public Jo mergeEProgressBar(qO qO2) {
        Jo_3 a2;
        Jo_3 b2 = qO2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (qO)b2);
        return a2;
    }

    public Jo clearScale() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.L((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearEContainer() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.y((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public aN getEModel() {
        Jo_3 a2;
        return ((XM)a2.instance).getEModel();
    }

    @Override
    public boolean hasEProgressBar() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEProgressBar();
    }

    @Override
    public ByteString getXExprBytes() {
        Jo_3 a2;
        return ((XM)a2.instance).getXExprBytes();
    }

    @Override
    public SJ getETextInput() {
        Jo_3 a2;
        return ((XM)a2.instance).getETextInput();
    }

    public Jo setBehavior(xm xm2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = xm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (xm)b2);
        return a2;
    }

    @Override
    public ByteString getYExprBytes() {
        Jo_3 a2;
        return ((XM)a2.instance).getYExprBytes();
    }

    @Override
    public yl getVisibility() {
        Jo_3 a2;
        return ((XM)a2.instance).getVisibility();
    }

    @Override
    public ByteString getHoverGroupBytes() {
        Jo_3 a2;
        return ((XM)a2.instance).getHoverGroupBytes();
    }

    public Jo setUuid(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.A((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    public Jo addTooltip(String string) {
        Jo_3 a2;
        String b2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (String)b2);
        return a2;
    }

    public Jo setRotate(float f2) {
        Jo_3 a2;
        float b2 = f2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.C((XM)((XM)jo_3.instance), (float)b2);
        return a2;
    }

    public Jo clearTooltipDrawVanillaBackground() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.i((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setScaleX(float f2) {
        Jo_3 a2;
        float b2 = f2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.e((XM)((XM)jo_3.instance), (float)b2);
        return a2;
    }

    @Override
    public an getPosition() {
        Jo_3 a2;
        return ((XM)a2.instance).getPosition();
    }

    public Jo clearYExpr() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.d((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setHoverGroup(String string) {
        Jo_3 a2;
        String b2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.M((XM)((XM)jo_3.instance), (String)b2);
        return a2;
    }

    @Override
    public To getETable() {
        Jo_3 a2;
        return ((XM)a2.instance).getETable();
    }

    @Override
    public boolean hasHoverable() {
        Jo_3 a2;
        return ((XM)a2.instance).hasHoverable();
    }

    public Jo setRotateExprBytes(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.d((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public boolean hasEModel() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEModel();
    }

    @Override
    public int getPositionValue() {
        Jo_3 a2;
        return ((XM)a2.instance).getPositionValue();
    }

    public Jo clearEImage() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.g((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo mergeAttachment(jn jn2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = jn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (jn)b2);
        return a2;
    }

    public Jo clearScaleXExpr() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.j((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearX() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.Q((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setEImage9Slice(em em2) {
        Jo_3 a2;
        Jo_3 b2 = em2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (em)b2);
        return a2;
    }

    @Override
    public Hm getEPlayer() {
        Jo_3 a2;
        return ((XM)a2.instance).getEPlayer();
    }

    public Jo clearEPlayer() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.C((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setRotateExpr(String string) {
        Jo_3 a2;
        String b2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.l((XM)((XM)jo_3.instance), (String)b2);
        return a2;
    }

    @Override
    public dl getETextClock() {
        Jo_3 a2;
        return ((XM)a2.instance).getETextClock();
    }

    public Jo clearOnClick() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.P((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasERadialSlider() {
        Jo_3 a2;
        return ((XM)a2.instance).hasERadialSlider();
    }

    @Override
    public boolean hasEProgressTimer() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEProgressTimer();
    }

    public /* synthetic */ Jo_3(AN aN2) {
        Jo_3 b2 = aN2;
        Jo_3 a2 = this;
        a2();
    }

    @Override
    public boolean hasRotate() {
        Jo_3 a2;
        return ((XM)a2.instance).hasRotate();
    }

    @Override
    public boolean hasERectangle() {
        Jo_3 a2;
        return ((XM)a2.instance).hasERectangle();
    }

    @Override
    public boolean hasYExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).hasYExpr();
    }

    public Jo setDelay(int n2) {
        Jo_3 a2;
        int b2 = n2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.l((XM)((XM)jo_3.instance), (int)b2);
        return a2;
    }

    public Jo setEButton(Dn dn2) {
        Jo_3 a2;
        Jo_3 b2 = dn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Dn)b2);
        return a2;
    }

    public Jo setAttachment(jn jn2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = jn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (jn)b2);
        return a2;
    }

    @Override
    public ByteString getUuid() {
        Jo_3 a2;
        return ((XM)a2.instance).getUuid();
    }

    public Jo mergeEModel(aN aN2) {
        Jo_3 a2;
        Jo_3 b2 = aN2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (aN)b2);
        return a2;
    }

    @Override
    public int getKindValue() {
        Jo_3 a2;
        return ((XM)a2.instance).getKindValue();
    }

    public Jo setEProgressBar(VM vM2) {
        Jo_3 a2;
        GeneratedMessageLite.Builder b2 = vM2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (qO)((qO)b2.build()));
        return a2;
    }

    @Override
    public boolean hasAttachment() {
        Jo_3 a2;
        return ((XM)a2.instance).hasAttachment();
    }

    public Jo setEContainer(JN jN2) {
        Jo_3 a2;
        Jo_3 b2 = jN2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (rm)((rm)b2.build()));
        return a2;
    }

    public Jo clearScaleY() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.Z((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setIdBytes(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public OL getETextTimer() {
        Jo_3 a2;
        return ((XM)a2.instance).getETextTimer();
    }

    @Override
    public boolean hasETextClock() {
        Jo_3 a2;
        return ((XM)a2.instance).hasETextClock();
    }

    public Jo clearEModel() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.I((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setScale(float f2) {
        Jo_3 a2;
        float b2 = f2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (float)b2);
        return a2;
    }

    public Jo clearETable() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.c((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearFloatPosition() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.t((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setFloatPosition(boolean bl2) {
        Jo_3 a2;
        boolean b2 = bl2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (boolean)b2);
        return a2;
    }

    public Jo clearEText() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasETable() {
        Jo_3 a2;
        return ((XM)a2.instance).hasETable();
    }

    @Override
    public Dn getEButton() {
        Jo_3 a2;
        return ((XM)a2.instance).getEButton();
    }

    public Jo mergeERectangle(Fm fm2) {
        Jo_3 a2;
        Jo_3 b2 = fm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (Fm)b2);
        return a2;
    }

    public Jo clearVisibility() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.B((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasETextTimer() {
        Jo_3 a2;
        return ((XM)a2.instance).hasETextTimer();
    }

    @Override
    public boolean getHoverable() {
        Jo_3 a2;
        return ((XM)a2.instance).getHoverable();
    }

    @Override
    public boolean hasTooltipDrawVanillaBackground() {
        Jo_3 a2;
        return ((XM)a2.instance).hasTooltipDrawVanillaBackground();
    }

    public Jo mergeERadialProgressBar(Wn wn2) {
        Jo_3 a2;
        Jo_3 b2 = wn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (Wn)b2);
        return a2;
    }

    @Override
    public String getYExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).getYExpr();
    }

    public Jo clearKind() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.F((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public ByteString getScaleYExprBytes() {
        Jo_3 a2;
        return ((XM)a2.instance).getScaleYExprBytes();
    }

    public Jo setETextTimer(zk zk2) {
        Jo_3 a2;
        Jo_3 b2 = zk2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (OL)((OL)b2.build()));
        return a2;
    }

    @Override
    public Km getEImage() {
        Jo_3 a2;
        return ((XM)a2.instance).getEImage();
    }

    @Override
    public int getDelay() {
        Jo_3 a2;
        return ((XM)a2.instance).getDelay();
    }

    public Jo setDuration(long a2) {
        Jo_3 b2;
        Jo_3 jo_3 = b2;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (long)a2);
        return b2;
    }

    @Override
    public ByteString getIdBytes() {
        Jo_3 a2;
        return ((XM)a2.instance).getIdBytes();
    }

    @Override
    public String getId() {
        Jo_3 a2;
        return ((XM)a2.instance).getId();
    }

    public Jo setX(float f2) {
        Jo_3 a2;
        float b2 = f2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (float)b2);
        return a2;
    }

    public Jo setEProgressTimer(tM tM2) {
        Jo_3 a2;
        GeneratedMessageLite.Builder b2 = tM2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (Bm)((Bm)b2.build()));
        return a2;
    }

    public Jo setOnClick(wn wn2) {
        Jo_3 a2;
        Jo_3 b2 = wn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (wn)b2);
        return a2;
    }

    public Jo setYExpr(String string) {
        Jo_3 a2;
        String b2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.d((XM)((XM)jo_3.instance), (String)b2);
        return a2;
    }

    @Override
    public em getEImage9Slice() {
        Jo_3 a2;
        return ((XM)a2.instance).getEImage9Slice();
    }

    public Jo setXExpr(String string) {
        Jo_3 a2;
        String b2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (String)b2);
        return a2;
    }

    public Jo mergeEImage(Km km2) {
        Jo_3 a2;
        Jo_3 b2 = km2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Km)b2);
        return a2;
    }

    public Jo mergeEButton(Dn dn2) {
        Jo_3 a2;
        Jo_3 b2 = dn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (Dn)b2);
        return a2;
    }

    @Override
    public boolean hasHoverGroup() {
        Jo_3 a2;
        return ((XM)a2.instance).hasHoverGroup();
    }

    public Jo setEMiniDot(Yo yo2) {
        Jo_3 a2;
        Jo_3 b2 = yo2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (cm)((cm)b2.build()));
        return a2;
    }

    @Override
    public jn getAttachment() {
        Jo_3 a2;
        return ((XM)a2.instance).getAttachment();
    }

    public Jo setEImage(Wm wm2) {
        Jo_3 a2;
        GeneratedMessageLite.Builder b2 = wm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (Km)((Km)b2.build()));
        return a2;
    }

    @Override
    public float getY() {
        Jo_3 a2;
        return ((XM)a2.instance).getY();
    }

    @Override
    public boolean hasX() {
        Jo_3 a2;
        return ((XM)a2.instance).hasX();
    }

    public Jo setEPlayer(Hm hm2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = hm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Hm)b2);
        return a2;
    }

    public Jo setEModel(Rn rn2) {
        Jo_3 a2;
        Jo_3 b2 = rn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (aN)((aN)b2.build()));
        return a2;
    }

    public Jo clearEButton() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.m((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearTooltip() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.z((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setY(float f2) {
        Jo_3 a2;
        float b2 = f2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.d((XM)((XM)jo_3.instance), (float)b2);
        return a2;
    }

    public Jo setXExprBytes(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.M((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public boolean hasDuration() {
        Jo_3 a2;
        return ((XM)a2.instance).hasDuration();
    }

    @Override
    public Bm getEProgressTimer() {
        Jo_3 a2;
        return ((XM)a2.instance).getEProgressTimer();
    }

    @Override
    public String getHoverGroup() {
        Jo_3 a2;
        return ((XM)a2.instance).getHoverGroup();
    }

    public Jo clearId() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.w((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public qO getEProgressBar() {
        Jo_3 a2;
        return ((XM)a2.instance).getEProgressBar();
    }

    public Jo clearEProgressTimer() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.p((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasEImage() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEImage();
    }

    public Jo clearDelay() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.u((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setETextInput(WJ wJ2) {
        Jo_3 a2;
        Jo_3 b2 = wJ2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (SJ)((SJ)b2.build()));
        return a2;
    }

    @Override
    public pL getEText() {
        Jo_3 a2;
        return ((XM)a2.instance).getEText();
    }

    public Jo setEImage9Slice(Vo vo2) {
        Jo_3 a2;
        Jo_3 b2 = vo2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (em)((em)b2.build()));
        return a2;
    }

    @Override
    public ByteString getRotateExprBytes() {
        Jo_3 a2;
        return ((XM)a2.instance).getRotateExprBytes();
    }

    public Jo addAllTooltip(Iterable<String> iterable) {
        Jo_3 a2;
        Iterable<String> b2 = iterable;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Iterable)b2);
        return a2;
    }

    public Jo clearEMiniDot() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.h((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setAttachment(FM fM2) {
        Jo_3 a2;
        Jo_3 b2 = fM2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (jn)((jn)b2.build()));
        return a2;
    }

    public Jo mergeOnClick(wn wn2) {
        Jo_3 a2;
        Jo_3 b2 = wn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (wn)b2);
        return a2;
    }

    public Jo setETextClock(dl dl2) {
        Jo_3 a2;
        Jo_3 b2 = dl2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (dl)b2);
        return a2;
    }

    public Jo setOnClick(go go2) {
        Jo_3 a2;
        Jo_3 b2 = go2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (wn)((wn)b2.build()));
        return a2;
    }

    public Jo setEText(pL pL2) {
        Jo_3 a2;
        Jo_3 b2 = pL2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (pL)b2);
        return a2;
    }

    public Jo clearETextInput() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.H((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setHoverable(boolean bl2) {
        Jo_3 a2;
        boolean b2 = bl2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.l((XM)((XM)jo_3.instance), (boolean)b2);
        return a2;
    }

    public Jo setVisibility(yl yl2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = yl2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (yl)b2);
        return a2;
    }

    public Jo setEPlayer(Bn bn2) {
        Jo_3 a2;
        GeneratedMessageLite.Builder b2 = bn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Hm)((Hm)b2.build()));
        return a2;
    }

    @Override
    public ByteString getTooltipBytes(int n2) {
        int b2 = n2;
        Jo_3 a2 = this;
        return ((XM)a2.instance).getTooltipBytes(b2);
    }

    @Override
    public boolean hasAnimation() {
        Jo_3 a2;
        return ((XM)a2.instance).hasAnimation();
    }

    public Jo clearAttachment() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.U((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setId(String string) {
        Jo_3 a2;
        String b2 = string;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.i((XM)((XM)jo_3.instance), (String)b2);
        return a2;
    }

    public Jo mergeEText(pL pL2) {
        Jo_3 a2;
        Jo_3 b2 = pL2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (pL)b2);
        return a2;
    }

    @Override
    public boolean hasEPlayer() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEPlayer();
    }

    public Jo clearScaleX() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.M((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setScaleYExprBytes(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.l((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    public Jo setEMiniDot(cm cm2) {
        Jo_3 a2;
        Jo_3 b2 = cm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (cm)b2);
        return a2;
    }

    public Jo clearScaleYExpr() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.x((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public float getRotate() {
        Jo_3 a2;
        return ((XM)a2.instance).getRotate();
    }

    @Override
    public boolean hasId() {
        Jo_3 a2;
        return ((XM)a2.instance).hasId();
    }

    @Override
    public boolean hasVisibility() {
        Jo_3 a2;
        return ((XM)a2.instance).hasVisibility();
    }

    public Jo setERadialSlider(xN xN2) {
        Jo_3 a2;
        Jo_3 b2 = xN2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (xN)b2);
        return a2;
    }

    public Jo setERadialProgressBar(Wn wn2) {
        Jo_3 a2;
        Jo_3 b2 = wn2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Wn)b2);
        return a2;
    }

    public Jo clearERadialSlider() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.l((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public String getXExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).getXExpr();
    }

    @Override
    public boolean hasEContainer() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEContainer();
    }

    @Override
    public boolean hasScale() {
        Jo_3 a2;
        return ((XM)a2.instance).hasScale();
    }

    @Override
    public boolean hasUuid() {
        Jo_3 a2;
        return ((XM)a2.instance).hasUuid();
    }

    public Jo setPosition(an an2) {
        Jo_3 a2;
        Jo_3 b2 = an2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (an)b2);
        return a2;
    }

    public Jo setScaleXExprBytes(ByteString byteString) {
        Jo_3 a2;
        ByteString b2 = byteString;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.C((XM)((XM)jo_3.instance), (ByteString)b2);
        return a2;
    }

    @Override
    public int getColor() {
        Jo_3 a2;
        return ((XM)a2.instance).getColor();
    }

    public Jo mergeERadialSlider(xN xN2) {
        Jo_3 a2;
        Jo_3 b2 = xN2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (xN)b2);
        return a2;
    }

    @Override
    public String getTooltip(int n2) {
        int b2 = n2;
        Jo_3 a2 = this;
        return ((XM)a2.instance).getTooltip(b2);
    }

    @Override
    public int getTooltipCount() {
        Jo_3 a2;
        return ((XM)a2.instance).getTooltipCount();
    }

    public Jo setTooltipDrawVanillaBackground(boolean bl2) {
        Jo_3 a2;
        boolean b2 = bl2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (boolean)b2);
        return a2;
    }

    public Jo clearETextTimer() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.r((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo setETextInput(SJ sJ2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = sJ2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (SJ)b2);
        return a2;
    }

    @Override
    public long getDuration() {
        Jo_3 a2;
        return ((XM)a2.instance).getDuration();
    }

    @Override
    public xm getBehavior() {
        Jo_3 a2;
        return ((XM)a2.instance).getBehavior();
    }

    public Jo setERectangle(Fm fm2) {
        Jo_3 a2;
        Jo_3 b2 = fm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (Fm)b2);
        return a2;
    }

    @Override
    public cm getEMiniDot() {
        Jo_3 a2;
        return ((XM)a2.instance).getEMiniDot();
    }

    @Override
    public boolean hasColor() {
        Jo_3 a2;
        return ((XM)a2.instance).hasColor();
    }

    public Jo setEModel(aN aN2) {
        Jo_3 a2;
        Jo_3 b2 = aN2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (aN)b2);
        return a2;
    }

    @Override
    public boolean hasETextInput() {
        Jo_3 a2;
        return ((XM)a2.instance).hasETextInput();
    }

    public Jo mergeVisibility(yl yl2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = yl2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (yl)b2);
        return a2;
    }

    public Jo clearETextClock() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.S((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearERadialProgressBar() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.E((XM)((XM)jo_3.instance));
        return a2;
    }

    public Jo clearY() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.n((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public boolean hasEButton() {
        Jo_3 a2;
        return ((XM)a2.instance).hasEButton();
    }

    public Jo clearERectangle() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.D((XM)((XM)jo_3.instance));
        return a2;
    }

    @Override
    public Wn getERadialProgressBar() {
        Jo_3 a2;
        return ((XM)a2.instance).getERadialProgressBar();
    }

    public Jo mergeEMiniDot(cm cm2) {
        Jo_3 a2;
        Jo_3 b2 = cm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (cm)b2);
        return a2;
    }

    @Override
    public boolean hasBehavior() {
        Jo_3 a2;
        return ((XM)a2.instance).hasBehavior();
    }

    public Jo setEImage(Km km2) {
        Jo_3 a2;
        Jo_3 b2 = km2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (Km)b2);
        return a2;
    }

    public Jo setEProgressTimer(Bm bm2) {
        Jo_3 a2;
        MessageLiteOrBuilder b2 = bm2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.f((XM)((XM)jo_3.instance), (Bm)b2);
        return a2;
    }

    public Jo setERadialSlider(oo oo2) {
        Jo_3 a2;
        GeneratedMessageLite.Builder b2 = oo2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (xN)((xN)b2.build()));
        return a2;
    }

    @Override
    public boolean getFloatPosition() {
        Jo_3 a2;
        return ((XM)a2.instance).getFloatPosition();
    }

    public Jo setETable(hN hN2) {
        Jo_3 a2;
        Jo_3 b2 = hN2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (To)((To)b2.build()));
        return a2;
    }

    public Jo setAnimation(eM eM2) {
        Jo_3 a2;
        GeneratedMessageLite.Builder b2 = eM2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.J((XM)((XM)jo_3.instance), (UN)((UN)b2.build()));
        return a2;
    }

    @Override
    public String getRotateExpr() {
        Jo_3 a2;
        return ((XM)a2.instance).getRotateExpr();
    }

    public Jo setKindValue(int n2) {
        Jo_3 a2;
        int b2 = n2;
        Jo_3 jo_3 = a2 = this;
        jo_3.copyOnWrite();
        XM.C((XM)((XM)jo_3.instance), (int)b2);
        return a2;
    }

    public Jo clearColor() {
        Jo_3 a2;
        Jo_3 jo_3 = a2;
        jo_3.copyOnWrite();
        XM.a((XM)((XM)jo_3.instance));
        return a2;
    }
}

