package o;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class kP implements Serializable {
    public final List<String> categories;
    public final String description;
    public final String image_url;
    public boolean isSaved;
    public final String keywords;
    public final String language;
    public final String published_at;
    public final String snippet;
    public final String source;
    public final String title;
    public final String url;
    public String uuid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kP) {
            kP kPVar = (kP) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.categories, kPVar.categories) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.description, (Object) kPVar.description) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.image_url, (Object) kPVar.image_url) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.keywords, (Object) kPVar.keywords) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.language, (Object) kPVar.language) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.published_at, (Object) kPVar.published_at) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.snippet, (Object) kPVar.snippet) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.source, (Object) kPVar.source) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.title, (Object) kPVar.title) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.url, (Object) kPVar.url) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) this.uuid, (Object) kPVar.uuid) && this.isSaved == kPVar.isSaved;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<String> list = this.categories;
        int hashCode = list == null ? 0 : list.hashCode();
        String str = this.description;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.image_url;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.keywords;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.language;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.published_at;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.snippet;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.source;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.title;
        int hashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.url;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        int hashCode11 = this.uuid.hashCode();
        boolean z = this.isSaved;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("News(categories=");
        sb.append(this.categories);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", image_url=");
        sb.append(this.image_url);
        sb.append(", keywords=");
        sb.append(this.keywords);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", published_at=");
        sb.append(this.published_at);
        sb.append(", snippet=");
        sb.append(this.snippet);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", isSaved=");
        sb.append(this.isSaved);
        sb.append(')');
        return sb.toString();
    }

    public kP(List<String> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        pN.setY(str10, "");
        this.categories = list;
        this.description = str;
        this.image_url = str2;
        this.keywords = str3;
        this.language = str4;
        this.published_at = str5;
        this.snippet = str6;
        this.source = str7;
        this.title = str8;
        this.url = str9;
        this.uuid = str10;
        this.isSaved = z;
    }
}