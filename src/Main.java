import creational.abstract_factory.AbstractFactory;
import creational.builder.Builder;
import creational.factory_method.FactoryMethod;
import creational.prototype.Prototype;
import creational.singleton.Singleton;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main (String[] args) {
        scanner = new Scanner(System.in);

        goToMenu();
    }

    public static void goToMenu() {
        System.out.print(
                """

                        Please select an option:
                        (0) Exit.
                        (1) Creational patterns.
                        (2) Collectional patterns.
                        (3) Structural patterns.
                        (4) Behavioral patterns.
                        $\s"""
        );
        int selected = scanner.nextInt();
        switch (selected) {
            case 0 -> System.exit(0);
            case 1 -> goToCreational();
            case 2 -> goToCollectional();
            case 3 -> goToStructural();
            case 4 -> goToBehavioral();
            default -> goToMenu();
        }
    }

    private static void goToCreational() {
        System.out.print(
                """

                        Please select an option:
                        (0) Back to menu.
                        (1) Factory method.
                        (2) Singleton.
                        (3) Abstract factory.
                        (4) Prototype.
                        (5) Builder.
                        $\s"""
        );
        int selected = scanner.nextInt();
        switch (selected) {
            case 0:
                goToMenu();
            case 1:
                FactoryMethod.execute();
                goToMenu();
                break;
            case 2:
                Singleton.execute();
                goToMenu();
                break;
            case 3:
                AbstractFactory.execute();
                goToMenu();
                break;
            case 4:
                Prototype.execute();
                goToMenu();
                break;
            case 5:
                Builder.execute();
                goToMenu();
                break;
            default:
                goToCreational();
        }
    }

    private static void goToCollectional() {
        System.out.println(
                """

                        Please select an option:
                        (6) Composite.
                        (7) Iterator.
                        (8) Flyweight.
                        (9) Decorator.
                        (10) Adapter.
                        (11) Chain of responsibility.
                        (12) Facade.
                        (13) Proxy.
                        (14) Bridge.
                        (15) Command.
                        (16) Mediator.
                        (17) Memento.
                        (18) Observer.
                        (19) State.
                        (20) Strategy.
                        $\s"""
        );
    }

    private static void goToStructural() {
        System.out.println(
                """

                        Please select an option:
                        (6) Composite.
                        (7) Iterator.
                        (8) Flyweight.
                        (9) Decorator.
                        (10) Adapter.
                        (11) Chain of responsibility.
                        (12) Facade.
                        (13) Proxy.
                        (14) Bridge.
                        (15) Command.
                        (16) Mediator.
                        (17) Memento.
                        (18) Observer.
                        (19) State.
                        (20) Strategy.
                        $\s"""
        );
    }

    private static void goToBehavioral() {
        System.out.println(
                """

                        Please select an option:
                        (6) Composite.
                        (7) Iterator.
                        (8) Flyweight.
                        (9) Decorator.
                        (10) Adapter.
                        (11) Chain of responsibility.
                        (12) Facade.
                        (13) Proxy.
                        (14) Bridge.
                        (15) Command.
                        (16) Mediator.
                        (17) Memento.
                        (18) Observer.
                        (19) State.
                        (20) Strategy.
                        $\s"""
        );
    }
}
