package o;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public interface get extends setNextFocusLeftId$MenuHostHelper$$ExternalSyntheticLambda0 {
    get$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setIconTintList();

    void setRevealInfo(get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda1);

    void setX();

    int setY();

    /* loaded from: classes.dex */
    public static class setX extends Property<get, get$MenuHostHelper$$ExternalSyntheticLambda1> {
        public static final Property<get, get$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda1 = new setX("circularReveal");

        @Override // android.util.Property
        public final /* synthetic */ get$MenuHostHelper$$ExternalSyntheticLambda1 get(get getVar) {
            return getVar.MenuHostHelper$$ExternalSyntheticLambda0();
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(get getVar, get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda1) {
            getVar.setRevealInfo(get_menuhosthelper__externalsyntheticlambda1);
        }

        private setX(String str) {
            super(get$MenuHostHelper$$ExternalSyntheticLambda1.class, str);
        }
    }

    /* loaded from: classes.dex */
    public static class setY implements TypeEvaluator<get$MenuHostHelper$$ExternalSyntheticLambda1> {
        public static final TypeEvaluator<get$MenuHostHelper$$ExternalSyntheticLambda1> setX = new setY();
        private final get$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = new get$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);

        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ get$MenuHostHelper$$ExternalSyntheticLambda1 evaluate(float f, get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda1, get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda12) {
            get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda13 = get_menuhosthelper__externalsyntheticlambda1;
            get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda14 = get_menuhosthelper__externalsyntheticlambda12;
            get$MenuHostHelper$$ExternalSyntheticLambda1 get_menuhosthelper__externalsyntheticlambda15 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            float f2 = 1.0f - f;
            float f3 = (get_menuhosthelper__externalsyntheticlambda13.setX * f2) + (get_menuhosthelper__externalsyntheticlambda14.setX * f);
            float f4 = get_menuhosthelper__externalsyntheticlambda13.MenuHostHelper$$ExternalSyntheticLambda0;
            float f5 = get_menuhosthelper__externalsyntheticlambda13.setIconTintList;
            get_menuhosthelper__externalsyntheticlambda15.setX = f3;
            get_menuhosthelper__externalsyntheticlambda15.MenuHostHelper$$ExternalSyntheticLambda0 = (f4 * f2) + (get_menuhosthelper__externalsyntheticlambda14.MenuHostHelper$$ExternalSyntheticLambda0 * f);
            get_menuhosthelper__externalsyntheticlambda15.setIconTintList = (f2 * f5) + (f * get_menuhosthelper__externalsyntheticlambda14.setIconTintList);
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends Property<get, Integer> {
        public static final Property<get, Integer> setY = new setIconTintList("circularRevealScrimColor");

        @Override // android.util.Property
        public final /* synthetic */ Integer get(get getVar) {
            return Integer.valueOf(getVar.setY());
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(get getVar, Integer num) {
            getVar.setCircularRevealScrimColor(num.intValue());
        }

        private setIconTintList(String str) {
            super(Integer.class, str);
        }
    }
}