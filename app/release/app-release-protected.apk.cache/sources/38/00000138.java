package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import o.setExpandedTitleMargin;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class AbsSavedState$2 {
    private final setMIndicatorOptions MenuHostHelper$$ExternalSyntheticLambda0;
    private WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 setUiOptions;
    private int setY = -1;
    private int MenuHostHelper$$ExternalSyntheticLambda1 = -1;
    private SparseArray<AbsSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0> setNavigationOnClickListener = new SparseArray<>();
    private SparseArray<WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1> setIconTintList = new SparseArray<>();
    setEndIconMode setX = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fd, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbsSavedState$2(android.content.Context r10, o.setMIndicatorOptions r11, int r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbsSavedState$2.<init>(android.content.Context, o.setMIndicatorOptions, int):void");
    }

    public final void setY(int i, float f, float f2) {
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        AbsSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0 absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0;
        int x;
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12;
        int i2 = this.setY;
        if (i2 == i) {
            if (i == -1) {
                absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0 = this.setNavigationOnClickListener.valueAt(0);
            } else {
                absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0 = this.setNavigationOnClickListener.get(i2);
            }
            if ((this.MenuHostHelper$$ExternalSyntheticLambda1 == -1 || !absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0.setX.get(this.MenuHostHelper$$ExternalSyntheticLambda1).MenuHostHelper$$ExternalSyntheticLambda1(f, f2)) && this.MenuHostHelper$$ExternalSyntheticLambda1 != (x = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0.setX(f, f2))) {
                if (x == -1) {
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 = this.setUiOptions;
                } else {
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0.setX.get(x).setY;
                }
                if (x == -1) {
                    int i3 = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                } else {
                    int i4 = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0.setX.get(x).setIconTintList;
                }
                if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 == null) {
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = x;
                withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
                if (this.setX != null) {
                    return;
                }
                return;
            }
            return;
        }
        this.setY = i;
        AbsSavedState$2$MenuHostHelper$$ExternalSyntheticLambda0 absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda02 = this.setNavigationOnClickListener.get(i);
        int x2 = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda02.setX(f, f2);
        if (x2 == -1) {
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda0;
        } else {
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda02.setX.get(x2).setY;
        }
        if (x2 == -1) {
            int i5 = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            int i6 = absSavedState$2$MenuHostHelper$$ExternalSyntheticLambda02.setX.get(x2).setIconTintList;
        }
        if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 == null) {
            StringBuilder sb = new StringBuilder("NO Constraint set found ! id=");
            sb.append(i);
            sb.append(", dim =");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
            Log.v("ConstraintLayoutStates", sb.toString());
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = x2;
        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        private float MenuHostHelper$$ExternalSyntheticLambda0;
        private float MenuHostHelper$$ExternalSyntheticLambda1;
        int setIconTintList;
        private float setUnboundedRipple;
        private float setX;
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 setY;

        public setX(Context context, XmlPullParser xmlPullParser) {
            this.setUnboundedRipple = Float.NaN;
            this.setX = Float.NaN;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Float.NaN;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = Float.NaN;
            this.setIconTintList = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.setTranslateY);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.setValues) {
                    this.setIconTintList = obtainStyledAttributes.getResourceId(index, this.setIconTintList);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.setIconTintList);
                    context.getResources().getResourceName(this.setIconTintList);
                    if ("layout".equals(resourceTypeName)) {
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
                        this.setY = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY((setMIndicatorOptions) LayoutInflater.from(context).inflate(this.setIconTintList, (ViewGroup) null));
                    }
                } else if (index == setExpandedTitleMargin.setY.setCurrentPosition) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getDimension(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                } else if (index == setExpandedTitleMargin.setY.LegacySavedStateHandleController$1) {
                    this.setX = obtainStyledAttributes.getDimension(index, this.setX);
                } else if (index == setExpandedTitleMargin.setY.unlinkToDeath) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getDimension(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                } else if (index == setExpandedTitleMargin.setY.setPromptId) {
                    this.setUnboundedRipple = obtainStyledAttributes.getDimension(index, this.setUnboundedRipple);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2) {
            if (Float.isNaN(this.setUnboundedRipple) || f >= this.setUnboundedRipple) {
                if (Float.isNaN(this.setX) || f2 >= this.setX) {
                    if (Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda0) || f <= this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        return Float.isNaN(this.MenuHostHelper$$ExternalSyntheticLambda1) || f2 <= this.MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }
}