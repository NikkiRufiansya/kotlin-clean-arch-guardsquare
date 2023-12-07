package o;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class wS {
    public static final Map<String, String> setIconTintList;
    public static final wS MenuHostHelper$$ExternalSyntheticLambda1 = new wS();
    private static final CopyOnWriteArraySet<Logger> setY = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = vD.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        String name2 = vD.class.getName();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name2, "");
        linkedHashMap2.put(name2, "okhttp.OkHttpClient");
        String name3 = C0586wz.class.getName();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name3, "");
        linkedHashMap2.put(name3, "okhttp.Http2");
        String name4 = vV.class.getName();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) name4, "");
        linkedHashMap2.put(name4, "okhttp.TaskRunner");
        linkedHashMap2.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        setIconTintList = C0362ow.setX(linkedHashMap2);
    }

    private wS() {
    }

    public static void setY(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (setY.add(logger)) {
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) logger, "");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(wT.setX);
        }
    }
}