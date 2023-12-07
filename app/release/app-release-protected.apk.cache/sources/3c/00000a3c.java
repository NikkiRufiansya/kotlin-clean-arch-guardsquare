package o;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class setChoiceMode {
    public boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    public final Set<setIconTintList> MenuHostHelper$$ExternalSyntheticLambda1 = new setHasNonEmbeddedTabs();
    public final Map<String, setForegroundGravity> setY = new HashMap();
    private final Comparator<setVerticalGravity<String, Float>> setIconTintList = new Comparator<setVerticalGravity<String, Float>>() { // from class: o.setChoiceMode.2
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(setVerticalGravity<String, Float> setverticalgravity, setVerticalGravity<String, Float> setverticalgravity2) {
            float floatValue = setverticalgravity.MenuHostHelper$$ExternalSyntheticLambda1.floatValue();
            float floatValue2 = setverticalgravity2.MenuHostHelper$$ExternalSyntheticLambda1.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };

    /* loaded from: classes.dex */
    public interface setIconTintList {
    }
}