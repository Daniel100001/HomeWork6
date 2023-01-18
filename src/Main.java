public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setBossDamage(354);
        boss1.setBossHealth(543);
        boss1.setBossName("I'm boss");
        boss1.setWeaponName("Томсон");
        boss1.setWeaponType("Скорострельный");

        System.out.println(boss1.info());


        Skeleton skeleton1 = new Skeleton();
        skeleton1.setNumberOfArrows(94);
        skeleton1.setBossDamage(30);
        skeleton1.setBossHealth(100);
        skeleton1.setBossName("Skelet1");
        skeleton1.setWeaponName("Лук");
        skeleton1.setWeaponType("примитивный");
        System.out.println(skeleton1.info());



        Skeleton skeleton2 = new Skeleton();
        skeleton2.setNumberOfArrows(94453);
        skeleton2.setBossDamage(40);
        skeleton2.setBossHealth(200);
        skeleton2.setBossName("Skelet2");
        skeleton2.setWeaponName("Лук");
        skeleton2.setWeaponType("примитивный");
        System.out.println(skeleton2.info());


    }
}