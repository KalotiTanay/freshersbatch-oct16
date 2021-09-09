abstract class Persistance {
    abstract void persist();
}
class filePersistance extends Persistance{

    @Override
    void persist() {
        System.out.println("file persistance");
    }
}

class DataBasePersistance extends Persistance{

    @Override
    void persist() {
        System.out.println("Database persistance");
    }
}

public class persistanceEx {
    public static void main(String[] args) {
        Persistance p1 = new filePersistance();
        Persistance p2 = new DataBasePersistance();
        p1.persist();;
        p2.persist();
    }
}
