package tol.unicoded;

public class tableC extends table{
        public tableC(){
 off=0xC000;
    }
    public String getChar(int idx){
        System.out.println("idx-off"+(idx-off));
        System.out.println("uc length"+uc.length);
        return uc[idx-off];
    }
    final static String uc[]={
"\uC000","\uC001","\uC002","\uC003","\uC004","\uC005","\uC006","\uC007","\uC008","\uC009","\uC00A","\uC00B","\uC00C","\uC00D","\uC00E","\uC00F"
,"\uC010","\uC011","\uC012","\uC013","\uC014","\uC015","\uC016","\uC017","\uC018","\uC019","\uC01A","\uC01B","\uC01C","\uC01D","\uC01E","\uC01F"
,"\uC020","\uC021","\uC022","\uC023","\uC024","\uC025","\uC026","\uC027","\uC028","\uC029","\uC02A","\uC02B","\uC02C","\uC02D","\uC02E","\uC02F"
,"\uC030","\uC031","\uC032","\uC033","\uC034","\uC035","\uC036","\uC037","\uC038","\uC039","\uC03A","\uC03B","\uC03C","\uC03D","\uC03E","\uC03F"
,"\uC040","\uC041","\uC042","\uC043","\uC044","\uC045","\uC046","\uC047","\uC048","\uC049","\uC04A","\uC04B","\uC04C","\uC04D","\uC04E","\uC04F"
,"\uC050","\uC051","\uC052","\uC053","\uC054","\uC055","\uC056","\uC057","\uC058","\uC059","\uC05A","\uC05B","\uC05C","\uC05D","\uC05E","\uC05F"
,"\uC060","\uC061","\uC062","\uC063","\uC064","\uC065","\uC066","\uC067","\uC068","\uC069","\uC06A","\uC06B","\uC06C","\uC06D","\uC06E","\uC06F"
,"\uC070","\uC071","\uC072","\uC073","\uC074","\uC075","\uC076","\uC077","\uC078","\uC079","\uC07A","\uC07B","\uC07C","\uC07D","\uC07E","\uC07F"
,"\uC080","\uC081","\uC082","\uC083","\uC084","\uC085","\uC086","\uC087","\uC088","\uC089","\uC08A","\uC08B","\uC08C","\uC08D","\uC08E","\uC08F"
,"\uC090","\uC091","\uC092","\uC093","\uC094","\uC095","\uC096","\uC097","\uC098","\uC099","\uC09A","\uC09B","\uC09C","\uC09D","\uC09E","\uC09F"
,"\uC0A0","\uC0A1","\uC0A2","\uC0A3","\uC0A4","\uC0A5","\uC0A6","\uC0A7","\uC0A8","\uC0A9","\uC0AA","\uC0AB","\uC0AC","\uC0AD","\uC0AE","\uC0AF"
,"\uC0B0","\uC0B1","\uC0B2","\uC0B3","\uC0B4","\uC0B5","\uC0B6","\uC0B7","\uC0B8","\uC0B9","\uC0BA","\uC0BB","\uC0BC","\uC0BD","\uC0BE","\uC0BF"
,"\uC0C0","\uC0C1","\uC0C2","\uC0C3","\uC0C4","\uC0C5","\uC0C6","\uC0C7","\uC0C8","\uC0C9","\uC0CA","\uC0CB","\uC0CC","\uC0CD","\uC0CE","\uC0CF"
,"\uC0D0","\uC0D1","\uC0D2","\uC0D3","\uC0D4","\uC0D5","\uC0D6","\uC0D7","\uC0D8","\uC0D9","\uC0DA","\uC0DB","\uC0DC","\uC0DD","\uC0DE","\uC0DF"
,"\uC0E0","\uC0E1","\uC0E2","\uC0E3","\uC0E4","\uC0E5","\uC0E6","\uC0E7","\uC0E8","\uC0E9","\uC0EA","\uC0EB","\uC0EC","\uC0ED","\uC0EE","\uC0EF"
,"\uC0F0","\uC0F1","\uC0F2","\uC0F3","\uC0F4","\uC0F5","\uC0F6","\uC0F7","\uC0F8","\uC0F9","\uC0FA","\uC0FB","\uC0FC","\uC0FD","\uC0FE","\uC0FF"
,"\uC100","\uC101","\uC102","\uC103","\uC104","\uC105","\uC106","\uC107","\uC108","\uC109","\uC10A","\uC10B","\uC10C","\uC10D","\uC10E","\uC10F"
,"\uC110","\uC111","\uC112","\uC113","\uC114","\uC115","\uC116","\uC117","\uC118","\uC119","\uC11A","\uC11B","\uC11C","\uC11D","\uC11E","\uC11F"
,"\uC120","\uC121","\uC122","\uC123","\uC124","\uC125","\uC126","\uC127","\uC128","\uC129","\uC12A","\uC12B","\uC12C","\uC12D","\uC12E","\uC12F"
,"\uC130","\uC131","\uC132","\uC133","\uC134","\uC135","\uC136","\uC137","\uC138","\uC139","\uC13A","\uC13B","\uC13C","\uC13D","\uC13E","\uC13F"
,"\uC140","\uC141","\uC142","\uC143","\uC144","\uC145","\uC146","\uC147","\uC148","\uC149","\uC14A","\uC14B","\uC14C","\uC14D","\uC14E","\uC14F"
,"\uC150","\uC151","\uC152","\uC153","\uC154","\uC155","\uC156","\uC157","\uC158","\uC159","\uC15A","\uC15B","\uC15C","\uC15D","\uC15E","\uC15F"
,"\uC160","\uC161","\uC162","\uC163","\uC164","\uC165","\uC166","\uC167","\uC168","\uC169","\uC16A","\uC16B","\uC16C","\uC16D","\uC16E","\uC16F"
,"\uC170","\uC171","\uC172","\uC173","\uC174","\uC175","\uC176","\uC177","\uC178","\uC179","\uC17A","\uC17B","\uC17C","\uC17D","\uC17E","\uC17F"
,"\uC180","\uC181","\uC182","\uC183","\uC184","\uC185","\uC186","\uC187","\uC188","\uC189","\uC18A","\uC18B","\uC18C","\uC18D","\uC18E","\uC18F"
,"\uC190","\uC191","\uC192","\uC193","\uC194","\uC195","\uC196","\uC197","\uC198","\uC199","\uC19A","\uC19B","\uC19C","\uC19D","\uC19E","\uC19F"
,"\uC1A0","\uC1A1","\uC1A2","\uC1A3","\uC1A4","\uC1A5","\uC1A6","\uC1A7","\uC1A8","\uC1A9","\uC1AA","\uC1AB","\uC1AC","\uC1AD","\uC1AE","\uC1AF"
,"\uC1B0","\uC1B1","\uC1B2","\uC1B3","\uC1B4","\uC1B5","\uC1B6","\uC1B7","\uC1B8","\uC1B9","\uC1BA","\uC1BB","\uC1BC","\uC1BD","\uC1BE","\uC1BF"
,"\uC1C0","\uC1C1","\uC1C2","\uC1C3","\uC1C4","\uC1C5","\uC1C6","\uC1C7","\uC1C8","\uC1C9","\uC1CA","\uC1CB","\uC1CC","\uC1CD","\uC1CE","\uC1CF"
,"\uC1D0","\uC1D1","\uC1D2","\uC1D3","\uC1D4","\uC1D5","\uC1D6","\uC1D7","\uC1D8","\uC1D9","\uC1DA","\uC1DB","\uC1DC","\uC1DD","\uC1DE","\uC1DF"
,"\uC1E0","\uC1E1","\uC1E2","\uC1E3","\uC1E4","\uC1E5","\uC1E6","\uC1E7","\uC1E8","\uC1E9","\uC1EA","\uC1EB","\uC1EC","\uC1ED","\uC1EE","\uC1EF"
,"\uC1F0","\uC1F1","\uC1F2","\uC1F3","\uC1F4","\uC1F5","\uC1F6","\uC1F7","\uC1F8","\uC1F9","\uC1FA","\uC1FB","\uC1FC","\uC1FD","\uC1FE","\uC1FF"
,"\uC200","\uC201","\uC202","\uC203","\uC204","\uC205","\uC206","\uC207","\uC208","\uC209","\uC20A","\uC20B","\uC20C","\uC20D","\uC20E","\uC20F"
,"\uC210","\uC211","\uC212","\uC213","\uC214","\uC215","\uC216","\uC217","\uC218","\uC219","\uC21A","\uC21B","\uC21C","\uC21D","\uC21E","\uC21F"
,"\uC220","\uC221","\uC222","\uC223","\uC224","\uC225","\uC226","\uC227","\uC228","\uC229","\uC22A","\uC22B","\uC22C","\uC22D","\uC22E","\uC22F"
,"\uC230","\uC231","\uC232","\uC233","\uC234","\uC235","\uC236","\uC237","\uC238","\uC239","\uC23A","\uC23B","\uC23C","\uC23D","\uC23E","\uC23F"
,"\uC240","\uC241","\uC242","\uC243","\uC244","\uC245","\uC246","\uC247","\uC248","\uC249","\uC24A","\uC24B","\uC24C","\uC24D","\uC24E","\uC24F"
,"\uC250","\uC251","\uC252","\uC253","\uC254","\uC255","\uC256","\uC257","\uC258","\uC259","\uC25A","\uC25B","\uC25C","\uC25D","\uC25E","\uC25F"
,"\uC260","\uC261","\uC262","\uC263","\uC264","\uC265","\uC266","\uC267","\uC268","\uC269","\uC26A","\uC26B","\uC26C","\uC26D","\uC26E","\uC26F"
,"\uC270","\uC271","\uC272","\uC273","\uC274","\uC275","\uC276","\uC277","\uC278","\uC279","\uC27A","\uC27B","\uC27C","\uC27D","\uC27E","\uC27F"
,"\uC280","\uC281","\uC282","\uC283","\uC284","\uC285","\uC286","\uC287","\uC288","\uC289","\uC28A","\uC28B","\uC28C","\uC28D","\uC28E","\uC28F"
,"\uC290","\uC291","\uC292","\uC293","\uC294","\uC295","\uC296","\uC297","\uC298","\uC299","\uC29A","\uC29B","\uC29C","\uC29D","\uC29E","\uC29F"
,"\uC2A0","\uC2A1","\uC2A2","\uC2A3","\uC2A4","\uC2A5","\uC2A6","\uC2A7","\uC2A8","\uC2A9","\uC2AA","\uC2AB","\uC2AC","\uC2AD","\uC2AE","\uC2AF"
,"\uC2B0","\uC2B1","\uC2B2","\uC2B3","\uC2B4","\uC2B5","\uC2B6","\uC2B7","\uC2B8","\uC2B9","\uC2BA","\uC2BB","\uC2BC","\uC2BD","\uC2BE","\uC2BF"
,"\uC2C0","\uC2C1","\uC2C2","\uC2C3","\uC2C4","\uC2C5","\uC2C6","\uC2C7","\uC2C8","\uC2C9","\uC2CA","\uC2CB","\uC2CC","\uC2CD","\uC2CE","\uC2CF"
,"\uC2D0","\uC2D1","\uC2D2","\uC2D3","\uC2D4","\uC2D5","\uC2D6","\uC2D7","\uC2D8","\uC2D9","\uC2DA","\uC2DB","\uC2DC","\uC2DD","\uC2DE","\uC2DF"
,"\uC2E0","\uC2E1","\uC2E2","\uC2E3","\uC2E4","\uC2E5","\uC2E6","\uC2E7","\uC2E8","\uC2E9","\uC2EA","\uC2EB","\uC2EC","\uC2ED","\uC2EE","\uC2EF"
,"\uC2F0","\uC2F1","\uC2F2","\uC2F3","\uC2F4","\uC2F5","\uC2F6","\uC2F7","\uC2F8","\uC2F9","\uC2FA","\uC2FB","\uC2FC","\uC2FD","\uC2FE","\uC2FF"
,"\uC300","\uC301","\uC302","\uC303","\uC304","\uC305","\uC306","\uC307","\uC308","\uC309","\uC30A","\uC30B","\uC30C","\uC30D","\uC30E","\uC30F"
,"\uC310","\uC311","\uC312","\uC313","\uC314","\uC315","\uC316","\uC317","\uC318","\uC319","\uC31A","\uC31B","\uC31C","\uC31D","\uC31E","\uC31F"
,"\uC320","\uC321","\uC322","\uC323","\uC324","\uC325","\uC326","\uC327","\uC328","\uC329","\uC32A","\uC32B","\uC32C","\uC32D","\uC32E","\uC32F"
,"\uC330","\uC331","\uC332","\uC333","\uC334","\uC335","\uC336","\uC337","\uC338","\uC339","\uC33A","\uC33B","\uC33C","\uC33D","\uC33E","\uC33F"
,"\uC340","\uC341","\uC342","\uC343","\uC344","\uC345","\uC346","\uC347","\uC348","\uC349","\uC34A","\uC34B","\uC34C","\uC34D","\uC34E","\uC34F"
,"\uC350","\uC351","\uC352","\uC353","\uC354","\uC355","\uC356","\uC357","\uC358","\uC359","\uC35A","\uC35B","\uC35C","\uC35D","\uC35E","\uC35F"
,"\uC360","\uC361","\uC362","\uC363","\uC364","\uC365","\uC366","\uC367","\uC368","\uC369","\uC36A","\uC36B","\uC36C","\uC36D","\uC36E","\uC36F"
,"\uC370","\uC371","\uC372","\uC373","\uC374","\uC375","\uC376","\uC377","\uC378","\uC379","\uC37A","\uC37B","\uC37C","\uC37D","\uC37E","\uC37F"
,"\uC380","\uC381","\uC382","\uC383","\uC384","\uC385","\uC386","\uC387","\uC388","\uC389","\uC38A","\uC38B","\uC38C","\uC38D","\uC38E","\uC38F"
,"\uC390","\uC391","\uC392","\uC393","\uC394","\uC395","\uC396","\uC397","\uC398","\uC399","\uC39A","\uC39B","\uC39C","\uC39D","\uC39E","\uC39F"
,"\uC3A0","\uC3A1","\uC3A2","\uC3A3","\uC3A4","\uC3A5","\uC3A6","\uC3A7","\uC3A8","\uC3A9","\uC3AA","\uC3AB","\uC3AC","\uC3AD","\uC3AE","\uC3AF"
,"\uC3B0","\uC3B1","\uC3B2","\uC3B3","\uC3B4","\uC3B5","\uC3B6","\uC3B7","\uC3B8","\uC3B9","\uC3BA","\uC3BB","\uC3BC","\uC3BD","\uC3BE","\uC3BF"
,"\uC3C0","\uC3C1","\uC3C2","\uC3C3","\uC3C4","\uC3C5","\uC3C6","\uC3C7","\uC3C8","\uC3C9","\uC3CA","\uC3CB","\uC3CC","\uC3CD","\uC3CE","\uC3CF"
,"\uC3D0","\uC3D1","\uC3D2","\uC3D3","\uC3D4","\uC3D5","\uC3D6","\uC3D7","\uC3D8","\uC3D9","\uC3DA","\uC3DB","\uC3DC","\uC3DD","\uC3DE","\uC3DF"
,"\uC3E0","\uC3E1","\uC3E2","\uC3E3","\uC3E4","\uC3E5","\uC3E6","\uC3E7","\uC3E8","\uC3E9","\uC3EA","\uC3EB","\uC3EC","\uC3ED","\uC3EE","\uC3EF"
,"\uC3F0","\uC3F1","\uC3F2","\uC3F3","\uC3F4","\uC3F5","\uC3F6","\uC3F7","\uC3F8","\uC3F9","\uC3FA","\uC3FB","\uC3FC","\uC3FD","\uC3FE","\uC3FF"
,"\uC400","\uC401","\uC402","\uC403","\uC404","\uC405","\uC406","\uC407","\uC408","\uC409","\uC40A","\uC40B","\uC40C","\uC40D","\uC40E","\uC40F"
,"\uC410","\uC411","\uC412","\uC413","\uC414","\uC415","\uC416","\uC417","\uC418","\uC419","\uC41A","\uC41B","\uC41C","\uC41D","\uC41E","\uC41F"
,"\uC420","\uC421","\uC422","\uC423","\uC424","\uC425","\uC426","\uC427","\uC428","\uC429","\uC42A","\uC42B","\uC42C","\uC42D","\uC42E","\uC42F"
,"\uC430","\uC431","\uC432","\uC433","\uC434","\uC435","\uC436","\uC437","\uC438","\uC439","\uC43A","\uC43B","\uC43C","\uC43D","\uC43E","\uC43F"
,"\uC440","\uC441","\uC442","\uC443","\uC444","\uC445","\uC446","\uC447","\uC448","\uC449","\uC44A","\uC44B","\uC44C","\uC44D","\uC44E","\uC44F"
,"\uC450","\uC451","\uC452","\uC453","\uC454","\uC455","\uC456","\uC457","\uC458","\uC459","\uC45A","\uC45B","\uC45C","\uC45D","\uC45E","\uC45F"
,"\uC460","\uC461","\uC462","\uC463","\uC464","\uC465","\uC466","\uC467","\uC468","\uC469","\uC46A","\uC46B","\uC46C","\uC46D","\uC46E","\uC46F"
,"\uC470","\uC471","\uC472","\uC473","\uC474","\uC475","\uC476","\uC477","\uC478","\uC479","\uC47A","\uC47B","\uC47C","\uC47D","\uC47E","\uC47F"
,"\uC480","\uC481","\uC482","\uC483","\uC484","\uC485","\uC486","\uC487","\uC488","\uC489","\uC48A","\uC48B","\uC48C","\uC48D","\uC48E","\uC48F"
,"\uC490","\uC491","\uC492","\uC493","\uC494","\uC495","\uC496","\uC497","\uC498","\uC499","\uC49A","\uC49B","\uC49C","\uC49D","\uC49E","\uC49F"
,"\uC4A0","\uC4A1","\uC4A2","\uC4A3","\uC4A4","\uC4A5","\uC4A6","\uC4A7","\uC4A8","\uC4A9","\uC4AA","\uC4AB","\uC4AC","\uC4AD","\uC4AE","\uC4AF"
,"\uC4B0","\uC4B1","\uC4B2","\uC4B3","\uC4B4","\uC4B5","\uC4B6","\uC4B7","\uC4B8","\uC4B9","\uC4BA","\uC4BB","\uC4BC","\uC4BD","\uC4BE","\uC4BF"
,"\uC4C0","\uC4C1","\uC4C2","\uC4C3","\uC4C4","\uC4C5","\uC4C6","\uC4C7","\uC4C8","\uC4C9","\uC4CA","\uC4CB","\uC4CC","\uC4CD","\uC4CE","\uC4CF"
,"\uC4D0","\uC4D1","\uC4D2","\uC4D3","\uC4D4","\uC4D5","\uC4D6","\uC4D7","\uC4D8","\uC4D9","\uC4DA","\uC4DB","\uC4DC","\uC4DD","\uC4DE","\uC4DF"
,"\uC4E0","\uC4E1","\uC4E2","\uC4E3","\uC4E4","\uC4E5","\uC4E6","\uC4E7","\uC4E8","\uC4E9","\uC4EA","\uC4EB","\uC4EC","\uC4ED","\uC4EE","\uC4EF"
,"\uC4F0","\uC4F1","\uC4F2","\uC4F3","\uC4F4","\uC4F5","\uC4F6","\uC4F7","\uC4F8","\uC4F9","\uC4FA","\uC4FB","\uC4FC","\uC4FD","\uC4FE","\uC4FF"
,"\uC500","\uC501","\uC502","\uC503","\uC504","\uC505","\uC506","\uC507","\uC508","\uC509","\uC50A","\uC50B","\uC50C","\uC50D","\uC50E","\uC50F"
,"\uC510","\uC511","\uC512","\uC513","\uC514","\uC515","\uC516","\uC517","\uC518","\uC519","\uC51A","\uC51B","\uC51C","\uC51D","\uC51E","\uC51F"
,"\uC520","\uC521","\uC522","\uC523","\uC524","\uC525","\uC526","\uC527","\uC528","\uC529","\uC52A","\uC52B","\uC52C","\uC52D","\uC52E","\uC52F"
,"\uC530","\uC531","\uC532","\uC533","\uC534","\uC535","\uC536","\uC537","\uC538","\uC539","\uC53A","\uC53B","\uC53C","\uC53D","\uC53E","\uC53F"
,"\uC540","\uC541","\uC542","\uC543","\uC544","\uC545","\uC546","\uC547","\uC548","\uC549","\uC54A","\uC54B","\uC54C","\uC54D","\uC54E","\uC54F"
,"\uC550","\uC551","\uC552","\uC553","\uC554","\uC555","\uC556","\uC557","\uC558","\uC559","\uC55A","\uC55B","\uC55C","\uC55D","\uC55E","\uC55F"
,"\uC560","\uC561","\uC562","\uC563","\uC564","\uC565","\uC566","\uC567","\uC568","\uC569","\uC56A","\uC56B","\uC56C","\uC56D","\uC56E","\uC56F"
,"\uC570","\uC571","\uC572","\uC573","\uC574","\uC575","\uC576","\uC577","\uC578","\uC579","\uC57A","\uC57B","\uC57C","\uC57D","\uC57E","\uC57F"
,"\uC580","\uC581","\uC582","\uC583","\uC584","\uC585","\uC586","\uC587","\uC588","\uC589","\uC58A","\uC58B","\uC58C","\uC58D","\uC58E","\uC58F"
,"\uC590","\uC591","\uC592","\uC593","\uC594","\uC595","\uC596","\uC597","\uC598","\uC599","\uC59A","\uC59B","\uC59C","\uC59D","\uC59E","\uC59F"
,"\uC5A0","\uC5A1","\uC5A2","\uC5A3","\uC5A4","\uC5A5","\uC5A6","\uC5A7","\uC5A8","\uC5A9","\uC5AA","\uC5AB","\uC5AC","\uC5AD","\uC5AE","\uC5AF"
,"\uC5B0","\uC5B1","\uC5B2","\uC5B3","\uC5B4","\uC5B5","\uC5B6","\uC5B7","\uC5B8","\uC5B9","\uC5BA","\uC5BB","\uC5BC","\uC5BD","\uC5BE","\uC5BF"
,"\uC5C0","\uC5C1","\uC5C2","\uC5C3","\uC5C4","\uC5C5","\uC5C6","\uC5C7","\uC5C8","\uC5C9","\uC5CA","\uC5CB","\uC5CC","\uC5CD","\uC5CE","\uC5CF"
,"\uC5D0","\uC5D1","\uC5D2","\uC5D3","\uC5D4","\uC5D5","\uC5D6","\uC5D7","\uC5D8","\uC5D9","\uC5DA","\uC5DB","\uC5DC","\uC5DD","\uC5DE","\uC5DF"
,"\uC5E0","\uC5E1","\uC5E2","\uC5E3","\uC5E4","\uC5E5","\uC5E6","\uC5E7","\uC5E8","\uC5E9","\uC5EA","\uC5EB","\uC5EC","\uC5ED","\uC5EE","\uC5EF"
,"\uC5F0","\uC5F1","\uC5F2","\uC5F3","\uC5F4","\uC5F5","\uC5F6","\uC5F7","\uC5F8","\uC5F9","\uC5FA","\uC5FB","\uC5FC","\uC5FD","\uC5FE","\uC5FF"
,"\uC600","\uC601","\uC602","\uC603","\uC604","\uC605","\uC606","\uC607","\uC608","\uC609","\uC60A","\uC60B","\uC60C","\uC60D","\uC60E","\uC60F"
,"\uC610","\uC611","\uC612","\uC613","\uC614","\uC615","\uC616","\uC617","\uC618","\uC619","\uC61A","\uC61B","\uC61C","\uC61D","\uC61E","\uC61F"
,"\uC620","\uC621","\uC622","\uC623","\uC624","\uC625","\uC626","\uC627","\uC628","\uC629","\uC62A","\uC62B","\uC62C","\uC62D","\uC62E","\uC62F"
,"\uC630","\uC631","\uC632","\uC633","\uC634","\uC635","\uC636","\uC637","\uC638","\uC639","\uC63A","\uC63B","\uC63C","\uC63D","\uC63E","\uC63F"
,"\uC640","\uC641","\uC642","\uC643","\uC644","\uC645","\uC646","\uC647","\uC648","\uC649","\uC64A","\uC64B","\uC64C","\uC64D","\uC64E","\uC64F"
,"\uC650","\uC651","\uC652","\uC653","\uC654","\uC655","\uC656","\uC657","\uC658","\uC659","\uC65A","\uC65B","\uC65C","\uC65D","\uC65E","\uC65F"
,"\uC660","\uC661","\uC662","\uC663","\uC664","\uC665","\uC666","\uC667","\uC668","\uC669","\uC66A","\uC66B","\uC66C","\uC66D","\uC66E","\uC66F"
,"\uC670","\uC671","\uC672","\uC673","\uC674","\uC675","\uC676","\uC677","\uC678","\uC679","\uC67A","\uC67B","\uC67C","\uC67D","\uC67E","\uC67F"
,"\uC680","\uC681","\uC682","\uC683","\uC684","\uC685","\uC686","\uC687","\uC688","\uC689","\uC68A","\uC68B","\uC68C","\uC68D","\uC68E","\uC68F"
,"\uC690","\uC691","\uC692","\uC693","\uC694","\uC695","\uC696","\uC697","\uC698","\uC699","\uC69A","\uC69B","\uC69C","\uC69D","\uC69E","\uC69F"
,"\uC6A0","\uC6A1","\uC6A2","\uC6A3","\uC6A4","\uC6A5","\uC6A6","\uC6A7","\uC6A8","\uC6A9","\uC6AA","\uC6AB","\uC6AC","\uC6AD","\uC6AE","\uC6AF"
,"\uC6B0","\uC6B1","\uC6B2","\uC6B3","\uC6B4","\uC6B5","\uC6B6","\uC6B7","\uC6B8","\uC6B9","\uC6BA","\uC6BB","\uC6BC","\uC6BD","\uC6BE","\uC6BF"
,"\uC6C0","\uC6C1","\uC6C2","\uC6C3","\uC6C4","\uC6C5","\uC6C6","\uC6C7","\uC6C8","\uC6C9","\uC6CA","\uC6CB","\uC6CC","\uC6CD","\uC6CE","\uC6CF"
,"\uC6D0","\uC6D1","\uC6D2","\uC6D3","\uC6D4","\uC6D5","\uC6D6","\uC6D7","\uC6D8","\uC6D9","\uC6DA","\uC6DB","\uC6DC","\uC6DD","\uC6DE","\uC6DF"
,"\uC6E0","\uC6E1","\uC6E2","\uC6E3","\uC6E4","\uC6E5","\uC6E6","\uC6E7","\uC6E8","\uC6E9","\uC6EA","\uC6EB","\uC6EC","\uC6ED","\uC6EE","\uC6EF"
,"\uC6F0","\uC6F1","\uC6F2","\uC6F3","\uC6F4","\uC6F5","\uC6F6","\uC6F7","\uC6F8","\uC6F9","\uC6FA","\uC6FB","\uC6FC","\uC6FD","\uC6FE","\uC6FF"
,"\uC700","\uC701","\uC702","\uC703","\uC704","\uC705","\uC706","\uC707","\uC708","\uC709","\uC70A","\uC70B","\uC70C","\uC70D","\uC70E","\uC70F"
,"\uC710","\uC711","\uC712","\uC713","\uC714","\uC715","\uC716","\uC717","\uC718","\uC719","\uC71A","\uC71B","\uC71C","\uC71D","\uC71E","\uC71F"
,"\uC720","\uC721","\uC722","\uC723","\uC724","\uC725","\uC726","\uC727","\uC728","\uC729","\uC72A","\uC72B","\uC72C","\uC72D","\uC72E","\uC72F"
,"\uC730","\uC731","\uC732","\uC733","\uC734","\uC735","\uC736","\uC737","\uC738","\uC739","\uC73A","\uC73B","\uC73C","\uC73D","\uC73E","\uC73F"
,"\uC740","\uC741","\uC742","\uC743","\uC744","\uC745","\uC746","\uC747","\uC748","\uC749","\uC74A","\uC74B","\uC74C","\uC74D","\uC74E","\uC74F"
,"\uC750","\uC751","\uC752","\uC753","\uC754","\uC755","\uC756","\uC757","\uC758","\uC759","\uC75A","\uC75B","\uC75C","\uC75D","\uC75E","\uC75F"
,"\uC760","\uC761","\uC762","\uC763","\uC764","\uC765","\uC766","\uC767","\uC768","\uC769","\uC76A","\uC76B","\uC76C","\uC76D","\uC76E","\uC76F"
,"\uC770","\uC771","\uC772","\uC773","\uC774","\uC775","\uC776","\uC777","\uC778","\uC779","\uC77A","\uC77B","\uC77C","\uC77D","\uC77E","\uC77F"
,"\uC780","\uC781","\uC782","\uC783","\uC784","\uC785","\uC786","\uC787","\uC788","\uC789","\uC78A","\uC78B","\uC78C","\uC78D","\uC78E","\uC78F"
,"\uC790","\uC791","\uC792","\uC793","\uC794","\uC795","\uC796","\uC797","\uC798","\uC799","\uC79A","\uC79B","\uC79C","\uC79D","\uC79E","\uC79F"
,"\uC7A0","\uC7A1","\uC7A2","\uC7A3","\uC7A4","\uC7A5","\uC7A6","\uC7A7","\uC7A8","\uC7A9","\uC7AA","\uC7AB","\uC7AC","\uC7AD","\uC7AE","\uC7AF"
,"\uC7B0","\uC7B1","\uC7B2","\uC7B3","\uC7B4","\uC7B5","\uC7B6","\uC7B7","\uC7B8","\uC7B9","\uC7BA","\uC7BB","\uC7BC","\uC7BD","\uC7BE","\uC7BF"
,"\uC7C0","\uC7C1","\uC7C2","\uC7C3","\uC7C4","\uC7C5","\uC7C6","\uC7C7","\uC7C8","\uC7C9","\uC7CA","\uC7CB","\uC7CC","\uC7CD","\uC7CE","\uC7CF"
,"\uC7D0","\uC7D1","\uC7D2","\uC7D3","\uC7D4","\uC7D5","\uC7D6","\uC7D7","\uC7D8","\uC7D9","\uC7DA","\uC7DB","\uC7DC","\uC7DD","\uC7DE","\uC7DF"
,"\uC7E0","\uC7E1","\uC7E2","\uC7E3","\uC7E4","\uC7E5","\uC7E6","\uC7E7","\uC7E8","\uC7E9","\uC7EA","\uC7EB","\uC7EC","\uC7ED","\uC7EE","\uC7EF"
,"\uC7F0","\uC7F1","\uC7F2","\uC7F3","\uC7F4","\uC7F5","\uC7F6","\uC7F7","\uC7F8","\uC7F9","\uC7FA","\uC7FB","\uC7FC","\uC7FD","\uC7FE","\uC7FF"
,"\uC800","\uC801","\uC802","\uC803","\uC804","\uC805","\uC806","\uC807","\uC808","\uC809","\uC80A","\uC80B","\uC80C","\uC80D","\uC80E","\uC80F"
,"\uC810","\uC811","\uC812","\uC813","\uC814","\uC815","\uC816","\uC817","\uC818","\uC819","\uC81A","\uC81B","\uC81C","\uC81D","\uC81E","\uC81F"
,"\uC820","\uC821","\uC822","\uC823","\uC824","\uC825","\uC826","\uC827","\uC828","\uC829","\uC82A","\uC82B","\uC82C","\uC82D","\uC82E","\uC82F"
,"\uC830","\uC831","\uC832","\uC833","\uC834","\uC835","\uC836","\uC837","\uC838","\uC839","\uC83A","\uC83B","\uC83C","\uC83D","\uC83E","\uC83F"
,"\uC840","\uC841","\uC842","\uC843","\uC844","\uC845","\uC846","\uC847","\uC848","\uC849","\uC84A","\uC84B","\uC84C","\uC84D","\uC84E","\uC84F"
,"\uC850","\uC851","\uC852","\uC853","\uC854","\uC855","\uC856","\uC857","\uC858","\uC859","\uC85A","\uC85B","\uC85C","\uC85D","\uC85E","\uC85F"
,"\uC860","\uC861","\uC862","\uC863","\uC864","\uC865","\uC866","\uC867","\uC868","\uC869","\uC86A","\uC86B","\uC86C","\uC86D","\uC86E","\uC86F"
,"\uC870","\uC871","\uC872","\uC873","\uC874","\uC875","\uC876","\uC877","\uC878","\uC879","\uC87A","\uC87B","\uC87C","\uC87D","\uC87E","\uC87F"
,"\uC880","\uC881","\uC882","\uC883","\uC884","\uC885","\uC886","\uC887","\uC888","\uC889","\uC88A","\uC88B","\uC88C","\uC88D","\uC88E","\uC88F"
,"\uC890","\uC891","\uC892","\uC893","\uC894","\uC895","\uC896","\uC897","\uC898","\uC899","\uC89A","\uC89B","\uC89C","\uC89D","\uC89E","\uC89F"
,"\uC8A0","\uC8A1","\uC8A2","\uC8A3","\uC8A4","\uC8A5","\uC8A6","\uC8A7","\uC8A8","\uC8A9","\uC8AA","\uC8AB","\uC8AC","\uC8AD","\uC8AE","\uC8AF"
,"\uC8B0","\uC8B1","\uC8B2","\uC8B3","\uC8B4","\uC8B5","\uC8B6","\uC8B7","\uC8B8","\uC8B9","\uC8BA","\uC8BB","\uC8BC","\uC8BD","\uC8BE","\uC8BF"
,"\uC8C0","\uC8C1","\uC8C2","\uC8C3","\uC8C4","\uC8C5","\uC8C6","\uC8C7","\uC8C8","\uC8C9","\uC8CA","\uC8CB","\uC8CC","\uC8CD","\uC8CE","\uC8CF"
,"\uC8D0","\uC8D1","\uC8D2","\uC8D3","\uC8D4","\uC8D5","\uC8D6","\uC8D7","\uC8D8","\uC8D9","\uC8DA","\uC8DB","\uC8DC","\uC8DD","\uC8DE","\uC8DF"
,"\uC8E0","\uC8E1","\uC8E2","\uC8E3","\uC8E4","\uC8E5","\uC8E6","\uC8E7","\uC8E8","\uC8E9","\uC8EA","\uC8EB","\uC8EC","\uC8ED","\uC8EE","\uC8EF"
,"\uC8F0","\uC8F1","\uC8F2","\uC8F3","\uC8F4","\uC8F5","\uC8F6","\uC8F7","\uC8F8","\uC8F9","\uC8FA","\uC8FB","\uC8FC","\uC8FD","\uC8FE","\uC8FF"
,"\uC900","\uC901","\uC902","\uC903","\uC904","\uC905","\uC906","\uC907","\uC908","\uC909","\uC90A","\uC90B","\uC90C","\uC90D","\uC90E","\uC90F"
,"\uC910","\uC911","\uC912","\uC913","\uC914","\uC915","\uC916","\uC917","\uC918","\uC919","\uC91A","\uC91B","\uC91C","\uC91D","\uC91E","\uC91F"
,"\uC920","\uC921","\uC922","\uC923","\uC924","\uC925","\uC926","\uC927","\uC928","\uC929","\uC92A","\uC92B","\uC92C","\uC92D","\uC92E","\uC92F"
,"\uC930","\uC931","\uC932","\uC933","\uC934","\uC935","\uC936","\uC937","\uC938","\uC939","\uC93A","\uC93B","\uC93C","\uC93D","\uC93E","\uC93F"
,"\uC940","\uC941","\uC942","\uC943","\uC944","\uC945","\uC946","\uC947","\uC948","\uC949","\uC94A","\uC94B","\uC94C","\uC94D","\uC94E","\uC94F"
,"\uC950","\uC951","\uC952","\uC953","\uC954","\uC955","\uC956","\uC957","\uC958","\uC959","\uC95A","\uC95B","\uC95C","\uC95D","\uC95E","\uC95F"
,"\uC960","\uC961","\uC962","\uC963","\uC964","\uC965","\uC966","\uC967","\uC968","\uC969","\uC96A","\uC96B","\uC96C","\uC96D","\uC96E","\uC96F"
,"\uC970","\uC971","\uC972","\uC973","\uC974","\uC975","\uC976","\uC977","\uC978","\uC979","\uC97A","\uC97B","\uC97C","\uC97D","\uC97E","\uC97F"
,"\uC980","\uC981","\uC982","\uC983","\uC984","\uC985","\uC986","\uC987","\uC988","\uC989","\uC98A","\uC98B","\uC98C","\uC98D","\uC98E","\uC98F"
,"\uC990","\uC991","\uC992","\uC993","\uC994","\uC995","\uC996","\uC997","\uC998","\uC999","\uC99A","\uC99B","\uC99C","\uC99D","\uC99E","\uC99F"
,"\uC9A0","\uC9A1","\uC9A2","\uC9A3","\uC9A4","\uC9A5","\uC9A6","\uC9A7","\uC9A8","\uC9A9","\uC9AA","\uC9AB","\uC9AC","\uC9AD","\uC9AE","\uC9AF"
,"\uC9B0","\uC9B1","\uC9B2","\uC9B3","\uC9B4","\uC9B5","\uC9B6","\uC9B7","\uC9B8","\uC9B9","\uC9BA","\uC9BB","\uC9BC","\uC9BD","\uC9BE","\uC9BF"
,"\uC9C0","\uC9C1","\uC9C2","\uC9C3","\uC9C4","\uC9C5","\uC9C6","\uC9C7","\uC9C8","\uC9C9","\uC9CA","\uC9CB","\uC9CC","\uC9CD","\uC9CE","\uC9CF"
,"\uC9D0","\uC9D1","\uC9D2","\uC9D3","\uC9D4","\uC9D5","\uC9D6","\uC9D7","\uC9D8","\uC9D9","\uC9DA","\uC9DB","\uC9DC","\uC9DD","\uC9DE","\uC9DF"
,"\uC9E0","\uC9E1","\uC9E2","\uC9E3","\uC9E4","\uC9E5","\uC9E6","\uC9E7","\uC9E8","\uC9E9","\uC9EA","\uC9EB","\uC9EC","\uC9ED","\uC9EE","\uC9EF"
,"\uC9F0","\uC9F1","\uC9F2","\uC9F3","\uC9F4","\uC9F5","\uC9F6","\uC9F7","\uC9F8","\uC9F9","\uC9FA","\uC9FB","\uC9FC","\uC9FD","\uC9FE","\uC9FF"
,"\uCA00","\uCA01","\uCA02","\uCA03","\uCA04","\uCA05","\uCA06","\uCA07","\uCA08","\uCA09","\uCA0A","\uCA0B","\uCA0C","\uCA0D","\uCA0E","\uCA0F"
,"\uCA10","\uCA11","\uCA12","\uCA13","\uCA14","\uCA15","\uCA16","\uCA17","\uCA18","\uCA19","\uCA1A","\uCA1B","\uCA1C","\uCA1D","\uCA1E","\uCA1F"
,"\uCA20","\uCA21","\uCA22","\uCA23","\uCA24","\uCA25","\uCA26","\uCA27","\uCA28","\uCA29","\uCA2A","\uCA2B","\uCA2C","\uCA2D","\uCA2E","\uCA2F"
,"\uCA30","\uCA31","\uCA32","\uCA33","\uCA34","\uCA35","\uCA36","\uCA37","\uCA38","\uCA39","\uCA3A","\uCA3B","\uCA3C","\uCA3D","\uCA3E","\uCA3F"
,"\uCA40","\uCA41","\uCA42","\uCA43","\uCA44","\uCA45","\uCA46","\uCA47","\uCA48","\uCA49","\uCA4A","\uCA4B","\uCA4C","\uCA4D","\uCA4E","\uCA4F"
,"\uCA50","\uCA51","\uCA52","\uCA53","\uCA54","\uCA55","\uCA56","\uCA57","\uCA58","\uCA59","\uCA5A","\uCA5B","\uCA5C","\uCA5D","\uCA5E","\uCA5F"
,"\uCA60","\uCA61","\uCA62","\uCA63","\uCA64","\uCA65","\uCA66","\uCA67","\uCA68","\uCA69","\uCA6A","\uCA6B","\uCA6C","\uCA6D","\uCA6E","\uCA6F"
,"\uCA70","\uCA71","\uCA72","\uCA73","\uCA74","\uCA75","\uCA76","\uCA77","\uCA78","\uCA79","\uCA7A","\uCA7B","\uCA7C","\uCA7D","\uCA7E","\uCA7F"
,"\uCA80","\uCA81","\uCA82","\uCA83","\uCA84","\uCA85","\uCA86","\uCA87","\uCA88","\uCA89","\uCA8A","\uCA8B","\uCA8C","\uCA8D","\uCA8E","\uCA8F"
,"\uCA90","\uCA91","\uCA92","\uCA93","\uCA94","\uCA95","\uCA96","\uCA97","\uCA98","\uCA99","\uCA9A","\uCA9B","\uCA9C","\uCA9D","\uCA9E","\uCA9F"
,"\uCAA0","\uCAA1","\uCAA2","\uCAA3","\uCAA4","\uCAA5","\uCAA6","\uCAA7","\uCAA8","\uCAA9","\uCAAA","\uCAAB","\uCAAC","\uCAAD","\uCAAE","\uCAAF"
,"\uCAB0","\uCAB1","\uCAB2","\uCAB3","\uCAB4","\uCAB5","\uCAB6","\uCAB7","\uCAB8","\uCAB9","\uCABA","\uCABB","\uCABC","\uCABD","\uCABE","\uCABF"
,"\uCAC0","\uCAC1","\uCAC2","\uCAC3","\uCAC4","\uCAC5","\uCAC6","\uCAC7","\uCAC8","\uCAC9","\uCACA","\uCACB","\uCACC","\uCACD","\uCACE","\uCACF"
,"\uCAD0","\uCAD1","\uCAD2","\uCAD3","\uCAD4","\uCAD5","\uCAD6","\uCAD7","\uCAD8","\uCAD9","\uCADA","\uCADB","\uCADC","\uCADD","\uCADE","\uCADF"
,"\uCAE0","\uCAE1","\uCAE2","\uCAE3","\uCAE4","\uCAE5","\uCAE6","\uCAE7","\uCAE8","\uCAE9","\uCAEA","\uCAEB","\uCAEC","\uCAED","\uCAEE","\uCAEF"
,"\uCAF0","\uCAF1","\uCAF2","\uCAF3","\uCAF4","\uCAF5","\uCAF6","\uCAF7","\uCAF8","\uCAF9","\uCAFA","\uCAFB","\uCAFC","\uCAFD","\uCAFE","\uCAFF"
,"\uCB00","\uCB01","\uCB02","\uCB03","\uCB04","\uCB05","\uCB06","\uCB07","\uCB08","\uCB09","\uCB0A","\uCB0B","\uCB0C","\uCB0D","\uCB0E","\uCB0F"
,"\uCB10","\uCB11","\uCB12","\uCB13","\uCB14","\uCB15","\uCB16","\uCB17","\uCB18","\uCB19","\uCB1A","\uCB1B","\uCB1C","\uCB1D","\uCB1E","\uCB1F"
,"\uCB20","\uCB21","\uCB22","\uCB23","\uCB24","\uCB25","\uCB26","\uCB27","\uCB28","\uCB29","\uCB2A","\uCB2B","\uCB2C","\uCB2D","\uCB2E","\uCB2F"
,"\uCB30","\uCB31","\uCB32","\uCB33","\uCB34","\uCB35","\uCB36","\uCB37","\uCB38","\uCB39","\uCB3A","\uCB3B","\uCB3C","\uCB3D","\uCB3E","\uCB3F"
,"\uCB40","\uCB41","\uCB42","\uCB43","\uCB44","\uCB45","\uCB46","\uCB47","\uCB48","\uCB49","\uCB4A","\uCB4B","\uCB4C","\uCB4D","\uCB4E","\uCB4F"
,"\uCB50","\uCB51","\uCB52","\uCB53","\uCB54","\uCB55","\uCB56","\uCB57","\uCB58","\uCB59","\uCB5A","\uCB5B","\uCB5C","\uCB5D","\uCB5E","\uCB5F"
,"\uCB60","\uCB61","\uCB62","\uCB63","\uCB64","\uCB65","\uCB66","\uCB67","\uCB68","\uCB69","\uCB6A","\uCB6B","\uCB6C","\uCB6D","\uCB6E","\uCB6F"
,"\uCB70","\uCB71","\uCB72","\uCB73","\uCB74","\uCB75","\uCB76","\uCB77","\uCB78","\uCB79","\uCB7A","\uCB7B","\uCB7C","\uCB7D","\uCB7E","\uCB7F"
,"\uCB80","\uCB81","\uCB82","\uCB83","\uCB84","\uCB85","\uCB86","\uCB87","\uCB88","\uCB89","\uCB8A","\uCB8B","\uCB8C","\uCB8D","\uCB8E","\uCB8F"
,"\uCB90","\uCB91","\uCB92","\uCB93","\uCB94","\uCB95","\uCB96","\uCB97","\uCB98","\uCB99","\uCB9A","\uCB9B","\uCB9C","\uCB9D","\uCB9E","\uCB9F"
,"\uCBA0","\uCBA1","\uCBA2","\uCBA3","\uCBA4","\uCBA5","\uCBA6","\uCBA7","\uCBA8","\uCBA9","\uCBAA","\uCBAB","\uCBAC","\uCBAD","\uCBAE","\uCBAF"
,"\uCBB0","\uCBB1","\uCBB2","\uCBB3","\uCBB4","\uCBB5","\uCBB6","\uCBB7","\uCBB8","\uCBB9","\uCBBA","\uCBBB","\uCBBC","\uCBBD","\uCBBE","\uCBBF"
,"\uCBC0","\uCBC1","\uCBC2","\uCBC3","\uCBC4","\uCBC5","\uCBC6","\uCBC7","\uCBC8","\uCBC9","\uCBCA","\uCBCB","\uCBCC","\uCBCD","\uCBCE","\uCBCF"
,"\uCBD0","\uCBD1","\uCBD2","\uCBD3","\uCBD4","\uCBD5","\uCBD6","\uCBD7","\uCBD8","\uCBD9","\uCBDA","\uCBDB","\uCBDC","\uCBDD","\uCBDE","\uCBDF"
,"\uCBE0","\uCBE1","\uCBE2","\uCBE3","\uCBE4","\uCBE5","\uCBE6","\uCBE7","\uCBE8","\uCBE9","\uCBEA","\uCBEB","\uCBEC","\uCBED","\uCBEE","\uCBEF"
,"\uCBF0","\uCBF1","\uCBF2","\uCBF3","\uCBF4","\uCBF5","\uCBF6","\uCBF7","\uCBF8","\uCBF9","\uCBFA","\uCBFB","\uCBFC","\uCBFD","\uCBFE","\uCBFF"
,"\uCC00","\uCC01","\uCC02","\uCC03","\uCC04","\uCC05","\uCC06","\uCC07","\uCC08","\uCC09","\uCC0A","\uCC0B","\uCC0C","\uCC0D","\uCC0E","\uCC0F"
,"\uCC10","\uCC11","\uCC12","\uCC13","\uCC14","\uCC15","\uCC16","\uCC17","\uCC18","\uCC19","\uCC1A","\uCC1B","\uCC1C","\uCC1D","\uCC1E","\uCC1F"
,"\uCC20","\uCC21","\uCC22","\uCC23","\uCC24","\uCC25","\uCC26","\uCC27","\uCC28","\uCC29","\uCC2A","\uCC2B","\uCC2C","\uCC2D","\uCC2E","\uCC2F"
,"\uCC30","\uCC31","\uCC32","\uCC33","\uCC34","\uCC35","\uCC36","\uCC37","\uCC38","\uCC39","\uCC3A","\uCC3B","\uCC3C","\uCC3D","\uCC3E","\uCC3F"
,"\uCC40","\uCC41","\uCC42","\uCC43","\uCC44","\uCC45","\uCC46","\uCC47","\uCC48","\uCC49","\uCC4A","\uCC4B","\uCC4C","\uCC4D","\uCC4E","\uCC4F"
,"\uCC50","\uCC51","\uCC52","\uCC53","\uCC54","\uCC55","\uCC56","\uCC57","\uCC58","\uCC59","\uCC5A","\uCC5B","\uCC5C","\uCC5D","\uCC5E","\uCC5F"
,"\uCC60","\uCC61","\uCC62","\uCC63","\uCC64","\uCC65","\uCC66","\uCC67","\uCC68","\uCC69","\uCC6A","\uCC6B","\uCC6C","\uCC6D","\uCC6E","\uCC6F"
,"\uCC70","\uCC71","\uCC72","\uCC73","\uCC74","\uCC75","\uCC76","\uCC77","\uCC78","\uCC79","\uCC7A","\uCC7B","\uCC7C","\uCC7D","\uCC7E","\uCC7F"
,"\uCC80","\uCC81","\uCC82","\uCC83","\uCC84","\uCC85","\uCC86","\uCC87","\uCC88","\uCC89","\uCC8A","\uCC8B","\uCC8C","\uCC8D","\uCC8E","\uCC8F"
,"\uCC90","\uCC91","\uCC92","\uCC93","\uCC94","\uCC95","\uCC96","\uCC97","\uCC98","\uCC99","\uCC9A","\uCC9B","\uCC9C","\uCC9D","\uCC9E","\uCC9F"
,"\uCCA0","\uCCA1","\uCCA2","\uCCA3","\uCCA4","\uCCA5","\uCCA6","\uCCA7","\uCCA8","\uCCA9","\uCCAA","\uCCAB","\uCCAC","\uCCAD","\uCCAE","\uCCAF"
,"\uCCB0","\uCCB1","\uCCB2","\uCCB3","\uCCB4","\uCCB5","\uCCB6","\uCCB7","\uCCB8","\uCCB9","\uCCBA","\uCCBB","\uCCBC","\uCCBD","\uCCBE","\uCCBF"
,"\uCCC0","\uCCC1","\uCCC2","\uCCC3","\uCCC4","\uCCC5","\uCCC6","\uCCC7","\uCCC8","\uCCC9","\uCCCA","\uCCCB","\uCCCC","\uCCCD","\uCCCE","\uCCCF"
,"\uCCD0","\uCCD1","\uCCD2","\uCCD3","\uCCD4","\uCCD5","\uCCD6","\uCCD7","\uCCD8","\uCCD9","\uCCDA","\uCCDB","\uCCDC","\uCCDD","\uCCDE","\uCCDF"
,"\uCCE0","\uCCE1","\uCCE2","\uCCE3","\uCCE4","\uCCE5","\uCCE6","\uCCE7","\uCCE8","\uCCE9","\uCCEA","\uCCEB","\uCCEC","\uCCED","\uCCEE","\uCCEF"
,"\uCCF0","\uCCF1","\uCCF2","\uCCF3","\uCCF4","\uCCF5","\uCCF6","\uCCF7","\uCCF8","\uCCF9","\uCCFA","\uCCFB","\uCCFC","\uCCFD","\uCCFE","\uCCFF"
,"\uCD00","\uCD01","\uCD02","\uCD03","\uCD04","\uCD05","\uCD06","\uCD07","\uCD08","\uCD09","\uCD0A","\uCD0B","\uCD0C","\uCD0D","\uCD0E","\uCD0F"
,"\uCD10","\uCD11","\uCD12","\uCD13","\uCD14","\uCD15","\uCD16","\uCD17","\uCD18","\uCD19","\uCD1A","\uCD1B","\uCD1C","\uCD1D","\uCD1E","\uCD1F"
,"\uCD20","\uCD21","\uCD22","\uCD23","\uCD24","\uCD25","\uCD26","\uCD27","\uCD28","\uCD29","\uCD2A","\uCD2B","\uCD2C","\uCD2D","\uCD2E","\uCD2F"
,"\uCD30","\uCD31","\uCD32","\uCD33","\uCD34","\uCD35","\uCD36","\uCD37","\uCD38","\uCD39","\uCD3A","\uCD3B","\uCD3C","\uCD3D","\uCD3E","\uCD3F"
,"\uCD40","\uCD41","\uCD42","\uCD43","\uCD44","\uCD45","\uCD46","\uCD47","\uCD48","\uCD49","\uCD4A","\uCD4B","\uCD4C","\uCD4D","\uCD4E","\uCD4F"
,"\uCD50","\uCD51","\uCD52","\uCD53","\uCD54","\uCD55","\uCD56","\uCD57","\uCD58","\uCD59","\uCD5A","\uCD5B","\uCD5C","\uCD5D","\uCD5E","\uCD5F"
,"\uCD60","\uCD61","\uCD62","\uCD63","\uCD64","\uCD65","\uCD66","\uCD67","\uCD68","\uCD69","\uCD6A","\uCD6B","\uCD6C","\uCD6D","\uCD6E","\uCD6F"
,"\uCD70","\uCD71","\uCD72","\uCD73","\uCD74","\uCD75","\uCD76","\uCD77","\uCD78","\uCD79","\uCD7A","\uCD7B","\uCD7C","\uCD7D","\uCD7E","\uCD7F"
,"\uCD80","\uCD81","\uCD82","\uCD83","\uCD84","\uCD85","\uCD86","\uCD87","\uCD88","\uCD89","\uCD8A","\uCD8B","\uCD8C","\uCD8D","\uCD8E","\uCD8F"
,"\uCD90","\uCD91","\uCD92","\uCD93","\uCD94","\uCD95","\uCD96","\uCD97","\uCD98","\uCD99","\uCD9A","\uCD9B","\uCD9C","\uCD9D","\uCD9E","\uCD9F"
,"\uCDA0","\uCDA1","\uCDA2","\uCDA3","\uCDA4","\uCDA5","\uCDA6","\uCDA7","\uCDA8","\uCDA9","\uCDAA","\uCDAB","\uCDAC","\uCDAD","\uCDAE","\uCDAF"
,"\uCDB0","\uCDB1","\uCDB2","\uCDB3","\uCDB4","\uCDB5","\uCDB6","\uCDB7","\uCDB8","\uCDB9","\uCDBA","\uCDBB","\uCDBC","\uCDBD","\uCDBE","\uCDBF"
,"\uCDC0","\uCDC1","\uCDC2","\uCDC3","\uCDC4","\uCDC5","\uCDC6","\uCDC7","\uCDC8","\uCDC9","\uCDCA","\uCDCB","\uCDCC","\uCDCD","\uCDCE","\uCDCF"
,"\uCDD0","\uCDD1","\uCDD2","\uCDD3","\uCDD4","\uCDD5","\uCDD6","\uCDD7","\uCDD8","\uCDD9","\uCDDA","\uCDDB","\uCDDC","\uCDDD","\uCDDE","\uCDDF"
,"\uCDE0","\uCDE1","\uCDE2","\uCDE3","\uCDE4","\uCDE5","\uCDE6","\uCDE7","\uCDE8","\uCDE9","\uCDEA","\uCDEB","\uCDEC","\uCDED","\uCDEE","\uCDEF"
,"\uCDF0","\uCDF1","\uCDF2","\uCDF3","\uCDF4","\uCDF5","\uCDF6","\uCDF7","\uCDF8","\uCDF9","\uCDFA","\uCDFB","\uCDFC","\uCDFD","\uCDFE","\uCDFF"
,"\uCE00","\uCE01","\uCE02","\uCE03","\uCE04","\uCE05","\uCE06","\uCE07","\uCE08","\uCE09","\uCE0A","\uCE0B","\uCE0C","\uCE0D","\uCE0E","\uCE0F"
,"\uCE10","\uCE11","\uCE12","\uCE13","\uCE14","\uCE15","\uCE16","\uCE17","\uCE18","\uCE19","\uCE1A","\uCE1B","\uCE1C","\uCE1D","\uCE1E","\uCE1F"
,"\uCE20","\uCE21","\uCE22","\uCE23","\uCE24","\uCE25","\uCE26","\uCE27","\uCE28","\uCE29","\uCE2A","\uCE2B","\uCE2C","\uCE2D","\uCE2E","\uCE2F"
,"\uCE30","\uCE31","\uCE32","\uCE33","\uCE34","\uCE35","\uCE36","\uCE37","\uCE38","\uCE39","\uCE3A","\uCE3B","\uCE3C","\uCE3D","\uCE3E","\uCE3F"
,"\uCE40","\uCE41","\uCE42","\uCE43","\uCE44","\uCE45","\uCE46","\uCE47","\uCE48","\uCE49","\uCE4A","\uCE4B","\uCE4C","\uCE4D","\uCE4E","\uCE4F"
,"\uCE50","\uCE51","\uCE52","\uCE53","\uCE54","\uCE55","\uCE56","\uCE57","\uCE58","\uCE59","\uCE5A","\uCE5B","\uCE5C","\uCE5D","\uCE5E","\uCE5F"
,"\uCE60","\uCE61","\uCE62","\uCE63","\uCE64","\uCE65","\uCE66","\uCE67","\uCE68","\uCE69","\uCE6A","\uCE6B","\uCE6C","\uCE6D","\uCE6E","\uCE6F"
,"\uCE70","\uCE71","\uCE72","\uCE73","\uCE74","\uCE75","\uCE76","\uCE77","\uCE78","\uCE79","\uCE7A","\uCE7B","\uCE7C","\uCE7D","\uCE7E","\uCE7F"
,"\uCE80","\uCE81","\uCE82","\uCE83","\uCE84","\uCE85","\uCE86","\uCE87","\uCE88","\uCE89","\uCE8A","\uCE8B","\uCE8C","\uCE8D","\uCE8E","\uCE8F"
,"\uCE90","\uCE91","\uCE92","\uCE93","\uCE94","\uCE95","\uCE96","\uCE97","\uCE98","\uCE99","\uCE9A","\uCE9B","\uCE9C","\uCE9D","\uCE9E","\uCE9F"
,"\uCEA0","\uCEA1","\uCEA2","\uCEA3","\uCEA4","\uCEA5","\uCEA6","\uCEA7","\uCEA8","\uCEA9","\uCEAA","\uCEAB","\uCEAC","\uCEAD","\uCEAE","\uCEAF"
,"\uCEB0","\uCEB1","\uCEB2","\uCEB3","\uCEB4","\uCEB5","\uCEB6","\uCEB7","\uCEB8","\uCEB9","\uCEBA","\uCEBB","\uCEBC","\uCEBD","\uCEBE","\uCEBF"
,"\uCEC0","\uCEC1","\uCEC2","\uCEC3","\uCEC4","\uCEC5","\uCEC6","\uCEC7","\uCEC8","\uCEC9","\uCECA","\uCECB","\uCECC","\uCECD","\uCECE","\uCECF"
,"\uCED0","\uCED1","\uCED2","\uCED3","\uCED4","\uCED5","\uCED6","\uCED7","\uCED8","\uCED9","\uCEDA","\uCEDB","\uCEDC","\uCEDD","\uCEDE","\uCEDF"
,"\uCEE0","\uCEE1","\uCEE2","\uCEE3","\uCEE4","\uCEE5","\uCEE6","\uCEE7","\uCEE8","\uCEE9","\uCEEA","\uCEEB","\uCEEC","\uCEED","\uCEEE","\uCEEF"
,"\uCEF0","\uCEF1","\uCEF2","\uCEF3","\uCEF4","\uCEF5","\uCEF6","\uCEF7","\uCEF8","\uCEF9","\uCEFA","\uCEFB","\uCEFC","\uCEFD","\uCEFE","\uCEFF"
,"\uCF00","\uCF01","\uCF02","\uCF03","\uCF04","\uCF05","\uCF06","\uCF07","\uCF08","\uCF09","\uCF0A","\uCF0B","\uCF0C","\uCF0D","\uCF0E","\uCF0F"
,"\uCF10","\uCF11","\uCF12","\uCF13","\uCF14","\uCF15","\uCF16","\uCF17","\uCF18","\uCF19","\uCF1A","\uCF1B","\uCF1C","\uCF1D","\uCF1E","\uCF1F"
,"\uCF20","\uCF21","\uCF22","\uCF23","\uCF24","\uCF25","\uCF26","\uCF27","\uCF28","\uCF29","\uCF2A","\uCF2B","\uCF2C","\uCF2D","\uCF2E","\uCF2F"
,"\uCF30","\uCF31","\uCF32","\uCF33","\uCF34","\uCF35","\uCF36","\uCF37","\uCF38","\uCF39","\uCF3A","\uCF3B","\uCF3C","\uCF3D","\uCF3E","\uCF3F"
,"\uCF40","\uCF41","\uCF42","\uCF43","\uCF44","\uCF45","\uCF46","\uCF47","\uCF48","\uCF49","\uCF4A","\uCF4B","\uCF4C","\uCF4D","\uCF4E","\uCF4F"
,"\uCF50","\uCF51","\uCF52","\uCF53","\uCF54","\uCF55","\uCF56","\uCF57","\uCF58","\uCF59","\uCF5A","\uCF5B","\uCF5C","\uCF5D","\uCF5E","\uCF5F"
,"\uCF60","\uCF61","\uCF62","\uCF63","\uCF64","\uCF65","\uCF66","\uCF67","\uCF68","\uCF69","\uCF6A","\uCF6B","\uCF6C","\uCF6D","\uCF6E","\uCF6F"
,"\uCF70","\uCF71","\uCF72","\uCF73","\uCF74","\uCF75","\uCF76","\uCF77","\uCF78","\uCF79","\uCF7A","\uCF7B","\uCF7C","\uCF7D","\uCF7E","\uCF7F"
,"\uCF80","\uCF81","\uCF82","\uCF83","\uCF84","\uCF85","\uCF86","\uCF87","\uCF88","\uCF89","\uCF8A","\uCF8B","\uCF8C","\uCF8D","\uCF8E","\uCF8F"
,"\uCF90","\uCF91","\uCF92","\uCF93","\uCF94","\uCF95","\uCF96","\uCF97","\uCF98","\uCF99","\uCF9A","\uCF9B","\uCF9C","\uCF9D","\uCF9E","\uCF9F"
,"\uCFA0","\uCFA1","\uCFA2","\uCFA3","\uCFA4","\uCFA5","\uCFA6","\uCFA7","\uCFA8","\uCFA9","\uCFAA","\uCFAB","\uCFAC","\uCFAD","\uCFAE","\uCFAF"
,"\uCFB0","\uCFB1","\uCFB2","\uCFB3","\uCFB4","\uCFB5","\uCFB6","\uCFB7","\uCFB8","\uCFB9","\uCFBA","\uCFBB","\uCFBC","\uCFBD","\uCFBE","\uCFBF"
,"\uCFC0","\uCFC1","\uCFC2","\uCFC3","\uCFC4","\uCFC5","\uCFC6","\uCFC7","\uCFC8","\uCFC9","\uCFCA","\uCFCB","\uCFCC","\uCFCD","\uCFCE","\uCFCF"
,"\uCFD0","\uCFD1","\uCFD2","\uCFD3","\uCFD4","\uCFD5","\uCFD6","\uCFD7","\uCFD8","\uCFD9","\uCFDA","\uCFDB","\uCFDC","\uCFDD","\uCFDE","\uCFDF"
,"\uCFE0","\uCFE1","\uCFE2","\uCFE3","\uCFE4","\uCFE5","\uCFE6","\uCFE7","\uCFE8","\uCFE9","\uCFEA","\uCFEB","\uCFEC","\uCFED","\uCFEE","\uCFEF"
,"\uCFF0","\uCFF1","\uCFF2","\uCFF3","\uCFF4","\uCFF5","\uCFF6","\uCFF7","\uCFF8","\uCFF9","\uCFFA","\uCFFB","\uCFFC","\uCFFD","\uCFFE","\uCFFF"
    };
}    

