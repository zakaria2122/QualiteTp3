import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(true); // true signifie que la boîte est ouverte

        // Création de quelques objets Things
        Things t1 = new Things("Épée", 100, 5);
        Things t2 = new Things("Bouclier", 150, 7);
        Things sword = new Things("Épée", 100, 5);

        // Ajout des objets dans la boîte
        box.add(t1);
        box.add(t2);
        box.add(sword);

        // Vérification si la boîte contient certains objets
        System.out.println("La boîte contient une épée ? " + box.contains(t1));
        System.out.println("La boîte contient un arc ? " + box.contains(new Things("Arc", 80, 3)));
        System.out.println("La boîte contient un bouclier ? " + box.contains(t2));
        System.out.println("La boîte contient un objet null ? " + box.contains(null));
        System.out.println("La boîte contient une épée ? " + box.contains(sword));
        System.out.println("La boîte contient un objet identique à l'épée ? " + box.contains(new Things("Épée", 100, 5)));
        
        // Création des objets
        Things bow = new Things("Arc", 80, 3);

    
                // Test d'ajout d'objets
        box.add(t1);
        box.add(t2);
        box.add(sword);
        
        // Test contains()
        System.out.println("La boîte contient une épée ? " + box.contains(t1)); // true
        System.out.println("La boîte contient un arc ? " + box.contains(bow)); // false
        System.out.println("La boîte contient un bouclier ? " + box.contains(t2)); // true
        System.out.println("La boîte contient un objet null ? " + box.contains(null)); // false
        System.out.println("La boîte contient une épée ? " + box.contains(sword)); // true
        System.out.println("La boîte contient un objet identique à l'épée ? " + box.contains(new Things("Épée", 100, 5))); // true

        // Test remove()
        box.remove(t1);
        System.out.println("La boîte contient-elle l'épée après suppression ? " + box.contains(t1)); // false

        // Test clear()
        box.clear();
        System.out.println("La boîte est-elle vide après clear ? " + box.isEmpty()); // true

        // Test size() après clear
        System.out.println("Taille de la boîte après clear : " + box.size()); // 0

        // Test add après clear
        box.add(t1);
        System.out.println("La boîte contient-elle l'épée après ajout ? " + box.contains(t1)); // true

        // Test get() et index
        box.add(t2);
        box.add(bow);
        System.out.println("Premier objet dans la boîte : " + box.get(0).getName()); // Épée
        System.out.println("Deuxième objet dans la boîte : " + box.get(1).getName()); // Bouclier

        // Test isEmpty()
        System.out.println("La boîte est-elle vide ? " + box.isEmpty()); // false
        System.out.println("Taille de la boîte : " + box.size()); // 3

        // Test taille de la boîte
        box.remove(t2);
        System.out.println("Taille de la boîte après suppression d'un objet : " + box.size()); // 2

        // Test equals()
        System.out.println("L'épée est-elle égale à l'épée ? " + t1.equals(sword)); // true
        System.out.println("L'épée est-elle égale à l'arc ? " + t1.equals(bow)); // false
        System.out.println("L'épée est-elle égale à un objet null ? " + t1.equals(null)); // false
        System.out.println("L'épée est-elle égale à un objet identique ? " + t1.equals(new Things("Épée", 100, 5))); // true



        box.fermé();
        System.out.println("La boite est elle fermer ?" + box.fermé());

        box.ouvert();
        System.out.println("La boite est elle ouvert ?" + box.ouvert());
    }
}
