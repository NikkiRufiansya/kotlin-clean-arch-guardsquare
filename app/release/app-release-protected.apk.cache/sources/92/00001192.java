package o;

/* loaded from: classes.dex */
public class uM extends AbstractC0466ss {
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setNavigationOnClickListener;
    private final int setUiOptions;
    private final long setX;
    uK setY;

    public uM() {
        this((byte) 0);
    }

    private /* synthetic */ uM(byte b) {
        this(uS.setIconTintList, uS.MenuHostHelper$$ExternalSyntheticLambda0, uS.MenuHostHelper$$ExternalSyntheticLambda1, "CoroutineScheduler");
    }

    public uM(int i, int i2, long j, String str) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setUiOptions = i2;
        this.setX = j;
        this.setNavigationOnClickListener = str;
        this.setY = new uK(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setUiOptions, this.setX, this.setNavigationOnClickListener);
    }

    @Override // o.rQ
    public final void setY(oM oMVar, Runnable runnable) {
        this.setY.setIconTintList(runnable, uS.setY, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.setY.close();
    }
}