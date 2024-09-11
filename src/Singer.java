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

    public void changeMood() {
        if(happy == true) {
            happy = false;
        }
        else
        {
            happy = true;
        }
    }

    public static void main(String[] args) {
        Singer person1 = new Singer();



        System.out.println(person1.isHappy());
    }
}