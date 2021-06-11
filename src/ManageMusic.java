import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManageMusic implements DanhSach {
       private List<Music> musicList;

    public ManageMusic() {
        this.musicList = new ArrayList<>();
    }


    @Override
    public int size(){
        return musicList.size();
    }
@Override
    public void add(Music music) {
        this.musicList.add(music);
    }
@Override
    public void show() {
        this.musicList.forEach(music -> System.out.println(music.toString()));
        musicList.size();
    }
@Override
    public Music searchId(int id) {
        return this.musicList.stream().filter(music -> music.getId() == id).findFirst().orElse(null);
    }
    @Override
    public Music seaarchName(String name) {
        return this.musicList.stream().filter(music -> music.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public void searchSinger(String singer) {
        for (int i = 0; i < musicList.size(); i++) {
            if (this.musicList.get(i).getSinger() == singer) {
                System.out.println(musicList.get(i));
            }

        }
    }

    @Override
    public void removeId(int id) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getId() == id) {
                musicList.remove(i);
            }
        }
    }

    @Override
    public void removeName(String name) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getName() == name) {
                musicList.remove(i);
            }
        }
    }

    @Override
    public void editId(int id, Music music) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getId() == id) {
                musicList.set(i, music);
            }
        }
    }

    @Override
    public void editName(String name, Music music) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getName() == name) {
                musicList.set(i, music);
            }
        }
    }


}