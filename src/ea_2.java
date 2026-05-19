/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AM
 *  Mm
 */
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface ea_2
extends MessageLiteOrBuilder {
    public List<Float> getScaleList();

    public int getColorAnim();

    public List<Float> getLocAnimList();

    public boolean hasColorAnim();

    public List<Float> getAngleAnimList();

    public boolean hasRadius();

    public int getAngleAnimCount();

    public List<Float> getAngleList();

    public boolean hasRadiusAnim();

    public int getLocAnimCount();

    public List<Float> getScaleAnimList();

    public int getScaleAnimCount();

    public int getAngleAnimSmartCount();

    public boolean hasColor();

    public int getScaleCount();

    public List<Float> getLocList();

    public int getColor();

    public float getAngle(int var1);

    public List<Float> getAngleAnimSmartList();

    public float getLoc(int var1);

    public float getLocAnim(int var1);

    public float getRadiusAnim();

    public float getScaleAnim(int var1);

    public int getLocCount();

    public int getAngleCount();

    public Mm getColorvalCase();

    public float getAngleAnim(int var1);

    public AM getRadiusvalCase();

    public float getScale(int var1);

    public float getAngleAnimSmart(int var1);

    public float getRadius();
}

