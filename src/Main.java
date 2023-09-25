public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        weapon.setTypeWeapon("gun");
        weapon.setName("Glock");
        boss.setWeapon(weapon);
        boss.setDamage(20);
        boss.setHealth(200);
        System.out.println("Тип оружия: " + boss.getWeapon().getTypeWeapon());
        System.out.println("Название оружие: " + boss.getWeapon().getName());
        System.out.println("Урон Босса : " + boss.getDamage());
        System.out.println("Здоровья Босса : " + boss.getHealth());
    }
}