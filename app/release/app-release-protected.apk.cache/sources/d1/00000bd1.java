package o;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* loaded from: classes.dex */
class setFilterRedundantCalls$MenuHostHelper$$ExternalSyntheticLambda0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setX(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }
}