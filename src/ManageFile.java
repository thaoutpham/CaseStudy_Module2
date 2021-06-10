import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ManageFile {
    private List<Album> arrayNameAlbum;
    public ManageFile(){
        this.arrayNameAlbum=new ArrayList<>();
    }
    public void addFile(Album album,String nameFile) {
      //  if (search(nameFile) == null) {
          //  File file = new File(nameFile);
            arrayNameAlbum.add(album);
       // } else {
           // System.out.println("Tên này đã tồn tại");
       // }
    }
    public void showFile(){
        arrayNameAlbum.forEach(album -> System.out.println(album.toString()));
       // arrayNameAlbum.forEach(System.out::println);
    }

    public void remove(String nameFile){
        for(int i=0;i<arrayNameAlbum.size();i++){
            if(nameFile.equals(arrayNameAlbum.get(i))){
                arrayNameAlbum.remove(i);
                System.out.println("Xóa Thành công");
            }else {
                System.out.println("Xóa thất bài");
            }
        }
    }

    public boolean edit(String nameFileEdit,Album album){
        for(int i=0;i<arrayNameAlbum.size();i++){
            if(nameFileEdit.equals(arrayNameAlbum.get(i))){
                arrayNameAlbum.set(i,album);
                return true;
            }
        }return false;
    }
    public Album search(String nameFile){
        return this.arrayNameAlbum.stream().filter(album ->album.getName().equals(nameFile)).findFirst().orElse(null);
    }
}
