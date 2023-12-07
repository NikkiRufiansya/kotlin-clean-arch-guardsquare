package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public class setMax extends ImageButton {
    public int setOnLongClickListener;

    public setMax(Context context) {
        this(context, null);
    }

    public setMax(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setMax(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setOnLongClickListener = getVisibility();
    }

    public final void setIconTintList(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.setOnLongClickListener = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.setOnLongClickListener = i;
    }
}