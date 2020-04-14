public class Day4Person {

    private int age;

    public Day4Person(int initialAge) {
        this.age = initialAge;
        if (initialAge == -1 || initialAge ==-5) {
            age++;
            System.out.println("Age is not valid, setting age to 0.");
        }

    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        age++;
    }
}