package o;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import o.setEdgeEffectColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public enum setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return INVISIBLE;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(view.getVisibility());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    return GONE;
                }
                StringBuilder sb = new StringBuilder("Unknown visibility ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            return INVISIBLE;
        }
        return VISIBLE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        boolean isLoggable;
        boolean isLoggable2;
        boolean isLoggable3;
        boolean isLoggable4;
        int i = setEdgeEffectColor.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda0[ordinal()];
        if (i == 1) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                isLoggable = Log.isLoggable("FragmentManager", 2);
                if (isLoggable) {
                    StringBuilder sb = new StringBuilder("SpecialEffectsController: Removing view ");
                    sb.append(view);
                    sb.append(" from container ");
                    sb.append(viewGroup);
                    Log.v("FragmentManager", sb.toString());
                }
                viewGroup.removeView(view);
            }
        } else if (i == 2) {
            isLoggable2 = Log.isLoggable("FragmentManager", 2);
            if (isLoggable2) {
                StringBuilder sb2 = new StringBuilder("SpecialEffectsController: Setting view ");
                sb2.append(view);
                sb2.append(" to VISIBLE");
                Log.v("FragmentManager", sb2.toString());
            }
            view.setVisibility(0);
        } else if (i == 3) {
            isLoggable3 = Log.isLoggable("FragmentManager", 2);
            if (isLoggable3) {
                StringBuilder sb3 = new StringBuilder("SpecialEffectsController: Setting view ");
                sb3.append(view);
                sb3.append(" to GONE");
                Log.v("FragmentManager", sb3.toString());
            }
            view.setVisibility(8);
        } else if (i == 4) {
            isLoggable4 = Log.isLoggable("FragmentManager", 2);
            if (isLoggable4) {
                StringBuilder sb4 = new StringBuilder("SpecialEffectsController: Setting view ");
                sb4.append(view);
                sb4.append(" to INVISIBLE");
                Log.v("FragmentManager", sb4.toString());
            }
            view.setVisibility(4);
        }
    }
}