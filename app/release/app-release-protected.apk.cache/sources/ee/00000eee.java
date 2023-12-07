package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public class setRemoteViewsAdapter$MenuHostHelper$$ExternalSyntheticLambda0 extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled {
    final TextView setAnimationFromJson;
    final setAnimationCacheEnabled setZ;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setRemoteViewsAdapter$MenuHostHelper$$ExternalSyntheticLambda0(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.res_0x7f0a0130);
        this.setAnimationFromJson = textView;
        setBaselineAlignBottom.setIconTintList((View) textView, true);
        this.setZ = (setAnimationCacheEnabled) linearLayout.findViewById(R.id.res_0x7f0a012b);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}