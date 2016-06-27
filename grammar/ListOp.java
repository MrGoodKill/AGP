import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListOp extends Node implements Iterable<Op>{

    private Op op;
    private ListOp listOp;

    public ListOp(Op op, ListOp listOp){
        this.op = op;
        this.listOp = listOp;
    }

    public ListOp(Op op){
        this.op = op;
    }

    public Op getOp(){return op;};
    public ListOp getNextListOp(){return listOp;};

    private boolean isSingle(){
        return (listOp==null);
    }


    @Override
    public Iterator<Op> iterator() {
        return new OpIterator(this);
    }
    @Override
    public void forEach(Consumer<? super Op> action) {
        for (Op op : this) {
            action.accept(op);
        }
    }
    @Override
    public Spliterator<Op> spliterator() {
        return null;
    }


    private class OpIterator implements Iterator<Op> {

        private ListOp position;

        public OpIterator(ListOp position){
            this.position=new ListOp(null,position);
        }
        public boolean hasNext() {
            return (!position.isSingle());
        }
        public Op next() {
            position = position.getNextListOp();
            return position.getOp();
        }
        public void remove() {
            throw new UnsupportedOperationException("Not supported");
        }
    }
}
