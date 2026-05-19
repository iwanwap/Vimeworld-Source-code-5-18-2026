/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WN
 *  xM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface zA_2
extends MessageLiteOrBuilder {
    public int getBothCount();

    public int getFinishCount();

    public boolean hasEditEasingExpr();

    public List<xM> getBothList();

    public xM getVisibleFinish(int var1);

    public List<xM> getVisibleStartList();

    public ByteString getEditEasingExprBytes();

    public int getHoverCount();

    public xM getHover(int var1);

    public int getHoverStartCount();

    public List<xM> getVisibleList();

    public int getEditDuration();

    public List<xM> getStartList();

    public xM getBoth(int var1);

    public xM getFinish(int var1);

    public int getVisibleFinishCount();

    public boolean hasEditEasing();

    public xM getVisible(int var1);

    public List<xM> getFinishList();

    public int getVisibleStartCount();

    public List<xM> getVisibleFinishList();

    public List<xM> getHoverFinishList();

    public xM getHoverFinish(int var1);

    public xM getStart(int var1);

    public List<xM> getHoverStartList();

    public int getHoverFinishCount();

    public xM getHoverStart(int var1);

    public int getEditEasingValue();

    public int getStartCount();

    public int getVisibleCount();

    public List<xM> getHoverList();

    public xM getVisibleStart(int var1);

    public boolean hasEditDuration();

    public String getEditEasingExpr();

    public WN getEditEasing();
}

