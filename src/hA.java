/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface hA
extends MessageLiteOrBuilder {
    public boolean hasImpelX();

    public boolean hasImpelYOnTop();

    public boolean getImpelXZOnSides();

    public int getCoordsCount();

    public boolean hasDrag();

    public float getImpelZ();

    public float getImpelX();

    public float getImpelY();

    public List<Float> getCoordsList();

    public int getAnimationTicks();

    public boolean hasImpelType();

    public boolean hasImpelXZOnSides();

    public Un getImpelType();

    public boolean getDrag();

    public float getCoords(int var1);

    public boolean hasImpelZ();

    public boolean hasAnimationTicks();

    public boolean hasImpelY();

    public boolean getImpelYOnTop();

    public int getImpelTypeValue();
}

