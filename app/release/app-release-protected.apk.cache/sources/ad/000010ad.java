package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class setTransitionGroup extends setEndIconCheckable {
    private final setFastScrollStyle setUiOptions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTransitionGroup(setPointerIcon setpointericon, setSimpleItems setsimpleitems) {
        super(setpointericon, setsimpleitems);
        setFastScrollStyle setfastscrollstyle = new setFastScrollStyle(setpointericon, this, new setEndIconOnClickListener("__container", setsimpleitems.setTextAlignment, false));
        this.setUiOptions = setfastscrollstyle;
        setfastscrollstyle.setX(Collections.emptyList(), Collections.emptyList());
    }

    @Override // o.setEndIconCheckable
    final void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, Matrix matrix, int i) {
        this.setUiOptions.setIconTintList(canvas, matrix, i);
    }

    @Override // o.setEndIconCheckable, o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        super.setIconTintList(rectF, matrix, z);
        this.setUiOptions.setIconTintList(rectF, this.MenuHostHelper$$ExternalSyntheticLambda1, z);
    }

    @Override // o.setEndIconCheckable
    protected final void MenuHostHelper$$ExternalSyntheticLambda1(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        this.setUiOptions.setIconTintList(setsupportbackgroundtintlist, i, list, setsupportbackgroundtintlist2);
    }
}