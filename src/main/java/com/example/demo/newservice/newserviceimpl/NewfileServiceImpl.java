package.com.example.demo.newserviceimpl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.newentity.NewfileEntity;
import com.example.demo.newservice.NewfileService;

@Override
public class NewfileServiceImpl implements NewfileService{
    private final NewfileRepo rep;
        public NewfileService(NewfileRepo rep){
                this.rep=rep;
          }
   @Override
       public NewfileEntity savedata(NewfileEntity newfile){
             return rep.save(newfile);
         }

    @Override
        public NewfileEntity getidval(long id){
               return rep.findbyId(id)
         }
     @Override
          public List<NewfileEntity>getall(){
               return rep.findALL();
      }
      @Override
      public NewFileEntity update(Long id,NewFileEntity st){
        NewFileEntity exist = repo.findById(id).orElse(null);

        if(exist!=null){
            exist.setName(st.getName());
            exist.setEmail(st.getEmail());
            return repo.save(exist);
        }
        return null;
    }
     @Override
      public void delete(long id){
          rep.deletebyId(id);
      }
}
                                            