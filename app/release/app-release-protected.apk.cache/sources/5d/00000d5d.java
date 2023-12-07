package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setMaxImageSize extends SQLiteOpenHelper {
    static final String MenuHostHelper$$ExternalSyntheticLambda1;
    private static final List<setIconTintList> setX;
    static int setY;
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean setIconTintList;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void setIconTintList(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder sb = new StringBuilder("INSERT INTO global_log_event_state VALUES (");
        sb.append(System.currentTimeMillis());
        sb.append(")");
        MenuHostHelper$$ExternalSyntheticLambda1 = sb.toString();
        setY = 5;
        setX = Arrays.asList(new setIconTintList() { // from class: o.setIconEndPaddingResource
            @Override // o.setMaxImageSize.setIconTintList
            public final void setIconTintList(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            }
        }, new setIconTintList() { // from class: o.setHideOnContentScrollEnabled
            @Override // o.setMaxImageSize.setIconTintList
            public final void setIconTintList(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        }, new setIconTintList() { // from class: o.setUseDefaultMargins
            @Override // o.setMaxImageSize.setIconTintList
            public final void setIconTintList(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        }, new setIconTintList() { // from class: o.setExpandedTitleTypeface
            @Override // o.setMaxImageSize.setIconTintList
            public final void setIconTintList(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        }, new setIconTintList() { // from class: o.setScrollPosition
            @Override // o.setMaxImageSize.setIconTintList
            public final void setIconTintList(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(setMaxImageSize.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @nE
    public setMaxImageSize(Context context, @nC(MenuHostHelper$$ExternalSyntheticLambda0 = "SQLITE_DB_NAME") String str, @nC(MenuHostHelper$$ExternalSyntheticLambda0 = "SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.setIconTintList = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.setIconTintList = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!this.setIconTintList) {
            onConfigure(sQLiteDatabase);
        }
        setY(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.setIconTintList) {
            onConfigure(sQLiteDatabase);
        }
        setY(sQLiteDatabase, 0, i2);
    }

    private static void setY(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<setIconTintList> list = setX;
        if (i2 <= list.size()) {
            while (i < i2) {
                setX.get(i).setIconTintList(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(list.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.setIconTintList) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.setIconTintList) {
            onConfigure(sQLiteDatabase);
        }
        setY(sQLiteDatabase, i, i2);
    }
}