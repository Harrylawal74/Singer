public class Singer
{
    boolean happy;

    public Singer()
    {
        happy = true;
    }

    public void sing()
    {
        if (happy == true) {
            System.out.println("Things can only get better");
        }
        else {
            System.out.println("It's all completely pointless");
        }
    }

    public void sing1()
    {
        if (happy) {
            System.out.println("Things can only get better");
        }
        else {
            System.out.println("It's all completely pointless");
        }
    }

    public boolean isSad()
    {
        // "!" returns opposite of logical state of operand e.g. if "happy" is true then returns false.
        return !happy;
    }

    public boolean isHappy()
    {
        //returns the double opposite of logical state of operand
        return !(!happy);
    }

    //switches logical state to opposite
    public void changeMood() {
        happy = !happy;
    }

    //Tests
    public static void main(String[] args) {
        Singer person = new Singer();
        person.sing();
    }
}