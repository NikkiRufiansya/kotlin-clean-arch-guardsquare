package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import o.C0323nk;

/* renamed from: o.nz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0338nz {
    private static char[] setIconTintList;
    private static long setY;
    public static final byte[] $$d = {36, -18, 4, 125};
    public static final int $$e = 131;
    public static final byte[] $$a = {111, 84, 114, 59};
    public static final int $$b = 140;
    private static int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    private static int MenuHostHelper$$ExternalSyntheticLambda1 = 1;

    static {
        char[] cArr = new char[2337];
        ByteBuffer.wrap("TÃ\u0086þðe#ø\u001d\u001bHÅºG\u0095ºÇ82¬l\u0019_\u008d\u0089\fûMÖù\u0000bsè\u00adH\u0098ÅÊ]%§\u0017\u001dB»¼\u0006ï\u009dÙ\t\u000bu\u009a¦H\u009b>\u0000í\u009dÓ~\u0086 t\"[ß\t]üÉ¢|\u0091èGi5(\u0018\u008dÎ\n½\u0099c:V\u009a\u0004/ëÁÙU\u008cÎrg!ýTÃ\u0086þðe#ø\u001d\u001bHÅºG\u0095ºÇ82¬l\u0019_\u008d\u0089\fûMÖë\u0000\u007fsâ\u00adY\u008a\u0088X¢.2ý¶ÃP\u0096\u0084d\fKù\u0019bìí²^\u0081\u009aWH%6\b¿Þ)\u00ad¡s\u0018F\u0098\u0014\rûÀÉk\u009câbI1Ã\u0007DÕ)¸¬we¥\u001eÓ½\u0000$>ëk\u0006\u0099ÿ¶_äæ\u0011CO¯|Dª÷Ø\u008fõG#»P6\u008e³»=éó\u0006C4ðab\u009fÄÌVú·(ÐE\u0003s\u0093 %<åîÄ\u0098\u000bKþu\\ ÂÒ/ý\u009f¯\"Z\u008d\u0004}7³á\u0003\u0093\b¾\u009dhUÀé\u0012Õd^·Ç\u00891Üì.e\u0001ÒS\u0006¦\u0092ø5Ë¤TÃ\u0086ÿðt#í\u001d\u001bHÑºA\u0095»Çr2ºl\u0002_\u0091\u0089\u00144\u0005æ/\u0090¢C+}\u0093(\u0016Ú\u008aõ?§ÈRJ\fû?WéÔ\u009b±¶\u001a`¡\u0013>Í\u009d£\u001aq?\u0007«Ôoê¸¿>MÁb}0·ÅX\u009bÑ¨\u001f~\u008d\f·!s÷ç\u0084\u001eZ¾oG=\u008fÒ5à´µ/KòT\u008d\u0086ÂðX#Ù\u001d\u0011Hãº\r\u0095îÇf2ðlH_Û\u0089\u001cû`Ö¬\u0000YsÓ\u00adb_r\u008dXûÈ(L\u0016ñCv±ô\u009eHÌ\u00819\u0012g£T`\u0082¹ðÊÝK\u000bÙx_¦¥\u0093bÁð\u0096pD\r2\u0099á\u001eß¥\u008a$T\u008d\u0086âð:#¶\u001dFH\u0094ºI\u0095óÇd2ølU_Ä\u00893ûMÖî\u0000Ys¶\u00adV\u0098ÌÊ\u0014%à\u0017\u001dB¾¼Bï\u008eÙ\u0018\u000b&fÁ\u009e¢L\u0088:\u0018é\u009c×!\u0082¦p$_\u0098\r_øÂ¦\u007f\u0095°Ck1\u0016\u001c\u0094Ê\u0012¹»g\u0016Rì\u0000!ïÐÝN\u0088Üv:%þ\u0013dÁ\u001f¬\u008b\u009a\u0017I¼75TÃ\u0086éðy#ý\u001d@HÇºE\u0095ùÇ>2£l\u001e_Ñ\u0089\nûwÖõ\u0000ssÚ\u00adw\u0098\u008dÊ^%¦\u0017-B¸TÃ\u0086éðy#ý\u001d@HÇºE\u0095ùÇ02£l\u0012_Ñ\u0089\bû{Öú\u0000hsé\u00adW\u0098ÕÊx%\u0099\u00172Bº¼\u0019ï\u008cÙD\u000bcfñTÃ\u0086þðe#ø\u001d\u001bHÌºM\u0095»Ç)2\u00adl\u0005_\u009b\u0089\u0017ûfT\u009e\u0086õð.#ì\u001dAHËºD\u0095²Çr2¢l\u001f_\u008d\u0089\u0010ÆÌ\u0014±b/±³\u008f\u001fÚÂ(\b\u0007ýUfº\u0016h?\u001e§Í4ó\u0082¦XT\u009b{j)åÜz\u0082Ö±RgÂ\u0015³8(î¾\u009d*T\u0082\u0086ÿðm#û\u001dGHÄRû\u0080ºös%à\u001bXN\u0098¼1\u0093´Á]4ªj\u001cYÄ\u008f\ný\u001cÐ¯\u0006\u0011u\u0085«X\u009eÓÌ/TØ\u0086âðO#Á\u001dXHÔº\u001e\u0095®Ç02ðl\u0006_Ê\u0089\u0016ûMÖÀ\u0000^sú\u00ad\u000eT\u009e\u0086õð.#þ\u001dFHÍºL\u0095£Ç?2¾l^_\u0093\u0089\u0005û|Öí\u0000`sí\u00adY\u0098ÔÊ[%¦\u0017'BºT´\u0086®ð:#º\u001dXHýº\u001a\u0095âÇj2«l1_Ä\u0089\bû`Ö¬\u0000YsÃ\u00adL\u0098\u009aÊ\u0018%µ\u0017g\u001f¹Íí»|håVK\u0003ßñNÞ\u00ad\u008c!y¶¤\u0011v|\u0000ãÓhíÓ¸]JÎT\u008f\u0086òðr#á\u001dYHËº]\u0095»%\u008f÷ä\u0081?RïlW9ÜË]ä²¶.C¯\u001dO.\u008bø\u0010\u008au§àqt\u0002øT\u009a\u0086øðo#ö\u001d\fH\u0094ºXT\u008b\u0086ÿðn#ë\u001dFHËºKaØ³¬Å=\u0016¸(\u0015}\u0098\u008f\u0018 Úòw\u0007¡Y\u0015á¼3ÈEY\u0096Ü¨qýü\u000f| ¾r\u0013\u0087ÅÙqê\u0096<eN\u0011P\u0097\u0082üô''÷\u0019OLÄ¾E\u0091ªÃ66·hW[\u009a\u008d\u0002ÿ\u007fÒô\u0004cT\u009f\u0086þðkT\u0089\u0086÷ðu#â\u001dUHÖºG\u0095¤T\u00ad\u0086êðp#®\u001dfH×ºF\u0095¢Ç52§l\u0015_Þ\u0089\u0002û}Öê\u0000&sÏ\u00adR\u0098ÒÊA%¹\u0017'\\Ö\u008e\u008fø\u001f+\u0087\u0015 @°²7\u009d\u008dÏt:õd@W¥\u0081}ó\u001cÞ\u008a\b\u0011{\u0083¥a\u0090½Â:-Ý\u001f\u0019JË´5ç±4¿ææ\u0090vCî}I(ÙÚ^õä§\u001dR\u009c\f)?Ìé\u0014\u009bu¶ã`x\u0013êÍ\bøÔªSE´wp\"¢Ü\\\u008fØ¹'k4\u0006¸T\u009e\u0086õð.#æ\u001dUHÐºL\u0095¡Ç=2¸l\u0015T\u008b\u0086õðl#ê\u001dRHËº[\u0095¾T\u009a\u0086øðo#ö\u001d\fH\u0094T\u009e\u0086ûðn#í\u001d\\H×Û\u0082\té\u007f2¬â\u0092ZÇÑ5P\u001a¿H#½¢ãBÐ\u0080\u0006\ntoYê\u008f~¸\u0002ji\u001c²ÏyñÍ¤LVÚy/+¬Þx\u0080\u009d³\u0007e\u0095\u0017ûô)\u0007zÕ\u0011£Êp\u0019Nµ\u001b%é¹Æ@\u0094Ý\u0001ñn~¼\u0015ÊÎ\u0019\f'¡r+\u0080¤¯Rý\u0092\bZVâeq³àÁ\u0087ì\u001b:\u0092k\u001f¹zÏù\u001cw\"þwO\u0085\u0085ªu\u009e\u0005Ln:µéw×Ú\u0082Ppß_)\réø7¦\u0082\u0095\u000bC\u00981ì\u001cqÊí¹egÈRU\u0000ÁT\u008b\u0086ÿðn#ë\u001dFHËºK\u0095ùÇ/2®l\u001b_Ñ\u0089\u0003ûwÖö\u0000csþ\u00adS\u0098ÃÕt\u0007\u0000q\u0091¢\u0014\u009c¹É4;´\u0014vFÛ³\rí¹Þ.\bèz\u0089W\f\u0081¦ò\u000b,ý\u0019iKþ¤L\u0096ØÃY=ìnqXü\u008a\u008cç>Ñ\u0083\u0002u|ñ\u0019¹ËÍ½\\nÙPt\u0005ù÷yØË\u008a\t\u007f\u0097!-\u0012«Ä:¶E\u009bõMG>ÚàcÕ½\u0087{h\u0083Z\u001e\u000f\u009fñ6¢§\u0094;T\u008b\u0086ÿðn#ë\u001dFHËºK\u0095ùÇ*2¨l\u001f_\u0086\u0089\\û$Öè\u0000)sú\u00adX\u0098ÏÊV%ì\u0017tB¸Î£\u001cÝjG¹Á\u0087pÒï /\u000f\u008d]\u0010¨\u0089ö\u0007Å±\u0013<aRLß\u009a@éÁ7M\u0002ðP>¿Ê\u008dEØ\u0087&;uºC'\u0091JüßÊO\u0019Ågh²¶\u00802\u0006(ÔC¢\u0098qZOí\u001a{èêÇ\f\u0095\u0085`\u001d>¢\r-Û Ò>\u0000Uv\u008e¥L\u009bûÎm<ü\u0013\u001fA\u0091´\u000bê·Ù;\u000fê}ÐPM\u0086Ïõ@+þ\u001e.Lè£\u001d\u0091\u008cÄ\u000f:³i._º\u008dÂàWÖÊ\u0005fìè>±H!\u009b¹¥\u001eð\u008e\u0002\t-¾\u007fa\u008a·Ô\u0003T\u009e\u0086õð.#ì\u001dAHËºD\u0095²Çr2®l\u0019_\u008d\u0089\u0014û~Öù\u0000\u007fs¢\u00adS\u0098ÄT\u0098\u0086ÿðs#ú\u001d\u0019i\u0081»ðÍm\u001eþ \u001euÕ\u0087Z¨±úv\u000f¿Q\u0011b\u0097´\u0015Æ;ëì=pNç\u0090N¥×hàº\u0082Ì\u0010\u001f\u0086!gt·\u0086\"©\u0085ûL\u000eÖPdcíµrÇ\nê\u009c<\b Ór±\u0004#×µéT¼\u009fN\u0000a¶3tÆå\u0098U«Õ}u\u000f?\"·ô%\u0087§Y\u0006l\u008fT\u009d\u0086ÿðm#û\u001d\u001aHÑºN\u0095øÇ02©l\u0014_¡\u0089\u0000ûwÖö\u0000uså\u00adN\u0098ÙOÙ\u009d²ëi8¢\u0006\u0016S\u0097¡\u0001\u008eôÜw)£wVD×\u0092Gà'Í°\u001b(h¯¶S\u0083\u0096Ñ\f>þ\fpYëz\u0003¨hÞ³\rq3ÆfP\u0094Á»eé°\u001c2B\u0080q\u0016§×Õîøs.ÿ]N\u0083É¶\\äÞ\u000b,T\u009e\u0086õð.#á\u001dPHÏº\u0006\u0095´Ç)2£l\u001c_\u009a\u0089JûtÖñ\u0000hsë\u00ad_\u0098ÒÊ^%¦\u0017+B¦¼\u0002Öø\u0004\u0093rH¡\u0098\u009f Ê«8*\u0017ÅEY°Øî8Ýú\u000bwy\u001dT\u0092\u0082\u0004ñÄ/:\u001a¯H&§Õ\u0095AÀÜ>`mè[e\u0089\u0018ä\u008cT\u009e\u0086õð.#ý\u001dMHÑº\\\u0095³Ç12äl\u0012_\u008b\u0089\rû~Öü\u0000(sê\u00adS\u0098ÎÊI%±\u00170B¸¼\u0004ï\u0095Ù\u0004\u000bdT\u009e\u0086õð.#ý\u001dMHÑº\\\u0095³Ç12\u0095l\u0015_\u0086\u0089\u0010û<Öú\u0000sså\u00adV\u0098ÄÊ\u0000%²\u0017+B¦¼\u0011ï\u0099Ù\u0018\u000b`fìPm\u0083ÜýLT\u009e\u0086õð.#ø\u001dQHÌºL\u0095¹Ç.2äl\u0012_\u008b\u0089\rû~Öü\u0000(sê\u00adS\u0098ÎÊI%±\u00170B¸¼\u0004ï\u0095Ù\u0004\u000bd\u0093®AÅ7\u001eäÈÚa\u008fü}|R\u0089\u0000\u001eõ¥«$\u0098¢N?<O\u0011\u0086ÇT´Éjc_ü\rzâÊÐ\u0014\u0085\u0091{((«\u001e?ÌR¡Þ\u0097FDë:fïâTÖT\u008d\u0086ôðd#ü\u001d[HËºL\u0095øÇ,2¯l\u0002_\u0093\u0089\rûaÖë\u0000osã\u00adT\u0098\u008eÊ|%\u0091\u0017\u0003B\u008c¼)ï¬Ù\"\u000b_fÐPA\u0083íýk(ò\u001amu\u008e§\u0005T\u0080\u0086¿ðl#Ù\u001d{Hõº\u007f\u0095äÇy2¸lD_Ê\u0089<ûdÖÀ\u0000Ysà\u00adV<\u0017în\u0098þKfuÁ QÒÖýb¯¶Z5\u0004\u00987\tá\u0097\u0093û¾qhõ\u001byÅÎð\u0014¢æM\u000b\u007f\u0099*\u0016Ô³\u00876±¸cÅ\u000eJ8Ûëw\u0095ì@irû\u001d\u0002Ï\u009fú\u0006¤½T\u008b\u0086ÿðt#Â\u001d]HÌºM\u0095çÇ\u00122¿l\u001d_\u009c\u0089\u0001û`TÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2ÿlDTÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2ÿlF\b ÚR¬È\u007fFAü\u0014mæäÉ\u001e\u009b\u0094n\u00020µTÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2ül@\u0080UR'$½÷3É\u0089\u009c\u0018n\u0091Ak\u0013áæt¸ÊTÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2ülDTÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2ülFTÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2ülHTÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2ýl@%\u0000÷r\u0081èRflÜ9MËÄä>¶´C \u001d\u009f ´òÆ\u0084\\WÒih<ùÎpá\u008a³\u0000F\u0094\u0018-TÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2ýlFlÔ¾¦È<\u001b²%\bp\u0099\u0082\u0010\u00adêÿ`\nôTA°Kb9\u0014£Ç-ù\u0097¬\u0006^\u008fqu#ÿÖd\u0088ÖTÝ\u0086¯ð5#»\u001d\u0001H\u0090º\u0019\u0095ãÇi2òlBRë\u0080\u0099ö\u0003%\u008d\u001b7N¦¼/\u0093ÕÁ_4ÄjrT\u008b\u0086ÿðt#À\u001dQHÖº_\u0095¹Ç.2¡l?_\u008e\u0089\u0001û`Öù\u0000rsã\u00adH\u0098îÊO%¹\u0017'T\u00ad\u0086ôðd#ü\u001d[HËºLT\u008b\u0086ÿðt#Ý\u001d]HÏº{\u0095³Ç.2£l\u0011_\u0092\u0089*ûgÖõ\u0000dsé\u00adHTÔ\u0086£ð0#¿\u001d\u0000H\u0093º\u0018\u0095åÇn2ûlA_Ï\u0089Uû*Ö\u00ad\u00007s¼\u00ad\r\u0098\u0092Ê\u001eøÝ*©\\\"\u008f\u008b±\u0017ä\u0096\u0016\r9ãkx\u009eõÀDóÍ%@W\rzª\u0096\u0015Da2úávßÈ\u008aXxÒW,\u0005¦ð0®\u008a\u009d\u0004K\u009e9è\u0014b7}å\t\u0093\u0082@<~§+\"Ù·öC¤ÏQu\u000fâTÜ\u0086ªð0#¾\u001d\u0004H\u0092º\u0018\u0095æÇl2úl@_Î\u0089Tû\"Ö¨\u0013.Á\u000f·\u0096d\u0011Z \u000f6ý½ÒB\u0080Îu\u000f+á\u0018<Î¦¼Ó\u0091\u000eG\u0091 \u0019rn\u0004÷×xéÅ¼RNÛa$3¡Æ6\u0098\u0084«\t}\u0092\u000fã\"hTÃ\u0086þðe#ø\u001d\u001bHÓºM\u0095»Ç)2\u0095l\u0000_\u0097\u0089\u0014ûw\u0085\u0016W+!°ò-ÌÎ\u0099\u0004k\u0092D`\u0016âãz½Ñ\u008e\u0004XÓ*¦\u0007>Ñ¶¢;|\u008eI\u001b\u001b\u009fô^Æð\u0093xmÍ>P\bÛTÃ\u0086þðe#ø\u001d\u001bHÑºG\u0095µÇ72¯l\u0004_Ñ\u0089\u0003ûwÖö\u0000\u007fsèTÃ\u0086þðe#ø\u001d\u001bHÑºG\u0095µÇ72¯l\u0004_Ñ\u0089\u0015ûwÖõ\u0000ssèTÃ\u0086éðy#ý\u001d\u001bHÓºM\u0095»Ç)2\u0095l\u0004_\u008c\u0089\u0005ûqÖý¸¦j\u008c\u001c\u001cÏ\u0098ñ%¤¢V y\u009c+UÞÆ\u0080w³´em\u0017\u001e:\u009fì\u0000\u009f¶A2t¤&'ÉÝûH®ÎPL\u0003ý5jç\u0017\u008a\u008e¼\u0006o\u0088\u0011,Ä¦ö$\u0099ÊK\u000b~Ø ~TÃ\u0086þðe#ø\u001d\u001bHÀº[\u0095¢Ç\u00032\u00adl\u0000_\u008dTÃ\u0086þðe#ø\u001d\u001bHÀº[\u0095¢Ç\u00032¾l\u0019_\u0093\u0089\u0001\u0098ÇJú<aïüÑ\u001f\u0084ÕvCY±\u000b3þ« \u0000\u0093ÕE\u00027e\u001aèÌd¿çaRTÀ\u0006Oé¢Û\"6Øäò\u0092bAæ\u007f[*ÜØ^÷â¥+P¸\u000e\t=Êë\u0013\u0099`´áb\u007f\u0011äÏUúÝ¨ZG£u= ¶Þ\u001f\u008d¸»\u001bie\u0004ì21áÚ\u009fL\u009e²L\u008f:\u0014é\u0089×j\u0082±p*_Ó\rLøØ¦b\u0095ê\r4ß\t©\u0092z\u000fDì\u00117ã¬ÌU\u009eÌkD5õ\u0006fÇ²\u0015\u008fc\u0014°\u0089\u008ejÛ±)*\u0006ÓT@¡ÞÿfÌá7¶å\u008b\u0093\u0010@\u008d~n+µÙ.ö×¤FQÍ\u000fl<îTÃ\u0086þðe#ø\u001d\u001bHÀº[\u0095¢Ç*2§l\u0003_\u0099TÃ\u0086þðe#ø\u001d\u001bHÀº[\u0095¢Ç,2\u00adl\u0011_\u0097\u0089\u0014ûq\u008a\u0088Xµ..ý³ÃP\u0096\u008bd\u0010Ké\u0019Hìè²V\u0081ÐTÃ\u0086þða#ú\u001dUH\u008dºL\u0095¹Ç+2¤l\u001c_\u0091\u0089\u0005ûvÖë\u0000)s¢\u00adB\u0098ÂÊ\u0001%¶\u00171B¼¼\u001dTÃ\u0086÷ðn#ú\u001d\u001bHÕºA\u0095¸Ç82¥l\u0007_\u008d\u0089KûPÖë\u0000rsß\u00adR\u0098ÁÊ\\%±\u0017&B\u008e¼\u0019ï\u0090Ù\u000e\u000bufì±\u008cc\u008f\u0015@ÆÃøg\u00adû_1p¸\"I×³\u0089'º³l)\u001eK3Øå\u0015\u0096âH#}µ/7À\u0099ò;§\u009fY!TÃ\u0086êðr#á\u001dWH\u008dºA\u0095¹Ç,2¥l\u0002_\u008a\u0089\u0017¶\u0016d6\u0012¬ÁdÿÄ>\u008dì¤\u009a<I¯w\u0019\"ÃÐ\u0015ÿý\u00ad~Xâ\u0006\u00115ÝãK\u0091,¼¥.lü\u000f\u008a\u0086Y\u0005g¿2*À¬ï\u001f½ÜHB\u0016û%}óå\u0081\u009c¬\fz\u0089\tE×®â(H6\u009aEìÔ?\u007f\u0001ÎTQ¦Í\u0089?Û\u0088.\u000fp²Cf\u0095¡çËTÃ\u0086ÿðt#í\u001d\u001bHÏºM\u0095²Ç52«l/_\u009d\u0089\u000bûvÖý\u0000esÿ\u00ad\u0014\u0098ØÊC%¸T\u008e\u0086öðu#ë\u001dGHÖºI\u0095µÇ72¹ap³LÅÇ\u0016^(¨}|\u008fô \u0010ò\u0081\u0007\rY°T\u009a\u0086øðo#ö\u001dGHÄTÃ\u0086þða#ú\u001dUH\u008dºL\u0095¹Ç+2¤l\u001c_\u0091\u0089\u0005ûvÖë\u0000)s¢\u00ad^\u0098ÐÊ\u0001%µ\u00172B¸¼\u0005ïÒÙ\u0012\u000b}fòS\u001f\u00816÷®$=\u001a\u008bOQ½\u0097\u0092zÀõ5\u007fkÂXD\u008e×2Hà\u0016\u0096\u008fE\t{±.(Ü¸ó]\u0006oÔ\u0004â\u009a0³F+\u0095¸«\u000eþÔ\f\u001c#àqa\u0084æÚEéÂ?NT\u009a\u0086øðo#ö\u001dSH×ºM\u0095¥Ç(TÃ\u0086þða#ú\u001dUH\u008dºE\u0095¿Ç/2©l__\u008e\u0089\u0016û}Öþ\u0000osà\u00ad_\u0098ÓÊ\u0001%·\u00177Bº¼YïÌÙE\u000bsfñPi\u0083\u009cýU(Ï\u001aOu¨§/\u0092¸Ì\u001d?\u0090i\u001c[8¶ñàoÓÝ\rKxÍª?\u0085½".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2337);
        setIconTintList = cArr;
        setY = 2585309408753845914L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = o.C0338nz.$$a
            int r8 = r8 + 97
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r7 = r7 + 1
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = r7 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0338nz.b(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 4
            int r9 = 1 - r9
            int r7 = r7 + 118
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = o.C0338nz.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L34
        L18:
            r3 = 0
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L34:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0338nz.c(byte, int, int, java.lang.Object[]):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1097
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.Object[] setIconTintList(android.content.Context r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 16289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0338nz.setIconTintList(android.content.Context, int, int):java.lang.Object[]");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(Context context, AttributeSet attributeSet, C0337ny c0337ny) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0323nk.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
            int i = obtainStyledAttributes.getInt(C0323nk.setIconTintList.setX, 0);
            int i2 = obtainStyledAttributes.getInt(C0323nk.setIconTintList.setUiOptions, 0);
            int i3 = C0323nk.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
            int color = obtainStyledAttributes.getColor(3, Color.parseColor("#6C6D72"));
            int i4 = C0323nk.setIconTintList.setIconTintList;
            int color2 = obtainStyledAttributes.getColor(4, Color.parseColor("#8C18171C"));
            int i5 = obtainStyledAttributes.getInt(C0323nk.setIconTintList.setY, 0);
            int i6 = C0323nk.setIconTintList.setUnboundedRipple;
            float dimension = obtainStyledAttributes.getDimension(5, nA.setX());
            c0337ny.setX = color;
            c0337ny.MenuHostHelper$$ExternalSyntheticLambda1 = color2;
            c0337ny.setUnboundedRipple = i5;
            c0337ny.setY = i2;
            c0337ny.setLayoutAnimation = i;
            float f = dimension * 2.0f;
            c0337ny.setOnLongClickListener = f;
            c0337ny.MenuHostHelper$$ExternalSyntheticLambda0 = f;
            obtainStyledAttributes.recycle();
        }
    }

    private static void a(int i, char c, int i2, Object[] objArr) {
        jp jpVar = new jp();
        long[] jArr = new long[i2];
        jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        while (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 < i2) {
            int i3 = jpVar.MenuHostHelper$$ExternalSyntheticLambda1;
            try {
                Object[] objArr2 = {Integer.valueOf(setIconTintList[i + jpVar.MenuHostHelper$$ExternalSyntheticLambda1])};
                Object obj = jC.setTextScaleX.get(-534561078);
                if (obj == null) {
                    byte b = (byte) ($$e & 5);
                    byte b2 = (byte) (b - 1);
                    Object[] objArr3 = new Object[1];
                    c(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY(313 - Color.argb(0, 0, 0, 0), (char) Color.alpha(0), 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod((String) objArr3[0], Integer.TYPE);
                    jC.setTextScaleX.put(-534561078, obj);
                }
                try {
                    Object[] objArr4 = {Long.valueOf(((Long) ((Method) obj).invoke(null, objArr2)).longValue()), Long.valueOf(jpVar.MenuHostHelper$$ExternalSyntheticLambda1), Long.valueOf(setY), Integer.valueOf(c)};
                    Object obj2 = jC.setTextScaleX.get(-1233430495);
                    if (obj2 == null) {
                        byte b3 = (byte) ($$e & 14);
                        byte b4 = (byte) (b3 - 2);
                        Object[] objArr5 = new Object[1];
                        c(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY(186 - Drawable.resolveOpacity(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), Color.red(0) + 4)).getMethod((String) objArr5[0], Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE);
                        jC.setTextScaleX.put(-1233430495, obj2);
                    }
                    jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    try {
                        Object[] objArr6 = {jpVar, jpVar};
                        Object obj3 = jC.setTextScaleX.get(-2123108845);
                        if (obj3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            Object[] objArr7 = new Object[1];
                            c(b5, b6, b6, objArr7);
                            obj3 = ((Class) jC.setY(269 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), TextUtils.indexOf((CharSequence) "", '0') + 5)).getMethod((String) objArr7[0], Object.class, Object.class);
                            jC.setTextScaleX.put(-2123108845, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr6);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        while (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 < i2) {
            cArr[jpVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) jArr[jpVar.MenuHostHelper$$ExternalSyntheticLambda1];
            try {
                Object[] objArr8 = {jpVar, jpVar};
                Object obj4 = jC.setTextScaleX.get(-2123108845);
                if (obj4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Object[] objArr9 = new Object[1];
                    c(b7, b8, b8, objArr9);
                    obj4 = ((Class) jC.setY(270 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 4 - ExpandableListView.getPackedPositionType(0L))).getMethod((String) objArr9[0], Object.class, Object.class);
                    jC.setTextScaleX.put(-2123108845, obj4);
                }
                ((Method) obj4).invoke(null, objArr8);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }
}