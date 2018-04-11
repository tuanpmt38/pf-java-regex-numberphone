public class PhoneNumberTest {
    //private static PhoneNumber phoneNumber;
    public static String[] isnumber = new String [] {"(84)-(0965950123)","(84)-(0965950234)","(84)-(0965950456)"};
    public static String[] inisnumber = new String [] {"(84)-(096xx950123)","(84)-(0965*50234)","(84)-(096595045)"};
    public static void main(String[] args) {
      PhoneNumber phoneNumber = new PhoneNumber();
        for (String phone : isnumber) {
            boolean isnumber = phoneNumber.isvalidate(phone);
            System.out.println("NUmber phone"+phone+"is: "+isnumber);
        }
        System.out.println();
        for(String phonefalse: inisnumber){
            boolean inisnumber = phoneNumber.isvalidate(phonefalse);
            System.out.println("Number phone"+phonefalse+"is: "+inisnumber);
        }
    }
}
