public class Singer {
    boolean happy;

    public Singer() {
        happy = true;
    }

    public void sing() {
        if (happy == true) {
            System.out.println("Things can only get better");
        } else {
            System.out.println("It's all completely pointless");
        }
    }

    public void sing1() {
        if (happy) {
            System.out.println("Things can only get better");
        } else {
            System.out.println("It's all completely pointless");
        }
    }

    public boolean isSad() {
        if (happy == true) {
            return false;
        } else {
            return true;
        }
    }

    public boolean badIsSad() {
        if (happy = true) {
            return false;
        } else {
            return true;
        }
    }
}



