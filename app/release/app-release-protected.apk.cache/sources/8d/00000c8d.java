package o;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public abstract class setImageDrawable {
    public abstract long setY();

    public static setImageDrawable MenuHostHelper$$ExternalSyntheticLambda1(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new FirebaseInstallationsRegistrar(Long.parseLong(jsonReader.nextString()));
                    }
                    return new FirebaseInstallationsRegistrar(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}