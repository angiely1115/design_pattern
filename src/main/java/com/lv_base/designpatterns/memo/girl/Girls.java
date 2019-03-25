package com.lv_base.designpatterns.memo.girl;

/**
 * @Author: lvrongzhuan
 * @Description: 妃子们的管理者 备忘录的管理者
 * @Date: 2019/3/25 21:32
 * @Version: 1.0
 * modified by:
 */
public class Girls {

    private BeautifulGirl beautifulGirl;

    /**
     * 保存
     * @param beautifulGirl
     */
    public void saveGirl(BeautifulGirl beautifulGirl) {
        this.beautifulGirl = beautifulGirl;
        System.out.println("保存下皇帝选的妃子:"+beautifulGirl);
    }

    /**
     * 还回存储的漂亮女孩
     * @return
     */
    public BeautifulGirl getGirl() {
        return beautifulGirl;
    }
}
