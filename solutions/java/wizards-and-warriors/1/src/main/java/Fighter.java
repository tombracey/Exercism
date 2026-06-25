class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    public boolean isVulnerable() {
        return false;
    }

    public int getDamagePoints(Fighter f) {
        if (f.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}


// TODO: define the Wizard class
class Wizard extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    boolean spellPrepared = false;

    public void prepareSpell() {
        spellPrepared = true;
    }

    public boolean isVulnerable() {
        return !spellPrepared;
    }

    public int getDamagePoints(Fighter f) {
        if (spellPrepared) {
            return 12;
        }
        return 3;
    }
}
