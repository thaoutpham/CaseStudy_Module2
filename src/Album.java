import java.io.Serializable;

public class Album  {
    String name;

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNameAlbum(String nameAlbum) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nameAlbum='" + name + '\'' +
                '}';
    }
}
