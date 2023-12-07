package o;

import android.graphics.Typeface;
import android.os.Trace;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class LinearLayoutManager$SavedState$1 {
    final setAllowsGoneWidget MenuHostHelper$$ExternalSyntheticLambda0;
    final Typeface setIconTintList;
    final char[] setX;
    final LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 setY = new LinearLayoutManager$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0(1024);

    private LinearLayoutManager$SavedState$1(Typeface typeface, setAllowsGoneWidget setallowsgonewidget) {
        this.setIconTintList = typeface;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setallowsgonewidget;
        this.setX = new char[setallowsgonewidget.setIconTintList() << 1];
        int iconTintList = setallowsgonewidget.setIconTintList();
        for (int i = 0; i < iconTintList; i++) {
            setFailureListener setfailurelistener = new setFailureListener(this, i);
            Character.toChars(setfailurelistener.MenuHostHelper$$ExternalSyntheticLambda1().setX(), this.setX, i << 1);
            if (setfailurelistener.MenuHostHelper$$ExternalSyntheticLambda1().setIconTintList() > 0) {
                this.setY.MenuHostHelper$$ExternalSyntheticLambda0(setfailurelistener, 0, setfailurelistener.MenuHostHelper$$ExternalSyntheticLambda1().setIconTintList() - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public static LinearLayoutManager$SavedState$1 setX(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            Trace.beginSection("EmojiCompat.MetadataRepo.create");
            return new LinearLayoutManager$SavedState$1(typeface, setVerticalSpacing.setY(byteBuffer));
        } finally {
            setItemAnimator$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
        }
    }
}