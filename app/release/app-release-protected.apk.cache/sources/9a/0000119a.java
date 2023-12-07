package o;

/* loaded from: classes.dex */
public abstract class uU implements Runnable {
    public uV setLayoutAnimation;
    public long setOnLongClickListener;

    public uU(long j, uV uVVar) {
        this.setOnLongClickListener = j;
        this.setLayoutAnimation = uVVar;
    }

    public uU() {
        this(0L, uS.setY);
    }
}