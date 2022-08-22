public class Main {
    public static void main(String[] args) {


        Warrior sniper = new Warrior();



        Magic magic = new Magic();

        Medic medic = new Medic();



        HavingSuperAbility[] hero = {sniper,medic, magic };
        for (int i = 0; i < hero.length; i++) {
            if (hero [i] instanceof Medic ){
                ((Medic) hero[i]).increaseExperience();
            }


            hero[i].applySuperAbility();

        }

        }

    }


