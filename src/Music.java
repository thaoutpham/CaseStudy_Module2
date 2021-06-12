import java.io.Serializable;

public class Music implements Serializable {
    int id;
    String name;
    String singer;

    public Music(){}

    public Music(int id,String name,String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Music{ " +"  Mã số bài hát: "+ id +",       " +"Tên bài hát: "+ name +",       "+"Tên ca sĩ: "+ singer +"}";
    }
}
