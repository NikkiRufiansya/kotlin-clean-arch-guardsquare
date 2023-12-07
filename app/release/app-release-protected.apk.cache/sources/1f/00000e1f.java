package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setExpandedTitleMargin;
import o.setMIndicatorOptions;
import o.setOnRatingBarChangeListener;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class setOnItemSelectedListener {
    private static String setNavigationOnClickListener = "ViewTransition";
    int MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    private String ViewPager$SavedState$1;
    private int setAnimationFromJson;
    private int setCenterIfNoTextEnabled;
    private int setCheckedIconEnabled;
    private int setChipCornerRadius;
    private int setGuidelinePercent;
    private boolean setIconSize;
    int setIconTintList;
    int setLayoutAnimation;
    private int setMaxEms;
    private String setMinAndMaxProgress;
    int setOnLongClickListener;
    private int setOnNavigationItemSelectedListener = -1;
    private int setTextAlignment;
    private int setTextScaleX;
    private WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setUiOptions;
    private Context setUnboundedRipple;
    int setX;
    int setY;
    private FabTransformationScrimBehavior setZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewTransition(");
        sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda0));
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnItemSelectedListener(Context context, XmlPullParser xmlPullParser) {
        char c;
        this.setX = -1;
        this.setIconSize = false;
        this.setMaxEms = 0;
        this.setCenterIfNoTextEnabled = -1;
        this.setGuidelinePercent = -1;
        this.setChipCornerRadius = 0;
        this.ViewPager$SavedState$1 = null;
        this.setTextAlignment = -1;
        this.setY = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setAnimationFromJson = -1;
        this.setTextScaleX = -1;
        this.setOnLongClickListener = -1;
        this.setIconTintList = -1;
        this.setUnboundedRipple = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.setCloseIconContentDescription);
                        int indexCount = obtainStyledAttributes.getIndexCount();
                        for (int i = 0; i < indexCount; i++) {
                            int index = obtainStyledAttributes.getIndex(i);
                            if (index == setExpandedTitleMargin.setY.setExpandedComponentIdHint) {
                                this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getResourceId(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                            } else if (index == setExpandedTitleMargin.setY.setPressed) {
                                if (setSubtitle.setIconTintList) {
                                    int resourceId = obtainStyledAttributes.getResourceId(index, this.setCheckedIconEnabled);
                                    this.setCheckedIconEnabled = resourceId;
                                    if (resourceId == -1) {
                                        this.setMinAndMaxProgress = obtainStyledAttributes.getString(index);
                                    }
                                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                                    this.setMinAndMaxProgress = obtainStyledAttributes.getString(index);
                                } else {
                                    this.setCheckedIconEnabled = obtainStyledAttributes.getResourceId(index, this.setCheckedIconEnabled);
                                }
                            } else if (index == setExpandedTitleMargin.setY.setOnHierarchyChangeListener) {
                                this.setX = obtainStyledAttributes.getInt(index, this.setX);
                            } else if (index == setExpandedTitleMargin.setY.setFocusable) {
                                this.setIconSize = obtainStyledAttributes.getBoolean(index, this.setIconSize);
                            } else if (index == setExpandedTitleMargin.setY.setFailureListener) {
                                this.setMaxEms = obtainStyledAttributes.getInt(index, this.setMaxEms);
                            } else if (index == setExpandedTitleMargin.setY.setExpandedTitleMarginEnd) {
                                this.setCenterIfNoTextEnabled = obtainStyledAttributes.getInt(index, this.setCenterIfNoTextEnabled);
                            } else if (index == setExpandedTitleMargin.setY.setAnimation) {
                                this.setGuidelinePercent = obtainStyledAttributes.getInt(index, this.setGuidelinePercent);
                            } else if (index == setExpandedTitleMargin.setY.setMaxWidth) {
                                this.setLayoutAnimation = obtainStyledAttributes.getInt(index, this.setLayoutAnimation);
                            } else if (index == setExpandedTitleMargin.setY.WindowInsetsCompat$Impl29) {
                                TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                                if (peekValue.type == 1) {
                                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                                    this.setTextAlignment = resourceId2;
                                    if (resourceId2 != -1) {
                                        this.setChipCornerRadius = -2;
                                    }
                                } else if (peekValue.type == 3) {
                                    String string = obtainStyledAttributes.getString(index);
                                    this.ViewPager$SavedState$1 = string;
                                    if (string != null && string.indexOf("/") > 0) {
                                        this.setTextAlignment = obtainStyledAttributes.getResourceId(index, -1);
                                        this.setChipCornerRadius = -2;
                                    } else {
                                        this.setChipCornerRadius = -1;
                                    }
                                } else {
                                    this.setChipCornerRadius = obtainStyledAttributes.getInteger(index, this.setChipCornerRadius);
                                }
                            } else if (index == setExpandedTitleMargin.setY.setScrollContainer) {
                                this.setY = obtainStyledAttributes.getResourceId(index, this.setY);
                            } else if (index == setExpandedTitleMargin.setY.WindowInsetsCompat$Impl21) {
                                this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getResourceId(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                            } else if (index == setExpandedTitleMargin.setY.WindowInsetsCompat$Impl28) {
                                this.setAnimationFromJson = obtainStyledAttributes.getResourceId(index, this.setAnimationFromJson);
                            } else if (index == setExpandedTitleMargin.setY.setCloseIconVisible) {
                                this.setTextScaleX = obtainStyledAttributes.getResourceId(index, this.setTextScaleX);
                            } else if (index == setExpandedTitleMargin.setY.WindowInsetsCompat$Impl20) {
                                this.setIconTintList = obtainStyledAttributes.getResourceId(index, this.setIconTintList);
                            } else if (index == setExpandedTitleMargin.setY.setLayerPaint) {
                                this.setOnLongClickListener = obtainStyledAttributes.getInteger(index, this.setOnLongClickListener);
                            }
                        }
                        obtainStyledAttributes.recycle();
                    } else if (c == 1) {
                        this.setZ = new FabTransformationScrimBehavior(context, xmlPullParser);
                    } else if (c == 2) {
                        this.setUiOptions = WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(context, xmlPullParser);
                    } else if (c == 3 || c == 4) {
                        setActiveIndicatorDrawable.setY(context, xmlPullParser, this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0);
                    } else {
                        String str = setNavigationOnClickListener;
                        StringBuilder sb = new StringBuilder();
                        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
                        StringBuilder sb2 = new StringBuilder(".(");
                        sb2.append(stackTraceElement.getFileName());
                        sb2.append(":");
                        sb2.append(stackTraceElement.getLineNumber());
                        sb2.append(") ");
                        sb2.append(stackTraceElement.getMethodName());
                        sb2.append("()");
                        sb.append(sb2.toString());
                        sb.append(" unknown tag ");
                        sb.append(name);
                        Log.e(str, sb.toString());
                        String str2 = setNavigationOnClickListener;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(".xml:");
                        sb3.append(xmlPullParser.getLineNumber());
                        Log.e(str2, sb3.toString());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setKeepScreenOn setkeepscreenon, setSubtitle setsubtitle, int i, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, final View... viewArr) {
        int[] iArr;
        if (this.setIconSize) {
            return;
        }
        int i2 = this.setLayoutAnimation;
        Interpolator interpolator = null;
        if (i2 == 2) {
            View view = viewArr[0];
            setIconStartPadding seticonstartpadding = new setIconStartPadding(view);
            seticonstartpadding.setLayoutDirection.setCenterIfNoTextEnabled = 0.0f;
            seticonstartpadding.setLayoutDirection.setChipCornerRadius = 0.0f;
            seticonstartpadding.setTextScaleX = true;
            setDivider setdivider = seticonstartpadding.setLayoutDirection;
            float x = view.getX();
            float y = view.getY();
            setdivider.setTextScaleX = x;
            setdivider.setZ = y;
            setdivider.setIconSize = view.getWidth();
            setdivider.setX = view.getHeight();
            setDivider setdivider2 = seticonstartpadding.setUiOptions;
            float x2 = view.getX();
            float y2 = view.getY();
            setdivider2.setTextScaleX = x2;
            setdivider2.setZ = y2;
            setdivider2.setIconSize = view.getWidth();
            setdivider2.setX = view.getHeight();
            setImageIcon setimageicon = seticonstartpadding.setMinAndMaxProgress;
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            setimageicon.MenuHostHelper$$ExternalSyntheticLambda1(view);
            setImageIcon setimageicon2 = seticonstartpadding.setOnLongClickListener;
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            setimageicon2.MenuHostHelper$$ExternalSyntheticLambda1(view);
            ArrayList<setLayoutMode> arrayList = this.setZ.MenuHostHelper$$ExternalSyntheticLambda1.get(-1);
            if (arrayList != null) {
                seticonstartpadding.setChipCornerRadius.addAll(arrayList);
            }
            seticonstartpadding.setY(setsubtitle.getWidth(), setsubtitle.getHeight(), System.nanoTime());
            int i3 = this.setCenterIfNoTextEnabled;
            int i4 = this.setGuidelinePercent;
            int i5 = this.setX;
            Context context = setsubtitle.getContext();
            int i6 = this.setChipCornerRadius;
            if (i6 == -2) {
                interpolator = AnimationUtils.loadInterpolator(context, this.setTextAlignment);
            } else if (i6 == -1) {
                final joinThreadPool iconTintList = joinThreadPool.setIconTintList(this.ViewPager$SavedState$1);
                interpolator = new Interpolator() { // from class: o.setOnItemSelectedListener.4
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        return (float) joinThreadPool.this.setIconTintList(f);
                    }
                };
            } else if (i6 == 0) {
                interpolator = new AccelerateDecelerateInterpolator();
            } else if (i6 == 1) {
                interpolator = new AccelerateInterpolator();
            } else if (i6 == 2) {
                interpolator = new DecelerateInterpolator();
            } else if (i6 == 4) {
                interpolator = new BounceInterpolator();
            } else if (i6 == 5) {
                interpolator = new OvershootInterpolator();
            } else if (i6 == 6) {
                interpolator = new AnticipateInterpolator();
            }
            new setOnItemSelectedListener$MenuHostHelper$$ExternalSyntheticLambda0(setkeepscreenon, seticonstartpadding, i3, i4, i5, interpolator, this.setY, this.MenuHostHelper$$ExternalSyntheticLambda1);
            return;
        }
        if (i2 == 1) {
            setOnRatingBarChangeListener setonratingbarchangelistener = setsubtitle.setMaxEms;
            if (setonratingbarchangelistener == null) {
                iArr = null;
            } else {
                int size = setonratingbarchangelistener.setY.size();
                iArr = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    iArr[i7] = setonratingbarchangelistener.setY.keyAt(i7);
                }
            }
            for (int i8 : iArr) {
                if (i8 != i) {
                    setOnRatingBarChangeListener setonratingbarchangelistener2 = setsubtitle.setMaxEms;
                    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 x3 = setonratingbarchangelistener2 == null ? null : setonratingbarchangelistener2.setX(i8);
                    for (View view2 : viewArr) {
                        int id = view2.getId();
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx = x3.setY.containsKey(Integer.valueOf(id)) ? x3.setY.get(Integer.valueOf(id)) : null;
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx2 = this.setUiOptions;
                        if (setx2 != null) {
                            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 = setx2.setX;
                            if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                                withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(setx);
                            }
                            setx.MenuHostHelper$$ExternalSyntheticLambda0.putAll(this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0);
                        }
                    }
                }
            }
        }
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.setY.clear();
        for (Integer num : withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.keySet()) {
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx3 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.get(num);
            if (setx3 != null) {
                withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.setY.put(num, setx3.clone());
            }
        }
        for (View view3 : viewArr) {
            int id2 = view3.getId();
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx4 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.setY.containsKey(Integer.valueOf(id2)) ? withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.setY.get(Integer.valueOf(id2)) : null;
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx5 = this.setUiOptions;
            if (setx5 != null) {
                WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda12 = setx5.setX;
                if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1$setX$MenuHostHelper$$ExternalSyntheticLambda12.setIconTintList(setx4);
                }
                setx4.MenuHostHelper$$ExternalSyntheticLambda0.putAll(this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        setsubtitle.MenuHostHelper$$ExternalSyntheticLambda0(i, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12);
        setsubtitle.MenuHostHelper$$ExternalSyntheticLambda0(setExpandedTitleMargin.setX.setX, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        setsubtitle.setState(setExpandedTitleMargin.setX.setX, -1, -1);
        setOnRatingBarChangeListener.setIconTintList seticontintlist = new setOnRatingBarChangeListener.setIconTintList(setsubtitle.setMaxEms, setExpandedTitleMargin.setX.setX, i);
        for (View view4 : viewArr) {
            int i9 = this.setCenterIfNoTextEnabled;
            if (i9 != -1) {
                seticontintlist.setNavigationOnClickListener = Math.max(i9, 8);
            }
            seticontintlist.ViewPager$SavedState$1 = this.setMaxEms;
            int i10 = this.setChipCornerRadius;
            String str = this.ViewPager$SavedState$1;
            int i11 = this.setTextAlignment;
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = i10;
            seticontintlist.setUnboundedRipple = str;
            seticontintlist.setX = i11;
            int id3 = view4.getId();
            FabTransformationScrimBehavior fabTransformationScrimBehavior = this.setZ;
            if (fabTransformationScrimBehavior != null) {
                FabTransformationScrimBehavior fabTransformationScrimBehavior2 = new FabTransformationScrimBehavior();
                Iterator<setLayoutMode> it = fabTransformationScrimBehavior.MenuHostHelper$$ExternalSyntheticLambda1.get(-1).iterator();
                while (it.hasNext()) {
                    setLayoutMode clone = it.next().clone();
                    clone.MenuHostHelper$$ExternalSyntheticLambda1 = id3;
                    fabTransformationScrimBehavior2.MenuHostHelper$$ExternalSyntheticLambda1(clone);
                }
                seticontintlist.setTextAlignment.add(fabTransformationScrimBehavior2);
            }
        }
        setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist);
        Runnable runnable = new Runnable() { // from class: o.setMultiChoiceModeListener
            @Override // java.lang.Runnable
            public final void run() {
                setOnItemSelectedListener setonitemselectedlistener = setOnItemSelectedListener.this;
                View[] viewArr2 = viewArr;
                if (setonitemselectedlistener.setY != -1) {
                    for (View view5 : viewArr2) {
                        view5.setTag(setonitemselectedlistener.setY, Long.valueOf(System.nanoTime()));
                    }
                }
                if (setonitemselectedlistener.MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
                    for (View view6 : viewArr2) {
                        view6.setTag(setonitemselectedlistener.MenuHostHelper$$ExternalSyntheticLambda1, null);
                    }
                }
            }
        };
        setsubtitle.setIconTintList(1.0f);
        setsubtitle.setCenterIfNoTextEnabled = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if (!(this.setCheckedIconEnabled == -1 && this.setMinAndMaxProgress == null) && setY(view)) {
            if (view.getId() == this.setCheckedIconEnabled) {
                return true;
            }
            return this.setMinAndMaxProgress != null && (view.getLayoutParams() instanceof setMIndicatorOptions.setIconTintList) && (str = ((setMIndicatorOptions.setIconTintList) view.getLayoutParams()).ViewPager$SavedState$1) != null && str.matches(this.setMinAndMaxProgress);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setY(View view) {
        int i = this.setAnimationFromJson;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.setTextScaleX;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }
}