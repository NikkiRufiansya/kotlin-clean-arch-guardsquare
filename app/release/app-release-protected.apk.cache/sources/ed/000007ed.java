package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: o.op  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0355op extends C0354oo {
    private static char[] MenuHostHelper$$ExternalSyntheticLambda1;
    private static long setIconTintList;
    public static final byte[] $$d = {29, 64, 35, 67};
    public static final int $$e = 38;
    public static final byte[] $$a = {64, 34, -50, 73};
    public static final int $$b = 39;
    private static int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    private static int setY = 1;

    static {
        char[] cArr = new char[2448];
        ByteBuffer.wrap("TÃúU\t3X\rï·>ÚM\u00ad\u009c\u008b\"`qO\u0080'×àfØµ\u008aÄ\u009bj{¹XÈ3\u001f\u0003®øýÛ\f\u0092RaáG05G\u001a\u0096ûTÃúU\t3X\rï·>ÚM\u00ad\u009c\u008b\"`qO\u0080'×àfØµ\u008aÄ\u008ajv¹LÈ$\u001f9®ïýØ\f¿RqáC00TÃúU\t3X\rï·>ÚM\u00ad\u009c\u008b\"`qO\u0080'×àfØµ\u008aÄ\u0089jf¹RÈ\"TÃúB\t/X\bï·>ÐM\u00ad\u009c\u0083\"qqE\u0080+×¼f×µºÄ\u0096j{¹ZÈ(\u001f\u0015®ãý÷\f¯RsáC0 G\u001c\u0096ì%Ú0\"\u009eòm¬<\u0096\u008b\u0000Z^)Rø)Fù\u0015çäÖ³n\u0002dÑ\u000f b\u000eåÝÁ¬\u008f{¼Ê\u0011\u0099xh86ÿ\u0085ÂT¹#ãò\u0019Ay\u0010\u0010ÿ5\u0016`¸êKØ\u001a\u008e\u00adu|X\u000f@Þ+`ÿ3ëÂÆ\u0095[$R÷J\u0086z(É-E\u0083Òp¤!\u009e\u00961G_4#åO[ò\bÝù§®eVÓøD\u000b2Z\bí§<ÞO»\u009e\u009a :sI\u0082,ÕìdÐ\u0086\u000b(\u008aÛú\u008aÐ=1ì\u0007\u009fnN\u0000ð\u009e£§RË\u00054´\u000egx\u0016v¸¶k\u0080\u001aè\u0005Ï«AX(\tO¾Áoô\u001cþÍ\u0099s: nÑ:\u0086§7\u008cä¥\u0095Ä;+è{\u0099\u0010NTÿÿ¬\u009c]î\u0003 °fT\u008dúi\t\u000eX,ï½>üMç\u009cß\">q\u0013\u0080v×¶fÈµ§ÄÎj@¹cÈ\u0019TÃúB\t/X\bïì>ØM¯\u009cÈ\"hq@\u0080,×¼fÜµ¼Ä\u0098jq¹^Èo\u001f\u0015®äêlDº·Óæ÷Q\u0015\u0080'T°úp=Ö\u0093W`:1\u001d\u0086ùWÍ$ºõÝKs\u0018Ué5¾©\u000fËÜ¥\u00ad\u0082\u0003\u007fÐ\u007f¡\u0019v^Çð\u0094Øeµ;r\u0088\u000fY\".\u0003ÿåLÂ\u001d§ò\u009f@sTÃúB\t/X\bïì>ØM¯\u009cÈ\"fq@\u0080 ×¼fÞµ°Ä\u0097jj¹jÈ\f\u001fK®ûýÚ\f¢RbTÃúB\t/X\bïì>ØM¯\u009cÈ\"hq@\u0080,×¼fÜµ¼Ä\u0098jq¹YÈ,\u001f\u0013®Ýýå\f½R`áX0$GW\u0096í%ÌTÃúU\t3X\rï·>ÓM§\u009c\u008a\"qqN\u0080;×öfÃµ¡Ñ}\u007f½\u008c\u009bÝúj\u000e»7ÈM\u0019`§Éô¢\u0005ÂR\u0003ã'T\u0082úT\t7X\bïý>\u0093M¬\u009c\u0082\"pÎJ`È\u0093\u00adÂ\u009dur¤\u001b×-\u0006\u0007¸áëÅ\u001a´McüJ/(^\u0016ðû#ÆT\u0082úT\t;X\u000eïë>ÛT\u00adúG\tsXCï¢>ÑM\u008d\u009cÓ\"Sq\u001f\u0080t×ÿf\u0088µ\u008dÄ\u009bj^¹cÈu\u001fC®ÜTØúI\t\u0019X4ïô>ËMô\u009c\u009f\"hq\u0013\u00808×§fÂµ\u008aÄ¢jG¹JÈuT\u009eú^\txX\u000bïê>ÒM¦\u009c\u0092\"gq]\u0080`×þfÑµ»Ä\u008fjy¹]È\"\u001f\u0012®þýÚ\f¨R`T´ú\u0005\tlXOïô>âMð\u009cÓ\"2qH\u0080\u000f×©fÜµ§ÄÎj@¹sÈ7\u001f\\®½ýÉ\fè\u009ab4\u009dÇñ\u0096Ë!<ð\u001b\u0083\u007fRGì¢¿\u008eT\u0099ú_\t=X\u0015ï÷>ÊM¬Ö`x¶\u008bËÚûm\u001a¼;ÏX\u001eeÈEf\u0085\u0095£ÄÐs1¢\tÑ}\u0000I¾¼í\u0086\u001c»K,ú\u000e)xXHö§%\u0082Â¼lu\u009f\u001fÎ%y\u0086¨\u00adÛ\u0094Ô$zû\u0089\u0097Ø±oE¾{Í\u000eô=Zâ©\u008eø¨O\\\u009ebí\u0017<\u000e\u0082ÊÑ§ ÎBÒì\r\u001faNGù³(\u008d[ø\u008aá4%gH\u0096!Á\u0095pß£¸T\u009eú^\txX\u000bïê>ÒM¦\u009c\u0092\"gq]\u0080`×þfßµ±Ä\u009fjsT\u009fúU\t=\u0004Gª\u0092Yí\bÙ¿7n\u0007\u001dcÌ[T\u00adúA\t&X[ïÊ>ÈM¬\u009c\u0093\"mqD\u0080+×³fÖµºÄ\u0088j?¹\u007fÈ)\u001f\u0014®äýÅ\f¨\u001b\u0084µvF\u001b\u0017  Þqý\u0002\u008fÓîm~>DÏ,\u0098\u009a)ûú\u0089\u008bº%Zöa\u0087HP)áÍ²óCÄ\u001dC®&\u007fKD\u0095êg\u0019\nH1ÿÏ.ì]\u009e\u008cÿ2oaU\u0090=Ç\u008bvê¥\u0098Ô«zK©pØY\u000f8¾Üíâ\u001cÕBRñ7 ZW\u001e\u0086\u00905¯T\u009eú^\txX\u0013ïù>ÏM¦\u009c\u0090\"eq[\u0080+T\u008bú^\t:X\u001fïþ>ÔM±\u009c\u008fíKC\u0082°èáÒVq\u0087Z\u0002c¬\u00ad_Å\u000eå¹\rh50X\u009e\u0098m¾<Í\u008b,Z\u0014)`øTF¡\u0015\u009bä¦³7\u0002\u0004Ñr R\u000e½T\u009eú^\txX\u0010ïý>ÏM¬\u009c\u0082\"hq\u0007\u0080?×öfÝµ TÝT\u009eú^\txX\bïý>ÞM·\u009c\u0095\"aTÜÔ\u009fz_\u0089yØ\u0018oì¾ÕÍ¯\u001c\u0082¢+ñX\u0000=WýæÕ5¡D\u0098êjT\u008aúD\t:X\u0017ïÇ>ÅMú\u009cÑJ\u0099äY\u0017\u007fF\u001eñê ÓS©\u0082\u0084<-oH\u009e ÉúxÐ«·Ú\u008fth§IÖ/\u0001\u000f°øT\u008búT\t8X\u001eïê>ÔM¡\u009cÈ\"wqM\u0080%×¼f×µ°Ä\u0094jz¹NÈ(\u001f\u0005\u001c\u0019²ÆAª\u0010\u008c§xvF\u00053Ô*jî9\u0083Èê\u009f..Qý#\u008c\u0003\"ÒñÖ\u0080ëWÂæ6µ]D:\u001aî©Àx´\u000f\u0082Þomn<*ÓOa®T\u008búT\t8X\u001eïê>ÔM¡\u009cÈ\"cqF\u0080!×ôfÜµ°Ä¥jl¹XÈ*\u001fI®ìýÍ\f£RwáE0=G\u001aT\u008búT\t8X\u001eïê>ÔM¡\u009cÈ\"rqK\u0080!×ëf\u0088µãÄ\u008aj0¹JÈ#\u001f\t®óý\u0090\fûRbß\u0089q\\\u0082;Ó\u001edöµÚÆï\u0017\u0096©bú@\u000b\u0013\\öíÂ>¿O\u0097ás2[C\u001c\u0094\u001c%±v\u009c\u0087àÙwjP»8Ì\u001e\u001dî®Èÿ¡\u0010¸¢pó\u0015\u0004xÙ'wç\u0084ÁÕ bN³kÀ\u000f\u00112¯Òüñ\r\u0093ZOë{T\u009eú^\txX\u0019ï÷>ÒM¶\u009c\u008e\"iqH\u0080)×öf\u009eµ·Ä\u008fjv¹PÈ%\u001fH®íýÁ\f£RuáR0&G\t\u0096ì%Êt®\u009b\u0091×\u0002yð\u008a\u009dÛ¦lX½{Î\t\u001fe¡Óò¾\u0003×*·\u0084wwQ&0\u0091Ä@ý3\u0087âª\\\u0003\u000fdþ\u000e©É\u0018éË\u0090º²\u0014OÇ;¶\u0001a+ì³B\u007f±\u000eà$W\u009e\u000bG¥\u009dVý\u0007Í°ta\f\u0012vÃF}è.\u009aßé\u0088<9\u0007ê:\u009bH5¯æ\u0091\u0097ó@×vÁØ\b+gzRÍê\u001c\u0089oé¾\u0095\u00005S\u0014¢{õ¡D\u0087\u0097ìæßH0GAé\u0088\u001açKÒüj-\u0012^x\u008f\u00151¾b\u0094\u0093ùÄ*u3¦j×Gy®ª\u0085Ûï\fÛ'°\u0089yz\u0016+#\u009c\u009bMã>\u0089ïäQE\u0002gó\u0007¤á\u0015ùÆ\u009d·¹\u0019AÊx»\u0018l2\u0081[/\u009bÜ½\u008dÕ:8ë\n\u0098iIG÷\u00ad¤ÂUê\u00028³\u0011`b\u0011P¿³l\u009d\u001dªÊÒ{+(\u0000Ù}\u0087³T\u009eú^\txX\u0019ï÷>ÒM¶\u009cÉ\"uqL\u0080#×æf\u009eµ´Ä\u008cj{¹cÈ/\u001f\u0007®æýÍT\u009eú^\txX\u0014ïü>ÐMì\u009c\u0085\"qq@\u0080\"×÷f\u009eµ³Ä\u0093jq¹[È$\u001f\u0014®ûýÚ\f¤R|áCT\u009eú^\txX\u000bïê>ÒM¦\u009c\u0092\"gq]\u0080`×ñfÅµ¼Ä\u0096j{¹\u0012È'\u001f\u000f®åýÏ\f¨R`áG0&G\u0010\u0096ð%×v8Øø+Þz®ÍG\u001cho\u0010¾$\u0000ÏS¡¢\u008aõ@D\u007f\u0097\u001fæ8H\u0097\u009büê\u008e=®\u008cJßk.\u0019pÄÃã\u0012\u009be±´L\u001a9´ùGß\u0016¯¡Fpi\u0003\u0011Ò%lÎ?ÑÎ\u008c\u0099L(cû\\\u008a?$Í÷ò\u0086\u008aQ¥à\u0002³iB\u0003\u001cÛ¯÷~\u0096\t¬ØIkv:\u000eÕ,gÙîø@8³\u001eâkU\u009b\u0084µ÷À&î\u0098\u0010Ëa:Jm\u0080Ü¿\u000fß~øÐW\u0003<rN¥n\u0014\u008aG«¶Ùè\u0004[#\u008a[ýq,\u008cT\u009eú^\txX\rïý>ÓM¦\u009c\u0088\"vqv\u0080*×ÿfÛµ¸ÄÔj}¹IÈ(\u001f\n®ïý\u0086\f«R{áY03G\u001c\u0096ì%Ót²\u009b\u008c)dx[T»úp\t`X\rïÇ>êMº\u009c°\"2q\u0011\u0080<×ËfÂµ£Ä\u008cj)TÖT\u008dú_\t2X\tï÷>ÔM¦\u009cÉ\"tqL\u0080<×þfÙµ¦Ä\u0089jv¹SÈ/\u001fH®Ùýí\f\u008cRVáh0\u0004G1\u0096Ñ%ít\u0085\u009bº)Yx{\u008f\rÞÅmósóÝ!.L\u007fwÈ\u0089\u0019ªjØ»·\u0005\u001bV'§@ðÃA\u008f\u0092ÈãðM\b\u009e4ïV8l\u0089\u008cÚ\u0082+Ûu\u001eÆ,\u0017K`cT\u008fúD\t$X\tïý>ÓM¶\u009c¦\"tqY\u0080\"×úfÓµ´Ä\u008ejv¹SÈ/T\u008dú_\t2X\tï÷>ÔM¦\u009cÉ\"gqF\u0080 ×çfÕµ»Ä\u008ej1¹\u007fÈ.\u001f\b®ÿýÍ\fµRfT\u008fúY\t3X\u0018ïó>þM£\u009c\u008b\"hq@\u0080 ×ôfÿµ§Ä©jz¹PÈ'\u001f6®îýÚ\f R{áD0'G\u0010\u0096ñ%ÍT\u008dú_\t2X\tï÷>ÔM¦\u009cÉ\"tqL\u0080<×þfÙµ¦Ä\u0089jv¹SÈ/\u001fH®Ùýí\f\u008cRVáh0\u0004G1\u0096Ñ%ít\u0085\u009bº)Dxz\u008f\u0001ÞÓmó¼\u0089Ã«Û\u009du\t\u0086'×1`Ê±÷Â\u0088\u0013È\u00ad<þF\u000fgXºéõ:¾K¿å]6MG0=f\u0093¹`Ï1Ú\u0086\u001cW>$Jõ;K§\u0018±éÎ¾\u001c\u000f8ÜJTÝú\u0004\tcXNï\u00ad>\u008fMó\u009cÒ\"1q\u001c\u0080zTÝú\u0004\tcXNï\u00ad>\u008fMó\u009cÒ\"1q\u001c\u0080x\u008aï$6×Q\u0086|1\u009fà½\u0093ÁBàü\u0003¯.^Dªy\u0004 ÷Ç¦ê\u0011\tÀ+³WbvÜ\u0095\u008f»~ÚTÝú\u0004\tcXNï\u00ad>\u008fMó\u009cÒ\"1q\u001f\u0080|TÝú\u0004\tcXNï\u00ad>\u008fMó\u009cÒ\"1q\u001f\u0080záÃO\u001a¼}íPZ³\u008b\u0091øí)Ì\u0097/Ä\u00015fTÝú\u0004\tcXNï\u00ad>\u008fMó\u009cÒ\"1q\u001f\u0080vTÝú\u0004\tcXNï\u00ad>\u008fMó\u009cÒ\"1q\u001e\u0080~-À\u0083\u0019p~!S\u0096°G\u00924îåÏ[,\b\u0003ùa\u0080c.ºÝÝ\u008cð;\u0013ê1\u0099MHlö\u008f¥ TÄ½*\u0013óà\u0094±¹\u0006Z×x¤\u0004u%ËÆ\u0098éi\u008féyG ´ÇåêR\t\u0083+ðW!v\u009f\u0095Ìº=ÒTÝú\u0004\tcXNï\u00ad>\u008fMó\u009cÒ\"1q\u0011\u0080~TÝú\u0004\tcXNï\u00ad>\u008fMó\u009cÒ\"1q\u0011\u0080|\u008fL!\u0095Òò\u0083ß4<å\u001e\u0096bGCù ª\u0080[ëT\u008búT\t\"X5ïý>ÉMµ\u009c\u0088\"vqB\u0080\u0001×ãfÕµ§Ä\u009bjk¹SÈ3\u001f(®êýÅ\f¨T\u00adú_\t2X\tï÷>ÔM¦T\u008búT\t\"X(ïñ>ÐM\u0091\u009c\u0082\"vq@\u0080/×ÿfþµ Ä\u0097j}¹YÈ3^óð/\u0003ARmå\u008b4«GÕ\u0096ó(\u0011{?\u008aXÝ\u0085l¦¿ÊÎè`\t³+ÂQ\u0015s¤\u009c\u0013¬½sN\u0005\u001f\u000f¨Êyø\n\u0096Û£eQ6gÇ\u000b\u0090Ñ!åò»\u0083¹\u008e\u0003 ÜÓº\u0082\u00955räQ\u0097.F\u000bøè«ÅZ¢\r\u007f¼\\o9\u001e\u0016T\u008búT\t\"X?ïý>ËM«\u009c\u0084\"aq`\u0080*À\u0011nÌ\u009d«Ì\u0086{eª@Ù?\b\u001a¶ùåÔ\u0014³CnòM!(P\u0007T\u0089ú\u0003\tgXCï«>\u008eMð\u009cÔ\"1qK\u0080x×öfÕµ³ÄËj/³j\u001d¶îÒ¿þ\b\u001aÙ>ªB{fÅ\u008a\u0096¦gÉ0\u0017\u00815RW#yTÃúU\t3X\rï·>ÌM§\u009c\u008a\"qqv\u0080>×úfÀµ°TÃúU\t3X\rï·>ÎM\u00ad\u009c\u0084\"oqL\u0080:×¼fÒµ´Ä\u0089jz¹^È \u001f\b®ïý÷\fªRwáY0-G\u001dTÃúU\t3X\rï·>ÎM\u00ad\u009c\u0084\"oqL\u0080:×¼f×µ°Ä\u0094jf¹X\u0084~*èÙ\u008e\u0088°?\nîs\u009d\u0010L9òÒ¡ñP\u0087\u0007\u0001¶|e\r\u0014*º×iåü\u009aR\u001b¡vðQGî\u0096\u0095åþ4Ó\u008a(Ù/(c\u007f¸Î\u0088\u001dïlÆ¢\u008a\f\u000bÿf®A\u0019¥È\u0091»æj\u0081Ô!\u0087\tve!õ\u0090\u0095Cõ2Ñ\u009c5O*>eéNX®\u000b\u008dúë¤8\u0017!Æy±U`µÓ\u009f\u0082îmóß2\u008e\u0003yh(\u00ad\u009bÑJá5ÞTÃúU\t3X\rï·>ßM±\u009c\u0093\"[qN\u0080>×àTÃúU\t3X\rï·>ßM±\u009c\u0093\"[q]\u0080'×þfÕTÃúU\t3X\rï·>ÎM\u00ad\u009c\u0084\"oqL\u0080:×¼fÒµ¦Ä\u008ejy¹SÈ-\u001f\u0002®îýÚ\f©TÃúB\t/X\bïì>ØM¯\u009cÈ\"hq@\u0080,×¼fÜµ¼Ä\u0098j}¹OÈ5\u001f\u0000®äýÄ\f©RwáE0\u000bG\u0013\u0096ð%Êtî\u009b\u0096)eTÃúU\t3X\rï·>ßM±\u009c\u0093\"eqJ\u0080-×öQÄÿR\f4]\nê°;ØH¶\u0099\u0094'dtW\u0085;Òûq\\ßÊ,¬}\u0092Ê(\u001b@h.¹\f\u0007öTÓ¥¶òbôcZõ©\u0093ø\u00adO\u0017\u009e\u007fí\u0011<3\u0082ËÑû \u0087wVTÃúU\t3X\rï·>ßM±\u009c\u0093\"rqD\u0080=×ôTÃúU\t3X\rï·>ßM±\u009c\u0093\"tqN\u0080/×úfÀµ¶TÃúU\t3X\rï·>ßM±\u009c\u0093\"[q@\u0080#×ö½\u0087\u0013\u0011às±K\u0006½×Ö¤âuÌË7\u0098\u0003if>¸\u008f\u0095\\õ-Í\u0083tPV!}ö@Gà\u0014\u008eåú»\"\b\u0018è\bF\u0097µóäÄS|\u0082\u0001ñ` B\u009e«Í\u008d<òk+ÚT\t\\xBÖ \u0005¤tâ£Ì\u00122A\u0006°bî\u009f]\u0093\u008cóûÖ*0\u0099\u001aTdúÌ\tþXÞï#>\fM3\u009ca\"ùq¸\u0080ñ×6f\u0015µdÄRjä¹ºÈ°\u001f\u009b®zý\r\f\\R\u00adá\u0088~\u008cÐ\u000e#kr[Å´\u0014Ýgä¶Ç\b;[\tªsý¨L\u008c5Õ\u009b^h99R\u008e«TÃúA\t$X\u0014ïû>\u0092M±\u009c\u0082\"hqO\u0080a×þfÑµ¥Ä\u0089¬{\u0002³ñÇ ç\u0017\u0004Æ\"µQd9Ú\u0093\u0089¶xÒ/\u0007\u009e&ML<y\u0092\u0087Aâ0Âçù`-Îõ=\u0099l\u0091Ûy\nUy<¨\u0015\u0016ËE÷´\u0097ã\u0010Rn\u0081\u0017N\u000fà\u0098\u0013îBÔõ{$\u001cWk\u0086O8¡k\u0084\u009aÝÍ<|\u0013¯}ÞSp°£\u0083Ò£\u0005Ò´*ç\bT\u008eú]\t#X\u001eïë>ÉM£\u009c\u0084\"oqZ3·\u009d nV?l\u0088ÃY¤*ÙûæE\u001e\u0016)çIT\u009aúS\t9X\u0003ïë>ÛciÍÿ>\u009do¥ØS\t8z\f«\"\u0015ÙFí·\u0088àVQ{\u0082\u001bó#]\u009a\u008e¸ÿ\u008f(¼\u0099\u000eÊc;\u0017eÈÖî\u0007Ðp«¡Y\u0012eT\u008dúI\tlXCïê>\u008bM£\u009cÂ\"<q\u001b\u0080k×©fçµ\u008aÄ\u008cj@¹\u0006È-\u001f\n®±ý\u009c\f\u0092Rdá\u00030&G\u000b\u0096¨%üTÃúA\t$X\u0014ïû>\u0092M¡\u009c\u0097\"qq@\u0080 ×õfßT«ú^\t:X\u001fïþ>ÔM±\u009c\u008f\u000b÷¥uV\u0010\u0007 °Ïa¦\u0012\u009bÃ¼}T.hß\u0016\u0088Â9÷T\u009aúS\t9X\u0003ïÿ>ÈM§\u009c\u0094\"pTÃúU\t7X\u000fïù>\u0092M¯\u009c\u008e\"wqJ\u0080a×ãfÂµºÄ\u009cjv¹PÈ$\u001f\u0015®¤ýË\f¸R`á\u00180dGV\u0096ý%Ìt\u00ad\u009bË)gxF\u008f/ÞãmÙ¼\u00adÃ\u0091\u0011o V÷i\u0006\tUìäÃ\u000b\u0086YyèX??".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2448);
        MenuHostHelper$$ExternalSyntheticLambda1 = cArr;
        setIconTintList = 8941328267581782577L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 97
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = o.C0355op.$$a
            int r5 = r5 * 4
            int r5 = r5 + 1
            byte[] r1 = new byte[r5]
            int r5 = r5 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r3 = 0
            r7 = r6
            goto L29
        L17:
            r3 = 0
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0355op.a(short, int, byte, java.lang.Object[]):void");
    }

    private static void c(int i, byte b, byte b2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 3 - (b * 3);
        int i3 = (b2 * 4) + 1;
        int i4 = 120 - i;
        byte[] bArr2 = new byte[i3];
        int i5 = -1;
        int i6 = i3 - 1;
        if (bArr == null) {
            i4 += i6;
            i6 = i6;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            i2++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            Object[] objArr2 = objArr;
            int i8 = i6;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            i4 += bArr[i2];
            i6 = i8;
            objArr = objArr2;
            bArr = bArr4;
            bArr2 = bArr3;
            i5 = i7;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 1104
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.Object[] setX(android.content.Context r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 16475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0355op.setX(android.content.Context, int, int):java.lang.Object[]");
    }

    private static void b(int i, char c, int i2, Object[] objArr) {
        jp jpVar = new jp();
        long[] jArr = new long[i2];
        jpVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        while (jpVar.MenuHostHelper$$ExternalSyntheticLambda1 < i2) {
            int i3 = jpVar.MenuHostHelper$$ExternalSyntheticLambda1;
            try {
                Object[] objArr2 = {Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda1[i + jpVar.MenuHostHelper$$ExternalSyntheticLambda1])};
                Object obj = jC.setTextScaleX.get(-534561078);
                if (obj == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    Object[] objArr3 = new Object[1];
                    c(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY(313 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) Color.green(0), 5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getMethod((String) objArr3[0], Integer.TYPE);
                    jC.setTextScaleX.put(-534561078, obj);
                }
                try {
                    Object[] objArr4 = {Long.valueOf(((Long) ((Method) obj).invoke(null, objArr2)).longValue()), Long.valueOf(jpVar.MenuHostHelper$$ExternalSyntheticLambda1), Long.valueOf(setIconTintList), Integer.valueOf(c)};
                    Object obj2 = jC.setTextScaleX.get(-1233430495);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Object[] objArr5 = new Object[1];
                        c(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY(187 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), 4 - Color.red(0))).getMethod((String) objArr5[0], Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE);
                        jC.setTextScaleX.put(-1233430495, obj2);
                    }
                    jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    try {
                        Object[] objArr6 = {jpVar, jpVar};
                        Object obj3 = jC.setTextScaleX.get(-2123108845);
                        if (obj3 == null) {
                            byte b5 = (byte) ($$e & 11);
                            byte b6 = (byte) (b5 - 2);
                            Object[] objArr7 = new Object[1];
                            c(b5, b6, b6, objArr7);
                            obj3 = ((Class) jC.setY(Color.rgb(0, 0, 0) + 16777485, (char) (MotionEvent.axisFromString("") + 1), 4 - ExpandableListView.getPackedPositionType(0L))).getMethod((String) objArr7[0], Object.class, Object.class);
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
                    byte b7 = (byte) ($$e & 11);
                    byte b8 = (byte) (b7 - 2);
                    Object[] objArr9 = new Object[1];
                    c(b7, b8, b8, objArr9);
                    obj4 = ((Class) jC.setY(269 - TextUtils.indexOf("", "", 0), (char) TextUtils.indexOf("", ""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3)).getMethod((String) objArr9[0], Object.class, Object.class);
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