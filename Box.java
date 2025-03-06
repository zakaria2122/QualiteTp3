import java.util.ArrayList;

public class Box {
    private boolean ouvert;
    private boolean fermé;
    
    public Box(boolean ouvert) {
        this.ouvert = ouvert;
     
    }

    // Méthode pour ouvrir la boîte
    public void ouvrir() {
        this.ouvert = true;
    }

    // Méthode pour fermer la boîte
    public void fermer() {
        this.ouvert = false;
    }



    ArrayList<Things> contents = new ArrayList<Things>();

    public void add(Things truc) {
        this.contents.add(truc);
    }

    public boolean contains(Things o) {
        for (int i = 0; i < this.contents.size(); i++) {
            Things current = this.contents.get(i);
            if (current == null && o == null) {
                return true;
            }
            if (current != null && current.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Things o) {
        for (int i = 0; i < this.contents.size(); i++) {
            Things current = this.contents.get(i);
            if (current == null && o == null) {
                this.contents.remove(i);
                return;
            }
            if (current != null && current.equals(o)) {
                this.contents.remove(i);
                return;
            }
        }
    }
    public void clear() {
        this.contents.clear();
    }
    public int size() {
        return this.contents.size();
    }
    public boolean isEmpty() {
        return this.contents.isEmpty();
    }
    public Things get(int index) {
        return this.contents.get(index);
    }

    public boolean ouvert(){
        return this.ouvert;
    }
    public boolean fermé(){
        return this.fermé;
    }

}