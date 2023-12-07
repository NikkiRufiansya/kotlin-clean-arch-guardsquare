package o;

/* loaded from: classes.dex */
public final class uR extends uU {
    private Runnable setX;

    public uR(Runnable runnable, long j, uV uVVar) {
        super(j, uVVar);
        this.setX = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.setX.run();
        } finally {
            uV uVVar = this.setLayoutAnimation;
        }
    }

    public final String toString() {
        String simpleName;
        StringBuilder sb = new StringBuilder("Task[");
        simpleName = this.setX.getClass().getSimpleName();
        sb.append(simpleName);
        sb.append('@');
        sb.append(rZ.setY(this.setX));
        sb.append(", ");
        sb.append(this.setOnLongClickListener);
        sb.append(", ");
        sb.append(this.setLayoutAnimation);
        sb.append(']');
        return sb.toString();
    }
}