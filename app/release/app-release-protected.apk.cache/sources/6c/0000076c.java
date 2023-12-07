package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.nf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318nf {
    final mD MenuHostHelper$$ExternalSyntheticLambda0;
    long MenuHostHelper$$ExternalSyntheticLambda1;
    long ViewPager$SavedState$1;
    int setCenterIfNoTextEnabled;
    long setChipCornerRadius;
    long setIconTintList;
    int setLayoutAnimation;
    int setNavigationOnClickListener;
    final Handler setOnLongClickListener;
    private HandlerThread setTextAlignment;
    long setUiOptions;
    long setUnboundedRipple;
    long setX;
    long setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0318nf(mD mDVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = mDVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.setTextAlignment = handlerThread;
        handlerThread.start();
        C0321ni.MenuHostHelper$$ExternalSyntheticLambda0(handlerThread.getLooper());
        this.setOnLongClickListener = new setX(handlerThread.getLooper(), this);
    }

    /* renamed from: o.nf$setX */
    /* loaded from: classes.dex */
    static class setX extends Handler {
        private final C0318nf setX;

        setX(Looper looper, C0318nf c0318nf) {
            super(looper);
            this.setX = c0318nf;
        }

        @Override // android.os.Handler
        public final void handleMessage(final Message message) {
            int i = message.what;
            if (i == 0) {
                this.setX.setY++;
            } else if (i == 1) {
                this.setX.setUiOptions++;
            } else if (i == 2) {
                C0318nf c0318nf = this.setX;
                long j = message.arg1;
                int i2 = c0318nf.setNavigationOnClickListener + 1;
                c0318nf.setNavigationOnClickListener = i2;
                long j2 = c0318nf.ViewPager$SavedState$1 + j;
                c0318nf.ViewPager$SavedState$1 = j2;
                c0318nf.setIconTintList = j2 / i2;
            } else if (i == 3) {
                C0318nf c0318nf2 = this.setX;
                long j3 = message.arg1;
                c0318nf2.setCenterIfNoTextEnabled++;
                long j4 = c0318nf2.setChipCornerRadius + j3;
                c0318nf2.setChipCornerRadius = j4;
                c0318nf2.MenuHostHelper$$ExternalSyntheticLambda1 = j4 / c0318nf2.setNavigationOnClickListener;
            } else if (i == 4) {
                C0318nf c0318nf3 = this.setX;
                c0318nf3.setLayoutAnimation++;
                long longValue = c0318nf3.setUnboundedRipple + ((Long) message.obj).longValue();
                c0318nf3.setUnboundedRipple = longValue;
                c0318nf3.setX = longValue / c0318nf3.setLayoutAnimation;
            } else {
                mU.setY.post(new Runnable() { // from class: o.nf.setX.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Unhandled stats message.");
                        sb.append(message.what);
                        throw new AssertionError(sb.toString());
                    }
                });
            }
        }
    }
}