package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.setActiveIndicatorDrawable;

/* loaded from: classes.dex */
public final class setStretchMode {
    public static void MenuHostHelper$$ExternalSyntheticLambda0(setActiveIndicatorDrawable setactiveindicatordrawable, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder sb = new StringBuilder("set");
        sb.append(setactiveindicatordrawable.setUnboundedRipple);
        String obj = sb.toString();
        try {
            boolean z = true;
            switch (AnonymousClass1.setIconTintList[setactiveindicatordrawable.setNavigationOnClickListener.ordinal()]) {
                case 1:
                    cls.getMethod(obj, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(obj, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(obj, Drawable.class);
                    int pow = (int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f);
                    int i = (pow & (~(pow >> 31))) - 255;
                    int pow2 = (int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f);
                    int i2 = (pow2 & (~(pow2 >> 31))) - 255;
                    int pow3 = (int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f);
                    int i3 = (pow3 & (~(pow3 >> 31))) - 255;
                    int i4 = (int) (fArr[3] * 255.0f);
                    int i5 = (i4 & (~(i4 >> 31))) - 255;
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((((i & (i >> 31)) + 255) << 16) | (((i5 & (i5 >> 31)) + 255) << 24) | (((i2 & (i2 >> 31)) + 255) << 8) | ((i3 & (i3 >> 31)) + 255));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    Method method2 = cls.getMethod(obj, Integer.TYPE);
                    int pow4 = (int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f);
                    int i6 = (pow4 & (~(pow4 >> 31))) - 255;
                    int pow5 = (int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f);
                    int i7 = (pow5 & (~(pow5 >> 31))) - 255;
                    int pow6 = (int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f);
                    int i8 = (pow6 & (~(pow6 >> 31))) - 255;
                    int i9 = (int) (fArr[3] * 255.0f);
                    int i10 = (i9 & (~(i9 >> 31))) - 255;
                    method2.invoke(view, Integer.valueOf((((i6 & (i6 >> 31)) + 255) << 16) | (((i10 & (i10 >> 31)) + 255) << 24) | (((i7 & (i7 >> 31)) + 255) << 8) | ((i8 & (i8 >> 31)) + 255)));
                    return;
                case 5:
                    StringBuilder sb2 = new StringBuilder("unable to interpolate strings ");
                    sb2.append(setactiveindicatordrawable.setUnboundedRipple);
                    throw new RuntimeException(sb2.toString());
                case 6:
                    Method method3 = cls.getMethod(obj, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method3.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(obj, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sb3 = new StringBuilder("cannot access method ");
            sb3.append(obj);
            sb3.append(" on View \"");
            sb3.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(view));
            sb3.append("\"");
            Log.e("CustomSupport", sb3.toString());
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            StringBuilder sb4 = new StringBuilder("no method ");
            sb4.append(obj);
            sb4.append(" on View \"");
            sb4.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(view));
            sb4.append("\"");
            Log.e("CustomSupport", sb4.toString());
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setStretchMode$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setIconTintList;

        static {
            int[] iArr = new int[setActiveIndicatorDrawable.setIconTintList.values().length];
            setIconTintList = iArr;
            try {
                iArr[setActiveIndicatorDrawable.setIconTintList.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setIconTintList[setActiveIndicatorDrawable.setIconTintList.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setIconTintList[setActiveIndicatorDrawable.setIconTintList.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setIconTintList[setActiveIndicatorDrawable.setIconTintList.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setIconTintList[setActiveIndicatorDrawable.setIconTintList.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setIconTintList[setActiveIndicatorDrawable.setIconTintList.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setIconTintList[setActiveIndicatorDrawable.setIconTintList.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}