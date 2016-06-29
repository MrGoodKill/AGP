import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListVar extends Node implements Iterable<Var>{

    private Var var;
    private ListVar listVar;

    public ListVar(Var var, ListVar listVar){
        this.var = var;
        this.listVar = listVar;
        children.add(var);
        children.add(listVar);
    }

    public ListVar(Var var){
        this.var = var;
        children.add(var);
    }

    public Var getVar(){return var;};
    public ListVar getNextListVar(){return listVar;};

    private boolean isSingle(){
        return (listVar==null);
    }


    @Override
    public Iterator<Var> iterator() {
        return new VarIterator(this);
    }
    @Override
    public void forEach(Consumer<? super Var> action) {
        for (Var v : this) {
            action.accept(v);
        }
    }
    @Override
    public Spliterator<Var> spliterator() {
        return null;
    }


    private class VarIterator implements Iterator<Var> {

        private ListVar position;

        public VarIterator(ListVar position){
            this.position=new ListVar(null,position);
        }
        public boolean hasNext() {
            return (!position.isSingle());
        }
        public Var next() {
            position = position.getNextListVar();
            return position.getVar();
        }
        public void remove() {
            throw new UnsupportedOperationException("Not supported");
        }
    }
}
