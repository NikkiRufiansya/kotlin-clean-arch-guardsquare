package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import o.setExpandedTitleMargin;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class setActiveIndicatorDrawable {
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public float MenuHostHelper$$ExternalSyntheticLambda1;
    public boolean setIconTintList;
    public String setLayoutAnimation;
    public setIconTintList setNavigationOnClickListener;
    public String setUnboundedRipple;
    public int setX;
    public boolean setY;

    /* loaded from: classes.dex */
    public enum setIconTintList {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    /* renamed from: o.setActiveIndicatorDrawable$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[setIconTintList.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[setIconTintList.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIconTintList.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIconTintList.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIconTintList.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIconTintList.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIconTintList.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIconTintList.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIconTintList.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final float setY() {
        switch (AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[this.setNavigationOnClickListener.ordinal()]) {
            case 2:
                return this.setIconTintList ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.setX;
            case 7:
                return this.MenuHostHelper$$ExternalSyntheticLambda1;
            case 8:
                return this.MenuHostHelper$$ExternalSyntheticLambda1;
            default:
                return Float.NaN;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(float[] fArr) {
        switch (AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[this.setNavigationOnClickListener.ordinal()]) {
            case 2:
                fArr[0] = this.setIconTintList ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
                fArr[0] = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                fArr[1] = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = (i >>> 24) / 255.0f;
                return;
            case 6:
                fArr[0] = this.setX;
                return;
            case 7:
                fArr[0] = this.MenuHostHelper$$ExternalSyntheticLambda1;
                return;
            case 8:
                fArr[0] = this.MenuHostHelper$$ExternalSyntheticLambda1;
                return;
            default:
                return;
        }
    }

    private setActiveIndicatorDrawable(String str, setIconTintList seticontintlist, Object obj, boolean z) {
        this.setUnboundedRipple = str;
        this.setNavigationOnClickListener = seticontintlist;
        this.setY = z;
        setIconTintList(obj);
    }

    private setActiveIndicatorDrawable(setActiveIndicatorDrawable setactiveindicatordrawable, Object obj) {
        this.setY = false;
        this.setUnboundedRipple = setactiveindicatordrawable.setUnboundedRipple;
        this.setNavigationOnClickListener = setactiveindicatordrawable.setNavigationOnClickListener;
        setIconTintList(obj);
    }

    private void setIconTintList(Object obj) {
        switch (AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[this.setNavigationOnClickListener.ordinal()]) {
            case 1:
            case 6:
                this.setX = ((Integer) obj).intValue();
                return;
            case 2:
                this.setIconTintList = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.setLayoutAnimation = (String) obj;
                return;
            case 4:
            case 5:
                this.MenuHostHelper$$ExternalSyntheticLambda0 = ((Integer) obj).intValue();
                return;
            case 7:
                this.MenuHostHelper$$ExternalSyntheticLambda1 = ((Float) obj).floatValue();
                return;
            case 8:
                this.MenuHostHelper$$ExternalSyntheticLambda1 = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public static HashMap<String, setActiveIndicatorDrawable> setX(HashMap<String, setActiveIndicatorDrawable> hashMap, View view) {
        HashMap<String, setActiveIndicatorDrawable> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            setActiveIndicatorDrawable setactiveindicatordrawable = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new setActiveIndicatorDrawable(setactiveindicatordrawable, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMap");
                    sb.append(str);
                    hashMap2.put(str, new setActiveIndicatorDrawable(setactiveindicatordrawable, cls.getMethod(sb.toString(), new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void setX(View view, HashMap<String, setActiveIndicatorDrawable> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            setActiveIndicatorDrawable setactiveindicatordrawable = hashMap.get(str2);
            if (setactiveindicatordrawable.setY) {
                str = str2;
            } else {
                StringBuilder sb = new StringBuilder("set");
                sb.append(str2);
                str = sb.toString();
            }
            try {
                switch (AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[setactiveindicatordrawable.setNavigationOnClickListener.ordinal()]) {
                    case 1:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(setactiveindicatordrawable.setX));
                        break;
                    case 2:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(setactiveindicatordrawable.setIconTintList));
                        break;
                    case 3:
                        cls.getMethod(str, CharSequence.class).invoke(view, setactiveindicatordrawable.setLayoutAnimation);
                        break;
                    case 4:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(setactiveindicatordrawable.MenuHostHelper$$ExternalSyntheticLambda0));
                        break;
                    case 5:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(setactiveindicatordrawable.MenuHostHelper$$ExternalSyntheticLambda0);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(setactiveindicatordrawable.setX));
                        break;
                    case 7:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(setactiveindicatordrawable.MenuHostHelper$$ExternalSyntheticLambda1));
                        break;
                    case 8:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(setactiveindicatordrawable.MenuHostHelper$$ExternalSyntheticLambda1));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb2 = new StringBuilder(" Custom Attribute \"");
                sb2.append(str2);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                Log.e("TransitionLayout", sb2.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                StringBuilder sb3 = new StringBuilder(" Custom Attribute \"");
                sb3.append(str2);
                sb3.append("\" not found on ");
                sb3.append(cls.getName());
                Log.e("TransitionLayout", sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cls.getName());
                sb4.append(" must have a method ");
                sb4.append(str);
                Log.e("TransitionLayout", sb4.toString());
            } catch (InvocationTargetException e3) {
                StringBuilder sb5 = new StringBuilder(" Custom Attribute \"");
                sb5.append(str2);
                sb5.append("\" not found on ");
                sb5.append(cls.getName());
                Log.e("TransitionLayout", sb5.toString());
                e3.printStackTrace();
            }
        }
    }

    public static void setY(Context context, XmlPullParser xmlPullParser, HashMap<String, setActiveIndicatorDrawable> hashMap) {
        setIconTintList seticontintlist;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.setItemOnTouchListener);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        setIconTintList seticontintlist2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == setExpandedTitleMargin.setY.setProgressTintBlendMode) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Character.toUpperCase(str.charAt(0)));
                    sb.append(str.substring(1));
                    str = sb.toString();
                }
            } else if (index == setExpandedTitleMargin.setY.setMinProgress) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == setExpandedTitleMargin.setY.setSecondaryProgressTintList) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                seticontintlist2 = setIconTintList.BOOLEAN_TYPE;
            } else {
                if (index == setExpandedTitleMargin.setY.setColumnCount) {
                    seticontintlist = setIconTintList.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == setExpandedTitleMargin.setY.setNextFocusUpId) {
                    seticontintlist = setIconTintList.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == setExpandedTitleMargin.setY.setTitleEnabled) {
                    seticontintlist = setIconTintList.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintMode) {
                    seticontintlist = setIconTintList.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == setExpandedTitleMargin.setY.SavedStateHandleAttacher) {
                    seticontintlist = setIconTintList.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == setExpandedTitleMargin.setY.setBaselineAlignedChildIndex) {
                    seticontintlist = setIconTintList.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == setExpandedTitleMargin.setY.setThreshold) {
                    seticontintlist = setIconTintList.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == setExpandedTitleMargin.setY.setCollapseContentDescription) {
                    seticontintlist = setIconTintList.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                seticontintlist2 = seticontintlist;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new setActiveIndicatorDrawable(str, seticontintlist2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }
}