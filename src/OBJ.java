public class OBJ implements Comparable<OBJ>{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(OBJ o) {

        if(getId() > o.getId())
            return 1;
        else if(getId() < o.getId())
            return -1;
        else
            return 0;
    }
}
