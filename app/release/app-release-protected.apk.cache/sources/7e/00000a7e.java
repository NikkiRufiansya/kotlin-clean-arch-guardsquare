package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public final class setCompatHoveredFocusedTranslationZResource extends setHighlightColor {
    private static TimeInterpolator setCenterIfNoTextEnabled;
    private ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> setTextScaleX = new ArrayList<>();
    private ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> setTextAlignment = new ArrayList<>();
    private ArrayList<setX> ViewPager$SavedState$1 = new ArrayList<>();
    private ArrayList<setIconTintList> setChipCornerRadius = new ArrayList<>();
    ArrayList<ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled>> setY = new ArrayList<>();
    ArrayList<ArrayList<setX>> setNavigationOnClickListener = new ArrayList<>();
    ArrayList<ArrayList<setIconTintList>> MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
    ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
    ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> setIconTintList = new ArrayList<>();
    ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> setUnboundedRipple = new ArrayList<>();
    ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> setX = new ArrayList<>();

    /* loaded from: classes.dex */
    static class setX {
        public int MenuHostHelper$$ExternalSyntheticLambda0;
        public int MenuHostHelper$$ExternalSyntheticLambda1;
        public int setIconTintList;
        public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setX;
        public int setY;

        setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, int i, int i2, int i3, int i4) {
            this.setX = setcheckediconenabled;
            this.setIconTintList = i;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
            this.setY = i3;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled MenuHostHelper$$ExternalSyntheticLambda0;
        public int MenuHostHelper$$ExternalSyntheticLambda1;
        public int setIconTintList;
        public int setUnboundedRipple;
        public int setX;
        public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setY;

        private setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2) {
            this.setY = setcheckediconenabled;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setcheckediconenabled2;
        }

        setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2, int i, int i2, int i3, int i4) {
            this(setcheckediconenabled, setcheckediconenabled2);
            this.setX = i;
            this.setIconTintList = i2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
            this.setUnboundedRipple = i4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.setY);
            sb.append(", newHolder=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append(", fromX=");
            sb.append(this.setX);
            sb.append(", fromY=");
            sb.append(this.setIconTintList);
            sb.append(", toX=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append(", toY=");
            sb.append(this.setUnboundedRipple);
            sb.append('}');
            return sb.toString();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        boolean z = !this.setTextScaleX.isEmpty();
        boolean z2 = !this.ViewPager$SavedState$1.isEmpty();
        boolean z3 = !this.setChipCornerRadius.isEmpty();
        boolean z4 = !this.setTextAlignment.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> it = this.setTextScaleX.iterator();
            while (it.hasNext()) {
                final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled next = it.next();
                final View view = next.setIconTintList;
                final ViewPropertyAnimator animate = view.animate();
                this.setUnboundedRipple.add(next);
                animate.setDuration(setIconTintList()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: o.setCompatHoveredFocusedTranslationZResource.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource = setCompatHoveredFocusedTranslationZResource.this;
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = next;
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx = setcompathoveredfocusedtranslationzresource.setUiOptions;
                        if (setx != null) {
                            setx.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
                        }
                        setCompatHoveredFocusedTranslationZResource.this.setUnboundedRipple.remove(next);
                        setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource2 = setCompatHoveredFocusedTranslationZResource.this;
                        if (setcompathoveredfocusedtranslationzresource2.setY()) {
                            return;
                        }
                        setcompathoveredfocusedtranslationzresource2.MenuHostHelper$$ExternalSyntheticLambda1();
                    }
                }).start();
            }
            this.setTextScaleX.clear();
            if (z2) {
                final ArrayList<setX> arrayList = new ArrayList<>();
                arrayList.addAll(this.ViewPager$SavedState$1);
                this.setNavigationOnClickListener.add(arrayList);
                this.ViewPager$SavedState$1.clear();
                Runnable runnable = new Runnable() { // from class: o.setCompatHoveredFocusedTranslationZResource.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            setX setx = (setX) it2.next();
                            final setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource = setCompatHoveredFocusedTranslationZResource.this;
                            final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = setx.setX;
                            int i = setx.setIconTintList;
                            int i2 = setx.MenuHostHelper$$ExternalSyntheticLambda0;
                            int i3 = setx.setY;
                            int i4 = setx.MenuHostHelper$$ExternalSyntheticLambda1;
                            final View view2 = setcheckediconenabled.setIconTintList;
                            final int i5 = i3 - i;
                            final int i6 = i4 - i2;
                            if (i5 != 0) {
                                view2.animate().translationX(0.0f);
                            }
                            if (i6 != 0) {
                                view2.animate().translationY(0.0f);
                            }
                            final ViewPropertyAnimator animate2 = view2.animate();
                            setcompathoveredfocusedtranslationzresource.setIconTintList.add(setcheckediconenabled);
                            animate2.setDuration(setcompathoveredfocusedtranslationzresource.setIconSize).setListener(new AnimatorListenerAdapter() { // from class: o.setCompatHoveredFocusedTranslationZResource.10
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                    if (i5 != 0) {
                                        view2.setTranslationX(0.0f);
                                    }
                                    if (i6 != 0) {
                                        view2.setTranslationY(0.0f);
                                    }
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    animate2.setListener(null);
                                    setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource2 = setCompatHoveredFocusedTranslationZResource.this;
                                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = setcheckediconenabled;
                                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx2 = setcompathoveredfocusedtranslationzresource2.setUiOptions;
                                    if (setx2 != null) {
                                        setx2.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled2);
                                    }
                                    setCompatHoveredFocusedTranslationZResource.this.setIconTintList.remove(setcheckediconenabled);
                                    setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource3 = setCompatHoveredFocusedTranslationZResource.this;
                                    if (setcompathoveredfocusedtranslationzresource3.setY()) {
                                        return;
                                    }
                                    setcompathoveredfocusedtranslationzresource3.MenuHostHelper$$ExternalSyntheticLambda1();
                                }
                            }).start();
                        }
                        arrayList.clear();
                        setCompatHoveredFocusedTranslationZResource.this.setNavigationOnClickListener.remove(arrayList);
                    }
                };
                if (z) {
                    setBaselineAlignBottom.setY(arrayList.get(0).setX.setIconTintList, runnable, setIconTintList());
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final ArrayList<setIconTintList> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.setChipCornerRadius);
                this.MenuHostHelper$$ExternalSyntheticLambda0.add(arrayList2);
                this.setChipCornerRadius.clear();
                Runnable runnable2 = new Runnable() { // from class: o.setCompatHoveredFocusedTranslationZResource.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            final setIconTintList seticontintlist = (setIconTintList) it2.next();
                            final setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource = setCompatHoveredFocusedTranslationZResource.this;
                            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = seticontintlist.setY;
                            final View view2 = setcheckediconenabled == null ? null : setcheckediconenabled.setIconTintList;
                            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
                            final View view3 = setcheckediconenabled2 != null ? setcheckediconenabled2.setIconTintList : null;
                            if (view2 != null) {
                                final ViewPropertyAnimator duration = view2.animate().setDuration(setcompathoveredfocusedtranslationzresource.setOnLongClickListener);
                                setcompathoveredfocusedtranslationzresource.setX.add(seticontintlist.setY);
                                duration.translationX(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 - seticontintlist.setX);
                                duration.translationY(seticontintlist.setUnboundedRipple - seticontintlist.setIconTintList);
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: o.setCompatHoveredFocusedTranslationZResource.7
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled3 = seticontintlist.setY;
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        duration.setListener(null);
                                        view2.setAlpha(1.0f);
                                        view2.setTranslationX(0.0f);
                                        view2.setTranslationY(0.0f);
                                        setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource2 = setCompatHoveredFocusedTranslationZResource.this;
                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled3 = seticontintlist.setY;
                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx = setcompathoveredfocusedtranslationzresource2.setUiOptions;
                                        if (setx != null) {
                                            setx.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled3);
                                        }
                                        setCompatHoveredFocusedTranslationZResource.this.setX.remove(seticontintlist.setY);
                                        setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource3 = setCompatHoveredFocusedTranslationZResource.this;
                                        if (setcompathoveredfocusedtranslationzresource3.setY()) {
                                            return;
                                        }
                                        setcompathoveredfocusedtranslationzresource3.MenuHostHelper$$ExternalSyntheticLambda1();
                                    }
                                }).start();
                            }
                            if (view3 != null) {
                                final ViewPropertyAnimator animate2 = view3.animate();
                                setcompathoveredfocusedtranslationzresource.setX.add(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0);
                                animate2.translationX(0.0f).translationY(0.0f).setDuration(setcompathoveredfocusedtranslationzresource.setOnLongClickListener).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: o.setCompatHoveredFocusedTranslationZResource.6
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationStart(Animator animator) {
                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled3 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
                                    }

                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        animate2.setListener(null);
                                        view3.setAlpha(1.0f);
                                        view3.setTranslationX(0.0f);
                                        view3.setTranslationY(0.0f);
                                        setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource2 = setCompatHoveredFocusedTranslationZResource.this;
                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled3 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx = setcompathoveredfocusedtranslationzresource2.setUiOptions;
                                        if (setx != null) {
                                            setx.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled3);
                                        }
                                        setCompatHoveredFocusedTranslationZResource.this.setX.remove(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0);
                                        setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource3 = setCompatHoveredFocusedTranslationZResource.this;
                                        if (setcompathoveredfocusedtranslationzresource3.setY()) {
                                            return;
                                        }
                                        setcompathoveredfocusedtranslationzresource3.MenuHostHelper$$ExternalSyntheticLambda1();
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        setCompatHoveredFocusedTranslationZResource.this.MenuHostHelper$$ExternalSyntheticLambda0.remove(arrayList2);
                    }
                };
                if (z) {
                    setBaselineAlignBottom.setY(arrayList2.get(0).setY.setIconTintList, runnable2, setIconTintList());
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.setTextAlignment);
                this.setY.add(arrayList3);
                this.setTextAlignment.clear();
                Runnable runnable3 = new Runnable() { // from class: o.setCompatHoveredFocusedTranslationZResource.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled) it2.next();
                            final setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource = setCompatHoveredFocusedTranslationZResource.this;
                            final View view2 = setcheckediconenabled.setIconTintList;
                            final ViewPropertyAnimator animate2 = view2.animate();
                            setcompathoveredfocusedtranslationzresource.MenuHostHelper$$ExternalSyntheticLambda1.add(setcheckediconenabled);
                            animate2.alpha(1.0f).setDuration(setcompathoveredfocusedtranslationzresource.setLayoutAnimation).setListener(new AnimatorListenerAdapter() { // from class: o.setCompatHoveredFocusedTranslationZResource.2
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                    view2.setAlpha(1.0f);
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    animate2.setListener(null);
                                    setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource2 = setCompatHoveredFocusedTranslationZResource.this;
                                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = setcheckediconenabled;
                                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx = setcompathoveredfocusedtranslationzresource2.setUiOptions;
                                    if (setx != null) {
                                        setx.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled2);
                                    }
                                    setCompatHoveredFocusedTranslationZResource.this.MenuHostHelper$$ExternalSyntheticLambda1.remove(setcheckediconenabled);
                                    setCompatHoveredFocusedTranslationZResource setcompathoveredfocusedtranslationzresource3 = setCompatHoveredFocusedTranslationZResource.this;
                                    if (setcompathoveredfocusedtranslationzresource3.setY()) {
                                        return;
                                    }
                                    setcompathoveredfocusedtranslationzresource3.MenuHostHelper$$ExternalSyntheticLambda1();
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        setCompatHoveredFocusedTranslationZResource.this.setY.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    setBaselineAlignBottom.setY(arrayList3.get(0).setIconTintList, runnable3, (z ? setIconTintList() : 0L) + Math.max(z2 ? this.setIconSize : 0L, z3 ? this.setOnLongClickListener : 0L));
                    return;
                }
                runnable3.run();
            }
        }
    }

    @Override // o.setHighlightColor
    public final boolean setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled) {
        setLayoutAnimation(setcheckediconenabled);
        this.setTextScaleX.add(setcheckediconenabled);
        return true;
    }

    @Override // o.setHighlightColor
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled) {
        setLayoutAnimation(setcheckediconenabled);
        setcheckediconenabled.setIconTintList.setAlpha(0.0f);
        this.setTextAlignment.add(setcheckediconenabled);
        return true;
    }

    @Override // o.setHighlightColor
    public final boolean setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, int i, int i2, int i3, int i4) {
        View view = setcheckediconenabled.setIconTintList;
        int translationX = i + ((int) setcheckediconenabled.setIconTintList.getTranslationX());
        int translationY = i2 + ((int) setcheckediconenabled.setIconTintList.getTranslationY());
        setLayoutAnimation(setcheckediconenabled);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            this.ViewPager$SavedState$1.add(new setX(setcheckediconenabled, translationX, translationY, i3, i4));
            return true;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx = this.setUiOptions;
        if (setx != null) {
            setx.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
            return false;
        }
        return false;
    }

    @Override // o.setHighlightColor
    public final boolean setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2, int i, int i2, int i3, int i4) {
        if (setcheckediconenabled == setcheckediconenabled2) {
            return setY(setcheckediconenabled, i, i2, i3, i4);
        }
        float translationX = setcheckediconenabled.setIconTintList.getTranslationX();
        float translationY = setcheckediconenabled.setIconTintList.getTranslationY();
        float alpha = setcheckediconenabled.setIconTintList.getAlpha();
        setLayoutAnimation(setcheckediconenabled);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        setcheckediconenabled.setIconTintList.setTranslationX(translationX);
        setcheckediconenabled.setIconTintList.setTranslationY(translationY);
        setcheckediconenabled.setIconTintList.setAlpha(alpha);
        if (setcheckediconenabled2 != null) {
            setLayoutAnimation(setcheckediconenabled2);
            setcheckediconenabled2.setIconTintList.setTranslationX(-i5);
            setcheckediconenabled2.setIconTintList.setTranslationY(-i6);
            setcheckediconenabled2.setIconTintList.setAlpha(0.0f);
        }
        this.setChipCornerRadius.add(new setIconTintList(setcheckediconenabled, setcheckediconenabled2, i, i2, i3, i4));
        return true;
    }

    private void setY(List<setIconTintList> list, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled) {
        for (int size = list.size() - 1; size >= 0; size--) {
            setIconTintList seticontintlist = list.get(size);
            if (setY(seticontintlist, setcheckediconenabled) && seticontintlist.setY == null && seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                list.remove(seticontintlist);
            }
        }
    }

    private void setIconTintList(setIconTintList seticontintlist) {
        if (seticontintlist.setY != null) {
            setY(seticontintlist, seticontintlist.setY);
        }
        if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            setY(seticontintlist, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    private boolean setY(setIconTintList seticontintlist, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled) {
        if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 == setcheckediconenabled) {
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        } else if (seticontintlist.setY != setcheckediconenabled) {
            return false;
        } else {
            seticontintlist.setY = null;
        }
        setcheckediconenabled.setIconTintList.setAlpha(1.0f);
        setcheckediconenabled.setIconTintList.setTranslationX(0.0f);
        setcheckediconenabled.setIconTintList.setTranslationY(0.0f);
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx = this.setUiOptions;
        if (setx != null) {
            setx.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
            return true;
        }
        return true;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled) {
        View view = setcheckediconenabled.setIconTintList;
        view.animate().cancel();
        int size = this.ViewPager$SavedState$1.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.ViewPager$SavedState$1.get(size).setX == setcheckediconenabled) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx = this.setUiOptions;
                if (setx != null) {
                    setx.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
                }
                this.ViewPager$SavedState$1.remove(size);
            }
        }
        setY(this.setChipCornerRadius, setcheckediconenabled);
        if (this.setTextScaleX.remove(setcheckediconenabled)) {
            view.setAlpha(1.0f);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx2 = this.setUiOptions;
            if (setx2 != null) {
                setx2.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
            }
        }
        if (this.setTextAlignment.remove(setcheckediconenabled)) {
            view.setAlpha(1.0f);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx3 = this.setUiOptions;
            if (setx3 != null) {
                setx3.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
            }
        }
        for (int size2 = this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1; size2 >= 0; size2--) {
            ArrayList<setIconTintList> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda0.get(size2);
            setY(arrayList, setcheckediconenabled);
            if (arrayList.isEmpty()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.remove(size2);
            }
        }
        for (int size3 = this.setNavigationOnClickListener.size() - 1; size3 >= 0; size3--) {
            ArrayList<setX> arrayList2 = this.setNavigationOnClickListener.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).setX == setcheckediconenabled) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx4 = this.setUiOptions;
                    if (setx4 != null) {
                        setx4.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
                    }
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.setNavigationOnClickListener.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.setY.size() - 1; size5 >= 0; size5--) {
            ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> arrayList3 = this.setY.get(size5);
            if (arrayList3.remove(setcheckediconenabled)) {
                view.setAlpha(1.0f);
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx5 = this.setUiOptions;
                if (setx5 != null) {
                    setx5.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
                }
                if (arrayList3.isEmpty()) {
                    this.setY.remove(size5);
                }
            }
        }
        this.setUnboundedRipple.remove(setcheckediconenabled);
        this.MenuHostHelper$$ExternalSyntheticLambda1.remove(setcheckediconenabled);
        this.setX.remove(setcheckediconenabled);
        this.setIconTintList.remove(setcheckediconenabled);
        if (setY()) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private void setLayoutAnimation(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled) {
        if (setCenterIfNoTextEnabled == null) {
            setCenterIfNoTextEnabled = new ValueAnimator().getInterpolator();
        }
        setcheckediconenabled.setIconTintList.animate().setInterpolator(setCenterIfNoTextEnabled);
        setX(setcheckediconenabled);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final boolean setY() {
        return (this.setTextAlignment.isEmpty() && this.setChipCornerRadius.isEmpty() && this.ViewPager$SavedState$1.isEmpty() && this.setTextScaleX.isEmpty() && this.setIconTintList.isEmpty() && this.setUnboundedRipple.isEmpty() && this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty() && this.setX.isEmpty() && this.setNavigationOnClickListener.isEmpty() && this.setY.isEmpty() && this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) ? false : true;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final void setX() {
        int size = this.ViewPager$SavedState$1.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            setX setx = this.ViewPager$SavedState$1.get(size);
            View view = setx.setX.setIconTintList;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = setx.setX;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx2 = this.setUiOptions;
            if (setx2 != null) {
                setx2.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled);
            }
            this.ViewPager$SavedState$1.remove(size);
        }
        for (int size2 = this.setTextScaleX.size() - 1; size2 >= 0; size2--) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = this.setTextScaleX.get(size2);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx3 = this.setUiOptions;
            if (setx3 != null) {
                setx3.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled2);
            }
            this.setTextScaleX.remove(size2);
        }
        int size3 = this.setTextAlignment.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled3 = this.setTextAlignment.get(size3);
            setcheckediconenabled3.setIconTintList.setAlpha(1.0f);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx4 = this.setUiOptions;
            if (setx4 != null) {
                setx4.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled3);
            }
            this.setTextAlignment.remove(size3);
        }
        for (int size4 = this.setChipCornerRadius.size() - 1; size4 >= 0; size4--) {
            setIconTintList(this.setChipCornerRadius.get(size4));
        }
        this.setChipCornerRadius.clear();
        if (setY()) {
            for (int size5 = this.setNavigationOnClickListener.size() - 1; size5 >= 0; size5--) {
                ArrayList<setX> arrayList = this.setNavigationOnClickListener.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    setX setx5 = arrayList.get(size6);
                    View view2 = setx5.setX.setIconTintList;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled4 = setx5.setX;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx6 = this.setUiOptions;
                    if (setx6 != null) {
                        setx6.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled4);
                    }
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.setNavigationOnClickListener.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.setY.size() - 1; size7 >= 0; size7--) {
                ArrayList<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> arrayList2 = this.setY.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled5 = arrayList2.get(size8);
                    setcheckediconenabled5.setIconTintList.setAlpha(1.0f);
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener.setX setx7 = this.setUiOptions;
                    if (setx7 != null) {
                        setx7.MenuHostHelper$$ExternalSyntheticLambda0(setcheckediconenabled5);
                    }
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.setY.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1; size9 >= 0; size9--) {
                ArrayList<setIconTintList> arrayList3 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    setIconTintList(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.MenuHostHelper$$ExternalSyntheticLambda0.remove(arrayList3);
                    }
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1(this.setUnboundedRipple);
            MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList);
            MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1);
            MenuHostHelper$$ExternalSyntheticLambda1(this.setX);
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(List<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).setIconTintList.animate().cancel();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener
    public final boolean setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled, List<Object> list) {
        return !list.isEmpty() || super.setX(setcheckediconenabled, list);
    }
}