package myAnnotation;

class Developers{
    int DeveloperId;
    String name, supervisor;

    @Info()
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Developers(int developerId, String name) {
        DeveloperId = developerId;
        this.name = name;
    }
}

@interface Info{
    int AuthorId() default 0;
    String date() default "00.00.00";
    String time() default "00.00";
    int version()default 0;
}

public class annote2 {
    public static void main(String[] args) {
        Developers d1 = new Developers(001, "Raju");
        d1.setSupervisor("Ramesh");
    }
}
