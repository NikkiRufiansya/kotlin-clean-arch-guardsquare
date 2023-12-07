package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.setRendererPriorityPolicy;

/* loaded from: classes.dex */
public abstract class setPrefixText extends setRendererPriorityPolicy {
    private static final String[] setUiOptions = {"android:visibility:visibility", "android:visibility:parent"};
    private int setCenterIfNoTextEnabled;

    public Animator setIconTintList(View view, WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        return null;
    }

    public Animator setX(View view, WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        return null;
    }

    public setPrefixText() {
        this.setCenterIfNoTextEnabled = 3;
    }

    public setPrefixText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setCenterIfNoTextEnabled = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setChipBackgroundColor.MenuHostHelper$$ExternalSyntheticLambda0);
        int x = setHandwritingBoundsOffsets.setX(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (x != 0) {
            if ((x & (-4)) != 0) {
                throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
            }
            this.setCenterIfNoTextEnabled = x;
        }
    }

    public final void setX(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.setCenterIfNoTextEnabled = i;
    }

    public final int setCenterIfNoTextEnabled() {
        return this.setCenterIfNoTextEnabled;
    }

    @Override // o.setRendererPriorityPolicy
    public final String[] setIconTintList() {
        return setUiOptions;
    }

    private static void setY(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        windowInsetsCompat$Impl.setY.put("android:visibility:visibility", Integer.valueOf(windowInsetsCompat$Impl.setX.getVisibility()));
        windowInsetsCompat$Impl.setY.put("android:visibility:parent", windowInsetsCompat$Impl.setX.getParent());
        int[] iArr = new int[2];
        windowInsetsCompat$Impl.setX.getLocationOnScreen(iArr);
        windowInsetsCompat$Impl.setY.put("android:visibility:screenLocation", iArr);
    }

    @Override // o.setRendererPriorityPolicy
    public void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        setY(windowInsetsCompat$Impl);
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        setY(windowInsetsCompat$Impl);
    }

    private static setPrefixText$MenuHostHelper$$ExternalSyntheticLambda0 setY(WindowInsetsCompat$Impl windowInsetsCompat$Impl, WindowInsetsCompat$Impl windowInsetsCompat$Impl2) {
        setPrefixText$MenuHostHelper$$ExternalSyntheticLambda0 setprefixtext_menuhosthelper__externalsyntheticlambda0 = new setPrefixText$MenuHostHelper$$ExternalSyntheticLambda0();
        setprefixtext_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = false;
        setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        if (windowInsetsCompat$Impl != null && windowInsetsCompat$Impl.setY.containsKey("android:visibility:visibility")) {
            setprefixtext_menuhosthelper__externalsyntheticlambda0.setY = ((Integer) windowInsetsCompat$Impl.setY.get("android:visibility:visibility")).intValue();
            setprefixtext_menuhosthelper__externalsyntheticlambda0.setX = (ViewGroup) windowInsetsCompat$Impl.setY.get("android:visibility:parent");
        } else {
            setprefixtext_menuhosthelper__externalsyntheticlambda0.setY = -1;
            setprefixtext_menuhosthelper__externalsyntheticlambda0.setX = null;
        }
        if (windowInsetsCompat$Impl2 != null && windowInsetsCompat$Impl2.setY.containsKey("android:visibility:visibility")) {
            setprefixtext_menuhosthelper__externalsyntheticlambda0.setIconTintList = ((Integer) windowInsetsCompat$Impl2.setY.get("android:visibility:visibility")).intValue();
            setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 = (ViewGroup) windowInsetsCompat$Impl2.setY.get("android:visibility:parent");
        } else {
            setprefixtext_menuhosthelper__externalsyntheticlambda0.setIconTintList = -1;
            setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        }
        if (windowInsetsCompat$Impl != null && windowInsetsCompat$Impl2 != null) {
            if (setprefixtext_menuhosthelper__externalsyntheticlambda0.setY == setprefixtext_menuhosthelper__externalsyntheticlambda0.setIconTintList && setprefixtext_menuhosthelper__externalsyntheticlambda0.setX == setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0) {
                return setprefixtext_menuhosthelper__externalsyntheticlambda0;
            }
            if (setprefixtext_menuhosthelper__externalsyntheticlambda0.setY != setprefixtext_menuhosthelper__externalsyntheticlambda0.setIconTintList) {
                if (setprefixtext_menuhosthelper__externalsyntheticlambda0.setY == 0) {
                    setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                    setprefixtext_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = true;
                } else if (setprefixtext_menuhosthelper__externalsyntheticlambda0.setIconTintList == 0) {
                    setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    setprefixtext_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = true;
                }
            } else if (setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                setprefixtext_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = true;
            } else if (setprefixtext_menuhosthelper__externalsyntheticlambda0.setX == null) {
                setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                setprefixtext_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = true;
            }
        } else if (windowInsetsCompat$Impl == null && setprefixtext_menuhosthelper__externalsyntheticlambda0.setIconTintList == 0) {
            setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            setprefixtext_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = true;
        } else if (windowInsetsCompat$Impl2 == null && setprefixtext_menuhosthelper__externalsyntheticlambda0.setY == 0) {
            setprefixtext_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            setprefixtext_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation = true;
        }
        return setprefixtext_menuhosthelper__externalsyntheticlambda0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (setY(MenuHostHelper$$ExternalSyntheticLambda1(r12, false), setX(r12, false)).setLayoutAnimation == false) goto L15;
     */
    @Override // o.setRendererPriorityPolicy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator setIconTintList(final android.view.ViewGroup r12, o.WindowInsetsCompat$Impl r13, o.WindowInsetsCompat$Impl r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPrefixText.setIconTintList(android.view.ViewGroup, o.WindowInsetsCompat$Impl, o.WindowInsetsCompat$Impl):android.animation.Animator");
    }

    @Override // o.setRendererPriorityPolicy
    public final boolean setIconTintList(WindowInsetsCompat$Impl windowInsetsCompat$Impl, WindowInsetsCompat$Impl windowInsetsCompat$Impl2) {
        if (windowInsetsCompat$Impl == null && windowInsetsCompat$Impl2 == null) {
            return false;
        }
        if (windowInsetsCompat$Impl == null || windowInsetsCompat$Impl2 == null || windowInsetsCompat$Impl2.setY.containsKey("android:visibility:visibility") == windowInsetsCompat$Impl.setY.containsKey("android:visibility:visibility")) {
            setPrefixText$MenuHostHelper$$ExternalSyntheticLambda0 y = setY(windowInsetsCompat$Impl, windowInsetsCompat$Impl2);
            if (y.setLayoutAnimation) {
                return y.setY == 0 || y.setIconTintList == 0;
            }
            return false;
        }
        return false;
    }

    /* loaded from: classes.dex */
    static class setY extends AnimatorListenerAdapter implements setRendererPriorityPolicy.setIconTintList {
        private boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private final int setIconTintList;
        private final View setOnLongClickListener;
        private final ViewGroup setY;
        private boolean setX = false;
        private final boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;

        @Override // o.setRendererPriorityPolicy.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // o.setRendererPriorityPolicy.setIconTintList
        public final void setX() {
        }

        setY(View view, int i) {
            this.setOnLongClickListener = view;
            this.setIconTintList = i;
            this.setY = (ViewGroup) view.getParent();
            setX(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (this.setX) {
                return;
            }
            setScrollBarFadeDuration.setY(this.setOnLongClickListener, this.setIconTintList);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.setX) {
                return;
            }
            setScrollBarFadeDuration.setY(this.setOnLongClickListener, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.setX = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            setY();
        }

        @Override // o.setRendererPriorityPolicy.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy) {
            setY();
            setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(this);
        }

        @Override // o.setRendererPriorityPolicy.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            setX(false);
        }

        @Override // o.setRendererPriorityPolicy.setIconTintList
        public final void setIconTintList() {
            setX(true);
        }

        private void setY() {
            if (!this.setX) {
                setScrollBarFadeDuration.setY(this.setOnLongClickListener, this.setIconTintList);
                ViewGroup viewGroup = this.setY;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            setX(false);
        }

        private void setX(boolean z) {
            ViewGroup viewGroup;
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1 || this.MenuHostHelper$$ExternalSyntheticLambda0 == z || (viewGroup = this.setY) == null) {
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
            setStartIconTintList.setX(viewGroup, z);
        }
    }
}