package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
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
import java.util.HashMap;
import java.util.Iterator;
import o.setExpandedTitleMargin;
import o.setSubtitle;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class setOnRatingBarChangeListener {
    setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    private float setAnimationFromJson;
    private setSubtitle$MenuHostHelper$$ExternalSyntheticLambda1 setGuidelinePercent;
    private setIconTintList setIconSize;
    setForegroundTintBlendMode setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private MotionEvent setTextAlignment;
    private float setTextScaleX;
    final setKeepScreenOn setUnboundedRipple;
    boolean setX;
    private final setSubtitle setZ;
    private boolean setCenterIfNoTextEnabled = false;
    ArrayList<setIconTintList> setNavigationOnClickListener = new ArrayList<>();
    private ArrayList<setIconTintList> setUiOptions = new ArrayList<>();
    SparseArray<WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1> setY = new SparseArray<>();
    private HashMap<String, Integer> ViewPager$SavedState$1 = new HashMap<>();
    SparseIntArray setIconTintList = new SparseIntArray();
    private boolean setLayoutAnimation = false;
    private boolean setChipCornerRadius = false;
    private boolean setMaxEms = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setX(int r7, int r8) {
        /*
            r6 = this;
            o.setForegroundTintBlendMode r0 = r6.setOnLongClickListener
            r1 = -1
            if (r0 == 0) goto L17
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = r0.MenuHostHelper$$ExternalSyntheticLambda1(r7, r2, r2)
            if (r0 != r1) goto Le
            r0 = r7
        Le:
            o.setForegroundTintBlendMode r3 = r6.setOnLongClickListener
            int r2 = r3.MenuHostHelper$$ExternalSyntheticLambda1(r8, r2, r2)
            if (r2 == r1) goto L18
            goto L19
        L17:
            r0 = r7
        L18:
            r2 = r8
        L19:
            o.setOnRatingBarChangeListener$setIconTintList r3 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            if (r3 == 0) goto L28
            int r3 = r3.setY
            if (r3 != r8) goto L28
            o.setOnRatingBarChangeListener$setIconTintList r3 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            int r3 = r3.MenuHostHelper$$ExternalSyntheticLambda0
            if (r3 != r7) goto L28
            return
        L28:
            java.util.ArrayList<o.setOnRatingBarChangeListener$setIconTintList> r3 = r6.setNavigationOnClickListener
            java.util.Iterator r3 = r3.iterator()
        L2e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r3.next()
            o.setOnRatingBarChangeListener$setIconTintList r4 = (o.setOnRatingBarChangeListener.setIconTintList) r4
            int r5 = r4.setY
            if (r5 != r2) goto L42
            int r5 = r4.MenuHostHelper$$ExternalSyntheticLambda0
            if (r5 == r0) goto L4a
        L42:
            int r5 = r4.setY
            if (r5 != r8) goto L2e
            int r5 = r4.MenuHostHelper$$ExternalSyntheticLambda0
            if (r5 != r7) goto L2e
        L4a:
            r6.MenuHostHelper$$ExternalSyntheticLambda0 = r4
            if (r4 == 0) goto L5b
            o.setLayerType r7 = r4.setTextScaleX
            if (r7 == 0) goto L5b
            o.setOnRatingBarChangeListener$setIconTintList r7 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            o.setLayerType r7 = r7.setTextScaleX
            boolean r8 = r6.setX
            r7.MenuHostHelper$$ExternalSyntheticLambda1(r8)
        L5b:
            return
        L5c:
            o.setOnRatingBarChangeListener$setIconTintList r7 = r6.setIconSize
            java.util.ArrayList<o.setOnRatingBarChangeListener$setIconTintList> r3 = r6.setUiOptions
            java.util.Iterator r3 = r3.iterator()
        L64:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r3.next()
            o.setOnRatingBarChangeListener$setIconTintList r4 = (o.setOnRatingBarChangeListener.setIconTintList) r4
            int r5 = r4.setY
            if (r5 != r8) goto L64
            r7 = r4
            goto L64
        L76:
            o.setOnRatingBarChangeListener$setIconTintList r8 = new o.setOnRatingBarChangeListener$setIconTintList
            r8.<init>(r6, r7)
            r8.MenuHostHelper$$ExternalSyntheticLambda0 = r0
            r8.setY = r2
            if (r0 == r1) goto L86
            java.util.ArrayList<o.setOnRatingBarChangeListener$setIconTintList> r7 = r6.setNavigationOnClickListener
            r7.add(r8)
        L86:
            r6.MenuHostHelper$$ExternalSyntheticLambda0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnRatingBarChangeListener.setX(int, int):void");
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setSubtitle setsubtitle, int i) {
        Iterator<setIconTintList> it = this.setNavigationOnClickListener.iterator();
        while (it.hasNext()) {
            setIconTintList next = it.next();
            if (next.setCenterIfNoTextEnabled.size() > 0) {
                Iterator<setIconTintList.View$OnClickListenerC0006setIconTintList> it2 = next.setCenterIfNoTextEnabled.iterator();
                while (it2.hasNext()) {
                    it2.next().setY(setsubtitle);
                }
            }
        }
        Iterator<setIconTintList> it3 = this.setUiOptions.iterator();
        while (it3.hasNext()) {
            setIconTintList next2 = it3.next();
            if (next2.setCenterIfNoTextEnabled.size() > 0) {
                Iterator<setIconTintList.View$OnClickListenerC0006setIconTintList> it4 = next2.setCenterIfNoTextEnabled.iterator();
                while (it4.hasNext()) {
                    it4.next().setY(setsubtitle);
                }
            }
        }
        Iterator<setIconTintList> it5 = this.setNavigationOnClickListener.iterator();
        while (it5.hasNext()) {
            setIconTintList next3 = it5.next();
            if (next3.setCenterIfNoTextEnabled.size() > 0) {
                Iterator<setIconTintList.View$OnClickListenerC0006setIconTintList> it6 = next3.setCenterIfNoTextEnabled.iterator();
                while (it6.hasNext()) {
                    it6.next().setY(setsubtitle, i, next3);
                }
            }
        }
        Iterator<setIconTintList> it7 = this.setUiOptions.iterator();
        while (it7.hasNext()) {
            setIconTintList next4 = it7.next();
            if (next4.setCenterIfNoTextEnabled.size() > 0) {
                Iterator<setIconTintList.View$OnClickListenerC0006setIconTintList> it8 = next4.setCenterIfNoTextEnabled.iterator();
                while (it8.hasNext()) {
                    it8.next().setY(setsubtitle, i, next4);
                }
            }
        }
    }

    public final void setIconTintList(boolean z) {
        this.setX = z;
        setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (seticontintlist == null || seticontintlist.setTextScaleX == null) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(this.setX);
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int ViewPager$SavedState$1;
        float setAnimationFromJson;
        ArrayList<View$OnClickListenerC0006setIconTintList> setCenterIfNoTextEnabled;
        final setOnRatingBarChangeListener setChipCornerRadius;
        int setIconSize;
        int setIconTintList;
        boolean setLayoutAnimation;
        int setMaxEms;
        int setNavigationOnClickListener;
        int setOnLongClickListener;
        ArrayList<FabTransformationScrimBehavior> setTextAlignment;
        setLayerType setTextScaleX;
        boolean setUiOptions;
        String setUnboundedRipple;
        int setX;
        int setY;

        /* renamed from: o.setOnRatingBarChangeListener$setIconTintList$setIconTintList  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class View$OnClickListenerC0006setIconTintList implements View.OnClickListener {
            private int MenuHostHelper$$ExternalSyntheticLambda0;
            private final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;
            private int setX;

            public View$OnClickListenerC0006setIconTintList(Context context, setIconTintList seticontintlist, XmlPullParser xmlPullParser) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
                this.setX = 17;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.BottomAppBar$Behavior);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == setExpandedTitleMargin.setY.setImageTintBlendMode) {
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getResourceId(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                    } else if (index == setExpandedTitleMargin.setY.setExpandedTitleMarginTop) {
                        this.setX = obtainStyledAttributes.getInt(index, this.setX);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
            public final void setY(setSubtitle setsubtitle, int i, setIconTintList seticontintlist) {
                int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                setSubtitle setsubtitle2 = setsubtitle;
                if (i2 != -1) {
                    setsubtitle2 = setsubtitle.findViewById(i2);
                }
                if (setsubtitle2 == null) {
                    StringBuilder sb = new StringBuilder("OnClick could not find id ");
                    sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    Log.e("MotionScene", sb.toString());
                    return;
                }
                int i3 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
                int i4 = seticontintlist.setY;
                if (i3 == -1) {
                    setsubtitle2.setOnClickListener(this);
                    return;
                }
                int i5 = this.setX;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = i6 != 0 && i == i3;
                boolean z3 = (i5 & 256) != 0 && i == i3;
                boolean z4 = i6 != 0 && i == i3;
                boolean z5 = (i5 & 16) != 0 && i == i4;
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if ((z2 | z3 | z4 | z5) || z) {
                    setsubtitle2.setOnClickListener(this);
                }
            }

            public final void setY(setSubtitle setsubtitle) {
                int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i == -1) {
                    return;
                }
                View findViewById = setsubtitle.findViewById(i);
                if (findViewById == null) {
                    StringBuilder sb = new StringBuilder(" (*)  could not find id ");
                    sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    Log.e("MotionScene", sb.toString());
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setSubtitle setsubtitle = this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius.setZ;
                if (setsubtitle.setLayoutAnimation) {
                    if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
                        setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0;
                        int i = this.setX;
                        boolean z = false;
                        boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                        boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                        if (z2 && z3) {
                            setIconTintList seticontintlist2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0;
                            setIconTintList seticontintlist3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                            if (seticontintlist2 != seticontintlist3) {
                                setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist3);
                            }
                            if (setsubtitle.MenuHostHelper$$ExternalSyntheticLambda0 == setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1 || setsubtitle.setAnimationFromJson > 0.5f) {
                                z3 = true;
                                z2 = false;
                            } else {
                                z3 = false;
                                z2 = true;
                            }
                        }
                        setIconTintList seticontintlist4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (seticontintlist4 != seticontintlist) {
                            int i2 = seticontintlist4.setY;
                            int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                            if (i3 != -1) {
                            }
                        }
                        z = true;
                        if (z) {
                            if (z2 && (this.setX & 1) != 0) {
                                setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                                setsubtitle.setIconTintList(1.0f);
                                setsubtitle.setCenterIfNoTextEnabled = null;
                                return;
                            } else if (z3 && (this.setX & 16) != 0) {
                                setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                                setsubtitle.setIconTintList(0.0f);
                                return;
                            } else if (z2 && (this.setX & 256) != 0) {
                                setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                                setsubtitle.setProgress(1.0f);
                                return;
                            } else if (!z3 || (this.setX & 4096) == 0) {
                                return;
                            } else {
                                setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
                                setsubtitle.setProgress(0.0f);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = setsubtitle.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (i4 == -1) {
                        setsubtitle.setY(this.MenuHostHelper$$ExternalSyntheticLambda1.setY);
                        return;
                    }
                    setIconTintList seticontintlist5 = new setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius, this.MenuHostHelper$$ExternalSyntheticLambda1);
                    seticontintlist5.MenuHostHelper$$ExternalSyntheticLambda0 = i4;
                    seticontintlist5.setY = this.MenuHostHelper$$ExternalSyntheticLambda1.setY;
                    setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist5);
                    setsubtitle.setIconTintList(1.0f);
                    setsubtitle.setCenterIfNoTextEnabled = null;
                }
            }
        }

        setIconTintList(setOnRatingBarChangeListener setonratingbarchangelistener, setIconTintList seticontintlist) {
            this.setOnLongClickListener = -1;
            this.setLayoutAnimation = false;
            this.setY = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            this.setUnboundedRipple = null;
            this.setX = -1;
            this.setNavigationOnClickListener = 400;
            this.setAnimationFromJson = 0.0f;
            this.setTextAlignment = new ArrayList<>();
            this.setTextScaleX = null;
            this.setCenterIfNoTextEnabled = new ArrayList<>();
            this.setIconTintList = 0;
            this.setUiOptions = false;
            this.ViewPager$SavedState$1 = -1;
            this.setIconSize = 0;
            this.setMaxEms = 0;
            this.setChipCornerRadius = setonratingbarchangelistener;
            this.setNavigationOnClickListener = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1;
            if (seticontintlist != null) {
                this.ViewPager$SavedState$1 = seticontintlist.ViewPager$SavedState$1;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                this.setUnboundedRipple = seticontintlist.setUnboundedRipple;
                this.setX = seticontintlist.setX;
                this.setNavigationOnClickListener = seticontintlist.setNavigationOnClickListener;
                this.setTextAlignment = seticontintlist.setTextAlignment;
                this.setAnimationFromJson = seticontintlist.setAnimationFromJson;
                this.setIconSize = seticontintlist.setIconSize;
            }
        }

        public setIconTintList(setOnRatingBarChangeListener setonratingbarchangelistener, int i, int i2) {
            this.setOnLongClickListener = -1;
            this.setLayoutAnimation = false;
            this.setY = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            this.setUnboundedRipple = null;
            this.setX = -1;
            this.setNavigationOnClickListener = 400;
            this.setAnimationFromJson = 0.0f;
            this.setTextAlignment = new ArrayList<>();
            this.setTextScaleX = null;
            this.setCenterIfNoTextEnabled = new ArrayList<>();
            this.setIconTintList = 0;
            this.setUiOptions = false;
            this.ViewPager$SavedState$1 = -1;
            this.setIconSize = 0;
            this.setMaxEms = 0;
            this.setOnLongClickListener = -1;
            this.setChipCornerRadius = setonratingbarchangelistener;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            this.setY = i2;
            this.setNavigationOnClickListener = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setIconSize = setonratingbarchangelistener.setOnNavigationItemSelectedListener;
        }

        setIconTintList(setOnRatingBarChangeListener setonratingbarchangelistener, Context context, XmlPullParser xmlPullParser) {
            this.setOnLongClickListener = -1;
            this.setLayoutAnimation = false;
            this.setY = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            this.setUnboundedRipple = null;
            this.setX = -1;
            this.setNavigationOnClickListener = 400;
            this.setAnimationFromJson = 0.0f;
            this.setTextAlignment = new ArrayList<>();
            this.setTextScaleX = null;
            this.setCenterIfNoTextEnabled = new ArrayList<>();
            this.setIconTintList = 0;
            this.setUiOptions = false;
            this.ViewPager$SavedState$1 = -1;
            this.setIconSize = 0;
            this.setMaxEms = 0;
            this.setNavigationOnClickListener = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setIconSize = setonratingbarchangelistener.setOnNavigationItemSelectedListener;
            this.setChipCornerRadius = setonratingbarchangelistener;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setExpandedTitleMargin.setY.setMinDate);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.setFabAlignmentMode) {
                    this.setY = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.setY);
                    if ("layout".equals(resourceTypeName)) {
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(context, this.setY);
                        setonratingbarchangelistener.setY.append(this.setY, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.setY = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1(context, this.setY);
                    }
                } else if (index == setExpandedTitleMargin.setY.setCollapsible) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getResourceId(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    if ("layout".equals(resourceTypeName2)) {
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.MenuHostHelper$$ExternalSyntheticLambda1(context, this.MenuHostHelper$$ExternalSyntheticLambda0);
                        setonratingbarchangelistener.setY.append(this.MenuHostHelper$$ExternalSyntheticLambda0, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = setonratingbarchangelistener.MenuHostHelper$$ExternalSyntheticLambda1(context, this.MenuHostHelper$$ExternalSyntheticLambda0);
                    }
                } else if (index == setExpandedTitleMargin.setY.setTitleTextColor) {
                    TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                    if (peekValue.type == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.setX = resourceId;
                        if (resourceId != -1) {
                            this.MenuHostHelper$$ExternalSyntheticLambda1 = -2;
                        }
                    } else if (peekValue.type == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.setUnboundedRipple = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.setX = obtainStyledAttributes.getResourceId(index, -1);
                                this.MenuHostHelper$$ExternalSyntheticLambda1 = -2;
                            } else {
                                this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
                            }
                        }
                    } else {
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getInteger(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                } else if (index == setExpandedTitleMargin.setY.setEms) {
                    int i2 = obtainStyledAttributes.getInt(index, this.setNavigationOnClickListener);
                    this.setNavigationOnClickListener = i2;
                    if (i2 < 8) {
                        this.setNavigationOnClickListener = 8;
                    }
                } else if (index == setExpandedTitleMargin.setY.setRotationX) {
                    this.setAnimationFromJson = obtainStyledAttributes.getFloat(index, this.setAnimationFromJson);
                } else if (index == setExpandedTitleMargin.setY.getInsetsForType) {
                    this.setIconTintList = obtainStyledAttributes.getInteger(index, this.setIconTintList);
                } else if (index == setExpandedTitleMargin.setY.setLineSpacingMultiplier) {
                    this.setOnLongClickListener = obtainStyledAttributes.getResourceId(index, this.setOnLongClickListener);
                } else if (index == setExpandedTitleMargin.setY.setTranslateX) {
                    this.setUiOptions = obtainStyledAttributes.getBoolean(index, this.setUiOptions);
                } else if (index == setExpandedTitleMargin.setY.setAutofillId) {
                    this.ViewPager$SavedState$1 = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == setExpandedTitleMargin.setY.writeReplace) {
                    this.setIconSize = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == setExpandedTitleMargin.setY.setRotationY) {
                    this.setMaxEms = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == -1) {
                this.setLayoutAnimation = true;
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public setOnRatingBarChangeListener(Context context, setSubtitle setsubtitle, int i) {
        this.setOnLongClickListener = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.setIconSize = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 400;
        this.setOnNavigationItemSelectedListener = 0;
        this.setZ = setsubtitle;
        this.setUnboundedRipple = new setKeepScreenOn(setsubtitle);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            setIconTintList seticontintlist = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    char c = 2;
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1239391468:
                                if (name.equals("KeyFrameSet")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -687739768:
                                if (name.equals("Include")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 61998586:
                                if (name.equals("ViewTransition")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 269306229:
                                if (name.equals("Transition")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 312750793:
                                if (name.equals("OnClick")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 327855227:
                                if (name.equals("OnSwipe")) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case 793277014:
                                if (name.equals("MotionScene")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1942574248:
                                if (name.equals("include")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xml), setExpandedTitleMargin.setY.getKey);
                                int indexCount = obtainStyledAttributes.getIndexCount();
                                for (int i2 = 0; i2 < indexCount; i2++) {
                                    int index = obtainStyledAttributes.getIndex(i2);
                                    if (index == setExpandedTitleMargin.setY.setTabIndicatorFullWidth) {
                                        int i3 = obtainStyledAttributes.getInt(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                                        this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
                                        if (i3 < 8) {
                                            this.MenuHostHelper$$ExternalSyntheticLambda1 = 8;
                                        }
                                    } else if (index == setExpandedTitleMargin.setY.setImportantForAutofill) {
                                        this.setOnNavigationItemSelectedListener = obtainStyledAttributes.getInteger(index, 0);
                                    }
                                }
                                obtainStyledAttributes.recycle();
                                continue;
                            case 1:
                                ArrayList<setIconTintList> arrayList = this.setNavigationOnClickListener;
                                seticontintlist = new setIconTintList(this, context, xml);
                                arrayList.add(seticontintlist);
                                if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null && !seticontintlist.setLayoutAnimation) {
                                    this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist;
                                    if (seticontintlist.setTextScaleX != null) {
                                        this.MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1(this.setX);
                                    }
                                }
                                if (seticontintlist.setLayoutAnimation) {
                                    if (seticontintlist.setY == -1) {
                                        this.setIconSize = seticontintlist;
                                    } else {
                                        this.setUiOptions.add(seticontintlist);
                                    }
                                    this.setNavigationOnClickListener.remove(seticontintlist);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 2:
                                if (seticontintlist == null) {
                                    String resourceEntryName = context.getResources().getResourceEntryName(i);
                                    int lineNumber = xml.getLineNumber();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(" OnSwipe (");
                                    sb.append(resourceEntryName);
                                    sb.append(".xml:");
                                    sb.append(lineNumber);
                                    sb.append(")");
                                    Log.v("MotionScene", sb.toString());
                                }
                                if (seticontintlist != null) {
                                    seticontintlist.setTextScaleX = new setLayerType(context, this.setZ, xml);
                                    continue;
                                } else {
                                    continue;
                                }
                            case 3:
                                if (seticontintlist != null) {
                                    seticontintlist.setCenterIfNoTextEnabled.add(new setIconTintList.View$OnClickListenerC0006setIconTintList(context, seticontintlist, xml));
                                    continue;
                                } else {
                                    continue;
                                }
                            case 4:
                                this.setOnLongClickListener = new setForegroundTintBlendMode(context, xml);
                                continue;
                            case 5:
                                setIconTintList(context, xml);
                                continue;
                            case 6:
                            case 7:
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xml), setExpandedTitleMargin.setY.setVerticalSpacing);
                                int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                for (int i4 = 0; i4 < indexCount2; i4++) {
                                    int index2 = obtainStyledAttributes2.getIndex(i4);
                                    if (index2 == setExpandedTitleMargin.setY.WindowInsetsCompat$Impl30) {
                                        MenuHostHelper$$ExternalSyntheticLambda1(context, obtainStyledAttributes2.getResourceId(index2, -1));
                                    }
                                }
                                obtainStyledAttributes2.recycle();
                                continue;
                            case '\b':
                                FabTransformationScrimBehavior fabTransformationScrimBehavior = new FabTransformationScrimBehavior(context, xml);
                                if (seticontintlist != null) {
                                    seticontintlist.setTextAlignment.add(fabTransformationScrimBehavior);
                                    continue;
                                } else {
                                    continue;
                                }
                            case '\t':
                                setOnItemSelectedListener setonitemselectedlistener = new setOnItemSelectedListener(context, xml);
                                setKeepScreenOn setkeepscreenon = this.setUnboundedRipple;
                                setkeepscreenon.setIconTintList.add(setonitemselectedlistener);
                                setkeepscreenon.setY = null;
                                if (setonitemselectedlistener.setX == 4) {
                                    setkeepscreenon.MenuHostHelper$$ExternalSyntheticLambda0(setonitemselectedlistener, true);
                                    continue;
                                } else if (setonitemselectedlistener.setX == 5) {
                                    setkeepscreenon.MenuHostHelper$$ExternalSyntheticLambda0(setonitemselectedlistener, false);
                                    continue;
                                } else {
                                    continue;
                                }
                            default:
                                continue;
                        }
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        this.setY.put(setExpandedTitleMargin.setX.res_0x7f0a0131_menuhosthelper_externalsyntheticlambda0, new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1());
        this.ViewPager$SavedState$1.put("motion_base", Integer.valueOf(setExpandedTitleMargin.setX.res_0x7f0a0131_menuhosthelper_externalsyntheticlambda0));
    }

    private int MenuHostHelper$$ExternalSyntheticLambda0(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str != null && str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
            return i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return setIconTintList(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int setIconTintList(Context context, XmlPullParser xmlPullParser) {
        char c;
        char c2;
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            attributeName.hashCode();
            int hashCode = attributeName.hashCode();
            if (hashCode == -1496482599) {
                if (attributeName.equals("deriveConstraintsFrom")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -1153153640) {
                if (hashCode == 3355 && attributeName.equals("id")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (attributeName.equals("constraintRotate")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                i2 = MenuHostHelper$$ExternalSyntheticLambda0(context, attributeValue);
            } else if (c == 1) {
                try {
                    withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList = Integer.parseInt(attributeValue);
                } catch (NumberFormatException unused) {
                    attributeValue.hashCode();
                    switch (attributeValue.hashCode()) {
                        case -768416914:
                            if (attributeValue.equals("x_left")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3317767:
                            if (attributeValue.equals("left")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3387192:
                            if (attributeValue.equals("none")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 108511772:
                            if (attributeValue.equals("right")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1954540437:
                            if (attributeValue.equals("x_right")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 0) {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList = 4;
                    } else if (c2 == 1) {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList = 2;
                    } else if (c2 == 2) {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList = 0;
                    } else if (c2 == 3) {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList = 1;
                    } else if (c2 == 4) {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList = 3;
                    }
                }
            } else if (c == 2) {
                i = MenuHostHelper$$ExternalSyntheticLambda0(context, attributeValue);
                HashMap<String, Integer> hashMap = this.ViewPager$SavedState$1;
                if (attributeValue == null) {
                    attributeValue = "";
                } else {
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                }
                hashMap.put(attributeValue, Integer.valueOf(i));
                withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX = setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(context, i);
            }
        }
        if (i != -1) {
            int i4 = this.setZ.setX;
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX(context, xmlPullParser);
            if (i2 != -1) {
                this.setIconTintList.put(i, i2);
            }
            this.setY.put(i, withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 setX(int i) {
        int MenuHostHelper$$ExternalSyntheticLambda1;
        setForegroundTintBlendMode setforegroundtintblendmode = this.setOnLongClickListener;
        if (setforegroundtintblendmode != null && (MenuHostHelper$$ExternalSyntheticLambda1 = setforegroundtintblendmode.MenuHostHelper$$ExternalSyntheticLambda1(i, -1.0f, -1.0f)) != -1) {
            i = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        if (this.setY.get(i) == null) {
            StringBuilder sb = new StringBuilder("Warning could not find ConstraintSet id/");
            sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(this.setZ.getContext(), i));
            sb.append(" In MotionScene");
            Log.e("MotionScene", sb.toString());
            SparseArray<WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1> sparseArray = this.setY;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.setY.get(i);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setIconStartPadding seticonstartpadding) {
        setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (seticontintlist == null) {
            setIconTintList seticontintlist2 = this.setIconSize;
            if (seticontintlist2 != null) {
                Iterator<FabTransformationScrimBehavior> it = seticontintlist2.setTextAlignment.iterator();
                while (it.hasNext()) {
                    it.next().setY(seticonstartpadding);
                }
                return;
            }
            return;
        }
        Iterator<FabTransformationScrimBehavior> it2 = seticontintlist.setTextAlignment.iterator();
        while (it2.hasNext()) {
            it2.next().setY(seticonstartpadding);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        Iterator<setIconTintList> it = this.setNavigationOnClickListener.iterator();
        while (it.hasNext()) {
            if (it.next().setTextScaleX != null) {
                return true;
            }
        }
        setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return (seticontintlist == null || seticontintlist.setTextScaleX == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(android.view.MotionEvent r30, int r31, o.setSubtitle r32) {
        /*
            Method dump skipped, instructions count: 1998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnRatingBarChangeListener.MenuHostHelper$$ExternalSyntheticLambda0(android.view.MotionEvent, int, o.setSubtitle):void");
    }

    public final Interpolator MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i != -2) {
            if (i == -1) {
                final joinThreadPool iconTintList = joinThreadPool.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple);
                return new Interpolator() { // from class: o.setOnRatingBarChangeListener.5
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        return (float) joinThreadPool.this.setIconTintList(f);
                    }
                };
            } else if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 6) {
                                    return null;
                                }
                                return new AnticipateInterpolator();
                            }
                            return new OvershootInterpolator();
                        }
                        return new BounceInterpolator();
                    }
                    return new DecelerateInterpolator();
                }
                return new AccelerateInterpolator();
            } else {
                return new AccelerateDecelerateInterpolator();
            }
        }
        return AnimationUtils.loadInterpolator(this.setZ.getContext(), this.MenuHostHelper$$ExternalSyntheticLambda0.setX);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(int i, setSubtitle setsubtitle) {
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.setY.get(i);
        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0 = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX;
        int i2 = this.setIconTintList.get(i);
        if (i2 > 0) {
            setY(i2, setsubtitle);
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 = this.setY.get(i2);
            if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 == null) {
                StringBuilder sb = new StringBuilder("ERROR! invalid deriveConstraintsFrom: @id/");
                sb.append(setExtendMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1(this.setZ.getContext(), i2));
                Log.e("MotionScene", sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0);
            sb2.append("/");
            sb2.append(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.MenuHostHelper$$ExternalSyntheticLambda0);
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0 = sb2.toString();
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0);
            sb3.append("  layout");
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0 = sb3.toString();
            withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX(setsubtitle);
        }
        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setX(setSubtitle setsubtitle, int i) {
        if (this.setGuidelinePercent != null) {
            return false;
        }
        Iterator<setIconTintList> it = this.setNavigationOnClickListener.iterator();
        while (it.hasNext()) {
            setIconTintList next = it.next();
            if (next.setIconTintList != 0) {
                setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (seticontintlist == next) {
                    if ((seticontintlist.setMaxEms & 2) != 0) {
                        continue;
                    }
                }
                if (i == next.MenuHostHelper$$ExternalSyntheticLambda0 && (next.setIconTintList == 4 || next.setIconTintList == 2)) {
                    setsubtitle.setX(setSubtitle.setNavigationOnClickListener.FINISHED);
                    setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(next);
                    if (next.setIconTintList != 4) {
                        setsubtitle.setProgress(1.0f);
                        setsubtitle.setY(true);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.SETUP);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.MOVING);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.FINISHED);
                        setsubtitle.setY();
                    } else {
                        setsubtitle.setIconTintList(1.0f);
                        setsubtitle.setCenterIfNoTextEnabled = null;
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.SETUP);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.MOVING);
                    }
                    return true;
                } else if (i == next.setY && (next.setIconTintList == 3 || next.setIconTintList == 1)) {
                    setsubtitle.setX(setSubtitle.setNavigationOnClickListener.FINISHED);
                    setsubtitle.MenuHostHelper$$ExternalSyntheticLambda1(next);
                    if (next.setIconTintList != 3) {
                        setsubtitle.setProgress(0.0f);
                        setsubtitle.setY(true);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.SETUP);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.MOVING);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.FINISHED);
                        setsubtitle.setY();
                    } else {
                        setsubtitle.setIconTintList(0.0f);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.SETUP);
                        setsubtitle.setX(setSubtitle.setNavigationOnClickListener.MOVING);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}