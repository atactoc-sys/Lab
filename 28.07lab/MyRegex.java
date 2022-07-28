package String;

public class MyRegex {
    public static void main(String[] args) {
        RegexIpLab obj = new RegexIpLab();
        obj.check("000.12.12.034");
        obj.check("121.234.12.12");
        obj.check("23.45.12.56");
        obj.check("00.12.123.123123.123");
        obj.check("122.23");
        obj.check("Hello.Ip");
    }
}
