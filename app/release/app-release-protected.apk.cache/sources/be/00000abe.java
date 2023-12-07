package o;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class setContentScrim implements setScaleY<PointF> {
    public static final setContentScrim setY = new setContentScrim();

    private setContentScrim() {
    }

    @Override // o.setScaleY
    public final /* synthetic */ PointF setX(setMeasureAllChildren setmeasureallchildren, float f) {
        setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1 textAlignment = setmeasureallchildren.setTextAlignment();
        if (textAlignment == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_ARRAY) {
            return AppDatabase_Impl.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, f);
        }
        if (textAlignment == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_OBJECT) {
            return AppDatabase_Impl.MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, f);
        }
        if (textAlignment == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.NUMBER) {
            PointF pointF = new PointF(((float) setmeasureallchildren.setNavigationOnClickListener()) * f, ((float) setmeasureallchildren.setNavigationOnClickListener()) * f);
            while (setmeasureallchildren.setUnboundedRipple()) {
                setmeasureallchildren.setChipCornerRadius();
            }
            return pointF;
        }
        StringBuilder sb = new StringBuilder("Cannot convert json to point. Next token is ");
        sb.append(textAlignment);
        throw new IllegalArgumentException(sb.toString());
    }
}