package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class setContentInsetsRelative implements Iterable<Intent> {
    public final Context setX;
    public final ArrayList<Intent> setY = new ArrayList<>();

    /* loaded from: classes.dex */
    public interface setY {
        Intent setTextAlignment();
    }

    public setContentInsetsRelative(Context context) {
        this.setX = context;
    }

    public final setContentInsetsRelative setIconTintList(ComponentName componentName) {
        int size = this.setY.size();
        try {
            Intent x = onOptionsItemSelected.setX(this.setX, componentName);
            while (x != null) {
                this.setY.add(size, x);
                x = onOptionsItemSelected.setX(this.setX, x.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.setY.iterator();
    }
}