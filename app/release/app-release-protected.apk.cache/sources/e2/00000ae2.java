package o;

/* loaded from: classes.dex */
final class setCurrentPosition {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String MenuHostHelper$$ExternalSyntheticLambda0(setCurrentPosition$MenuHostHelper$$ExternalSyntheticLambda1 setcurrentposition_menuhosthelper__externalsyntheticlambda1) {
        StringBuilder sb = new StringBuilder(setcurrentposition_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1());
        for (int i = 0; i < setcurrentposition_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1(); i++) {
            byte x = setcurrentposition_menuhosthelper__externalsyntheticlambda1.setX(i);
            if (x == 34) {
                sb.append("\\\"");
            } else if (x == 39) {
                sb.append("\\'");
            } else if (x != 92) {
                switch (x) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (x >= 32 && x <= 126) {
                            sb.append((char) x);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((x >>> 6) & 3) + 48));
                            sb.append((char) (((x >>> 3) & 7) + 48));
                            sb.append((char) ((x & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}