package o;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class setRippleColor {
    private setStartIconTintMode MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    protected ByteBuffer setIconTintList;
    protected int setX;
    private int setY;

    public setRippleColor() {
        if (setStartIconTintMode.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            setStartIconTintMode.MenuHostHelper$$ExternalSyntheticLambda1 = new setDesignInformation();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setStartIconTintMode.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int setIconTintList(int i) {
        if (i < this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return this.setIconTintList.getShort(this.setY + i);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return i + this.setIconTintList.getInt(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int setX(int i) {
        int i2 = i + this.setX;
        return this.setIconTintList.getInt(i2 + this.setIconTintList.getInt(i2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        int i2 = i + this.setX;
        return i2 + this.setIconTintList.getInt(i2) + 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIconTintList(int i, ByteBuffer byteBuffer) {
        this.setIconTintList = byteBuffer;
        if (byteBuffer != null) {
            this.setX = i;
            int i2 = i - byteBuffer.getInt(i);
            this.setY = i2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.getShort(i2);
            return;
        }
        this.setX = 0;
        this.setY = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    }
}