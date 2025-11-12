package enumExamples;

public class Basic{

    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants each one is public, static and final
        // since its final you can create child enums
        // all enums extends java.lang.enum class, so cannot extend anything else

        Week() {
            System.out.println("Constructor called for " + this);
             // this is not public and protected, only private or default
            // we don't want to create new objects
            // this is not the enum concept,that's why
            // internally: public static final Week Monday = new Week();
        }

        @Override
        public void greet() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.greet();
        for(Week day: Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
//        System.out.println(week.ordinal());
    }
}
