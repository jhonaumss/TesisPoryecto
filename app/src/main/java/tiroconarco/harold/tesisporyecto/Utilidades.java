package tiroconarco.harold.tesisporyecto;

public class Utilidades {

    public static final String NOMBRE_BD="bd_proyecto";

    // constantes campos tabla usuario
    public static final String TABLA_RONDA="datosRonda";
    public static final String CAMPO_ID_RONDA ="idRonda";
    public static final String CAMPO_ARQUERO="nombreArquero";
    public static final String CAMPO_CLUB="nombreClub";
    public static final String CAMPO_RONDA="nombreRonda";
    public static final String CAMPO_FECHA="fecha";
    public static final String CAMPO_TIPORONDA="tipoRonda";
    public static final String CAMPO_TIPOARCO="tipoArco";
    //public static final String CAMPO_IDPUNTOS="idPuntos";



    // base de datos usuario
    public static final  String CREATE_TABLE_DATOSRONDA="CREATE TABLE "+TABLA_RONDA+"("+ CAMPO_ID_RONDA +
            " INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_ARQUERO+" TEXT,"+CAMPO_CLUB+" TEXT, "+CAMPO_RONDA+" TEXT,"+
            CAMPO_FECHA+" TEXT,"+CAMPO_TIPORONDA+" INTEGER,"+CAMPO_TIPOARCO+" INTEGER)";

    // constantes campos tabla puntaje
    public static final String TABLA_PUNTAJE="puntaje";
    public static final String CAMPO_IDPUNTO="idPuntaje";
    public static final String CAMPO_N1="p1",CAMPO_N2="p2",CAMPO_N3="p3",CAMPO_N4="p4",CAMPO_N5="p5",CAMPO_N6="p6",CAMPO_N7="p7",CAMPO_N8="p8",CAMPO_N9="p9",CAMPO_N10="p10",
            CAMPO_N11="p11",CAMPO_N12="p12",CAMPO_N13="p13",CAMPO_N14="p14",CAMPO_N15="p15",CAMPO_N16="p16",CAMPO_N17="p17",CAMPO_N18="p18",CAMPO_N19="p19",CAMPO_N20="p20",
            CAMPO_N21="p21",CAMPO_N22="p22",CAMPO_N23="p23",CAMPO_N24="p24",CAMPO_N25="p25",CAMPO_N26="p26",CAMPO_N27="p27",CAMPO_N28="p28",CAMPO_N29="p29",CAMPO_N30="p30",
            CAMPO_N31="p31",CAMPO_N32="p32",CAMPO_N33="p33",CAMPO_N34="p34",CAMPO_N35="p35",CAMPO_N36="p36",CAMPO_N37="p37",CAMPO_N38="p38",CAMPO_N39="p39",CAMPO_N40="p40",
            CAMPO_N41="p41",CAMPO_N42="p42",CAMPO_N43="p43",CAMPO_N44="p44",CAMPO_N45="p45",CAMPO_N46="p46",CAMPO_N47="p47",CAMPO_N48="p48",CAMPO_N49="p49",CAMPO_N50="p50",
            CAMPO_N51="p51",CAMPO_N52="p52",CAMPO_N53="p53",CAMPO_N54="p54",CAMPO_N55="p55",CAMPO_N56="p56",CAMPO_N57="p57",CAMPO_N58="p58",CAMPO_N59="p59",CAMPO_N60="p60",
            CAMPO_N61="p61",CAMPO_N62="p62",CAMPO_N63="p63",CAMPO_N64="p64",CAMPO_N65="p65",CAMPO_N66="p66",CAMPO_N67="p67",CAMPO_N68="p68",CAMPO_N69="p69",CAMPO_N70="p70",
            CAMPO_N71="p71",CAMPO_N72="p72",CAMPO_N73="p73",CAMPO_N74="p74",CAMPO_N75="p75",CAMPO_N76="p76",CAMPO_N77="p77",CAMPO_N78="p78",CAMPO_N79="p79",CAMPO_N80="p80",
            CAMPO_N81="p81",CAMPO_N82="p82",CAMPO_N83="p83",CAMPO_N84="p84",CAMPO_N85="p85",CAMPO_N86="p86",CAMPO_N87="p87",CAMPO_N88="p88",CAMPO_N89="p89",CAMPO_N90="p90",
            CAMPO_N91="p91",CAMPO_N92="p92",CAMPO_N93="p93",CAMPO_N94="p94",CAMPO_N95="p95",CAMPO_N96="p96",CAMPO_N97="p97",CAMPO_N98="p98",CAMPO_N99="p99",CAMPO_N100="p100",
            CAMPO_N101="p101",CAMPO_N102="p102",CAMPO_N103="p103",CAMPO_N104="p104",CAMPO_N105="p105",CAMPO_N106="p106",CAMPO_N107="p107",CAMPO_N108="p108",CAMPO_N109="p109",CAMPO_N110="p110",
            CAMPO_N111="p111",CAMPO_N112="p112",CAMPO_N113="p113",CAMPO_N114="p114",CAMPO_N115="p115",CAMPO_N116="p116",CAMPO_N117="p117",CAMPO_N118="p118",CAMPO_N119="p119",CAMPO_N120="p120",
            CAMPO_N121="p121",CAMPO_N122="p122",CAMPO_N123="p123",CAMPO_N124="p124",CAMPO_N125="p125",CAMPO_N126="p126",CAMPO_N127="p127",CAMPO_N128="p128",CAMPO_N129="p129",CAMPO_N130="p130",
            CAMPO_N131="p131",CAMPO_N132="p132",CAMPO_N133="p133",CAMPO_N134="p134",CAMPO_N135="p135",CAMPO_N136="p136",CAMPO_N137="p137",CAMPO_N138="p138",CAMPO_N139="p139",CAMPO_N140="p140",
            CAMPO_N141="p141",CAMPO_N142="p142",CAMPO_N143="p143",CAMPO_N144="p144",
            CAMPO_S1="s1",CAMPO_S2="s2",CAMPO_S3="s3",CAMPO_S4="s4",CAMPO_S5="s5",CAMPO_S6="s6",CAMPO_S7="s7",CAMPO_S8="s8",CAMPO_S9="s9",CAMPO_S10="s10",
            CAMPO_S11="s11",CAMPO_S12="s12",CAMPO_S13="s13",CAMPO_S14="s14",CAMPO_S15="s15",CAMPO_S16="s16",CAMPO_S17="s17",CAMPO_S18="s18",CAMPO_S19="s19",CAMPO_S20="s20",
            CAMPO_S21="s21",CAMPO_S22="s22",CAMPO_S23="s23",CAMPO_S24="s24",
            CAMPO_T1="t1",CAMPO_T2="t2",CAMPO_T3="t3",CAMPO_T4="t4",CAMPO_T5="t5",CAMPO_T6="t6",CAMPO_T7="t7",CAMPO_T8="t8",CAMPO_T9="t9",CAMPO_T10="t10",
            CAMPO_T11="t11",CAMPO_T12="t12",CAMPO_T13="t13",CAMPO_T14="t14",CAMPO_T15="t15",CAMPO_T16="t16",CAMPO_T17="t17",CAMPO_T18="t18",CAMPO_T19="t19",CAMPO_T20="t20",
            CAMPO_T21="t21",CAMPO_T22="t22",CAMPO_T23="t23",CAMPO_T24="t24";

    // base de datos puntajes
    public static final String CREATE_TABLE_PUNTAJE="CREATE TABLE "+TABLA_PUNTAJE+"("+CAMPO_IDPUNTO+" INTEGER PRIMARY KEY AUTOINCREMENT," +
            ""+CAMPO_ID_RONDA+ " INTEGER," +
            ""+CAMPO_N1+" TEXT,"+CAMPO_N2+" TEXT,"+CAMPO_N3+" TEXT,"+CAMPO_N4+" TEXT, "+CAMPO_N5+" TEXT, "+CAMPO_N6+" TEXT,"+CAMPO_N7+" TEXT, "+CAMPO_N8+" TEXT,"+CAMPO_N9+" TEXT,"+CAMPO_N10+" TEXT," +
            ""+CAMPO_N11+" TEXT,"+CAMPO_N12+" TEXT,"+CAMPO_N13+" TEXT,"+CAMPO_N14+" TEXT, "+CAMPO_N15+" TEXT,"+CAMPO_N16+" TEXT,"+CAMPO_N17+" TEXT,"+CAMPO_N18+" TEXT,"+CAMPO_N19+" TEXT," +
            ""+CAMPO_N20+" TEXT,"+CAMPO_N21+" TEXT,"+CAMPO_N22+" TEXT,"+CAMPO_N23+" TEXT,"+CAMPO_N24+" TEXT, "+CAMPO_N25+" TEXT,"+CAMPO_N26+" TEXT,"+CAMPO_N27+" TEXT,"+CAMPO_N28+" TEXT,"+CAMPO_N29+" TEXT,"+CAMPO_N30+" TEXT," +
            ""+CAMPO_N31+" TEXT,"+CAMPO_N32+" TEXT,"+CAMPO_N33+" TEXT,"+CAMPO_N34+" TEXT, "+CAMPO_N35+" TEXT,"+CAMPO_N36+" TEXT, "+CAMPO_N37+" TEXT,"+CAMPO_N38+" TEXT,"+CAMPO_N39+" TEXT,"+CAMPO_N40+" TEXT," +
            ""+CAMPO_N41+" TEXT,"+CAMPO_N42+" TEXT,"+CAMPO_N43+" TEXT,"+CAMPO_N44+" TEXT,"+CAMPO_N45+" TEXT,"+CAMPO_N46+" TEXT,"+CAMPO_N47+" TEXT,"+CAMPO_N48+" TEXT,"+CAMPO_N49+" TEXT,"+CAMPO_N50+" TEXT," +
            ""+CAMPO_N51+" TEXT,"+CAMPO_N52+" TEXT,"+CAMPO_N53+" TEXT,"+CAMPO_N54+" TEXT,"+CAMPO_N55+" TEXT,"+CAMPO_N56+" TEXT,"+CAMPO_N57+" TEXT,"+CAMPO_N58+" TEXT,"+CAMPO_N59+" TEXT,"+CAMPO_N60+" TEXT," +
            ""+CAMPO_N61+" TEXT,"+CAMPO_N62+" TEXT,"+CAMPO_N63+" TEXT,"+CAMPO_N64+" TEXT,"+CAMPO_N65+" TEXT,"+CAMPO_N66+" TEXT, "+CAMPO_N67+" TEXT,"+CAMPO_N68+" TEXT,"+CAMPO_N69+" TEXT,"+CAMPO_N70+" TEXT," +
            ""+CAMPO_N71+" TEXT,"+CAMPO_N72+" TEXT,"+CAMPO_N73+" TEXT,"+CAMPO_N74+" TEXT,"+CAMPO_N75+" TEXT,"+CAMPO_N76+" TEXT,"+CAMPO_N77+" TEXT,"+CAMPO_N78+" TEXT,"+CAMPO_N79+" TEXT,"+CAMPO_N80+" TEXT," +
            ""+CAMPO_N81+" TEXT,"+CAMPO_N82+" TEXT,"+CAMPO_N83+" TEXT,"+CAMPO_N84+" TEXT,"+CAMPO_N85+" TEXT,"+CAMPO_N86+" TEXT,"+CAMPO_N87+" TEXT,"+CAMPO_N88+" TEXT,"+CAMPO_N89+" TEXT,"+CAMPO_N90+" TEXT," +
            ""+CAMPO_N91+" TEXT,"+CAMPO_N92+" TEXT,"+CAMPO_N93+" TEXT,"+CAMPO_N94+" TEXT,"+CAMPO_N95+" TEXT,"+CAMPO_N96+" TEXT,"+CAMPO_N97+" TEXT,"+CAMPO_N98+" TEXT,"+CAMPO_N99+" TEXT,"+CAMPO_N100+" TEXT," +
            ""+CAMPO_N101+" TEXT,"+CAMPO_N102+" TEXT,"+CAMPO_N103+" TEXT,"+CAMPO_N104+" TEXT,"+CAMPO_N105+" TEXT,"+CAMPO_N106+" TEXT,"+CAMPO_N107+" TEXT,"+CAMPO_N108+" TEXT,"+CAMPO_N109+" TEXT,"+CAMPO_N110+" TEXT," +
            ""+CAMPO_N111+" TEXT,"+CAMPO_N112+" TEXT,"+CAMPO_N113+" TEXT,"+CAMPO_N114+" TEXT,"+CAMPO_N115+" TEXT,"+CAMPO_N116+" TEXT,"+CAMPO_N117+" TEXT,"+CAMPO_N118+" TEXT,"+CAMPO_N119+" TEXT,"+CAMPO_N120+" TEXT," +
            ""+CAMPO_N121+" TEXT,"+CAMPO_N122+" TEXT,"+CAMPO_N123+" TEXT,"+CAMPO_N124+" TEXT,"+CAMPO_N125+" TEXT,"+CAMPO_N126+" TEXT,"+CAMPO_N127+" TEXT,"+CAMPO_N128+" TEXT,"+CAMPO_N129+" TEXT,"+CAMPO_N130+" TEXT," +
            ""+CAMPO_N131+" TEXT,"+CAMPO_N132+" TEXT,"+CAMPO_N133+" TEXT,"+CAMPO_N134+" TEXT,"+CAMPO_N135+" TEXT,"+CAMPO_N136+" TEXT,"+CAMPO_N137+" TEXT,"+CAMPO_N138+" TEXT,"+CAMPO_N139+" TEXT,"+CAMPO_N140+" TEXT," +
            ""+CAMPO_N141+" TEXT,"+CAMPO_N142+" TEXT,"+CAMPO_N143+" TEXT,"+CAMPO_N144+" TEXT," +
            ""+CAMPO_S1+" TEXT,"+CAMPO_S2+" TEXT,"+CAMPO_S3+" TEXT,"+CAMPO_S4+" TEXT,"+CAMPO_S5+" TEXT,"+CAMPO_S6+" TEXT,"+CAMPO_S7+" TEXT,"+CAMPO_S8+" TEXT,"+CAMPO_S9+" TEXT,"+CAMPO_S10+" TEXT," +
            ""+CAMPO_S11+" TEXT,"+CAMPO_S12+" TEXT,"+CAMPO_S13+" TEXT,"+CAMPO_S14+" TEXT,"+CAMPO_S15+" TEXT,"+CAMPO_S16+" TEXT,"+CAMPO_S17+" TEXT,"+CAMPO_S18+" TEXT,"+CAMPO_S19+" TEXT,"+CAMPO_S20+" TEXT," +
            ""+CAMPO_S21+" TEXT,"+CAMPO_S22+" TEXT,"+CAMPO_S23+" TEXT,"+CAMPO_S24+" TEXT," +
            ""+CAMPO_T1+" TEXT,"+CAMPO_T2+" TEXT,"+CAMPO_T3+" TEXT,"+CAMPO_T4+" TEXT,"+CAMPO_T5+" TEXT,"+CAMPO_T6+" TEXT,"+CAMPO_T7+" TEXT,"+CAMPO_T8+" TEXT,"+CAMPO_T9+" TEXT,"+CAMPO_T10+" TEXT," +
            ""+CAMPO_T11+" TEXT,"+CAMPO_T12+" TEXT,"+CAMPO_T13+" TEXT,"+CAMPO_T14+" TEXT,"+CAMPO_T15+" TEXT,"+CAMPO_T16+" TEXT,"+CAMPO_T17+" TEXT,"+CAMPO_T18+" TEXT,"+CAMPO_T19+" TEXT,"+CAMPO_T20+" TEXT," +
            ""+CAMPO_T21+" TEXT,"+CAMPO_T22+" TEXT,"+CAMPO_T23+" TEXT,"+CAMPO_T24+" TEXT)";

    public static final String TABLA_EJERCICIO="ejercicio";
    public static final String CAMPO_IDEJERCICIO="idEjercicio";
    public static final String CAMPO_NUMERODIAEJERCICIO="numeroDiaEjercicio";
    public static final String CAMPO_CHECKDIAEJERCICIO="checkDiaEjercicio";

    public  static  final String CREATE_TABLE_CHECK_EJERCICIO="CREATE TABLE "+TABLA_EJERCICIO+"("+CAMPO_IDEJERCICIO+" INTEGER PRIMARY KEY AUTOINCREMENT,"
            +CAMPO_NUMERODIAEJERCICIO+" TEXT,"+CAMPO_CHECKDIAEJERCICIO+" TEXT)";

    public static final String INSERT_DATA_EJERCICIO =
            "INSERT INTO "+TABLA_EJERCICIO+ " VALUES (1,'1','0'), (2,'2','0'), (3,'3','0'),(4,'4','0'), (5,'5','0')" +
                    ",(6,'6','0'),(7,'7','0'), (8,'8','0'), (9,'9','0'), (10,'10','0'),  (11,'11','0'), (12,'12','0')," +
                    " (13,'13','0'),  (14,'14','0'), (15,'15','0'), (16,'16','0'), (17,'17','0'),(18,'18','0'), " +
                    "(19,'19','0'), (20,'20','0'), (21,'21','0'), (22,'22','0'),(23,'23','0'),(24,'24','0'),(25,'25','0')," +
                    "(26,'26','0'),(27,'27','0'),(28,'28','0'),(29,'29','0'),(30,'30','0')";


    public static final String TABLA_PRACTICA="practica";
    public static final String CAMPO_IDPRACTICA="idPractica";
    public static final String CAMPO_NUMERODIAPRACTICA="numeroDiaPractica";
    public static final String CAMPO_CHECKDIAPRACTICA="checkDiaPractica";

    public  static  final String CREATE_TABLE_CHECK_PRACTICA="CREATE TABLE "+TABLA_PRACTICA+"("+CAMPO_IDPRACTICA+" INTEGER PRIMARY KEY AUTOINCREMENT,"
            +CAMPO_NUMERODIAPRACTICA+" TEXT,"+CAMPO_CHECKDIAPRACTICA+" TEXT)";

    public static final String INSERT_DATA_PRACTICA =
            "INSERT INTO "+TABLA_PRACTICA+ " VALUES (1,'1','0'), (2,'2','0'), (3,'3','0'),(4,'4','0'), (5,'5','0')" +
                    ",(6,'6','0'),(7,'7','0'), (8,'8','0'), (9,'9','0'), (10,'10','0'),  (11,'11','0'), (12,'12','0')," +
                    " (13,'13','0'),  (14,'14','0'), (15,'15','0'), (16,'16','0'), (17,'17','0'),(18,'18','0'), " +
                    "(19,'19','0'), (20,'20','0'), (21,'21','0'), (22,'22','0'),(23,'23','0'),(24,'24','0'),(25,'25','0')," +
                    "(26,'26','0'),(27,'27','0'),(28,'28','0'),(29,'29','0'),(30,'30','0')";

}
