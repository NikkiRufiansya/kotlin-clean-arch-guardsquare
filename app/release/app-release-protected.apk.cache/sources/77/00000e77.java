package o;

import o.setImageResource;

/* loaded from: classes.dex */
public final class setPathData implements setImageResource.setX {
    private final setImageResource.setX MenuHostHelper$$ExternalSyntheticLambda1;
    private final setPasswordVisibilityToggleTintList setY;

    public setPathData(setImageResource.setX setx, setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setx;
        this.setY = setpasswordvisibilitytoggletintlist;
    }

    @Override // o.setImageResource.setX
    public final /* synthetic */ setImageResource setX(setImageResource.setIconTintList seticontintlist) {
        return new setTransitioning(this.MenuHostHelper$$ExternalSyntheticLambda1.setX(seticontintlist), this.setY);
    }
}