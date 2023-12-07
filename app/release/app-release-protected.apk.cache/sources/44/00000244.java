package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public class SearchView$SavedState$1 {
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda0;
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1;
    public static final int setIconTintList = 181;
    private static final int[] setNavigationOnClickListener;
    private static byte[] setOnLongClickListener;
    private static final int[] setUiOptions;
    private static final Class<?>[] setUnboundedRipple;
    private static final String[] setX;
    private static final setDividerHeight<String, Constructor<? extends View>> setY;
    private final Object[] setLayoutAnimation = new Object[2];

    protected View MenuHostHelper$$ExternalSyntheticLambda0(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View setX(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View uiOptions;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = MenuHostHelper$$ExternalSyntheticLambda0(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = setGuidelineBegin.MenuHostHelper$$ExternalSyntheticLambda0(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                uiOptions = setUiOptions(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case 1:
                uiOptions = setY(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case 2:
                uiOptions = setUnboundedRipple(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case 3:
                uiOptions = ViewPager$SavedState$1(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case 4:
                uiOptions = setOnLongClickListener(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case 5:
                uiOptions = setTextAlignment(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case 6:
                uiOptions = setCenterIfNoTextEnabled(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case 7:
                uiOptions = setLayoutAnimation(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case '\b':
                uiOptions = setIconSize(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case '\t':
                uiOptions = setNavigationOnClickListener(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case '\n':
                uiOptions = setIconTintList(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case 11:
                uiOptions = MenuHostHelper$$ExternalSyntheticLambda1(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case '\f':
                uiOptions = MenuHostHelper$$ExternalSyntheticLambda0(context2, attributeSet);
                setX(uiOptions, str);
                break;
            case '\r':
                uiOptions = setX(context2, attributeSet);
                setX(uiOptions, str);
                break;
            default:
                uiOptions = MenuHostHelper$$ExternalSyntheticLambda0(context2, str, attributeSet);
                break;
        }
        if (uiOptions == null && context != context2) {
            uiOptions = setX(context2, str, attributeSet);
        }
        if (uiOptions != null) {
            setIconTintList(uiOptions, attributeSet);
            setX(context2, uiOptions, attributeSet);
        }
        return uiOptions;
    }

    protected getStableInsets ViewPager$SavedState$1(Context context, AttributeSet attributeSet) {
        return new getStableInsets(context, attributeSet);
    }

    protected setOutlineAmbientShadowColor setNavigationOnClickListener(Context context, AttributeSet attributeSet) {
        return new setOutlineAmbientShadowColor(context, attributeSet);
    }

    protected setCalendarViewShown setX(Context context, AttributeSet attributeSet) {
        return new setCalendarViewShown(context, attributeSet);
    }

    protected setSystemUiVisibility MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet) {
        return new setSystemUiVisibility(context, attributeSet);
    }

    protected setTabContainer setCenterIfNoTextEnabled(Context context, AttributeSet attributeSet) {
        return new setTabContainer(context, attributeSet);
    }

    protected setAccessibilityTraversalAfter setOnLongClickListener(Context context, AttributeSet attributeSet) {
        return new setAccessibilityTraversalAfter(context, attributeSet);
    }

    protected setCheckableResource MenuHostHelper$$ExternalSyntheticLambda1(Context context, AttributeSet attributeSet) {
        return new setCheckableResource(context, attributeSet);
    }

    protected setClipBounds setLayoutAnimation(Context context, AttributeSet attributeSet) {
        return new setClipBounds(context, attributeSet);
    }

    protected setRippleColorResource setY(Context context, AttributeSet attributeSet) {
        return new setRippleColorResource(context, attributeSet);
    }

    protected GridLayoutManager setIconTintList(Context context, AttributeSet attributeSet) {
        return new GridLayoutManager(context, attributeSet);
    }

    protected setUserInputEnabled setUnboundedRipple(Context context, AttributeSet attributeSet) {
        return new setUserInputEnabled(context, attributeSet);
    }

    protected setPasswordVisibilityToggleContentDescription setUiOptions(Context context, AttributeSet attributeSet) {
        return new setPasswordVisibilityToggleContentDescription(context, attributeSet);
    }

    protected setExpandedActionViewsExclusive setTextAlignment(Context context, AttributeSet attributeSet) {
        return new setExpandedActionViewsExclusive(context, attributeSet);
    }

    protected setEndIconTintList setIconSize(Context context, AttributeSet attributeSet) {
        return new setEndIconTintList(context, attributeSet);
    }

    private void setX(View view, String str) {
        if (view != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" asked to inflate view for <");
        sb.append(str);
        sb.append(">, but returned null");
        throw new IllegalStateException(sb.toString());
    }

    private View setX(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.setLayoutAnimation;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return setIconTintList(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = setX;
                if (i >= strArr.length) {
                    return null;
                }
                View iconTintList = setIconTintList(context, str, strArr[i]);
                if (iconTintList != null) {
                    return iconTintList;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.setLayoutAnimation;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private void setIconTintList(View view, AttributeSet attributeSet) {
        boolean iconTintList;
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            iconTintList = setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(view);
            if (iconTintList) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setUiOptions);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new setIconTintList(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View setIconTintList(Context context, String str, String str2) {
        String obj;
        setDividerHeight<String, Constructor<? extends View>> setdividerheight = setY;
        Constructor<? extends View> constructor = setdividerheight.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    obj = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                obj = str;
            }
            constructor = Class.forName(obj, false, context.getClassLoader()).asSubclass(View.class).getConstructor(setUnboundedRipple);
            setdividerheight.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.setLayoutAnimation);
    }

    private static Context MenuHostHelper$$ExternalSyntheticLambda0(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setStretchMode, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.onContextItemSelected, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.FabTransformationScrimBehavior, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof setTitleMarginEnd) && ((setTitleMarginEnd) context).MenuHostHelper$$ExternalSyntheticLambda1 == resourceId) ? context : new setTitleMarginEnd(context, resourceId) : context;
    }

    private void setX(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MenuHostHelper$$ExternalSyntheticLambda0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBaselineAlignBottom.setIconTintList(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, MenuHostHelper$$ExternalSyntheticLambda1);
        if (obtainStyledAttributes2.hasValue(0)) {
            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(view, (CharSequence) obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, setNavigationOnClickListener);
        if (obtainStyledAttributes3.hasValue(0)) {
            setBaselineAlignBottom.setX(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList implements View.OnClickListener {
        private final View MenuHostHelper$$ExternalSyntheticLambda0;
        private final String MenuHostHelper$$ExternalSyntheticLambda1;
        private Context setIconTintList;
        private Method setY;

        public setIconTintList(View view, String str) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = view;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.setY == null) {
                setY(this.MenuHostHelper$$ExternalSyntheticLambda0.getContext());
            }
            try {
                this.setY.invoke(this.setIconTintList, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        private void setY(Context context) {
            String obj;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.MenuHostHelper$$ExternalSyntheticLambda1, View.class)) != null) {
                        this.setY = method;
                        this.setIconTintList = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.MenuHostHelper$$ExternalSyntheticLambda0.getId();
            if (id == -1) {
                obj = "";
            } else {
                StringBuilder sb = new StringBuilder(" with id '");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                obj = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("Could not find method ");
            sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda0.getClass());
            sb2.append(obj);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0079 -> B:11:0x0080). Please submit an issue!!! */
    static {
        /*
            r0 = 26
            byte[] r0 = new byte[r0]
            r0 = {x008a: FILL_ARRAY_DATA  , data: [40, 6, -7, -65, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4} // fill-array
            o.SearchView$SavedState$1.setOnLongClickListener = r0
            r1 = 181(0xb5, float:2.54E-43)
            o.SearchView$SavedState$1.setIconTintList = r1
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 23
            byte[] r3 = new byte[r2]
            r4 = 97
            r5 = 0
            r6 = 3
            if (r0 != 0) goto L21
            r6 = r3
            r7 = 23
            r8 = 3
            r9 = 0
            r3 = r1
            goto L80
        L21:
            r4 = r3
            r6 = 97
            r7 = 3
            r8 = 0
            r3 = r1
        L27:
            int r9 = r8 + 1
            byte r10 = (byte) r6
            r4[r8] = r10
            r8 = 1
            int r7 = r7 + r8
            if (r9 != r2) goto L79
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r5)
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r1[r5] = r0
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            r3[r8] = r0
            o.SearchView$SavedState$1.setUnboundedRipple = r3
            int[] r0 = new int[r8]
            r1 = 16843375(0x101026f, float:2.3695304E-38)
            r0[r5] = r1
            o.SearchView$SavedState$1.setUiOptions = r0
            int[] r0 = new int[r8]
            r1 = 16844160(0x1010580, float:2.3697504E-38)
            r0[r5] = r1
            o.SearchView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 = r0
            int[] r0 = new int[r8]
            r1 = 16844156(0x101057c, float:2.3697493E-38)
            r0[r5] = r1
            o.SearchView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1 = r0
            int[] r0 = new int[r8]
            r1 = 16844148(0x1010574, float:2.369747E-38)
            r0[r5] = r1
            o.SearchView$SavedState$1.setNavigationOnClickListener = r0
            java.lang.String r0 = "android.widget."
            java.lang.String r1 = "android.view."
            java.lang.String r2 = "android.webkit."
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            o.SearchView$SavedState$1.setX = r0
            o.setDividerHeight r0 = new o.setDividerHeight
            r0.<init>()
            o.SearchView$SavedState$1.setY = r0
            return
        L79:
            r8 = r0[r7]
            r11 = r6
            r6 = r4
            r4 = r8
            r8 = r7
            r7 = r11
        L80:
            int r7 = r7 - r4
            int r4 = r7 + (-8)
            r7 = r8
            r8 = r9
            r11 = r6
            r6 = r4
            r4 = r11
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SearchView$SavedState$1.<clinit>():void");
    }
}