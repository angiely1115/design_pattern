package com.lv_base.designpatterns.memo;

/**
 * @Author: lvrongzhuan
 * @Description:备忘录管理者
 * @Date: 2018/8/23 17:59
 * @Version: 1.0
 * modified by:
 */
public class MementoCaretaker {
    private Chessman.ChessmanMementoLink menoto;
    public void saveMemento(Chessman.ChessmanMementoLink menoto){
        this.menoto = menoto;
    }
    public Memento getMenoto(){
        if(this.menoto.size==0){
            return null;
        }
        Memento memento = this.menoto.getHead();
        return memento;
    }

    public Chessman.ChessmanMementoLink getChessmanMementoLink(){
        return this.menoto;
    }


}
