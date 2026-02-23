package EX_24_Enums;

public class Enum_002 {
    public static void main(String[] args) {
        System.out.println(HEX_CODE.BLACK.getHexcode());
        System.out.println(HEX_CODE.BLUE.getHexcode());
        System.out.println(HEX_CODE.RED.getHexcode());
    }
}

enum HEX_CODE{
    RED ("#REDCOLOR"),
    BLUE ("#BLUECOLOR"),
    BLACK ("BLACKCOLOR"),
    GREEN("GREENCOLOR");

    private String hexCode;

    HEX_CODE(String hexcode){
        this.hexCode = hexcode;
    }

    String getHexcode(){
        return  this.hexCode;
    }
}


