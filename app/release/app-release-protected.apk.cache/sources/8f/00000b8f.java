package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import o.setIconTint;

/* loaded from: classes.dex */
final class setEvaluator {
    final Paint MenuHostHelper$$ExternalSyntheticLambda0;
    final getTranslateY MenuHostHelper$$ExternalSyntheticLambda1;
    final getTranslateY setIconTintList;
    final getTranslateY setLayoutAnimation;
    final getTranslateY setNavigationOnClickListener;
    final getTranslateY setOnLongClickListener;
    final getTranslateY setX;
    final getTranslateY setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setEvaluator(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(setShowDividerVertical.setIconTintList(context, (int) R.attr.res_0x7f0402be, getTranslateX.class.getCanonicalName()).data, setIconTint.setIconTintList.setMinAndMaxProgress);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = getTranslateY.MenuHostHelper$$ExternalSyntheticLambda0(context, obtainStyledAttributes.getResourceId(3, 0));
        this.setX = getTranslateY.MenuHostHelper$$ExternalSyntheticLambda0(context, obtainStyledAttributes.getResourceId(1, 0));
        this.setY = getTranslateY.MenuHostHelper$$ExternalSyntheticLambda0(context, obtainStyledAttributes.getResourceId(2, 0));
        this.setOnLongClickListener = getTranslateY.MenuHostHelper$$ExternalSyntheticLambda0(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList x = setFastScrollEnabled.setX(context, obtainStyledAttributes, 6);
        this.setNavigationOnClickListener = getTranslateY.MenuHostHelper$$ExternalSyntheticLambda0(context, obtainStyledAttributes.getResourceId(8, 0));
        this.setIconTintList = getTranslateY.MenuHostHelper$$ExternalSyntheticLambda0(context, obtainStyledAttributes.getResourceId(7, 0));
        this.setLayoutAnimation = getTranslateY.MenuHostHelper$$ExternalSyntheticLambda0(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = paint;
        paint.setColor(x.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}