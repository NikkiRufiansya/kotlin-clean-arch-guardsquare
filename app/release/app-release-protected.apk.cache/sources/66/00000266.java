package o;

import android.view.ViewGroup;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled;

/* loaded from: classes.dex */
public abstract class WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<VH extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> {
    public final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconTintList setX = new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setIconTintList();
    public boolean setY = false;

    public abstract int setY();

    public long setY(int i) {
        return -1L;
    }

    public abstract VH setY(ViewGroup viewGroup);

    public abstract void setY(VH vh, int i);

    public final VH MenuHostHelper$$ExternalSyntheticLambda1(ViewGroup viewGroup, int i) {
        try {
            setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0("RV CreateView");
            VH y = setY(viewGroup);
            if (y.setIconTintList.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            y.setY = 0;
            return y;
        } finally {
            setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }
}