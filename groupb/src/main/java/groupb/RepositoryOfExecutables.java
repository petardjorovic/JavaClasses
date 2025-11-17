package groupb;

import java.util.LinkedList;
import java.util.List;

public class RepositoryOfExecutables {
    private List<Executable> lista;
    private static RepositoryOfExecutables instance = null;

    private RepositoryOfExecutables(){
        lista = new LinkedList<>();
    }

    public static RepositoryOfExecutables getInstance(){
        if(instance == null){
            instance = new RepositoryOfExecutables();
        }

        return instance;
    }

    public void add(Executable e){
        lista.add(e);
    }

    public int count(){
        return lista.size();
    }

    public void executeNext(){
        if(count() > 0){
            lista.get(0).execute();
            lista.remove(0);
        }
    }
}
