package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
final class setSelectedItemId {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1(Context context, setDropDownBackgroundResource setdropdownbackgroundresource, boolean z, boolean z2) {
        int iconified;
        int constraintSet = setdropdownbackgroundresource.setConstraintSet();
        if (z2) {
            if (z) {
                iconified = setdropdownbackgroundresource.setFilterTouchesWhenObscured();
            } else {
                iconified = setdropdownbackgroundresource.setViewTranslationCallback();
            }
        } else if (z) {
            iconified = setdropdownbackgroundresource.setGuidelinePercent();
        } else {
            iconified = setdropdownbackgroundresource.setIconified();
        }
        boolean z3 = false;
        setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(0, 0, 0, 0);
        if (setdropdownbackgroundresource.setUnboundedRipple != null && setdropdownbackgroundresource.setUnboundedRipple.getTag(R.id.res_0x7f0a021b) != null) {
            setdropdownbackgroundresource.setUnboundedRipple.setTag(R.id.res_0x7f0a021b, null);
        }
        if (setdropdownbackgroundresource.setUnboundedRipple == null || setdropdownbackgroundresource.setUnboundedRipple.getLayoutTransition() == null) {
            Animation MenuHostHelper$$ExternalSyntheticLambda0 = setdropdownbackgroundresource.MenuHostHelper$$ExternalSyntheticLambda0(constraintSet, z, iconified);
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                return new setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
            }
            Animator x = setdropdownbackgroundresource.setX(constraintSet, z, iconified);
            if (x != null) {
                return new setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0(x);
            }
            if (iconified == 0 && constraintSet != 0) {
                iconified = constraintSet != 4097 ? constraintSet != 4099 ? constraintSet != 8194 ? -1 : z ? R.animator.res_0x7f020003 : R.animator.res_0x7f020004 : z ? R.animator.res_0x7f020005 : R.animator.res_0x7f020006 : z ? R.animator.res_0x7f020007 : R.animator.res_0x7f020008;
            }
            if (iconified != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(iconified));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, iconified);
                        if (loadAnimation != null) {
                            return new setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, iconified);
                        if (loadAnimator != null) {
                            return new setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0(loadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, iconified);
                        if (loadAnimation2 != null) {
                            return new setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0(loadAnimation2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* loaded from: classes.dex */
    static class setY extends AnimationSet implements Runnable {
        private final ViewGroup MenuHostHelper$$ExternalSyntheticLambda0;
        private boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setIconTintList;
        private boolean setX;
        private final View setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setY(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.setIconTintList = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = viewGroup;
            this.setY = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.setIconTintList = true;
            if (this.setX) {
                return !this.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            if (!super.getTransformation(j, transformation)) {
                this.setX = true;
                setRawInputType.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.setIconTintList = true;
            if (this.setX) {
                return !this.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.setX = true;
                setRawInputType.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.setX && this.setIconTintList) {
                this.setIconTintList = false;
                this.MenuHostHelper$$ExternalSyntheticLambda0.post(this);
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.endViewTransition(this.setY);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }
    }
}