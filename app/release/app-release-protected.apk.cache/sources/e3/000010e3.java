package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class setVerticalSpacing {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static setAllowsGoneWidget setY(ByteBuffer byteBuffer) {
        long j;
        ByteBuffer duplicate = byteBuffer.duplicate();
        setY sety = new setY(duplicate);
        sety.setY(4);
        int x = sety.setX();
        if (x > 100) {
            throw new IOException("Cannot read metadata.");
        }
        sety.setY(6);
        int i = 0;
        while (true) {
            if (i >= x) {
                j = -1;
                break;
            }
            int iconTintList = sety.setIconTintList();
            sety.setY(4);
            j = sety.MenuHostHelper$$ExternalSyntheticLambda0();
            sety.setY(4);
            if (1835365473 == iconTintList) {
                break;
            }
            i++;
        }
        if (j != -1) {
            sety.setY((int) (j - sety.setY()));
            sety.setY(12);
            long MenuHostHelper$$ExternalSyntheticLambda0 = sety.MenuHostHelper$$ExternalSyntheticLambda0();
            for (int i2 = 0; i2 < MenuHostHelper$$ExternalSyntheticLambda0; i2++) {
                int iconTintList2 = sety.setIconTintList();
                long MenuHostHelper$$ExternalSyntheticLambda02 = sety.MenuHostHelper$$ExternalSyntheticLambda0();
                long MenuHostHelper$$ExternalSyntheticLambda03 = sety.MenuHostHelper$$ExternalSyntheticLambda0();
                if (1164798569 == iconTintList2 || 1701669481 == iconTintList2) {
                    duplicate.position((int) new setVerticalSpacing$MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02 + j, MenuHostHelper$$ExternalSyntheticLambda03).MenuHostHelper$$ExternalSyntheticLambda1);
                    setAllowsGoneWidget setallowsgonewidget = new setAllowsGoneWidget();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    setallowsgonewidget.MenuHostHelper$$ExternalSyntheticLambda1(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                    return setallowsgonewidget;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* loaded from: classes.dex */
    static class setY implements setVerticalSpacing$MenuHostHelper$$ExternalSyntheticLambda0 {
        private final ByteBuffer setIconTintList;

        setY(ByteBuffer byteBuffer) {
            this.setIconTintList = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // o.setVerticalSpacing$MenuHostHelper$$ExternalSyntheticLambda0
        public final int setX() {
            return this.setIconTintList.getShort() & 65535;
        }

        @Override // o.setVerticalSpacing$MenuHostHelper$$ExternalSyntheticLambda0
        public final long MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setIconTintList.getInt() & 4294967295L;
        }

        @Override // o.setVerticalSpacing$MenuHostHelper$$ExternalSyntheticLambda0
        public final int setIconTintList() {
            return this.setIconTintList.getInt();
        }

        @Override // o.setVerticalSpacing$MenuHostHelper$$ExternalSyntheticLambda0
        public final void setY(int i) {
            ByteBuffer byteBuffer = this.setIconTintList;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // o.setVerticalSpacing$MenuHostHelper$$ExternalSyntheticLambda0
        public final long setY() {
            return this.setIconTintList.position();
        }
    }
}