public class Things {
    private String name;
    private int value;
    private int weight;
 

    public Things(String name, int value, int weight) {
        this.name = name;
        this.value = value;
        this.weight = weight;
        
    }

    public int getValue() {
        return this.value;
    }
    public int getWeight() {
        return this.weight;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (obj == null) {return false;}
        if (!(obj instanceof Things)) {return false;}
        Things other = (Things) obj;
        return other.name.equals(this.name);
    }}
