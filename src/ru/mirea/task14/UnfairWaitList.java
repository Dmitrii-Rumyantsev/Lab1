package ru.mirea.task14;

public class UnfairWaitList<E> extends WaitList<E>{
    UnfairWaitList(){
        super();
    }

    public void remove(E element){
        boolean removed = false;
        for(int i = 0; i < content.size(); i++){
            E el = content.remove();
            if(!removed && el.equals(element)){
                removed = true; // i--
            }else{
                content.add(el);
            }
        }
        if(removed){
            content.add(content.remove());
        }
    }
}
