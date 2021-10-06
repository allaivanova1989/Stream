import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Parent> parents = Arrays.asList(
                new Parent("Parent1",43, Arrays.asList(
                        new Child("Child11", 17, true),
                        new Child("Child12", 25, false)

                )),
                new Parent("Parent2", 36,Arrays.asList(
                        new Child("Child21", 7, true),
                        new Child("Child22", 10, false),
                        new Child("Child23", 16, true)
                )),
                new Parent ("Parent3", 47,Arrays.asList(
                        new Child("Child31", 16, false),
                        new Child("Child32", 22, false),
                        new Child("Child33", 28, true),
                        new Child("Child34",18 , true)
                ))
        );
        parents.stream()
                .filter(parent -> parent.getChilds().size()>3)
                .forEach(System.out::println);
        parents.stream()
                .flatMap(parent -> parent.getChilds().stream())
                .filter(child -> !child.isMan())
                .forEach(System.out::println);

        parents.stream()
                .flatMap(parent -> parent.getChilds().stream())
                .map(Child::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        parents.stream()
                .flatMap(parent -> parent.getChilds().stream())
                .map(Child::getName)
                .filter(name -> name.contains("2"))
                .forEach(System.out::println);

         Map<String, Integer> collect = parents.stream()
                .collect(Collectors.toMap(parent -> parent.getName(), parent -> parent.getChilds().size()));


    }
}
