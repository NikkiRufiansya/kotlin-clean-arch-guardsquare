package o;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
final class setEllipsize extends setScroller implements setTextSelectHandleRight {
    private final SQLiteStatement setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setEllipsize(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.setIconTintList = sQLiteStatement;
    }

    @Override // o.setTextSelectHandleRight
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList.executeUpdateDelete();
    }

    @Override // o.setTextSelectHandleRight
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList.executeInsert();
    }
}