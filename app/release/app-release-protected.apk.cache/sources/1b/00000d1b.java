package o;

import java.io.IOException;
import java.io.OutputStream;
import o.setLeftStripDrawable;
import o.setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setSpeed;

/* loaded from: classes.dex */
public abstract class setLeftStripDrawable<MessageType extends setLeftStripDrawable<MessageType, BuilderType>, BuilderType extends setLeftStripDrawable$MenuHostHelper$$ExternalSyntheticLambda1<MessageType, BuilderType>> implements setDrawingCacheQuality {
    protected int memoizedHashCode = 0;

    @Override // o.setDrawingCacheQuality
    public setSpeed setOnLongClickListener() {
        try {
            setSpeed.setLayoutAnimation MenuHostHelper$$ExternalSyntheticLambda0 = setSpeed.MenuHostHelper$$ExternalSyntheticLambda0(setChipCornerRadius());
            setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0.setX);
            if (MenuHostHelper$$ExternalSyntheticLambda0.setX.setUiOptions() == 0) {
                return new setSpeed.setUiOptions(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(setIconTintList("ByteString"), e);
        }
    }

    public void setY(OutputStream outputStream) {
        setMenuPrepared MenuHostHelper$$ExternalSyntheticLambda1 = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda1(outputStream, setMenuPrepared.setOnLongClickListener(setChipCornerRadius()));
        setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1);
        MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener();
    }

    int MenuHostHelper$$ExternalSyntheticLambda1() {
        throw new UnsupportedOperationException();
    }

    void setIconTintList(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int MenuHostHelper$$ExternalSyntheticLambda1(setValues setvalues) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
            int y = setvalues.setY(this);
            setIconTintList(y);
            return y;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCloseIconContentDescription setUiOptions() {
        return new setCloseIconContentDescription();
    }

    private String setIconTintList(String str) {
        StringBuilder sb = new StringBuilder("Serializing ");
        sb.append(getClass().getName());
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }
}