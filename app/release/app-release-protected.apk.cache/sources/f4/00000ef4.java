package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class setRendererPriorityPolicy implements Cloneable {
    private ArrayList<View> ExtendableSavedState$1;
    private ArrayList<Class<?>> FloatingActionButton$BaseBehavior;
    private ArrayList<Integer> FragmentStateAdapter$2;
    private ArrayList<String> FragmentStateAdapter$5;
    ArrayList<Animator> MenuHostHelper$$ExternalSyntheticLambda0;
    long MenuHostHelper$$ExternalSyntheticLambda1;
    private setSpannableFactory SearchView$SavedState$1;
    private ArrayList<Class<?>> setAdapter;
    private setY setAnimationFromJson;
    private int setCheckedIconEnabled;
    private setSpannableFactory setChipCornerRadius;
    private ArrayList<WindowInsetsCompat$Impl> setChipIconTintResource;
    private ArrayList<Integer> setConstraintSet;
    private ArrayList<View> setContentScrimResource;
    private setFabAnchorMode<String, String> setGuidelinePercent;
    private ViewGroup setHasDecor;
    private ArrayList<Animator> setIconSize;
    setColumnWidth setIconTintList;
    private long setIconified;
    ArrayList<View> setLayoutAnimation;
    private boolean setLayoutDirection;
    private ArrayList<setIconTintList> setMaxEms;
    private String setMinAndMaxProgress;
    ArrayList<String> setNavigationOnClickListener;
    ArrayList<Integer> setOnLongClickListener;
    private boolean setOnNavigationItemSelectedListener;
    private ArrayList<WindowInsetsCompat$Impl> setTextAlignment;
    private setSaveEnabled setTextAppearanceResource;
    private int[] setTextScaleX;
    ArrayList<Class<?>> setUnboundedRipple;
    setActiveIndicatorWidth setX;
    boolean setY;
    private TimeInterpolator setZ;
    private static final int[] setUiOptions = {2, 1, 3, 4};
    private static final setSaveEnabled setCenterIfNoTextEnabled = new setSaveEnabled() { // from class: o.setRendererPriorityPolicy.5
        @Override // o.setSaveEnabled
        public final Path MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static ThreadLocal<setFabAnchorMode<Animator, setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0>> ViewPager$SavedState$1 = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda0();

        void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy);

        void MenuHostHelper$$ExternalSyntheticLambda1();

        void setIconTintList();

        void setX();
    }

    /* loaded from: classes.dex */
    public static abstract class setY {
    }

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl windowInsetsCompat$Impl);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl windowInsetsCompat$Impl);

    public Animator setIconTintList(ViewGroup viewGroup, WindowInsetsCompat$Impl windowInsetsCompat$Impl, WindowInsetsCompat$Impl windowInsetsCompat$Impl2) {
        return null;
    }

    public String[] setIconTintList() {
        return null;
    }

    public setRendererPriorityPolicy() {
        this.setMinAndMaxProgress = getClass().getName();
        this.setIconified = -1L;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1L;
        this.setZ = null;
        this.setOnLongClickListener = new ArrayList<>();
        this.setLayoutAnimation = new ArrayList<>();
        this.setNavigationOnClickListener = null;
        this.setUnboundedRipple = null;
        this.setConstraintSet = null;
        this.setContentScrimResource = null;
        this.setAdapter = null;
        this.FragmentStateAdapter$5 = null;
        this.FragmentStateAdapter$2 = null;
        this.ExtendableSavedState$1 = null;
        this.FloatingActionButton$BaseBehavior = null;
        this.SearchView$SavedState$1 = new setSpannableFactory();
        this.setChipCornerRadius = new setSpannableFactory();
        this.setIconTintList = null;
        this.setTextScaleX = setUiOptions;
        this.setHasDecor = null;
        this.setY = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
        this.setCheckedIconEnabled = 0;
        this.setLayoutDirection = false;
        this.setOnNavigationItemSelectedListener = false;
        this.setMaxEms = null;
        this.setIconSize = new ArrayList<>();
        this.setTextAppearanceResource = setCenterIfNoTextEnabled;
    }

    public setRendererPriorityPolicy(Context context, AttributeSet attributeSet) {
        boolean z;
        this.setMinAndMaxProgress = getClass().getName();
        this.setIconified = -1L;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1L;
        this.setZ = null;
        this.setOnLongClickListener = new ArrayList<>();
        this.setLayoutAnimation = new ArrayList<>();
        this.setNavigationOnClickListener = null;
        this.setUnboundedRipple = null;
        this.setConstraintSet = null;
        this.setContentScrimResource = null;
        this.setAdapter = null;
        this.FragmentStateAdapter$5 = null;
        this.FragmentStateAdapter$2 = null;
        this.ExtendableSavedState$1 = null;
        this.FloatingActionButton$BaseBehavior = null;
        this.SearchView$SavedState$1 = new setSpannableFactory();
        this.setChipCornerRadius = new setSpannableFactory();
        this.setIconTintList = null;
        this.setTextScaleX = setUiOptions;
        this.setHasDecor = null;
        this.setY = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
        this.setCheckedIconEnabled = 0;
        this.setLayoutDirection = false;
        this.setOnNavigationItemSelectedListener = false;
        this.setMaxEms = null;
        this.setIconSize = new ArrayList<>();
        this.setTextAppearanceResource = setCenterIfNoTextEnabled;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setChipBackgroundColor.MenuHostHelper$$ExternalSyntheticLambda1);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long x = setHandwritingBoundsOffsets.setX(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (x >= 0) {
            setY(x);
        }
        long x2 = setHandwritingBoundsOffsets.setX(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (x2 > 0) {
            setX(x2);
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = setHandwritingBoundsOffsets.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, xmlResourceParser, "interpolator", 0);
        if (MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
            MenuHostHelper$$ExternalSyntheticLambda0(AnimationUtils.loadInterpolator(context, MenuHostHelper$$ExternalSyntheticLambda1));
        }
        String x3 = setHandwritingBoundsOffsets.setX(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (x3 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(x3, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr[i] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr[i] = 1;
                } else if ("name".equalsIgnoreCase(trim)) {
                    iArr[i] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr[i] = 4;
                } else if (trim.isEmpty()) {
                    int[] iArr2 = new int[iArr.length - 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    i--;
                    iArr = iArr2;
                } else {
                    StringBuilder sb = new StringBuilder("Unknown match type in matchOrder: '");
                    sb.append(trim);
                    sb.append("'");
                    throw new InflateException(sb.toString());
                }
                i++;
            }
            if (iArr.length == 0) {
                this.setTextScaleX = setUiOptions;
            } else {
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    int i3 = iArr[i2];
                    if (!(i3 > 0 && i3 <= 4)) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    int i4 = iArr[i2];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i2) {
                            z = false;
                            break;
                        } else if (iArr[i5] == i4) {
                            z = true;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (z) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                }
                this.setTextScaleX = (int[]) iArr.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }

    public setRendererPriorityPolicy setY(long j) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
        return this;
    }

    public setRendererPriorityPolicy setX(long j) {
        this.setIconified = j;
        return this;
    }

    public final long setLayoutAnimation() {
        return this.setIconified;
    }

    public setRendererPriorityPolicy MenuHostHelper$$ExternalSyntheticLambda0(TimeInterpolator timeInterpolator) {
        this.setZ = timeInterpolator;
        return this;
    }

    public final TimeInterpolator setUiOptions() {
        return this.setZ;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setY(android.view.ViewGroup r21, o.setSpannableFactory r22, o.setSpannableFactory r23, java.util.ArrayList<o.WindowInsetsCompat$Impl> r24, java.util.ArrayList<o.WindowInsetsCompat$Impl> r25) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRendererPriorityPolicy.setY(android.view.ViewGroup, o.setSpannableFactory, o.setSpannableFactory, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setY(View view) {
        return (this.setOnLongClickListener.size() == 0 && this.setLayoutAnimation.size() == 0) || this.setOnLongClickListener.contains(Integer.valueOf(view.getId())) || this.setLayoutAnimation.contains(view);
    }

    private static setFabAnchorMode<Animator, setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0> setChipCornerRadius() {
        setFabAnchorMode<Animator, setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0> setfabanchormode = ViewPager$SavedState$1.get();
        if (setfabanchormode == null) {
            setFabAnchorMode<Animator, setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0> setfabanchormode2 = new setFabAnchorMode<>();
            ViewPager$SavedState$1.set(setfabanchormode2);
            return setfabanchormode2;
        }
        return setfabanchormode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setUnboundedRipple() {
        setOnLongClickListener();
        final setFabAnchorMode<Animator, setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0> chipCornerRadius = setChipCornerRadius();
        Iterator<Animator> it = this.setIconSize.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (chipCornerRadius.containsKey(next)) {
                setOnLongClickListener();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() { // from class: o.setRendererPriorityPolicy.3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            setRendererPriorityPolicy.this.MenuHostHelper$$ExternalSyntheticLambda0.add(animator);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            chipCornerRadius.remove(animator);
                            setRendererPriorityPolicy.this.MenuHostHelper$$ExternalSyntheticLambda0.remove(animator);
                        }
                    });
                    if (next == null) {
                        setX();
                    } else {
                        long j = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (j >= 0) {
                            next.setDuration(j);
                        }
                        long j2 = this.setIconified;
                        if (j2 >= 0) {
                            next.setStartDelay(j2 + next.getStartDelay());
                        }
                        TimeInterpolator timeInterpolator = this.setZ;
                        if (timeInterpolator != null) {
                            next.setInterpolator(timeInterpolator);
                        }
                        next.addListener(new AnimatorListenerAdapter() { // from class: o.setRendererPriorityPolicy.4
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                setRendererPriorityPolicy.this.setX();
                                animator.removeListener(this);
                            }
                        });
                        next.start();
                    }
                }
            }
        }
        this.setIconSize.clear();
        setX();
    }

    public setRendererPriorityPolicy MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        this.setLayoutAnimation.add(view);
        return this;
    }

    public setRendererPriorityPolicy setX(View view) {
        this.setLayoutAnimation.remove(view);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(ViewGroup viewGroup, boolean z) {
        setIconTintList(z);
        if (this.setOnLongClickListener.size() > 0 || this.setLayoutAnimation.size() > 0) {
            for (int i = 0; i < this.setOnLongClickListener.size(); i++) {
                View findViewById = viewGroup.findViewById(this.setOnLongClickListener.get(i).intValue());
                if (findViewById != null) {
                    WindowInsetsCompat$Impl windowInsetsCompat$Impl = new WindowInsetsCompat$Impl(findViewById);
                    if (z) {
                        MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat$Impl);
                    } else {
                        MenuHostHelper$$ExternalSyntheticLambda0(windowInsetsCompat$Impl);
                    }
                    windowInsetsCompat$Impl.MenuHostHelper$$ExternalSyntheticLambda1.add(this);
                    setIconTintList(windowInsetsCompat$Impl);
                    if (z) {
                        MenuHostHelper$$ExternalSyntheticLambda0(this.SearchView$SavedState$1, findViewById, windowInsetsCompat$Impl);
                    } else {
                        MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, findViewById, windowInsetsCompat$Impl);
                    }
                }
            }
            for (int i2 = 0; i2 < this.setLayoutAnimation.size(); i2++) {
                View view = this.setLayoutAnimation.get(i2);
                WindowInsetsCompat$Impl windowInsetsCompat$Impl2 = new WindowInsetsCompat$Impl(view);
                if (z) {
                    MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat$Impl2);
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0(windowInsetsCompat$Impl2);
                }
                windowInsetsCompat$Impl2.MenuHostHelper$$ExternalSyntheticLambda1.add(this);
                setIconTintList(windowInsetsCompat$Impl2);
                if (z) {
                    MenuHostHelper$$ExternalSyntheticLambda0(this.SearchView$SavedState$1, view, windowInsetsCompat$Impl2);
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, view, windowInsetsCompat$Impl2);
                }
            }
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(viewGroup, z);
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda0(setSpannableFactory setspannablefactory, View view, WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        setspannablefactory.setY.put(view, windowInsetsCompat$Impl);
        int id = view.getId();
        if (id >= 0) {
            if (setspannablefactory.MenuHostHelper$$ExternalSyntheticLambda0.indexOfKey(id) >= 0) {
                setspannablefactory.MenuHostHelper$$ExternalSyntheticLambda0.put(id, null);
            } else {
                setspannablefactory.MenuHostHelper$$ExternalSyntheticLambda0.put(id, view);
            }
        }
        String layoutDirection = setBaselineAlignBottom.setLayoutDirection(view);
        if (layoutDirection != null) {
            if (setspannablefactory.setIconTintList.containsKey(layoutDirection)) {
                setspannablefactory.setIconTintList.put(layoutDirection, null);
            } else {
                setspannablefactory.setIconTintList.put(layoutDirection, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                setPrefixTextAppearance<View> setprefixtextappearance = setspannablefactory.setX;
                if (setprefixtextappearance.setIconTintList) {
                    setprefixtextappearance.setIconTintList();
                }
                if (setStatusBarBackground.setY(setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0, setprefixtextappearance.setX, itemIdAtPosition) < 0) {
                    setBaselineAlignBottom.setY(view, true);
                    setspannablefactory.setX.setX(itemIdAtPosition, view);
                    return;
                }
                View MenuHostHelper$$ExternalSyntheticLambda0 = setspannablefactory.setX.MenuHostHelper$$ExternalSyntheticLambda0(itemIdAtPosition, null);
                if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                    setBaselineAlignBottom.setY(MenuHostHelper$$ExternalSyntheticLambda0, false);
                    setspannablefactory.setX.setX(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(boolean z) {
        if (z) {
            this.SearchView$SavedState$1.setY.clear();
            this.SearchView$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.clear();
            this.SearchView$SavedState$1.setX.setX();
            return;
        }
        this.setChipCornerRadius.setY.clear();
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0.clear();
        this.setChipCornerRadius.setX.setX();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            WindowInsetsCompat$Impl windowInsetsCompat$Impl = new WindowInsetsCompat$Impl(view);
            if (z) {
                MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat$Impl);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda0(windowInsetsCompat$Impl);
            }
            windowInsetsCompat$Impl.MenuHostHelper$$ExternalSyntheticLambda1.add(this);
            setIconTintList(windowInsetsCompat$Impl);
            if (z) {
                MenuHostHelper$$ExternalSyntheticLambda0(this.SearchView$SavedState$1, view, windowInsetsCompat$Impl);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius, view, windowInsetsCompat$Impl);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                MenuHostHelper$$ExternalSyntheticLambda0(viewGroup.getChildAt(i), z);
            }
        }
    }

    public final WindowInsetsCompat$Impl setX(View view, boolean z) {
        setColumnWidth setcolumnwidth = this;
        while (true) {
            setColumnWidth setcolumnwidth2 = setcolumnwidth.setIconTintList;
            if (setcolumnwidth2 == null) {
                break;
            }
            setcolumnwidth = setcolumnwidth2;
        }
        return (z ? setcolumnwidth.SearchView$SavedState$1 : setcolumnwidth.setChipCornerRadius).setY.get(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r4 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
        if (r8 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
        r7 = r0.setTextAlignment;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
        r7 = r0.setChipIconTintResource;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
        return r7.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.WindowInsetsCompat$Impl MenuHostHelper$$ExternalSyntheticLambda1(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            r0 = r6
        L1:
            o.setColumnWidth r1 = r0.setIconTintList
            if (r1 == 0) goto L7
            r0 = r1
            goto L1
        L7:
            if (r8 == 0) goto Lc
            java.util.ArrayList<o.WindowInsetsCompat$Impl> r1 = r0.setChipIconTintResource
            goto Le
        Lc:
            java.util.ArrayList<o.WindowInsetsCompat$Impl> r1 = r0.setTextAlignment
        Le:
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            int r3 = r1.size()
            r4 = 0
        L17:
            if (r4 >= r3) goto L29
            java.lang.Object r5 = r1.get(r4)
            o.WindowInsetsCompat$Impl r5 = (o.WindowInsetsCompat$Impl) r5
            if (r5 != 0) goto L22
            return r2
        L22:
            android.view.View r5 = r5.setX
            if (r5 == r7) goto L2a
            int r4 = r4 + 1
            goto L17
        L29:
            r4 = -1
        L2a:
            if (r4 < 0) goto L3a
            if (r8 == 0) goto L31
            java.util.ArrayList<o.WindowInsetsCompat$Impl> r7 = r0.setTextAlignment
            goto L33
        L31:
            java.util.ArrayList<o.WindowInsetsCompat$Impl> r7 = r0.setChipIconTintResource
        L33:
            java.lang.Object r7 = r7.get(r4)
            r2 = r7
            o.WindowInsetsCompat$Impl r2 = (o.WindowInsetsCompat$Impl) r2
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRendererPriorityPolicy.MenuHostHelper$$ExternalSyntheticLambda1(android.view.View, boolean):o.WindowInsetsCompat$Impl");
    }

    public void setIconTintList(View view) {
        if (this.setOnNavigationItemSelectedListener) {
            return;
        }
        setFabAnchorMode<Animator, setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0> chipCornerRadius = setChipCornerRadius();
        int size = chipCornerRadius.size();
        setActivated y = setScrollBarFadeDuration.setY(view);
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            int i = size << 1;
            setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0 setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0 = (setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0) chipCornerRadius.setX[i + 1];
            if (setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 != null && y.equals(setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0)) {
                ((Animator) chipCornerRadius.setX[i]).pause();
            }
        }
        ArrayList<setIconTintList> arrayList = this.setMaxEms;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.setMaxEms.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((setIconTintList) arrayList2.get(i2)).MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }
        this.setLayoutDirection = true;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        if (this.setLayoutDirection) {
            if (!this.setOnNavigationItemSelectedListener) {
                setFabAnchorMode<Animator, setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0> chipCornerRadius = setChipCornerRadius();
                int size = chipCornerRadius.size();
                setActivated y = setScrollBarFadeDuration.setY(view);
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    int i = size << 1;
                    setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0 setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0 = (setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0) chipCornerRadius.setX[i + 1];
                    if (setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 != null && y.equals(setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0)) {
                        ((Animator) chipCornerRadius.setX[i]).resume();
                    }
                }
                ArrayList<setIconTintList> arrayList = this.setMaxEms;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.setMaxEms.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((setIconTintList) arrayList2.get(i2)).setIconTintList();
                    }
                }
            }
            this.setLayoutDirection = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(ViewGroup viewGroup) {
        setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0 setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0;
        WindowInsetsCompat$Impl windowInsetsCompat$Impl;
        View view;
        View view2;
        this.setChipIconTintResource = new ArrayList<>();
        this.setTextAlignment = new ArrayList<>();
        setSpannableFactory setspannablefactory = this.SearchView$SavedState$1;
        setSpannableFactory setspannablefactory2 = this.setChipCornerRadius;
        setFabAnchorMode setfabanchormode = new setFabAnchorMode(setspannablefactory.setY);
        setFabAnchorMode setfabanchormode2 = new setFabAnchorMode(setspannablefactory2.setY);
        int i = 0;
        while (true) {
            int[] iArr = this.setTextScaleX;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                for (int size = setfabanchormode.size() - 1; size >= 0; size--) {
                    View view3 = (View) setfabanchormode.setX[size << 1];
                    if (view3 != null && setY(view3) && (windowInsetsCompat$Impl = (WindowInsetsCompat$Impl) setfabanchormode2.remove(view3)) != null && setY(windowInsetsCompat$Impl.setX)) {
                        this.setChipIconTintResource.add((WindowInsetsCompat$Impl) setfabanchormode.setIconTintList(size));
                        this.setTextAlignment.add(windowInsetsCompat$Impl);
                    }
                }
            } else if (i2 == 2) {
                setFabAnchorMode<String, View> setfabanchormode3 = setspannablefactory.setIconTintList;
                setFabAnchorMode<String, View> setfabanchormode4 = setspannablefactory2.setIconTintList;
                int size2 = setfabanchormode3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = i3 << 1;
                    View view4 = (View) setfabanchormode3.setX[i4 + 1];
                    if (view4 != null && setY(view4) && (view = setfabanchormode4.get(setfabanchormode3.setX[i4])) != null && setY(view)) {
                        WindowInsetsCompat$Impl windowInsetsCompat$Impl2 = (WindowInsetsCompat$Impl) setfabanchormode.get(view4);
                        WindowInsetsCompat$Impl windowInsetsCompat$Impl3 = (WindowInsetsCompat$Impl) setfabanchormode2.get(view);
                        if (windowInsetsCompat$Impl2 != null && windowInsetsCompat$Impl3 != null) {
                            this.setChipIconTintResource.add(windowInsetsCompat$Impl2);
                            this.setTextAlignment.add(windowInsetsCompat$Impl3);
                            setfabanchormode.remove(view4);
                            setfabanchormode2.remove(view);
                        }
                    }
                }
            } else if (i2 == 3) {
                SparseArray<View> sparseArray = setspannablefactory.MenuHostHelper$$ExternalSyntheticLambda0;
                SparseArray<View> sparseArray2 = setspannablefactory2.MenuHostHelper$$ExternalSyntheticLambda0;
                int size3 = sparseArray.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    View valueAt = sparseArray.valueAt(i5);
                    if (valueAt != null && setY(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i5))) != null && setY(view2)) {
                        WindowInsetsCompat$Impl windowInsetsCompat$Impl4 = (WindowInsetsCompat$Impl) setfabanchormode.get(valueAt);
                        WindowInsetsCompat$Impl windowInsetsCompat$Impl5 = (WindowInsetsCompat$Impl) setfabanchormode2.get(view2);
                        if (windowInsetsCompat$Impl4 != null && windowInsetsCompat$Impl5 != null) {
                            this.setChipIconTintResource.add(windowInsetsCompat$Impl4);
                            this.setTextAlignment.add(windowInsetsCompat$Impl5);
                            setfabanchormode.remove(valueAt);
                            setfabanchormode2.remove(view2);
                        }
                    }
                }
            } else if (i2 == 4) {
                setPrefixTextAppearance<View> setprefixtextappearance = setspannablefactory.setX;
                setPrefixTextAppearance<View> setprefixtextappearance2 = setspannablefactory2.setX;
                if (setprefixtextappearance.setIconTintList) {
                    setprefixtextappearance.setIconTintList();
                }
                int i6 = setprefixtextappearance.setX;
                for (int i7 = 0; i7 < i6; i7++) {
                    if (setprefixtextappearance.setIconTintList) {
                        setprefixtextappearance.setIconTintList();
                    }
                    View view5 = (View) setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda1[i7];
                    if (view5 != null && setY(view5)) {
                        if (setprefixtextappearance.setIconTintList) {
                            setprefixtextappearance.setIconTintList();
                        }
                        View MenuHostHelper$$ExternalSyntheticLambda0 = setprefixtextappearance2.MenuHostHelper$$ExternalSyntheticLambda0(setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0[i7], null);
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != null && setY(MenuHostHelper$$ExternalSyntheticLambda0)) {
                            WindowInsetsCompat$Impl windowInsetsCompat$Impl6 = (WindowInsetsCompat$Impl) setfabanchormode.get(view5);
                            WindowInsetsCompat$Impl windowInsetsCompat$Impl7 = (WindowInsetsCompat$Impl) setfabanchormode2.get(MenuHostHelper$$ExternalSyntheticLambda0);
                            if (windowInsetsCompat$Impl6 != null && windowInsetsCompat$Impl7 != null) {
                                this.setChipIconTintResource.add(windowInsetsCompat$Impl6);
                                this.setTextAlignment.add(windowInsetsCompat$Impl7);
                                setfabanchormode.remove(view5);
                                setfabanchormode2.remove(MenuHostHelper$$ExternalSyntheticLambda0);
                            }
                        }
                    }
                }
            }
            i++;
        }
        for (int i8 = 0; i8 < setfabanchormode.size(); i8++) {
            WindowInsetsCompat$Impl windowInsetsCompat$Impl8 = (WindowInsetsCompat$Impl) setfabanchormode.setX[(i8 << 1) + 1];
            if (setY(windowInsetsCompat$Impl8.setX)) {
                this.setChipIconTintResource.add(windowInsetsCompat$Impl8);
                this.setTextAlignment.add(null);
            }
        }
        for (int i9 = 0; i9 < setfabanchormode2.size(); i9++) {
            WindowInsetsCompat$Impl windowInsetsCompat$Impl9 = (WindowInsetsCompat$Impl) setfabanchormode2.setX[(i9 << 1) + 1];
            if (setY(windowInsetsCompat$Impl9.setX)) {
                this.setTextAlignment.add(windowInsetsCompat$Impl9);
                this.setChipIconTintResource.add(null);
            }
        }
        setFabAnchorMode<Animator, setRendererPriorityPolicy$MenuHostHelper$$ExternalSyntheticLambda0> chipCornerRadius = setChipCornerRadius();
        int size4 = chipCornerRadius.size();
        setActivated y = setScrollBarFadeDuration.setY(viewGroup);
        while (true) {
            size4--;
            if (size4 >= 0) {
                Animator animator = (Animator) chipCornerRadius.setX[size4 << 1];
                if (animator != null && (setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0 = chipCornerRadius.get(animator)) != null && setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 != null && y.equals(setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0)) {
                    WindowInsetsCompat$Impl windowInsetsCompat$Impl10 = setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.setIconTintList;
                    View view6 = setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                    WindowInsetsCompat$Impl x = setX(view6, true);
                    WindowInsetsCompat$Impl MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(view6, true);
                    if (x == null && MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                        MenuHostHelper$$ExternalSyntheticLambda1 = this.setChipCornerRadius.setY.get(view6);
                    }
                    if (!(x == null && MenuHostHelper$$ExternalSyntheticLambda1 == null) && setrendererprioritypolicy_menuhosthelper__externalsyntheticlambda0.setX.setIconTintList(windowInsetsCompat$Impl10, MenuHostHelper$$ExternalSyntheticLambda1)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            chipCornerRadius.remove(animator);
                        }
                    }
                }
            } else {
                setY(viewGroup, this.SearchView$SavedState$1, this.setChipCornerRadius, this.setChipIconTintResource, this.setTextAlignment);
                setUnboundedRipple();
                return;
            }
        }
    }

    public boolean setIconTintList(WindowInsetsCompat$Impl windowInsetsCompat$Impl, WindowInsetsCompat$Impl windowInsetsCompat$Impl2) {
        if (windowInsetsCompat$Impl == null || windowInsetsCompat$Impl2 == null) {
            return false;
        }
        String[] iconTintList = setIconTintList();
        if (iconTintList != null) {
            for (String str : iconTintList) {
                if (!setY(windowInsetsCompat$Impl, windowInsetsCompat$Impl2, str)) {
                }
            }
            return false;
        }
        for (String str2 : windowInsetsCompat$Impl.setY.keySet()) {
            if (setY(windowInsetsCompat$Impl, windowInsetsCompat$Impl2, str2)) {
            }
        }
        return false;
        return true;
    }

    private static boolean setY(WindowInsetsCompat$Impl windowInsetsCompat$Impl, WindowInsetsCompat$Impl windowInsetsCompat$Impl2, String str) {
        Object obj = windowInsetsCompat$Impl.setY.get(str);
        Object obj2 = windowInsetsCompat$Impl2.setY.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOnLongClickListener() {
        if (this.setCheckedIconEnabled == 0) {
            ArrayList<setIconTintList> arrayList = this.setMaxEms;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.setMaxEms.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((setIconTintList) arrayList2.get(i)).MenuHostHelper$$ExternalSyntheticLambda1();
                }
            }
            this.setOnNavigationItemSelectedListener = false;
        }
        this.setCheckedIconEnabled++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setX() {
        int i = this.setCheckedIconEnabled - 1;
        this.setCheckedIconEnabled = i;
        if (i != 0) {
            return;
        }
        ArrayList<setIconTintList> arrayList = this.setMaxEms;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.setMaxEms.clone();
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((setIconTintList) arrayList2.get(i2)).MenuHostHelper$$ExternalSyntheticLambda0(this);
            }
        }
        int i3 = 0;
        while (true) {
            setPrefixTextAppearance<View> setprefixtextappearance = this.SearchView$SavedState$1.setX;
            if (setprefixtextappearance.setIconTintList) {
                setprefixtextappearance.setIconTintList();
            }
            if (i3 >= setprefixtextappearance.setX) {
                break;
            }
            setPrefixTextAppearance<View> setprefixtextappearance2 = this.SearchView$SavedState$1.setX;
            if (setprefixtextappearance2.setIconTintList) {
                setprefixtextappearance2.setIconTintList();
            }
            View view = (View) setprefixtextappearance2.MenuHostHelper$$ExternalSyntheticLambda1[i3];
            if (view != null) {
                setBaselineAlignBottom.setY(view, false);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            setPrefixTextAppearance<View> setprefixtextappearance3 = this.setChipCornerRadius.setX;
            if (setprefixtextappearance3.setIconTintList) {
                setprefixtextappearance3.setIconTintList();
            }
            if (i4 < setprefixtextappearance3.setX) {
                setPrefixTextAppearance<View> setprefixtextappearance4 = this.setChipCornerRadius.setX;
                if (setprefixtextappearance4.setIconTintList) {
                    setprefixtextappearance4.setIconTintList();
                }
                View view2 = (View) setprefixtextappearance4.MenuHostHelper$$ExternalSyntheticLambda1[i4];
                if (view2 != null) {
                    setBaselineAlignBottom.setY(view2, false);
                }
                i4++;
            } else {
                this.setOnNavigationItemSelectedListener = true;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        for (int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1; size >= 0; size--) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.get(size).cancel();
        }
        ArrayList<setIconTintList> arrayList = this.setMaxEms;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.setMaxEms.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((setIconTintList) arrayList2.get(i)).setX();
        }
    }

    public setRendererPriorityPolicy setY(setIconTintList seticontintlist) {
        if (this.setMaxEms == null) {
            this.setMaxEms = new ArrayList<>();
        }
        this.setMaxEms.add(seticontintlist);
        return this;
    }

    public setRendererPriorityPolicy MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList seticontintlist) {
        ArrayList<setIconTintList> arrayList = this.setMaxEms;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(seticontintlist);
        if (this.setMaxEms.size() == 0) {
            this.setMaxEms = null;
        }
        return this;
    }

    public void setIconTintList(setSaveEnabled setsaveenabled) {
        if (setsaveenabled == null) {
            this.setTextAppearanceResource = setCenterIfNoTextEnabled;
        } else {
            this.setTextAppearanceResource = setsaveenabled;
        }
    }

    public final setSaveEnabled setNavigationOnClickListener() {
        return this.setTextAppearanceResource;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(setY sety) {
        this.setAnimationFromJson = sety;
    }

    public final setY setY() {
        return this.setAnimationFromJson;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(setActiveIndicatorWidth setactiveindicatorwidth) {
        this.setX = setactiveindicatorwidth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        String[] iconTintList;
        if (this.setX == null || windowInsetsCompat$Impl.setY.isEmpty() || (iconTintList = this.setX.setIconTintList()) == null) {
            return;
        }
        for (int i = 0; i < iconTintList.length && windowInsetsCompat$Impl.setY.containsKey(iconTintList[i]); i++) {
        }
    }

    public String toString() {
        return setY("");
    }

    @Override // 
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public setRendererPriorityPolicy clone() {
        try {
            setRendererPriorityPolicy setrendererprioritypolicy = (setRendererPriorityPolicy) super.clone();
            setrendererprioritypolicy.setIconSize = new ArrayList<>();
            setrendererprioritypolicy.SearchView$SavedState$1 = new setSpannableFactory();
            setrendererprioritypolicy.setChipCornerRadius = new setSpannableFactory();
            setrendererprioritypolicy.setChipIconTintResource = null;
            setrendererprioritypolicy.setTextAlignment = null;
            return setrendererprioritypolicy;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String setY(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String obj = sb.toString();
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("dur(");
            sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb2.append(") ");
            obj = sb2.toString();
        }
        if (this.setIconified != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("dly(");
            sb3.append(this.setIconified);
            sb3.append(") ");
            obj = sb3.toString();
        }
        if (this.setZ != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("interp(");
            sb4.append(this.setZ);
            sb4.append(") ");
            obj = sb4.toString();
        }
        if (this.setOnLongClickListener.size() > 0 || this.setLayoutAnimation.size() > 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(obj);
            sb5.append("tgts(");
            String obj2 = sb5.toString();
            if (this.setOnLongClickListener.size() > 0) {
                for (int i = 0; i < this.setOnLongClickListener.size(); i++) {
                    if (i > 0) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(obj2);
                        sb6.append(", ");
                        obj2 = sb6.toString();
                    }
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(obj2);
                    sb7.append(this.setOnLongClickListener.get(i));
                    obj2 = sb7.toString();
                }
            }
            if (this.setLayoutAnimation.size() > 0) {
                for (int i2 = 0; i2 < this.setLayoutAnimation.size(); i2++) {
                    if (i2 > 0) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(obj2);
                        sb8.append(", ");
                        obj2 = sb8.toString();
                    }
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(obj2);
                    sb9.append(this.setLayoutAnimation.get(i2));
                    obj2 = sb9.toString();
                }
            }
            StringBuilder sb10 = new StringBuilder();
            sb10.append(obj2);
            sb10.append(")");
            return sb10.toString();
        }
        return obj;
    }
}