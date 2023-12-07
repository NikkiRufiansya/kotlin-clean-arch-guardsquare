package o;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
import o.setAllowedHandwritingDelegatorPackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setAllowedHandwritingDelegatorPackage$MenuHostHelper$$ExternalSyntheticLambda0 extends setAllowedHandwritingDelegatorPackage.setIconTintList {
    @Override // o.setAllowedHandwritingDelegatorPackage.setIconTintList
    void MenuHostHelper$$ExternalSyntheticLambda1(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) setAllowedHandwritingDelegatorPackage.MenuHostHelper$$ExternalSyntheticLambda0(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}