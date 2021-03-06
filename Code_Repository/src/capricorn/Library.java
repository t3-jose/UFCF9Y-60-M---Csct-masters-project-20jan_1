package capricorn;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {

    public static List<String> logs = new ArrayList<>();

    //<editor-fold defaultstate="collapsed" desc="getExtensionList">
    /**
     * Using a different class (and not a database), the list of extensions is
     * easy to manage and doesn't use loads of space in another class.
     *
     * @return a list with all the extensions that will be used to generate
     * honeypot files
     */
    public static List<String> getExtensionList() {
        List<String> extensions = new ArrayList<>();
        extensions.add(".a");
        extensions.add(".aaa");
        extensions.add(".aac");
        extensions.add(".aap");
        extensions.add(".ab");
        extensions.add(".acc");
        extensions.add(".acf");
        extensions.add(".acl");
        extensions.add(".acme");
        extensions.add(".adr");
        extensions.add(".aff");
        extensions.add(".aidl");
        extensions.add(".aif");
        extensions.add(".ain");
        extensions.add(".al");
        extensions.add(".amr");
        extensions.add(".apc");
        extensions.add(".apk");
        extensions.add(".app");
        extensions.add(".aru");
        extensions.add(".asa");
        extensions.add(".asax");
        extensions.add(".ascx");
        extensions.add(".ashx");
        extensions.add(".asi");
        extensions.add(".asm");
        extensions.add(".asmx");
        extensions.add(".asn");
        extensions.add(".aspx");
        extensions.add(".asx");
        extensions.add(".au");
        extensions.add(".avi");
        extensions.add(".awk");
        extensions.add(".bak");
        extensions.add(".bar");
        extensions.add(".bash");
        extensions.add(".bat");
        extensions.add(".bay");
        extensions.add(".bbsm");
        extensions.add(".bdr");
        extensions.add(".beb");
        extensions.add(".big5");
        extensions.add(".bin");
        extensions.add(".bkup");
        extensions.add(".bl5");
        extensions.add(".blf");
        extensions.add(".blob");
        extensions.add(".bmp");
        extensions.add(".bmpr");
        extensions.add(".bnk");
        extensions.add(".bsp");
        extensions.add(".bt");
        extensions.add(".bu");
        extensions.add(".c");
        extensions.add(".c4h");
        extensions.add(".ca");
        extensions.add(".cab");
        extensions.add(".cat");
        extensions.add(".cbp");
        extensions.add(".cd");
        extensions.add(".cer");
        extensions.add(".cf");
        extensions.add(".cfg");
        extensions.add(".cgi");
        extensions.add(".chk");
        extensions.add(".chm");
        extensions.add(".chr");
        extensions.add(".chw");
        extensions.add(".cif");
        extensions.add(".clr");
        extensions.add(".cmd");
        extensions.add(".cnf");
        extensions.add(".cnt");
        extensions.add(".cnv");
        extensions.add(".com");
        extensions.add(".conf");
        extensions.add(".core");
        extensions.add(".cpp");
        extensions.add(".cr2");
        extensions.add(".crc");
        extensions.add(".crt");
        extensions.add(".crx");
        extensions.add(".cs");
        extensions.add(".csh");
        extensions.add(".cso");
        extensions.add(".css");
        extensions.add(".csv");
        extensions.add(".cur");
        extensions.add(".d");
        extensions.add(".dat");
        extensions.add(".db");
        extensions.add(".dbml");
        extensions.add(".dd");
        extensions.add(".dds");
        extensions.add(".de");
        extensions.add(".def");
        extensions.add(".dem");
        extensions.add(".dev");
        extensions.add(".dex");
        extensions.add(".dfm");
        extensions.add(".dgml");
        extensions.add(".dgsl");
        extensions.add(".dhcp");
        extensions.add(".dic");
        extensions.add(".dict");
        extensions.add(".dir");
        extensions.add(".dll");
        extensions.add(".dll2");
        extensions.add(".dmp");
        extensions.add(".doc");
        extensions.add(".docx");
        extensions.add(".dotx");
        extensions.add(".dpf");
        extensions.add(".dpr");
        extensions.add(".dsp");
        extensions.add(".dsw");
        extensions.add(".dt");
        extensions.add(".dtd");
        extensions.add(".dub");
        extensions.add(".dump");
        extensions.add(".dxf");
        extensions.add(".e2x");
        extensions.add(".edb");
        extensions.add(".efi");
        extensions.add(".eftx");
        extensions.add(".ekv");
        extensions.add(".el");
        extensions.add(".elf");
        extensions.add(".emf");
        extensions.add(".en");
        extensions.add(".enc");
        extensions.add(".eo");
        extensions.add(".eot");
        extensions.add(".eps");
        extensions.add(".epub");
        extensions.add(".erx");
        extensions.add(".es");
        extensions.add(".esam");
        extensions.add(".etl");
        extensions.add(".euc");
        extensions.add(".ev3");
        extensions.add(".exe");
        extensions.add(".exe2");
        extensions.add(".exec");
        extensions.add(".ez2");
        extensions.add(".f5");
        extensions.add(".f90");
        extensions.add(".f95");
        extensions.add(".fav");
        extensions.add(".fbp");
        extensions.add(".fd");
        extensions.add(".fl");
        extensions.add(".fld");
        extensions.add(".flt");
        extensions.add(".flv");
        extensions.add(".form");
        extensions.add(".fr");
        extensions.add(".frag");
        extensions.add(".frm");
        extensions.add(".frx");
        extensions.add(".fxml");
        extensions.add(".fxo");
        extensions.add(".g4");
        extensions.add(".gam");
        extensions.add(".gdb");
        extensions.add(".gif");
        extensions.add(".git");
        extensions.add(".gpd");
        extensions.add(".gpl");
        extensions.add(".gra");
        extensions.add(".gui");
        extensions.add(".gz");
        extensions.add(".h");
        extensions.add(".h3c");
        extensions.add(".hex");
        extensions.add(".hint");
        extensions.add(".hlp");
        extensions.add(".hlx");
        extensions.add(".hmm");
        extensions.add(".hp");
        extensions.add(".hpp");
        extensions.add(".hr");
        extensions.add(".hs");
        extensions.add(".htm");
        extensions.add(".html");
        extensions.add(".hu");
        extensions.add(".hxc");
        extensions.add(".hxk");
        extensions.add(".hxs");
        extensions.add(".hxt");
        extensions.add(".i64");
        extensions.add(".iana");
        extensions.add(".icns");
        extensions.add(".ico");
        extensions.add(".idb");
        extensions.add(".idc");
        extensions.add(".idea");
        extensions.add(".idl");
        extensions.add(".ids");
        extensions.add(".idx");
        extensions.add(".ie5");
        extensions.add(".iea");
        extensions.add(".iic");
        extensions.add(".img");
        extensions.add(".iml");
        extensions.add(".inc");
        extensions.add(".inf");
        extensions.add(".info");
        extensions.add(".ini");
        extensions.add(".ins");
        extensions.add(".int");
        extensions.add(".iso");
        extensions.add(".iso9");
        extensions.add(".it");
        extensions.add(".itk");
        extensions.add(".ix");
        extensions.add(".ja");
        extensions.add(".jar");
        extensions.add(".java");
        extensions.add(".jfpr");
        extensions.add(".jfrm");
        extensions.add(".jks");
        extensions.add(".jnlp");
        extensions.add(".jpeg");
        extensions.add(".jpg");
        extensions.add(".jrs");
        extensions.add(".jrtx");
        extensions.add(".js");
        extensions.add(".js1");
        extensions.add(".json");
        extensions.add(".jsp");
        extensions.add(".jspf");
        extensions.add(".jspx");
        extensions.add(".jsx");
        extensions.add(".jtp");
        extensions.add(".keep");
        extensions.add(".key");
        extensions.add(".ks");
        extensions.add(".l64");
        extensions.add(".la");
        extensions.add(".last");
        extensions.add(".ld");
        extensions.add(".ldf");
        extensions.add(".ldif");
        extensions.add(".ldw");
        extensions.add(".less");
        extensions.add(".lex");
        extensions.add(".lib");
        extensions.add(".list");
        extensions.add(".lng");
        extensions.add(".lnk");
        extensions.add(".load");
        extensions.add(".lock");
        extensions.add(".log");
        extensions.add(".log1");
        extensions.add(".log2");
        extensions.add(".lst");
        extensions.add(".lua");
        extensions.add(".luac");
        extensions.add(".m");
        extensions.add(".m3u");
        extensions.add(".m3u8");
        extensions.add(".m4a");
        extensions.add(".ma3");
        extensions.add(".man");
        extensions.add(".map");
        extensions.add(".maps");
        extensions.add(".md");
        extensions.add(".md5");
        extensions.add(".mdf");
        extensions.add(".mdmp");
        extensions.add(".mds");
        extensions.add(".me");
        extensions.add(".med");
        extensions.add(".menu");
        extensions.add(".meru");
        extensions.add(".mf");
        extensions.add(".mfl");
        extensions.add(".mgc");
        extensions.add(".mgcb");
        extensions.add(".mkv");
        extensions.add(".mo");
        extensions.add(".mod");
        extensions.add(".mof");
        extensions.add(".mov");
        extensions.add(".mp3");
        extensions.add(".mp4");
        extensions.add(".msg");
        extensions.add(".msi");
        extensions.add(".msp");
        extensions.add(".mst");
        extensions.add(".mui");
        extensions.add(".n++");
        extensions.add(".nav");
        extensions.add(".nb");
        extensions.add(".ned");
        extensions.add(".nef");
        extensions.add(".net");
        extensions.add(".nfo");
        extensions.add(".nl");
        extensions.add(".no");
        extensions.add(".nsh");
        extensions.add(".nsi");
        extensions.add(".ntua");
        extensions.add(".nut");
        extensions.add(".nwn");
        extensions.add(".ny4");
        extensions.add(".o");
        extensions.add(".obi");
        extensions.add(".obj");
        extensions.add(".ocx");
        extensions.add(".odc");
        extensions.add(".odf");
        extensions.add(".odp");
        extensions.add(".ogg");
        extensions.add(".olb");
        extensions.add(".old");
        extensions.add(".ont");
        extensions.add(".opal");
        extensions.add(".opax");
        extensions.add(".opus");
        extensions.add(".orp");
        extensions.add(".osp");
        extensions.add(".otf");
        extensions.add(".out");
        extensions.add(".ova");
        extensions.add(".own");
        extensions.add(".p4z");
        extensions.add(".p64");
        extensions.add(".p7x");
        extensions.add(".pack");
        extensions.add(".pak");
        extensions.add(".pal");
        extensions.add(".pas");
        extensions.add(".pat");
        extensions.add(".pbk");
        extensions.add(".pc");
        extensions.add(".pck");
        extensions.add(".pdb");
        extensions.add(".pdf");
        extensions.add(".pdn");
        extensions.add(".pem");
        extensions.add(".pfx");
        extensions.add(".php");
        extensions.add(".pidb");
        extensions.add(".pl");
        extensions.add(".pla");
        extensions.add(".plw");
        extensions.add(".plx");
        extensions.add(".pm");
        extensions.add(".png");
        extensions.add(".po");
        extensions.add(".pot");
        extensions.add(".potx");
        extensions.add(".ppd");
        extensions.add(".ppk");
        extensions.add(".ppkg");
        extensions.add(".ppm");
        extensions.add(".ppt");
        extensions.add(".pptx");
        extensions.add(".prf");
        extensions.add(".pri");
        extensions.add(".pro");
        extensions.add(".prop");
        extensions.add(".ps");
        extensions.add(".ps1");
        extensions.add(".psd");
        extensions.add(".psd1");
        extensions.add(".psm1");
        extensions.add(".psp");
        extensions.add(".pt");
        extensions.add(".pub");
        extensions.add(".py");
        extensions.add(".pyc");
        extensions.add(".pyd");
        extensions.add(".pyw");
        extensions.add(".qc");
        extensions.add(".qm");
        extensions.add(".qss");
        extensions.add(".r0");
        extensions.add(".rad");
        extensions.add(".raf");
        extensions.add(".rap");
        extensions.add(".rar");
        extensions.add(".rb");
        extensions.add(".rc");
        extensions.add(".rct");
        extensions.add(".reg");
        extensions.add(".rels");
        extensions.add(".res");
        extensions.add(".resp");
        extensions.add(".resx");
        extensions.add(".rll");
        extensions.add(".rmi");
        extensions.add(".rs");
        extensions.add(".rsa");
        extensions.add(".rsp");
        extensions.add(".rtf");
        extensions.add(".ru");
        extensions.add(".s");
        extensions.add(".sav");
        extensions.add(".scr");
        extensions.add(".scs");
        extensions.add(".scss");
        extensions.add(".sde");
        extensions.add(".sdf");
        extensions.add(".sf");
        extensions.add(".sfk");
        extensions.add(".sg");
        extensions.add(".sh");
        extensions.add(".shp");
        extensions.add(".sig");
        extensions.add(".sjis");
        extensions.add(".sk");
        extensions.add(".skel");
        extensions.add(".skip");
        extensions.add(".sl");
        extensions.add(".sln");
        extensions.add(".so");
        extensions.add(".spa");
        extensions.add(".spec");
        extensions.add(".spl");
        extensions.add(".sql");
        extensions.add(".sr");
        extensions.add(".srt");
        extensions.add(".ssl");
        extensions.add(".stg");
        extensions.add(".stl");
        extensions.add(".sug");
        extensions.add(".suo");
        extensions.add(".suv");
        extensions.add(".sv");
        extensions.add(".svc");
        extensions.add(".svg");
        extensions.add(".swf");
        extensions.add(".sys");
        extensions.add(".t4");
        extensions.add(".tag");
        extensions.add(".tar");
        extensions.add(".tcc");
        extensions.add(".tcl");
        extensions.add(".tcsh");
        extensions.add(".test");
        extensions.add(".tga");
        extensions.add(".thm");
        extensions.add(".thmx");
        extensions.add(".til");
        extensions.add(".tile");
        extensions.add(".time");
        extensions.add(".tlb");
        extensions.add(".tld");
        extensions.add(".tlog");
        extensions.add(".tm");
        extensions.add(".tmp");
        extensions.add(".tpl");
        extensions.add(".tra");
        extensions.add(".ts");
        extensions.add(".tsx");
        extensions.add(".tt");
        extensions.add(".ttf");
        extensions.add(".ttx");
        extensions.add(".txt");
        extensions.add(".udd");
        extensions.add(".unix");
        extensions.add(".url");
        extensions.add(".user");
        extensions.add(".usr");
        extensions.add(".uue");
        extensions.add(".vb");
        extensions.add(".vbf");
        extensions.add(".vbp");
        extensions.add(".vbs");
        extensions.add(".vbw");
        extensions.add(".vcs");
        extensions.add(".vdf");
        extensions.add(".vdi");
        extensions.add(".veg");
        extensions.add(".vert");
        extensions.add(".vfe");
        extensions.add(".vim");
        extensions.add(".vlt");
        extensions.add(".vm");
        extensions.add(".vmf");
        extensions.add(".vmt");
        extensions.add(".vpk");
        extensions.add(".vpp");
        extensions.add(".vqp");
        extensions.add(".vs");
        extensions.add(".vsa1");
        extensions.add(".vsdx");
        extensions.add(".vsix");
        extensions.add(".vsk");
        extensions.add(".vsz");
        extensions.add(".vtf");
        extensions.add(".vux");
        extensions.add(".vxd");
        extensions.add(".w32");
        extensions.add(".w64");
        extensions.add(".wad");
        extensions.add(".wap");
        extensions.add(".war");
        extensions.add(".wav");
        extensions.add(".webm");
        extensions.add(".wer");
        extensions.add(".win");
        extensions.add(".win7");
        extensions.add(".wll");
        extensions.add(".wmdb");
        extensions.add(".wmf");
        extensions.add(".wmv");
        extensions.add(".wmz");
        extensions.add(".woff");
        extensions.add(".wpk");
        extensions.add(".wpl");
        extensions.add(".wrc");
        extensions.add(".wsdl");
        extensions.add(".wsf");
        extensions.add(".wtm");
        extensions.add(".wts");
        extensions.add(".ww");
        extensions.add(".wxs");
        extensions.add(".x");
        extensions.add(".xa");
        extensions.add(".xaml");
        extensions.add(".xap");
        extensions.add(".xbf");
        extensions.add(".xbm");
        extensions.add(".xbn");
        extensions.add(".xcf");
        extensions.add(".xla");
        extensions.add(".xlam");
        extensions.add(".xll");
        extensions.add(".xls");
        extensions.add(".xls5");
        extensions.add(".xlsx");
        extensions.add(".xltx");
        extensions.add(".xml");
        extensions.add(".xn");
        extensions.add(".xom");
        extensions.add(".xoml");
        extensions.add(".xpi");
        extensions.add(".xr");
        extensions.add(".xrc");
        extensions.add(".xsd");
        extensions.add(".xsl");
        extensions.add(".xslt");
        extensions.add(".xsn");
        extensions.add(".xss");
        extensions.add(".xu");
        extensions.add(".y0n");
        extensions.add(".yaml");
        extensions.add(".yang");
        extensions.add(".yes");
        extensions.add(".ygf");
        extensions.add(".yml");
        extensions.add(".ys0");
        extensions.add(".zeus");
        extensions.add(".zip");
        extensions.add(".zsh");
        return extensions;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getFileContentList">
    /**
     * Using word lists from https://www.world-english.org I created this list
     * of common English words. To prevent the ransomware detecting the honeypot
     * files, they are filled with common words, making it really hard, if not
     * impossible, to distinguish the difference between a real file and a
     * honeypot file (based on the content of the file).
     *
     * @return the list of words that are used in the file content
     */
    public static List<String> getFileContentList() {
        List<String> words = new ArrayList<>();
        words.add("a");
        words.add("able");
        words.add("about");
        words.add("above");
        words.add("accept");
        words.add("act");
        words.add("add");
        words.add("after");
        words.add("again");
        words.add("against");
        words.add("age");
        words.add("ago");
        words.add("air");
        words.add("all");
        words.add("allow");
        words.add("also");
        words.add("always");
        words.add("am");
        words.add("among");
        words.add("an");
        words.add("and");
        words.add("animal");
        words.add("answer");
        words.add("any");
        words.add("appear");
        words.add("are");
        words.add("area");
        words.add("as");
        words.add("ask");
        words.add("at");
        words.add("back");
        words.add("base");
        words.add("be");
        words.add("be able");
        words.add("beauty");
        words.add("bed");
        words.add("been");
        words.add("before");
        words.add("began");
        words.add("begin");
        words.add("behind");
        words.add("believe");
        words.add("best");
        words.add("better");
        words.add("between");
        words.add("big");
        words.add("bird");
        words.add("black");
        words.add("blue");
        words.add("boat");
        words.add("body");
        words.add("book");
        words.add("borrow");
        words.add("both");
        words.add("box");
        words.add("boy");
        words.add("break");
        words.add("bring");
        words.add("brought");
        words.add("build");
        words.add("busy");
        words.add("but");
        words.add("buy");
        words.add("by");
        words.add("call");
        words.add("came");
        words.add("can");
        words.add("cancel");
        words.add("car");
        words.add("care");
        words.add("carry");
        words.add("cause");
        words.add("certain");
        words.add("change");
        words.add("check");
        words.add("children");
        words.add("city");
        words.add("class");
        words.add("clean");
        words.add("clear");
        words.add("close");
        words.add("cold");
        words.add("color");
        words.add("comb");
        words.add("come");
        words.add("common");
        words.add("complain");
        words.add("complete");
        words.add("contain");
        words.add("correct");
        words.add("cough");
        words.add("could");
        words.add("count");
        words.add("country");
        words.add("course");
        words.add("cover");
        words.add("cross");
        words.add("cry");
        words.add("cut");
        words.add("dance");
        words.add("dark");
        words.add("day");
        words.add("decide");
        words.add("deep");
        words.add("develop");
        words.add("did");
        words.add("differ");
        words.add("direct");
        words.add("do");
        words.add("does");
        words.add("dog");
        words.add("don't");
        words.add("done");
        words.add("door");
        words.add("down");
        words.add("draw");
        words.add("drink");
        words.add("drive");
        words.add("dry");
        words.add("during");
        words.add("each");
        words.add("early");
        words.add("earth");
        words.add("ease");
        words.add("east");
        words.add("eat");
        words.add("end");
        words.add("enough");
        words.add("even");
        words.add("ever");
        words.add("every");
        words.add("example");
        words.add("explain");
        words.add("eye");
        words.add("face");
        words.add("fact");
        words.add("fall");
        words.add("family");
        words.add("far");
        words.add("farm");
        words.add("fast");
        words.add("father");
        words.add("feel");
        words.add("feet");
        words.add("few");
        words.add("field");
        words.add("figure");
        words.add("fill");
        words.add("final");
        words.add("find");
        words.add("fine");
        words.add("finish");
        words.add("fire");
        words.add("first");
        words.add("fish");
        words.add("fit");
        words.add("five");
        words.add("fix");
        words.add("fly");
        words.add("follow");
        words.add("food");
        words.add("foot");
        words.add("for");
        words.add("force");
        words.add("forget");
        words.add("form");
        words.add("found");
        words.add("four");
        words.add("free");
        words.add("friend");
        words.add("from");
        words.add("front");
        words.add("full");
        words.add("game");
        words.add("gave");
        words.add("get");
        words.add("girl");
        words.add("give");
        words.add("go");
        words.add("gold");
        words.add("good");
        words.add("got");
        words.add("govern");
        words.add("great");
        words.add("green");
        words.add("ground");
        words.add("group");
        words.add("grow");
        words.add("had");
        words.add("half");
        words.add("hand");
        words.add("happen");
        words.add("hard");
        words.add("has");
        words.add("have");
        words.add("he");
        words.add("head");
        words.add("hear");
        words.add("heard");
        words.add("heat");
        words.add("help");
        words.add("her");
        words.add("here");
        words.add("high");
        words.add("him");
        words.add("his");
        words.add("hold");
        words.add("home");
        words.add("horse");
        words.add("hot");
        words.add("hour");
        words.add("house");
        words.add("how");
        words.add("hundred");
        words.add("hurt");
        words.add("I");
        words.add("idea");
        words.add("if");
        words.add("in");
        words.add("inch");
        words.add("interest");
        words.add("is");
        words.add("island");
        words.add("it");
        words.add("just");
        words.add("keep");
        words.add("kind");
        words.add("king");
        words.add("knew");
        words.add("know");
        words.add("land");
        words.add("language");
        words.add("large");
        words.add("last");
        words.add("late");
        words.add("laugh");
        words.add("lay");
        words.add("lead");
        words.add("learn");
        words.add("leave");
        words.add("left");
        words.add("less");
        words.add("let");
        words.add("letter");
        words.add("life");
        words.add("light");
        words.add("like");
        words.add("line");
        words.add("list");
        words.add("listen");
        words.add("little");
        words.add("live");
        words.add("long");
        words.add("look");
        words.add("lose");
        words.add("lot");
        words.add("love");
        words.add("low");
        words.add("machine");
        words.add("made");
        words.add("main");
        words.add("make");
        words.add("man");
        words.add("many");
        words.add("map");
        words.add("mark");
        words.add("may");
        words.add("me");
        words.add("mean");
        words.add("measure");
        words.add("men");
        words.add("might");
        words.add("mile");
        words.add("mind");
        words.add("minute");
        words.add("miss");
        words.add("money");
        words.add("moon");
        words.add("more");
        words.add("morning");
        words.add("most");
        words.add("mother");
        words.add("mountain");
        words.add("move");
        words.add("much");
        words.add("music");
        words.add("must");
        words.add("my");
        words.add("name");
        words.add("near");
        words.add("need");
        words.add("never");
        words.add("new");
        words.add("next");
        words.add("night");
        words.add("no");
        words.add("north");
        words.add("note");
        words.add("nothing");
        words.add("notice");
        words.add("noun");
        words.add("now");
        words.add("number");
        words.add("numeral");
        words.add("object");
        words.add("of");
        words.add("off");
        words.add("often");
        words.add("oh");
        words.add("old");
        words.add("on");
        words.add("once");
        words.add("one");
        words.add("only");
        words.add("open");
        words.add("or");
        words.add("order");
        words.add("organise");
        words.add("other");
        words.add("our");
        words.add("out");
        words.add("over");
        words.add("own");
        words.add("page");
        words.add("paper");
        words.add("part");
        words.add("pass");
        words.add("pattern");
        words.add("pay");
        words.add("people");
        words.add("perhaps");
        words.add("person");
        words.add("picture");
        words.add("piece");
        words.add("place");
        words.add("plain");
        words.add("plan");
        words.add("plane");
        words.add("plant");
        words.add("play");
        words.add("point");
        words.add("port");
        words.add("pose");
        words.add("possible");
        words.add("pound");
        words.add("power");
        words.add("press");
        words.add("problem");
        words.add("produce");
        words.add("product");
        words.add("pull");
        words.add("put");
        words.add("question");
        words.add("quick");
        words.add("rain");
        words.add("ran");
        words.add("reach");
        words.add("read");
        words.add("ready");
        words.add("real");
        words.add("record");
        words.add("red");
        words.add("remember");
        words.add("reply");
        words.add("rest");
        words.add("right");
        words.add("river");
        words.add("road");
        words.add("rock");
        words.add("room");
        words.add("round");
        words.add("rule");
        words.add("run");
        words.add("said");
        words.add("same");
        words.add("saw");
        words.add("say");
        words.add("school");
        words.add("science");
        words.add("sea");
        words.add("second");
        words.add("see");
        words.add("seem");
        words.add("self");
        words.add("sell");
        words.add("send");
        words.add("sentence");
        words.add("serve");
        words.add("set");
        words.add("several");
        words.add("shape");
        words.add("she");
        words.add("ship");
        words.add("short");
        words.add("should");
        words.add("show");
        words.add("shut");
        words.add("side");
        words.add("sign");
        words.add("simple");
        words.add("since");
        words.add("sing");
        words.add("sit");
        words.add("six");
        words.add("size");
        words.add("sleep");
        words.add("slow");
        words.add("small");
        words.add("smoke");
        words.add("snow");
        words.add("so");
        words.add("some");
        words.add("song");
        words.add("soon");
        words.add("sound");
        words.add("south");
        words.add("speak");
        words.add("special");
        words.add("spell");
        words.add("spend");
        words.add("stand");
        words.add("star");
        words.add("start");
        words.add("state");
        words.add("stay");
        words.add("step");
        words.add("still");
        words.add("stood");
        words.add("stop");
        words.add("story");
        words.add("street");
        words.add("strong");
        words.add("study");
        words.add("succeed");
        words.add("such");
        words.add("sun");
        words.add("sure");
        words.add("surface");
        words.add("swim");
        words.add("table");
        words.add("tail");
        words.add("take");
        words.add("talk");
        words.add("teach");
        words.add("tell");
        words.add("ten");
        words.add("test");
        words.add("than");
        words.add("that");
        words.add("the");
        words.add("their");
        words.add("them");
        words.add("then");
        words.add("there");
        words.add("these");
        words.add("they");
        words.add("thing");
        words.add("think");
        words.add("this");
        words.add("those");
        words.add("though");
        words.add("thought");
        words.add("thousand");
        words.add("three");
        words.add("through");
        words.add("time");
        words.add("to");
        words.add("together");
        words.add("told");
        words.add("too");
        words.add("took");
        words.add("top");
        words.add("toward");
        words.add("town");
        words.add("translate");
        words.add("travel");
        words.add("tree");
        words.add("true");
        words.add("try");
        words.add("turn");
        words.add("turn off");
        words.add("turn on");
        words.add("two");
        words.add("type");
        words.add("under");
        words.add("understand");
        words.add("unit");
        words.add("until");
        words.add("up");
        words.add("us");
        words.add("use");
        words.add("usual");
        words.add("very");
        words.add("voice");
        words.add("vowel");
        words.add("wait");
        words.add("wake up");
        words.add("walk");
        words.add("want");
        words.add("war");
        words.add("warm");
        words.add("was");
        words.add("watch");
        words.add("water");
        words.add("way");
        words.add("we");
        words.add("week");
        words.add("weight");
        words.add("well");
        words.add("went");
        words.add("were");
        words.add("west");
        words.add("what");
        words.add("wheel");
        words.add("when");
        words.add("where");
        words.add("which");
        words.add("while");
        words.add("white");
        words.add("who");
        words.add("whole");
        words.add("why");
        words.add("will");
        words.add("wind");
        words.add("with");
        words.add("wonder");
        words.add("wood");
        words.add("work");
        words.add("world");
        words.add("worry");
        words.add("would");
        words.add("write");
        words.add("year");
        words.add("yes");
        words.add("yet");
        words.add("you");
        words.add("young");
        words.add("your");
        return words;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getFileHeaderList">
    /**
     * The keys in the map is the extension (including the dot). Each
     * corresponding value is a header. Testing if there is a header present can
     * be done with the 'get' method. The parameter that needs to be supplied is
     * the key. The returned value is the header if there is any, otherwise the
     * value is null.
     *
     * @return a map with a key and value pair. Each key is an extension
     * (including the dot). Each value is the header of said extension.
     */
    public static Map<String, byte[]> getHeaderMap() {
        Map<String, byte[]> output = new HashMap<>();

        //Entry for ZIP
        String key = ".zip";
        byte[] value = new byte[4];
        //Header (hexadecimal): 50 4B 07 08
        value[0] = 0x50;
        value[1] = 0x4B;
        value[2] = 0x07;
        value[3] = 0x08;
        //Add entry to the map
        output.put(key, value);

        return output;
    }
    //</editor-fold>

}
