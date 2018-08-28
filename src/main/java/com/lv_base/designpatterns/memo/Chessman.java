package com.lv_base.designpatterns.memo;

import lombok.Data;

/**
 * @Author: lvrongzhuan
 * @Description:模拟下象棋悔棋 原生器
 * @Date: 2018/8/23 17:47
 * @Version: 1.0
 * modified by:
 */
@Data
public class Chessman {
    private String label;//棋子标签 需要保存

    private int x;//棋子坐标 需要保存

    private int y;//棋子坐标 需要保存

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public ChessmanMementoLink save(){
        ChessmanMemento chessmanMemento =  new ChessmanMemento(label,x,y);
        ChessmanMementoLink chessmanMementoLink = new ChessmanMementoLink();
        chessmanMementoLink.addNode(chessmanMemento);
        return chessmanMementoLink;
   }

   //悔棋
   public void reset(Memento memento){
        ChessmanMemento chessmanMemento = (ChessmanMemento) memento;
       this.label = chessmanMemento.label;
       this.x = chessmanMemento.x;
       this.y = chessmanMemento.y;

   }
    //备忘录 因为备忘录模式 是不破坏原生器的封装，将内部状态用外部对象保存，而外部对象只能被原生器所访问
    //备忘录的本质 记录和恢复内部状态
    @Data
    private static class ChessmanMemento implements Memento {
        private String label;
        private int x;
        private int y;

        private ChessmanMemento data;
        private ChessmanMemento next;
        private int size;

        public ChessmanMemento(String label, int x, int y) {
            this.label = label;
            this.x = x;
            this.y = y;
        }
    }

    //备忘录链表
    public static class ChessmanMementoLink{
       private ChessmanMemento head;
       public int size;
        public void addNode(ChessmanMemento chessmanMemento){
            if(size==0){
                this.head = chessmanMemento;
            }else{
                chessmanMemento.next = head;
                head = chessmanMemento;
            }
            size++;
        }

        public ChessmanMemento getHead() {
            return head;
        }

        public void setHead(ChessmanMemento head) {
            this.head = head;
        }
    }

}
