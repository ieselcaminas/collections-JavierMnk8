package comparable.repaso;

import java.util.ArrayList;
import java.util.List;

public class MainMember {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        Member m = new Member("Alberto", 168);
        members.add(m);

        m = new Member("María", 168);
        members.add(m);

        m = new Member("Andres", 190);
        members.add(m);
        members.stream()
                .sorted()
                .forEach(System.out::println);

    }
}