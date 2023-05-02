package Course3Sprint3;

public class VoterImpl {
    public static void main(String[] args) {
        Voter p1 = new Voter();
        p1.setAge(23);
        p1.setName("Keshav");
        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p1.getAgeCritreria());
    }
}
