public class MainApp {
    public static void main(String[] args)
    {
        AppleBox AppleBoxy = new AppleBox(new Apple());
        AppleBoxy.BoxName = "Яблоки1";

        OrangeBox OrangeBoxy = new OrangeBox(new Orange());
        OrangeBoxy.BoxName = "Апельсины1";

        AppleBox AppleBoxy2 = new AppleBox(new Apple());
        AppleBoxy2.BoxName = "Яблоки2";

        OrangeBox OrangeBoxy2 = new OrangeBox(new Orange(), new Orange());
        OrangeBoxy2.BoxName= "Апельсины2";

        MixBox MixBoxy = new MixBox(new Orange(), new Apple());
        MixBoxy.BoxName= "Миксбокс";

        AppleBoxy.info();
 //       AppleBoxy2.info();
        OrangeBoxy.info();
 //      OrangeBoxy2.info();
        MixBoxy.info();

        System.out.println();
        System.out.println("Проводим манипуляции с пересыпанием/добавлением:");
        System.out.println();

//        AppleBoxy.add(new Apple());
//        MixBoxy.add(new Apple());
        MixBoxy.add(new Orange());

//        AppleBoxy.MoveFrom(MixBoxy);
//      MixBoxy.MoveFrom(OrangeBoxy);
        MixBoxy.MoveFrom(AppleBoxy);
//        AppleBoxy.MoveFrom(MixBoxy
//        OrangeBoxy2.compare(AppleBoxy2);

        AppleBoxy.info();
 //       AppleBoxy2.info();
        OrangeBoxy.info();
   //    OrangeBoxy2.info();
        MixBoxy.info();
    }
}