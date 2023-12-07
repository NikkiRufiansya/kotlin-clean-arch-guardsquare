package o;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class Month$1 {
    private ViewParent MenuHostHelper$$ExternalSyntheticLambda0;
    public ViewParent MenuHostHelper$$ExternalSyntheticLambda1;
    public boolean setIconTintList;
    private int[] setX;
    public final View setY;

    public Month$1(View view) {
        this.setY = view;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        if (setY(i2)) {
            return true;
        }
        if (this.setIconTintList) {
            View view = this.setY;
            for (ViewParent parent = this.setY.getParent(); parent != null; parent = parent.getParent()) {
                if (setChipIconResource.setY(parent, view, this.setY, i, i2)) {
                    if (i2 == 0) {
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = parent;
                    } else if (i2 == 1) {
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = parent;
                    }
                    setChipIconResource.setIconTintList(parent, view, this.setY, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean setIconTintList(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParent;
        int i6;
        int i7;
        int[] iArr3;
        if (this.setIconTintList) {
            if (i5 == 0) {
                viewParent = this.MenuHostHelper$$ExternalSyntheticLambda1;
            } else {
                viewParent = i5 != 1 ? null : this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            if (viewParent == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    this.setY.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.setX == null) {
                        this.setX = new int[2];
                    }
                    int[] iArr4 = this.setX;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                setChipIconResource.setIconTintList(viewParent, this.setY, i, i2, i3, i4, i5, iArr3);
                if (iArr != null) {
                    this.setY.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            } else if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.setIconTintList || (viewParent = this.MenuHostHelper$$ExternalSyntheticLambda1) == null) {
            return false;
        }
        return setChipIconResource.setX(viewParent, this.setY, f, f2, z);
    }

    public final boolean setY(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParent;
        int i4;
        int i5;
        if (this.setIconTintList) {
            if (i3 == 0) {
                viewParent = this.MenuHostHelper$$ExternalSyntheticLambda1;
            } else {
                viewParent = i3 != 1 ? null : this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            ViewParent viewParent2 = viewParent;
            if (viewParent2 == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.setY.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.setX == null) {
                        this.setX = new int[2];
                    }
                    iArr = this.setX;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                setChipIconResource.setY(viewParent2, this.setY, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.setY.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                if (iArr[0] != 0 || iArr[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public final boolean setY(int i) {
        ViewParent viewParent;
        if (i == 0) {
            viewParent = this.MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            viewParent = i != 1 ? null : this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return viewParent != null;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        ViewParent viewParent;
        if (i == 0) {
            viewParent = this.MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            viewParent = i != 1 ? null : this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        if (viewParent != null) {
            setChipIconResource.setIconTintList(viewParent, this.setY, i);
            if (i == 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            } else if (i == 1) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            }
        }
    }
}