package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface EmojiCompatInitializer {

    /* renamed from: o.EmojiCompatInitializer$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public interface AnonymousClass1 extends setContentInsetStartWithNavigation {
        void setIconTintList(Canvas canvas, Matrix matrix, int i);

        void setIconTintList(RectF rectF, Matrix matrix, boolean z);
    }

    setEdgeEffectColor setIconTintList(ViewGroup viewGroup);
}