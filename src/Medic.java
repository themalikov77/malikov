public class Medic extends Hero {
    @Override
    public String superPower() {
        return null;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic izlechil na " + healPoints);

    }

    int healPoints = 50;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints = healPoints + ((healPoints / 100) * 10);
    }
}




