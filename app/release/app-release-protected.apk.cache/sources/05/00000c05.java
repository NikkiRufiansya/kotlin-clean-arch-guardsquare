package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class setGuidelineEnd extends setRendererPriorityPolicy {
    private static setWebChromeClient ViewPager$SavedState$1;
    private static final Property<View, PointF> setCenterIfNoTextEnabled;
    private static final Property<setX, PointF> setChipCornerRadius;
    private static final Property<setX, PointF> setIconSize;
    private static final String[] setOnNavigationItemSelectedListener = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<View, PointF> setTextAlignment;
    private static final Property<View, PointF> setUiOptions;
    private boolean setAnimationFromJson;
    private boolean setTextScaleX;
    private int[] setZ;

    static {
        new Property<Drawable, PointF>(PointF.class, "boundsOrigin") { // from class: o.setGuidelineEnd.3
            private Rect setIconTintList = new Rect();

            @Override // android.util.Property
            public final /* synthetic */ PointF get(Drawable drawable) {
                drawable.copyBounds(this.setIconTintList);
                return new PointF(this.setIconTintList.left, this.setIconTintList.top);
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(Drawable drawable, PointF pointF) {
                Drawable drawable2 = drawable;
                PointF pointF2 = pointF;
                drawable2.copyBounds(this.setIconTintList);
                this.setIconTintList.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
                drawable2.setBounds(this.setIconTintList);
            }
        };
        setIconSize = new Property<setX, PointF>(PointF.class, "topLeft") { // from class: o.setGuidelineEnd.1
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(setX setx) {
                return null;
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(setX setx, PointF pointF) {
                setX setx2 = setx;
                PointF pointF2 = pointF;
                setx2.setIconTintList = Math.round(pointF2.x);
                setx2.setY = Math.round(pointF2.y);
                int i = setx2.setOnLongClickListener + 1;
                setx2.setOnLongClickListener = i;
                if (i == setx2.setX) {
                    setx2.MenuHostHelper$$ExternalSyntheticLambda0();
                }
            }
        };
        setChipCornerRadius = new Property<setX, PointF>(PointF.class, "bottomRight") { // from class: o.setGuidelineEnd.5
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(setX setx) {
                return null;
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(setX setx, PointF pointF) {
                setX setx2 = setx;
                PointF pointF2 = pointF;
                setx2.MenuHostHelper$$ExternalSyntheticLambda0 = Math.round(pointF2.x);
                setx2.MenuHostHelper$$ExternalSyntheticLambda1 = Math.round(pointF2.y);
                int i = setx2.setX + 1;
                setx2.setX = i;
                if (setx2.setOnLongClickListener == i) {
                    setx2.MenuHostHelper$$ExternalSyntheticLambda0();
                }
            }
        };
        setUiOptions = new Property<View, PointF>(PointF.class, "bottomRight") { // from class: o.setGuidelineEnd.4
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                setScrollBarFadeDuration.setX(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
            }
        };
        setTextAlignment = new Property<View, PointF>(PointF.class, "topLeft") { // from class: o.setGuidelineEnd.2
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                setScrollBarFadeDuration.setX(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
            }
        };
        setCenterIfNoTextEnabled = new Property<View, PointF>(PointF.class, "position") { // from class: o.setGuidelineEnd.7
            @Override // android.util.Property
            public final /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                int round = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                setScrollBarFadeDuration.setX(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
            }
        };
        ViewPager$SavedState$1 = new setWebChromeClient();
    }

    public setGuidelineEnd() {
        this.setZ = new int[2];
        this.setTextScaleX = false;
        this.setAnimationFromJson = false;
    }

    public setGuidelineEnd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setZ = new int[2];
        this.setTextScaleX = false;
        this.setAnimationFromJson = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setChipBackgroundColor.setIconTintList);
        boolean y = setHandwritingBoundsOffsets.setY(obtainStyledAttributes, (XmlPullParser) ((XmlResourceParser) attributeSet), "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.setTextScaleX = y;
    }

    @Override // o.setRendererPriorityPolicy
    public final String[] setIconTintList() {
        return setOnNavigationItemSelectedListener;
    }

    private void setX(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        View view = windowInsetsCompat$Impl.setX;
        if (!setBaselineAlignBottom.setConstraintSet(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        windowInsetsCompat$Impl.setY.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        windowInsetsCompat$Impl.setY.put("android:changeBounds:parent", windowInsetsCompat$Impl.setX.getParent());
        if (this.setTextScaleX) {
            windowInsetsCompat$Impl.setY.put("android:changeBounds:clip", setBaselineAlignBottom.setOnLongClickListener(view));
        }
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        setX(windowInsetsCompat$Impl);
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        setX(windowInsetsCompat$Impl);
    }

    @Override // o.setRendererPriorityPolicy
    public final Animator setIconTintList(ViewGroup viewGroup, WindowInsetsCompat$Impl windowInsetsCompat$Impl, WindowInsetsCompat$Impl windowInsetsCompat$Impl2) {
        int i;
        final View view;
        int i2;
        Rect rect;
        boolean z;
        boolean z2;
        ObjectAnimator objectAnimator;
        Animator iconTintList;
        if (windowInsetsCompat$Impl == null || windowInsetsCompat$Impl2 == null) {
            return null;
        }
        Map<String, Object> map = windowInsetsCompat$Impl.setY;
        Map<String, Object> map2 = windowInsetsCompat$Impl2.setY;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = windowInsetsCompat$Impl2.setX;
        Rect rect2 = (Rect) windowInsetsCompat$Impl.setY.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) windowInsetsCompat$Impl2.setY.get("android:changeBounds:bounds");
        int i3 = rect2.left;
        final int i4 = rect3.left;
        int i5 = rect2.top;
        final int i6 = rect3.top;
        int i7 = rect2.right;
        final int i8 = rect3.right;
        int i9 = rect2.bottom;
        final int i10 = rect3.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect4 = (Rect) windowInsetsCompat$Impl.setY.get("android:changeBounds:clip");
        final Rect rect5 = (Rect) windowInsetsCompat$Impl2.setY.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        int i15 = i;
        if (i15 > 0) {
            if (!this.setTextScaleX) {
                view = view2;
                setScrollBarFadeDuration.setX(view, i3, i5, i7, i9);
                if (i15 == 2) {
                    if (i11 != i13 || i12 != i14) {
                        setX setx = new setX(view);
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(setx, (Property<setX, V>) setIconSize, (TypeConverter) null, setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda1(i3, i5, i4, i6));
                        ObjectAnimator ofObject2 = ObjectAnimator.ofObject(setx, (Property<setX, V>) setChipCornerRadius, (TypeConverter) null, setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda1(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofObject, ofObject2);
                        animatorSet.addListener(new AnimatorListenerAdapter(setx) { // from class: o.setGuidelineEnd.10
                            private setX mViewBounds;
                            final /* synthetic */ setX setX;

                            {
                                this.setX = setx;
                                this.mViewBounds = setx;
                            }
                        });
                        iconTintList = animatorSet;
                    } else {
                        iconTintList = ObjectAnimator.ofObject(view, (Property<View, V>) setCenterIfNoTextEnabled, (TypeConverter) null, setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda1(i3, i5, i4, i6));
                    }
                } else if (i3 == i4 && i5 == i6) {
                    iconTintList = ObjectAnimator.ofObject(view, (Property<View, V>) setUiOptions, (TypeConverter) null, setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda1(i7, i9, i8, i10));
                } else {
                    iconTintList = ObjectAnimator.ofObject(view, (Property<View, V>) setTextAlignment, (TypeConverter) null, setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda1(i3, i5, i4, i6));
                }
                z = true;
                z2 = false;
            } else {
                view = view2;
                setScrollBarFadeDuration.setX(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator ofObject3 = (i3 == i4 && i5 == i6) ? null : ObjectAnimator.ofObject(view, (Property<View, V>) setCenterIfNoTextEnabled, (TypeConverter) null, setNavigationOnClickListener().MenuHostHelper$$ExternalSyntheticLambda1(i3, i5, i4, i6));
                if (rect4 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
                if (rect.equals(rect6)) {
                    z = true;
                    z2 = false;
                    objectAnimator = null;
                } else {
                    view.setClipBounds(rect);
                    setWebChromeClient setwebchromeclient = ViewPager$SavedState$1;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject4 = ObjectAnimator.ofObject(view, "clipBounds", setwebchromeclient, objArr);
                    z2 = false;
                    z = true;
                    ofObject4.addListener(new AnimatorListenerAdapter() { // from class: o.setGuidelineEnd.9
                        private boolean setOnLongClickListener;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            this.setOnLongClickListener = true;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            if (this.setOnLongClickListener) {
                                return;
                            }
                            view.setClipBounds(rect5);
                            setScrollBarFadeDuration.setX(view, i4, i6, i8, i10);
                        }
                    });
                    objectAnimator = ofObject4;
                }
                iconTintList = setInteractionEnabled.setIconTintList(ofObject3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                if (Build.VERSION.SDK_INT >= 29) {
                    viewGroup4.suppressLayout(z);
                } else if (setStartIconTintList.setY) {
                    try {
                        viewGroup4.suppressLayout(z);
                    } catch (NoSuchMethodError unused) {
                        setStartIconTintList.setY = z2;
                    }
                }
                setY(new setBoxBackgroundColor() { // from class: o.setGuidelineEnd.6
                    private boolean setX = false;

                    @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
                    public final void setX() {
                        ViewGroup viewGroup5 = viewGroup4;
                        if (Build.VERSION.SDK_INT >= 29) {
                            viewGroup5.suppressLayout(false);
                        } else if (setStartIconTintList.setY) {
                            try {
                                viewGroup5.suppressLayout(false);
                            } catch (NoSuchMethodError unused2) {
                                setStartIconTintList.setY = false;
                            }
                        }
                        this.setX = true;
                    }

                    @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
                    public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy) {
                        if (!this.setX) {
                            ViewGroup viewGroup5 = viewGroup4;
                            if (Build.VERSION.SDK_INT >= 29) {
                                viewGroup5.suppressLayout(false);
                            } else if (setStartIconTintList.setY) {
                                try {
                                    viewGroup5.suppressLayout(false);
                                } catch (NoSuchMethodError unused2) {
                                    setStartIconTintList.setY = false;
                                }
                            }
                        }
                        setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(this);
                    }

                    @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
                    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
                        ViewGroup viewGroup5 = viewGroup4;
                        if (Build.VERSION.SDK_INT >= 29) {
                            viewGroup5.suppressLayout(false);
                        } else if (setStartIconTintList.setY) {
                            try {
                                viewGroup5.suppressLayout(false);
                            } catch (NoSuchMethodError unused2) {
                                setStartIconTintList.setY = false;
                            }
                        }
                    }

                    @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
                    public final void setIconTintList() {
                        ViewGroup viewGroup5 = viewGroup4;
                        if (Build.VERSION.SDK_INT >= 29) {
                            viewGroup5.suppressLayout(true);
                        } else if (setStartIconTintList.setY) {
                            try {
                                viewGroup5.suppressLayout(true);
                            } catch (NoSuchMethodError unused2) {
                                setStartIconTintList.setY = false;
                            }
                        }
                    }
                });
            }
            return iconTintList;
        }
        return null;
    }

    /* loaded from: classes.dex */
    static class setX {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int setIconTintList;
        private View setNavigationOnClickListener;
        int setOnLongClickListener;
        int setX;
        int setY;

        setX(View view) {
            this.setNavigationOnClickListener = view;
        }

        final void MenuHostHelper$$ExternalSyntheticLambda0() {
            setScrollBarFadeDuration.setX(this.setNavigationOnClickListener, this.setIconTintList, this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1);
            this.setOnLongClickListener = 0;
            this.setX = 0;
        }
    }
}