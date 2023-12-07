package o;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class AppDatabase_Impl {
    private static final setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setY = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setX(setMeasureAllChildren setmeasureallchildren) {
        setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
        int navigationOnClickListener = (int) (setmeasureallchildren.setNavigationOnClickListener() * 255.0d);
        int navigationOnClickListener2 = (int) (setmeasureallchildren.setNavigationOnClickListener() * 255.0d);
        int navigationOnClickListener3 = (int) (setmeasureallchildren.setNavigationOnClickListener() * 255.0d);
        while (setmeasureallchildren.setUnboundedRipple()) {
            setmeasureallchildren.setChipCornerRadius();
        }
        setmeasureallchildren.setY();
        return Color.argb(255, navigationOnClickListener, navigationOnClickListener2, navigationOnClickListener3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> setIconTintList(setMeasureAllChildren setmeasureallchildren, float f) {
        ArrayList arrayList = new ArrayList();
        setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
        while (setmeasureallchildren.setTextAlignment() == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_ARRAY) {
            setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
            arrayList.add(MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren, f));
            setmeasureallchildren.setY();
        }
        setmeasureallchildren.setY();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.AppDatabase_Impl$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;

        static {
            int[] iArr = new int[setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
            try {
                iArr[setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF MenuHostHelper$$ExternalSyntheticLambda1(setMeasureAllChildren setmeasureallchildren, float f) {
        int i = AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda0[setmeasureallchildren.setTextAlignment().ordinal()];
        if (i == 1) {
            float navigationOnClickListener = (float) setmeasureallchildren.setNavigationOnClickListener();
            float navigationOnClickListener2 = (float) setmeasureallchildren.setNavigationOnClickListener();
            while (setmeasureallchildren.setUnboundedRipple()) {
                setmeasureallchildren.setChipCornerRadius();
            }
            return new PointF(navigationOnClickListener * f, navigationOnClickListener2 * f);
        } else if (i == 2) {
            setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
            float navigationOnClickListener3 = (float) setmeasureallchildren.setNavigationOnClickListener();
            float navigationOnClickListener4 = (float) setmeasureallchildren.setNavigationOnClickListener();
            while (setmeasureallchildren.setTextAlignment() != setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.END_ARRAY) {
                setmeasureallchildren.setChipCornerRadius();
            }
            setmeasureallchildren.setY();
            return new PointF(navigationOnClickListener3 * f, navigationOnClickListener4 * f);
        } else if (i != 3) {
            StringBuilder sb = new StringBuilder("Unknown point starts with ");
            sb.append(setmeasureallchildren.setTextAlignment());
            throw new IllegalArgumentException(sb.toString());
        } else {
            setmeasureallchildren.setX();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (setmeasureallchildren.setUnboundedRipple()) {
                int MenuHostHelper$$ExternalSyntheticLambda1 = setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setY);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                    f2 = MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren);
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                    f3 = MenuHostHelper$$ExternalSyntheticLambda1(setmeasureallchildren);
                } else {
                    setmeasureallchildren.ViewPager$SavedState$1();
                    setmeasureallchildren.setChipCornerRadius();
                }
            }
            setmeasureallchildren.setIconTintList();
            return new PointF(f2 * f, f3 * f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float MenuHostHelper$$ExternalSyntheticLambda1(setMeasureAllChildren setmeasureallchildren) {
        setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1 textAlignment = setmeasureallchildren.setTextAlignment();
        int i = AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda0[textAlignment.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
                float navigationOnClickListener = (float) setmeasureallchildren.setNavigationOnClickListener();
                while (setmeasureallchildren.setUnboundedRipple()) {
                    setmeasureallchildren.setChipCornerRadius();
                }
                setmeasureallchildren.setY();
                return navigationOnClickListener;
            }
            StringBuilder sb = new StringBuilder("Unknown value for token of type ");
            sb.append(textAlignment);
            throw new IllegalArgumentException(sb.toString());
        }
        return (float) setmeasureallchildren.setNavigationOnClickListener();
    }
}