import java.util.List;

public interface DanhSach {
    int size();
    void add(Music music);
    void show();
    Music searchId(int id);
    Music seaarchName(String name);
    void searchSinger(String singer);
    void removeId(int id);
    void removeName(String name);
    void editId(int id, Music music);
    void editName(String name, Music music);
    void writeToFile();
    void readToFile();
}
