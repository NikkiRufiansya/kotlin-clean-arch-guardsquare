package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setCursorVisible implements setWindowCallback {
    private static final String[] MenuHostHelper$$ExternalSyntheticLambda0 = new String[0];
    final SQLiteDatabase setY;

    static {
        new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCursorVisible(SQLiteDatabase sQLiteDatabase) {
        this.setY = sQLiteDatabase;
    }

    @Override // o.setWindowCallback
    public final setTextSelectHandleRight setIconTintList(String str) {
        return new setEllipsize(this.setY.compileStatement(str));
    }

    @Override // o.setWindowCallback
    public final void setX() {
        this.setY.beginTransaction();
    }

    @Override // o.setWindowCallback
    public final void setIconTintList() {
        this.setY.beginTransactionNonExclusive();
    }

    @Override // o.setWindowCallback
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setY.endTransaction();
    }

    @Override // o.setWindowCallback
    public final void setOnLongClickListener() {
        this.setY.setTransactionSuccessful();
    }

    @Override // o.setWindowCallback
    public final boolean setUnboundedRipple() {
        return this.setY.inTransaction();
    }

    @Override // o.setWindowCallback
    public final void setY(int i) {
        this.setY.setVersion(i);
    }

    @Override // o.setWindowCallback
    public final Cursor setX(String str) {
        return setY(new FragmentManagerState$1(str));
    }

    @Override // o.setWindowCallback
    public final Cursor setY(final setRecycledViewPool setrecycledviewpool) {
        return this.setY.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o.setCursorVisible.4
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                setrecycledviewpool.setX(new setScroller(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, setrecycledviewpool.MenuHostHelper$$ExternalSyntheticLambda0(), MenuHostHelper$$ExternalSyntheticLambda0, null);
    }

    @Override // o.setWindowCallback
    public final void setY(String str) {
        this.setY.execSQL(str);
    }

    @Override // o.setWindowCallback
    public final boolean setNavigationOnClickListener() {
        return this.setY.isOpen();
    }

    @Override // o.setWindowCallback
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY.getPath();
    }

    @Override // o.setWindowCallback
    public final boolean setLayoutAnimation() {
        return setBoxBackgroundMode$MenuHostHelper$$ExternalSyntheticLambda1.setY(this.setY);
    }

    @Override // o.setWindowCallback
    public final List<Pair<String, String>> setY() {
        return this.setY.getAttachedDbs();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.setY.close();
    }
}