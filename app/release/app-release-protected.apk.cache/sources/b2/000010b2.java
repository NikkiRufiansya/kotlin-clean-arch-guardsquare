package o;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import o.setBoxBackgroundMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setTransitioning implements setImageResource, setTextFuture {
    final setPasswordVisibilityToggleTintList MenuHostHelper$$ExternalSyntheticLambda1;
    private final setY setX;
    private final setImageResource setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTransitioning(setImageResource setimageresource, setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist) {
        this.setY = setimageresource;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setpasswordvisibilitytoggletintlist;
        if (setpasswordvisibilitytoggletintlist.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            setpasswordvisibilitytoggletintlist.MenuHostHelper$$ExternalSyntheticLambda0 = setimageresource;
        }
        this.setX = new setY(setpasswordvisibilitytoggletintlist);
    }

    @Override // o.setImageResource
    public final String setX() {
        return this.setY.setX();
    }

    @Override // o.setImageResource
    public final void setY(boolean z) {
        this.setY.setY(z);
    }

    @Override // o.setImageResource
    public final setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setX.setY.setY(new setFitsSystemWindows());
        return this.setX;
    }

    @Override // o.setImageResource
    public final setWindowCallback setIconTintList() {
        this.setX.setY.setY(new setFitsSystemWindows());
        return this.setX;
    }

    @Override // o.setImageResource, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.setX.close();
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // o.setTextFuture
    public final setImageResource MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY;
    }

    /* loaded from: classes.dex */
    static final class setY implements setWindowCallback {
        final setPasswordVisibilityToggleTintList setY;

        setY(setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist) {
            this.setY = setpasswordvisibilitytoggletintlist;
        }

        @Override // o.setWindowCallback
        public final setTextSelectHandleRight setIconTintList(String str) {
            return new setTransitioning$MenuHostHelper$$ExternalSyntheticLambda0(str, this.setY);
        }

        @Override // o.setWindowCallback
        public final void setX() {
            try {
                this.setY.setX().setX();
            } catch (Throwable th) {
                this.setY.setIconTintList();
                throw th;
            }
        }

        @Override // o.setWindowCallback
        public final void setIconTintList() {
            try {
                this.setY.setX().setIconTintList();
            } catch (Throwable th) {
                this.setY.setIconTintList();
                throw th;
            }
        }

        @Override // o.setWindowCallback
        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            if (this.setY.setY() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                this.setY.setY().MenuHostHelper$$ExternalSyntheticLambda1();
            } finally {
                this.setY.setIconTintList();
            }
        }

        @Override // o.setWindowCallback
        public final void setOnLongClickListener() {
            setWindowCallback y = this.setY.setY();
            if (y == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
            y.setOnLongClickListener();
        }

        @Override // o.setWindowCallback
        public final boolean setUnboundedRipple() {
            if (this.setY.setY() == null) {
                return false;
            }
            return ((Boolean) this.setY.setY(new setIndeterminateDrawableTiled() { // from class: o.Trace$1
                @Override // o.setIndeterminateDrawableTiled
                public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                    return Boolean.valueOf(((setWindowCallback) obj).setUnboundedRipple());
                }
            })).booleanValue();
        }

        @Override // o.setWindowCallback
        public final void setY(final int i) {
            this.setY.setY(new setIndeterminateDrawableTiled() { // from class: o.setLayoutManager
                @Override // o.setIndeterminateDrawableTiled
                public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                    ((setWindowCallback) obj).setY(i);
                    return null;
                }
            });
        }

        @Override // o.setWindowCallback
        public final Cursor setX(String str) {
            try {
                return new setX(this.setY.setX().setX(str), this.setY);
            } catch (Throwable th) {
                this.setY.setIconTintList();
                throw th;
            }
        }

        @Override // o.setWindowCallback
        public final Cursor setY(setRecycledViewPool setrecycledviewpool) {
            try {
                return new setX(this.setY.setX().setY(setrecycledviewpool), this.setY);
            } catch (Throwable th) {
                this.setY.setIconTintList();
                throw th;
            }
        }

        @Override // o.setWindowCallback
        public final void setY(final String str) {
            this.setY.setY(new setIndeterminateDrawableTiled() { // from class: o.Trace$2
                @Override // o.setIndeterminateDrawableTiled
                public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                    ((setWindowCallback) obj).setY(str);
                    return null;
                }
            });
        }

        @Override // o.setWindowCallback
        public final boolean setNavigationOnClickListener() {
            setWindowCallback y = this.setY.setY();
            if (y == null) {
                return false;
            }
            return y.setNavigationOnClickListener();
        }

        @Override // o.setWindowCallback
        public final String MenuHostHelper$$ExternalSyntheticLambda0() {
            return (String) this.setY.setY(new setIndeterminateDrawableTiled() { // from class: o.setHideOnScroll
                @Override // o.setIndeterminateDrawableTiled
                public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                    return ((setWindowCallback) obj).MenuHostHelper$$ExternalSyntheticLambda0();
                }
            });
        }

        @Override // o.setWindowCallback
        public final boolean setLayoutAnimation() {
            return ((Boolean) this.setY.setY(new setIndeterminateDrawableTiled() { // from class: o.getRootStableInsets
                @Override // o.setIndeterminateDrawableTiled
                public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                    return Boolean.valueOf(((setWindowCallback) obj).setLayoutAnimation());
                }
            })).booleanValue();
        }

        @Override // o.setWindowCallback
        public final List<Pair<String, String>> setY() {
            return (List) this.setY.setY(new setIndeterminateDrawableTiled() { // from class: o.setDpMargin
                @Override // o.setIndeterminateDrawableTiled
                public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
                    return ((setWindowCallback) obj).setY();
                }
            });
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist = this.setY;
            synchronized (setpasswordvisibilitytoggletintlist.setNavigationOnClickListener) {
                setpasswordvisibilitytoggletintlist.setUiOptions = true;
                setWindowCallback setwindowcallback = setpasswordvisibilitytoggletintlist.setX;
                if (setwindowcallback != null) {
                    setwindowcallback.close();
                }
                setpasswordvisibilitytoggletintlist.setX = null;
            }
        }
    }

    /* loaded from: classes.dex */
    static final class setX implements Cursor {
        private final setPasswordVisibilityToggleTintList MenuHostHelper$$ExternalSyntheticLambda0;
        private final Cursor setX;

        setX(Cursor cursor, setPasswordVisibilityToggleTintList setpasswordvisibilitytoggletintlist) {
            this.setX = cursor;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setpasswordvisibilitytoggletintlist;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.setX.close();
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            return this.setX.isClosed();
        }

        @Override // android.database.Cursor
        public final int getCount() {
            return this.setX.getCount();
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            return this.setX.getPosition();
        }

        @Override // android.database.Cursor
        public final boolean move(int i) {
            return this.setX.move(i);
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int i) {
            return this.setX.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            return this.setX.moveToFirst();
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            return this.setX.moveToLast();
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            return this.setX.moveToNext();
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            return this.setX.moveToPrevious();
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            return this.setX.isFirst();
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            return this.setX.isLast();
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            return this.setX.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            return this.setX.isAfterLast();
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String str) {
            return this.setX.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String str) {
            return this.setX.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public final String getColumnName(int i) {
            return this.setX.getColumnName(i);
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            return this.setX.getColumnNames();
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            return this.setX.getColumnCount();
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int i) {
            return this.setX.getBlob(i);
        }

        @Override // android.database.Cursor
        public final String getString(int i) {
            return this.setX.getString(i);
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
            this.setX.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public final short getShort(int i) {
            return this.setX.getShort(i);
        }

        @Override // android.database.Cursor
        public final int getInt(int i) {
            return this.setX.getInt(i);
        }

        @Override // android.database.Cursor
        public final long getLong(int i) {
            return this.setX.getLong(i);
        }

        @Override // android.database.Cursor
        public final float getFloat(int i) {
            return this.setX.getFloat(i);
        }

        @Override // android.database.Cursor
        public final double getDouble(int i) {
            return this.setX.getDouble(i);
        }

        @Override // android.database.Cursor
        public final int getType(int i) {
            return this.setX.getType(i);
        }

        @Override // android.database.Cursor
        public final boolean isNull(int i) {
            return this.setX.isNull(i);
        }

        @Override // android.database.Cursor
        @Deprecated
        public final void deactivate() {
            this.setX.deactivate();
        }

        @Override // android.database.Cursor
        @Deprecated
        public final boolean requery() {
            return this.setX.requery();
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver contentObserver) {
            this.setX.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver contentObserver) {
            this.setX.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.setX.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.setX.unregisterDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.setX.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public final void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            this.setX.setNotificationUris(contentResolver, list);
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            return setBoxBackgroundMode.setIconTintList.setIconTintList(this.setX);
        }

        @Override // android.database.Cursor
        public final List<Uri> getNotificationUris() {
            List<Uri> notificationUris;
            notificationUris = this.setX.getNotificationUris();
            return notificationUris;
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            return this.setX.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle bundle) {
            this.setX.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            return this.setX.getExtras();
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle bundle) {
            return this.setX.respond(bundle);
        }
    }
}