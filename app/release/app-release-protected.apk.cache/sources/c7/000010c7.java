package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import o.setActiveIndicatorDrawable;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public class setTypeface extends setLayoutMode {
    private float ViewPager$SavedState$1;
    private int setChipCornerRadius = -1;
    private String setCenterIfNoTextEnabled = null;
    private int setHasDecor = -1;
    private String setMaxEms = null;
    private String setTextScaleX = null;
    private int setCheckedIconEnabled = -1;
    private int setLayoutDirection = -1;
    private View setTextAppearanceResource = null;
    float setOnLongClickListener = 0.1f;
    private boolean setIconSize = true;
    private boolean setTextAlignment = true;
    private boolean setAnimationFromJson = true;
    private float setOnNavigationItemSelectedListener = Float.NaN;
    private boolean setGuidelinePercent = false;
    int setLayoutAnimation = -1;
    int setUiOptions = -1;
    int setNavigationOnClickListener = -1;
    private RectF setUnboundedRipple = new RectF();
    private RectF setMinAndMaxProgress = new RectF();
    private HashMap<String, Method> setZ = new HashMap<>();

    @Override // o.setLayoutMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(HashMap<String, FirebasePerfKtxRegistrar> hashMap) {
    }

    @Override // o.setLayoutMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(HashSet<String> hashSet) {
    }

    public setTypeface() {
        this.setX = 5;
        this.setY = new HashMap<>();
    }

    @Override // o.setLayoutMode
    public final void setIconTintList(Context context, AttributeSet attributeSet) {
        setIconTintList.setX(this, context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setPageTransformer));
    }

    private static void setY(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setX(float r11, android.view.View r12) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTypeface.setX(float, android.view.View):void");
    }

    private void setX(String str, View view) {
        Method method;
        String str2;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.setZ.containsKey(str)) {
                method = this.setZ.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.setZ.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.setZ.put(str, null);
                    StringBuilder sb = new StringBuilder("Could not find method \"");
                    sb.append(str);
                    sb.append("\"on class ");
                    sb.append(view.getClass().getSimpleName());
                    sb.append(" ");
                    sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(view));
                    Log.e("KeyTrigger", sb.toString());
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                StringBuilder sb2 = new StringBuilder("Exception in call \"");
                sb2.append(this.setCenterIfNoTextEnabled);
                sb2.append("\"on class ");
                sb2.append(view.getClass().getSimpleName());
                sb2.append(" ");
                sb2.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(view));
                Log.e("KeyTrigger", sb2.toString());
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str3 : this.setY.keySet()) {
            String lowerCase = str3.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                setActiveIndicatorDrawable setactiveindicatordrawable = this.setY.get(str3);
                if (setactiveindicatordrawable != null) {
                    Class<?> cls = view.getClass();
                    String str4 = setactiveindicatordrawable.setUnboundedRipple;
                    if (setactiveindicatordrawable.setY) {
                        str2 = str4;
                    } else {
                        StringBuilder sb3 = new StringBuilder("set");
                        sb3.append(str4);
                        str2 = sb3.toString();
                    }
                    try {
                        switch (setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[setactiveindicatordrawable.setNavigationOnClickListener.ordinal()]) {
                            case 1:
                            case 6:
                                cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(setactiveindicatordrawable.setX));
                                break;
                            case 2:
                                cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(setactiveindicatordrawable.setIconTintList));
                                break;
                            case 3:
                                cls.getMethod(str2, CharSequence.class).invoke(view, setactiveindicatordrawable.setLayoutAnimation);
                                break;
                            case 4:
                                cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(setactiveindicatordrawable.MenuHostHelper$$ExternalSyntheticLambda0));
                                break;
                            case 5:
                                Method method2 = cls.getMethod(str2, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(setactiveindicatordrawable.MenuHostHelper$$ExternalSyntheticLambda0);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 7:
                                cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(setactiveindicatordrawable.MenuHostHelper$$ExternalSyntheticLambda1));
                                break;
                            case 8:
                                cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(setactiveindicatordrawable.MenuHostHelper$$ExternalSyntheticLambda1));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sb4 = new StringBuilder(" Custom Attribute \"");
                        sb4.append(str4);
                        sb4.append("\" not found on ");
                        sb4.append(cls.getName());
                        Log.e("TransitionLayout", sb4.toString());
                        e.printStackTrace();
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", e2.getMessage());
                        StringBuilder sb5 = new StringBuilder(" Custom Attribute \"");
                        sb5.append(str4);
                        sb5.append("\" not found on ");
                        sb5.append(cls.getName());
                        Log.e("TransitionLayout", sb5.toString());
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(cls.getName());
                        sb6.append(" must have a method ");
                        sb6.append(str2);
                        Log.e("TransitionLayout", sb6.toString());
                    } catch (InvocationTargetException e3) {
                        StringBuilder sb7 = new StringBuilder(" Custom Attribute \"");
                        sb7.append(str4);
                        sb7.append("\" not found on ");
                        sb7.append(cls.getName());
                        Log.e("TransitionLayout", sb7.toString());
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList {
        private static SparseIntArray MenuHostHelper$$ExternalSyntheticLambda0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            MenuHostHelper$$ExternalSyntheticLambda0 = sparseIntArray;
            sparseIntArray.append(setExpandedTitleMargin.setY.FullLifecycleObserverAdapter, 8);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.queryLocalInterface, 4);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.Month$1, 1);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setLiftOnScrollTargetView, 2);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setMenuAlignmentMode, 7);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setFocusedSearchResultHighlightColor, 6);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setRawInputType, 5);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setLiftOnScrollTargetViewId, 9);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setSimpleItemSelectedColor, 10);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setDropDownVerticalOffset, 11);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setCompoundDrawablesRelative, 12);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setCircularRevealScrimColor, 13);
            MenuHostHelper$$ExternalSyntheticLambda0.append(setExpandedTitleMargin.setY.setOnTabChangedListener, 14);
        }

        public static void setX(setTypeface settypeface, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (MenuHostHelper$$ExternalSyntheticLambda0.get(index)) {
                    case 1:
                        settypeface.setMaxEms = typedArray.getString(index);
                        break;
                    case 2:
                        settypeface.setTextScaleX = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        StringBuilder sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(MenuHostHelper$$ExternalSyntheticLambda0.get(index));
                        Log.e("KeyTrigger", sb.toString());
                        break;
                    case 4:
                        settypeface.setCenterIfNoTextEnabled = typedArray.getString(index);
                        break;
                    case 5:
                        settypeface.setOnLongClickListener = typedArray.getFloat(index, settypeface.setOnLongClickListener);
                        break;
                    case 6:
                        settypeface.setCheckedIconEnabled = typedArray.getResourceId(index, settypeface.setCheckedIconEnabled);
                        break;
                    case 7:
                        if (setSubtitle.setIconTintList) {
                            settypeface.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, settypeface.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (settypeface.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                                settypeface.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            settypeface.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                            break;
                        } else {
                            settypeface.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, settypeface.MenuHostHelper$$ExternalSyntheticLambda1);
                            break;
                        }
                    case 8:
                        settypeface.setIconTintList = typedArray.getInteger(index, settypeface.setIconTintList);
                        settypeface.setOnNavigationItemSelectedListener = (settypeface.setIconTintList + 0.5f) / 100.0f;
                        break;
                    case 9:
                        settypeface.setLayoutDirection = typedArray.getResourceId(index, settypeface.setLayoutDirection);
                        break;
                    case 10:
                        settypeface.setGuidelinePercent = typedArray.getBoolean(index, settypeface.setGuidelinePercent);
                        break;
                    case 11:
                        settypeface.setHasDecor = typedArray.getResourceId(index, settypeface.setHasDecor);
                        break;
                    case 12:
                        settypeface.setNavigationOnClickListener = typedArray.getResourceId(index, settypeface.setNavigationOnClickListener);
                        break;
                    case 13:
                        settypeface.setLayoutAnimation = typedArray.getResourceId(index, settypeface.setLayoutAnimation);
                        break;
                    case 14:
                        settypeface.setUiOptions = typedArray.getResourceId(index, settypeface.setUiOptions);
                        break;
                }
            }
        }
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setX(setLayoutMode setlayoutmode) {
        super.setX(setlayoutmode);
        setTypeface settypeface = (setTypeface) setlayoutmode;
        this.setChipCornerRadius = settypeface.setChipCornerRadius;
        this.setCenterIfNoTextEnabled = settypeface.setCenterIfNoTextEnabled;
        this.setHasDecor = settypeface.setHasDecor;
        this.setMaxEms = settypeface.setMaxEms;
        this.setTextScaleX = settypeface.setTextScaleX;
        this.setCheckedIconEnabled = settypeface.setCheckedIconEnabled;
        this.setLayoutDirection = settypeface.setLayoutDirection;
        this.setTextAppearanceResource = settypeface.setTextAppearanceResource;
        this.setOnLongClickListener = settypeface.setOnLongClickListener;
        this.setIconSize = settypeface.setIconSize;
        this.setTextAlignment = settypeface.setTextAlignment;
        this.setAnimationFromJson = settypeface.setAnimationFromJson;
        this.setOnNavigationItemSelectedListener = settypeface.setOnNavigationItemSelectedListener;
        this.ViewPager$SavedState$1 = settypeface.ViewPager$SavedState$1;
        this.setGuidelinePercent = settypeface.setGuidelinePercent;
        this.setUnboundedRipple = settypeface.setUnboundedRipple;
        this.setMinAndMaxProgress = settypeface.setMinAndMaxProgress;
        this.setZ = settypeface.setZ;
        return this;
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setIconTintList() {
        return new setTypeface().setX(this);
    }

    @Override // o.setLayoutMode
    public /* synthetic */ Object clone() {
        return new setTypeface().setX(this);
    }
}