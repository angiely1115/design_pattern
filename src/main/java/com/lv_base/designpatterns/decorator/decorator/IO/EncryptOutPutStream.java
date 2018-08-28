package com.lv_base.designpatterns.decorator.decorator.IO;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author: lvrongzhuan
 * @Description:java IO流设计中使用装饰器模式 所以我们自己在把它增加一个装饰 加密输出
 * @Date: 2018/8/24 17:36
 * @Version: 1.0
 * modified by:
 */
public class EncryptOutPutStream extends FilterOutputStream {
    public EncryptOutPutStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void write(int b) throws IOException {
        b = b+2;
        if (b>=(97+26)){
            b = b-26;
        }
        super.write(b);
    }
}
